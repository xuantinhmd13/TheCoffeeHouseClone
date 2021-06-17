package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestionResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2$performSelectAddress$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ AddressSuggestion $selectedAddress;
    final /* synthetic */ PickLocationDialogV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialogV2$performSelectAddress$1(PickLocationDialogV2 pickLocationDialogV2, AddressSuggestion addressSuggestion) {
        super(1);
        this.this$0 = pickLocationDialogV2;
        this.$selectedAddress = addressSuggestion;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
        PickLocationViewModel pickLocationViewModel = this.this$0.getMPickLocationViewModel();
        Double valueOf = Double.valueOf(addressSuggestion.getLat());
        Double valueOf2 = Double.valueOf(addressSuggestion.getLng());
        String placeId = this.$selectedAddress.getPlaceId();
        Intrinsics.checkNotNull(placeId);
        String titleAddress = this.$selectedAddress.getTitleAddress();
        String str = this.this$0.currentQuerySessionToken;
        Intrinsics.checkNotNull(str);
        LiveData<Resource<AddressSuggestionResponse>> placeDetailById = pickLocationViewModel.getPlaceDetailById(valueOf, valueOf2, placeId, titleAddress, str);
        PickLocationDialogV2 pickLocationDialogV2 = this.this$0;
        placeDetailById.observe(pickLocationDialogV2, pickLocationDialogV2.mObserveGetPlaceDetailById);
    }
}
