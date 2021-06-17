package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryRequest;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetMembershipResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.MembershipAPI;
import com.thecoffeehouse.guestapp.services.api.model.rewards.ActiveCouponsResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.ActiveCouponsResquest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Category;
import com.thecoffeehouse.guestapp.services.api.model.rewards.GetCategoriesResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.GetRewardDashboard;
import com.thecoffeehouse.guestapp.services.api.model.rewards.PromotionDashboardResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RedeemRewardRequest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RedeemRewardResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailRequest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsAPI;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsFilterRequest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsFilterResponse;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001c\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00190\u00180\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u001bJ\"\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00180\u00172\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001fJ\u0012\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00180\u0017J\u0012\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00180\u0017J\u0012\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00180\u0017J\u0012\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020(0\u00180\u0017J\u001a\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00180\u00172\u0006\u0010+\u001a\u00020,J\u001c\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00180\u00172\b\u0010/\u001a\u0004\u0018\u000100J\u001a\u00101\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002020\u00180\u00172\u0006\u00103\u001a\u00020,R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8FX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128FX\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0013\u0010\u0014¨\u00064"}, d2 = {"Lcom/thecoffeehouse/guestapp/RewardsManager;", "", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "(Lcom/thecoffeehouse/guestapp/TCHApplication;)V", "appExecutors", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "getAppExecutors", "()Lcom/thecoffeehouse/guestapp/AppExecutors;", "appExecutors$delegate", "Lkotlin/properties/ReadOnlyProperty;", "membershipAPIService", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/MembershipAPI;", "getMembershipAPIService", "()Lcom/thecoffeehouse/guestapp/services/api/model/membership/MembershipAPI;", "membershipAPIService$delegate", "Lkotlin/Lazy;", "rewardsAPIService", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsAPI;", "getRewardsAPIService", "()Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsAPI;", "rewardsAPIService$delegate", "getAllActiveCoupons", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/ActiveCouponsResponse;", "forOrderOnly", "", "getBeanHistory", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetBeanHistoryResponse;", "page", "", "limit", "getCategories", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetCategoriesResponse;", "getMembership", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetMembershipResponse;", "getPromotionDashboard", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/PromotionDashboardResponse;", "getRewardDashboard", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetRewardDashboard;", "getRewardDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "rewardId", "", "getRewardFilters", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterResponse;", MonitorLogServerProtocol.PARAM_CATEGORY, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", "redeemReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RedeemRewardResponse;", "id", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsManager.kt */
public final class RewardsManager {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(RewardsManager.class, "appExecutors", "getAppExecutors()Lcom/thecoffeehouse/guestapp/AppExecutors;", 0))};
    private final ReadOnlyProperty appExecutors$delegate = new RewardsManager$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private final TCHApplication application;
    private final Lazy membershipAPIService$delegate = LazyKt.lazy(RewardsManager$membershipAPIService$2.INSTANCE);
    private final Lazy rewardsAPIService$delegate = LazyKt.lazy(RewardsManager$rewardsAPIService$2.INSTANCE);

    private final AppExecutors getAppExecutors() {
        return (AppExecutors) this.appExecutors$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final MembershipAPI getMembershipAPIService() {
        return (MembershipAPI) this.membershipAPIService$delegate.getValue();
    }

    public final RewardsAPI getRewardsAPIService() {
        return (RewardsAPI) this.rewardsAPIService$delegate.getValue();
    }

    public RewardsManager(TCHApplication tCHApplication) {
        Intrinsics.checkNotNullParameter(tCHApplication, "application");
        this.application = tCHApplication;
    }

    public static /* synthetic */ LiveData getAllActiveCoupons$default(RewardsManager rewardsManager, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return rewardsManager.getAllActiveCoupons(z);
    }

    public final LiveData<Resource<ActiveCouponsResponse>> getAllActiveCoupons(boolean z) {
        ActiveCouponsResquest activeCouponsResquest = new ActiveCouponsResquest();
        activeCouponsResquest.setLimitOrder(Boolean.valueOf(z));
        return new RewardsManager$getAllActiveCoupons$1(this, activeCouponsResquest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<PromotionDashboardResponse>> getPromotionDashboard() {
        return new RewardsManager$getPromotionDashboard$1(this, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetMembershipResponse>> getMembership() {
        return new RewardsManager$getMembership$1(this, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetCategoriesResponse>> getCategories() {
        return new RewardsManager$getCategories$1(this, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetRewardDashboard>> getRewardDashboard() {
        return new RewardsManager$getRewardDashboard$1(this, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<RewardsFilterResponse>> getRewardFilters(Category category) {
        RewardsFilterRequest rewardsFilterRequest = new RewardsFilterRequest();
        if (category != null) {
            rewardsFilterRequest.setCatgId(category.getId());
        }
        return new RewardsManager$getRewardFilters$1(this, rewardsFilterRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<RewardDetailResponse>> getRewardDetail(String str) {
        Intrinsics.checkNotNullParameter(str, "rewardId");
        RewardDetailRequest rewardDetailRequest = new RewardDetailRequest();
        rewardDetailRequest.setId(str);
        return new RewardsManager$getRewardDetail$1(this, rewardDetailRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<RedeemRewardResponse>> redeemReward(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        RedeemRewardRequest redeemRewardRequest = new RedeemRewardRequest();
        redeemRewardRequest.setId(str);
        return new RewardsManager$redeemReward$1(this, redeemRewardRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetBeanHistoryResponse>> getBeanHistory(int i, int i2) {
        GetBeanHistoryRequest getBeanHistoryRequest = new GetBeanHistoryRequest();
        getBeanHistoryRequest.setPage(i);
        getBeanHistoryRequest.setLimit(i2);
        return new RewardsManager$getBeanHistory$1(this, getBeanHistoryRequest, getAppExecutors()).asLiveData();
    }
}
