package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BS\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b¢\u0006\u0002\u0010\fJ\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001d\u0010\"\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0003J\\\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000bHÆ\u0001¢\u0006\u0002\u0010$J\t\u0010%\u001a\u00020\u0003HÖ\u0001J\u0013\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)HÖ\u0003J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\t\u0010+\u001a\u00020\u0005HÖ\u0001J\u0019\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\u0006\u00100\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\b\u0012\u0010\u000e\"\u0004\b\u0013\u0010\u0010R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R \u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0015\"\u0004\b\u0019\u0010\u0017R2\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\n\u0018\u00010\tj\n\u0012\u0004\u0012\u00020\n\u0018\u0001`\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u00061"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/District;", "Landroid/os/Parcelable;", "id", "", "name", "", "count", "stateName", "stores", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)V", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getId", "setId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "getStateName", "setStateName", "getStores", "()Ljava/util/ArrayList;", "setStores", "(Ljava/util/ArrayList;)V", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/util/ArrayList;)Lcom/thecoffeehouse/guestapp/services/api/model/stores/District;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class District implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("state_name")
    @Expose
    private String stateName;
    @SerializedName("stores")
    @Expose
    private ArrayList<Store> stores;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add((Store) Store.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            }
            return new District(valueOf, readString, valueOf2, readString2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new District[i];
        }
    }

    public District() {
        this(null, null, null, null, null, 31, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.stores.District */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ District copy$default(District district, Integer num, String str, Integer num2, String str2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            num = district.id;
        }
        if ((i & 2) != 0) {
            str = district.name;
        }
        if ((i & 4) != 0) {
            num2 = district.count;
        }
        if ((i & 8) != 0) {
            str2 = district.stateName;
        }
        if ((i & 16) != 0) {
            arrayList = district.stores;
        }
        return district.copy(num, str, num2, str2, arrayList);
    }

    public final Integer component1() {
        return this.id;
    }

    public final String component2() {
        return this.name;
    }

    public final Integer component3() {
        return this.count;
    }

    public final String component4() {
        return this.stateName;
    }

    public final ArrayList<Store> component5() {
        return this.stores;
    }

    public final District copy(Integer num, String str, Integer num2, String str2, ArrayList<Store> arrayList) {
        return new District(num, str, num2, str2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof District)) {
            return false;
        }
        District district = (District) obj;
        return Intrinsics.areEqual(this.id, district.id) && Intrinsics.areEqual(this.name, district.name) && Intrinsics.areEqual(this.count, district.count) && Intrinsics.areEqual(this.stateName, district.stateName) && Intrinsics.areEqual(this.stores, district.stores);
    }

    public int hashCode() {
        Integer num = this.id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.count;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.stateName;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        ArrayList<Store> arrayList = this.stores;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "District(id=" + this.id + ", name=" + this.name + ", count=" + this.count + ", stateName=" + this.stateName + ", stores=" + this.stores + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Integer num = this.id;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.name);
        Integer num2 = this.count;
        if (num2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(num2.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.stateName);
        ArrayList<Store> arrayList = this.stores;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (Store store : arrayList) {
                store.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public District(Integer num, String str, Integer num2, String str2, ArrayList<Store> arrayList) {
        this.id = num;
        this.name = str;
        this.count = num2;
        this.stateName = str2;
        this.stores = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ District(Integer num, String str, Integer num2, String str2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : arrayList);
    }

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

    public final Integer getCount() {
        return this.count;
    }

    public final void setCount(Integer num) {
        this.count = num;
    }

    public final String getStateName() {
        return this.stateName;
    }

    public final void setStateName(String str) {
        this.stateName = str;
    }

    public final ArrayList<Store> getStores() {
        return this.stores;
    }

    public final void setStores(ArrayList<Store> arrayList) {
        this.stores = arrayList;
    }
}
