package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "marker", "Lcom/google/android/gms/maps/model/Marker;", "kotlin.jvm.PlatformType", "onInfoWindowClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
public final class PickStoreDialogFragment$selectedMarkerCluster$1 implements GoogleMap.OnInfoWindowClickListener {
    final /* synthetic */ PickStoreDialogFragment this$0;

    PickStoreDialogFragment$selectedMarkerCluster$1(PickStoreDialogFragment pickStoreDialogFragment) {
        this.this$0 = pickStoreDialogFragment;
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public final void onInfoWindowClick(Marker marker) {
        Intrinsics.checkNotNullExpressionValue(marker, "marker");
        new InfoWindowClickAsyncTask(marker, new PickStoreDialogFragment$selectedMarkerCluster$1$selectClusterOnInfoWindowClick$1(this, marker)).execute(new Void[0]);
    }
}
