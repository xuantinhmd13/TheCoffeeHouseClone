package com.thecoffeehouse.guestapp.services.api.model.common.config;

import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Url;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\"\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\b\b\u0001\u0010\t\u001a\u00020\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/MetadataAPI;", "", "getMetadata", "Lretrofit2/Call;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "metaDataRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/MetadataRequest;", "pingDeviceConnected", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PingDeviceResponse;", "url", "", "pingDeviceRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PingDeviceRequest;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MetadataAPI.kt */
public interface MetadataAPI {
    @POST("config/meta")
    Call<GetMetadataResponse> getMetadata(@Body MetadataRequest metadataRequest);

    @POST
    Call<PingDeviceResponse> pingDeviceConnected(@Url String str, @Body PingDeviceRequest pingDeviceRequest);
}
