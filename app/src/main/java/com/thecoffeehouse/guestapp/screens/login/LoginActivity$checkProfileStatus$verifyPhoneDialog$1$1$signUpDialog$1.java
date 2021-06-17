package com.thecoffeehouse.guestapp.screens.login;

import com.thecoffeehouse.guestapp.screens.login.LoginActivity;
import com.thecoffeehouse.guestapp.screens.login.LoginActivity$checkProfileStatus$verifyPhoneDialog$1;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.SignUpDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "signUpDialog", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment;", "firstName", "", "lastName", "birthDay", "gender", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$checkProfileStatus$verifyPhoneDialog$1$1$signUpDialog$1 extends Lambda implements Function5<SignUpDialogFragment, String, String, String, Integer, Unit> {
    final /* synthetic */ AuthResponse $otpResources;
    final /* synthetic */ LoginActivity$checkProfileStatus$verifyPhoneDialog$1.AnonymousClass1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$checkProfileStatus$verifyPhoneDialog$1$1$signUpDialog$1(LoginActivity$checkProfileStatus$verifyPhoneDialog$1.AnonymousClass1 r1, AuthResponse authResponse) {
        super(5);
        this.this$0 = r1;
        this.$otpResources = authResponse;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(SignUpDialogFragment signUpDialogFragment, String str, String str2, String str3, Integer num) {
        invoke(signUpDialogFragment, str, str2, str3, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(SignUpDialogFragment signUpDialogFragment, String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(signUpDialogFragment, "signUpDialog");
        Intrinsics.checkNotNullParameter(str, "firstName");
        Intrinsics.checkNotNullParameter(str2, "lastName");
        Intrinsics.checkNotNullParameter(str3, "birthDay");
        LoginActivity.access$getViewModel$p(this.this$0.this$0.this$0).callSignUpToServer(this.$otpResources.getToken(), this.this$0.this$0.this$0.mPhoneNumber, this.this$0.this$0.this$0.mOTP, str, str2, str3, i).observe(this.this$0.this$0.this$0, new LoginActivity.ObserverBaseResource(this.this$0.this$0.this$0, new Function1<AuthResponse, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$checkProfileStatus$verifyPhoneDialog$1$1$signUpDialog$1.AnonymousClass1 */
            final /* synthetic */ LoginActivity$checkProfileStatus$verifyPhoneDialog$1$1$signUpDialog$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AuthResponse authResponse) {
                invoke(authResponse);
                return Unit.INSTANCE;
            }

            public final void invoke(AuthResponse authResponse) {
                Intrinsics.checkNotNullParameter(authResponse, "it");
                this.this$0.this$0.this$0.this$0.checkProfileStatus(authResponse);
            }
        }, null, 2, null));
    }
}
