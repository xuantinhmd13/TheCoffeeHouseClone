package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.os.Handler;
import androidx.lifecycle.Observer;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetShippingInfoResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shipper;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderMapViewDialogFragment.kt */
public final class TrackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1 implements Runnable {
    final /* synthetic */ long $frequentInSec;
    final /* synthetic */ TrackingOrderMapViewDialogFragment this$0;

    TrackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1(TrackingOrderMapViewDialogFragment trackingOrderMapViewDialogFragment, long j) {
        this.this$0 = trackingOrderMapViewDialogFragment;
        this.$frequentInSec = j;
    }

    public final void run() {
        Handler handler = this.this$0.mUpdateShipperLocationHandler;
        if (handler != null) {
            Runnable runnable = this.this$0.periodicUpdate;
            Intrinsics.checkNotNull(runnable);
            handler.postDelayed(runnable, this.$frequentInSec * ((long) 1000));
        }
        this.this$0.getMOrderViewModel().getShippingInfo(TrackingOrderMapViewDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getRef(), TrackingOrderMapViewDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getOrderType()).observe(this.this$0, new Observer<Resource<? extends GetShippingInfoResponse>>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1.AnonymousClass1 */
            final /* synthetic */ TrackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.Observer
            public /* bridge */ /* synthetic */ void onChanged(Resource<? extends GetShippingInfoResponse> resource) {
                onChanged((Resource<GetShippingInfoResponse>) resource);
            }

            public final void onChanged(Resource<GetShippingInfoResponse> resource) {
                LocationStore locationStore;
                if (resource != null && resource.getStatus() == Status.SUCCESS && resource.getData() != null) {
                    Shipper shipper = resource.getData().getShipper();
                    LatLng latLng = null;
                    if ((shipper != null ? shipper.getLocationStore() : null) != null) {
                        StringBuilder append = new StringBuilder().append("run run run: ");
                        Shipper shipper2 = resource.getData().getShipper();
                        GeneralKt.log(append.append(shipper2 != null ? shipper2.getLocationStore() : null).toString());
                        TrackingOrderMapViewDialogFragment trackingOrderMapViewDialogFragment = this.this$0.this$0;
                        Marker marker = this.this$0.this$0.mShipperMarker;
                        Intrinsics.checkNotNull(marker);
                        Shipper shipper3 = resource.getData().getShipper();
                        if (!(shipper3 == null || (locationStore = shipper3.getLocationStore()) == null)) {
                            latLng = locationStore.getLatLng();
                        }
                        Intrinsics.checkNotNull(latLng);
                        trackingOrderMapViewDialogFragment.animateMarkerV2(marker, latLng);
                        return;
                    }
                    Handler handler = this.this$0.this$0.mUpdateShipperLocationHandler;
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                }
            }
        });
    }
}
