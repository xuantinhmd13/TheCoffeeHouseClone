package com.thecoffeehouse.guestapp.screens.order;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.config.CancelReasonsItem;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RatingCategories;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RatingOrder;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.DataRatingOrderInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetMenuByLatLngResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTimeResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersProcessingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetShippingInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetTableInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.WarningButton;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CouponDetailResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

public final class OrderViewModel extends BaseViewModel {
    private List<Menu> currentMenus;
    private final ArrayList<LocationStore> listFakeShipping = CollectionsKt.arrayListOf(new LocationStore(10.791794d, 106.6898871d), new LocationStore(10.7918405d, 106.6907511d), new LocationStore(10.7921441d, 106.6934715d), new LocationStore(10.7927554d, 106.6962235d), new LocationStore(10.7942414d, 106.6965346d), new LocationStore(10.7964915d, 106.6966741d), new LocationStore(10.7987942d, 106.6969155d), new LocationStore(10.8013815d, 106.6971354d));

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OrderViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final Order getOrderResponse() {
        CalculateOrderResponse mCalculateOrderResponse = getApplication().requireOrderManager().getMCalculateOrderResponse();
        if (mCalculateOrderResponse != null) {
            return mCalculateOrderResponse.getOrder();
        }
        return null;
    }

    public final List<Menu> getCurrentMenus() {
        return this.currentMenus;
    }

    public final LiveData<Resource<GetOrderTrackingResponse>> cancelOrder(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(str2, "reasonId");
        return getApplication().requireOrderManager().cancelOrder(str, str2);
    }

    public final LiveData<Resource<CalculateOrderResponse>> changeShippingMethodToDelivery(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
        return getApplication().requireOrderManager().changeShippingMethodToDelivery(addressSuggestion);
    }

    public final LiveData<Resource<CalculateOrderResponse>> changeShippingMethodToPickUp(Store store) {
        return getApplication().requireOrderManager().changeShippingMethodToPickUp(store);
    }

