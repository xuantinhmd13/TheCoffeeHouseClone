package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.thecoffeehouse.guestapp.repositories.CacheRequestUtils;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.repositories.data.AbsentLiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.ActiveCouponsResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CampaignGroup;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CouponDetailRequest;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CouponDetailResponse;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\nH\u0014J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"com/thecoffeehouse/guestapp/OrderManager$getExistedCouponDetail$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponDetailResponse;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "loadFromDb", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
public final class OrderManager$getExistedCouponDetail$1 extends NetworkBoundResource<CouponDetailResponse, CouponDetailResponse> {
    final /* synthetic */ CouponDetailRequest $couponDetailRequest;
    final /* synthetic */ String $couponId;
    private Class<CouponDetailResponse> cachedResponseClass = CouponDetailResponse.class;
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$getExistedCouponDetail$1(OrderManager orderManager, String str, CouponDetailRequest couponDetailRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = orderManager;
        this.$couponId = str;
        this.$couponDetailRequest = couponDetailRequest;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public Class<CouponDetailResponse> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public void setCachedResponseClass(Class<CouponDetailResponse> cls) {
        this.cachedResponseClass = cls;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r2v8, resolved type: java.lang.Object */
    /* JADX WARN: Multi-variable type inference failed */
    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<CouponDetailResponse> loadFromDb() {
        List<CampaignGroup> results;
        String name = ActiveCouponsResponse.class.getName();
        Intrinsics.checkNotNullExpressionValue(name, "clazz.name");
        ActiveCouponsResponse activeCouponsResponse = (ActiveCouponsResponse) CacheRequestUtils.INSTANCE.getCacheResponse(OrderManager.access$getApplication$p(this.this$0), name, ActiveCouponsResponse.class);
        Campaign campaign = null;
        if (!(activeCouponsResponse == null || (results = activeCouponsResponse.getResults()) == null)) {
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = results.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList, it.next().getCampaigns());
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                List<Coupon> coupons = ((Campaign) next).getCoupons();
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(coupons, 10));
                Iterator<T> it3 = coupons.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().getBarcode());
                }
                if (arrayList2.contains(this.$couponId)) {
                    campaign = next;
                    break;
                }
            }
            campaign = campaign;
        }
        if (campaign == null) {
            return AbsentLiveData.Companion.create();
        }
        CouponDetailResponse couponDetailResponse = new CouponDetailResponse();
        couponDetailResponse.setResult(campaign);
        return new MutableLiveData(couponDetailResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<CouponDetailResponse>> createCall() {
        return OrderManager.access$getApplication$p(this.this$0).requireRewardsManager().getRewardsAPIService().getCouponDetail(this.$couponDetailRequest);
    }
}
