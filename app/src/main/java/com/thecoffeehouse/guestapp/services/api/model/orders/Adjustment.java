package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0006\"\u0004\b\u0018\u0010\b¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Adjustment;", "", "()V", "description", "", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "id", "getId", "setId", "name", "getName", "setName", FirebaseAnalytics.Param.PRICE, "", "getPrice", "()Ljava/lang/Integer;", "setPrice", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "priceStr", "getPriceStr", "setPriceStr", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Adjustment {
    @SerializedName("description")
    private String description;
    @SerializedName("id")
    private String id;
    @SerializedName("name")
    private String name;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private Integer price;
    @SerializedName("price_str")
    private String priceStr;

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

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }
}
