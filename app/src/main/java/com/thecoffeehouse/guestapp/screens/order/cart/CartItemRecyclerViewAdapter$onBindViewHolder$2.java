package com.thecoffeehouse.guestapp.screens.order.cart;

import com.daimajia.swipe.SwipeLayout;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\bH\u0016J\u0012\u0010\n\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u000b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\"\u0010\r\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¨\u0006\u0011"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter$onBindViewHolder$2", "Lcom/daimajia/swipe/SwipeLayout$SwipeListener;", "onClose", "", "layout", "Lcom/daimajia/swipe/SwipeLayout;", "onHandRelease", "xvel", "", "yvel", "onOpen", "onStartClose", "onStartOpen", "onUpdate", "leftOffset", "", "topOffset", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CartItemRecyclerViewAdapter.kt */
public final class CartItemRecyclerViewAdapter$onBindViewHolder$2 implements SwipeLayout.SwipeListener {
    final /* synthetic */ CartItemRecyclerViewAdapter this$0;

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public void onClose(SwipeLayout swipeLayout) {
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public void onHandRelease(SwipeLayout swipeLayout, float f, float f2) {
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public void onOpen(SwipeLayout swipeLayout) {
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public void onStartClose(SwipeLayout swipeLayout) {
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public void onUpdate(SwipeLayout swipeLayout, int i, int i2) {
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CartItemRecyclerViewAdapter$onBindViewHolder$2(CartItemRecyclerViewAdapter cartItemRecyclerViewAdapter) {
        this.this$0 = cartItemRecyclerViewAdapter;
    }

    @Override // com.daimajia.swipe.SwipeLayout.SwipeListener
    public void onStartOpen(SwipeLayout swipeLayout) {
        this.this$0.mItemManger.closeAllExcept(swipeLayout);
    }
}
