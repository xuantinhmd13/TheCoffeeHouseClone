package com.thecoffeehouse.guestapp.services.api.model.login;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/login/ExchangeTokenRequest;", "", "token", "", "(Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "setToken", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Login.kt */
public final class ExchangeTokenRequest {
    @SerializedName("token")
    private String token;

    public static /* synthetic */ ExchangeTokenRequest copy$default(ExchangeTokenRequest exchangeTokenRequest, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = exchangeTokenRequest.token;
        }
        return exchangeTokenRequest.copy(str);
    }

    public final String component1() {
        return this.token;
    }

    public final ExchangeTokenRequest copy(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        return new ExchangeTokenRequest(str);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof ExchangeTokenRequest) && Intrinsics.areEqual(this.token, ((ExchangeTokenRequest) obj).token);
        }
        return true;
    }

    public int hashCode() {
        String str = this.token;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "ExchangeTokenRequest(token=" + this.token + ")";
    }

    public ExchangeTokenRequest(String str) {
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
