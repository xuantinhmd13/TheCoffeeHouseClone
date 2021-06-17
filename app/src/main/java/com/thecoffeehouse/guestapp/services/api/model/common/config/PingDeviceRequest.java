package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\f\u001a\u00020\u0004H\u0016R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\t\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PingDeviceRequest;", "", "()V", "barcode", "", "getBarcode", "()Ljava/lang/String;", "setBarcode", "(Ljava/lang/String;)V", "firebaseToken", "getFirebaseToken", "setFirebaseToken", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class PingDeviceRequest {
    @SerializedName("barcode")
    private String barcode;
    @SerializedName("firebase_token")
    private String firebaseToken;

    public final String getBarcode() {
        return this.barcode;
    }

    public final void setBarcode(String str) {
        this.barcode = str;
    }

    public final String getFirebaseToken() {
        return this.firebaseToken;
    }

    public final void setFirebaseToken(String str) {
        this.firebaseToken = str;
    }

    public String toString() {
        String json = new Gson().toJson(this);
        Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(this)");
        return json;
    }
}
