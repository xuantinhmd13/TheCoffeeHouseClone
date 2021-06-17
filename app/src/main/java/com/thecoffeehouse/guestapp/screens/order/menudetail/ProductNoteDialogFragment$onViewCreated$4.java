package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.InputTextCharCountView;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductNoteDialogFragment.kt */
final class ProductNoteDialogFragment$onViewCreated$4 implements View.OnClickListener {
    final /* synthetic */ ProductNoteDialogFragment this$0;

    ProductNoteDialogFragment$onViewCreated$4(ProductNoteDialogFragment productNoteDialogFragment) {
        this.this$0 = productNoteDialogFragment;
    }

    public final void onClick(View view) {
        Function1 function1 = this.this$0.onEditNoteListener;
        EditText editTextInput = ((InputTextCharCountView) this.this$0._$_findCachedViewById(R.id.input_text_char_count)).getEditTextInput();
        function1.invoke(StringExtsKt.toStringOrNull(String.valueOf(editTextInput != null ? editTextInput.getText() : null)));
        this.this$0.dismiss();
    }
}
