package com.thecoffeehouse.guestapp;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$initDummyMapView$1$callBackLocation$1", "Lcom/google/android/gms/location/LocationCallback;", "onLocationResult", "", "p0", "Lcom/google/android/gms/location/LocationResult;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$initDummyMapView$1$callBackLocation$1 extends LocationCallback {
    final /* synthetic */ MainActivity$initDummyMapView$1 this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MainActivity$initDummyMapView$1$callBackLocation$1(MainActivity$initDummyMapView$1 mainActivity$initDummyMapView$1) {
        this.this$0 = mainActivity$initDummyMapView$1;
    }

    @Override // com.google.android.gms.location.LocationCallback
    public void onLocationResult(LocationResult locationResult) {
        super.onLocationResult(locationResult);
        if (locationResult != null && locationResult.getLastLocation() != null) {
            GeneralKt.log("p0.lastLocation: " + locationResult.getLastLocation());
            this.this$0.$fusedLocationClient.removeLocationUpdates(this);
            MainActivity mainActivity = this.this$0.this$0;
            Location lastLocation = locationResult.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation, "p0.lastLocation");
            double latitude = lastLocation.getLatitude();
            Location lastLocation2 = locationResult.getLastLocation();
            Intrinsics.checkNotNullExpressionValue(lastLocation2, "p0.lastLocation");
            mainActivity.getAddressSuggestion(new LatLng(latitude, lastLocation2.getLongitude()), new MainActivity$initDummyMapView$1$callBackLocation$1$onLocationResult$1(this));
        }
    }
}
