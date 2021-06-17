package com.thecoffeehouse.guestapp;

import androidx.lifecycle.ViewModelProvider;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationViewModel;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
final class MainActivity$pickLocationViewModel$2 extends Lambda implements Function0<PickLocationViewModel> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$pickLocationViewModel$2(MainActivity mainActivity) {
        super(0);
        this.this$0 = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final PickLocationViewModel invoke() {
        return (PickLocationViewModel) new ViewModelProvider(this.this$0).get(PickLocationViewModel.class);
    }
}
