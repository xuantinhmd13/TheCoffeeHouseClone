package com.thecoffeehouse.guestapp.services.api.model.profile;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0002\u0010\nJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J;\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\t\u0010!\u001a\u00020\u0007HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\u0007HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0007HÖ\u0001R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\b\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\f\"\u0004\b\u0018\u0010\u000eR\u001e\u0010\t\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\f\"\u0004\b\u001a\u0010\u000e¨\u0006-"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/profile/MergeProfile;", "Landroid/os/Parcelable;", "last_active", "", "avatar", "", "bean", "", "name", "token", "(JLjava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getAvatar", "()Ljava/lang/String;", "setAvatar", "(Ljava/lang/String;)V", "getBean", "()I", "setBean", "(I)V", "getLast_active", "()J", "setLast_active", "(J)V", "getName", "setName", "getToken", "setToken", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Profile.kt */
public final class MergeProfile implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("avatar")
    private String avatar;
    @SerializedName("bean")
    private int bean;
    @SerializedName("last_active")
    private long last_active;
    @SerializedName("name")
    private String name;
    @SerializedName("token")
    private String token;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new MergeProfile(parcel.readLong(), parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MergeProfile[i];
        }
    }

    public static /* synthetic */ MergeProfile copy$default(MergeProfile mergeProfile, long j, String str, int i, String str2, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = mergeProfile.last_active;
        }
        if ((i2 & 2) != 0) {
            str = mergeProfile.avatar;
        }
        if ((i2 & 4) != 0) {
            i = mergeProfile.bean;
        }
        if ((i2 & 8) != 0) {
            str2 = mergeProfile.name;
        }
        if ((i2 & 16) != 0) {
            str3 = mergeProfile.token;
        }
        return mergeProfile.copy(j, str, i, str2, str3);
    }

    public final long component1() {
        return this.last_active;
    }

    public final String component2() {
        return this.avatar;
    }

    public final int component3() {
        return this.bean;
    }

    public final String component4() {
        return this.name;
    }

    public final String component5() {
        return this.token;
    }

    public final MergeProfile copy(long j, String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "avatar");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "token");
        return new MergeProfile(j, str, i, str2, str3);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MergeProfile)) {
            return false;
        }
        MergeProfile mergeProfile = (MergeProfile) obj;
        return this.last_active == mergeProfile.last_active && Intrinsics.areEqual(this.avatar, mergeProfile.avatar) && this.bean == mergeProfile.bean && Intrinsics.areEqual(this.name, mergeProfile.name) && Intrinsics.areEqual(this.token, mergeProfile.token);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.last_active) * 31;
        String str = this.avatar;
        int i = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.bean)) * 31;
        String str2 = this.name;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.token;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "MergeProfile(last_active=" + this.last_active + ", avatar=" + this.avatar + ", bean=" + this.bean + ", name=" + this.name + ", token=" + this.token + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeLong(this.last_active);
        parcel.writeString(this.avatar);
        parcel.writeInt(this.bean);
        parcel.writeString(this.name);
        parcel.writeString(this.token);
    }

    public MergeProfile(long j, String str, int i, String str2, String str3) {
        Intrinsics.checkNotNullParameter(str, "avatar");
        Intrinsics.checkNotNullParameter(str2, "name");
        Intrinsics.checkNotNullParameter(str3, "token");
        this.last_active = j;
        this.avatar = str;
        this.bean = i;
        this.name = str2;
        this.token = str3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MergeProfile(long j, String str, int i, String str2, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : j, str, i, str2, str3);
    }

    public final long getLast_active() {
        return this.last_active;
    }

    public final void setLast_active(long j) {
        this.last_active = j;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.avatar = str;
    }

    public final int getBean() {
        return this.bean;
    }

    public final void setBean(int i) {
        this.bean = i;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.name = str;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }
}
