package com.thecoffeehouse.guestapp.views;

import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "orderLineEdit", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "position", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderLineItemListView.kt */
public final class OrderLineItemListView$initCollapseCartOrderLineAdapter$1 extends Lambda implements Function2<OrderLine, Integer, Unit> {
    final /* synthetic */ OrderLineItemListView this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderLineItemListView$initCollapseCartOrderLineAdapter$1(OrderLineItemListView orderLineItemListView) {
        super(2);
        this.this$0 = orderLineItemListView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OrderLine orderLine, Integer num) {
        invoke(orderLine, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(OrderLine orderLine, int i) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLineEdit");
        this.this$0.getOnClickOrderLineEdit().invoke(orderLine, Integer.valueOf(i));
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewItemDetail.name, "Cart");
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewItemDetail.name, new TrackingData("productID", orderLine.getId()));
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewItemDetail.name);
    }
}
