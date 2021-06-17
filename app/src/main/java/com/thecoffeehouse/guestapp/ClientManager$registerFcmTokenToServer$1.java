package com.thecoffeehouse.guestapp;

import android.provider.Settings;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.RegisterFcmTokenRequest;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 0})
/* compiled from: ClientManager.kt */
public final class ClientManager$registerFcmTokenToServer$1<TResult> implements OnCompleteListener<InstanceIdResult> {
    final /* synthetic */ String $userToken;
    final /* synthetic */ ClientManager this$0;

    ClientManager$registerFcmTokenToServer$1(ClientManager clientManager, String str) {
        this.this$0 = clientManager;
        this.$userToken = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<InstanceIdResult> task) {
        Intrinsics.checkNotNullParameter(task, "task");
        GeneralKt.log("task.isSuccessful: " + task.isSuccessful());
        if (task.isSuccessful()) {
            InstanceIdResult result = task.getResult();
            String token = result != null ? result.getToken() : null;
            GeneralKt.log("token: " + token);
            if (token != null) {
                String string = Settings.Secure.getString(this.this$0.application.getContentResolver(), "android_id");
                Intrinsics.checkNotNullExpressionValue(string, "androidHardwareId");
                this.this$0.application.requireCommonServiceManager().getCommonApiService().getNotificationService().registerFcmToken(this.$userToken, new RegisterFcmTokenRequest(token, null, string, null, null, null, 58, null)).enqueue(new ClientManager$registerFcmTokenToServer$1$1$1());
            }
        }
    }
}
