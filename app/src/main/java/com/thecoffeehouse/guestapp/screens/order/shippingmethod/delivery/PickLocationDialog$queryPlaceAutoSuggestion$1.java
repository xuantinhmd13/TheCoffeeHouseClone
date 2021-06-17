package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.common.map.PlaceAutoSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$queryPlaceAutoSuggestion$1 implements Runnable {
    final /* synthetic */ String $newText;
    final /* synthetic */ PickLocationDialog this$0;

    PickLocationDialog$queryPlaceAutoSuggestion$1(PickLocationDialog pickLocationDialog, String str) {
        this.this$0 = pickLocationDialog;
        this.$newText = str;
    }

    public final void run() {
        TextView access$getMTxtPickLocationManually$p;
        TextView access$getMTxtPickLocationManually$p2;
        LiveData<Resource<PlaceAutoSuggestionResponse>> searchPlaces;
        String str = this.$newText;
        boolean z = true;
        if (!(str == null || StringsKt.isBlank(str))) {
            String str2 = this.$newText;
            if (!(str2 == null || str2.length() == 0)) {
                PickLocationViewModel access$getPickLocationViewModel$p = PickLocationDialog.access$getPickLocationViewModel$p(this.this$0);
                if (!(access$getPickLocationViewModel$p == null || (searchPlaces = access$getPickLocationViewModel$p.searchPlaces(this.$newText)) == null)) {
                    PickLocationDialog pickLocationDialog = this.this$0;
                    searchPlaces.observe(pickLocationDialog, PickLocationDialog.access$getMObserverSearchAutoComplete$p(pickLocationDialog));
                }
                access$getMTxtPickLocationManually$p = PickLocationDialog.access$getMTxtPickLocationManually$p(this.this$0);
                if (access$getMTxtPickLocationManually$p != null && access$getMTxtPickLocationManually$p.getVisibility() == 8 && (access$getMTxtPickLocationManually$p2 = PickLocationDialog.access$getMTxtPickLocationManually$p(this.this$0)) != null) {
                    access$getMTxtPickLocationManually$p2.setVisibility(0);
                    return;
                }
                return;
            }
        }
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        PickLocationViewModel access$getPickLocationViewModel$p2 = PickLocationDialog.access$getPickLocationViewModel$p(this.this$0);
        ArrayList<AddressOrder> arrayList = null;
        ArrayList<AddressOrder> recentSearchAddresses = access$getPickLocationViewModel$p2 != null ? access$getPickLocationViewModel$p2.getRecentSearchAddresses() : null;
        trackingDataArr[0] = new TrackingData("hasRecentAddress", Boolean.valueOf(!(recentSearchAddresses == null || recentSearchAddresses.isEmpty())));
        companion.collectParamWithEventName(ShippingMethodEvents.EventSearchDeliAddress.name, trackingDataArr);
        PickLocationViewModel access$getPickLocationViewModel$p3 = PickLocationDialog.access$getPickLocationViewModel$p(this.this$0);
        if (access$getPickLocationViewModel$p3 != null) {
            arrayList = access$getPickLocationViewModel$p3.getRecentSearchAddresses();
        }
        ArrayList<AddressOrder> arrayList2 = arrayList;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            z = false;
        }
        if (!z) {
            PickLocationDialog.access$showRecentlySuccessOrders(this.this$0);
        }
        access$getMTxtPickLocationManually$p = PickLocationDialog.access$getMTxtPickLocationManually$p(this.this$0);
        if (access$getMTxtPickLocationManually$p != null) {
        }
    }
}
