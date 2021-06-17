package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.facebook.share.internal.ShareConstants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PingDeviceResponse;", "", "()V", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "", "getMessage", "()Ljava/lang/String;", "storeId", "getStoreId", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class PingDeviceResponse {
    @SerializedName(ShareConstants.WEB_DIALOG_PARAM_MESSAGE)
    private final String message;
    @SerializedName("store_id")
    private final String storeId;

    public final String getMessage() {
        return this.message;
    }

    public final String getStoreId() {
        return this.storeId;
    }
}
