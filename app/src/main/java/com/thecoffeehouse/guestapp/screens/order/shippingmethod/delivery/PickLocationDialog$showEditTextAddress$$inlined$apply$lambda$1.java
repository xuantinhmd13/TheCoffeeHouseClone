package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import android.widget.EditText;
import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$showEditTextAddress$1$1$1", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$$special$$inlined$let$lambda$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$showEditTextAddress$$inlined$apply$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ LatLng $latLng;
    final /* synthetic */ Prediction $prediction$inlined;
    final /* synthetic */ View $this_apply$inlined;
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$showEditTextAddress$$inlined$apply$lambda$1(LatLng latLng, View view, PickLocationDialog pickLocationDialog, Prediction prediction) {
        super(1);
        this.$latLng = latLng;
        this.$this_apply$inlined = view;
        this.this$0 = pickLocationDialog;
        this.$prediction$inlined = prediction;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name, new TrackingData("entryPoints", ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Value.Custom));
        View findViewById = this.$this_apply$inlined.findViewById(R.id.layout_input_address_manually);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layout_input_address_manually");
        EditText editText = (EditText) findViewById.findViewById(R.id.edt_street);
        Intrinsics.checkNotNullExpressionValue(editText, "layout_input_address_manually.edt_street");
        String obj = editText.getText().toString();
        PickLocationViewModel access$getPickLocationViewModel$p = PickLocationDialog.access$getPickLocationViewModel$p(this.this$0);
        if (access$getPickLocationViewModel$p != null) {
            access$getPickLocationViewModel$p.saveLocation(this.$latLng, obj);
        }
        PickLocationDialog.access$getMOnPickLocationDone$p(this.this$0).invoke(new AddressSuggestion(this.$latLng, obj));
        this.this$0.dismiss();
    }
}
