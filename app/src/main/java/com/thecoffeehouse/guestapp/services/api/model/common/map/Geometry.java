package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Geometry;", "", "()V", FirebaseAnalytics.Param.LOCATION, "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GeometryLocation;", "getLocation", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GeometryLocation;", "setLocation", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GeometryLocation;)V", "locationType", "", "getLocationType", "()Ljava/lang/String;", "setLocationType", "(Ljava/lang/String;)V", "viewport", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Viewport;", "getViewport", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Viewport;", "setViewport", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Viewport;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class Geometry {
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private GeometryLocation location;
    @SerializedName("location_type")
    private String locationType;
    @SerializedName("viewport")
    private Viewport viewport;

    public final GeometryLocation getLocation() {
        return this.location;
    }

    public final void setLocation(GeometryLocation geometryLocation) {
        this.location = geometryLocation;
    }

    public final String getLocationType() {
        return this.locationType;
    }

    public final void setLocationType(String str) {
        this.locationType = str;
    }

    public final Viewport getViewport() {
        return this.viewport;
    }

    public final void setViewport(Viewport viewport2) {
        this.viewport = viewport2;
    }
}
