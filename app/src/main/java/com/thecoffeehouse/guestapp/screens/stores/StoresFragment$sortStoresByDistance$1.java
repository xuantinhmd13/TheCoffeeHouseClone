package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.Comparator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "o1", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "kotlin.jvm.PlatformType", "o2", "compare"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$sortStoresByDistance$1<T> implements Comparator<Store> {
    public static final StoresFragment$sortStoresByDistance$1 INSTANCE = new StoresFragment$sortStoresByDistance$1();

    StoresFragment$sortStoresByDistance$1() {
    }

    public final int compare(Store store, Store store2) {
        if (!(store.getDistance() == null || store2.getDistance() == null)) {
            Double distance = store.getDistance();
            Intrinsics.checkNotNull(distance);
            double doubleValue = distance.doubleValue();
            Double distance2 = store2.getDistance();
            Intrinsics.checkNotNull(distance2);
            if (doubleValue > distance2.doubleValue()) {
                return -1;
            }
            Double distance3 = store.getDistance();
            Intrinsics.checkNotNull(distance3);
            double doubleValue2 = distance3.doubleValue();
            Double distance4 = store2.getDistance();
            Intrinsics.checkNotNull(distance4);
            if (doubleValue2 == distance4.doubleValue()) {
                return 0;
            }
            Double distance5 = store.getDistance();
            Intrinsics.checkNotNull(distance5);
            double doubleValue3 = distance5.doubleValue();
            Double distance6 = store2.getDistance();
            Intrinsics.checkNotNull(distance6);
            if (doubleValue3 < distance6.doubleValue()) {
                return 1;
            }
        }
        return 0;
    }
}
