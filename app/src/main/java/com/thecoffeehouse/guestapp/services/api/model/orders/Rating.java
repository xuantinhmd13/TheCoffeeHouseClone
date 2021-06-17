package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B-\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J6\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0007HÖ\u0001R\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;", "", "rating", "", "attention", "", "comment", "", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)V", "getAttention", "()Ljava/util/List;", "getComment", "()Ljava/lang/String;", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/orders/Rating;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class Rating {
    @SerializedName("attention")
    private final List<Integer> attention;
    @SerializedName("comment")
    private final String comment;
    @SerializedName("rating")
    private final Integer rating;

    public Rating() {
        this(null, null, null, 7, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.orders.Rating */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Rating copy$default(Rating rating2, Integer num, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            num = rating2.rating;
        }
        if ((i & 2) != 0) {
            list = rating2.attention;
        }
        if ((i & 4) != 0) {
            str = rating2.comment;
        }
        return rating2.copy(num, list, str);
    }

    public final Integer component1() {
        return this.rating;
    }

    public final List<Integer> component2() {
        return this.attention;
    }

    public final String component3() {
        return this.comment;
    }

    public final Rating copy(Integer num, List<Integer> list, String str) {
        Intrinsics.checkNotNullParameter(list, "attention");
        return new Rating(num, list, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rating)) {
            return false;
        }
        Rating rating2 = (Rating) obj;
        return Intrinsics.areEqual(this.rating, rating2.rating) && Intrinsics.areEqual(this.attention, rating2.attention) && Intrinsics.areEqual(this.comment, rating2.comment);
    }

    public int hashCode() {
        Integer num = this.rating;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        List<Integer> list = this.attention;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        String str = this.comment;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        return "Rating(rating=" + this.rating + ", attention=" + this.attention + ", comment=" + this.comment + ")";
    }

    public Rating(Integer num, List<Integer> list, String str) {
        Intrinsics.checkNotNullParameter(list, "attention");
        this.rating = num;
        this.attention = list;
        this.comment = str;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Rating(Integer num, List list, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? new ArrayList() : list, (i & 4) != 0 ? null : str);
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final List<Integer> getAttention() {
        return this.attention;
    }

    public final String getComment() {
        return this.comment;
    }
}
