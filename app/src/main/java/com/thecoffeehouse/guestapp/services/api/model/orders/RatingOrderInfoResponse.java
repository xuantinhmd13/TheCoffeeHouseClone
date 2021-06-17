package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderInfoResponse;", "", "()V", "dataRatingOrderInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;", "getDataRatingOrderInfo", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;", "setDataRatingOrderInfo", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/DataRatingOrderInfo;)V", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class RatingOrderInfoResponse {
    @SerializedName("data")
    private DataRatingOrderInfo dataRatingOrderInfo;
    @SerializedName("error")
    private ServerError error;

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final DataRatingOrderInfo getDataRatingOrderInfo() {
        return this.dataRatingOrderInfo;
    }

    public final void setDataRatingOrderInfo(DataRatingOrderInfo dataRatingOrderInfo2) {
        this.dataRatingOrderInfo = dataRatingOrderInfo2;
    }
}
