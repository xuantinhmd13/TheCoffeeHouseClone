package com.thecoffeehouse.guestapp.screens.stores.interaction;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLngBounds;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "onMapLoaded", "com/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction$zoomFromUserLocation$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapViewInteraction.kt */
public final class MapViewInteraction$zoomFromUserLocation$$inlined$let$lambda$1 implements GoogleMap.OnMapLoadedCallback {
    final /* synthetic */ boolean $isAnimated$inlined;
    final /* synthetic */ GoogleMap $it;
    final /* synthetic */ LatLngBounds $latLongBounds;
    final /* synthetic */ double $radiusDefault$inlined;
    final /* synthetic */ MapViewInteraction this$0;

    MapViewInteraction$zoomFromUserLocation$$inlined$let$lambda$1(GoogleMap googleMap, LatLngBounds latLngBounds, MapViewInteraction mapViewInteraction, double d, boolean z) {
        this.$it = googleMap;
        this.$latLongBounds = latLngBounds;
        this.this$0 = mapViewInteraction;
        this.$radiusDefault$inlined = d;
        this.$isAnimated$inlined = z;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
    public final void onMapLoaded() {
        GeneralKt.log("onMapLoaded");
        if (this.$isAnimated$inlined) {
            this.$it.animateCamera(CameraUpdateFactory.newLatLngBounds(this.$latLongBounds, MapViewInteraction.mDefaultOffsetInMeters));
        } else {
            this.$it.moveCamera(CameraUpdateFactory.newLatLngBounds(this.$latLongBounds, MapViewInteraction.mDefaultOffsetInMeters));
        }
    }
}
