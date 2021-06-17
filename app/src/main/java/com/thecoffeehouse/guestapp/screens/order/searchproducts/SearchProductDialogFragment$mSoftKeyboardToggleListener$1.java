package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import android.graphics.Rect;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "isVisible", "", "keyboardHeight", "Landroid/graphics/Rect;", "kotlin.jvm.PlatformType", "onToggleSoftKeyboard"}, k = 3, mv = {1, 4, 0})
/* compiled from: SearchProductDialogFragment.kt */
public final class SearchProductDialogFragment$mSoftKeyboardToggleListener$1 implements KeyboardUtils.SoftKeyboardToggleListener {
    final /* synthetic */ SearchProductDialogFragment this$0;

    SearchProductDialogFragment$mSoftKeyboardToggleListener$1(SearchProductDialogFragment searchProductDialogFragment) {
        this.this$0 = searchProductDialogFragment;
    }

    @Override // com.thecoffeehouse.guestapp.utility.KeyboardUtils.SoftKeyboardToggleListener
    public final void onToggleSoftKeyboard(boolean z, Rect rect) {
        if (z) {
            this.this$0.getMFloatingCartInteraction().getLayoutFloatingCart().setVisibility(8);
        } else if (this.this$0.getMOrder() != null) {
            SearchProductDialogFragment searchProductDialogFragment = this.this$0;
            Order mOrder = searchProductDialogFragment.getMOrder();
            Intrinsics.checkNotNull(mOrder);
            searchProductDialogFragment.updateCart(mOrder);
        }
    }
}
