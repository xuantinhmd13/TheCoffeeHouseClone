package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR&\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressComponent;", "", "()V", "longName", "", "getLongName", "()Ljava/lang/String;", "setLongName", "(Ljava/lang/String;)V", "shortName", "getShortName", "setShortName", "types", "", "getTypes", "()Ljava/util/List;", "setTypes", "(Ljava/util/List;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class AddressComponent {
    @SerializedName("long_name")
    private String longName;
    @SerializedName("short_name")
    private String shortName;
    @SerializedName("types")
    private List<String> types;

    public final String getLongName() {
        return this.longName;
    }

    public final void setLongName(String str) {
        this.longName = str;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final void setShortName(String str) {
        this.shortName = str;
    }

    public final List<String> getTypes() {
        return this.types;
    }

    public final void setTypes(List<String> list) {
        this.types = list;
    }
}
