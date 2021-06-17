package com.thecoffeehouse.guestapp.screens.login;

import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
final /* synthetic */ class LoginActivity$handleSignInResult$2 extends MutablePropertyReference0Impl {
    LoginActivity$handleSignInResult$2(LoginActivity loginActivity) {
        super(loginActivity, LoginActivity.class, "mGoogleSignInClient", "getMGoogleSignInClient()Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", 0);
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return LoginActivity.access$getMGoogleSignInClient$p((LoginActivity) this.receiver);
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((LoginActivity) this.receiver).mGoogleSignInClient = (GoogleSignInClient) obj;
    }
}
