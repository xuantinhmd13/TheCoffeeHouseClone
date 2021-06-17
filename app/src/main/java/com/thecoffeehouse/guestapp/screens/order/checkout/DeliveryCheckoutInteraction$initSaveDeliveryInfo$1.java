package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import android.widget.Switch;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: DeliveryCheckoutInteraction.kt */
public final class DeliveryCheckoutInteraction$initSaveDeliveryInfo$1 implements View.OnClickListener {
    final /* synthetic */ DeliveryCheckoutInteraction this$0;

    DeliveryCheckoutInteraction$initSaveDeliveryInfo$1(DeliveryCheckoutInteraction deliveryCheckoutInteraction) {
        this.this$0 = deliveryCheckoutInteraction;
    }

    public final void onClick(View view) {
        View findViewById = DeliveryCheckoutInteraction.access$getMDeliveryCheckoutLayout$p(this.this$0).findViewById(R.id.layout_save_delivery_info);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mDeliveryCheckoutLayout.layout_save_delivery_info");
        ((Switch) findViewById.findViewById(R.id.swt)).performClick();
    }
}
