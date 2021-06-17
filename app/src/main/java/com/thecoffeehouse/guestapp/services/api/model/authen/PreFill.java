package com.thecoffeehouse.guestapp.services.api.model.authen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J7\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/authen/PreFill;", "Landroid/os/Parcelable;", "firstName", "", "birthday", "avatar", "gender", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)V", "getAvatar", "()Ljava/lang/String;", "getBirthday", "getFirstName", "getGender", "()I", "component1", "component2", "component3", "component4", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Auth.kt */
public final class PreFill implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("avatar")
    private final String avatar;
    @SerializedName("birthday")
    private final String birthday;
    @SerializedName("first_name")
    private final String firstName;
    @SerializedName("gender")
    private final int gender;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new PreFill(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new PreFill[i];
        }
    }

    public PreFill() {
        this(null, null, null, 0, 15, null);
    }

    public static /* synthetic */ PreFill copy$default(PreFill preFill, String str, String str2, String str3, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = preFill.firstName;
        }
        if ((i2 & 2) != 0) {
            str2 = preFill.birthday;
        }
        if ((i2 & 4) != 0) {
            str3 = preFill.avatar;
        }
        if ((i2 & 8) != 0) {
            i = preFill.gender;
        }
        return preFill.copy(str, str2, str3, i);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component2() {
        return this.birthday;
    }

    public final String component3() {
        return this.avatar;
    }

    public final int component4() {
        return this.gender;
    }

    public final PreFill copy(String str, String str2, String str3, int i) {
        return new PreFill(str, str2, str3, i);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PreFill)) {
            return false;
        }
        PreFill preFill = (PreFill) obj;
        return Intrinsics.areEqual(this.firstName, preFill.firstName) && Intrinsics.areEqual(this.birthday, preFill.birthday) && Intrinsics.areEqual(this.avatar, preFill.avatar) && this.gender == preFill.gender;
    }

    public int hashCode() {
        String str = this.firstName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.birthday;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.avatar;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + Integer.hashCode(this.gender);
    }

    public String toString() {
        return "PreFill(firstName=" + this.firstName + ", birthday=" + this.birthday + ", avatar=" + this.avatar + ", gender=" + this.gender + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.firstName);
        parcel.writeString(this.birthday);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.gender);
    }

    public PreFill(String str, String str2, String str3, int i) {
        this.firstName = str;
        this.birthday = str2;
        this.avatar = str3;
        this.gender = i;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PreFill(String str, String str2, String str3, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final int getGender() {
        return this.gender;
    }
}
