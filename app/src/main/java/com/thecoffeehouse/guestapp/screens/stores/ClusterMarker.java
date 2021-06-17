package com.thecoffeehouse.guestapp.screens.stores;

import com.google.android.gms.maps.model.LatLng;
import com.google.maps.android.clustering.ClusterItem;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB\u001f\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0002\u0010\rJ\b\u0010\u0019\u001a\u00020\nH\u0016J\n\u0010\u001a\u001a\u0004\u0018\u00010\u0007H\u0016J\n\u0010\u001b\u001a\u0004\u0018\u00010\u0007H\u0016R\u001a\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "Lcom/google/maps/android/clustering/ClusterItem;", "lat", "", "lng", "(DD)V", "title", "", "(DDLjava/lang/String;)V", "mPosition", "Lcom/google/android/gms/maps/model/LatLng;", "mTitle", "mSnippets", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;Ljava/lang/String;)V", "isSelected", "", "()Z", "setSelected", "(Z)V", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "getStore", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "setStore", "(Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;)V", "getPosition", "getSnippet", "getTitle", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ClusterMarker.kt */
public final class ClusterMarker implements ClusterItem {
    private boolean isSelected;
    private LatLng mPosition;
    private String mSnippets = "";
    private String mTitle = "";
    public Store store;

    public final boolean isSelected() {
        return this.isSelected;
    }

    public final void setSelected(boolean z) {
        this.isSelected = z;
    }

    public final Store getStore() {
        Store store2 = this.store;
        if (store2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        return store2;
    }

    public final void setStore(Store store2) {
        Intrinsics.checkNotNullParameter(store2, "<set-?>");
        this.store = store2;
    }

    public ClusterMarker(double d, double d2) {
        this.mPosition = new LatLng(d, d2);
    }

    public ClusterMarker(double d, double d2, String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.mPosition = new LatLng(d, d2);
        this.mTitle = str;
    }

    public ClusterMarker(LatLng latLng, String str, String str2) {
        Intrinsics.checkNotNullParameter(latLng, "mPosition");
        Intrinsics.checkNotNullParameter(str, "mTitle");
        Intrinsics.checkNotNullParameter(str2, "mSnippets");
        this.mPosition = latLng;
        this.mTitle = str;
        this.mSnippets = str2;
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public String getSnippet() {
        return this.mSnippets;
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public String getTitle() {
        return this.mTitle;
    }

    @Override // com.google.maps.android.clustering.ClusterItem
    public LatLng getPosition() {
        return this.mPosition;
    }
}
