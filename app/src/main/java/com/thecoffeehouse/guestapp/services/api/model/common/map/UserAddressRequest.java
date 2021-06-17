package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010\u0005\"\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressRequest;", "", "isHaveRecent", "", "(Z)V", "()Z", "setHaveRecent", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class UserAddressRequest {
    @SerializedName("is_have_recent")
    private boolean isHaveRecent = true;

    public UserAddressRequest(boolean z) {
        this.isHaveRecent = z;
    }

    public final boolean isHaveRecent() {
        return this.isHaveRecent;
    }

    public final void setHaveRecent(boolean z) {
        this.isHaveRecent = z;
    }
}
