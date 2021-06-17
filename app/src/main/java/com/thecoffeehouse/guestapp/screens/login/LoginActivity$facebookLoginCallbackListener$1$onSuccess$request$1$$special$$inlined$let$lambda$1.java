package com.thecoffeehouse.guestapp.screens.login;

import com.facebook.GraphResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "invoke", "com/thecoffeehouse/guestapp/screens/login/LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
final class LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1$$special$$inlined$let$lambda$1 extends Lambda implements Function1<AuthResponse, Unit> {
    final /* synthetic */ GraphResponse $response$inlined;
    final /* synthetic */ LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1$$special$$inlined$let$lambda$1(LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1 loginActivity$facebookLoginCallbackListener$1$onSuccess$request$1, GraphResponse graphResponse) {
        super(1);
        this.this$0 = loginActivity$facebookLoginCallbackListener$1$onSuccess$request$1;
        this.$response$inlined = graphResponse;
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
        this.this$0.this$0.this$0.mLoginWithPhone = false;
        this.this$0.this$0.this$0.checkProfileStatus(authResponse);
    }
}
