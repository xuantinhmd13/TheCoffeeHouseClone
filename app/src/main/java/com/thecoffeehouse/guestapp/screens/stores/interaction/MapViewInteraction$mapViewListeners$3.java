package com.thecoffeehouse.guestapp.screens.stores.interaction;

import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapViewInteraction.kt */
public final class MapViewInteraction$mapViewListeners$3 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ MapViewInteraction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MapViewInteraction$mapViewListeners$3(MapViewInteraction mapViewInteraction) {
        super(1);
        this.this$0 = mapViewInteraction;
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
        GoogleMap mGoogleMap = this.this$0.getMGoogleMap();
        if (mGoogleMap != null) {
            mGoogleMap.animateCamera(CameraUpdateFactory.zoomOut());
        }
    }
}
