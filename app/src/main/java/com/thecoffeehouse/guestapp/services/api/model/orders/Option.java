package com.thecoffeehouse.guestapp.services.api.model.orders;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0018\b\u0002\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r¢\u0006\u0002\u0010\u000eJ\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\t\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR.\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\b\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0010\"\u0004\b!\u0010\u0012R\u001e\u0010\u0007\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0010\"\u0004\b#\u0010\u0012R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0014\"\u0004\b%\u0010\u0016¨\u0006,"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Option;", "Landroid/os/Parcelable;", "groupId", "", "name", "", "description", "min", "max", "defaultIndex", FirebaseAnalytics.Param.ITEMS, "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;IIILjava/util/ArrayList;)V", "getDefaultIndex", "()I", "setDefaultIndex", "(I)V", "getDescription", "()Ljava/lang/String;", "setDescription", "(Ljava/lang/String;)V", "getGroupId", "()Ljava/lang/Integer;", "setGroupId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getItems", "()Ljava/util/ArrayList;", "setItems", "(Ljava/util/ArrayList;)V", "getMax", "setMax", "getMin", "setMin", "getName", "setName", "describeContents", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Option implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("default_index")
    private int defaultIndex;
    @SerializedName("description")
    private String description;
    @SerializedName(FirebaseAnalytics.Param.GROUP_ID)
    private Integer groupId;
    @SerializedName(FirebaseAnalytics.Param.ITEMS)
    private ArrayList<Item> items;
    @SerializedName("max")
    private int max;
    @SerializedName("min")
    private int min;
    @SerializedName("name")
    private String name;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            int readInt2 = parcel.readInt();
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt4);
            while (readInt4 != 0) {
                arrayList.add((Item) Item.CREATOR.createFromParcel(parcel));
                readInt4--;
            }
            return new Option(valueOf, readString, readString2, readInt, readInt2, readInt3, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Option[i];
        }
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Integer num = this.groupId;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.name);
        parcel.writeString(this.description);
        parcel.writeInt(this.min);
        parcel.writeInt(this.max);
        parcel.writeInt(this.defaultIndex);
        ArrayList<Item> arrayList = this.items;
        parcel.writeInt(arrayList.size());
        for (Item item : arrayList) {
            item.writeToParcel(parcel, 0);
        }
    }

    public Option(Integer num, String str, String str2, int i, int i2, int i3, ArrayList<Item> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, FirebaseAnalytics.Param.ITEMS);
        this.groupId = num;
        this.name = str;
        this.description = str2;
        this.min = i;
        this.max = i2;
        this.defaultIndex = i3;
        this.items = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Option(Integer num, String str, String str2, int i, int i2, int i3, ArrayList arrayList, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : num, (i4 & 2) != 0 ? null : str, (i4 & 4) != 0 ? null : str2, i, i2, i3, (i4 & 64) != 0 ? new ArrayList() : arrayList);
    }

    public final Integer getGroupId() {
        return this.groupId;
    }

    public final void setGroupId(Integer num) {
        this.groupId = num;
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

    public final int getDefaultIndex() {
        return this.defaultIndex;
    }

    public final void setDefaultIndex(int i) {
        this.defaultIndex = i;
    }

    public final ArrayList<Item> getItems() {
        return this.items;
    }

    public final void setItems(ArrayList<Item> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.items = arrayList;
    }
}
