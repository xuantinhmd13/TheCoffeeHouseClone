package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Southwest;", "", "()V", "lat", "", "getLat", "()Ljava/lang/String;", "setLat", "(Ljava/lang/String;)V", "lng", "getLng", "setLng", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class Southwest {
    @SerializedName("lat")
    private String lat;
    @SerializedName("long")
    private String lng;

    public final String getLat() {
        return this.lat;
    }

    public final void setLat(String str) {
        this.lat = str;
    }

    public final String getLng() {
        return this.lng;
    }

    public final void setLng(String str) {
        this.lng = str;
    }
}
