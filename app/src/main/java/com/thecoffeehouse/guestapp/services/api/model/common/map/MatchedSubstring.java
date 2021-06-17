package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u000b\u0010\u0006\"\u0004\b\f\u0010\b¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/MatchedSubstring;", "", "()V", "length", "", "getLength", "()Ljava/lang/Integer;", "setLength", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "offset", "getOffset", "setOffset", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class MatchedSubstring {
    @SerializedName("length")
    private Integer length;
    @SerializedName("offset")
    private Integer offset;

    public final Integer getLength() {
        return this.length;
    }

    public final void setLength(Integer num) {
        this.length = num;
    }

    public final Integer getOffset() {
        return this.offset;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }
}
