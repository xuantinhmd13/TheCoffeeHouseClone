package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2$queryPlaceAutoSuggestion$1 implements Runnable {
    final /* synthetic */ String $query;
    final /* synthetic */ PickLocationDialogV2 this$0;

    PickLocationDialogV2$queryPlaceAutoSuggestion$1(PickLocationDialogV2 pickLocationDialogV2, String str) {
        this.this$0 = pickLocationDialogV2;
        this.$query = str;
    }

    public final void run() {
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.getMyAddress(new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationDialogV2$queryPlaceAutoSuggestion$1.AnonymousClass1 */
                final /* synthetic */ PickLocationDialogV2$queryPlaceAutoSuggestion$1 this$0;

                {
                    this.this$0 = r1;
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
                    this.this$0.this$0.getMPickLocationViewModel().getAutoCompleteSearch(this.this$0.$query, Double.valueOf(addressSuggestion.getLat()), Double.valueOf(addressSuggestion.getLng()), this.this$0.this$0.currentQuerySessionToken).observe(this.this$0.this$0, this.this$0.this$0.mObserveQueryTextSearch);
                }
            });
        }
    }
}
