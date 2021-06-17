package com.thecoffeehouse.guestapp.screens.order;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.os.AsyncTask;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.maps.model.LatLng;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u001a\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ#\u0010\u000e\u001a\u0004\u0018\u00010\u00042\u0012\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0010\"\u00020\u0002H\u0014¢\u0006\u0002\u0010\u0011J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0004H\u0014R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/ReverseGeocodeLocationAsyncTask;", "Landroid/os/AsyncTask;", "Lcom/google/android/gms/maps/model/LatLng;", "Ljava/lang/Void;", "Landroid/location/Address;", "mContext", "Landroid/content/Context;", "onReverseDone", "Lkotlin/Function2;", "", "", "(Landroid/content/Context;Lkotlin/jvm/functions/Function2;)V", "mGeoCoder", "Landroid/location/Geocoder;", "doInBackground", NativeProtocol.WEB_DIALOG_PARAMS, "", "([Lcom/google/android/gms/maps/model/LatLng;)Landroid/location/Address;", "onPostExecute", "result", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderExts.kt */
public final class ReverseGeocodeLocationAsyncTask extends AsyncTask<LatLng, Void, Address> {
    private Geocoder mGeoCoder;
    private final Function2<String, Address, Unit> onReverseDone;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super java.lang.String, ? super android.location.Address, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ReverseGeocodeLocationAsyncTask(Context context, Function2<? super String, ? super Address, Unit> function2) {
        Intrinsics.checkNotNullParameter(context, "mContext");
        Intrinsics.checkNotNullParameter(function2, "onReverseDone");
        this.onReverseDone = function2;
        this.mGeoCoder = new Geocoder(context);
    }

    /* access modifiers changed from: protected */
    public Address doInBackground(LatLng... latLngArr) {
        Intrinsics.checkNotNullParameter(latLngArr, NativeProtocol.WEB_DIALOG_PARAMS);
        LatLng latLng = latLngArr[0];
        Address address = null;
        try {
            return this.mGeoCoder.getFromLocation(latLng.latitude, latLng.longitude, 1).get(0);
        } catch (Exception e) {
            e.printStackTrace();
            return address;
        }
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Address address) {
        super.onPostExecute((Object) address);
        this.onReverseDone.invoke(String.valueOf(address != null ? address.getAddressLine(0) : null), address);
    }
}
