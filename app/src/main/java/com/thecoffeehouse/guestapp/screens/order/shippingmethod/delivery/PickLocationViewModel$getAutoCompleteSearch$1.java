package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AutoCompleteAddressResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel$getAutoCompleteSearch$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AutoCompleteAddressResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationViewModel.kt */
public final class PickLocationViewModel$getAutoCompleteSearch$1 extends NetworkBoundResource<AutoCompleteAddressResponse, AutoCompleteAddressResponse> {
    final /* synthetic */ Double $lat;
    final /* synthetic */ Double $lng;
    final /* synthetic */ String $newText;
    final /* synthetic */ String $sessionToken;
    final /* synthetic */ PickLocationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationViewModel$getAutoCompleteSearch$1(PickLocationViewModel pickLocationViewModel, String str, Double d, Double d2, String str2, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = pickLocationViewModel;
        this.$newText = str;
        this.$lat = d;
        this.$lng = d2;
        this.$sessionToken = str2;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<AutoCompleteAddressResponse>> createCall() {
        return this.this$0.getApplication().requireCommonServiceManager().getCommonApiService().getMapService().autoCompleteSearch(this.$newText, this.$lat, this.$lng, this.$sessionToken);
    }
}
