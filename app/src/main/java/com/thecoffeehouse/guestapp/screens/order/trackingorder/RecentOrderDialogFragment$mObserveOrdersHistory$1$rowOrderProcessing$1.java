package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RecentOrderDialogFragment.kt */
public final class RecentOrderDialogFragment$mObserveOrdersHistory$1$rowOrderProcessing$1 extends Lambda implements Function1<OrderHistory, Unit> {
    final /* synthetic */ OrderHistory $orderHistory;
    final /* synthetic */ RecentOrderDialogFragment$mObserveOrdersHistory$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentOrderDialogFragment$mObserveOrdersHistory$1$rowOrderProcessing$1(RecentOrderDialogFragment$mObserveOrdersHistory$1 recentOrderDialogFragment$mObserveOrdersHistory$1, OrderHistory orderHistory) {
        super(1);
        this.this$0 = recentOrderDialogFragment$mObserveOrdersHistory$1;
        this.$orderHistory = orderHistory;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderHistory orderHistory) {
        invoke(orderHistory);
        return Unit.INSTANCE;
    }

    public final void invoke(OrderHistory orderHistory) {
        Intrinsics.checkNotNullParameter(orderHistory, "it");
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderTrackingEvents.EventOrderTrackingOpenSelected.name, OrderTrackingEvents.EventOrderTrackingOpenSelected.Value.Order_History);
        TrackingOrderDialogFragment newInstance$default = TrackingOrderDialogFragment.Companion.newInstance$default(TrackingOrderDialogFragment.Companion, this.$orderHistory.getRef(), this.$orderHistory.getOrderType(), false, 4, null);
        MainActivity mainActivity = this.this$0.this$0.getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it1.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
    }
}
