package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.CheckoutEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CheckoutDialogFragment.kt */
public final class CheckoutDialogFragment$initViewAtTableListenViews$4 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CheckoutDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CheckoutDialogFragment$initViewAtTableListenViews$4(CheckoutDialogFragment checkoutDialogFragment) {
        super(0);
        this.this$0 = checkoutDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        EditText editText;
        TrackingEventService.Companion.updateSourceTrackingEvent(CheckoutEvents.EventRequestCheckout.name, CheckoutEvents.EventRequestCheckout.name);
        TrackingEventService.Companion.triggerSendTrackingEvent(CheckoutEvents.EventRequestCheckout.name);
        this.this$0.checkScrollIfPaymentEmpty();
        View view = this.this$0.inflatedView;
        String valueOf = String.valueOf((view == null || (editText = (EditText) view.findViewById(R.id.edt_bill_note)) == null) ? null : editText.getText());
        GeneralKt.log("bill note pickup: " + valueOf);
        this.this$0.onCreateOrder.invoke(null, valueOf, null);
    }
}
