package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.os.AsyncTask;
import com.facebook.internal.NativeProtocol;
import com.google.android.gms.maps.model.Marker;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0004\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0002\u0010\bJ'\u0010\t\u001a\u0004\u0018\u00010\u00022\u0016\u0010\n\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00020\u000b\"\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0002\u0010\fJ\u0012\u0010\r\u001a\u00020\u00072\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00070\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/InfoWindowClickAsyncTask;", "Landroid/os/AsyncTask;", "Ljava/lang/Void;", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onCompleted", "Lkotlin/Function1;", "", "(Lcom/google/android/gms/maps/model/Marker;Lkotlin/jvm/functions/Function1;)V", "doInBackground", NativeProtocol.WEB_DIALOG_PARAMS, "", "([Ljava/lang/Void;)Ljava/lang/Void;", "onPostExecute", "result", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: InfoWindowClickAsyncTask.kt */
public final class InfoWindowClickAsyncTask extends AsyncTask<Void, Void, Void> {
    private final Marker marker;
    private final Function1<Marker, Unit> onCompleted;

    /* access modifiers changed from: protected */
    public Void doInBackground(Void... voidArr) {
        Intrinsics.checkNotNullParameter(voidArr, NativeProtocol.WEB_DIALOG_PARAMS);
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.google.android.gms.maps.model.Marker, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public InfoWindowClickAsyncTask(Marker marker2, Function1<? super Marker, Unit> function1) {
        Intrinsics.checkNotNullParameter(marker2, "marker");
        Intrinsics.checkNotNullParameter(function1, "onCompleted");
        this.marker = marker2;
        this.onCompleted = function1;
    }

    /* access modifiers changed from: protected */
    public void onPostExecute(Void r2) {
        super.onPostExecute((Object) r2);
        this.onCompleted.invoke(this.marker);
    }
}
