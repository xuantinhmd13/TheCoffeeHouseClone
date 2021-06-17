package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.appevents.UserDataStore;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$HÖ\u0003J\t\u0010%\u001a\u00020 HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\u0019\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020 HÖ\u0001R \u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR \u0010\b\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u000b\"\u0004\b\u0011\u0010\rR \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000b\"\u0004\b\u0015\u0010\rR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000b\"\u0004\b\u0017\u0010\r¨\u0006,"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/Address;", "Landroid/os/Parcelable;", "street", "", "ward", "district", "state", UserDataStore.COUNTRY, "fullAddress", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCountry", "()Ljava/lang/String;", "setCountry", "(Ljava/lang/String;)V", "getDistrict", "setDistrict", "getFullAddress", "setFullAddress", "getState", "setState", "getStreet", "setStreet", "getWard", "setWard", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class Address implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName(UserDataStore.COUNTRY)
    private String country;
    @SerializedName("district")
    @Expose
    private String district;
    @SerializedName("full_address")
    private String fullAddress;
    @SerializedName("state")
    @Expose
    private String state;
    @SerializedName("street")
    @Expose
    private String street;
    @SerializedName("ward")
    @Expose
    private String ward;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new Address(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Address[i];
        }
    }

    public Address() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Address copy$default(Address address, String str, String str2, String str3, String str4, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = address.street;
        }
        if ((i & 2) != 0) {
            str2 = address.ward;
        }
        if ((i & 4) != 0) {
            str3 = address.district;
        }
        if ((i & 8) != 0) {
            str4 = address.state;
        }
        if ((i & 16) != 0) {
            str5 = address.country;
        }
        if ((i & 32) != 0) {
            str6 = address.fullAddress;
        }
        return address.copy(str, str2, str3, str4, str5, str6);
    }

    public final String component1() {
        return this.street;
    }

    public final String component2() {
        return this.ward;
    }

    public final String component3() {
        return this.district;
    }

    public final String component4() {
        return this.state;
    }

    public final String component5() {
        return this.country;
    }

    public final String component6() {
        return this.fullAddress;
    }

    public final Address copy(String str, String str2, String str3, String str4, String str5, String str6) {
        return new Address(str, str2, str3, str4, str5, str6);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Address)) {
            return false;
        }
        Address address = (Address) obj;
        return Intrinsics.areEqual(this.street, address.street) && Intrinsics.areEqual(this.ward, address.ward) && Intrinsics.areEqual(this.district, address.district) && Intrinsics.areEqual(this.state, address.state) && Intrinsics.areEqual(this.country, address.country) && Intrinsics.areEqual(this.fullAddress, address.fullAddress);
    }

    public int hashCode() {
        String str = this.street;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.ward;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.district;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.state;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.country;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.fullAddress;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        return "Address(street=" + this.street + ", ward=" + this.ward + ", district=" + this.district + ", state=" + this.state + ", country=" + this.country + ", fullAddress=" + this.fullAddress + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.street);
        parcel.writeString(this.ward);
        parcel.writeString(this.district);
        parcel.writeString(this.state);
        parcel.writeString(this.country);
        parcel.writeString(this.fullAddress);
    }

    public Address(String str, String str2, String str3, String str4, String str5, String str6) {
        this.street = str;
        this.ward = str2;
        this.district = str3;
        this.state = str4;
        this.country = str5;
        this.fullAddress = str6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Address(String str, String str2, String str3, String str4, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6);
    }

    public final String getStreet() {
        return this.street;
    }

    public final void setStreet(String str) {
        this.street = str;
    }

    public final String getWard() {
        return this.ward;
    }

    public final void setWard(String str) {
        this.ward = str;
    }

    public final String getDistrict() {
        return this.district;
    }

    public final void setDistrict(String str) {
        this.district = str;
    }

    public final String getState() {
        return this.state;
    }

    public final void setState(String str) {
        this.state = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final String getFullAddress() {
        return this.fullAddress;
    }

    public final void setFullAddress(String str) {
        this.fullAddress = str;
    }
}
