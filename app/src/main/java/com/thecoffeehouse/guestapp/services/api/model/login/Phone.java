package com.thecoffeehouse.guestapp.services.api.model.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "Landroid/os/Parcelable;", "regionCode", "", "phoneNumber", "(Ljava/lang/String;Ljava/lang/String;)V", "getPhoneNumber", "()Ljava/lang/String;", "setPhoneNumber", "(Ljava/lang/String;)V", "getRegionCode", "setRegionCode", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class Phone implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("phone_number")
    private String phoneNumber;
    @SerializedName("region_code")
    private String regionCode;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new Phone(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Phone[i];
        }
    }

    public static /* synthetic */ Phone copy$default(Phone phone, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = phone.regionCode;
        }
        if ((i & 2) != 0) {
            str2 = phone.phoneNumber;
        }
        return phone.copy(str, str2);
    }

    public final String component1() {
        return this.regionCode;
    }

    public final String component2() {
        return this.phoneNumber;
    }

    public final Phone copy(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        return new Phone(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Phone)) {
            return false;
        }
        Phone phone = (Phone) obj;
        return Intrinsics.areEqual(this.regionCode, phone.regionCode) && Intrinsics.areEqual(this.phoneNumber, phone.phoneNumber);
    }

    public int hashCode() {
        String str = this.regionCode;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.phoneNumber;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Phone(regionCode=" + this.regionCode + ", phoneNumber=" + this.phoneNumber + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.regionCode);
        parcel.writeString(this.phoneNumber);
    }

    public Phone(String str, String str2) {
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        this.regionCode = str;
        this.phoneNumber = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Phone(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "+84" : str, str2);
    }

    public final String getRegionCode() {
        return this.regionCode;
    }

    public final void setRegionCode(String str) {
        this.regionCode = str;
    }

    public final String getPhoneNumber() {
        return this.phoneNumber;
    }

    public final void setPhoneNumber(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.phoneNumber = str;
    }
}
