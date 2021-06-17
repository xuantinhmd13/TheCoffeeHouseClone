package com.thecoffeehouse.guestapp.screens.login;

import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.TLButton;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$callRequestOTPToServer$2 extends Lambda implements Function1<ServerErrorResponse, Unit> {
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$callRequestOTPToServer$2(LoginActivity loginActivity) {
        super(1);
        this.this$0 = loginActivity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServerErrorResponse serverErrorResponse) {
        invoke(serverErrorResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(ServerErrorResponse serverErrorResponse) {
        Intrinsics.checkNotNullParameter(serverErrorResponse, "it");
        ServerError error = serverErrorResponse.getError();
        String errorCode = error != null ? error.getErrorCode() : null;
        if (errorCode != null) {
            int hashCode = errorCode.hashCode();
            if (hashCode != -1815341553) {
                if (hashCode != -1195183780) {
                    if (hashCode == -1102525369) {
                        errorCode.equals("sms_on_time");
                    }
                } else if (errorCode.equals("error_client_token")) {
                    GeneralKt.log("request otp failed");
                }
            } else if (errorCode.equals("error_client_token_2")) {
                GeneralKt.log("request otp 2 failed");
            }
        }
        TLButton tLButton = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_verify_phone_number");
        tLButton.setEnabled(true);
    }
}
