package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.PlaceAutoSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.Arrays;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlaceAutoSuggestionResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$mObserverSearchAutoComplete$1 extends Lambda implements Function1<PlaceAutoSuggestionResponse, Unit> {
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$mObserverSearchAutoComplete$1(PickLocationDialog pickLocationDialog) {
        super(1);
        this.this$0 = pickLocationDialog;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PlaceAutoSuggestionResponse placeAutoSuggestionResponse) {
        invoke(placeAutoSuggestionResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(PlaceAutoSuggestionResponse placeAutoSuggestionResponse) {
        PlaceHolderView placeHolderView;
        PlaceHolderView placeHolderView2;
        Intrinsics.checkNotNullParameter(placeAutoSuggestionResponse, "it");
        View access$getRootView$p = PickLocationDialog.access$getRootView$p(this.this$0);
        if (!(access$getRootView$p == null || (placeHolderView2 = (PlaceHolderView) access$getRootView$p.findViewById(R.id.phv_address)) == null)) {
            placeHolderView2.removeAllViews();
        }
        for (Prediction prediction : placeAutoSuggestionResponse.getPredictions()) {
            String description = prediction.getDescription();
            if (description == null) {
                description = prediction.getFormattedAddress();
            }
            if (description != null) {
                Object[] array = CollectionsKt.listOf(new TextViewAttribute(description, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular))).toArray(new TextViewAttribute[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                TextViewAttribute[] textViewAttributeArr = (TextViewAttribute[]) array;
                ItemRowSearchAddress itemRowSearchAddress = new ItemRowSearchAddress(prediction, new PickLocationDialog$mObserverSearchAutoComplete$1$$special$$inlined$let$lambda$1(this, description, prediction), (TextViewAttribute[]) Arrays.copyOf(textViewAttributeArr, textViewAttributeArr.length));
                View access$getRootView$p2 = PickLocationDialog.access$getRootView$p(this.this$0);
                if (!(access$getRootView$p2 == null || (placeHolderView = (PlaceHolderView) access$getRootView$p2.findViewById(R.id.phv_address)) == null)) {
                    placeHolderView.addView(itemRowSearchAddress);
                }
            }
        }
    }
}
