package com.thecoffeehouse.guestapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationPayload;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$registerNotificationBroadcast$2", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intentNotification", "Landroid/content/Intent;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$registerNotificationBroadcast$2 extends BroadcastReceiver {
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MainActivity$registerNotificationBroadcast$2(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public void onReceive(Context context, Intent intent) {
        if (intent != null && intent.hasExtra(MainActivity.SILENT_NOTIFICATION)) {
            NotificationPayload notificationPayload = (NotificationPayload) intent.getParcelableExtra(MainActivity.SILENT_NOTIFICATION);
            String deeplink = notificationPayload != null ? notificationPayload.getDeeplink() : null;
            if (deeplink != null) {
                this.this$0.handleSilentPush(deeplink);
            }
        }
    }
}
