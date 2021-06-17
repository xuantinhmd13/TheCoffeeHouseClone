package com.thecoffeehouse.guestapp.services.api.model.common.notification;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/GetNotificationsResponse;", "", "data", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;", "unread", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "(Ljava/util/List;Ljava/lang/Integer;Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getData", "()Ljava/util/List;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getUnread", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Notification.kt */
public class GetNotificationsResponse {
    @SerializedName("data")
    private final List<Notification> data;
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("unread")
    private final Integer unread;

    public GetNotificationsResponse() {
        this(null, null, null, 7, null);
    }

    public GetNotificationsResponse(List<Notification> list, Integer num, ServerError serverError) {
        Intrinsics.checkNotNullParameter(list, "data");
        this.data = list;
        this.unread = num;
        this.error = serverError;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetNotificationsResponse(List list, Integer num, ServerError serverError, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : serverError);
    }

    public final List<Notification> getData() {
        return this.data;
    }

    public final Integer getUnread() {
        return this.unread;
    }

    public final ServerError getError() {
        return this.error;
    }
}
