package com.thecoffeehouse.guestapp.screens.order;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "orderLineDelete", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "position", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showShippingAndPaymentDialog$8 extends Lambda implements Function2<OrderLine, Integer, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showShippingAndPaymentDialog$8(OrderFragment orderFragment) {
        super(2);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OrderLine orderLine, Integer num) {
        invoke(orderLine, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(OrderLine orderLine, int i) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLineDelete");
        GeneralKt.log(orderLine.getName());
        GeneralKt.log(Integer.valueOf(i));
        this.this$0.updateNotes();
        LiveData<Resource<CalculateOrderResponse>> deleteOrderLineAndCalculateOrder = ((OrderViewModel) this.this$0.getViewModel()).deleteOrderLineAndCalculateOrder(orderLine);
        OrderFragment orderFragment = this.this$0;
        deleteOrderLineAndCalculateOrder.observe(orderFragment, orderFragment.mObserverCalculateOrder);
        this.this$0.trackingDeleteOrderLine();
    }
}
