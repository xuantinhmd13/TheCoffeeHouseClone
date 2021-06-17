package com.thecoffeehouse.guestapp.screens.order;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
final /* synthetic */ class OrderFragment$scrollToTop$1 extends MutablePropertyReference0Impl {
    OrderFragment$scrollToTop$1(OrderFragment orderFragment) {
        super(orderFragment, OrderFragment.class, "mViewRcvProduct", "getMViewRcvProduct()Landroidx/recyclerview/widget/RecyclerView;", 0);
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return OrderFragment.access$getMViewRcvProduct$p((OrderFragment) this.receiver);
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((OrderFragment) this.receiver).mViewRcvProduct = (RecyclerView) obj;
    }
}
