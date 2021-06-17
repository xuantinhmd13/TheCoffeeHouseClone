package com.thecoffeehouse.guestapp.views;

import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "<anonymous parameter 1>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderLineItemListView.kt */
final class OrderLineItemListView$onClickOrderLineEdit$1 extends Lambda implements Function2<OrderLine, Integer, Unit> {
    public static final OrderLineItemListView$onClickOrderLineEdit$1 INSTANCE = new OrderLineItemListView$onClickOrderLineEdit$1();

    OrderLineItemListView$onClickOrderLineEdit$1() {
        super(2);
    }

    public final void invoke(OrderLine orderLine, int i) {
        Intrinsics.checkNotNullParameter(orderLine, "<anonymous parameter 0>");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OrderLine orderLine, Integer num) {
        invoke(orderLine, num.intValue());
        return Unit.INSTANCE;
    }
}
