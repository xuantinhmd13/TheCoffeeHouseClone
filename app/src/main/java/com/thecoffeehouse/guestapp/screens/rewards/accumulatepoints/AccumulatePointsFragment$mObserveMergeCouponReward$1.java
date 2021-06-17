package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import com.thecoffeehouse.guestapp.services.api.model.rewards.PromotionDashboardResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Result;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/PromotionDashboardResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: AccumulatePointsFragment.kt */
final class AccumulatePointsFragment$mObserveMergeCouponReward$1 extends Lambda implements Function1<PromotionDashboardResponse, Unit> {
    final /* synthetic */ AccumulatePointsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AccumulatePointsFragment$mObserveMergeCouponReward$1(AccumulatePointsFragment accumulatePointsFragment) {
        super(1);
        this.this$0 = accumulatePointsFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PromotionDashboardResponse promotionDashboardResponse) {
        invoke(promotionDashboardResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(PromotionDashboardResponse promotionDashboardResponse) {
        Intrinsics.checkNotNullParameter(promotionDashboardResponse, "it");
        AccumulatePointsFragment accumulatePointsFragment = this.this$0;
        Result result = promotionDashboardResponse.getResult();
        List<Reward> list = null;
        AccumulatePointsFragment.access$initReadyToUseCoupons(accumulatePointsFragment, result != null ? result.getCampaigns() : null);
        AccumulatePointsFragment accumulatePointsFragment2 = this.this$0;
        Result result2 = promotionDashboardResponse.getResult();
        if (result2 != null) {
            list = result2.getRewards();
        }
        AccumulatePointsFragment.access$initOtherRewards(accumulatePointsFragment2, list);
    }
}
