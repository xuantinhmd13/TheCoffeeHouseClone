package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$showRecentlySuccessOrders$1$itemRowStore$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$showRecentlySuccessOrders$$inlined$forEach$lambda$1 extends Lambda implements Function1<Store, Unit> {
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$showRecentlySuccessOrders$$inlined$forEach$lambda$1(PickLocationDialog pickLocationDialog) {
        super(1);
        this.this$0 = pickLocationDialog;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Store store) {
        invoke(store);
        return Unit.INSTANCE;
    }

    public final void invoke(Store store) {
        Function1 access$getMOnPickLocationDone$p = PickLocationDialog.access$getMOnPickLocationDone$p(this.this$0);
        Intrinsics.checkNotNull(store);
        LocationStore locationStore = store.getLocationStore();
        Intrinsics.checkNotNull(locationStore);
        double lat = locationStore.getLat();
        LocationStore locationStore2 = store.getLocationStore();
        Intrinsics.checkNotNull(locationStore2);
        access$getMOnPickLocationDone$p.invoke(new AddressSuggestion(lat, locationStore2.getLong(), store.getFullAddress()));
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name, new TrackingData("entryPoints", ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Value.Search_Result));
        TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name);
        this.this$0.dismiss();
    }
}
