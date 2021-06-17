package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR$\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersProcessingResponse;", "", "()V", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "processing", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "getProcessing", "()Ljava/util/List;", "setProcessing", "(Ljava/util/List;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class GetOrdersProcessingResponse {
    @SerializedName("error")
    private ServerError error;
    @SerializedName("processing")
    private List<? extends OrderProcessing> processing = new ArrayList();

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: java.util.List<? extends com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing>, java.util.List<com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing> */
    public final List<OrderProcessing> getProcessing() {
        return this.processing;
    }

    public final void setProcessing(List<? extends OrderProcessing> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.processing = list;
    }
}
