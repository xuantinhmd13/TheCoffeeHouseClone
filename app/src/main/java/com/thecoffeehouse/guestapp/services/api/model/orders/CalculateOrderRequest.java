package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010R\u001a\u00020\u0011H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001c\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0013\"\u0004\b\u001e\u0010\u0015R.\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020!0 j\b\u0012\u0004\u0012\u00020!`\"8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R.\u0010'\u001a\u0012\u0012\u0004\u0012\u00020(0 j\b\u0012\u0004\u0012\u00020(`\"8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010$\"\u0004\b*\u0010&R\u001a\u0010+\u001a\u00020,X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R \u00101\u001a\u0004\u0018\u0001028\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R \u00107\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0013\"\u0004\b9\u0010\u0015R \u0010:\u001a\u0004\u0018\u00010;8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R\u001e\u0010@\u001a\u00020\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0013\"\u0004\bB\u0010\u0015R\"\u0010C\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bD\u0010\f\"\u0004\bE\u0010\u000eR\u001e\u0010F\u001a\u0004\u0018\u00010,X\u000e¢\u0006\u0010\n\u0002\u0010K\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR \u0010L\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u0013\"\u0004\bN\u0010\u0015R\"\u0010O\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\bP\u0010\f\"\u0004\bQ\u0010\u000e¨\u0006S"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderRequest;", "", "()V", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "getAddressSuggestion", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "setAddressSuggestion", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;)V", "afterDiscount", "", "getAfterDiscount", "()Ljava/lang/Integer;", "setAfterDiscount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "couponCode", "", "getCouponCode", "()Ljava/lang/String;", "setCouponCode", "(Ljava/lang/String;)V", "locationStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "getLocationStore", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "setLocationStore", "(Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;)V", "note", "getNote", "setNote", "orderLines", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "Lkotlin/collections/ArrayList;", "getOrderLines", "()Ljava/util/ArrayList;", "setOrderLines", "(Ljava/util/ArrayList;)V", "payments", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Payment;", "getPayments", "setPayments", "reorder", "", "getReorder", "()Z", "setReorder", "(Z)V", "scheduleTime", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "getScheduleTime", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "setScheduleTime", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;)V", "shippingType", "getShippingType", "setShippingType", "shop", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;", "getShop", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;", "setShop", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shop;)V", "src", "getSrc", "setSrc", "storeId", "getStoreId", "setStoreId", "switchSaveAddress", "getSwitchSaveAddress", "()Ljava/lang/Boolean;", "setSwitchSaveAddress", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "tableCode", "getTableCode", "setTableCode", "total", "getTotal", "setTotal", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public class CalculateOrderRequest {
    @SerializedName("delivery_info")
    private AddressSuggestion addressSuggestion;
    @SerializedName("after_discount")
    private Integer afterDiscount;
    @SerializedName(OrderFragment.COUPON_CODE_EXTRA)
    private String couponCode;
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private LocationStore locationStore;
    @SerializedName("note")
    private String note = "";
    @SerializedName("orderlines")
    private ArrayList<OrderLine> orderLines = new ArrayList<>();
    @SerializedName("payments")
    private ArrayList<Payment> payments = new ArrayList<>();
    private transient boolean reorder;
    @SerializedName("schedule_time")
    private ScheduleTime scheduleTime;
    @SerializedName("type")
    private String shippingType;
    @SerializedName("shop")
    private Shop shop;
    @SerializedName("src")
    private String src = "TCH-APP";
    @SerializedName("store_id")
    private Integer storeId;
    private transient Boolean switchSaveAddress = false;
    @SerializedName("table_code")
    private String tableCode;
    @SerializedName("total")
    private Integer total;

    public final String getSrc() {
        return this.src;
    }

    public final void setSrc(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.src = str;
    }

    public final String getShippingType() {
        return this.shippingType;
    }

    public final void setShippingType(String str) {
        this.shippingType = str;
    }

    public final AddressSuggestion getAddressSuggestion() {
        return this.addressSuggestion;
    }

    public final void setAddressSuggestion(AddressSuggestion addressSuggestion2) {
        this.addressSuggestion = addressSuggestion2;
    }

    public final String getCouponCode() {
        return this.couponCode;
    }

    public final void setCouponCode(String str) {
        this.couponCode = str;
    }

    public final ArrayList<OrderLine> getOrderLines() {
        return this.orderLines;
    }

    public final void setOrderLines(ArrayList<OrderLine> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.orderLines = arrayList;
    }

    public final ArrayList<Payment> getPayments() {
        return this.payments;
    }

    public final void setPayments(ArrayList<Payment> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.payments = arrayList;
    }

    public final Integer getStoreId() {
        return this.storeId;
    }

    public final void setStoreId(Integer num) {
        this.storeId = num;
    }

    public final String getTableCode() {
        return this.tableCode;
    }

    public final void setTableCode(String str) {
        this.tableCode = str;
    }

    public final LocationStore getLocationStore() {
        return this.locationStore;
    }

    public final void setLocationStore(LocationStore locationStore2) {
        this.locationStore = locationStore2;
    }

    public final ScheduleTime getScheduleTime() {
        return this.scheduleTime;
    }

    public final void setScheduleTime(ScheduleTime scheduleTime2) {
        this.scheduleTime = scheduleTime2;
    }

    public final Integer getAfterDiscount() {
        return this.afterDiscount;
    }

    public final void setAfterDiscount(Integer num) {
        this.afterDiscount = num;
    }

    public final Integer getTotal() {
        return this.total;
    }

    public final void setTotal(Integer num) {
        this.total = num;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public final Shop getShop() {
        return this.shop;
    }

    public final void setShop(Shop shop2) {
        this.shop = shop2;
    }

    public final boolean getReorder() {
        return this.reorder;
    }

    public final void setReorder(boolean z) {
        this.reorder = z;
    }

    public final Boolean getSwitchSaveAddress() {
        return this.switchSaveAddress;
    }

    public final void setSwitchSaveAddress(Boolean bool) {
        this.switchSaveAddress = bool;
    }

    public String toString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}
