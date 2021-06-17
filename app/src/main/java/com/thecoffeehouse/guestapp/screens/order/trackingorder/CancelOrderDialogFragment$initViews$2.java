package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.widget.Button;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/trackingorder/CancelOrderDialogFragment$initViews$2", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup$OnCheckedChangeListener;", "onCheckedChanged", "", "group", "Lcom/thecoffeehouse/guestapp/views/CustomRadioGroup;", "checkedId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CancelOrderDialogFragment.kt */
public final class CancelOrderDialogFragment$initViews$2 implements CustomRadioGroup.OnCheckedChangeListener {
    final /* synthetic */ CancelOrderDialogFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    CancelOrderDialogFragment$initViews$2(CancelOrderDialogFragment cancelOrderDialogFragment) {
        this.this$0 = cancelOrderDialogFragment;
    }

    @Override // com.thecoffeehouse.guestapp.views.CustomRadioGroup.OnCheckedChangeListener
    public void onCheckedChanged(CustomRadioGroup customRadioGroup, int i) {
        Button button = (Button) this.this$0._$_findCachedViewById(R.id.btn_cancel_order);
        Intrinsics.checkNotNullExpressionValue(button, "btn_cancel_order");
        button.setEnabled(true);
        Button button2 = (Button) this.this$0._$_findCachedViewById(R.id.btn_cancel_order);
        Intrinsics.checkNotNullExpressionValue(button2, "btn_cancel_order");
        button2.setBackground(ContextCompat.getDrawable(this.this$0.requireContext(), R.drawable.background_cancel_order_enable));
    }
}
