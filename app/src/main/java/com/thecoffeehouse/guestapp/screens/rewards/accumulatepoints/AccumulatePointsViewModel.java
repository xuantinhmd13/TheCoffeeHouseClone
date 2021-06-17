package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetMembershipResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.PromotionDashboardResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\b\u0010\u000b\u001a\u0004\u0018\u00010\f¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getMembership", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetMembershipResponse;", "getPromotionDashboard", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/PromotionDashboardResponse;", "getYourInterestUrl", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AccumulatePointsViewModel.kt */
public final class AccumulatePointsViewModel extends BaseViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AccumulatePointsViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "handle");
    }

    public final LiveData<Resource<PromotionDashboardResponse>> getPromotionDashboard() {
        return getApplication().requireRewardsManager().getPromotionDashboard();
    }

    public final LiveData<Resource<GetMembershipResponse>> getMembership() {
        return getApplication().requireRewardsManager().getMembership();
    }

    public final String getYourInterestUrl() {
        return getApplication().requireClientManager().getYourInterestUrl();
    }
}
