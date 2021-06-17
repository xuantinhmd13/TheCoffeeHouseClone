package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$initShippingMethodViews$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$initShippingMethodViews$1(OrderFragment orderFragment) {
        super(0);
        this.this$0 = orderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        GeneralKt.log("initDefaultShippingMethod: done");
        OrderFragment orderFragment = this.this$0;
        orderFragment.calculateOrder(orderFragment.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.updateHeaderShippingMethod(this.this$0.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
        }
        this.this$0.getOnInitDataDone().invoke();
    }
}
