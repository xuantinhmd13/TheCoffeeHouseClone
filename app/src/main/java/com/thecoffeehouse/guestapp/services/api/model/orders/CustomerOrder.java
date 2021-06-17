package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR \u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/CustomerOrder;", "", "()V", "customerId", "", "getCustomerId", "()Ljava/lang/Integer;", "setCustomerId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "setPhone", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class CustomerOrder {
    @SerializedName("customer_id")
    private Integer customerId;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private Phone phone;

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final void setPhone(Phone phone2) {
        this.phone = phone2;
    }

    public final Integer getCustomerId() {
        return this.customerId;
    }

    public final void setCustomerId(Integer num) {
        this.customerId = num;
    }
}
