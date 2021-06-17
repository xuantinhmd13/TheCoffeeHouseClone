package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SearchProductDialogFragment.kt */
public final class SearchProductDialogFragment$initProductAdapter$1 extends Lambda implements Function1<Product, Unit> {
    final /* synthetic */ SearchProductDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchProductDialogFragment$initProductAdapter$1(SearchProductDialogFragment searchProductDialogFragment) {
        super(1);
        this.this$0 = searchProductDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Product product) {
        invoke(product);
        return Unit.INSTANCE;
    }

    public final void invoke(Product product) {
        Intrinsics.checkNotNullParameter(product, "it");
        this.this$0.getOnSelectProduct().invoke(product);
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewItemDetail.name, "Search");
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewItemDetail.name, new TrackingData("productID", product.getId()), new TrackingData("categoryID", product.getCategoryId()));
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewItemDetail.name);
    }
}
