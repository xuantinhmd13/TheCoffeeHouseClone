package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\rJ\u001d\u0010\u001e\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0003JP\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\nHÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0003HÖ\u0001R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR2\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0018\u00010\bj\n\u0012\u0004\u0012\u00020\t\u0018\u0001`\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\u0015\u0010\r\"\u0004\b\u0016\u0010\u000fR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006-"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/State;", "Landroid/os/Parcelable;", "id", "", "name", "", "count", "districts", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/District;", "Lkotlin/collections/ArrayList;", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)V", "getCount", "()Ljava/lang/Integer;", "setCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getDistricts", "()Ljava/util/ArrayList;", "setDistricts", "(Ljava/util/ArrayList;)V", "getId", "setId", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;)Lcom/thecoffeehouse/guestapp/services/api/model/stores/State;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class State implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("count")
    @Expose
    private Integer count;
    @SerializedName("districts")
    @Expose
    private ArrayList<District> districts;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("name")
    @Expose
    private String name;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            ArrayList arrayList = null;
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList2.add((District) District.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
                arrayList = arrayList2;
            }
            return new State(valueOf, readString, valueOf2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new State[i];
        }
    }

    public State() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.stores.State */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ State copy$default(State state, Integer num, String str, Integer num2, ArrayList arrayList, int i, Object obj) {
        if ((i & 1) != 0) {
            num = state.id;
        }
        if ((i & 2) != 0) {
            str = state.name;
        }
        if ((i & 4) != 0) {
            num2 = state.count;
        }
        if ((i & 8) != 0) {
            arrayList = state.districts;
        }
        return state.copy(num, str, num2, arrayList);
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

    public final ArrayList<District> component4() {
        return this.districts;
    }

    public final State copy(Integer num, String str, Integer num2, ArrayList<District> arrayList) {
        return new State(num, str, num2, arrayList);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof State)) {
            return false;
        }
        State state = (State) obj;
        return Intrinsics.areEqual(this.id, state.id) && Intrinsics.areEqual(this.name, state.name) && Intrinsics.areEqual(this.count, state.count) && Intrinsics.areEqual(this.districts, state.districts);
    }

    public int hashCode() {
        Integer num = this.id;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.count;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        ArrayList<District> arrayList = this.districts;
        if (arrayList != null) {
            i = arrayList.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "State(id=" + this.id + ", name=" + this.name + ", count=" + this.count + ", districts=" + this.districts + ")";
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
        ArrayList<District> arrayList = this.districts;
        if (arrayList != null) {
            parcel.writeInt(1);
            parcel.writeInt(arrayList.size());
            for (District district : arrayList) {
                district.writeToParcel(parcel, 0);
            }
            return;
        }
        parcel.writeInt(0);
    }

    public State(Integer num, String str, Integer num2, ArrayList<District> arrayList) {
        this.id = num;
        this.name = str;
        this.count = num2;
        this.districts = arrayList;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ State(Integer num, String str, Integer num2, ArrayList arrayList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : arrayList);
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

    public final ArrayList<District> getDistricts() {
        return this.districts;
    }

    public final void setDistricts(ArrayList<District> arrayList) {
        this.districts = arrayList;
    }
}
