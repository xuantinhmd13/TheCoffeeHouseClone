package com.thecoffeehouse.guestapp.services.api.model.profile;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/profile/MergeProfileRequest;", "", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "setToken", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Profile.kt */
public final class MergeProfileRequest {
    @SerializedName("token")
    private String token;

    public MergeProfileRequest(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        this.token = str;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setToken(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.token = str;
    }
}
