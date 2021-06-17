package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.location.Location;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "lastLocation", "Landroid/location/Location;", "kotlin.jvm.PlatformType", "onSuccess"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$mapViewListeners$1<TResult> implements OnSuccessListener<Location> {
    final /* synthetic */ PickLocationDialog this$0;

    PickLocationDialog$mapViewListeners$1(PickLocationDialog pickLocationDialog) {
        this.this$0 = pickLocationDialog;
    }

    public final void onSuccess(Location location) {
        Location myLocation;
        if (location != null) {
            PickLocationDialog.access$setMMyLocation$p(this.this$0, new LatLng(location.getLatitude(), location.getLongitude()));
            return;
        }
        try {
            GoogleMap access$getMGoogleMap$p = PickLocationDialog.access$getMGoogleMap$p(this.this$0);
            if (access$getMGoogleMap$p != null && (myLocation = access$getMGoogleMap$p.getMyLocation()) != null) {
                PickLocationDialog.access$setMMyLocation$p(this.this$0, new LatLng(myLocation.getLatitude(), myLocation.getLongitude()));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
