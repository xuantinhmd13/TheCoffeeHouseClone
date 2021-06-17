package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "rewardSelected", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "invoke", "com/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsByCategoryDialogFragment$initRewards$1$rowItemRowFeatureRewards$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardsByCategoryDialogFragment.kt */
final class RewardsByCategoryDialogFragment$initRewards$$inlined$forEachIndexed$lambda$1 extends Lambda implements Function1<Reward, Unit> {
    final /* synthetic */ List $otherRewards$inlined;
    final /* synthetic */ RewardsByCategoryDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardsByCategoryDialogFragment$initRewards$$inlined$forEachIndexed$lambda$1(RewardsByCategoryDialogFragment rewardsByCategoryDialogFragment, List list) {
        super(1);
        this.this$0 = rewardsByCategoryDialogFragment;
        this.$otherRewards$inlined = list;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Reward reward) {
        invoke(reward);
        return Unit.INSTANCE;
    }

    public final void invoke(Reward reward) {
        Intrinsics.checkNotNullParameter(reward, "rewardSelected");
        RewardsByCategoryDialogFragment.access$getOnShowRewardDetail$p(this.this$0).invoke(reward);
    }
}
