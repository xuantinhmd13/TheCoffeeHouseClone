package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RecentOrderDialogFragment.kt */
public final class RecentOrderDialogFragment$initOrdersProcessing$rowOrderProcessing$1 extends Lambda implements Function1<OrderProcessing, Unit> {
    final /* synthetic */ OrderProcessing $order;
    final /* synthetic */ RecentOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentOrderDialogFragment$initOrdersProcessing$rowOrderProcessing$1(RecentOrderDialogFragment recentOrderDialogFragment, OrderProcessing orderProcessing) {
        super(1);
        this.this$0 = recentOrderDialogFragment;
        this.$order = orderProcessing;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderProcessing orderProcessing) {
        invoke(orderProcessing);
        return Unit.INSTANCE;
    }

    public final void invoke(OrderProcessing orderProcessing) {
        Intrinsics.checkNotNullParameter(orderProcessing, "it");
        TrackingOrderDialogFragment newInstance$default = TrackingOrderDialogFragment.Companion.newInstance$default(TrackingOrderDialogFragment.Companion, this.$order.getRef(), this.$order.getOrderType(), false, 4, null);
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it1.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
    }
}
