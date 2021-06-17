package com.thecoffeehouse.guestapp.services.api.model.stores;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00052\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/StorePickUpResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "status", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Z)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getStatus", "()Z", "setStatus", "(Z)V", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class StorePickUpResponse {
    @SerializedName("error")
    @Expose
    private ServerError error;
    @SerializedName("status")
    @Expose
    private boolean status;

    public static /* synthetic */ StorePickUpResponse copy$default(StorePickUpResponse storePickUpResponse, ServerError serverError, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = storePickUpResponse.error;
        }
        if ((i & 2) != 0) {
            z = storePickUpResponse.status;
        }
        return storePickUpResponse.copy(serverError, z);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final boolean component2() {
        return this.status;
    }

    public final StorePickUpResponse copy(ServerError serverError, boolean z) {
        return new StorePickUpResponse(serverError, z);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StorePickUpResponse)) {
            return false;
        }
        StorePickUpResponse storePickUpResponse = (StorePickUpResponse) obj;
        return Intrinsics.areEqual(this.error, storePickUpResponse.error) && this.status == storePickUpResponse.status;
    }

    public int hashCode() {
        ServerError serverError = this.error;
        int hashCode = (serverError != null ? serverError.hashCode() : 0) * 31;
        boolean z = this.status;
        if (z) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        int i3 = z ? 1 : 0;
        return hashCode + i;
    }

    public String toString() {
        return "StorePickUpResponse(error=" + this.error + ", status=" + this.status + ")";
    }

    public StorePickUpResponse(ServerError serverError, boolean z) {
        this.error = serverError;
        this.status = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ StorePickUpResponse(ServerError serverError, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, z);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final boolean getStatus() {
        return this.status;
    }

    public final void setStatus(boolean z) {
        this.status = z;
    }
}
