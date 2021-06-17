package com.thecoffeehouse.guestapp.services.api.model.stores;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u0003HÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/StorePickUpRequest;", "", "storeId", "", "(I)V", "getStoreId", "()I", "setStoreId", "component1", "copy", "equals", "", "other", "hashCode", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class StorePickUpRequest {
    @SerializedName("store_id")
    @Expose
    private int storeId;

    public static /* synthetic */ StorePickUpRequest copy$default(StorePickUpRequest storePickUpRequest, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = storePickUpRequest.storeId;
        }
        return storePickUpRequest.copy(i);
    }

    public final int component1() {
        return this.storeId;
    }

    public final StorePickUpRequest copy(int i) {
        return new StorePickUpRequest(i);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof StorePickUpRequest) && this.storeId == ((StorePickUpRequest) obj).storeId;
        }
        return true;
    }

    public int hashCode() {
        return Integer.hashCode(this.storeId);
    }

    public String toString() {
        return "StorePickUpRequest(storeId=" + this.storeId + ")";
    }

    public StorePickUpRequest(int i) {
        this.storeId = i;
    }

    public final int getStoreId() {
        return this.storeId;
    }

    public final void setStoreId(int i) {
        this.storeId = i;
    }
}
