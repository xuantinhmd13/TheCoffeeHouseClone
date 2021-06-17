package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR&\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "", "()V", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "order", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "getOrder", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "setOrder", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;)V", "problems", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Problem;", "getProblems", "()Ljava/util/List;", "setProblems", "(Ljava/util/List;)V", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class CalculateOrderResponse {
    @SerializedName("error")
    private ServerError error;
    @SerializedName("order")
    private Order order;
    @SerializedName("problems")
    private List<Problem> problems;

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final Order getOrder() {
        return this.order;
    }

    public final void setOrder(Order order2) {
        this.order = order2;
    }

    public final List<Problem> getProblems() {
        return this.problems;
    }

    public final void setProblems(List<Problem> list) {
        this.problems = list;
    }

    public String toString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}
