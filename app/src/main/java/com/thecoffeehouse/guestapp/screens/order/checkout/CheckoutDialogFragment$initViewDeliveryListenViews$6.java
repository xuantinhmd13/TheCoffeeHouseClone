package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.CheckoutEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CheckoutDialogFragment.kt */
public final class CheckoutDialogFragment$initViewDeliveryListenViews$6 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CheckoutDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckoutDialogFragment$initViewDeliveryListenViews$6(CheckoutDialogFragment checkoutDialogFragment) {
        super(0);
        this.this$0 = checkoutDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        View findViewById;
        Switch r3;
        EditText editText;
        EditText editText2;
        TrackingEventService.Companion.updateSourceTrackingEvent(CheckoutEvents.EventRequestCheckout.name, CheckoutEvents.EventRequestCheckout.name);
        TrackingEventService.Companion.triggerSendTrackingEvent(CheckoutEvents.EventRequestCheckout.name);
        this.this$0.checkScrollIfPaymentEmpty();
        View view = this.this$0.inflatedView;
        Boolean bool = null;
        String valueOf = String.valueOf((view == null || (editText2 = (EditText) view.findViewById(R.id.edt_shipping_note)) == null) ? null : editText2.getText());
        Objects.requireNonNull(valueOf, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj = StringsKt.trim((CharSequence) valueOf).toString();
        View view2 = this.this$0.inflatedView;
        String valueOf2 = String.valueOf((view2 == null || (editText = (EditText) view2.findViewById(R.id.edt_bill_note)) == null) ? null : editText.getText());
        Objects.requireNonNull(valueOf2, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = StringsKt.trim((CharSequence) valueOf2).toString();
        GeneralKt.log("billNote delivery: " + obj2);
        View view3 = this.this$0.inflatedView;
        if (!(view3 == null || (findViewById = view3.findViewById(R.id.layout_save_delivery_info)) == null || (r3 = (Switch) findViewById.findViewById(R.id.swt)) == null)) {
            bool = Boolean.valueOf(r3.isChecked());
        }
        this.this$0.onCreateOrder.invoke(obj, obj2, bool);
    }
}
