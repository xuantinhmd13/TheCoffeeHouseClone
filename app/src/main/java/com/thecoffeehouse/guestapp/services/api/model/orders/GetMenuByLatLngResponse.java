package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR$\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetMenuByLatLngResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "menus", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/util/List;)V", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "setError", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;)V", "getMenus", "()Ljava/util/List;", "setMenus", "(Ljava/util/List;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class GetMenuByLatLngResponse {
    @SerializedName("error")
    private ServerError error;
    @SerializedName("menu")
    private List<Menu> menus;

    public GetMenuByLatLngResponse(ServerError serverError, List<Menu> list) {
        Intrinsics.checkNotNullParameter(list, "menus");
        this.error = serverError;
        this.menus = list;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GetMenuByLatLngResponse(ServerError serverError, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, list);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final void setError(ServerError serverError) {
        this.error = serverError;
    }

    public final List<Menu> getMenus() {
        return this.menus;
    }

    public final void setMenus(List<Menu> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.menus = list;
    }
}
