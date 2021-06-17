package com.thecoffeehouse.guestapp.services.api.model.common.map;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001JI\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0007H'¢\u0006\u0002\u0010\fJ\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0001\u0010\u0014\u001a\u00020\u0007H'J\u001e\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00040\u00032\b\b\u0001\u0010\u0019\u001a\u00020\u0007H'JQ\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0001\u0010\u0019\u001a\u00020\u00072\n\b\u0003\u0010\u001c\u001a\u0004\u0018\u00010\u00072\b\b\u0001\u0010\u000b\u001a\u00020\u0007H'¢\u0006\u0002\u0010\u001dJ\u001e\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\u0007H'J\u0014\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u0003H'J\u001e\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010 \u001a\u00020\"H'J\u001e\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020$0\u00040\u00032\b\b\u0001\u0010%\u001a\u00020&H'J\u001e\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u00032\b\b\u0001\u0010(\u001a\u00020)H'¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/MapAPI;", "", "autoCompleteSearch", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AutoCompleteAddressResponse;", "textSearch", "", "lat", "", "lng", "sessionToken", "(Ljava/lang/String;Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "deleteUserAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "deleteUserAddressRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/DeleteUserAddressRequest;", "getLocationByIpAddress", "Lretrofit2/Call;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetLocationByIpAddress;", "ipAddress", "getPlaceAutoSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlaceAutoSuggestionResponse;", "getPlaceDescriptions", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetPlaceDescriptionResponse;", "placeId", "getPlaceDetailById", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestionResponse;", "fixed_address", "(Ljava/lang/Double;Ljava/lang/Double;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getReverseGeoCoding", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/ReverseGeoCodingResponse;", "latLng", "getSuggestAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "getUserAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressResponse;", "userAddressRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressRequest;", "upsertUserSavedAddress", "savedAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MapAPI.kt */
public interface MapAPI {
    @GET("map/autocomplete")
    LiveData<ApiResponse<AutoCompleteAddressResponse>> autoCompleteSearch(@Query("key") String str, @Query("lat") Double d, @Query("long") Double d2, @Query("session_token") String str2);

    @POST("user/delete-address")
    LiveData<ApiResponse<ServerErrorResponse>> deleteUserAddress(@Body DeleteUserAddressRequest deleteUserAddressRequest);

    @GET("{ip}")
    Call<GetLocationByIpAddress> getLocationByIpAddress(@Path("ip") String str);

    @GET("map/place")
    LiveData<ApiResponse<PlaceAutoSuggestionResponse>> getPlaceAutoSuggestion(@Query("key") String str);

    @GET("map/place_descriptions")
    LiveData<ApiResponse<GetPlaceDescriptionResponse>> getPlaceDescriptions(@Query("place_id") String str);

    @GET("map/detail-by-id")
    LiveData<ApiResponse<AddressSuggestionResponse>> getPlaceDetailById(@Query("lat") Double d, @Query("long") Double d2, @Query("place_id") String str, @Query("fixed_address") String str2, @Query("session_token") String str3);

    @GET("map/geocode")
    LiveData<ApiResponse<ReverseGeoCodingResponse>> getReverseGeoCoding(@Query("latlng") String str);

    @POST("map/suggest")
    LiveData<ApiResponse<AddressSuggestionResponse>> getSuggestAddress();

    @POST("map/suggest")
    LiveData<ApiResponse<AddressSuggestionResponse>> getSuggestAddress(@Body LocationStore locationStore);

    @POST("user/address")
    LiveData<ApiResponse<UserAddressResponse>> getUserAddress(@Body UserAddressRequest userAddressRequest);

    @POST("user/update-address")
    LiveData<ApiResponse<ServerErrorResponse>> upsertUserSavedAddress(@Body AddressSuggestion addressSuggestion);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* compiled from: MapAPI.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData autoCompleteSearch$default(MapAPI mapAPI, String str, Double d, Double d2, String str2, int i, Object obj) {
            if (obj == null) {
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
                return mapAPI.autoCompleteSearch(str, d, d2, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: autoCompleteSearch");
        }

        public static /* synthetic */ LiveData getPlaceDetailById$default(MapAPI mapAPI, Double d, Double d2, String str, String str2, String str3, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    d = null;
                }
                if ((i & 2) != 0) {
                    d2 = null;
                }
                if ((i & 8) != 0) {
                    str2 = null;
                }
                return mapAPI.getPlaceDetailById(d, d2, str, str2, str3);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getPlaceDetailById");
        }
    }
}
