package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.ratingorderproduct;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J:\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderproduct/RatingOrderProductData;", "", "id", "", "productName", "liked", "", "feedback", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getFeedback", "()Ljava/lang/String;", "getId", "getLiked", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getProductName", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/ratingorderproduct/RatingOrderProductData;", "equals", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderProductData.kt */
public final class RatingOrderProductData {
    private final String feedback;
    private final String id;
    private final Boolean liked;
    private final String productName;

    public static /* synthetic */ RatingOrderProductData copy$default(RatingOrderProductData ratingOrderProductData, String str, String str2, Boolean bool, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ratingOrderProductData.id;
        }
        if ((i & 2) != 0) {
            str2 = ratingOrderProductData.productName;
        }
        if ((i & 4) != 0) {
            bool = ratingOrderProductData.liked;
        }
        if ((i & 8) != 0) {
            str3 = ratingOrderProductData.feedback;
        }
        return ratingOrderProductData.copy(str, str2, bool, str3);
    }

    public final String component1() {
        return this.id;
    }

    public final String component2() {
        return this.productName;
    }

    public final Boolean component3() {
        return this.liked;
    }

    public final String component4() {
        return this.feedback;
    }

    public final RatingOrderProductData copy(String str, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "productName");
        return new RatingOrderProductData(str, str2, bool, str3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RatingOrderProductData)) {
            return false;
        }
        RatingOrderProductData ratingOrderProductData = (RatingOrderProductData) obj;
        return Intrinsics.areEqual(this.id, ratingOrderProductData.id) && Intrinsics.areEqual(this.productName, ratingOrderProductData.productName) && Intrinsics.areEqual(this.liked, ratingOrderProductData.liked) && Intrinsics.areEqual(this.feedback, ratingOrderProductData.feedback);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.productName;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        Boolean bool = this.liked;
        int hashCode3 = (hashCode2 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str3 = this.feedback;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "RatingOrderProductData(id=" + this.id + ", productName=" + this.productName + ", liked=" + this.liked + ", feedback=" + this.feedback + ")";
    }

    public RatingOrderProductData(String str, String str2, Boolean bool, String str3) {
        Intrinsics.checkNotNullParameter(str, "id");
        Intrinsics.checkNotNullParameter(str2, "productName");
        this.id = str;
        this.productName = str2;
        this.liked = bool;
        this.feedback = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getProductName() {
        return this.productName;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RatingOrderProductData(String str, String str2, Boolean bool, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? "" : str3);
    }

    public final Boolean getLiked() {
        return this.liked;
    }

    public final String getFeedback() {
        return this.feedback;
    }
}
