package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$mapViewListeners$3$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$mapViewListeners$$inlined$apply$lambda$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$mapViewListeners$$inlined$apply$lambda$2(PickLocationDialog pickLocationDialog) {
        super(1);
        this.this$0 = pickLocationDialog;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        GoogleMap access$getMGoogleMap$p = PickLocationDialog.access$getMGoogleMap$p(this.this$0);
        if (access$getMGoogleMap$p != null) {
            access$getMGoogleMap$p.animateCamera(CameraUpdateFactory.zoomIn());
        }
    }
}
