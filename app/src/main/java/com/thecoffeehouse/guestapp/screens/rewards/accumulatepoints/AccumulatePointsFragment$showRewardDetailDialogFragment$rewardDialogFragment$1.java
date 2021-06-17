package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetMembershipResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.Profile;
import com.thecoffeehouse.guestapp.services.api.model.rewards.PromotionDashboardResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "redeemPrice", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: AccumulatePointsFragment.kt */
final class AccumulatePointsFragment$showRewardDetailDialogFragment$rewardDialogFragment$1 extends Lambda implements Function1<Integer, Unit> {
    final /* synthetic */ AccumulatePointsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AccumulatePointsFragment$showRewardDetailDialogFragment$rewardDialogFragment$1(AccumulatePointsFragment accumulatePointsFragment) {
        super(1);
        this.this$0 = accumulatePointsFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(int i) {
        Profile profile;
        Profile profile2;
        Integer bean;
        GetMembershipResponse access$getMMembershipResponse$p = AccumulatePointsFragment.access$getMMembershipResponse$p(this.this$0);
        if (!(access$getMMembershipResponse$p == null || (profile = access$getMMembershipResponse$p.getProfile()) == null)) {
            GetMembershipResponse access$getMMembershipResponse$p2 = AccumulatePointsFragment.access$getMMembershipResponse$p(this.this$0);
            profile.setBean((access$getMMembershipResponse$p2 == null || (profile2 = access$getMMembershipResponse$p2.getProfile()) == null || (bean = profile2.getBean()) == null) ? null : Integer.valueOf(bean.intValue() - i));
        }
        AccumulatePointsFragment.access$updatePointMembership(this.this$0);
        LiveData<Resource<PromotionDashboardResponse>> promotionDashboard = ((AccumulatePointsViewModel) this.this$0.getViewModel()).getPromotionDashboard();
        AccumulatePointsFragment accumulatePointsFragment = this.this$0;
        promotionDashboard.observe(accumulatePointsFragment, AccumulatePointsFragment.access$getMObserveMergeCouponReward$p(accumulatePointsFragment));
    }
}
