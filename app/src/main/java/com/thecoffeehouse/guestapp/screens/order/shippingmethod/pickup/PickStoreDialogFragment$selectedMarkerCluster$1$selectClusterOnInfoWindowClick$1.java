package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.Algorithm;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarker;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/google/android/gms/maps/model/Marker;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
final class PickStoreDialogFragment$selectedMarkerCluster$1$selectClusterOnInfoWindowClick$1 extends Lambda implements Function1<Marker, Unit> {
    final /* synthetic */ Marker $marker;
    final /* synthetic */ PickStoreDialogFragment$selectedMarkerCluster$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickStoreDialogFragment$selectedMarkerCluster$1$selectClusterOnInfoWindowClick$1(PickStoreDialogFragment$selectedMarkerCluster$1 pickStoreDialogFragment$selectedMarkerCluster$1, Marker marker) {
        super(1);
        this.this$0 = pickStoreDialogFragment$selectedMarkerCluster$1;
        this.$marker = marker;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
        invoke(marker);
        return Unit.INSTANCE;
    }

    public final void invoke(Marker marker) {
        Store store;
        Algorithm<ClusterMarker> algorithm;
        Collection<ClusterMarker> items;
        Intrinsics.checkNotNullParameter(marker, "it");
        ClusterManager<ClusterMarker> mClusterManager = this.this$0.this$0.getMapViewInteractions().getMClusterManager();
        ClusterMarker clusterMarker = null;
        if (!(mClusterManager == null || (algorithm = mClusterManager.getAlgorithm()) == null || (items = algorithm.getItems()) == null)) {
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                T t = next;
                Intrinsics.checkNotNullExpressionValue(t, "it");
                LatLng position = t.getPosition();
                Marker marker2 = this.$marker;
                if (Intrinsics.areEqual(position, marker2 != null ? marker2.getPosition() : null)) {
                    clusterMarker = next;
                    break;
                }
            }
            clusterMarker = clusterMarker;
        }
        if (clusterMarker != null && (store = clusterMarker.getStore()) != null) {
            this.this$0.this$0.onPickStoreDone.invoke(store);
            TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name, new TrackingData("entryPoints", ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value.Map));
            TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name);
            this.this$0.this$0.dismiss();
        }
    }
}
