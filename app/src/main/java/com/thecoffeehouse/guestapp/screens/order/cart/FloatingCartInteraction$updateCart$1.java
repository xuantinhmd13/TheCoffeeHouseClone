package com.thecoffeehouse.guestapp.screens.order.cart;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.MutablePropertyReference0Impl;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
/* compiled from: FloatingCartInteraction.kt */
final /* synthetic */ class FloatingCartInteraction$updateCart$1 extends MutablePropertyReference0Impl {
    FloatingCartInteraction$updateCart$1(FloatingCartInteraction floatingCartInteraction) {
        super(floatingCartInteraction, FloatingCartInteraction.class, "layoutFloatingCart", "getLayoutFloatingCart()Landroid/view/View;", 0);
    }

    @Override // kotlin.reflect.KProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public Object get() {
        return ((FloatingCartInteraction) this.receiver).getLayoutFloatingCart();
    }

    @Override // kotlin.reflect.KMutableProperty0, kotlin.jvm.internal.MutablePropertyReference0Impl
    public void set(Object obj) {
        ((FloatingCartInteraction) this.receiver).setLayoutFloatingCart((View) obj);
    }
}
