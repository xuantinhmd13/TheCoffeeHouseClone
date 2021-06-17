package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* compiled from: StoreDetailBottomSheetFragment.kt */
final /* synthetic */ class StoreDetailBottomSheetFragment$viewInitializations$1 extends MutablePropertyReference0Impl {
    StoreDetailBottomSheetFragment$viewInitializations$1(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment) {
        super(storeDetailBottomSheetFragment, StoreDetailBottomSheetFragment.class, "store", "getStore()Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", 0);
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return StoreDetailBottomSheetFragment.access$getStore$p((StoreDetailBottomSheetFragment) this.receiver);
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((StoreDetailBottomSheetFragment) this.receiver).store = (Store) obj;
    }
}
