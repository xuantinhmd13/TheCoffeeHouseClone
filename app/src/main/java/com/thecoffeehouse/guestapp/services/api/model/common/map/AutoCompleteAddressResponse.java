package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R&\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AutoCompleteAddressResponse;", "", "()V", "addresses", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "Lkotlin/collections/ArrayList;", "getAddresses", "()Ljava/util/ArrayList;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "sessionToken", "", "getSessionToken", "()Ljava/lang/String;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class AutoCompleteAddressResponse {
    @SerializedName("addresses")
    private final ArrayList<AddressSuggestion> addresses = new ArrayList<>();
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("session_token")
    private final String sessionToken;

    public final ServerError getError() {
        return this.error;
    }

    public final String getSessionToken() {
        return this.sessionToken;
    }

    public final ArrayList<AddressSuggestion> getAddresses() {
        return this.addresses;
    }
}
