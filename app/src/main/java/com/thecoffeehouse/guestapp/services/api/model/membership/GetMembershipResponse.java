package com.thecoffeehouse.guestapp.services.api.model.membership;

import com.google.android.gms.common.Scopes;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetMembershipResponse;", "", Scopes.PROFILE, "Lcom/thecoffeehouse/guestapp/services/api/model/membership/Profile;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "(Lcom/thecoffeehouse/guestapp/services/api/model/membership/Profile;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getProfile", "()Lcom/thecoffeehouse/guestapp/services/api/model/membership/Profile;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetMembershipResponse.kt */
public final class GetMembershipResponse {
    @SerializedName("error")
    private final ServerError error;
    @SerializedName(Scopes.PROFILE)
    private final Profile profile;

    public GetMembershipResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ GetMembershipResponse copy$default(GetMembershipResponse getMembershipResponse, Profile profile2, ServerError serverError, int i, Object obj) {
        if ((i & 1) != 0) {
            profile2 = getMembershipResponse.profile;
        }
        if ((i & 2) != 0) {
            serverError = getMembershipResponse.error;
        }
        return getMembershipResponse.copy(profile2, serverError);
    }

    public final Profile component1() {
        return this.profile;
    }

    public final ServerError component2() {
        return this.error;
    }

    public final GetMembershipResponse copy(Profile profile2, ServerError serverError) {
        return new GetMembershipResponse(profile2, serverError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetMembershipResponse)) {
            return false;
        }
        GetMembershipResponse getMembershipResponse = (GetMembershipResponse) obj;
        return Intrinsics.areEqual(this.profile, getMembershipResponse.profile) && Intrinsics.areEqual(this.error, getMembershipResponse.error);
    }

    public int hashCode() {
        Profile profile2 = this.profile;
        int i = 0;
        int hashCode = (profile2 != null ? profile2.hashCode() : 0) * 31;
        ServerError serverError = this.error;
        if (serverError != null) {
            i = serverError.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetMembershipResponse(profile=" + this.profile + ", error=" + this.error + ")";
    }

    public GetMembershipResponse(Profile profile2, ServerError serverError) {
        this.profile = profile2;
        this.error = serverError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetMembershipResponse(Profile profile2, ServerError serverError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : profile2, (i & 2) != 0 ? null : serverError);
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final ServerError getError() {
        return this.error;
    }
}
