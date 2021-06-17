package com.thecoffeehouse.guestapp.screens.login;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.GoogleApiClient;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/common/ConnectionResult;", "onConnectionFailed"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$requestHint$apiClient$1 implements GoogleApiClient.OnConnectionFailedListener {
    public static final LoginActivity$requestHint$apiClient$1 INSTANCE = new LoginActivity$requestHint$apiClient$1();

    LoginActivity$requestHint$apiClient$1() {
    }

    @Override // com.google.android.gms.common.api.internal.OnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        Intrinsics.checkNotNullParameter(connectionResult, "it");
        GeneralKt.log("connection failed: ");
    }
}
