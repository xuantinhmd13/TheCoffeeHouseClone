package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GeometryLocation;", "", "()V", "lat", "", "getLat", "()D", "setLat", "(D)V", "long", "getLong", "setLong", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class GeometryLocation {
    @SerializedName("lat")
    private double lat;
    @SerializedName("long")

    /* renamed from: long  reason: not valid java name */
    private double f1long;

    public final double getLat() {
        return this.lat;
    }

    public final void setLat(double d) {
        this.lat = d;
    }

    public final double getLong() {
        return this.f1long;
    }

    public final void setLong(double d) {
        this.f1long = d;
    }
}
