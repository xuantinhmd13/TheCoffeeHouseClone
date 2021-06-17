package com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardsAndCouponsFragment.kt */
final class RewardsAndCouponsFragment$initViews$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ RewardsAndCouponsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardsAndCouponsFragment$initViews$1(RewardsAndCouponsFragment rewardsAndCouponsFragment) {
        super(0);
        this.this$0 = rewardsAndCouponsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        this.this$0.switchToTab(RewardsAndCouponsFragment.Companion.getREWARD_TAB_POSITION());
    }
}
