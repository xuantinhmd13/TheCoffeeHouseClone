package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import com.google.android.gms.tasks.OnFailureListener;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$mapViewListeners$2 implements OnFailureListener {
    public static final PickLocationDialog$mapViewListeners$2 INSTANCE = new PickLocationDialog$mapViewListeners$2();

    PickLocationDialog$mapViewListeners$2() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        exc.printStackTrace();
    }
}
