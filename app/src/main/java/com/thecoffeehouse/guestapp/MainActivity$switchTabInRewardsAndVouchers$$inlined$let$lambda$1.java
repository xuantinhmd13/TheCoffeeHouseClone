package com.thecoffeehouse.guestapp;

import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/thecoffeehouse/guestapp/MainActivity$switchTabInRewardsAndVouchers$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$switchTabInRewardsAndVouchers$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ String $rewardId$inlined;
    final /* synthetic */ MainActivity this$0;

    MainActivity$switchTabInRewardsAndVouchers$$inlined$let$lambda$1(MainActivity mainActivity, String str) {
        this.this$0 = mainActivity;
        this.$rewardId$inlined = str;
    }

    public final void run() {
        this.this$0.getMRewardsAndCouponsFragment().openRewardDetail(this.$rewardId$inlined);
    }
}
