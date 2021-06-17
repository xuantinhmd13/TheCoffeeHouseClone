package com.thecoffeehouse.guestapp.services.api.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0018\b\u0002\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f¢\u0006\u0002\u0010\rJ\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0019\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R.\u0010\t\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\nj\b\u0012\u0004\u0012\u00020\u000b`\f8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000f\"\u0004\b\u001b\u0010\u0011R \u0010\b\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0013\"\u0004\b\u001d\u0010\u0015R \u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0013\"\u0004\b\u001f\u0010\u0015¨\u0006&"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "Landroid/os/Parcelable;", "id", "", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "name", "", "title", "thumbnail", "products", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Lkotlin/collections/ArrayList;", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "getId", "()I", "setId", "(I)V", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getProducts", "()Ljava/util/ArrayList;", "setProducts", "(Ljava/util/ArrayList;)V", "getStyle", "setStyle", "getThumbnail", "setThumbnail", "getTitle", "setTitle", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Menu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("id")
    private int id;
    @SerializedName("name")
    private String name;
    @SerializedName("products")
    private ArrayList<Product> products;
    @SerializedName(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)
    private int style;
    @SerializedName("thumbnail")
    private String thumbnail;
    @SerializedName("title")
    private String title;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            int readInt3 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt3);
            while (readInt3 != 0) {
                arrayList.add((Product) Product.CREATOR.createFromParcel(parcel));
                readInt3--;
            }
            return new Menu(readInt, readInt2, readString, readString2, readString3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Menu[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeInt(this.id);
        parcel.writeInt(this.style);
        parcel.writeString(this.name);
        parcel.writeString(this.title);
        parcel.writeString(this.thumbnail);
        ArrayList<Product> arrayList = this.products;
        parcel.writeInt(arrayList.size());
        for (Product product : arrayList) {
            product.writeToParcel(parcel, 0);
        }
    }

    public Menu(int i, int i2, String str, String str2, String str3, ArrayList<Product> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "products");
        this.id = i;
        this.style = i2;
        this.name = str;
        this.title = str2;
        this.thumbnail = str3;
        this.products = arrayList;
    }

    public final int getId() {
        return this.id;
    }

    public final void setId(int i) {
        this.id = i;
    }

    public final int getStyle() {
        return this.style;
    }

    public final void setStyle(int i) {
        this.style = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getThumbnail() {
        return this.thumbnail;
    }

    public final void setThumbnail(String str) {
        this.thumbnail = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Menu(int i, int i2, String str, String str2, String str3, ArrayList arrayList, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? "" : str3, (i3 & 32) != 0 ? new ArrayList() : arrayList);
    }

    public final ArrayList<Product> getProducts() {
        return this.products;
    }

    public final void setProducts(ArrayList<Product> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.products = arrayList;
    }
}
