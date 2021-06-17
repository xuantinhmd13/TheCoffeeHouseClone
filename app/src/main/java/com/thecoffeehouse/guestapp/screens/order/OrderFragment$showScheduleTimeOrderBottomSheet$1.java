package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.screens.order.checkout.CheckoutDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.DayOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTimeResponse;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "getOrderTimeReponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTimeResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showScheduleTimeOrderBottomSheet$1 extends Lambda implements Function1<GetOrderTimeResponse, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showScheduleTimeOrderBottomSheet$1(OrderFragment orderFragment) {
        super(1);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetOrderTimeResponse getOrderTimeResponse) {
        invoke(getOrderTimeResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetOrderTimeResponse getOrderTimeResponse) {
        Intrinsics.checkNotNullParameter(getOrderTimeResponse, "getOrderTimeReponse");
        ArrayList<DayOrder> days = getOrderTimeResponse.getDays();
        CheckoutDialogFragment checkoutDialogFragment = this.this$0.mCheckoutDialogFragment;
        if (checkoutDialogFragment != null) {
            checkoutDialogFragment.showScheduleTimeBottomSheet(days);
        }
    }
}
