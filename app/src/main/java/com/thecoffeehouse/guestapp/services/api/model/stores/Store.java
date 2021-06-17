package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0002\u0010\u0014J\t\u00109\u001a\u00020\u0003HÖ\u0001J\u0013\u0010:\u001a\u00020\u00122\b\u0010;\u001a\u0004\u0018\u00010<H\u0002J\b\u0010=\u001a\u00020\u0003H\u0016J\u0019\u0010>\u001a\u00020?2\u0006\u0010@\u001a\u00020A2\u0006\u0010B\u001a\u00020\u0003HÖ\u0001R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0010\n\u0002\u0010\u001d\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010&\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R$\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u0011\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010+\"\u0004\b,\u0010-R\u001a\u0010\u0013\u001a\u00020\u0012X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010+\"\u0004\b.\u0010-R \u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010\u001f\"\u0004\b4\u0010!R \u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R \u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!¨\u0006C"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "Landroid/os/Parcelable;", "id", "", "name", "", "openTime", "images", "", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Address;", "fullAddress", "phone", "locationStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "distance", "", "isFavourite", "", "isRecent", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/stores/Address;Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;Ljava/lang/Double;ZZ)V", "getAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/Address;", "setAddress", "(Lcom/thecoffeehouse/guestapp/services/api/model/stores/Address;)V", "getDistance", "()Ljava/lang/Double;", "setDistance", "(Ljava/lang/Double;)V", "Ljava/lang/Double;", "getFullAddress", "()Ljava/lang/String;", "setFullAddress", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getImages", "()Ljava/util/List;", "setImages", "(Ljava/util/List;)V", "()Z", "setFavourite", "(Z)V", "setRecent", "getLocationStore", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "setLocationStore", "(Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;)V", "getName", "setName", "getOpenTime", "setOpenTime", "getPhone", "setPhone", "describeContents", "equals", "other", "", "hashCode", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class Store implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    @Expose
    private Address address;
    private Double distance;
    @SerializedName("full_address")
    private String fullAddress;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("images")
    @Expose
    private List<String> images;
    private boolean isFavourite;
    private boolean isRecent;
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    @Expose
    private LocationStore locationStore;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("open_time")
    @Expose
    private String openTime;
    @SerializedName("phone")
    @Expose
    private String phone;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Address address = parcel.readInt() != 0 ? (Address) Address.CREATOR.createFromParcel(parcel) : null;
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            LocationStore locationStore = parcel.readInt() != 0 ? (LocationStore) LocationStore.CREATOR.createFromParcel(parcel) : null;
            Double valueOf2 = parcel.readInt() != 0 ? Double.valueOf(parcel.readDouble()) : null;
            boolean z = false;
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new Store(valueOf, readString, readString2, createStringArrayList, address, readString3, readString4, locationStore, valueOf2, z2, z);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Store[i];
        }
    }

    public Store() {
        this(null, null, null, null, null, null, null, null, null, false, false, 2047, null);
    }

    public int describeContents() {
        return 0;
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
        parcel.writeString(this.openTime);
        parcel.writeStringList(this.images);
        Address address2 = this.address;
        if (address2 != null) {
            parcel.writeInt(1);
            address2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.fullAddress);
        parcel.writeString(this.phone);
        LocationStore locationStore2 = this.locationStore;
        if (locationStore2 != null) {
            parcel.writeInt(1);
            locationStore2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Double d = this.distance;
        if (d != null) {
            parcel.writeInt(1);
            parcel.writeDouble(d.doubleValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.isFavourite ? 1 : 0);
        parcel.writeInt(this.isRecent ? 1 : 0);
    }

    public Store(Integer num, String str, String str2, List<String> list, Address address2, String str3, String str4, LocationStore locationStore2, Double d, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(list, "images");
        Intrinsics.checkNotNullParameter(str3, "fullAddress");
        this.id = num;
        this.name = str;
        this.openTime = str2;
        this.images = list;
        this.address = address2;
        this.fullAddress = str3;
        this.phone = str4;
        this.locationStore = locationStore2;
        this.distance = d;
        this.isFavourite = z;
        this.isRecent = z2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Store(Integer num, String str, String str2, List list, Address address2, String str3, String str4, LocationStore locationStore2, Double d, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? new ArrayList() : list, (i & 16) != 0 ? null : address2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : locationStore2, (i & 256) != 0 ? null : d, (i & 512) != 0 ? false : z, (i & 1024) == 0 ? z2 : false);
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

    public final String getOpenTime() {
        return this.openTime;
    }

    public final void setOpenTime(String str) {
        this.openTime = str;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final void setImages(List<String> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.images = list;
    }

    public final Address getAddress() {
        return this.address;
    }

    public final void setAddress(Address address2) {
        this.address = address2;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final void setFullAddress(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.fullAddress = str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final LocationStore getLocationStore() {
        return this.locationStore;
    }

    public final void setLocationStore(LocationStore locationStore2) {
        this.locationStore = locationStore2;
    }

    public final Double getDistance() {
        return this.distance;
    }

    public final void setDistance(Double d) {
        this.distance = d;
    }

    public final boolean isFavourite() {
        return this.isFavourite;
    }

    public final void setFavourite(boolean z) {
        this.isFavourite = z;
    }

    public final boolean isRecent() {
        return this.isRecent;
    }

    public final void setRecent(boolean z) {
        this.isRecent = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!Intrinsics.areEqual(getClass(), obj != null ? obj.getClass() : null)) {
            return false;
        }
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.stores.Store");
        Store store = (Store) obj;
        if (!(!Intrinsics.areEqual(this.id, store.id)) && !(!Intrinsics.areEqual(this.name, store.name)) && !(!Intrinsics.areEqual(this.openTime, store.openTime)) && !(!Intrinsics.areEqual(this.images, store.images)) && !(!Intrinsics.areEqual(this.fullAddress, store.fullAddress)) && !(!Intrinsics.areEqual(this.phone, store.phone)) && !(!Intrinsics.areEqual(this.locationStore, store.locationStore)) && !(!Intrinsics.areEqual(this.distance, store.distance)) && this.isFavourite == store.isFavourite && this.isRecent == store.isRecent) {
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
        String str2 = this.openTime;
        int hashCode2 = (((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + this.images.hashCode()) * 31;
        String str3 = this.fullAddress;
        int intValue2 = (hashCode2 + (str3 != null ? Integer.valueOf(str3.hashCode()) : null).intValue()) * 31;
        String str4 = this.phone;
        int hashCode3 = (intValue2 + (str4 != null ? str4.hashCode() : 0)) * 31;
        LocationStore locationStore2 = this.locationStore;
        int hashCode4 = (hashCode3 + (locationStore2 != null ? locationStore2.hashCode() : 0)) * 31;
        Double d = this.distance;
        if (d != null) {
            i = Double.hashCode(d.doubleValue());
        }
        return ((((hashCode4 + i) * 31) + Boolean.hashCode(this.isFavourite)) * 31) + Boolean.hashCode(this.isRecent);
    }
}
