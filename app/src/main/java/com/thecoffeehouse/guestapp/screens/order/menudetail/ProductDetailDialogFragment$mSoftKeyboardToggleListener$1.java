package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.graphics.Rect;
import android.view.View;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "isVisible", "", "keyboardRect", "Landroid/graphics/Rect;", "kotlin.jvm.PlatformType", "onToggleSoftKeyboard"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment$mSoftKeyboardToggleListener$1 implements KeyboardUtils.SoftKeyboardToggleListener {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    ProductDetailDialogFragment$mSoftKeyboardToggleListener$1(ProductDetailDialogFragment productDetailDialogFragment) {
        this.this$0 = productDetailDialogFragment;
    }

    @Override // com.thecoffeehouse.guestapp.utility.KeyboardUtils.SoftKeyboardToggleListener
    public final void onToggleSoftKeyboard(boolean z, Rect rect) {
        if (z) {
            View view = this.this$0.mFloatingCartLayout;
            if (view != null) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        View view2 = this.this$0.mFloatingCartLayout;
        if (view2 != null) {
            view2.setVisibility(0);
        }
    }
}
