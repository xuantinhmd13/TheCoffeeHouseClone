package com.thecoffeehouse.guestapp.screens.order.shippingmethod;

import android.view.View;
import android.widget.TextView;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStoreKt;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "myAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SelectShippingMethodDialog.kt */
public final class SelectShippingMethodDialog$initPickupButton$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ View $this_initPickupButton;
    final /* synthetic */ SelectShippingMethodDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SelectShippingMethodDialog$initPickupButton$1(SelectShippingMethodDialog selectShippingMethodDialog, View view) {
        super(1);
        this.this$0 = selectShippingMethodDialog;
        this.$this_initPickupButton = view;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        LocationStore locationStore;
        LocationStore locationStore2;
        Intrinsics.checkNotNullParameter(addressSuggestion, "myAddress");
        Store store = this.this$0.mCurrentPickUpInfo;
        if (store != null && store.getLocationStore() != null) {
            LatLng latLng = addressSuggestion.getLatLng();
            Store store2 = this.this$0.mCurrentPickUpInfo;
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double lat = (store2 == null || (locationStore2 = store2.getLocationStore()) == null) ? 0.0d : locationStore2.getLat();
            Store store3 = this.this$0.mCurrentPickUpInfo;
            if (!(store3 == null || (locationStore = store3.getLocationStore()) == null)) {
                d = locationStore.getLong();
            }
            double distanceByTwoLocation = OrderExtsKt.getDistanceByTwoLocation(latLng, new LatLng(lat, d));
            View findViewById = this.$this_initPickupButton.findViewById(R.id.btn_pick_up);
            Intrinsics.checkNotNullExpressionValue(findViewById, "btn_pick_up");
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_method_description);
            Intrinsics.checkNotNullExpressionValue(textView, "btn_pick_up.txt_method_description");
            textView.setText(ItemRowPickStoreKt.formatDistanceToString(distanceByTwoLocation / ((double) 1000)) + "km");
        }
    }
}
