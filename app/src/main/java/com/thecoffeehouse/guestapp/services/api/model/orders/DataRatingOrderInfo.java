package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR&\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00198\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR2\u0010\u001f\u001a\u0016\u0012\u0004\u0012\u00020!\u0018\u00010 j\n\u0012\u0004\u0012\u00020!\u0018\u0001`\"8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R \u0010'\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR \u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\b¨\u0006-"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;", "", "()V", "comment", "", "getComment", "()Ljava/lang/String;", "setComment", "(Ljava/lang/String;)V", "createdAt", "getCreatedAt", "setCreatedAt", "feedback", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Feedback;", "getFeedback", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Feedback;", "setFeedback", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Feedback;)V", "orderType", "getOrderType", "setOrderType", "orderTypeStr", "getOrderTypeStr", "setOrderTypeStr", "orderlines", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "getOrderlines", "()Ljava/util/List;", "setOrderlines", "(Ljava/util/List;)V", "productRatings", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderProduct;", "Lkotlin/collections/ArrayList;", "getProductRatings", "()Ljava/util/ArrayList;", "setProductRatings", "(Ljava/util/ArrayList;)V", "ref", "getRef", "setRef", "type", "getType", "setType", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class DataRatingOrderInfo {
    @SerializedName("comment")
    private String comment;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("feedback")
    private Feedback feedback;
    @SerializedName("order_type")
    private String orderType;
    @SerializedName("order_type_str")
    private String orderTypeStr;
    @SerializedName("orderlines")
    private List<OrderLineCreateOrder> orderlines;
    @SerializedName("products")
    private ArrayList<RatingOrderProduct> productRatings;
    @SerializedName("ref")
    private String ref;
    @SerializedName("type")
    private String type;

    public final String getRef() {
        return this.ref;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final String getType() {
        return this.type;
    }

    public final void setType(String str) {
        this.type = str;
    }

    public final List<OrderLineCreateOrder> getOrderlines() {
        return this.orderlines;
    }

    public final void setOrderlines(List<OrderLineCreateOrder> list) {
        this.orderlines = list;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    public final String getOrderTypeStr() {
        return this.orderTypeStr;
    }

    public final void setOrderTypeStr(String str) {
        this.orderTypeStr = str;
    }

    public final String getCreatedAt() {
        return this.createdAt;
    }

    public final void setCreatedAt(String str) {
        this.createdAt = str;
    }

    public final Feedback getFeedback() {
        return this.feedback;
    }

    public final void setFeedback(Feedback feedback2) {
        this.feedback = feedback2;
    }

    public final ArrayList<RatingOrderProduct> getProductRatings() {
        return this.productRatings;
    }

    public final void setProductRatings(ArrayList<RatingOrderProduct> arrayList) {
        this.productRatings = arrayList;
    }

    public final String getComment() {
        return this.comment;
    }

    public final void setComment(String str) {
        this.comment = str;
    }
}
