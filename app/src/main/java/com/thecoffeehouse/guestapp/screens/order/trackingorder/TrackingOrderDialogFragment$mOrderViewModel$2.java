package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderDialogFragment.kt */
public final class TrackingOrderDialogFragment$mOrderViewModel$2 extends Lambda implements Function0<OrderViewModel> {
    final /* synthetic */ TrackingOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingOrderDialogFragment$mOrderViewModel$2(TrackingOrderDialogFragment trackingOrderDialogFragment) {
        super(0);
        this.this$0 = trackingOrderDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderViewModel invoke() {
        ViewModel viewModel = new ViewModelProvider(this.this$0, new OrderViewModelFactory(this.this$0, null)).get(OrderViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProvider(this, …derViewModel::class.java)");
        return (OrderViewModel) viewModel;
    }
}
