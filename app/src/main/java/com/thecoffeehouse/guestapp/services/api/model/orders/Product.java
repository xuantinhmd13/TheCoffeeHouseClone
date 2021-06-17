package com.thecoffeehouse.guestapp.services.api.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b,\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B·\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0018\b\u0002\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\t\u0012\u0018\b\u0002\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\t\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0003¢\u0006\u0002\u0010\u0016J\t\u0010=\u001a\u00020\u000bHÖ\u0001J\u0013\u0010>\u001a\u00020\u00132\b\u0010?\u001a\u0004\u0018\u00010@H\u0002J\b\u0010A\u001a\u00020\u000bH\u0016J\u0019\u0010B\u001a\u00020C2\u0006\u0010D\u001a\u00020E2\u0006\u0010F\u001a\u00020\u000bHÖ\u0001R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0010\n\u0002\u0010\u001f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0015\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010!\"\u0004\b%\u0010#R.\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R.\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00030\u0007j\b\u0012\u0004\u0012\u00020\u0003`\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010'\"\u0004\b-\u0010)R\u001a\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010.\"\u0004\b/\u00100R \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u0010!\"\u0004\b2\u0010#R.\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b0\u0007j\b\u0012\u0004\u0012\u00020\b`\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\u001e\u0010\f\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R \u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#¨\u0006G"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Landroid/os/Parcelable;", "id", "", "name", "description", "options", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Option;", "Lkotlin/collections/ArrayList;", FirebaseAnalytics.Param.PRICE, "", "priceStr", "basePrice", "", "thumbnail", "images", "hints", "isFavourite", "", "categoryId", "categoryName", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;ILjava/lang/String;DLjava/lang/String;Ljava/util/ArrayList;Ljava/util/ArrayList;ZLjava/lang/Integer;Ljava/lang/String;)V", "getBasePrice", "()D", "setBasePrice", "(D)V", "getCategoryId", "()Ljava/lang/Integer;", "setCategoryId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getCategoryName", "()Ljava/lang/String;", "setCategoryName", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getHints", "()Ljava/util/ArrayList;", "setHints", "(Ljava/util/ArrayList;)V", "getId", "setId", "getImages", "setImages", "()Z", "setFavourite", "(Z)V", "getName", "setName", "getOptions", "setOptions", "getPrice", "()I", "setPrice", "(I)V", "getPriceStr", "setPriceStr", "getThumbnail", "setThumbnail", "describeContents", "equals", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Product implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("base_price")
    private double basePrice;
    private transient Integer categoryId;
    private transient String categoryName;
    @SerializedName("description")
    private String description;
    @SerializedName("hint_note")
    private ArrayList<String> hints;
    @SerializedName("id")
    private String id;
    @SerializedName("images")
    private ArrayList<String> images;
    private transient boolean isFavourite;
    @SerializedName("name")
    private String name;
    @SerializedName("options")
    private ArrayList<Option> options;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private int price;
    @SerializedName("price_str")
    private String priceStr;
    @SerializedName("thumbnail")
    private String thumbnail;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((Option) Option.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            String readString4 = parcel.readString();
            double readDouble = parcel.readDouble();
            String readString5 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList2.add(parcel.readString());
                readInt3--;
            }
            int readInt4 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList3.add(parcel.readString());
                readInt4--;
            }
            return new Product(readString, readString2, readString3, arrayList, readInt2, readString4, readDouble, readString5, arrayList2, arrayList3, parcel.readInt() != 0, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Product[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        ArrayList<Option> arrayList = this.options;
        parcel.writeInt(arrayList.size());
        for (Option option : arrayList) {
            option.writeToParcel(parcel, 0);
        }
        parcel.writeInt(this.price);
        parcel.writeString(this.priceStr);
        parcel.writeDouble(this.basePrice);
        parcel.writeString(this.thumbnail);
        ArrayList<String> arrayList2 = this.images;
        parcel.writeInt(arrayList2.size());
        for (String str : arrayList2) {
            parcel.writeString(str);
        }
        ArrayList<String> arrayList3 = this.hints;
        parcel.writeInt(arrayList3.size());
        for (String str2 : arrayList3) {
            parcel.writeString(str2);
        }
        parcel.writeInt(this.isFavourite ? 1 : 0);
        Integer num = this.categoryId;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.categoryName);
    }

    public Product(String str, String str2, String str3, ArrayList<Option> arrayList, int i, String str4, double d, String str5, ArrayList<String> arrayList2, ArrayList<String> arrayList3, boolean z, Integer num, String str6) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(arrayList, "options");
        Intrinsics.checkNotNullParameter(str4, "priceStr");
        Intrinsics.checkNotNullParameter(arrayList2, "images");
        Intrinsics.checkNotNullParameter(arrayList3, "hints");
        Intrinsics.checkNotNullParameter(str6, "categoryName");
        this.id = str;
        this.name = str2;
        this.description = str3;
        this.options = arrayList;
        this.price = i;
        this.priceStr = str4;
        this.basePrice = d;
        this.thumbnail = str5;
        this.images = arrayList2;
        this.hints = arrayList3;
        this.isFavourite = z;
        this.categoryId = num;
        this.categoryName = str6;
    }

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Product(String str, String str2, String str3, ArrayList arrayList, int i, String str4, double d, String str5, ArrayList arrayList2, ArrayList arrayList3, boolean z, Integer num, String str6, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? new ArrayList() : arrayList, i, str4, d, (i2 & 128) != 0 ? null : str5, (i2 & 256) != 0 ? new ArrayList() : arrayList2, (i2 & 512) != 0 ? new ArrayList() : arrayList3, (i2 & 1024) != 0 ? false : z, (i2 & 2048) != 0 ? null : num, (i2 & 4096) != 0 ? "" : str6);
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final ArrayList<Option> getOptions() {
        return this.options;
    }

    public final void setOptions(ArrayList<Option> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.options = arrayList;
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

    public final double getBasePrice() {
        return this.basePrice;
    }

    public final void setBasePrice(double d) {
        this.basePrice = d;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    public final ArrayList<String> getImages() {
        return this.images;
    }

    public final void setImages(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.images = arrayList;
    }

    public final ArrayList<String> getHints() {
        return this.hints;
    }

    public final void setHints(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.hints = arrayList;
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final void setFavourite(boolean z) {
        this.isFavourite = z;
    }

    public final Integer getCategoryId() {
        return this.categoryId;
    }

    public final void setCategoryId(Integer num) {
        this.categoryId = num;
    }

    public final String getCategoryName() {
        return this.categoryName;
    }

    public final void setCategoryName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.categoryName = str;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.orders.Product");
        if (!Intrinsics.areEqual(this.id, ((Product) obj).id)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.id.hashCode();
    }
}
