package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import android.widget.CompoundButton;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.CheckoutEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PaymentMethodSelectionDialogFragment.kt */
final class PaymentMethodSelectionDialogFragment$initViews$2 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ PaymentMethodSelectionDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PaymentMethodSelectionDialogFragment$initViews$2(PaymentMethodSelectionDialogFragment paymentMethodSelectionDialogFragment) {
        super(1);
        this.this$0 = paymentMethodSelectionDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        CustomRadioGroup customRadioGroup;
        CompoundButton checkedItem;
        CustomRadioGroup customRadioGroup2;
        CompoundButton checkedItem2;
        StringBuilder append = new StringBuilder().append("onDimiss: ");
        ArrayList arrayList = this.this$0.mAllPaymentMethods;
        View view = this.this$0.getRootView();
        Integer num = null;
        Integer valueOf = (view == null || (customRadioGroup2 = (CustomRadioGroup) view.findViewById(R.id.rdg_payment_method)) == null || (checkedItem2 = customRadioGroup2.getCheckedItem()) == null) ? null : Integer.valueOf(checkedItem2.getId());
        Intrinsics.checkNotNull(valueOf);
        GeneralKt.log(append.append(String.valueOf(((Payment) arrayList.get(valueOf.intValue())).getText())).toString());
        ArrayList arrayList2 = this.this$0.mAllPaymentMethods;
        View view2 = this.this$0.getRootView();
        if (!(view2 == null || (customRadioGroup = (CustomRadioGroup) view2.findViewById(R.id.rdg_payment_method)) == null || (checkedItem = customRadioGroup.getCheckedItem()) == null)) {
            num = Integer.valueOf(checkedItem.getId());
        }
        Intrinsics.checkNotNull(num);
        Object obj = arrayList2.get(num.intValue());
        Intrinsics.checkNotNullExpressionValue(obj, "mAllPaymentMethods[rootV…ethod?.checkedItem?.id!!]");
        TrackingEventService.Companion.triggerSendTrackingEvent(CheckoutEvents.EventPaymentMethodChangedSuccessfully.name);
        this.this$0.onPaymentSelect.invoke((Payment) obj);
        this.this$0.dismiss();
    }
}
