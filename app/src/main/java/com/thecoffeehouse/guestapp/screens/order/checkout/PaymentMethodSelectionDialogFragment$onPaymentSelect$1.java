package com.thecoffeehouse.guestapp.screens.order.checkout;

import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PaymentMethodSelectionDialogFragment.kt */
public final class PaymentMethodSelectionDialogFragment$onPaymentSelect$1 extends Lambda implements Function1<Payment, Unit> {
    public static final PaymentMethodSelectionDialogFragment$onPaymentSelect$1 INSTANCE = new PaymentMethodSelectionDialogFragment$onPaymentSelect$1();

    PaymentMethodSelectionDialogFragment$onPaymentSelect$1() {
        super(1);
    }

    public final void invoke(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "it");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Payment payment) {
        invoke(payment);
        return Unit.INSTANCE;
    }
}
