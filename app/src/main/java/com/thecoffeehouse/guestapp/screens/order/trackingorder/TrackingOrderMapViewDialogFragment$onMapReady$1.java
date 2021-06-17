package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import com.google.android.gms.maps.GoogleMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onMapLoaded"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderMapViewDialogFragment.kt */
final class TrackingOrderMapViewDialogFragment$onMapReady$1 implements GoogleMap.OnMapLoadedCallback {
    final /* synthetic */ TrackingOrderMapViewDialogFragment this$0;

    TrackingOrderMapViewDialogFragment$onMapReady$1(TrackingOrderMapViewDialogFragment trackingOrderMapViewDialogFragment) {
        this.this$0 = trackingOrderMapViewDialogFragment;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public final void onMapLoaded() {
        this.this$0.zoomMapToAddressLocation();
        this.this$0.relocateGoogleMapWatermark();
    }
}
