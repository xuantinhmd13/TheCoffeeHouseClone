package com.thecoffeehouse.guestapp.screens.login;

import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "phoneNumber", "", "regionCode", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$checkProfileStatus$verifyPhoneDialog$2 extends Lambda implements Function2<String, String, Unit> {
    final /* synthetic */ AuthResponse $resource;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$checkProfileStatus$verifyPhoneDialog$2(LoginActivity loginActivity, AuthResponse authResponse) {
        super(2);
        this.this$0 = loginActivity;
        this.$resource = authResponse;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke(str, str2);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "regionCode");
        this.this$0.mPhoneNumber = str;
        LoginActivity loginActivity = this.this$0;
        loginActivity.callRequestOTPToServer(loginActivity.mPhoneNumber, str2, this.$resource.getToken(), this.this$0.mLoginWithPhone, new Function1<AuthResponse, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.login.LoginActivity$checkProfileStatus$verifyPhoneDialog$2.AnonymousClass1 */
            final /* synthetic */ LoginActivity$checkProfileStatus$verifyPhoneDialog$2 this$0;

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
                Intrinsics.checkNotNullParameter(authResponse, "resource");
                this.this$0.this$0.checkProfileStatus(authResponse);
            }
        });
    }
}
