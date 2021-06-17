package com.thecoffeehouse.guestapp.services.api.model.profile;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B'\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tR&\u0010\u0002\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001e\u0010\u0007\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/profile/GetProfileResponse;", "", "error", "Ljava/lang/Error;", "Lkotlin/Error;", "profileStatus", "", Scopes.PROFILE, "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "(Ljava/lang/Error;ILcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "getError", "()Ljava/lang/Error;", "setError", "(Ljava/lang/Error;)V", "getProfile", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "setProfile", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;)V", "getProfileStatus", "()I", "setProfileStatus", "(I)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Profile.kt */
public final class GetProfileResponse {
    @SerializedName("error")
    private Error error;
    @SerializedName(Scopes.PROFILE)
    private Profile profile;
    @SerializedName("profile_status")
    private int profileStatus;

    public GetProfileResponse(Error error2, int i, Profile profile2) {
        Intrinsics.checkNotNullParameter(profile2, Scopes.PROFILE);
        this.error = error2;
        this.profileStatus = i;
        this.profile = profile2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetProfileResponse(Error error2, int i, Profile profile2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : error2, i, profile2);
    }

    public final Error getError() {
        return this.error;
    }

    public final void setError(Error error2) {
        this.error = error2;
    }

    public final int getProfileStatus() {
        return this.profileStatus;
    }

    public final void setProfileStatus(int i) {
        this.profileStatus = i;
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final void setProfile(Profile profile2) {
        Intrinsics.checkNotNullParameter(profile2, "<set-?>");
        this.profile = profile2;
    }
}
