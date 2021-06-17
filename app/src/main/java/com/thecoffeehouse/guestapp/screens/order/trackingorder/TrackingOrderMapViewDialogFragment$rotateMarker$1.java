package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.os.Handler;
import android.os.SystemClock;
import android.view.animation.Interpolator;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment$rotateMarker$1", "Ljava/lang/Runnable;", "run", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingOrderMapViewDialogFragment.kt */
public final class TrackingOrderMapViewDialogFragment$rotateMarker$1 implements Runnable {
    final /* synthetic */ long $duration;
    final /* synthetic */ Handler $handler;
    final /* synthetic */ Interpolator $interpolator;
    final /* synthetic */ Marker $marker;
    final /* synthetic */ Function0 $onCompleted;
    final /* synthetic */ long $start;
    final /* synthetic */ Ref.FloatRef $startRotation;
    final /* synthetic */ float $toRotation;

    TrackingOrderMapViewDialogFragment$rotateMarker$1(long j, Interpolator interpolator, long j2, float f, Ref.FloatRef floatRef, Marker marker, Handler handler, Function0 function0) {
        this.$start = j;
        this.$interpolator = interpolator;
        this.$duration = j2;
        this.$toRotation = f;
        this.$startRotation = floatRef;
        this.$marker = marker;
        this.$handler = handler;
        this.$onCompleted = function0;
    }

    public void run() {
        float interpolation = this.$interpolator.getInterpolation(((float) (SystemClock.uptimeMillis() - this.$start)) / ((float) this.$duration));
        float f = (this.$toRotation * interpolation) + ((((float) 1) - interpolation) * this.$startRotation.element);
        int i = ((-f) > ((float) 180) ? 1 : ((-f) == ((float) 180) ? 0 : -1));
        this.$marker.setRotation(i > 0 ? f / ((float) 2) : f);
        Ref.FloatRef floatRef = this.$startRotation;
        if (i > 0) {
            f /= (float) 2;
        }
        floatRef.element = f;
        if (((double) interpolation) < 1.0d) {
            this.$handler.postDelayed(this, 16);
            return;
        }
        this.$onCompleted.invoke();
        this.$handler.removeCallbacksAndMessages(null);
    }
}
