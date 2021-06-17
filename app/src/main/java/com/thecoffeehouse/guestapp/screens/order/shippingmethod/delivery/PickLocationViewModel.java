package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AutoCompleteAddressResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.DeleteUserAddressRequest;
import com.thecoffeehouse.guestapp.services.api.model.common.map.GetPlaceDescriptionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.PlaceAutoSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.ReverseGeoCodingResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.UserAddressRequest;
import com.thecoffeehouse.guestapp.services.api.model.common.map.UserAddressResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nJ\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fJG\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u00070\u00062\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0015J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u00070\u00062\u0006\u0010\u0018\u001a\u00020\nJK\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0018\u001a\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\n¢\u0006\u0002\u0010\u001cJ\u0016\u0010\u001d\u001a\u0012\u0012\u0004\u0012\u00020\u001f0\u001ej\b\u0012\u0004\u0012\u00020\u001f` J\u001a\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00070\u00062\u0006\u0010#\u001a\u00020$J\u001c\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00070\u00062\b\u0010'\u001a\u0004\u0018\u00010(J\u0016\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\nJ\u001a\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\nJ\u001e\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00070\u00062\n\b\u0002\u00100\u001a\u0004\u0018\u000101J\u001a\u00102\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u00103\u001a\u00020\f¨\u00064"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "deleteUserAddress", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "id", "", "fillUserInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "selectedAddress", "getAutoCompleteSearch", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AutoCompleteAddressResponse;", "newText", "lat", "", "lng", "sessionToken", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getPlaceDescription", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetPlaceDescriptionResponse;", "placeId", "getPlaceDetailById", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestionResponse;", "fixedAddress", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getRecentSearchAddresses", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "Lkotlin/collections/ArrayList;", "getUserAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressResponse;", "isHaveRecent", "", "reverseGeoCoding", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/ReverseGeoCodingResponse;", "target", "Lcom/google/android/gms/maps/model/LatLng;", "saveLocation", "", "latLng", "streetName", "searchPlaces", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlaceAutoSuggestionResponse;", "suggestAddress", "locationStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "upsertUserAddress", "addressSuggestion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationViewModel.kt */
public final class PickLocationViewModel extends BaseViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PickLocationViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final LiveData<Resource<PlaceAutoSuggestionResponse>> searchPlaces(String str) {
        Intrinsics.checkNotNullParameter(str, "newText");
        return new PickLocationViewModel$searchPlaces$1(this, str, getAppExecutors()).asLiveData();
    }

    public final ArrayList<AddressOrder> getRecentSearchAddresses() {
        return getApplication().requireOrderManager().getSavedSearchAddresses();
    }

    public final LiveData<Resource<ReverseGeoCodingResponse>> reverseGeoCoding(LatLng latLng) {
        Double d = null;
        StringBuilder append = new StringBuilder().append(latLng != null ? Double.valueOf(latLng.latitude) : null).append(',');
        if (latLng != null) {
            d = Double.valueOf(latLng.longitude);
        }
        return new PickLocationViewModel$reverseGeoCoding$1(this, append.append(d).toString(), getAppExecutors()).asLiveData();
    }

    public static /* synthetic */ LiveData suggestAddress$default(PickLocationViewModel pickLocationViewModel, LocationStore locationStore, int i, Object obj) {
        if ((i & 1) != 0) {
            locationStore = null;
        }
        return pickLocationViewModel.suggestAddress(locationStore);
    }

    public final LiveData<Resource<AddressSuggestionResponse>> suggestAddress(LocationStore locationStore) {
        return new PickLocationViewModel$suggestAddress$1(this, locationStore, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetPlaceDescriptionResponse>> getPlaceDescription(String str) {
        Intrinsics.checkNotNullParameter(str, "placeId");
        return new PickLocationViewModel$getPlaceDescription$1(this, str, getAppExecutors()).asLiveData();
    }

    public final void saveLocation(LatLng latLng, String str) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(str, "streetName");
        getApplication().requireOrderManager().saveSearchedLocation(latLng, str);
    }

    public final LiveData<Resource<UserAddressResponse>> getUserAddress(boolean z) {
        return new PickLocationViewModel$getUserAddress$1(this, new UserAddressRequest(z), getAppExecutors()).asLiveData();
    }

    public static /* synthetic */ LiveData getAutoCompleteSearch$default(PickLocationViewModel pickLocationViewModel, String str, Double d, Double d2, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        if ((i & 2) != 0) {
            d = null;
        }
        if ((i & 4) != 0) {
            d2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return pickLocationViewModel.getAutoCompleteSearch(str, d, d2, str2);
    }

    public final LiveData<Resource<AutoCompleteAddressResponse>> getAutoCompleteSearch(String str, Double d, Double d2, String str2) {
        return new PickLocationViewModel$getAutoCompleteSearch$1(this, str, d, d2, str2, getAppExecutors()).asLiveData();
    }

    public static /* synthetic */ LiveData getPlaceDetailById$default(PickLocationViewModel pickLocationViewModel, Double d, Double d2, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            d = null;
        }
        if ((i & 2) != 0) {
            d2 = null;
        }
        if ((i & 8) != 0) {
            str2 = null;
        }
        return pickLocationViewModel.getPlaceDetailById(d, d2, str, str2, str3);
    }

    public final LiveData<Resource<AddressSuggestionResponse>> getPlaceDetailById(Double d, Double d2, String str, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "placeId");
        Intrinsics.checkNotNullParameter(str3, "sessionToken");
        return new PickLocationViewModel$getPlaceDetailById$1(this, d, d2, str, str2, str3, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<ServerErrorResponse>> deleteUserAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return new PickLocationViewModel$deleteUserAddress$1(this, new DeleteUserAddressRequest(str), getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<ServerErrorResponse>> upsertUserAddress(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
        return new PickLocationViewModel$upsertUserAddress$1(this, addressSuggestion, getAppExecutors()).asLiveData();
    }

    public final AddressSuggestion fillUserInfo(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "selectedAddress");
        String name = addressSuggestion.getName();
        Phone phone = null;
        if (name == null || name.length() == 0) {
            Profile userProfile = getApplication().requireClientManager().getUserProfile();
            addressSuggestion.setName(userProfile != null ? userProfile.getFullName() : null);
        }
        if (addressSuggestion.getPhone() == null) {
            Profile userProfile2 = getApplication().requireClientManager().getUserProfile();
            if (userProfile2 != null) {
                phone = userProfile2.getPhone();
            }
            addressSuggestion.setPhone(phone);
        }
        return addressSuggestion;
    }
}
