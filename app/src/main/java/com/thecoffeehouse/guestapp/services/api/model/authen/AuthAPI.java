package com.thecoffeehouse.guestapp.services.api.model.authen;

import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'J\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0006H'¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthAPI;", "", "refreshToken", "Lretrofit2/Call;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/RefreshTokenResponse;", "token", "", "signOut", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AuthAPI.kt */
public interface AuthAPI {
    @POST("auth/refresh-token")
    Call<RefreshTokenResponse> refreshToken(@Header("Authorization") String str);

    @POST("auth/sign-out")
    Call<RefreshTokenResponse> signOut(@Header("Authorization") String str);
}
