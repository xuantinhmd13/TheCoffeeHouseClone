package com.thecoffeehouse.guestapp.configs;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.net.Uri;
import androidx.constraintlayout.solver.widgets.analyzer.BasicMeasure;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationPayload;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Popup;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001c\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u001c\u0010\u0011\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/configs/FCMNotification;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "notificationBuild", "Landroidx/core/app/NotificationCompat$Builder;", "intent", "Landroid/content/Intent;", "notification", "Lcom/google/firebase/messaging/RemoteMessage$Notification;", "notify", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "p0", "", "sendNotification", "data", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/NotificationPayload;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: FCMNotification.kt */
public final class FCMNotification extends FirebaseMessagingService {
    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String str) {
        Intrinsics.checkNotNullParameter(str, "p0");
        super.onNewToken(str);
        GeneralKt.log(str);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        super.onMessageReceived(remoteMessage);
        NotificationPayload notificationPayload = new NotificationPayload(null, null, null, null, null, 31, null);
        try {
            JSONObject jSONObject = new JSONObject(new Gson().toJson(remoteMessage.getData()));
            notificationPayload.setTitle(jSONObject.getString("title"));
            notificationPayload.setDeeplink(jSONObject.getString("deeplink"));
            notificationPayload.setDescription(jSONObject.getString("description"));
            notificationPayload.setId(jSONObject.getString("id"));
            String string = jSONObject.getString("popup");
            Intrinsics.checkNotNullExpressionValue(string, "popupString");
            if (string.length() > 0) {
                notificationPayload.setPopup((Popup) new Gson().fromJson(remoteMessage.getData().get("popup"), Popup.class));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } catch (Throwable th) {
            sendNotification(remoteMessage.getNotification(), notificationPayload);
            throw th;
        }
        sendNotification(remoteMessage.getNotification(), notificationPayload);
    }

    private final void sendNotification(RemoteMessage.Notification notification, NotificationPayload notificationPayload) {
        String str = null;
        String title = notificationPayload != null ? notificationPayload.getTitle() : null;
        boolean z = false;
        if (!(title == null || title.length() == 0)) {
            if (notificationPayload != null) {
                str = notificationPayload.getDescription();
            }
            String str2 = str;
            if (str2 == null || str2.length() == 0) {
                z = true;
            }
            if (!z) {
                Intent intent = new Intent(MainActivity.ACTION_NOTIFICATION);
                intent.setAction(MainActivity.ACTION_NOTIFICATION);
                intent.putExtra(MainActivity.INTENT_NOTIFICATION, notificationPayload);
                notify(intent, notification);
                return;
            }
        }
        Intent intent2 = new Intent(MainActivity.SILENT_NOTIFICATION);
        intent2.setAction(MainActivity.SILENT_NOTIFICATION);
        intent2.putExtra(MainActivity.SILENT_NOTIFICATION, notificationPayload);
        sendBroadcast(intent2);
    }

    private final void notify(Intent intent, RemoteMessage.Notification notification) {
        NotificationCompat.Builder notificationBuild = notificationBuild(intent, notification);
        Object systemService = getSystemService("notification");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        Notification build = notificationBuild.build();
        build.flags = 16;
        ((NotificationManager) systemService).notify((int) System.currentTimeMillis(), build);
    }

    private final NotificationCompat.Builder notificationBuild(Intent intent, RemoteMessage.Notification notification) {
        FCMNotification fCMNotification = this;
        PendingIntent broadcast = PendingIntent.getBroadcast(fCMNotification, 0, intent, BasicMeasure.EXACTLY);
        Intrinsics.checkNotNullExpressionValue(broadcast, "PendingIntent.getBroadca…dingIntent.FLAG_ONE_SHOT)");
        String str = null;
        NotificationCompat.Builder contentIntent = new NotificationCompat.Builder(fCMNotification, getString(R.string.default_notification_channel_id_in_app)).setSmallIcon(R.drawable.ic_logo_vertical).setColor(ContextCompat.getColor(fCMNotification, R.color.colorPrimary)).setContentTitle(notification != null ? notification.getTitle() : null).setLargeIcon(BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher_round)).setContentText(notification != null ? notification.getBody() : null).setSound(Uri.EMPTY).setContentIntent(broadcast);
        if (notification != null) {
            str = notification.getTitle();
        }
        NotificationCompat.Builder lights = contentIntent.setContentInfo(str).setPriority(1).setLights(ContextCompat.getColor(fCMNotification, R.color.colorPrimary), 1000, 300);
        Intrinsics.checkNotNullExpressionValue(lights, "NotificationCompat.Build…colorPrimary), 1000, 300)");
        return lights;
    }
}
