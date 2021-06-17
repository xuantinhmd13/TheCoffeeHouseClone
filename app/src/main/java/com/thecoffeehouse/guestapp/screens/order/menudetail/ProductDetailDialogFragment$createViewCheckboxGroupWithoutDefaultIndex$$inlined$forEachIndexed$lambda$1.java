package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.widget.CompoundButton;
import android.widget.LinearLayout;
import com.thecoffeehouse.guestapp.services.api.model.orders.Option;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "group", "Landroid/widget/CompoundButton;", "kotlin.jvm.PlatformType", "checkedId", "", "onCheckedChanged", "com/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$createViewCheckboxGroupWithoutDefaultIndex$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment$createViewCheckboxGroupWithoutDefaultIndex$$inlined$forEachIndexed$lambda$1 implements CompoundButton.OnCheckedChangeListener {
    final /* synthetic */ LinearLayout $layoutSelection$inlined;
    final /* synthetic */ Option $option$inlined;
    final /* synthetic */ ProductDetailDialogFragment this$0;

    ProductDetailDialogFragment$createViewCheckboxGroupWithoutDefaultIndex$$inlined$forEachIndexed$lambda$1(ProductDetailDialogFragment productDetailDialogFragment, Option option, LinearLayout linearLayout) {
        this.this$0 = productDetailDialogFragment;
        this.$option$inlined = option;
        this.$layoutSelection$inlined = linearLayout;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        this.this$0.totalPriceChange();
    }
}
