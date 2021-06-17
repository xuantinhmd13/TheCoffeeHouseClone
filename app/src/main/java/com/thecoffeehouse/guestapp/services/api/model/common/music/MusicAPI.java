package com.thecoffeehouse.guestapp.services.api.model.common.music;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import kotlin.Metadata;
import retrofit2.http.GET;
import retrofit2.http.Headers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003H'¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicAPI;", "", "getMusicPlaying", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/music/MusicResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MusicAPI.kt */
public interface MusicAPI {
    @Headers({"Cache-Control: no-cache"})
    @GET("music/current-status")
    LiveData<ApiResponse<MusicResponse>> getMusicPlaying();
}
