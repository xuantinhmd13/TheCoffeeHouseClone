package com.thecoffeehouse.guestapp.screens.order;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "dayOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showShippingAndPaymentDialog$5 extends Lambda implements Function1<ScheduleTime, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showShippingAndPaymentDialog$5(OrderFragment orderFragment) {
        super(1);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScheduleTime scheduleTime) {
        invoke(scheduleTime);
        return Unit.INSTANCE;
    }

    public final void invoke(ScheduleTime scheduleTime) {
        if (scheduleTime == null) {
            this.this$0.showScheduleTimeOrderBottomSheet();
            return;
        }
        this.this$0.updateNotes();
        LiveData<Resource<CalculateOrderResponse>> updateScheduleTime = ((OrderViewModel) this.this$0.getViewModel()).updateScheduleTime(scheduleTime);
        OrderFragment orderFragment = this.this$0;
        updateScheduleTime.observe(orderFragment, orderFragment.mObserverCalculateOrder);
    }
}
