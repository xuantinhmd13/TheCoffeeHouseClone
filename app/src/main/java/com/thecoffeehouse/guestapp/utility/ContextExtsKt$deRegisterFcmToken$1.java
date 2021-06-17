package com.thecoffeehouse.guestapp.utility;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.iid.InstanceIdResult;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.RegisterFcmTokenRequest;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 0})
/* compiled from: ContextExts.kt */
public final class ContextExtsKt$deRegisterFcmToken$1<TResult> implements OnCompleteListener<InstanceIdResult> {
    final /* synthetic */ TCHApplication $application;
    final /* synthetic */ Function0 $onCompleted;

    ContextExtsKt$deRegisterFcmToken$1(TCHApplication tCHApplication, Function0 function0) {
        this.$application = tCHApplication;
        this.$onCompleted = function0;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<InstanceIdResult> task) {
        Profile userProfile;
        String token;
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.isSuccessful()) {
            InstanceIdResult result = task.getResult();
            String token2 = result != null ? result.getToken() : null;
            if (token2 != null && (userProfile = this.$application.requireClientManager().getUserProfile()) != null && (token = userProfile.getToken()) != null) {
                this.$application.requireCommonServiceManager().getCommonApiService().getNotificationService().deRegisterFcmToken("Bearer " + token, new RegisterFcmTokenRequest(token2, null, null, null, null, null, 62, null)).enqueue(new ContextExtsKt$deRegisterFcmToken$1$$special$$inlined$let$lambda$1(this, token2));
            }
        }
    }
}
