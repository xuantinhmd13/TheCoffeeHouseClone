package com.thecoffeehouse.guestapp.screens.order.cart;

import android.view.View;
import com.thecoffeehouse.guestapp.configs.trackingevents.EditCartEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.cart.CartItemRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CartItemRecyclerViewAdapter.kt */
final class CartItemRecyclerViewAdapter$ViewHolder$bind$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Function2 $onItemClickListener;
    final /* synthetic */ OrderLine $orderline;
    final /* synthetic */ int $position;
    final /* synthetic */ CartItemRecyclerViewAdapter.ViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CartItemRecyclerViewAdapter$ViewHolder$bind$2(CartItemRecyclerViewAdapter.ViewHolder viewHolder, Function2 function2, OrderLine orderLine, int i) {
        super(1);
        this.this$0 = viewHolder;
        this.$onItemClickListener = function2;
        this.$orderline = orderLine;
        this.$position = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        TrackingEventService.Companion.collectParamWithEventName(EditCartEvents.EventCartItemEditedSuccessfully.name, new TrackingData("entryPoints", "On Swipe"));
        this.$onItemClickListener.invoke(this.$orderline, Integer.valueOf(this.$position));
        this.this$0.getSwipeLayout().close(true);
    }
}
