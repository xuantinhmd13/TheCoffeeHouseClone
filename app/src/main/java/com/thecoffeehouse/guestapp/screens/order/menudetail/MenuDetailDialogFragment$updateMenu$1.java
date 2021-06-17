package com.thecoffeehouse.guestapp.screens.order.menudetail;

import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* compiled from: MenuDetailDialogFragment.kt */
final /* synthetic */ class MenuDetailDialogFragment$updateMenu$1 extends MutablePropertyReference0Impl {
    MenuDetailDialogFragment$updateMenu$1(MenuDetailDialogFragment menuDetailDialogFragment) {
        super(menuDetailDialogFragment, MenuDetailDialogFragment.class, "mProductAdapter", "getMProductAdapter()Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter;", 0);
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return MenuDetailDialogFragment.access$getMProductAdapter$p((MenuDetailDialogFragment) this.receiver);
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((MenuDetailDialogFragment) this.receiver).mProductAdapter = (ProductRecyclerViewAdapter) obj;
    }
}
