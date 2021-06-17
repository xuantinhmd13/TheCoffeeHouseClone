package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.facebook.appevents.integrity.IntegrityManager;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR \u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR \u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\b¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Supplier;", "", "()V", IntegrityManager.INTEGRITY_TYPE_ADDRESS, "", "getAddress", "()Ljava/lang/String;", "setAddress", "(Ljava/lang/String;)V", "email", "getEmail", "setEmail", "id", "getId", "setId", "logo", "getLogo", "setLogo", "name", "getName", "setName", "phone", "getPhone", "setPhone", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class Supplier {
    @SerializedName(IntegrityManager.INTEGRITY_TYPE_ADDRESS)
    private String address;
    @SerializedName("email")
    private String email;
    @SerializedName("id")
    private String id;
    @SerializedName("logo")
    private String logo;
    @SerializedName("name")
    private String name;
    @SerializedName("phone")
    private String phone;

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final void setLogo(String str) {
        this.logo = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getAddress() {
        return this.address;
    }

    public final void setAddress(String str) {
        this.address = str;
    }

    public final String getPhone() {
        return this.phone;
    }

    public final void setPhone(String str) {
        this.phone = str;
    }

    public final String getEmail() {
        return this.email;
    }

    public final void setEmail(String str) {
        this.email = str;
    }
}
