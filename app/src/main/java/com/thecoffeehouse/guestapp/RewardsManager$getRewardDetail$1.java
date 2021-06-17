package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailRequest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/RewardsManager$getRewardDetail$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsManager.kt */
public final class RewardsManager$getRewardDetail$1 extends NetworkBoundResource<RewardDetailResponse, RewardDetailResponse> {
    final /* synthetic */ RewardDetailRequest $rewardDetailRequest;
    final /* synthetic */ RewardsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardsManager$getRewardDetail$1(RewardsManager rewardsManager, RewardDetailRequest rewardDetailRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = rewardsManager;
        this.$rewardDetailRequest = rewardDetailRequest;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<RewardDetailResponse>> createCall() {
        return this.this$0.getRewardsAPIService().getRewardDetail(this.$rewardDetailRequest);
    }
}
