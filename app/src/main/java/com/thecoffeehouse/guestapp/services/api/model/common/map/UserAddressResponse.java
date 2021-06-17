package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R&\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR&\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\f¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressResponse;", "", "()V", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "recentAddresses", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "Lkotlin/collections/ArrayList;", "getRecentAddresses", "()Ljava/util/ArrayList;", "savedAddresses", "getSavedAddresses", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class UserAddressResponse {
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("recent")
    private final ArrayList<AddressSuggestion> recentAddresses = new ArrayList<>();
    @SerializedName("saved")
    private final ArrayList<AddressSuggestion> savedAddresses = new ArrayList<>();

    public final ServerError getError() {
        return this.error;
    }

    public final ArrayList<AddressSuggestion> getSavedAddresses() {
        return this.savedAddresses;
    }

    public final ArrayList<AddressSuggestion> getRecentAddresses() {
        return this.recentAddresses;
    }
}
