package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetMenuByLatLngResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "menuByLatLngResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetMenuByLatLngResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$mObserveGetMenuByLatLng$1 extends Lambda implements Function1<GetMenuByLatLngResponse, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$mObserveGetMenuByLatLng$1(OrderFragment orderFragment) {
        super(1);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetMenuByLatLngResponse getMenuByLatLngResponse) {
        invoke(getMenuByLatLngResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetMenuByLatLngResponse getMenuByLatLngResponse) {
        Intrinsics.checkNotNullParameter(getMenuByLatLngResponse, "menuByLatLngResponse");
        List<Menu> menus = getMenuByLatLngResponse.getMenus();
        ((OrderViewModel) this.this$0.getViewModel()).setCurrentMenu(menus);
        this.this$0.initProducts(menus);
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventViewMenu.name, new TrackingData(OrderEvents.EventViewMenu.Param.qtyCatsInMenu, Integer.valueOf(menus.size())));
    }
}
