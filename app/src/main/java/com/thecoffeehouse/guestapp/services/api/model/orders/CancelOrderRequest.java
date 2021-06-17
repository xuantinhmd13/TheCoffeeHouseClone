package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/CancelOrderRequest;", "", "()V", "reasonId", "", "getReasonId", "()Ljava/lang/String;", "setReasonId", "(Ljava/lang/String;)V", "ref", "getRef", "setRef", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class CancelOrderRequest {
    @SerializedName("reason_id")
    private String reasonId;
    @SerializedName("ref")
    private String ref;

    public final String getRef() {
        return this.ref;
    }

    public final void setRef(String str) {
        this.ref = str;
    }

    public final String getReasonId() {
        return this.reasonId;
    }

    public final void setReasonId(String str) {
        this.reasonId = str;
    }
}
