package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AutoCompleteAddressResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AutoCompleteAddressResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2$showMapPickLocationDialogFragment$observeGetPickLocation$1 extends Lambda implements Function1<AutoCompleteAddressResponse, Unit> {
    final /* synthetic */ PickLocationDialogV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialogV2$showMapPickLocationDialogFragment$observeGetPickLocation$1(PickLocationDialogV2 pickLocationDialogV2) {
        super(1);
        this.this$0 = pickLocationDialogV2;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AutoCompleteAddressResponse autoCompleteAddressResponse) {
        invoke(autoCompleteAddressResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(AutoCompleteAddressResponse autoCompleteAddressResponse) {
        Intrinsics.checkNotNullParameter(autoCompleteAddressResponse, "it");
        this.this$0.currentQuerySessionToken = autoCompleteAddressResponse.getSessionToken();
        MapPickLocationFragment mapPickLocationFragment = this.this$0.mapPickLocationDialogFragment;
        if (mapPickLocationFragment != null) {
            mapPickLocationFragment.setAutoCompleteSearchResult(autoCompleteAddressResponse.getAddresses());
        }
    }
}
