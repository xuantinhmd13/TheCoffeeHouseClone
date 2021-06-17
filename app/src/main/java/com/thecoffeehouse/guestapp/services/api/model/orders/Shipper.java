package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\bHÆ\u0003J9\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR \u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000bR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Shipper;", "", "phone", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "name", "", "avatar", "locationStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "(Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;Ljava/lang/String;Ljava/lang/String;Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;)V", "getAvatar", "()Ljava/lang/String;", "getLocationStore", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;", "setLocationStore", "(Lcom/thecoffeehouse/guestapp/services/api/model/stores/LocationStore;)V", "getName", "getPhone", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Phone;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Shipper {
    @SerializedName("avatar")
    private final String avatar;
    @SerializedName(FirebaseAnalytics.Param.LOCATION)
    private LocationStore locationStore;
    @SerializedName("name")
    private final String name;
    @SerializedName("phone")
    private final Phone phone;

    public Shipper() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ Shipper copy$default(Shipper shipper, Phone phone2, String str, String str2, LocationStore locationStore2, int i, Object obj) {
        if ((i & 1) != 0) {
            phone2 = shipper.phone;
        }
        if ((i & 2) != 0) {
            str = shipper.name;
        }
        if ((i & 4) != 0) {
            str2 = shipper.avatar;
        }
        if ((i & 8) != 0) {
            locationStore2 = shipper.locationStore;
        }
        return shipper.copy(phone2, str, str2, locationStore2);
    }

    public final Phone component1() {
        return this.phone;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.avatar;
    }

    public final LocationStore component4() {
        return this.locationStore;
    }

    public final Shipper copy(Phone phone2, String str, String str2, LocationStore locationStore2) {
        return new Shipper(phone2, str, str2, locationStore2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shipper)) {
            return false;
        }
        Shipper shipper = (Shipper) obj;
        return Intrinsics.areEqual(this.phone, shipper.phone) && Intrinsics.areEqual(this.name, shipper.name) && Intrinsics.areEqual(this.avatar, shipper.avatar) && Intrinsics.areEqual(this.locationStore, shipper.locationStore);
    }

    public int hashCode() {
        Phone phone2 = this.phone;
        int i = 0;
        int hashCode = (phone2 != null ? phone2.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.avatar;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        LocationStore locationStore2 = this.locationStore;
        if (locationStore2 != null) {
            i = locationStore2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "Shipper(phone=" + this.phone + ", name=" + this.name + ", avatar=" + this.avatar + ", locationStore=" + this.locationStore + ")";
    }

    public Shipper(Phone phone2, String str, String str2, LocationStore locationStore2) {
        this.phone = phone2;
        this.name = str;
        this.avatar = str2;
        this.locationStore = locationStore2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Shipper(Phone phone2, String str, String str2, LocationStore locationStore2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : phone2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : locationStore2);
    }

    public final Phone getPhone() {
        return this.phone;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final LocationStore getLocationStore() {
        return this.locationStore;
    }

    public final void setLocationStore(LocationStore locationStore2) {
        this.locationStore = locationStore2;
    }
}
