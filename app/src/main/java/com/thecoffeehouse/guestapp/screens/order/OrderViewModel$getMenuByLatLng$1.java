package com.thecoffeehouse.guestapp.screens.order;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetMenuByLatLngResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderAPI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\fH\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/OrderViewModel$getMenuByLatLng$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetMenuByLatLngResponse;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "convertRequestToResult", "newData", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderViewModel.kt */
public final class OrderViewModel$getMenuByLatLng$1 extends NetworkBoundResource<GetMenuByLatLngResponse, GetMenuByLatLngResponse> {
    final /* synthetic */ double $lat;
    final /* synthetic */ double $lng;
    final /* synthetic */ String $shippingType;
    final /* synthetic */ Integer $storeId;
    private Class<GetMenuByLatLngResponse> cachedResponseClass = GetMenuByLatLngResponse.class;
    final /* synthetic */ OrderViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderViewModel$getMenuByLatLng$1(OrderViewModel orderViewModel, double d, double d2, String str, Integer num, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = orderViewModel;
        this.$lat = d;
        this.$lng = d2;
        this.$shippingType = str;
        this.$storeId = num;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public Class<GetMenuByLatLngResponse> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public void setCachedResponseClass(Class<GetMenuByLatLngResponse> cls) {
        this.cachedResponseClass = cls;
    }

    /* access modifiers changed from: protected */
    public GetMenuByLatLngResponse convertRequestToResult(GetMenuByLatLngResponse getMenuByLatLngResponse) {
        Intrinsics.checkNotNullParameter(getMenuByLatLngResponse, "newData");
        for (T t : getMenuByLatLngResponse.getMenus()) {
            for (T t2 : t.getProducts()) {
                t2.setCategoryId(Integer.valueOf(t.getId()));
                String name = t.getName();
                if (name == null) {
                    name = "";
                }
                t2.setCategoryName(name);
            }
        }
        return (GetMenuByLatLngResponse) super.convertRequestToResult((Object) getMenuByLatLngResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<GetMenuByLatLngResponse>> createCall() {
        OrderAPI orderAPIService = this.this$0.getApplication().requireOrderManager().getOrderAPIService();
        double d = this.$lat;
        double d2 = this.$lng;
        String str = this.$shippingType;
        Integer num = this.$storeId;
        Profile userProfile = this.this$0.getApplication().requireClientManager().getUserProfile();
        return orderAPIService.getMenuByLatLng(d, d2, str, num, userProfile != null ? userProfile.getFirstName() : null);
    }
}
