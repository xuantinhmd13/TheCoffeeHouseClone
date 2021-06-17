package com.thecoffeehouse.guestapp.screens.stores.interaction;

import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.Comparator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapViewInteraction.kt */
final class MapViewInteraction$sortStoreByUserLocation$1<T> implements Comparator<Store> {
    public static final MapViewInteraction$sortStoreByUserLocation$1 INSTANCE = new MapViewInteraction$sortStoreByUserLocation$1();

    MapViewInteraction$sortStoreByUserLocation$1() {
    }

    public final int compare(Store store, Store store2) {
        Double distance;
        Double distance2;
        double d = Double.MAX_VALUE;
        double doubleValue = (store == null || (distance2 = store.getDistance()) == null) ? Double.MAX_VALUE : distance2.doubleValue();
        if (!(store2 == null || (distance = store2.getDistance()) == null)) {
            d = distance.doubleValue();
        }
        return Double.compare(doubleValue, d);
    }
}
