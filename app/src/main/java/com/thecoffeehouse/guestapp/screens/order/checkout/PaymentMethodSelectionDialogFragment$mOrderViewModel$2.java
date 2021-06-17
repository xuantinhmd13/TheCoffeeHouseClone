package com.thecoffeehouse.guestapp.screens.order.checkout;

import androidx.lifecycle.ViewModelProvider;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PaymentMethodSelectionDialogFragment.kt */
public final class PaymentMethodSelectionDialogFragment$mOrderViewModel$2 extends Lambda implements Function0<OrderViewModel> {
    final /* synthetic */ PaymentMethodSelectionDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaymentMethodSelectionDialogFragment$mOrderViewModel$2(PaymentMethodSelectionDialogFragment paymentMethodSelectionDialogFragment) {
        super(0);
        this.this$0 = paymentMethodSelectionDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderViewModel invoke() {
        return (OrderViewModel) new ViewModelProvider(this.this$0, new OrderViewModelFactory(this.this$0, null)).get(OrderViewModel.class);
    }
}
