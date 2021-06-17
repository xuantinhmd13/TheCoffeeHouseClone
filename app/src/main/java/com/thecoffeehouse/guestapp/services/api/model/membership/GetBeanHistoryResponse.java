package com.thecoffeehouse.guestapp.services.api.model.membership;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B!\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetBeanHistoryResponse;", "", "histories", "", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/BeanHistory;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "(Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getHistories", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetMembershipResponse.kt */
public final class GetBeanHistoryResponse {
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("histories")
    private final List<BeanHistory> histories;

    public GetBeanHistoryResponse() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryResponse */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GetBeanHistoryResponse copy$default(GetBeanHistoryResponse getBeanHistoryResponse, List list, ServerError serverError, int i, Object obj) {
        if ((i & 1) != 0) {
            list = getBeanHistoryResponse.histories;
        }
        if ((i & 2) != 0) {
            serverError = getBeanHistoryResponse.error;
        }
        return getBeanHistoryResponse.copy(list, serverError);
    }

    public final List<BeanHistory> component1() {
        return this.histories;
    }

    public final ServerError component2() {
        return this.error;
    }

    public final GetBeanHistoryResponse copy(List<BeanHistory> list, ServerError serverError) {
        Intrinsics.checkNotNullParameter(list, "histories");
        return new GetBeanHistoryResponse(list, serverError);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetBeanHistoryResponse)) {
            return false;
        }
        GetBeanHistoryResponse getBeanHistoryResponse = (GetBeanHistoryResponse) obj;
        return Intrinsics.areEqual(this.histories, getBeanHistoryResponse.histories) && Intrinsics.areEqual(this.error, getBeanHistoryResponse.error);
    }

    public int hashCode() {
        List<BeanHistory> list = this.histories;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        ServerError serverError = this.error;
        if (serverError != null) {
            i = serverError.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "GetBeanHistoryResponse(histories=" + this.histories + ", error=" + this.error + ")";
    }

    public GetBeanHistoryResponse(List<BeanHistory> list, ServerError serverError) {
        Intrinsics.checkNotNullParameter(list, "histories");
        this.histories = list;
        this.error = serverError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetBeanHistoryResponse(List list, ServerError serverError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : serverError);
    }

    public final List<BeanHistory> getHistories() {
        return this.histories;
    }

    public final ServerError getError() {
        return this.error;
    }
}
