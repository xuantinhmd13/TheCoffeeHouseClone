package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "addressSuggestionResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestionResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2$mObserveGetPlaceDetailById$1 extends Lambda implements Function1<AddressSuggestionResponse, Unit> {
    final /* synthetic */ PickLocationDialogV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialogV2$mObserveGetPlaceDetailById$1(PickLocationDialogV2 pickLocationDialogV2) {
        super(1);
        this.this$0 = pickLocationDialogV2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestionResponse addressSuggestionResponse) {
        invoke(addressSuggestionResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestionResponse addressSuggestionResponse) {
        Intrinsics.checkNotNullParameter(addressSuggestionResponse, "addressSuggestionResponse");
        AddressSuggestion address = addressSuggestionResponse.getAddress();
        if (address != null) {
            this.this$0.mOnSelectAddressListener.invoke(address);
        }
        MapPickLocationFragment mapPickLocationFragment = this.this$0.mapPickLocationDialogFragment;
        if (mapPickLocationFragment != null) {
            mapPickLocationFragment.dismiss();
        }
        this.this$0.dismiss();
    }
}
