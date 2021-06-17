package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R \u0010\u0016\u001a\u0004\u0018\u00010\u00178\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderRequest;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderRequest;", "()V", "customer", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CustomerOrder;", "getCustomer", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/CustomerOrder;", "setCustomer", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/CustomerOrder;)V", "dynamicLink", "", "getDynamicLink", "()Ljava/lang/String;", "setDynamicLink", "(Ljava/lang/String;)V", "reOrder", "", "getReOrder", "()Ljava/lang/Boolean;", "setReOrder", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "warningSelected", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/WarningButton;", "getWarningSelected", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/WarningButton;", "setWarningSelected", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/WarningButton;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class CreateOrderRequest extends CalculateOrderRequest {
    @SerializedName("customer")
    private CustomerOrder customer;
    @SerializedName("dynamic_link")
    private String dynamicLink;
    @SerializedName("re_order")
    private Boolean reOrder;
    @SerializedName("warning_selected")
    private WarningButton warningSelected;

    public final Boolean getReOrder() {
        return this.reOrder;
    }

    public final void setReOrder(Boolean bool) {
        this.reOrder = bool;
    }

    public final CustomerOrder getCustomer() {
        return this.customer;
    }

    public final void setCustomer(CustomerOrder customerOrder) {
        this.customer = customerOrder;
    }

    public final WarningButton getWarningSelected() {
        return this.warningSelected;
    }

    public final void setWarningSelected(WarningButton warningButton) {
        this.warningSelected = warningButton;
    }

    public final String getDynamicLink() {
        return this.dynamicLink;
    }

    public final void setDynamicLink(String str) {
        this.dynamicLink = str;
    }
}
