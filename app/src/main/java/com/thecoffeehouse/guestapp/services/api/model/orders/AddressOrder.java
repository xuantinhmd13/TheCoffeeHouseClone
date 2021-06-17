package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0013\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0017\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u001f\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u000bB\u0017\b\u0016\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\fB\u0007\b\u0016¢\u0006\u0002\u0010\rJ\u0006\u0010\u001a\u001a\u00020\u0003J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u001e\u0010\u000e\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0013\u001a\u00020\t8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0010\"\u0004\b\u0015\u0010\u0012R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "", "latLng", "Lcom/google/android/gms/maps/model/LatLng;", "(Lcom/google/android/gms/maps/model/LatLng;)V", "street", "", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/lang/String;)V", "lat", "", "long", "(DDLjava/lang/String;)V", "(DD)V", "()V", "latitude", "getLatitude", "()D", "setLatitude", "(D)V", "longitude", "getLongitude", "setLongitude", "getStreet", "()Ljava/lang/String;", "setStreet", "(Ljava/lang/String;)V", "getLatLng", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class AddressOrder {
    @SerializedName("lat")
    private double latitude;
    @SerializedName("long")
    private double longitude;
    @SerializedName("street")
    private String street = "";

    public final double getLatitude() {
        return this.latitude;
    }

    public final void setLatitude(double d) {
        this.latitude = d;
    }

    public final double getLongitude() {
        return this.longitude;
    }

    public final void setLongitude(double d) {
        this.longitude = d;
    }

    public final String getStreet() {
        return this.street;
    }

    public final void setStreet(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.street = str;
    }

    public AddressOrder(LatLng latLng) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
    }

    public AddressOrder(LatLng latLng, String str) {
        Intrinsics.checkNotNullParameter(latLng, "latLng");
        Intrinsics.checkNotNullParameter(str, "street");
        this.latitude = latLng.latitude;
        this.longitude = latLng.longitude;
        this.street = str;
    }

    public AddressOrder(double d, double d2, String str) {
        Intrinsics.checkNotNullParameter(str, "street");
        this.latitude = d;
        this.longitude = d2;
        this.street = str;
    }

    public AddressOrder(double d, double d2) {
        this.latitude = d;
        this.longitude = d2;
    }

    public AddressOrder() {
    }

    public final LatLng getLatLng() {
        return new LatLng(this.latitude, this.longitude);
    }

    public String toString() {
        return "AddressOrder(lat=" + this.latitude + ", long=" + this.longitude + ", street=" + this.street + ')';
    }
}
