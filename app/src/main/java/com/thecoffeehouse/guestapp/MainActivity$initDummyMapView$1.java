package com.thecoffeehouse.guestapp;

import android.location.Location;
import android.os.Looper;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", FirebaseAnalytics.Param.LOCATION, "Landroid/location/Location;", "onSuccess"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$initDummyMapView$1<TResult> implements OnSuccessListener<Location> {
    final /* synthetic */ FusedLocationProviderClient $fusedLocationClient;
    final /* synthetic */ MainActivity this$0;

    MainActivity$initDummyMapView$1(MainActivity mainActivity, FusedLocationProviderClient fusedLocationProviderClient) {
        this.this$0 = mainActivity;
        this.$fusedLocationClient = fusedLocationProviderClient;
    }

    public final void onSuccess(Location location) {
        if (location != null) {
            this.this$0.getAddressSuggestion(new LatLng(location.getLatitude(), location.getLongitude()), new Function1<AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.MainActivity$initDummyMapView$1.AnonymousClass1 */
                final /* synthetic */ MainActivity$initDummyMapView$1 this$0;

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
                    Intrinsics.checkNotNullParameter(addressSuggestion, "it");
                    this.this$0.this$0.addressSuggestion = addressSuggestion;
                }
            });
            return;
        }
        LocationRequest create = LocationRequest.create();
        Intrinsics.checkNotNullExpressionValue(create, "locationRequest");
        create.setPriority(100);
        create.setInterval(100);
        create.setFastestInterval(50);
        this.$fusedLocationClient.requestLocationUpdates(create, new MainActivity$initDummyMapView$1$callBackLocation$1(this), Looper.getMainLooper());
    }
}
