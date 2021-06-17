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
public final class ProductDetailDialogFragment$initQuantityView$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductDetailDialogFragment$initQuantityView$1(ProductDetailDialogFragment productDetailDialogFragment) {
        super(0);
        this.this$0 = productDetailDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        LayoutFooterProductDetail layoutFooterProductDetail;
        LayoutFooterProductDetail layoutFooterProductDetail2;
        if (this.this$0.mProductConfiguration == null) {
            if (this.this$0.mQuantity != 1) {
                ProductDetailDialogFragment productDetailDialogFragment = this.this$0;
                productDetailDialogFragment.mQuantity = productDetailDialogFragment.mQuantity - 1;
                View view = this.this$0.getRootView();
                if (!(view == null || (layoutFooterProductDetail2 = (LayoutFooterProductDetail) view.findViewById(R.id.layout_total_price)) == null)) {
                    layoutFooterProductDetail2.updateQuantity(this.this$0.mQuantity);
                }
                this.this$0.totalPriceChange();
            }
        } else if (this.this$0.mQuantity != 0) {
            ProductDetailDialogFragment productDetailDialogFragment2 = this.this$0;
            productDetailDialogFragment2.mQuantity = productDetailDialogFragment2.mQuantity - 1;
            View view2 = this.this$0.getRootView();
            if (!(view2 == null || (layoutFooterProductDetail = (LayoutFooterProductDetail) view2.findViewById(R.id.layout_total_price)) == null)) {
                layoutFooterProductDetail.updateQuantity(this.this$0.mQuantity);
            }
            this.this$0.totalPriceChange();
        }
    }
}
