package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001Bc\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r¢\u0006\u0002\u0010\u000eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u000b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;", "", "ref", "", "totalStr", "time", "", "orderType", "type", "orderTypeStr", "products", "", "rating", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;)V", "getOrderType", "()Ljava/lang/String;", "getOrderTypeStr", "getProducts", "()Ljava/util/List;", "getRating", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;", "setRating", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;)V", "getRef", "getTime", "()J", "getTotalStr", "getType", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class OrderHistory {
    @SerializedName("order_type")
    private final String orderType;
    @SerializedName("order_type_str")
    private final String orderTypeStr;
    @SerializedName("products")
    private final List<String> products;
    @SerializedName("rating")
    private Rating rating;
    @SerializedName("ref")
    private final String ref;
    @SerializedName("time")
    private final long time;
    @SerializedName("total_str")
    private final String totalStr;
    @SerializedName("type")
    private final String type;

    public OrderHistory(String str, String str2, long j, String str3, String str4, String str5, List<String> list, Rating rating2) {
        Intrinsics.checkNotNullParameter(str, "ref");
        Intrinsics.checkNotNullParameter(list, "products");
        this.ref = str;
        this.totalStr = str2;
        this.time = j;
        this.orderType = str3;
        this.type = str4;
        this.orderTypeStr = str5;
        this.products = list;
        this.rating = rating2;
    }

    public final String getRef() {
        return this.ref;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ OrderHistory(String str, String str2, long j, String str3, String str4, String str5, List list, Rating rating2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? 0 : j, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? new ArrayList() : list, (i & 128) != 0 ? null : rating2);
    }

    public final String getTotalStr() {
        return this.totalStr;
    }

    public final long getTime() {
        return this.time;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final String getType() {
        return this.type;
    }

    public final String getOrderTypeStr() {
        return this.orderTypeStr;
    }

    public final List<String> getProducts() {
        return this.products;
    }

    public final Rating getRating() {
        return this.rating;
    }

    public final void setRating(Rating rating2) {
        this.rating = rating2;
    }
}
