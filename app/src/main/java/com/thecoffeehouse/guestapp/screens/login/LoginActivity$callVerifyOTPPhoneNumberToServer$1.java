package com.thecoffeehouse.guestapp.screens.login;

import com.thecoffeehouse.guestapp.screens.login.phonenumber.ConfirmationOTPDialog;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$callVerifyOTPPhoneNumberToServer$1 extends Lambda implements Function1<AuthResponse, Unit> {
    final /* synthetic */ Function1 $onCompleted;
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$callVerifyOTPPhoneNumberToServer$1(LoginActivity loginActivity, Function1 function1) {
        super(1);
        this.this$0 = loginActivity;
        this.$onCompleted = function1;
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
        ConfirmationOTPDialog confirmationOTPDialog = this.this$0.mConfirmationOTPDialog;
        if (confirmationOTPDialog != null) {
            confirmationOTPDialog.dismiss();
        }
        this.$onCompleted.invoke(authResponse);
    }
}
