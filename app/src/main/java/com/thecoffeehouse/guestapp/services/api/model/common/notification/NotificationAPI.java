package com.thecoffeehouse.guestapp.services.api.model.common.notification;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u000b0\nH'J\u001e\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\u000b0\n2\b\b\u0001\u0010\u000f\u001a\u00020\u0010H'J\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\bH'¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/NotificationAPI;", "", "deRegisterFcmToken", "Lretrofit2/Call;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/RegisterFcmTokenResponse;", "token", "", "registerFcmTokenRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/RegisterFcmTokenRequest;", "getNotifications", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/GetNotificationsResponse;", "readNotification", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "readNotificationRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/ReadNotificationRequest;", "registerFcmToken", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: NotificationAPI.kt */
public interface NotificationAPI {
    @POST("fcm/de-register")
    Call<RegisterFcmTokenResponse> deRegisterFcmToken(@Header("Authorization") String str, @Body RegisterFcmTokenRequest registerFcmTokenRequest);

    @POST("notification/all")
    LiveData<ApiResponse<GetNotificationsResponse>> getNotifications();

    @POST("notification/read")
    LiveData<ApiResponse<ServerErrorResponse>> readNotification(@Body ReadNotificationRequest readNotificationRequest);

    @POST("fcm/register")
    Call<RegisterFcmTokenResponse> registerFcmToken(@Header("Authorization") String str, @Body RegisterFcmTokenRequest registerFcmTokenRequest);
}
