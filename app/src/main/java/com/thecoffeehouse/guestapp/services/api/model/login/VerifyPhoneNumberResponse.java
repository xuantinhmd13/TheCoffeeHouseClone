package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003J5\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0005HÖ\u0001J\t\u0010$\u001a\u00020\u0007HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006%"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/VerifyPhoneNumberResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "profileStatus", "", "token", "", Scopes.PROFILE, "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;ILjava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getProfile", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "setProfile", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "getProfileStatus", "()I", "setProfileStatus", "(I)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class VerifyPhoneNumberResponse {
    @SerializedName("error")
    private ServerError error;
    @SerializedName(Scopes.PROFILE)
    private Profile profile;
    @SerializedName("profile_status")
    private int profileStatus;
    @SerializedName("token")
    private String token;

    public static /* synthetic */ VerifyPhoneNumberResponse copy$default(VerifyPhoneNumberResponse verifyPhoneNumberResponse, ServerError serverError, int i, String str, Profile profile2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            serverError = verifyPhoneNumberResponse.error;
        }
        if ((i2 & 2) != 0) {
            i = verifyPhoneNumberResponse.profileStatus;
        }
        if ((i2 & 4) != 0) {
            str = verifyPhoneNumberResponse.token;
        }
        if ((i2 & 8) != 0) {
            profile2 = verifyPhoneNumberResponse.profile;
        }
        return verifyPhoneNumberResponse.copy(serverError, i, str, profile2);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final int component2() {
        return this.profileStatus;
    }

    public final String component3() {
        return this.token;
    }

    public final Profile component4() {
        return this.profile;
    }

    public final VerifyPhoneNumberResponse copy(ServerError serverError, int i, String str, Profile profile2) {
        Intrinsics.checkNotNullParameter(str, "token");
        return new VerifyPhoneNumberResponse(serverError, i, str, profile2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerifyPhoneNumberResponse)) {
            return false;
        }
        VerifyPhoneNumberResponse verifyPhoneNumberResponse = (VerifyPhoneNumberResponse) obj;
        return Intrinsics.areEqual(this.error, verifyPhoneNumberResponse.error) && this.profileStatus == verifyPhoneNumberResponse.profileStatus && Intrinsics.areEqual(this.token, verifyPhoneNumberResponse.token) && Intrinsics.areEqual(this.profile, verifyPhoneNumberResponse.profile);
    }

    public int hashCode() {
        ServerError serverError = this.error;
        int i = 0;
        int hashCode = (((serverError != null ? serverError.hashCode() : 0) * 31) + Integer.hashCode(this.profileStatus)) * 31;
        String str = this.token;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Profile profile2 = this.profile;
        if (profile2 != null) {
            i = profile2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "VerifyPhoneNumberResponse(error=" + this.error + ", profileStatus=" + this.profileStatus + ", token=" + this.token + ", profile=" + this.profile + ")";
    }

    public VerifyPhoneNumberResponse(ServerError serverError, int i, String str, Profile profile2) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.error = serverError;
        this.profileStatus = i;
        this.token = str;
        this.profile = profile2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyPhoneNumberResponse(ServerError serverError, int i, String str, Profile profile2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : serverError, i, str, (i2 & 8) != 0 ? null : profile2);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final int getProfileStatus() {
        return this.profileStatus;
    }

    public final void setProfileStatus(int i) {
        this.profileStatus = i;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final void setProfile(Profile profile2) {
        this.profile = profile2;
    }
}
