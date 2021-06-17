package com.thecoffeehouse.guestapp.screens.login;

import com.facebook.AccessToken;
import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginResult;
import com.thecoffeehouse.guestapp.screens.login.LoginActivity;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "response", "Lcom/facebook/GraphResponse;", "kotlin.jvm.PlatformType", "onCompleted"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1 implements GraphRequest.Callback {
    final /* synthetic */ LoginResult $result;
    final /* synthetic */ LoginActivity$facebookLoginCallbackListener$1 this$0;

    LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1(LoginActivity$facebookLoginCallbackListener$1 loginActivity$facebookLoginCallbackListener$1, LoginResult loginResult) {
        this.this$0 = loginActivity$facebookLoginCallbackListener$1;
        this.$result = loginResult;
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        AccessToken accessToken;
        Intrinsics.checkNotNullExpressionValue(graphResponse, "response");
        if (graphResponse.getRawResponse() != null) {
            LoginResult loginResult = this.$result;
            if (((loginResult == null || (accessToken = loginResult.getAccessToken()) == null) ? null : accessToken.getToken()) != null) {
                String rawResponse = graphResponse.getRawResponse();
                Intrinsics.checkNotNullExpressionValue(rawResponse, "response.rawResponse");
                if (rawResponse.length() > 0) {
                    LoginViewModel access$getViewModel$p = LoginActivity.access$getViewModel$p(this.this$0.this$0);
                    AccessToken accessToken2 = this.$result.getAccessToken();
                    Intrinsics.checkNotNullExpressionValue(accessToken2, "result.accessToken");
                    String token = accessToken2.getToken();
                    Intrinsics.checkNotNullExpressionValue(token, "result.accessToken.token");
                    String rawResponse2 = graphResponse.getRawResponse();
                    Intrinsics.checkNotNullExpressionValue(rawResponse2, "response.rawResponse");
                    access$getViewModel$p.callSignUpWithFacebookAPI(token, rawResponse2).observe(this.this$0.this$0, new LoginActivity.ObserverBaseResource(this.this$0.this$0, new LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1$$special$$inlined$let$lambda$1(this, graphResponse), null, 2, null));
                    return;
                }
            }
            GeneralKt.log("access token is null");
        }
    }
}
