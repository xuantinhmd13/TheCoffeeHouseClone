package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import com.thecoffeehouse.guestapp.views.CornerConstraintLayout;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* compiled from: ItemRowPickStore.kt */
final /* synthetic */ class ItemRowPickStore$onResolve$1 extends MutablePropertyReference0Impl {
    ItemRowPickStore$onResolve$1(ItemRowPickStore itemRowPickStore) {
        super(itemRowPickStore, ItemRowPickStore.class, "itemRowStoreRoot", "getItemRowStoreRoot()Lcom/thecoffeehouse/guestapp/views/CornerConstraintLayout;", 0);
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return ((ItemRowPickStore) this.receiver).getItemRowStoreRoot();
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((ItemRowPickStore) this.receiver).setItemRowStoreRoot((CornerConstraintLayout) obj);
    }
}
