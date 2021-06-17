package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Geometry;
import com.thecoffeehouse.guestapp.services.api.model.common.map.GeometryLocation;
import com.thecoffeehouse.guestapp.services.api.model.common.map.GetPlaceDescriptionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Result;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetPlaceDescriptionResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$mObserverPlaceDescription$1 extends Lambda implements Function1<GetPlaceDescriptionResponse, Unit> {
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$mObserverPlaceDescription$1(PickLocationDialog pickLocationDialog) {
        super(1);
        this.this$0 = pickLocationDialog;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetPlaceDescriptionResponse getPlaceDescriptionResponse) {
        invoke(getPlaceDescriptionResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetPlaceDescriptionResponse getPlaceDescriptionResponse) {
        Geometry geometry;
        GeometryLocation location;
        Geometry geometry2;
        GeometryLocation location2;
        Geometry geometry3;
        Intrinsics.checkNotNullParameter(getPlaceDescriptionResponse, "it");
        Result result = getPlaceDescriptionResponse.getResult();
        String str = null;
        if (((result == null || (geometry3 = result.getGeometry()) == null) ? null : geometry3.getLocation()) != null) {
            Result result2 = getPlaceDescriptionResponse.getResult();
            String formattedAddress = result2 != null ? result2.getFormattedAddress() : null;
            if (!(formattedAddress == null || formattedAddress.length() == 0)) {
                Result result3 = getPlaceDescriptionResponse.getResult();
                Double valueOf = (result3 == null || (geometry2 = result3.getGeometry()) == null || (location2 = geometry2.getLocation()) == null) ? null : Double.valueOf(location2.getLat());
                Intrinsics.checkNotNull(valueOf);
                double doubleValue = valueOf.doubleValue();
                Result result4 = getPlaceDescriptionResponse.getResult();
                Double valueOf2 = (result4 == null || (geometry = result4.getGeometry()) == null || (location = geometry.getLocation()) == null) ? null : Double.valueOf(location.getLong());
                Intrinsics.checkNotNull(valueOf2);
                LatLng latLng = new LatLng(doubleValue, valueOf2.doubleValue());
                Result result5 = getPlaceDescriptionResponse.getResult();
                if (result5 != null) {
                    str = result5.getFormattedAddress();
                }
                String valueOf3 = String.valueOf(str);
                PickLocationDialog.access$getMOnPickLocationDone$p(this.this$0).invoke(new AddressSuggestion(latLng, valueOf3));
                PickLocationViewModel access$getPickLocationViewModel$p = PickLocationDialog.access$getPickLocationViewModel$p(this.this$0);
                if (access$getPickLocationViewModel$p != null) {
                    access$getPickLocationViewModel$p.saveLocation(latLng, valueOf3);
                }
                TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name, new TrackingData("entryPoints", ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Value.Suggested));
                TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name);
                this.this$0.dismiss();
            }
        }
    }
}
