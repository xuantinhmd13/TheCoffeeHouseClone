package com.thecoffeehouse.guestapp.services.api.model.authen;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B1\u0012\n\u0010\u0002\u001a\u00060\u0003j\u0002`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\r\u0010\u0018\u001a\u00060\u0003j\u0002`\u0004HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\nHÆ\u0003J\t\u0010\u001c\u001a\u00020\fHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\f\b\u0002\u0010\u0002\u001a\u00060\u0003j\u0002`\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001J\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"HÖ\u0003J\t\u0010#\u001a\u00020\bHÖ\u0001J\t\u0010$\u001a\u00020\nHÖ\u0001J\u0019\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00060\u0003j\u0002`\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u000b\u001a\u00020\f8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0016\u0010\t\u001a\u00020\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "Landroid/os/Parcelable;", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "preFill", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/PreFill;", "profileStatus", "", "token", "", Scopes.PROFILE, "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "(Ljava/lang/Error;Lcom/thecoffeehouse/guestapp/services/api/model/authen/PreFill;ILjava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "getError", "()Ljava/lang/Error;", "getPreFill", "()Lcom/thecoffeehouse/guestapp/services/api/model/authen/PreFill;", "getProfile", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "getProfileStatus", "()I", "getToken", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Auth.kt */
public final class AuthResponse implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("error")
    private final Error error;
    @SerializedName("pre_fill")
    private final PreFill preFill;
    @SerializedName(Scopes.PROFILE)
    private final Profile profile;
    @SerializedName("profile_status")
    private final int profileStatus;
    @SerializedName("token")
    private final String token;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new AuthResponse((Error) parcel.readSerializable(), (PreFill) PreFill.CREATOR.createFromParcel(parcel), parcel.readInt(), parcel.readString(), (Profile) Profile.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new AuthResponse[i];
        }
    }

    public static /* synthetic */ AuthResponse copy$default(AuthResponse authResponse, Error error2, PreFill preFill2, int i, String str, Profile profile2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            error2 = authResponse.error;
        }
        if ((i2 & 2) != 0) {
            preFill2 = authResponse.preFill;
        }
        if ((i2 & 4) != 0) {
            i = authResponse.profileStatus;
        }
        if ((i2 & 8) != 0) {
            str = authResponse.token;
        }
        if ((i2 & 16) != 0) {
            profile2 = authResponse.profile;
        }
        return authResponse.copy(error2, preFill2, i, str, profile2);
    }

    public final Error component1() {
        return this.error;
    }

    public final PreFill component2() {
        return this.preFill;
    }

    public final int component3() {
        return this.profileStatus;
    }

    public final String component4() {
        return this.token;
    }

    public final Profile component5() {
        return this.profile;
    }

    public final AuthResponse copy(Error error2, PreFill preFill2, int i, String str, Profile profile2) {
        Intrinsics.checkNotNullParameter(error2, "error");
        Intrinsics.checkNotNullParameter(preFill2, "preFill");
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(profile2, Scopes.PROFILE);
        return new AuthResponse(error2, preFill2, i, str, profile2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthResponse)) {
            return false;
        }
        AuthResponse authResponse = (AuthResponse) obj;
        return Intrinsics.areEqual(this.error, authResponse.error) && Intrinsics.areEqual(this.preFill, authResponse.preFill) && this.profileStatus == authResponse.profileStatus && Intrinsics.areEqual(this.token, authResponse.token) && Intrinsics.areEqual(this.profile, authResponse.profile);
    }

    public int hashCode() {
        Error error2 = this.error;
        int i = 0;
        int hashCode = (error2 != null ? error2.hashCode() : 0) * 31;
        PreFill preFill2 = this.preFill;
        int hashCode2 = (((hashCode + (preFill2 != null ? preFill2.hashCode() : 0)) * 31) + Integer.hashCode(this.profileStatus)) * 31;
        String str = this.token;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Profile profile2 = this.profile;
        if (profile2 != null) {
            i = profile2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "AuthResponse(error=" + this.error + ", preFill=" + this.preFill + ", profileStatus=" + this.profileStatus + ", token=" + this.token + ", profile=" + this.profile + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeSerializable(this.error);
        this.preFill.writeToParcel(parcel, 0);
        parcel.writeInt(this.profileStatus);
        parcel.writeString(this.token);
        this.profile.writeToParcel(parcel, 0);
    }

    public AuthResponse(Error error2, PreFill preFill2, int i, String str, Profile profile2) {
        Intrinsics.checkNotNullParameter(error2, "error");
        Intrinsics.checkNotNullParameter(preFill2, "preFill");
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(profile2, Scopes.PROFILE);
        this.error = error2;
        this.preFill = preFill2;
        this.profileStatus = i;
        this.token = str;
        this.profile = profile2;
    }

    public final Error getError() {
        return this.error;
    }

    public final PreFill getPreFill() {
        return this.preFill;
    }

    public final int getProfileStatus() {
        return this.profileStatus;
    }

    public final String getToken() {
        return this.token;
    }

    public final Profile getProfile() {
        return this.profile;
    }
}
