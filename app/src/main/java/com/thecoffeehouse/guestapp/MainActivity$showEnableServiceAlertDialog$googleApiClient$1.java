package com.thecoffeehouse.guestapp;

import android.os.Bundle;
import com.google.android.gms.common.api.GoogleApiClient;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$showEnableServiceAlertDialog$googleApiClient$1", "Lcom/google/android/gms/common/api/GoogleApiClient$ConnectionCallbacks;", "onConnected", "", "p0", "Landroid/os/Bundle;", "onConnectionSuspended", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$showEnableServiceAlertDialog$googleApiClient$1 implements GoogleApiClient.ConnectionCallbacks {
    MainActivity$showEnableServiceAlertDialog$googleApiClient$1() {
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnected(Bundle bundle) {
        GeneralKt.log(bundle);
    }

    @Override // com.google.android.gms.common.api.internal.ConnectionCallbacks
    public void onConnectionSuspended(int i) {
        GeneralKt.log("error: " + i);
    }
}
