package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import vn.zalopay.sdk.responses.PaymentResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001BC\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nB\u0011\b\u0016\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u0002J\b\u0010\u001f\u001a\u00020\u0003H\u0016R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000bR\"\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\r\"\u0004\b\u0017\u0010\u000bR\"\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u0018\u0010\u0010\"\u0004\b\u0019\u0010\u0012R \u0010\b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000b¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Extra;", "", "id", "", "name", "", PaymentResponse.RETURN_CODE, FirebaseAnalytics.Param.PRICE, "priceStr", "groupId", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;)V", "(Ljava/lang/String;)V", "getCode", "()Ljava/lang/String;", "setCode", "getGroupId", "()Ljava/lang/Integer;", "setGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "getName", "setName", "getPrice", "setPrice", "getPriceStr", "setPriceStr", "equals", "", "other", "hashCode", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Extra {
    @SerializedName(PaymentResponse.RETURN_CODE)
    private String code;
    @SerializedName(FirebaseAnalytics.Param.GROUP_ID)
    private Integer groupId;
    @SerializedName("id")
    private Integer id;
    @SerializedName("name")
    private String name;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private Integer price;
    @SerializedName("price_str")
    private String priceStr;

    public final Integer getId() {
        return this.id;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        this.code = str;
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

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
    }

    public Extra(Integer num, String str, String str2, Integer num2, String str3, Integer num3) {
        this.id = num;
        this.name = str;
        this.code = str2;
        this.price = num2;
        this.priceStr = str3;
        this.groupId = num3;
    }

    public Extra(String str) {
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.orders.Extra");
        Extra extra = (Extra) obj;
        if (!(!Intrinsics.areEqual(this.id, extra.id)) && !(!Intrinsics.areEqual(this.name, extra.name)) && !(!Intrinsics.areEqual(this.code, extra.code)) && !(!Intrinsics.areEqual(this.price, extra.price)) && !(!Intrinsics.areEqual(this.priceStr, extra.priceStr)) && !(!Intrinsics.areEqual(this.groupId, extra.groupId))) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        Integer num = this.id;
        int i = 0;
        int intValue = (num != null ? num.intValue() : 0) * 31;
        String str = this.name;
        int hashCode = (intValue + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.code;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.price;
        int hashCode3 = (hashCode2 + (num2 != null ? Integer.hashCode(num2.intValue()) : 0)) * 31;
        String str3 = this.priceStr;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num3 = this.groupId;
        if (num3 != null) {
            i = num3.intValue();
        }
        return hashCode4 + i;
    }
}
