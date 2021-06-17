package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import androidx.core.widget.NestedScrollView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: CheckoutDialogFragment.kt */
public final class CheckoutDialogFragment$checkScrollIfPaymentEmpty$1 implements Runnable {
    final /* synthetic */ CheckoutDialogFragment this$0;

    CheckoutDialogFragment$checkScrollIfPaymentEmpty$1(CheckoutDialogFragment checkoutDialogFragment) {
        this.this$0 = checkoutDialogFragment;
    }

    public final void run() {
        NestedScrollView nestedScrollView;
        View view = this.this$0.getRootView();
        if (view != null && (nestedScrollView = (NestedScrollView) view.findViewById(R.id.layout_checkout)) != null) {
            nestedScrollView.fullScroll(130);
        }
    }
}
