package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\b\u001a\u0004\b\u0003\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/ActiveCouponsResquest;", "", "()V", "isLimitOrder", "", "()Ljava/lang/Boolean;", "setLimitOrder", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class ActiveCouponsResquest {
    @SerializedName("is_limit_order")
    @Expose
    private Boolean isLimitOrder = false;

    public final Boolean isLimitOrder() {
        return this.isLimitOrder;
    }

    public final void setLimitOrder(Boolean bool) {
        this.isLimitOrder = bool;
    }
}
