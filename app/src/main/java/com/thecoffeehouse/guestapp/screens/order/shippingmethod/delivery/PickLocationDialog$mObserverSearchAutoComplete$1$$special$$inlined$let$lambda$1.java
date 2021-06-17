package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.common.map.GetPlaceDescriptionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "predictionSelected", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Prediction;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$mObserverSearchAutoComplete$1$1$itemRowStore$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
public final class PickLocationDialog$mObserverSearchAutoComplete$1$$special$$inlined$let$lambda$1 extends Lambda implements Function1<Prediction, Unit> {
    final /* synthetic */ String $addressText$inlined;
    final /* synthetic */ Prediction $prediction$inlined;
    final /* synthetic */ PickLocationDialog$mObserverSearchAutoComplete$1 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$mObserverSearchAutoComplete$1$$special$$inlined$let$lambda$1(PickLocationDialog$mObserverSearchAutoComplete$1 pickLocationDialog$mObserverSearchAutoComplete$1, String str, Prediction prediction) {
        super(1);
        this.this$0 = pickLocationDialog$mObserverSearchAutoComplete$1;
        this.$addressText$inlined = str;
        this.$prediction$inlined = prediction;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Prediction prediction) {
        invoke(prediction);
        return Unit.INSTANCE;
    }

    public final void invoke(Prediction prediction) {
        LiveData<Resource<GetPlaceDescriptionResponse>> placeDescription;
        Intrinsics.checkNotNullParameter(prediction, "predictionSelected");
        PickLocationViewModel pickLocationViewModel = this.this$0.this$0.getPickLocationViewModel();
        if (pickLocationViewModel != null && (placeDescription = pickLocationViewModel.getPlaceDescription(prediction.getPlaceId())) != null) {
            placeDescription.observe(this.this$0.this$0, this.this$0.this$0.mObserverPlaceDescription);
        }
    }
}
