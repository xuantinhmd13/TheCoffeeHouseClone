package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onCameraIdle"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapPickLocationFragment.kt */
final class MapPickLocationFragment$mapViewListeners$3 implements GoogleMap.OnCameraIdleListener {
    final /* synthetic */ MapPickLocationFragment this$0;

    MapPickLocationFragment$mapViewListeners$3(MapPickLocationFragment mapPickLocationFragment) {
        this.this$0 = mapPickLocationFragment;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public final void onCameraIdle() {
        CameraPosition cameraPosition;
        LatLng latLng;
        FrameLayout frameLayout;
        GoogleMap access$getMGoogleMap$p = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0);
        if (access$getMGoogleMap$p != null && (cameraPosition = access$getMGoogleMap$p.getCameraPosition()) != null && (latLng = cameraPosition.target) != null) {
            MapPickLocationFragment.access$getOnSelectOnLatLng$p(this.this$0).invoke(latLng);
            this.this$0.showLoading();
            ViewGroup access$getRootView$p = MapPickLocationFragment.access$getRootView$p(this.this$0);
            if (access$getRootView$p != null && (frameLayout = (FrameLayout) access$getRootView$p.findViewById(R.id.layout_bottom_suggest_addresses)) != null) {
                MapPickLocationFragment.access$slideDown(this.this$0, frameLayout);
            }
        }
    }
}
