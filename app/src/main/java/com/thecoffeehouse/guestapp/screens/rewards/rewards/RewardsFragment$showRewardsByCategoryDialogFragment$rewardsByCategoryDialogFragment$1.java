package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "reward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardsFragment.kt */
final class RewardsFragment$showRewardsByCategoryDialogFragment$rewardsByCategoryDialogFragment$1 extends Lambda implements Function1<Reward, Unit> {
    final /* synthetic */ RewardsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardsFragment$showRewardsByCategoryDialogFragment$rewardsByCategoryDialogFragment$1(RewardsFragment rewardsFragment) {
        super(1);
        this.this$0 = rewardsFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Reward reward) {
        invoke(reward);
        return Unit.INSTANCE;
    }

    public final void invoke(Reward reward) {
        Intrinsics.checkNotNullParameter(reward, "reward");
        if (reward.getId() != null) {
            RewardsFragment.access$showRewardDetailDialogFragment(this.this$0, reward.getId());
        }
    }
}
