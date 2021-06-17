package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B;\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J?\u0010\u000f\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R\u001e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;", "", "deli", "", "", "pickup", "table", "(Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "getDeli", "()Ljava/util/List;", "getPickup", "getTable", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class ShippingPayment {
    @SerializedName("DELI")
    private final List<String> deli;
    @SerializedName("PICKUP")
    private final List<String> pickup;
    @SerializedName("TABLE")
    private final List<String> table;

    public ShippingPayment() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.common.config.ShippingPayment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ShippingPayment copy$default(ShippingPayment shippingPayment, List list, List list2, List list3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = shippingPayment.deli;
        }
        if ((i & 2) != 0) {
            list2 = shippingPayment.pickup;
        }
        if ((i & 4) != 0) {
            list3 = shippingPayment.table;
        }
        return shippingPayment.copy(list, list2, list3);
    }

    public final List<String> component1() {
        return this.deli;
    }

    public final List<String> component2() {
        return this.pickup;
    }

    public final List<String> component3() {
        return this.table;
    }

    public final ShippingPayment copy(List<String> list, List<String> list2, List<String> list3) {
        return new ShippingPayment(list, list2, list3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ShippingPayment)) {
            return false;
        }
        ShippingPayment shippingPayment = (ShippingPayment) obj;
        return Intrinsics.areEqual(this.deli, shippingPayment.deli) && Intrinsics.areEqual(this.pickup, shippingPayment.pickup) && Intrinsics.areEqual(this.table, shippingPayment.table);
    }

    public int hashCode() {
        List<String> list = this.deli;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<String> list2 = this.pickup;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        List<String> list3 = this.table;
        if (list3 != null) {
            i = list3.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "ShippingPayment(deli=" + this.deli + ", pickup=" + this.pickup + ", table=" + this.table + ")";
    }

    public ShippingPayment(List<String> list, List<String> list2, List<String> list3) {
        this.deli = list;
        this.pickup = list2;
        this.table = list3;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ShippingPayment(List list, List list2, List list3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2, (i & 4) != 0 ? new ArrayList() : list3);
    }

    public final List<String> getDeli() {
        return this.deli;
    }

    public final List<String> getPickup() {
        return this.pickup;
    }

    public final List<String> getTable() {
        return this.table;
    }
}
