package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.Algorithm;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarker;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0014\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\u0007"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreDialogFragment$setupInfoWindowGoogleMap$1", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "getInfoContents", "Landroid/view/View;", "p0", "Lcom/google/android/gms/maps/model/Marker;", "getInfoWindow", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
public final class PickStoreDialogFragment$setupInfoWindowGoogleMap$1 implements GoogleMap.InfoWindowAdapter {
    final /* synthetic */ PickStoreDialogFragment this$0;

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoContents(Marker marker) {
        return null;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PickStoreDialogFragment$setupInfoWindowGoogleMap$1(PickStoreDialogFragment pickStoreDialogFragment) {
        this.this$0 = pickStoreDialogFragment;
    }

    @Override // com.google.android.gms.maps.GoogleMap.InfoWindowAdapter
    public View getInfoWindow(Marker marker) {
        T t;
        List<String> images;
        Double distance;
        List<String> images2;
        Algorithm<ClusterMarker> algorithm;
        Collection<ClusterMarker> items;
        T t2;
        try {
            ClusterManager<ClusterMarker> mClusterManager = this.this$0.getMapViewInteractions().getMClusterManager();
            if (mClusterManager == null || (algorithm = mClusterManager.getAlgorithm()) == null || (items = algorithm.getItems()) == null) {
                t = null;
            } else {
                Iterator<T> it = items.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        t2 = null;
                        break;
                    }
                    t2 = it.next();
                    T t3 = t2;
                    Intrinsics.checkNotNullExpressionValue(t3, "it");
                    if (Intrinsics.areEqual(t3.getPosition(), marker != null ? marker.getPosition() : null)) {
                        break;
                    }
                }
                t = t2;
            }
            Store store = t != null ? t.getStore() : null;
            View inflate = LayoutInflater.from(this.this$0.requireContext()).inflate(R.layout.item_store_info_window, (ViewGroup) null, false);
            Glide.with(this.this$0.requireContext()).load((store == null || (images2 = store.getImages()) == null) ? null : (String) CollectionsKt.first((List) images2)).into(new PickStoreDialogFragment$setupInfoWindowGoogleMap$1$getInfoWindow$1(inflate, marker));
            Intrinsics.checkNotNullExpressionValue(inflate, "layout");
            TextView textView = (TextView) inflate.findViewById(R.id.txt_address_store);
            Intrinsics.checkNotNullExpressionValue(textView, "layout.txt_address_store");
            textView.setText(store != null ? store.getFullAddress() : null);
            String format = new DecimalFormat("#.##").format((store == null || (distance = store.getDistance()) == null) ? null : Double.valueOf(distance.doubleValue() / ((double) 1000)));
            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_distance);
            Intrinsics.checkNotNullExpressionValue(textView2, "layout.txt_distance");
            textView2.setText(this.this$0.getString(R.string.str_store_distance_away, format));
            GeneralKt.log((store == null || (images = store.getImages()) == null) ? null : (String) CollectionsKt.first((List) images));
            return inflate;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
