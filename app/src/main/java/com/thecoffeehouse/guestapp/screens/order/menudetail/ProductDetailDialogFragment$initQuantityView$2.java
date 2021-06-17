package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.view.View;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment$initQuantityView$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductDetailDialogFragment$initQuantityView$2(ProductDetailDialogFragment productDetailDialogFragment) {
        super(0);
        this.this$0 = productDetailDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        LayoutFooterProductDetail layoutFooterProductDetail;
        ProductDetailDialogFragment productDetailDialogFragment = this.this$0;
        productDetailDialogFragment.mQuantity = productDetailDialogFragment.mQuantity + 1;
        View view = this.this$0.getRootView();
        if (!(view == null || (layoutFooterProductDetail = (LayoutFooterProductDetail) view.findViewById(R.id.layout_total_price)) == null)) {
            layoutFooterProductDetail.updateQuantity(this.this$0.mQuantity);
        }
        this.this$0.totalPriceChange();
    }
}
