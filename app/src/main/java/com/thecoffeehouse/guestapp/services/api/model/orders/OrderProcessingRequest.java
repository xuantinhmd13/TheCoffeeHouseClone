package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessingRequest;", "", "()V", "processing", "", "getProcessing", "()I", "setProcessing", "(I)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class OrderProcessingRequest {
    @SerializedName("user_rank")
    private int processing = 1;

    public final int getProcessing() {
        return this.processing;
    }

    public final void setProcessing(int i) {
        this.processing = i;
    }
}
