package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u0006\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u00105\u001a\u000206R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0019\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u001a\u0010\u0015\"\u0004\b\u001b\u0010\u0017R \u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0006\"\u0004\b\u001e\u0010\bR \u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0006\"\u0004\b!\u0010\bR\"\u0010\"\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010)\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0006\"\u0004\b+\u0010\bR \u0010,\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0006\"\u0004\b.\u0010\bR \u0010/\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u0010\u0006\"\u0004\b1\u0010\bR\"\u00102\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010(\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'¨\u00067"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "areaName", "getAreaName", "setAreaName", FirebaseAnalytics.Param.COUPON, "getCoupon", "setCoupon", "id", "getId", "setId", "lat", "", "getLat", "()Ljava/lang/Double;", "setLat", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "long", "getLong", "setLong", "payment", "getPayment", "setPayment", "staffNote", "getStaffNote", "setStaffNote", "storeId", "", "getStoreId", "()Ljava/lang/Integer;", "setStoreId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "storeName", "getStoreName", "setStoreName", "tableCode", "getTableCode", "setTableCode", "tableName", "getTableName", "setTableName", "tableSlot", "getTableSlot", "setTableSlot", "getLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class TableInfo {
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private String address;
    @SerializedName("area_name")
    private String areaName;
    @SerializedName(FirebaseAnalytics.Param.COUPON)
    private String coupon;
    @SerializedName("id")
    private String id;
    @SerializedName("lat")
    private Double lat;
    @SerializedName("long")

    /* renamed from: long  reason: not valid java name */
    private Double f2long;
    @SerializedName("payment")
    private String payment;
    @SerializedName("staff_note")
    private String staffNote;
    @SerializedName("store_id")
    private Integer storeId;
    @SerializedName("store_name")
    private String storeName;
    @SerializedName("table_code")
    private String tableCode;
    @SerializedName("table_name")
    private String tableName;
    @SerializedName("table_slot")
    private Integer tableSlot;

    public final Double getLat() {
        return this.lat;
    }

    public final void setLat(Double d) {
        this.lat = d;
    }

    public final Double getLong() {
        return this.f2long;
    }

    public final void setLong(Double d) {
        this.f2long = d;
    }

    public final Integer getStoreId() {
        return this.storeId;
    }

    public final void setStoreId(Integer num) {
        this.storeId = num;
    }

    public final String getAreaName() {
        return this.areaName;
    }

    public final void setAreaName(String str) {
        this.areaName = str;
    }

    public final String getTableName() {
        return this.tableName;
    }

    public final void setTableName(String str) {
        this.tableName = str;
    }

    public final Integer getTableSlot() {
        return this.tableSlot;
    }

    public final void setTableSlot(Integer num) {
        this.tableSlot = num;
    }

    public final String getPayment() {
        return this.payment;
    }

    public final void setPayment(String str) {
        this.payment = str;
    }

    public final String getCoupon() {
        return this.coupon;
    }

    public final void setCoupon(String str) {
        this.coupon = str;
    }

    public final String getStaffNote() {
        return this.staffNote;
    }

    public final void setStaffNote(String str) {
        this.staffNote = str;
    }

    public final String getTableCode() {
        return this.tableCode;
    }

    public final void setTableCode(String str) {
        this.tableCode = str;
    }

    public final String getStoreName() {
        return this.storeName;
    }

    public final void setStoreName(String str) {
        this.storeName = str;
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final LatLng getLatLng() {
        Double d = this.lat;
        double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double doubleValue = d != null ? d.doubleValue() : 0.0d;
        Double d3 = this.f2long;
        if (d3 != null) {
            d2 = d3.doubleValue();
        }
        return new LatLng(doubleValue, d2);
    }
}
