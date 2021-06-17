package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.location.Location;
import android.view.View;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/MapPickLocationFragment$mapViewListeners$2$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MapPickLocationFragment.kt */
public final class MapPickLocationFragment$mapViewListeners$$inlined$apply$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ MapPickLocationFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MapPickLocationFragment$mapViewListeners$$inlined$apply$lambda$1(MapPickLocationFragment mapPickLocationFragment) {
        super(1);
        this.this$0 = mapPickLocationFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Location myLocation;
        Location myLocation2;
        Intrinsics.checkNotNullParameter(view, "it");
        GoogleMap access$getMGoogleMap$p = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0);
        if (access$getMGoogleMap$p != null && access$getMGoogleMap$p.isMyLocationEnabled()) {
            GoogleMap access$getMGoogleMap$p2 = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0);
            if ((access$getMGoogleMap$p2 != null ? access$getMGoogleMap$p2.getMyLocation() : null) != null) {
                GoogleMap access$getMGoogleMap$p3 = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0);
                if (access$getMGoogleMap$p3 != null) {
                    GoogleMap access$getMGoogleMap$p4 = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0);
                    double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                    double latitude = (access$getMGoogleMap$p4 == null || (myLocation2 = access$getMGoogleMap$p4.getMyLocation()) == null) ? 0.0d : myLocation2.getLatitude();
                    GoogleMap access$getMGoogleMap$p5 = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0);
                    if (!(access$getMGoogleMap$p5 == null || (myLocation = access$getMGoogleMap$p5.getMyLocation()) == null)) {
                        d = myLocation.getLongitude();
                    }
                    access$getMGoogleMap$p3.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(latitude, d), MapPickLocationFragment.access$getMDefaultZoomMap$p(this.this$0)));
                    return;
                }
                return;
            }
        }
        MainActivity access$getMainActivity = MapPickLocationFragment.access$getMainActivity(this.this$0);
        if (access$getMainActivity != null) {
            access$getMainActivity.getMyAddress(new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.MapPickLocationFragment$mapViewListeners$$inlined$apply$lambda$1.AnonymousClass1 */
                final /* synthetic */ MapPickLocationFragment$mapViewListeners$$inlined$apply$lambda$1 this$0;

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
                    GoogleMap access$getMGoogleMap$p = MapPickLocationFragment.access$getMGoogleMap$p(this.this$0.this$0);
                    if (access$getMGoogleMap$p != null) {
                        access$getMGoogleMap$p.animateCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(addressSuggestion.getLat(), addressSuggestion.getLng()), MapPickLocationFragment.access$getMDefaultZoomMap$p(this.this$0.this$0)));
                    }
                }
            });
        }
    }
}
