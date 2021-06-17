package com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExternalAccount.kt */
public final class LinkHaravanResponse {
    @SerializedName("error")
    private final ServerError error;

    public LinkHaravanResponse() {
        this(null, 1, null);
    }

    public static /* synthetic */ LinkHaravanResponse copy$default(LinkHaravanResponse linkHaravanResponse, ServerError serverError, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = linkHaravanResponse.error;
        }
        return linkHaravanResponse.copy(serverError);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final LinkHaravanResponse copy(ServerError serverError) {
        return new LinkHaravanResponse(serverError);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof LinkHaravanResponse) && Intrinsics.areEqual(this.error, ((LinkHaravanResponse) obj).error);
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
        return "LinkHaravanResponse(error=" + this.error + ")";
    }

    public LinkHaravanResponse(ServerError serverError) {
        this.error = serverError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LinkHaravanResponse(ServerError serverError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError);
    }

    public final ServerError getError() {
        return this.error;
    }
}
