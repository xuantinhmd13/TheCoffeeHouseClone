package com.thecoffeehouse.guestapp.screens.login;

import android.os.Bundle;
import com.facebook.FacebookCallback;
import com.facebook.FacebookException;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.login.LoginResult;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\u0012\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\b\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\n"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/LoginActivity$facebookLoginCallbackListener$1", "Lcom/facebook/FacebookCallback;", "Lcom/facebook/login/LoginResult;", "onCancel", "", "onError", "error", "Lcom/facebook/FacebookException;", "onSuccess", "result", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$facebookLoginCallbackListener$1 implements FacebookCallback<LoginResult> {
    final /* synthetic */ LoginActivity this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LoginActivity$facebookLoginCallbackListener$1(LoginActivity loginActivity) {
        this.this$0 = loginActivity;
    }

    public void onSuccess(LoginResult loginResult) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id, name, first_name, last_name, email, gender, birthday");
        new GraphRequest(loginResult != null ? loginResult.getAccessToken() : null, "me", bundle, HttpMethod.POST, new LoginActivity$facebookLoginCallbackListener$1$onSuccess$request$1(this, loginResult)).executeAsync();
    }

    @Override // com.facebook.FacebookCallback
    public void onCancel() {
        GeneralKt.log("facebook login cancel");
    }

    @Override // com.facebook.FacebookCallback
    public void onError(FacebookException facebookException) {
        GeneralKt.log("facebook login error: " + String.valueOf(facebookException));
    }
}
