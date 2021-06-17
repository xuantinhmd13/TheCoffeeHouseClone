package com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers;

import com.google.android.material.tabs.TabLayout;
import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/RewardsAndCouponsFragment$initRewardsTabLayout$1", "Lcom/google/android/material/tabs/TabLayout$OnTabSelectedListener;", "onTabReselected", "", "tab", "Lcom/google/android/material/tabs/TabLayout$Tab;", "onTabSelected", "onTabUnselected", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsAndCouponsFragment.kt */
public final class RewardsAndCouponsFragment$initRewardsTabLayout$1 implements TabLayout.OnTabSelectedListener {
    final /* synthetic */ RewardsAndCouponsFragment this$0;

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabReselected(TabLayout.Tab tab) {
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabUnselected(TabLayout.Tab tab) {
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    RewardsAndCouponsFragment$initRewardsTabLayout$1(RewardsAndCouponsFragment rewardsAndCouponsFragment) {
        this.this$0 = rewardsAndCouponsFragment;
    }

    @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
    public void onTabSelected(TabLayout.Tab tab) {
        Integer valueOf = tab != null ? Integer.valueOf(tab.getPosition()) : null;
        int accumulate_tab_position = RewardsAndCouponsFragment.Companion.getACCUMULATE_TAB_POSITION();
        if (valueOf != null && valueOf.intValue() == accumulate_tab_position) {
            RewardsAndCouponsFragment rewardsAndCouponsFragment = this.this$0;
            rewardsAndCouponsFragment.changeActiveFragment(RewardsAndCouponsFragment.access$getMAccumulatePointsFragment$p(rewardsAndCouponsFragment));
            return;
        }
        int reward_tab_position = RewardsAndCouponsFragment.Companion.getREWARD_TAB_POSITION();
        if (valueOf != null && valueOf.intValue() == reward_tab_position) {
            RewardsAndCouponsFragment rewardsAndCouponsFragment2 = this.this$0;
            rewardsAndCouponsFragment2.changeActiveFragment(RewardsAndCouponsFragment.access$getMRewardsFragment$p(rewardsAndCouponsFragment2));
            return;
        }
        int coupon_tab_position = RewardsAndCouponsFragment.Companion.getCOUPON_TAB_POSITION();
        if (valueOf != null && valueOf.intValue() == coupon_tab_position) {
            RewardsAndCouponsFragment rewardsAndCouponsFragment3 = this.this$0;
            rewardsAndCouponsFragment3.changeActiveFragment(RewardsAndCouponsFragment.access$getMCouponsFragment$p(rewardsAndCouponsFragment3));
            TrackingEventService.Companion.updateSourceTrackingEvent(SelectVoucherEvents.EventViewVoucherList.name, "Cart");
        }
    }
}
