package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderMapViewDialogFragment;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderMapViewDialogFragment.kt */
public final class TrackingOrderMapViewDialogFragment$animateMarkerV2$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ LatLng $destination;
    final /* synthetic */ Marker $marker;
    final /* synthetic */ LatLng $startPosition;
    final /* synthetic */ TrackingOrderMapViewDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingOrderMapViewDialogFragment$animateMarkerV2$1(TrackingOrderMapViewDialogFragment trackingOrderMapViewDialogFragment, LatLng latLng, LatLng latLng2, Marker marker) {
        super(0);
        this.this$0 = trackingOrderMapViewDialogFragment;
        this.$destination = latLng;
        this.$startPosition = latLng2;
        this.$marker = marker;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        final LatLng latLng = new LatLng(this.$destination.latitude, this.$destination.longitude);
        GoogleMap googleMap = this.this$0.mGoogleMap;
        if (googleMap != null) {
            MapViewInteraction.Companion companion = MapViewInteraction.Companion;
            LatLng[] latLngArr = new LatLng[2];
            latLngArr[0] = latLng;
            AddressOrder address = TrackingOrderMapViewDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getAddress();
            LatLng latLng2 = address != null ? address.getLatLng() : null;
            Intrinsics.checkNotNull(latLng2);
            latLngArr[1] = latLng2;
            MapViewInteraction.Companion.zoomToPositions$default(companion, googleMap, CollectionsKt.listOf((Object[]) latLngArr), 0, false, 12, null);
        }
        GoogleMap googleMap2 = this.this$0.mGoogleMap;
        if (googleMap2 != null) {
            googleMap2.setOnMapLoadedCallback(new GoogleMap.OnMapLoadedCallback(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderMapViewDialogFragment$animateMarkerV2$1.AnonymousClass2 */
                final /* synthetic */ TrackingOrderMapViewDialogFragment$animateMarkerV2$1 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // com.google.android.gms.maps.GoogleMap.OnMapLoadedCallback
                public final void onMapLoaded() {
                    final TrackingOrderMapViewDialogFragment.LatLngInterpolator.LinearFixed linearFixed = new TrackingOrderMapViewDialogFragment.LatLngInterpolator.LinearFixed();
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    Intrinsics.checkNotNullExpressionValue(ofFloat, "valueAnimator");
                    ofFloat.setDuration(1000L);
                    ofFloat.setInterpolator(new AccelerateDecelerateInterpolator());
                    ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener(this) {
                        /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderMapViewDialogFragment$animateMarkerV2$1.AnonymousClass2.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass2 this$0;

                        {
                            this.this$0 = r1;
                        }

                        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                            try {
                                Intrinsics.checkNotNullExpressionValue(valueAnimator, "animation");
                                float animatedFraction = valueAnimator.getAnimatedFraction();
                                TrackingOrderMapViewDialogFragment.LatLngInterpolator latLngInterpolator = linearFixed;
                                LatLng latLng = this.this$0.this$0.$startPosition;
                                Intrinsics.checkNotNullExpressionValue(latLng, "startPosition");
                                this.this$0.this$0.$marker.setPosition(latLngInterpolator.interpolate(animatedFraction, latLng, latLng));
                            } catch (Exception unused) {
                            }
                        }
                    });
                    ofFloat.start();
                }
            });
        }
    }
}
