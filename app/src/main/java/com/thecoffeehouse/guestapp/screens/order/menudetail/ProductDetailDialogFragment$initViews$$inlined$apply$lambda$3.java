package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.widget.CompoundButton;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "buttonView", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "isChecked", "", "onCheckedChanged", "com/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$initViews$1$3"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
final class ProductDetailDialogFragment$initViews$$inlined$apply$lambda$3 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    ProductDetailDialogFragment$initViews$$inlined$apply$lambda$3(ProductDetailDialogFragment productDetailDialogFragment) {
        this.this$0 = productDetailDialogFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        Product product = this.this$0.mProduct;
        if (product != null) {
            ProductDetailDialogFragment.access$getOnCheckFavouriteChange$p(this.this$0).invoke(product, Boolean.valueOf(z));
        }
    }
}
