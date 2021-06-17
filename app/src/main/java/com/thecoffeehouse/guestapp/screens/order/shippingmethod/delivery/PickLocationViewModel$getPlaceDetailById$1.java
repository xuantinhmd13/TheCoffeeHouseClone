package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0014J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00070\u0006H\u0014¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel$getPlaceDetailById$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestionResponse;", "convertRequestToResult", "newData", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationViewModel.kt */
public final class PickLocationViewModel$getPlaceDetailById$1 extends NetworkBoundResource<AddressSuggestionResponse, AddressSuggestionResponse> {
    final /* synthetic */ String $fixedAddress;
    final /* synthetic */ Double $lat;
    final /* synthetic */ Double $lng;
    final /* synthetic */ String $placeId;
    final /* synthetic */ String $sessionToken;
    final /* synthetic */ PickLocationViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationViewModel$getPlaceDetailById$1(PickLocationViewModel pickLocationViewModel, Double d, Double d2, String str, String str2, String str3, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = pickLocationViewModel;
        this.$lat = d;
        this.$lng = d2;
        this.$placeId = str;
        this.$fixedAddress = str2;
        this.$sessionToken = str3;
    }

    /* access modifiers changed from: protected */
    public AddressSuggestionResponse convertRequestToResult(AddressSuggestionResponse addressSuggestionResponse) {
        AddressSuggestion address;
        AddressSuggestion address2;
        Intrinsics.checkNotNullParameter(addressSuggestionResponse, "newData");
        AddressSuggestion address3 = addressSuggestionResponse.getAddress();
        Phone phone = null;
        String name = address3 != null ? address3.getName() : null;
        if ((name == null || name.length() == 0) && (address2 = addressSuggestionResponse.getAddress()) != null) {
            Profile userProfile = this.this$0.getApplication().requireClientManager().getUserProfile();
            address2.setName(userProfile != null ? userProfile.getFullName() : null);
        }
        AddressSuggestion address4 = addressSuggestionResponse.getAddress();
        if ((address4 != null ? address4.getPhone() : null) == null && (address = addressSuggestionResponse.getAddress()) != null) {
            Profile userProfile2 = this.this$0.getApplication().requireClientManager().getUserProfile();
            if (userProfile2 != null) {
                phone = userProfile2.getPhone();
            }
            address.setPhone(phone);
        }
        return (AddressSuggestionResponse) super.convertRequestToResult((Object) addressSuggestionResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<AddressSuggestionResponse>> createCall() {
        return this.this$0.getApplication().requireCommonServiceManager().getCommonApiService().getMapService().getPlaceDetailById(this.$lat, this.$lng, this.$placeId, this.$fixedAddress, this.$sessionToken);
    }
}
