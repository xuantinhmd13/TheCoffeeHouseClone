package com.thecoffeehouse.guestapp.screens.order.menudetail;

import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$addViewRadioButtonOptions$2", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup;", "checkedId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment$addViewRadioButtonOptions$2 implements CustomRadioGroup.OnCheckedChangeListener {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ProductDetailDialogFragment$addViewRadioButtonOptions$2(ProductDetailDialogFragment productDetailDialogFragment) {
        this.this$0 = productDetailDialogFragment;
    }

    @Override // com.thecoffeehouse.guestapp.views.CustomRadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(CustomRadioGroup customRadioGroup, int i) {
        this.this$0.totalPriceChange();
    }
}
