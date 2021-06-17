package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestionResponse;", "", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "getAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class AddressSuggestionResponse {
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private final AddressSuggestion address;
    @SerializedName("error")
    private final ServerError error;

    public final ServerError getError() {
        return this.error;
    }

    public final AddressSuggestion getAddress() {
        return this.address;
    }
}
