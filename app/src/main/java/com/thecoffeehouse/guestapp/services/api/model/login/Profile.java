package com.thecoffeehouse.guestapp.services.api.model.login;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b/\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001By\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0003HÆ\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00101\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u00104\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u001dJ\u000b\u00105\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u00106\u001a\u00020\u000bHÆ\u0003J\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001¢\u0006\u0002\u00108J\t\u00109\u001a\u00020\u000bHÖ\u0001J\u0013\u0010:\u001a\u00020;2\b\u0010<\u001a\u0004\u0018\u00010=HÖ\u0003J\u0006\u0010>\u001a\u00020\u0003J\t\u0010?\u001a\u00020\u000bHÖ\u0001J\b\u0010@\u001a\u00020\u0003H\u0016J\u0019\u0010A\u001a\u00020B2\u0006\u0010C\u001a\u00020D2\u0006\u0010E\u001a\u00020\u000bHÖ\u0001R \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\f\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R \u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R \u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0011\"\u0004\b\u0019\u0010\u0013R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\"\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0011\"\u0004\b\"\u0010\u0013R \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\u000e\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0011\"\u0004\b,\u0010\u0013¨\u0006F"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "Landroid/os/Parcelable;", "firstName", "", "lastName", "email", "birthday", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "avatar", "gender", "", "barcode", "rankId", "token", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getBarcode", "setBarcode", "getBirthday", "setBirthday", "getEmail", "setEmail", "getFirstName", "setFirstName", "getGender", "()Ljava/lang/Integer;", "setGender", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getLastName", "setLastName", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "setPhone", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;)V", "getRankId", "()I", "setRankId", "(I)V", "getToken", "setToken", "component1", "component10", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;ILjava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "describeContents", "equals", "", "other", "", "getFullName", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class Profile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("barcode")
    private String barcode;
    @SerializedName("birthday")
    private String birthday;
    @SerializedName("email")
    private String email;
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("gender")
    private Integer gender;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("phone")
    private Phone phone;
    @SerializedName("rank_id")
    private int rankId;
    private String token;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new Profile(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (Phone) Phone.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new Profile[i];
        }
    }

    public Profile() {
        this(null, null, null, null, null, null, null, null, 0, null, 1023, null);
    }

    public static /* synthetic */ Profile copy$default(Profile profile, String str, String str2, String str3, String str4, Phone phone2, String str5, Integer num, String str6, int i, String str7, int i2, Object obj) {
        return profile.copy((i2 & 1) != 0 ? profile.firstName : str, (i2 & 2) != 0 ? profile.lastName : str2, (i2 & 4) != 0 ? profile.email : str3, (i2 & 8) != 0 ? profile.birthday : str4, (i2 & 16) != 0 ? profile.phone : phone2, (i2 & 32) != 0 ? profile.avatar : str5, (i2 & 64) != 0 ? profile.gender : num, (i2 & 128) != 0 ? profile.barcode : str6, (i2 & 256) != 0 ? profile.rankId : i, (i2 & 512) != 0 ? profile.token : str7);
    }

    public final String component1() {
        return this.firstName;
    }

    public final String component10() {
        return this.token;
    }

    public final String component2() {
        return this.lastName;
    }

    public final String component3() {
        return this.email;
    }

    public final String component4() {
        return this.birthday;
    }

    public final Phone component5() {
        return this.phone;
    }

    public final String component6() {
        return this.avatar;
    }

    public final Integer component7() {
        return this.gender;
    }

    public final String component8() {
        return this.barcode;
    }

    public final int component9() {
        return this.rankId;
    }

    public final Profile copy(String str, String str2, String str3, String str4, Phone phone2, String str5, Integer num, String str6, int i, String str7) {
        Intrinsics.checkNotNullParameter(str7, "token");
        return new Profile(str, str2, str3, str4, phone2, str5, num, str6, i, str7);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return Intrinsics.areEqual(this.firstName, profile.firstName) && Intrinsics.areEqual(this.lastName, profile.lastName) && Intrinsics.areEqual(this.email, profile.email) && Intrinsics.areEqual(this.birthday, profile.birthday) && Intrinsics.areEqual(this.phone, profile.phone) && Intrinsics.areEqual(this.avatar, profile.avatar) && Intrinsics.areEqual(this.gender, profile.gender) && Intrinsics.areEqual(this.barcode, profile.barcode) && this.rankId == profile.rankId && Intrinsics.areEqual(this.token, profile.token);
    }

    public int hashCode() {
        String str = this.firstName;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.lastName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.email;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.birthday;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        Phone phone2 = this.phone;
        int hashCode5 = (hashCode4 + (phone2 != null ? phone2.hashCode() : 0)) * 31;
        String str5 = this.avatar;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.gender;
        int hashCode7 = (hashCode6 + (num != null ? num.hashCode() : 0)) * 31;
        String str6 = this.barcode;
        int hashCode8 = (((hashCode7 + (str6 != null ? str6.hashCode() : 0)) * 31) + Integer.hashCode(this.rankId)) * 31;
        String str7 = this.token;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode8 + i;
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.firstName);
        parcel.writeString(this.lastName);
        parcel.writeString(this.email);
        parcel.writeString(this.birthday);
        Phone phone2 = this.phone;
        if (phone2 != null) {
            parcel.writeInt(1);
            phone2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.avatar);
        Integer num = this.gender;
        if (num != null) {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.barcode);
        parcel.writeInt(this.rankId);
        parcel.writeString(this.token);
    }

    public Profile(String str, String str2, String str3, String str4, Phone phone2, String str5, Integer num, String str6, int i, String str7) {
        Intrinsics.checkNotNullParameter(str7, "token");
        this.firstName = str;
        this.lastName = str2;
        this.email = str3;
        this.birthday = str4;
        this.phone = phone2;
        this.avatar = str5;
        this.gender = num;
        this.barcode = str6;
        this.rankId = i;
        this.token = str7;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Profile(String str, String str2, String str3, String str4, Phone phone2, String str5, Integer num, String str6, int i, String str7, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? null : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : str4, (i2 & 16) != 0 ? null : phone2, (i2 & 32) != 0 ? null : str5, (i2 & 64) != 0 ? null : num, (i2 & 128) != 0 ? null : str6, (i2 & 256) != 0 ? 1 : i, (i2 & 512) != 0 ? "" : str7);
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String str) {
        this.firstName = str;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String str) {
        this.lastName = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }

    public final String getBirthday() {
        return this.birthday;
    }

    public final void setBirthday(String str) {
        this.birthday = str;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final void setPhone(Phone phone2) {
        this.phone = phone2;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public final Integer getGender() {
        return this.gender;
    }

    public final void setGender(Integer num) {
        this.gender = num;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final void setBarcode(String str) {
        this.barcode = str;
    }

    public final int getRankId() {
        return this.rankId;
    }

    public final void setRankId(int i) {
        this.rankId = i;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public String toString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }

    public final String getFullName() {
        return Intrinsics.stringPlus(this.firstName, " ") + this.lastName;
    }
}
