package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u000f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RatingCategories;", "", "stores", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RatingOrder;", "deliveries", "(Ljava/util/List;Ljava/util/List;)V", "getDeliveries", "()Ljava/util/List;", "getStores", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class RatingCategories {
    @SerializedName("deliveries")
    private final List<RatingOrder> deliveries;
    @SerializedName("stores")
    private final List<RatingOrder> stores;

    public RatingCategories() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.common.config.RatingCategories */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingCategories copy$default(RatingCategories ratingCategories, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = ratingCategories.stores;
        }
        if ((i & 2) != 0) {
            list2 = ratingCategories.deliveries;
        }
        return ratingCategories.copy(list, list2);
    }

    public final List<RatingOrder> component1() {
        return this.stores;
    }

    public final List<RatingOrder> component2() {
        return this.deliveries;
    }

    public final RatingCategories copy(List<RatingOrder> list, List<RatingOrder> list2) {
        Intrinsics.checkNotNullParameter(list, "stores");
        Intrinsics.checkNotNullParameter(list2, "deliveries");
        return new RatingCategories(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingCategories)) {
            return false;
        }
        RatingCategories ratingCategories = (RatingCategories) obj;
        return Intrinsics.areEqual(this.stores, ratingCategories.stores) && Intrinsics.areEqual(this.deliveries, ratingCategories.deliveries);
    }

    public int hashCode() {
        List<RatingOrder> list = this.stores;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<RatingOrder> list2 = this.deliveries;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "RatingCategories(stores=" + this.stores + ", deliveries=" + this.deliveries + ")";
    }

    public RatingCategories(List<RatingOrder> list, List<RatingOrder> list2) {
        Intrinsics.checkNotNullParameter(list, "stores");
        Intrinsics.checkNotNullParameter(list2, "deliveries");
        this.stores = list;
        this.deliveries = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingCategories(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }

    public final List<RatingOrder> getStores() {
        return this.stores;
    }

    public final List<RatingOrder> getDeliveries() {
        return this.deliveries;
    }
}
