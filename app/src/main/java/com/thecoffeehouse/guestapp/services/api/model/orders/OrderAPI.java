package com.thecoffeehouse.guestapp.services.api.model.orders;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¢\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u001e\u0010\u0002\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u0007H'J\u001e\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u000bH'J\u001e\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\u00040\u00032\b\b\u0001\u0010\u0006\u001a\u00020\u000eH'JQ\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u00040\u00032\b\b\u0003\u0010\u0011\u001a\u00020\u00122\b\b\u0003\u0010\u0013\u001a\u00020\u00122\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0015H'¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u00040\u00032\b\b\u0001\u0010\u001c\u001a\u00020\u001dH'J\u001e\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u001dH'J\u001e\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020\u001dH'J\u001e\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\"0\u00040\u00032\b\b\u0001\u0010#\u001a\u00020$H'J\u001e\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020&0\u00040\u00032\b\b\u0001\u0010'\u001a\u00020(H'J/\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0\u00040\u00032\n\b\u0001\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\b\u0001\u0010+\u001a\u00020\u0015H'¢\u0006\u0002\u0010,J\u001e\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020.0\u00040\u00032\b\b\u0001\u0010\n\u001a\u00020/H'J\u001e\u00100\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002010\u00040\u00032\b\b\u0001\u00102\u001a\u000203H'J\u001e\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00032\b\b\u0001\u00105\u001a\u000206H'¨\u00067"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderAPI;", "", "calculateOrder", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "calculateOrderRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderRequest;", "cancelOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingResponse;", "getOrderProcessingRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CancelOrderRequest;", "createOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderRequest;", "getMenuByLatLng", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetMenuByLatLngResponse;", "latitude", "", "longitude", "shippingType", "", "storeId", "", "firstName", "(DDLjava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getOrderFeedbackDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderInfoResponse;", "orderFeedbackDetailRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingRequest;", "getOrderShippingInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetShippingInfoResponse;", "getOrderTracking", "getOrdersHistory", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersHistoryResponse;", "orderHistoryRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistoryRequest;", "getOrdersProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersProcessingResponse;", "orderProcessingRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessingRequest;", "getScheduleTime", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTimeResponse;", "type", "(Ljava/lang/Integer;Ljava/lang/String;)Landroidx/lifecycle/LiveData;", "getTableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetTableInfoResponse;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetTableInfoRequest;", "ratingOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "ratingOrderRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;", "reorder", "reorderRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ReorderRequest;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderAPI.kt */
public interface OrderAPI {
    @POST("orders/calculate")
    LiveData<ApiResponse<CalculateOrderResponse>> calculateOrder(@Body CalculateOrderRequest calculateOrderRequest);

    @POST("orders/cancel-order")
    LiveData<ApiResponse<GetOrderTrackingResponse>> cancelOrder(@Body CancelOrderRequest cancelOrderRequest);

    @POST("orders/create-order")
    LiveData<ApiResponse<CreateOrderResponse>> createOrder(@Body CreateOrderRequest createOrderRequest);

    @GET("menu/get")
    LiveData<ApiResponse<GetMenuByLatLngResponse>> getMenuByLatLng(@Query("lat") double d, @Query("long") double d2, @Query("type") String str, @Query("store_id") Integer num, @Query("first_name") String str2);

    @POST("orders/feedback")
    LiveData<ApiResponse<RatingOrderInfoResponse>> getOrderFeedbackDetail(@Body GetOrderTrackingRequest getOrderTrackingRequest);

    @POST("orders/shipping-info")
    LiveData<ApiResponse<GetShippingInfoResponse>> getOrderShippingInfo(@Body GetOrderTrackingRequest getOrderTrackingRequest);

    @POST("orders/tracking")
    LiveData<ApiResponse<GetOrderTrackingResponse>> getOrderTracking(@Body GetOrderTrackingRequest getOrderTrackingRequest);

    @POST("orders/history")
    LiveData<ApiResponse<GetOrdersHistoryResponse>> getOrdersHistory(@Body OrderHistoryRequest orderHistoryRequest);

    @POST("orders/processing")
    LiveData<ApiResponse<GetOrdersProcessingResponse>> getOrdersProcessing(@Body OrderProcessingRequest orderProcessingRequest);

    @GET("orders/schedule-time")
    LiveData<ApiResponse<GetOrderTimeResponse>> getScheduleTime(@Query("store_id") Integer num, @Query("type") String str);

    @POST("orders/table-info")
    LiveData<ApiResponse<GetTableInfoResponse>> getTableInfo(@Body GetTableInfoRequest getTableInfoRequest);

    @POST("orders/rating")
    LiveData<ApiResponse<ServerErrorResponse>> ratingOrder(@Body DataRatingOrderInfo dataRatingOrderInfo);

    @POST("orders/re-order")
    LiveData<ApiResponse<CalculateOrderResponse>> reorder(@Body ReorderRequest reorderRequest);

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    /* compiled from: OrderAPI.kt */
    public static final class DefaultImpls {
        public static /* synthetic */ LiveData getMenuByLatLng$default(OrderAPI orderAPI, double d, double d2, String str, Integer num, String str2, int i, Object obj) {
            if (obj == null) {
                return orderAPI.getMenuByLatLng((i & 1) != 0 ? -1.0d : d, (i & 2) != 0 ? -1.0d : d2, str, num, str2);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMenuByLatLng");
        }
    }
}
