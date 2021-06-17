package com.thecoffeehouse.guestapp.services.api.model.orders;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0019\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\bHÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JL\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0018\b\u0002\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R&\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0007j\b\u0012\u0004\u0012\u00020\u0005`\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000e¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderRequest;", "", "ref", "", "rating", "", "attention", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "comment", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;)V", "getAttention", "()Ljava/util/ArrayList;", "getComment", "()Ljava/lang/String;", "getRating", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getRef", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/util/ArrayList;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderRequest;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Order.kt */
public final class RatingOrderRequest {
    @SerializedName("attention")
    private final ArrayList<Integer> attention;
    @SerializedName("comment")
    private final String comment;
    @SerializedName("rating")
    private final Integer rating;
    @SerializedName("ref")
    private final String ref;

    public RatingOrderRequest() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderRequest */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RatingOrderRequest copy$default(RatingOrderRequest ratingOrderRequest, String str, Integer num, ArrayList arrayList, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ratingOrderRequest.ref;
        }
        if ((i & 2) != 0) {
            num = ratingOrderRequest.rating;
        }
        if ((i & 4) != 0) {
            arrayList = ratingOrderRequest.attention;
        }
        if ((i & 8) != 0) {
            str2 = ratingOrderRequest.comment;
        }
        return ratingOrderRequest.copy(str, num, arrayList, str2);
    }

    public final String component1() {
        return this.ref;
    }

    public final Integer component2() {
        return this.rating;
    }

    public final ArrayList<Integer> component3() {
        return this.attention;
    }

    public final String component4() {
        return this.comment;
    }

    public final RatingOrderRequest copy(String str, Integer num, ArrayList<Integer> arrayList, String str2) {
        Intrinsics.checkNotNullParameter(arrayList, "attention");
        return new RatingOrderRequest(str, num, arrayList, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingOrderRequest)) {
            return false;
        }
        RatingOrderRequest ratingOrderRequest = (RatingOrderRequest) obj;
        return Intrinsics.areEqual(this.ref, ratingOrderRequest.ref) && Intrinsics.areEqual(this.rating, ratingOrderRequest.rating) && Intrinsics.areEqual(this.attention, ratingOrderRequest.attention) && Intrinsics.areEqual(this.comment, ratingOrderRequest.comment);
    }

    public int hashCode() {
        String str = this.ref;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Integer num = this.rating;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        ArrayList<Integer> arrayList = this.attention;
        int hashCode3 = (hashCode2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31;
        String str2 = this.comment;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "RatingOrderRequest(ref=" + this.ref + ", rating=" + this.rating + ", attention=" + this.attention + ", comment=" + this.comment + ")";
    }

    public RatingOrderRequest(String str, Integer num, ArrayList<Integer> arrayList, String str2) {
        Intrinsics.checkNotNullParameter(arrayList, "attention");
        this.ref = str;
        this.rating = num;
        this.attention = arrayList;
        this.comment = str2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingOrderRequest(String str, Integer num, ArrayList arrayList, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? new ArrayList() : arrayList, (i & 8) != 0 ? null : str2);
    }

    public final String getRef() {
        return this.ref;
    }

    public final Integer getRating() {
        return this.rating;
    }

    public final ArrayList<Integer> getAttention() {
        return this.attention;
    }

    public final String getComment() {
        return this.comment;
    }
}
