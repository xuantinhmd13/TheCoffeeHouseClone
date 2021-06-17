package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\"\u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0012\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingRequest;", "", "()V", "orderType", "", "getOrderType", "()Ljava/lang/String;", "setOrderType", "(Ljava/lang/String;)V", "ref", "getRef", "setRef", "userRank", "", "getUserRank", "()Ljava/lang/Integer;", "setUserRank", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public class GetOrderTrackingRequest {
    @SerializedName("order_type")
    private String orderType;
    @SerializedName("ref")
    private String ref;
    @SerializedName("user_rank")
    private Integer userRank;

    public final Integer getUserRank() {
        return this.userRank;
    }

    public final void setUserRank(Integer num) {
        this.userRank = num;
    }

    public final String getRef() {
        return this.ref;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }
}
