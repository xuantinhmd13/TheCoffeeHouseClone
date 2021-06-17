package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/DeleteUserAddressRequest;", "", "id", "", "(Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class DeleteUserAddressRequest {
    @SerializedName("id")
    private final String id;

    public DeleteUserAddressRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        this.id = str;
    }

    public final String getId() {
        return this.id;
    }
}
