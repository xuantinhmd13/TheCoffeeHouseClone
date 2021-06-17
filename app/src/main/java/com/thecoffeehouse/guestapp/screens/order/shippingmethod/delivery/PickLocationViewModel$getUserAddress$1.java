package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.UserAddressRequest;
import com.thecoffeehouse.guestapp.services.api.model.common.map.UserAddressResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel$getUserAddress$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationViewModel.kt */
public final class PickLocationViewModel$getUserAddress$1 extends NetworkBoundResource<UserAddressResponse, UserAddressResponse> {
    final /* synthetic */ UserAddressRequest $userAddressRequest;
    final /* synthetic */ PickLocationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationViewModel$getUserAddress$1(PickLocationViewModel pickLocationViewModel, UserAddressRequest userAddressRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = pickLocationViewModel;
        this.$userAddressRequest = userAddressRequest;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<UserAddressResponse>> createCall() {
        return this.this$0.getApplication().requireCommonServiceManager().getCommonApiService().getMapService().getUserAddress(this.$userAddressRequest);
    }
}
