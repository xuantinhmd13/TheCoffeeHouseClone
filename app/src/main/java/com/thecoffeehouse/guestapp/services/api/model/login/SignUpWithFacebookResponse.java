package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/SignUpWithFacebookResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", Scopes.PROFILE, "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getProfile", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "setProfile", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class SignUpWithFacebookResponse {
    @SerializedName("error")
    private ServerError error;
    @SerializedName(Scopes.PROFILE)
    private Profile profile;

    public static /* synthetic */ SignUpWithFacebookResponse copy$default(SignUpWithFacebookResponse signUpWithFacebookResponse, ServerError serverError, Profile profile2, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = signUpWithFacebookResponse.error;
        }
        if ((i & 2) != 0) {
            profile2 = signUpWithFacebookResponse.profile;
        }
        return signUpWithFacebookResponse.copy(serverError, profile2);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final Profile component2() {
        return this.profile;
    }

    public final SignUpWithFacebookResponse copy(ServerError serverError, Profile profile2) {
        Intrinsics.checkNotNullParameter(profile2, Scopes.PROFILE);
        return new SignUpWithFacebookResponse(serverError, profile2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SignUpWithFacebookResponse)) {
            return false;
        }
        SignUpWithFacebookResponse signUpWithFacebookResponse = (SignUpWithFacebookResponse) obj;
        return Intrinsics.areEqual(this.error, signUpWithFacebookResponse.error) && Intrinsics.areEqual(this.profile, signUpWithFacebookResponse.profile);
    }

    public int hashCode() {
        ServerError serverError = this.error;
        int i = 0;
        int hashCode = (serverError != null ? serverError.hashCode() : 0) * 31;
        Profile profile2 = this.profile;
        if (profile2 != null) {
            i = profile2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "SignUpWithFacebookResponse(error=" + this.error + ", profile=" + this.profile + ")";
    }

    public SignUpWithFacebookResponse(ServerError serverError, Profile profile2) {
        Intrinsics.checkNotNullParameter(profile2, Scopes.PROFILE);
        this.error = serverError;
        this.profile = profile2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SignUpWithFacebookResponse(ServerError serverError, Profile profile2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, profile2);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final void setProfile(Profile profile2) {
        Intrinsics.checkNotNullParameter(profile2, "<set-?>");
        this.profile = profile2;
    }
}
