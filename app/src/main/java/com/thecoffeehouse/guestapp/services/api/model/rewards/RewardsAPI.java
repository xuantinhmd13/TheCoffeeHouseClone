package com.thecoffeehouse.guestapp.services.api.model.rewards;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u0014\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u0003H'J\u001e\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\rH'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00040\u00032\b\b\u0001\u0010\u0010\u001a\u00020\u0011H'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00040\u0003H'J\u0014\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00040\u0003H'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0019H'J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u001cH'¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsAPI;", "", "getActiveCoupons", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/ActiveCouponsResponse;", "activeCouponRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/ActiveCouponsResquest;", "getCategories", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetCategoriesResponse;", "getCouponDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponDetailResponse;", "couponDetailRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponDetailRequest;", "getFilterRewards", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterResponse;", "rewardsFilterRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterRequest;", "getPromotionDashboard", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/PromotionDashboardResponse;", "getRewardDashboard", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetRewardDashboard;", "getRewardDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "rewardDetailRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailRequest;", "redeemReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RedeemRewardResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RedeemRewardRequest;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsAPI.kt */
public interface RewardsAPI {
    @POST("coupon/dashboard")
    LiveData<ApiResponse<ActiveCouponsResponse>> getActiveCoupons(@Body ActiveCouponsResquest activeCouponsResquest);

    @POST("rewards/categories")
    LiveData<ApiResponse<GetCategoriesResponse>> getCategories();

    @POST("coupon/info")
    LiveData<ApiResponse<CouponDetailResponse>> getCouponDetail(@Body CouponDetailRequest couponDetailRequest);

    @POST("rewards/filters")
    LiveData<ApiResponse<RewardsFilterResponse>> getFilterRewards(@Body RewardsFilterRequest rewardsFilterRequest);

    @POST("promotion/dashboard")
    LiveData<ApiResponse<PromotionDashboardResponse>> getPromotionDashboard();

    @POST("rewards/dashboard")
    LiveData<ApiResponse<GetRewardDashboard>> getRewardDashboard();

    @POST("rewards/detail")
    LiveData<ApiResponse<RewardDetailResponse>> getRewardDetail(@Body RewardDetailRequest rewardDetailRequest);

    @POST("rewards/redeem")
    LiveData<ApiResponse<RedeemRewardResponse>> redeemReward(@Body RedeemRewardRequest redeemRewardRequest);
}
