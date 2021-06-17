package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\t\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/RequestOTPPhoneNumberResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class RequestOTPPhoneNumberResponse {
    @SerializedName("error")
    private ServerError error;

    public RequestOTPPhoneNumberResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ RequestOTPPhoneNumberResponse copy$default(RequestOTPPhoneNumberResponse requestOTPPhoneNumberResponse, ServerError serverError, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = requestOTPPhoneNumberResponse.error;
        }
        return requestOTPPhoneNumberResponse.copy(serverError);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final RequestOTPPhoneNumberResponse copy(ServerError serverError) {
        return new RequestOTPPhoneNumberResponse(serverError);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof RequestOTPPhoneNumberResponse) && Intrinsics.areEqual(this.error, ((RequestOTPPhoneNumberResponse) obj).error);
        }
        return true;
    }

    public int hashCode() {
        ServerError serverError = this.error;
        if (serverError != null) {
            return serverError.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "RequestOTPPhoneNumberResponse(error=" + this.error + ")";
    }

    public RequestOTPPhoneNumberResponse(ServerError serverError) {
        this.error = serverError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RequestOTPPhoneNumberResponse(ServerError serverError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }
}
