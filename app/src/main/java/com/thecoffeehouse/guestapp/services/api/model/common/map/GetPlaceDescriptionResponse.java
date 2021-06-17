package com.thecoffeehouse.guestapp.services.api.model.common.map;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0004\u0018\u00010\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetPlaceDescriptionResponse;", "", "()V", "error", "getError", "()Ljava/lang/Object;", "setError", "(Ljava/lang/Object;)V", "result", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Result;", "getResult", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Result;", "setResult", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Result;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PlaceAutoSuggestionResponse.kt */
public final class GetPlaceDescriptionResponse {
    @SerializedName("error")
    private Object error;
    @SerializedName("result")
    private Result result;

    public final Object getError() {
        return this.error;
    }

    public final void setError(Object obj) {
        this.error = obj;
    }

    public final Result getResult() {
        return this.result;
    }

    public final void setResult(Result result2) {
        this.result = result2;
    }
}
