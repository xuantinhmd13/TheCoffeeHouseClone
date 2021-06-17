package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.RewardsByCategoryDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsFilterResponse;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "resources", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardsByCategoryDialogFragment.kt */
final class RewardsByCategoryDialogFragment$mObserveRewardFilters$1<T> implements Observer<Resource<? extends RewardsFilterResponse>> {
    final /* synthetic */ RewardsByCategoryDialogFragment this$0;

    RewardsByCategoryDialogFragment$mObserveRewardFilters$1(RewardsByCategoryDialogFragment rewardsByCategoryDialogFragment) {
        this.this$0 = rewardsByCategoryDialogFragment;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Resource<? extends RewardsFilterResponse> resource) {
        onChanged((Resource<RewardsFilterResponse>) resource);
    }

    public final void onChanged(Resource<RewardsFilterResponse> resource) {
        List<Reward> rewards;
        if (resource != null) {
            int i = RewardsByCategoryDialogFragment.WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
            if (i == 1) {
                this.this$0.showLoading();
            } else if (i == 2) {
                this.this$0.hideLoading();
                RewardsFilterResponse data = resource.getData();
                if (data != null && (rewards = data.getRewards()) != null) {
                    RewardsByCategoryDialogFragment.access$initRewards(this.this$0, rewards);
                }
            } else if (i == 3) {
                this.this$0.hideLoading();
            }
        }
    }
}
