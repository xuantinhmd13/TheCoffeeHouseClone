package com.thecoffeehouse.guestapp.screens.stores;

import android.content.Context;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "myAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoreDetailBottomSheetFragment.kt */
final class StoreDetailBottomSheetFragment$showDirectionToStore$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ StoreDetailBottomSheetFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoreDetailBottomSheetFragment$showDirectionToStore$1(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment) {
        super(1);
        this.this$0 = storeDetailBottomSheetFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "myAddress");
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        LatLng latLng = addressSuggestion.getLatLng();
        LocationStore locationStore = StoreDetailBottomSheetFragment.access$getStore$p(this.this$0).getLocationStore();
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double lat = locationStore != null ? locationStore.getLat() : 0.0d;
        LocationStore locationStore2 = StoreDetailBottomSheetFragment.access$getStore$p(this.this$0).getLocationStore();
        if (locationStore2 != null) {
            d = locationStore2.getLong();
        }
        OrderExtsKt.openExternalDirectionApp(requireContext, latLng, new LatLng(lat, d));
    }
}
