package com.thecoffeehouse.guestapp.screens.home;

import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: NotificationRecyclerViewAdapter.kt */
public final class NotificationRecyclerViewAdapter$NotificationViewHolder$bind$orderLines$1 extends Lambda implements Function1<OrderLineCreateOrder, CharSequence> {
    public static final NotificationRecyclerViewAdapter$NotificationViewHolder$bind$orderLines$1 INSTANCE = new NotificationRecyclerViewAdapter$NotificationViewHolder$bind$orderLines$1();

    NotificationRecyclerViewAdapter$NotificationViewHolder$bind$orderLines$1() {
        super(1);
    }

    public final CharSequence invoke(OrderLineCreateOrder orderLineCreateOrder) {
        Intrinsics.checkNotNullParameter(orderLineCreateOrder, "it");
        return String.valueOf(orderLineCreateOrder.getName());
    }
}
