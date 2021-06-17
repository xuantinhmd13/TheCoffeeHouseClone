package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.graphics.Rect;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "isVisible", "", "keyboardRect", "Landroid/graphics/Rect;", "kotlin.jvm.PlatformType", "onToggleSoftKeyboard"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductNoteDialogFragment.kt */
public final class ProductNoteDialogFragment$mSoftKeyboardToggleListener$1 implements KeyboardUtils.SoftKeyboardToggleListener {
    final /* synthetic */ ProductNoteDialogFragment this$0;

    ProductNoteDialogFragment$mSoftKeyboardToggleListener$1(ProductNoteDialogFragment productNoteDialogFragment) {
        this.this$0 = productNoteDialogFragment;
    }

    @Override // com.thecoffeehouse.guestapp.utility.KeyboardUtils.SoftKeyboardToggleListener
    public final void onToggleSoftKeyboard(boolean z, Rect rect) {
        if (z) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.this$0._$_findCachedViewById(R.id.layout_product_note);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_product_note");
            ConstraintLayout constraintLayout2 = (ConstraintLayout) this.this$0._$_findCachedViewById(R.id.layout_product_note);
            Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_product_note");
            int height = constraintLayout2.getHeight();
            TextView textView = (TextView) this.this$0._$_findCachedViewById(R.id.textView3);
            Intrinsics.checkNotNullExpressionValue(textView, "textView3");
            ViewExtsKt.marginBottom(constraintLayout, height - textView.getHeight());
            return;
        }
        ConstraintLayout constraintLayout3 = (ConstraintLayout) this.this$0._$_findCachedViewById(R.id.layout_product_note);
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "layout_product_note");
        ViewExtsKt.marginBottom(constraintLayout3, 0);
    }
}