    public final LiveData<Resource<CalculateOrderResponse>> deleteOrderLineAndCalculateOrder(OrderLine orderLine) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLine");
        return getApplication().requireOrderManager().deleteOrderLinesAndCalculateOrder(orderLine);
    }

    public final ArrayList<Payment> getAvailablePayments() {
        return getApplication().requireOrderManager().getAvailablePayments();
    }

    public final List<CancelReasonsItem> getCancelReasons() {
        return getApplication().requireClientManager().getCancelReasons();
    }

    public final CalculateOrderResponse getDraftCart() {
        return getApplication().requireOrderManager().getDraftOrder();
    }

    public final LiveData<Resource<CouponDetailResponse>> getExistedCouponDetail(String str, String str2) {
        return getApplication().requireOrderManager().getExistedCouponDetail(str, str2);
    }

    public final HashSet<String> getFavouriteProductIds() {
        return getApplication().requireOrderManager().getFavouriteProductIds();
    }

    public static /* synthetic */ LiveData getMenuByLatLng$default(OrderViewModel orderViewModel, double d, double d2, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            d = -1.0d;
        }
        if ((i & 2) != 0) {
            d2 = -1.0d;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            num = null;
        }
        return orderViewModel.getMenuByLatLng(d, d2, str, num);
    }

    public final LiveData<Resource<GetMenuByLatLngResponse>> getMenuByLatLng(double d, double d2, String str, Integer num) {
        return new OrderViewModel$getMenuByLatLng$1(this, d, d2, str, num, getAppExecutors()).asLiveData();
    }

    public static /* synthetic */ LiveData getOrderTracking$default(OrderViewModel orderViewModel, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return orderViewModel.getOrderTracking(str, str2);
    }

    public final LiveData<Resource<GetOrderTrackingResponse>> getOrderTracking(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "orderRef");
        return getApplication().requireOrderManager().getOrderTracking(str, str2);
    }

    public static /* synthetic */ LiveData getOrdersHistory$default(OrderViewModel orderViewModel, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = 1;
        }
        if ((i3 & 2) != 0) {
            i2 = 10;
        }
        return orderViewModel.getOrdersHistory(i, i2);
    }

    public final LiveData<Resource<GetOrdersHistoryResponse>> getOrdersHistory(int i, int i2) {
        return getApplication().requireOrderManager().getOrdersHistory(i, i2);
    }

    public final LiveData<Resource<GetOrdersProcessingResponse>> getOrdersProcessing() {
        return getApplication().requireOrderManager().getOrdersProcessing();
    }

    public final List<RatingOrder> getRatingCategoriesDelivery() {
        RatingCategories ratingCategories;
        GetMetadataResponse value = getApplication().m0getMetadata().getValue();
        List<RatingOrder> deliveries = (value == null || (ratingCategories = value.getRatingCategories()) == null) ? null : ratingCategories.getDeliveries();
        return deliveries != null ? deliveries : CollectionsKt.emptyList();
    }

    public final List<RatingOrder> getRatingCategoriesStore() {
        RatingCategories ratingCategories;
        GetMetadataResponse value = getApplication().m0getMetadata().getValue();
        List<RatingOrder> stores = (value == null || (ratingCategories = value.getRatingCategories()) == null) ? null : ratingCategories.getStores();
        return stores != null ? stores : CollectionsKt.emptyList();
    }

    public final LiveData<Resource<GetOrderTimeResponse>> getScheduleOrder() {
        return getApplication().requireOrderManager().getScheduleTimeOrder();
    }

    public final LiveData<Resource<ServerErrorResponse>> ratingOrder(DataRatingOrderInfo dataRatingOrderInfo) {
        Intrinsics.checkNotNullParameter(dataRatingOrderInfo, "ratingOrderInfoResponse");
        return getApplication().requireOrderManager().ratingOrder(dataRatingOrderInfo);
    }

    public final LiveData<Resource<CalculateOrderResponse>> removeExistedCouponInCart() {
        return getApplication().requireOrderManager().removeExistedCouponInCart();
    }

    public final void saveDraftCartLocal() {
        getApplication().requireOrderManager().saveDraftCart();
    }

    public final LiveData<Resource<CalculateOrderResponse>> updateCouponToOrder(String str) {
        Intrinsics.checkNotNullParameter(str, "selectedCoupon");
        return getApplication().requireOrderManager().updateCoupon(str);
    }

    public final LiveData<Resource<CreateOrderResponse>> updateDeliveryInfoAndCreateOrder(String str, String str2, Boolean bool) {
        return getApplication().requireOrderManager().updateDeliveryInfoAndCreateOrder(str, str2, bool);
    }

    public final void updateFavouriteProduct(String str, boolean z) {
        Intrinsics.checkNotNullParameter(str, "id");
        getApplication().requireOrderManager().updateFavouriteProductIds(str, z);
    }

    public final LiveData<Resource<CalculateOrderResponse>> updatePaymentMethodAndCalculateOrder(Payment payment) {
        Intrinsics.checkNotNullParameter(payment, "payment");
        return getApplication().requireOrderManager().updatePaymentMethodAndCalculateOrder(payment);
    }

    public final LiveData<Resource<CalculateOrderResponse>> updateScheduleTime(ScheduleTime scheduleTime) {
        Intrinsics.checkNotNullParameter(scheduleTime, "scheduleTime");
        return getApplication().requireOrderManager().updateScheduleTime(scheduleTime);
    }

    public static /* synthetic */ LiveData upsertOrderLineAndCalculateOrder$default(OrderViewModel orderViewModel, OrderLine orderLine, Integer num, int i, Object obj) {
        if ((i & 2) != 0) {
            num = null;
        }
        return orderViewModel.upsertOrderLineAndCalculateOrder(orderLine, num);
    }

    public final LiveData<Resource<CalculateOrderResponse>> upsertOrderLineAndCalculateOrder(OrderLine orderLine, Integer num) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLine");
        return getApplication().requireOrderManager().upsertOrderLinesAndCalculateOrder(orderLine, num);
    }

    public final List<String> getOrderedProductIds() {
        return getApplication().requireOrderManager().getOrderedProductIds();
    }

    public final LiveData<Resource<CalculateOrderResponse>> calculateConfirmCart() {
        return getApplication().requireOrderManager().callCalculateOrderToServer();
    }

    public final boolean ratingAppFlowIsSufficient() {
        return getApplication().requireOrderManager().ratingAppFlowIsSufficient();
    }

    public final void saveRatedApp() {
        getApplication().requireOrderManager().ratedApp();
    }

    public final MutableLiveData<Resource<CalculateOrderResponse>> deleteDraftCart() {
        return getApplication().requireOrderManager().clearDraftCart();
    }

    public final LiveData<Resource<CalculateOrderResponse>> reorder(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        return getApplication().requireOrderManager().reorder(str, str2);
    }

    public final void setCurrentMenu(List<Menu> list) {
        Intrinsics.checkNotNullParameter(list, "menu");
        this.currentMenus = list;
    }

    public final ArrayList<LocationStore> getListFakeShipping() {
        return this.listFakeShipping;
    }

    public final LiveData<Resource<GetShippingInfoResponse>> getShippingInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "orderRef");
        return getApplication().requireOrderManager().getShippingInfo(str, str2);
    }

    public final LatLng getDefaultLatLng() {
        return getApplication().requireCommonServiceManager().getDefaultHCMAddress().getLatLng();
    }

    public final void saveLocationLocal() {
        getApplication().requireOrderManager().saveLocationLocal();
    }

    public final LiveData<Resource<CreateOrderResponse>> updateWarningSelectedAndCreateOrder(WarningButton warningButton) {
        Intrinsics.checkNotNullParameter(warningButton, "selected");
        return getApplication().requireOrderManager().updateWarningSelectedAndCreateOrder(warningButton);
    }

    public final ArrayList<Payment> getAllPaymentMethods() {
        return getApplication().requireOrderManager().getAllPaymentMethods();
    }

    public final LiveData<Resource<CalculateOrderResponse>> updateReceiverInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "updatedName");
        Intrinsics.checkNotNullParameter(str2, "updatedPhoneNumber");
        return getApplication().requireOrderManager().updateCustomerInfo(str, str2);
    }

    public final void updateNotesAndSaveConfirmOrder(String str, String str2, Boolean bool) {
        Intrinsics.checkNotNullParameter(str, "deliveryNote");
        Intrinsics.checkNotNullParameter(str2, "billNote");
        getApplication().requireOrderManager().updateNotesAndSaveConfirmOrder(str, str2, bool);
    }

    public final LiveData<Resource<GetTableInfoResponse>> getTableInfo(String str) {
        return getApplication().requireOrderManager().getTableInfo(str);
    }

    public final LiveData<Resource<CalculateOrderResponse>> changeShippingMethodToAtTable(TableInfo tableInfo) {
        Intrinsics.checkNotNullParameter(tableInfo, "currentAtTableInfo");
        return getApplication().requireOrderManager().changeShippingMethodToAtTable(tableInfo);
    }

    public final LiveData<Resource<RatingOrderInfoResponse>> getRatingOrderInfo(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        return getApplication().requireOrderManager().ratingOrderInfo(str, str2);
    }
}
