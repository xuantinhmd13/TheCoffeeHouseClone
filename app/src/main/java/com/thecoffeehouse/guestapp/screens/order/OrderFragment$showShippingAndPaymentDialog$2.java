package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showShippingAndPaymentDialog$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showShippingAndPaymentDialog$2(OrderFragment orderFragment) {
        super(0);
        this.this$0 = orderFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        this.this$0.updateNotes();
        this.this$0.getMTrackingEventOrder().updateSourceTrackingEvent(ShippingMethodEvents.EventShippingChangedSuccessfully.name, "Checkout - Change Method");
        this.this$0.showSelectShippingMethod();
    }
}
