package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Viewport;", "", "()V", "northeast", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Northeast;", "getNortheast", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Northeast;", "setNortheast", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Northeast;)V", "southwest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Southwest;", "getSouthwest", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Southwest;", "setSouthwest", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Southwest;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class Viewport {
    @SerializedName("northeast")
    private Northeast northeast;
    @SerializedName("southwest")
    private Southwest southwest;

    public final Northeast getNortheast() {
        return this.northeast;
    }

    public final void setNortheast(Northeast northeast2) {
        this.northeast = northeast2;
    }

    public final Southwest getSouthwest() {
        return this.southwest;
    }

    public final void setSouthwest(Southwest southwest2) {
        this.southwest = southwest2;
    }
}
