package com.thecoffeehouse.guestapp.services.api.model.stores;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\u0006\u0010\u0015\u001a\u00020\u0016J\t\u0010\u0017\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0019\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0010HÖ\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u0004\u001a\u00020\u00038\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "Landroid/os/Parcelable;", "lat", "", "long", "(DD)V", "getLat", "()D", "setLat", "(D)V", "getLong", "setLong", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "getLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Store.kt */
public final class LocationStore implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    @SerializedName("lat")
    @Expose
    private double lat;
    @SerializedName("long")
    @Expose

    /* renamed from: long  reason: not valid java name */
    private double f3long;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        public final Object createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "in");
            return new LocationStore(parcel.readDouble(), parcel.readDouble());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new LocationStore[i];
        }
    }

    public static /* synthetic */ LocationStore copy$default(LocationStore locationStore, double d, double d2, int i, Object obj) {
        if ((i & 1) != 0) {
            d = locationStore.lat;
        }
        if ((i & 2) != 0) {
            d2 = locationStore.f3long;
        }
        return locationStore.copy(d, d2);
    }

    public final double component1() {
        return this.lat;
    }

    public final double component2() {
        return this.f3long;
    }

    public final LocationStore copy(double d, double d2) {
        return new LocationStore(d, d2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationStore)) {
            return false;
        }
        LocationStore locationStore = (LocationStore) obj;
        return Double.compare(this.lat, locationStore.lat) == 0 && Double.compare(this.f3long, locationStore.f3long) == 0;
    }

    public int hashCode() {
        return (Double.hashCode(this.lat) * 31) + Double.hashCode(this.f3long);
    }

    public String toString() {
        return "LocationStore(lat=" + this.lat + ", long=" + this.f3long + ")";
    }

    public void writeToParcel(Parcel parcel, int i) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeDouble(this.lat);
        parcel.writeDouble(this.f3long);
    }

    public LocationStore(double d, double d2) {
        this.lat = d;
        this.f3long = d2;
    }

    public final double getLat() {
        return this.lat;
    }

    public final void setLat(double d) {
        this.lat = d;
    }

    public final double getLong() {
        return this.f3long;
    }

    public final void setLong(double d) {
        this.f3long = d;
    }

    public final LatLng getLatLng() {
        return new LatLng(this.lat, this.f3long);
    }
}
