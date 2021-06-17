package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Category;
import com.thecoffeehouse.guestapp.services.api.model.rewards.GetCategoriesResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.GetRewardDashboard;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RedeemRewardResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsFilterResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J&\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00070\u0006J\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u0006J\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00070\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00070\u00062\u0006\u0010\u001a\u001a\u00020\u0013¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getBeanHistory", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetBeanHistoryResponse;", "page", "", "limit", "getCategories", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetCategoriesResponse;", "getRewardDashboard", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetRewardDashboard;", "getRewardDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "rewardId", "", "getRewardFilters", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterResponse;", MonitorLogServerProtocol.PARAM_CATEGORY, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", "redeemReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RedeemRewardResponse;", "id", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsViewModel.kt */
public final class RewardsViewModel extends BaseViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RewardsViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "handle");
    }

    public final LiveData<Resource<GetCategoriesResponse>> getCategories() {
        return getApplication().requireRewardsManager().getCategories();
    }

    public final LiveData<Resource<GetRewardDashboard>> getRewardDashboard() {
        return getApplication().requireRewardsManager().getRewardDashboard();
    }

    public static /* synthetic */ LiveData getRewardFilters$default(RewardsViewModel rewardsViewModel, Category category, int i, Object obj) {
        if ((i & 1) != 0) {
            category = null;
        }
        return rewardsViewModel.getRewardFilters(category);
    }

    public final LiveData<Resource<RewardsFilterResponse>> getRewardFilters(Category category) {
        return getApplication().requireRewardsManager().getRewardFilters(category);
    }

    public final LiveData<Resource<RewardDetailResponse>> getRewardDetail(String str) {
        Intrinsics.checkNotNullParameter(str, "rewardId");
        return getApplication().requireRewardsManager().getRewardDetail(str);
    }

    public final LiveData<Resource<RedeemRewardResponse>> redeemReward(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return getApplication().requireRewardsManager().redeemReward(str);
    }

    public static /* synthetic */ LiveData getBeanHistory$default(RewardsViewModel rewardsViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        return rewardsViewModel.getBeanHistory(i, i2);
    }

    public final LiveData<Resource<GetBeanHistoryResponse>> getBeanHistory(int i, int i2) {
        return getApplication().requireRewardsManager().getBeanHistory(i, i2);
    }
}
