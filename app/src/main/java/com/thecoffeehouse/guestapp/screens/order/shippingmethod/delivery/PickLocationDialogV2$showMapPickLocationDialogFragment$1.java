package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.google.android.gms.maps.model.LatLng;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2$showMapPickLocationDialogFragment$1 extends Lambda implements Function1<LatLng, Unit> {
    final /* synthetic */ BaseFullScreenDialogFragment.ObserverBaseResource $observeGetPickLocation;
    final /* synthetic */ PickLocationDialogV2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialogV2$showMapPickLocationDialogFragment$1(PickLocationDialogV2 pickLocationDialogV2, BaseFullScreenDialogFragment.ObserverBaseResource observerBaseResource) {
        super(1);
        this.this$0 = pickLocationDialogV2;
        this.$observeGetPickLocation = observerBaseResource;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(LatLng latLng) {
        invoke(latLng);
        return Unit.INSTANCE;
    }

    public final void invoke(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.this$0.getMPickLocationViewModel().getAutoCompleteSearch(null, Double.valueOf(latLng.latitude), Double.valueOf(latLng.longitude), this.this$0.currentQuerySessionToken).observe(this.this$0, this.$observeGetPickLocation);
    }
}
