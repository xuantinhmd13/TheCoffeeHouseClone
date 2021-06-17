package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Term;", "", "()V", "offset", "", "getOffset", "()Ljava/lang/Integer;", "setOffset", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "value", "", "getValue", "()Ljava/lang/String;", "setValue", "(Ljava/lang/String;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class Term {
    @SerializedName("offset")
    private Integer offset;
    @SerializedName("value")
    private String value;

    public final Integer getOffset() {
        return this.offset;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final String getValue() {
        return this.value;
    }

    public final void setValue(String str) {
        this.value = str;
    }
}
