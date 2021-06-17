package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$mAddressTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
public final class PickLocationDialog$mAddressTextWatcher$1 implements TextWatcher {
    final /* synthetic */ PickLocationDialog this$0;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PickLocationDialog$mAddressTextWatcher$1(PickLocationDialog pickLocationDialog) {
        this.this$0 = pickLocationDialog;
    }

    public void afterTextChanged(Editable editable) {
        Editable editable2 = editable;
        if (editable2 == null || editable2.length() == 0) {
            View access$getRootView$p = PickLocationDialog.access$getRootView$p(this.this$0);
            if (access$getRootView$p != null) {
                View findViewById = access$getRootView$p.findViewById(R.id.layout_input_address_manually);
                Intrinsics.checkNotNullExpressionValue(findViewById, "layout_input_address_manually");
                TLButton tLButton = (TLButton) findViewById.findViewById(R.id.btn_create_new_address);
                Intrinsics.checkNotNullExpressionValue(tLButton, "layout_input_address_man…ly.btn_create_new_address");
                tLButton.setEnabled(false);
                View findViewById2 = access$getRootView$p.findViewById(R.id.layout_input_address_manually);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "layout_input_address_manually");
                TLButton tLButton2 = (TLButton) findViewById2.findViewById(R.id.btn_create_new_address);
                Intrinsics.checkNotNullExpressionValue(tLButton2, "layout_input_address_man…ly.btn_create_new_address");
                tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0.requireContext(), R.color.colorBBBBBB)));
                return;
            }
            return;
        }
        View access$getRootView$p2 = PickLocationDialog.access$getRootView$p(this.this$0);
        if (access$getRootView$p2 != null) {
            View findViewById3 = access$getRootView$p2.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "layout_input_address_manually");
            TLButton tLButton3 = (TLButton) findViewById3.findViewById(R.id.btn_create_new_address);
            Intrinsics.checkNotNullExpressionValue(tLButton3, "layout_input_address_man…ly.btn_create_new_address");
            tLButton3.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0.requireContext(), R.color.colorC5671B)));
            View findViewById4 = access$getRootView$p2.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "layout_input_address_manually");
            TLButton tLButton4 = (TLButton) findViewById4.findViewById(R.id.btn_create_new_address);
            Intrinsics.checkNotNullExpressionValue(tLButton4, "layout_input_address_man…ly.btn_create_new_address");
            tLButton4.setEnabled(true);
        }
    }
}
