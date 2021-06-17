package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlinx.coroutines.DebugKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR \u0010\f\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\u0004\u0018\u00010\r8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderButtonStatus;", "", "()V", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "getActive", "()Z", "setActive", "(Z)V", DebugKt.DEBUG_PROPERTY_VALUE_AUTO, "getAuto", "setAuto", "id", "", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", ViewHierarchyConstants.TEXT_KEY, "getText", "setText", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class OrderButtonStatus {
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private boolean active;
    @SerializedName(DebugKt.DEBUG_PROPERTY_VALUE_AUTO)
    private boolean auto;
    @SerializedName("id")
    private String id;
    @SerializedName(ViewHierarchyConstants.TEXT_KEY)
    private String text;

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final String getText() {
        return this.text;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final boolean getActive() {
        return this.active;
    }

    public final void setActive(boolean z) {
        this.active = z;
    }

    public final boolean getAuto() {
        return this.auto;
    }

    public final void setAuto(boolean z) {
        this.auto = z;
    }
}
