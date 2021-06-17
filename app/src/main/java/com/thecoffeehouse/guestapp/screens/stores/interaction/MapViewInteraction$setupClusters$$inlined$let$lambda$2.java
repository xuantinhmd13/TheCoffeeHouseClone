package com.thecoffeehouse.guestapp.screens.stores.interaction;

import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.Algorithm;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarker;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "item", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "kotlin.jvm.PlatformType", "onClusterItemClick", "com/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction$setupClusters$1$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapViewInteraction.kt */
public final class MapViewInteraction$setupClusters$$inlined$let$lambda$2<T extends ClusterItem> implements ClusterManager.OnClusterItemClickListener<ClusterMarker> {
    final /* synthetic */ MapViewInteraction this$0;

    MapViewInteraction$setupClusters$$inlined$let$lambda$2(MapViewInteraction mapViewInteraction) {
        this.this$0 = mapViewInteraction;
    }

    public final boolean onClusterItemClick(ClusterMarker clusterMarker) {
        Function1<ClusterMarker, Unit> onClickToClusterItemClick = this.this$0.getOnClickToClusterItemClick();
        Intrinsics.checkNotNullExpressionValue(clusterMarker, "item");
        onClickToClusterItemClick.invoke(clusterMarker);
        MapViewInteraction.zoomToClusterMarkerOnMap$default(this.this$0, clusterMarker, false, 2, null);
        ClusterManager<ClusterMarker> mClusterManager = this.this$0.getMClusterManager();
        Intrinsics.checkNotNull(mClusterManager);
        Algorithm<ClusterMarker> algorithm = mClusterManager.getAlgorithm();
        Intrinsics.checkNotNullExpressionValue(algorithm, "mClusterManager!!.algorithm");
        Collection<ClusterMarker> items = algorithm.getItems();
        Intrinsics.checkNotNullExpressionValue(items, "mClusterManager!!.algorithm.items");
        Collection<ClusterMarker> collection = items;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
        for (T t : collection) {
            if (t.isSelected()) {
                t.setSelected(false);
                ClusterManager<ClusterMarker> mClusterManager2 = this.this$0.getMClusterManager();
                Intrinsics.checkNotNull(mClusterManager2);
                mClusterManager2.updateItem(t);
                ClusterManager<ClusterMarker> mClusterManager3 = this.this$0.getMClusterManager();
                Intrinsics.checkNotNull(mClusterManager3);
                mClusterManager3.cluster();
            }
            arrayList.add(Unit.INSTANCE);
        }
        this.this$0.setSelectedMarker(clusterMarker);
        return true;
    }
}
