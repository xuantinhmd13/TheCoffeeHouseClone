package com.thecoffeehouse.guestapp.screens.order.checkout;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Lkotlin/Unit;"}, k = 3, mv = {1, 4, 0})
/* compiled from: CheckoutDialogFragment.kt */
public final class CheckoutDialogFragment$initViewDeliveryListenViews$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CheckoutDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckoutDialogFragment$initViewDeliveryListenViews$1(CheckoutDialogFragment checkoutDialogFragment) {
        super(0);
        this.this$0 = checkoutDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        return (Unit) this.this$0.onChangeLocation.invoke();
    }
}
