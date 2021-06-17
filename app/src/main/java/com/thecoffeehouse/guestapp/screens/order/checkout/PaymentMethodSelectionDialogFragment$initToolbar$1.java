package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import android.widget.CompoundButton;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.CheckoutEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PaymentMethodSelectionDialogFragment.kt */
public final class PaymentMethodSelectionDialogFragment$initToolbar$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ PaymentMethodSelectionDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaymentMethodSelectionDialogFragment$initToolbar$1(PaymentMethodSelectionDialogFragment paymentMethodSelectionDialogFragment) {
        super(1);
        this.this$0 = paymentMethodSelectionDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        CustomRadioGroup customRadioGroup;
        CompoundButton checkedItem;
        Intrinsics.checkNotNullParameter(view, "it");
        ArrayList arrayList = this.this$0.mPaymentMethods;
        View view2 = this.this$0.getRootView();
        String str = null;
        Integer valueOf = (view2 == null || (customRadioGroup = (CustomRadioGroup) view2.findViewById(R.id.rdg_payment_method)) == null || (checkedItem = customRadioGroup.getCheckedItem()) == null) ? null : Integer.valueOf(checkedItem.getId());
        Intrinsics.checkNotNull(valueOf);
        Object obj = arrayList.get(valueOf.intValue());
        Intrinsics.checkNotNullExpressionValue(obj, "mPaymentMethods[rootView…ethod?.checkedItem?.id!!]");
        Payment payment = (Payment) obj;
        TrackingEventService.Companion.updateSourceTrackingEvent(CheckoutEvents.EventPaymentMethodChangedSuccessfully.name, "Checkout");
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[2];
        Payment payment2 = this.this$0.defaultPayment;
        if (payment2 != null) {
            str = payment2.getMethod();
        }
        trackingDataArr[0] = new TrackingData(CheckoutEvents.EventPaymentMethodChangedSuccessfully.Param.oldPaymentMethod, str);
        trackingDataArr[1] = new TrackingData(CheckoutEvents.EventPaymentMethodChangedSuccessfully.Param.newPaymentMethod, payment.getMethod());
        companion.collectParamWithEventName(CheckoutEvents.EventPaymentMethodChangedSuccessfully.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(CheckoutEvents.EventPaymentMethodChangedSuccessfully.name);
        this.this$0.dismiss();
    }
}
