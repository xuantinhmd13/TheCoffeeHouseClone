package com.thecoffeehouse.guestapp.screens.stores.interaction;

import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarker;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a&\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004 \u0005*\u0012\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", "cluster", "Lcom/google/maps/android/clustering/Cluster;", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "kotlin.jvm.PlatformType", "onClusterClick", "com/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction$setupClusters$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapViewInteraction.kt */
public final class MapViewInteraction$setupClusters$$inlined$let$lambda$1<T extends ClusterItem> implements ClusterManager.OnClusterClickListener<ClusterMarker> {
    final /* synthetic */ MapViewInteraction this$0;

    MapViewInteraction$setupClusters$$inlined$let$lambda$1(MapViewInteraction mapViewInteraction) {
        this.this$0 = mapViewInteraction;
    }

    @Override // com.google.maps.android.clustering.ClusterManager.OnClusterClickListener
    public final boolean onClusterClick(Cluster<ClusterMarker> cluster) {
        this.this$0.zoomToMarkerInThisCluster(cluster);
        return true;
    }
}
