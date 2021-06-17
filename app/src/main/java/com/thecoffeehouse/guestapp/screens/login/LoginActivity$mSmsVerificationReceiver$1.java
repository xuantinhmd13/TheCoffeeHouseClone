package com.thecoffeehouse.guestapp.screens.login;

import android.content.ActivityNotFoundException;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.common.api.Status;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/LoginActivity$mSmsVerificationReceiver$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$mSmsVerificationReceiver$1 extends BroadcastReceiver {
    final /* synthetic */ LoginActivity this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LoginActivity$mSmsVerificationReceiver$1(LoginActivity loginActivity) {
        this.this$0 = loginActivity;
    }

    public void onReceive(Context context, Intent intent) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(intent, "intent");
        if (Intrinsics.areEqual(SmsRetriever.SMS_RETRIEVED_ACTION, intent.getAction())) {
            Bundle extras = intent.getExtras();
            Object obj = extras != null ? extras.get("com.google.android.gms.auth.api.phone.EXTRA_STATUS") : null;
            Objects.requireNonNull(obj, "null cannot be cast to non-null type com.google.android.gms.common.api.Status");
            if (((Status) obj).getStatusCode() == 0) {
                Intent intent2 = (Intent) extras.getParcelable(SmsRetriever.EXTRA_CONSENT_INTENT);
                try {
                    LoginActivity loginActivity = this.this$0;
                    loginActivity.startActivityForResult(intent2, loginActivity.SMS_CONSENT_REQUEST);
                } catch (ActivityNotFoundException e) {
                    e.printStackTrace();
                    GeneralKt.log(Unit.INSTANCE);
                }
            }
        }
    }
}
