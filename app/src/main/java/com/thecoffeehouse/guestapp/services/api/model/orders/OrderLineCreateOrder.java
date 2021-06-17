package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R.\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR \u0010\u0013\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\"\u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\r\"\u0004\b\u001f\u0010\u000fR\"\u0010 \u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b!\u0010\u0019\"\u0004\b\"\u0010\u001b¨\u0006#"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "", "()V", "extra", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "getExtra", "()Ljava/util/ArrayList;", "setExtra", "(Ljava/util/ArrayList;)V", "id", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "name", "getName", "setName", "note", "getNote", "setNote", FirebaseAnalytics.Param.PRICE, "", "getPrice", "()Ljava/lang/Integer;", "setPrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "priceStr", "getPriceStr", "setPriceStr", FirebaseAnalytics.Param.QUANTITY, "getQuantity", "setQuantity", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class OrderLineCreateOrder {
    @SerializedName("extra")
    private ArrayList<String> extra = new ArrayList<>();
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName("note")
    private String note;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private Integer price;
    @SerializedName("price_str")
    private String priceStr;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    private Integer quantity;

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final void setQuantity(Integer num) {
        this.quantity = num;
    }

    public final ArrayList<String> getExtra() {
        return this.extra;
    }

    public final void setExtra(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.extra = arrayList;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final void setPrice(Integer num) {
        this.price = num;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final void setPriceStr(String str) {
        this.priceStr = str;
    }

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }
}
