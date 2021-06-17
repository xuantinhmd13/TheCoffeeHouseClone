package com.thecoffeehouse.guestapp.screens.order.cart;

import com.thecoffeehouse.guestapp.services.api.model.orders.Extra;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "extra", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Extra;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CartItemRecyclerViewAdapter.kt */
final class CartItemRecyclerViewAdapter$ViewHolder$joinExtrasToString$optionsAndNote$1 extends Lambda implements Function1<Extra, CharSequence> {
    public static final CartItemRecyclerViewAdapter$ViewHolder$joinExtrasToString$optionsAndNote$1 INSTANCE = new CartItemRecyclerViewAdapter$ViewHolder$joinExtrasToString$optionsAndNote$1();

    CartItemRecyclerViewAdapter$ViewHolder$joinExtrasToString$optionsAndNote$1() {
        super(1);
    }

    public final CharSequence invoke(Extra extra) {
        Intrinsics.checkNotNullParameter(extra, "extra");
        return String.valueOf(extra.getName());
    }
}
