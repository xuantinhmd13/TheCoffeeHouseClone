package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetCategoriesResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "results", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/util/List;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getResults", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class GetCategoriesResponse {
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("results")
    private final List<Category> results;

    public GetCategoriesResponse() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.rewards.GetCategoriesResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetCategoriesResponse copy$default(GetCategoriesResponse getCategoriesResponse, ServerError serverError, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            serverError = getCategoriesResponse.error;
        }
        if ((i & 2) != 0) {
            list = getCategoriesResponse.results;
        }
        return getCategoriesResponse.copy(serverError, list);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final List<Category> component2() {
        return this.results;
    }

    public final GetCategoriesResponse copy(ServerError serverError, List<Category> list) {
        Intrinsics.checkNotNullParameter(list, "results");
        return new GetCategoriesResponse(serverError, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetCategoriesResponse)) {
            return false;
        }
        GetCategoriesResponse getCategoriesResponse = (GetCategoriesResponse) obj;
        return Intrinsics.areEqual(this.error, getCategoriesResponse.error) && Intrinsics.areEqual(this.results, getCategoriesResponse.results);
    }

    public int hashCode() {
        ServerError serverError = this.error;
        int i = 0;
        int hashCode = (serverError != null ? serverError.hashCode() : 0) * 31;
        List<Category> list = this.results;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetCategoriesResponse(error=" + this.error + ", results=" + this.results + ")";
    }

    public GetCategoriesResponse(ServerError serverError, List<Category> list) {
        Intrinsics.checkNotNullParameter(list, "results");
        this.error = serverError;
        this.results = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetCategoriesResponse(ServerError serverError, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, (i & 2) != 0 ? new ArrayList() : list);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final List<Category> getResults() {
        return this.results;
    }
}
