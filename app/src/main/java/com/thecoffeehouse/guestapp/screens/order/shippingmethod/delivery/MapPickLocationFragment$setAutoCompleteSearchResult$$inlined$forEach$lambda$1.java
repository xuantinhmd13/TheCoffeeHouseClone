package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/MapPickLocationFragment$setAutoCompleteSearchResult$1$itemRowSearchDeliveryAddress$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapPickLocationFragment.kt */
final class MapPickLocationFragment$setAutoCompleteSearchResult$$inlined$forEach$lambda$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ PlaceHolderView $layoutSuggestedAddress$inlined;
    final /* synthetic */ MapPickLocationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MapPickLocationFragment$setAutoCompleteSearchResult$$inlined$forEach$lambda$1(MapPickLocationFragment mapPickLocationFragment, PlaceHolderView placeHolderView) {
        super(1);
        this.this$0 = mapPickLocationFragment;
        this.$layoutSuggestedAddress$inlined = placeHolderView;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "it");
        MapPickLocationFragment.access$getOnSelectAddressSuggestion$p(this.this$0).invoke(addressSuggestion);
    }
}
