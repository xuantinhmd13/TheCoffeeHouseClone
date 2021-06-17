package com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'J\u001e\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u00032\b\b\u0001\u0010\b\u001a\u00020\tH'J\u0014\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00040\u0003H'¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/ExternalAccountAPI;", "", "getHaravanInfo", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/GetHaravanResponse;", "linkHaravanAccount", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanResponse;", "linkHaravanRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanRequest;", "unlinkHaravanAccount", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MetadataAPI.kt */
public interface ExternalAccountAPI {
    @POST("hrv/info")
    LiveData<ApiResponse<GetHaravanResponse>> getHaravanInfo();

    @POST("hrv/link")
    LiveData<ApiResponse<LinkHaravanResponse>> linkHaravanAccount(@Body LinkHaravanRequest linkHaravanRequest);

    @POST("hrv/unlink")
    LiveData<ApiResponse<LinkHaravanResponse>> unlinkHaravanAccount();
}
