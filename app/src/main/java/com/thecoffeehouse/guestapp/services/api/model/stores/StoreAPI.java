package com.thecoffeehouse.guestapp.services.api.model.stores;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.MockResponse;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Tag;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J$\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\u000e\b\u0001\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000bH'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0003\u0010\f\u001a\u00020\u0001H'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u00040\u0003H'¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/StoreAPI;", "", "checkPickUp", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/StorePickUpResponse;", "checkStorePickUpRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/StorePickUpRequest;", "getStores", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "mockResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/MockResponse;", "forceNetwork", "getStoresPickUp", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresPickUpResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoreAPI.kt */
public interface StoreAPI {
    @POST("stores/check-pickup")
    LiveData<ApiResponse<StorePickUpResponse>> checkPickUp(@Body StorePickUpRequest storePickUpRequest);

    @GET("stores/all")
    LiveData<ApiResponse<GetStoresResponse>> getStores(@Tag MockResponse<GetStoresResponse> mockResponse);

    @GET("stores/all")
    LiveData<ApiResponse<GetStoresResponse>> getStores(@Tag Object obj);

    @GET("stores/all-pickup")
    LiveData<ApiResponse<GetStoresPickUpResponse>> getStoresPickUp();

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* compiled from: StoreAPI.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData getStores$default(StoreAPI storeAPI, Object obj, int i, Object obj2) {
            if (obj2 == null) {
                if ((i & 1) != 0) {
                    obj = false;
                }
                return storeAPI.getStores(obj);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getStores");
        }
    }
}
