package com.thecoffeehouse.guestapp.screens.order.menudetail;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "invoke", "com/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$initViews$1$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
final class ProductDetailDialogFragment$initViews$$inlined$apply$lambda$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductDetailDialogFragment$initViews$$inlined$apply$lambda$2(ProductDetailDialogFragment productDetailDialogFragment) {
        super(0);
        this.this$0 = productDetailDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        this.this$0.showLoading();
        this.this$0.initOrderLine();
        ProductDetailDialogFragment.access$getOnSubmitOrder$p(this.this$0).invoke(this.this$0.mOrderLine);
    }
}
