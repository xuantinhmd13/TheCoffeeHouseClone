package com.thecoffeehouse.guestapp.services.api.model.profile;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J-\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileResponse;", "", "status", "", MessengerShareContentUtility.MEDIA_IMAGE, "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "(Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "getImage", "()Ljava/lang/String;", "getStatus", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Profile.kt */
public final class UpdateProfileResponse {
    @SerializedName("error")
    private final ServerErrorResponse error;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private final String image;
    @SerializedName("status")
    private final String status;

    public UpdateProfileResponse() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UpdateProfileResponse copy$default(UpdateProfileResponse updateProfileResponse, String str, String str2, ServerErrorResponse serverErrorResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateProfileResponse.status;
        }
        if ((i & 2) != 0) {
            str2 = updateProfileResponse.image;
        }
        if ((i & 4) != 0) {
            serverErrorResponse = updateProfileResponse.error;
        }
        return updateProfileResponse.copy(str, str2, serverErrorResponse);
    }

    public final String component1() {
        return this.status;
    }

    public final String component2() {
        return this.image;
    }

    public final ServerErrorResponse component3() {
        return this.error;
    }

    public final UpdateProfileResponse copy(String str, String str2, ServerErrorResponse serverErrorResponse) {
        return new UpdateProfileResponse(str, str2, serverErrorResponse);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UpdateProfileResponse)) {
            return false;
        }
        UpdateProfileResponse updateProfileResponse = (UpdateProfileResponse) obj;
        return Intrinsics.areEqual(this.status, updateProfileResponse.status) && Intrinsics.areEqual(this.image, updateProfileResponse.image) && Intrinsics.areEqual(this.error, updateProfileResponse.error);
    }

    public int hashCode() {
        String str = this.status;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.image;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        ServerErrorResponse serverErrorResponse = this.error;
        if (serverErrorResponse != null) {
            i = serverErrorResponse.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "UpdateProfileResponse(status=" + this.status + ", image=" + this.image + ", error=" + this.error + ")";
    }

    public UpdateProfileResponse(String str, String str2, ServerErrorResponse serverErrorResponse) {
        this.status = str;
        this.image = str2;
        this.error = serverErrorResponse;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ UpdateProfileResponse(String str, String str2, ServerErrorResponse serverErrorResponse, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : serverErrorResponse);
    }

    public final String getStatus() {
        return this.status;
    }

    public final String getImage() {
        return this.image;
    }

    public final ServerErrorResponse getError() {
        return this.error;
    }
}
