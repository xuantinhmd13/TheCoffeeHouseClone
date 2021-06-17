package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.content.Intent;
import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: AddCouponDialogFragment.kt */
final class AddCouponDialogFragment$initViews$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ AddCouponDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AddCouponDialogFragment$initViews$2(AddCouponDialogFragment addCouponDialogFragment) {
        super(1);
        this.this$0 = addCouponDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        Intent intent = new Intent(OrderFragment.INTENT_FILTER_ADD_COUPON);
        intent.setAction(OrderFragment.INTENT_FILTER_ADD_COUPON);
        EditText editText = (EditText) this.this$0._$_findCachedViewById(R.id.edt_coupon_code);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_coupon_code");
        intent.putExtra(OrderFragment.COUPON_CODE_EXTRA, editText.getText().toString());
        intent.putExtra(OrderFragment.OVERRIDE_DIRECTLY_EXTRA, true);
        this.this$0.requireContext().sendBroadcast(intent);
        TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventApplyAVoucher.name, "Manual");
        TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventVoucherAppliedSuccessfully.name, "Manual");
        TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventVoucherAppliedFailed.name, "Manual");
    }
}
