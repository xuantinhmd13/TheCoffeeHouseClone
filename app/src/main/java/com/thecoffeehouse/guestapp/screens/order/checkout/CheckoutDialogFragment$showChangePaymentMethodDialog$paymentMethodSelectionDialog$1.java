package com.thecoffeehouse.guestapp.screens.order.checkout;

import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "paymentMethod", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "invoke", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;)Lkotlin/Unit;"}, k = 3, mv = {1, 4, 0})
/* compiled from: CheckoutDialogFragment.kt */
public final class CheckoutDialogFragment$showChangePaymentMethodDialog$paymentMethodSelectionDialog$1 extends Lambda implements Function1<Payment, Unit> {
    final /* synthetic */ CheckoutDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckoutDialogFragment$showChangePaymentMethodDialog$paymentMethodSelectionDialog$1(CheckoutDialogFragment checkoutDialogFragment) {
        super(1);
        this.this$0 = checkoutDialogFragment;
    }

    public final Unit invoke(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "paymentMethod");
        return (Unit) this.this$0.onChangePaymentMethod.invoke(payment);
    }
}
