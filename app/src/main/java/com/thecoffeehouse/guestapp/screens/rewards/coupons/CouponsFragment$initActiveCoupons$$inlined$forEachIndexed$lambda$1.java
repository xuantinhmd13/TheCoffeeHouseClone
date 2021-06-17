package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.content.Intent;
import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "selectedCoupon", "", "invoke", "com/thecoffeehouse/guestapp/screens/rewards/coupons/CouponsFragment$initActiveCoupons$1$expiredSoon$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponsFragment.kt */
public final class CouponsFragment$initActiveCoupons$$inlined$forEachIndexed$lambda$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ int $index;
    final /* synthetic */ CouponsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponsFragment$initActiveCoupons$$inlined$forEachIndexed$lambda$1(int i, CouponsFragment couponsFragment) {
        super(1);
        this.$index = i;
        this.this$0 = couponsFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke(str);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        Intrinsics.checkNotNullParameter(str, "selectedCoupon");
        Intent intent = new Intent(OrderFragment.INTENT_FILTER_ADD_COUPON);
        intent.setAction(OrderFragment.INTENT_FILTER_ADD_COUPON);
        intent.putExtra(OrderFragment.CAMPAIGN_ID_EXTRA, str);
        intent.putExtra(OrderFragment.OVERRIDE_DIRECTLY_EXTRA, false);
        this.this$0.requireContext().sendBroadcast(intent);
        TrackingEventService.Companion.collectParamWithEventName(SelectVoucherEvents.EventViewVoucherDetail.name, new TrackingData("selectedIndex", Integer.valueOf(this.$index)));
        TrackingEventService.Companion.collectParamWithEventName(SelectVoucherEvents.EventVoucherAppliedSuccessfully.name, new TrackingData("selectedIndex", Integer.valueOf(this.$index)));
        TrackingEventService.Companion.collectParamWithEventName(SelectVoucherEvents.EventVoucherAppliedFailed.name, new TrackingData("selectedIndex", Integer.valueOf(this.$index)));
    }
}
