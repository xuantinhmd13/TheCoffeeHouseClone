package com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/GetHaravanResponse;", "", "webLinks", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "havaranInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/HaravanInfo;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/HaravanInfo;)V", "getHavaranInfo", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/HaravanInfo;", "getWebLinks", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExternalAccount.kt */
public final class GetHaravanResponse {
    @SerializedName("info")
    private final HaravanInfo havaranInfo;
    @SerializedName("error")
    private final ServerError webLinks;

    public GetHaravanResponse() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ GetHaravanResponse copy$default(GetHaravanResponse getHaravanResponse, ServerError serverError, HaravanInfo haravanInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = getHaravanResponse.webLinks;
        }
        if ((i & 2) != 0) {
            haravanInfo = getHaravanResponse.havaranInfo;
        }
        return getHaravanResponse.copy(serverError, haravanInfo);
    }

    public final ServerError component1() {
        return this.webLinks;
    }

    public final HaravanInfo component2() {
        return this.havaranInfo;
    }

    public final GetHaravanResponse copy(ServerError serverError, HaravanInfo haravanInfo) {
        return new GetHaravanResponse(serverError, haravanInfo);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetHaravanResponse)) {
            return false;
        }
        GetHaravanResponse getHaravanResponse = (GetHaravanResponse) obj;
        return Intrinsics.areEqual(this.webLinks, getHaravanResponse.webLinks) && Intrinsics.areEqual(this.havaranInfo, getHaravanResponse.havaranInfo);
    }

    public int hashCode() {
        ServerError serverError = this.webLinks;
        int i = 0;
        int hashCode = (serverError != null ? serverError.hashCode() : 0) * 31;
        HaravanInfo haravanInfo = this.havaranInfo;
        if (haravanInfo != null) {
            i = haravanInfo.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetHaravanResponse(webLinks=" + this.webLinks + ", havaranInfo=" + this.havaranInfo + ")";
    }

    public GetHaravanResponse(ServerError serverError, HaravanInfo haravanInfo) {
        this.webLinks = serverError;
        this.havaranInfo = haravanInfo;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetHaravanResponse(ServerError serverError, HaravanInfo haravanInfo, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, (i & 2) != 0 ? null : haravanInfo);
    }

    public final ServerError getWebLinks() {
        return this.webLinks;
    }

    public final HaravanInfo getHavaranInfo() {
        return this.havaranInfo;
    }
}
