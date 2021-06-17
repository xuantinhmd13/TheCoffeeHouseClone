package com.thecoffeehouse.guestapp.services.api.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import vn.zalopay.sdk.responses.PaymentResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b \n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\t\u0010$\u001a\u00020\u0003HÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\n\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001e\u0010\u0006\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019R\u001e\u0010\u0007\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u000e\"\u0004\b#\u0010\u0010¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "Landroid/os/Parcelable;", "id", "", PaymentResponse.RETURN_CODE, "", FirebaseAnalytics.Param.PRICE, "priceStr", "name", "min", "max", "groupId", "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;IILjava/lang/Integer;)V", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/Integer;", "setGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "()I", "setId", "(I)V", "getMax", "setMax", "getMin", "setMin", "getName", "setName", "getPrice", "setPrice", "getPriceStr", "setPriceStr", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Item implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName(PaymentResponse.RETURN_CODE)
    private String code;
    private Integer groupId;
    @SerializedName("id")
    private int id;
    @SerializedName("max")
    private int max;
    @SerializedName("min")
    private int min;
    @SerializedName("name")
    private String name;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private int price;
    @SerializedName("price_str")
    private String priceStr;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new Item(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Item[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int i2;
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.id);
        parcel.writeString(this.code);
        parcel.writeInt(this.price);
        parcel.writeString(this.priceStr);
        parcel.writeString(this.name);
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        Integer num = this.groupId;
        if (num != null) {
            parcel.writeInt(1);
            i2 = num.intValue();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
    }

    public Item(int i, String str, int i2, String str2, String str3, int i3, int i4, Integer num) {
        Intrinsics.checkNotNullParameter(str, PaymentResponse.RETURN_CODE);
        Intrinsics.checkNotNullParameter(str2, "priceStr");
        Intrinsics.checkNotNullParameter(str3, "name");
        this.id = i;
        this.code = str;
        this.price = i2;
        this.priceStr = str2;
        this.name = str3;
        this.min = i3;
        this.max = i4;
        this.groupId = num;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final String getCode() {
        return this.code;
    }

    public final void setCode(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.code = str;
    }

    public final int getPrice() {
        return this.price;
    }

    public final void setPrice(int i) {
        this.price = i;
    }

    public final String getPriceStr() {
        return this.priceStr;
    }

    public final void setPriceStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.priceStr = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final int getMin() {
        return this.min;
    }

    public final void setMin(int i) {
        this.min = i;
    }

    public final int getMax() {
        return this.max;
    }

    public final void setMax(int i) {
        this.max = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Item(int i, String str, int i2, String str2, String str3, int i3, int i4, Integer num, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, i2, str2, str3, i3, i4, (i5 & 128) != 0 ? null : num);
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
    }
}
