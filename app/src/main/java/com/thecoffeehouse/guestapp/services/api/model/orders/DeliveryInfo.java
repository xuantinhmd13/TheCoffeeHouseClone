package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0018\u001a\u00020\nH\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR \u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/DeliveryInfo;", "", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "getAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "setAddress", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "note", "getNote", "setNote", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "setPhone", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;)V", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class DeliveryInfo {
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private AddressOrder address;
    @SerializedName("name")
    private String name;
    @SerializedName("note")
    private String note;
    @SerializedName("phone")
    private Phone phone;

    public final AddressOrder getAddress() {
        return this.address;
    }

    public final void setAddress(AddressOrder addressOrder) {
        this.address = addressOrder;
    }

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

    public final String getNote() {
        return this.note;
    }

    public final void setNote(String str) {
        this.note = str;
    }

    public String toString() {
        return "DeliveryInfo(address=" + this.address + ", name=" + this.name + ", phone=" + this.phone + ", note=" + this.note + ')';
    }
}
