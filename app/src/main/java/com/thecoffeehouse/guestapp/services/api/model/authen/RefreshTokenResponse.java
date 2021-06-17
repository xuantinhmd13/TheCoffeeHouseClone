package com.thecoffeehouse.guestapp.services.api.model.authen;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/authen/RefreshTokenResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "token", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/lang/String;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getToken", "()Ljava/lang/String;", "setToken", "(Ljava/lang/String;)V", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Auth.kt */
public final class RefreshTokenResponse {
    @SerializedName("error")
    private ServerError error;
    @SerializedName("token")
    private String token;

    public RefreshTokenResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ RefreshTokenResponse copy$default(RefreshTokenResponse refreshTokenResponse, ServerError serverError, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = refreshTokenResponse.error;
        }
        if ((i & 2) != 0) {
            str = refreshTokenResponse.token;
        }
        return refreshTokenResponse.copy(serverError, str);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final String component2() {
        return this.token;
    }

    public final RefreshTokenResponse copy(ServerError serverError, String str) {
        return new RefreshTokenResponse(serverError, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RefreshTokenResponse)) {
            return false;
        }
        RefreshTokenResponse refreshTokenResponse = (RefreshTokenResponse) obj;
        return Intrinsics.areEqual(this.error, refreshTokenResponse.error) && Intrinsics.areEqual(this.token, refreshTokenResponse.token);
    }

    public int hashCode() {
        ServerError serverError = this.error;
        int i = 0;
        int hashCode = (serverError != null ? serverError.hashCode() : 0) * 31;
        String str = this.token;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RefreshTokenResponse(error=" + this.error + ", token=" + this.token + ")";
    }

    public RefreshTokenResponse(ServerError serverError, String str) {
        this.error = serverError;
        this.token = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RefreshTokenResponse(ServerError serverError, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, (i & 2) != 0 ? null : str);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        this.token = str;
    }
}
