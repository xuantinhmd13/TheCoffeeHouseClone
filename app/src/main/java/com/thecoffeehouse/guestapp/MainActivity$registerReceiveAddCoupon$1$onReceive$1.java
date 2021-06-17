package com.thecoffeehouse.guestapp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
final class MainActivity$registerReceiveAddCoupon$1$onReceive$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $campaignId;
    final /* synthetic */ String $coupon;
    final /* synthetic */ boolean $overrideDirectly;
    final /* synthetic */ MainActivity$registerReceiveAddCoupon$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$registerReceiveAddCoupon$1$onReceive$1(MainActivity$registerReceiveAddCoupon$1 mainActivity$registerReceiveAddCoupon$1, boolean z, String str, String str2) {
        super(0);
        this.this$0 = mainActivity$registerReceiveAddCoupon$1;
        this.$overrideDirectly = z;
        this.$coupon = str;
        this.$campaignId = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        if (this.$overrideDirectly) {
            OrderFragment mOrderFragment = this.this$0.this$0.getMOrderFragment();
            String str = this.$coupon;
            Intrinsics.checkNotNullExpressionValue(str, FirebaseAnalytics.Param.COUPON);
            mOrderFragment.updateCouponToOrderFlow(str);
            return;
        }
        this.this$0.this$0.getMOrderFragment().showCouponDetailDialog(this.$campaignId, this.$coupon);
    }
}
