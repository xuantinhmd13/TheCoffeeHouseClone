package com.thecoffeehouse.guestapp.services.api.model.rewards;

import androidx.core.app.FrameMetricsAggregator;
import com.facebook.AccessToken;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bq\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\rJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010\u0011Jz\u0010#\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0002\u0010$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020\u0007HÖ\u0001J\t\u0010)\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\f\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0014\u0010\u0011R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0017\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u000f¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponsItem;", "", MessengerShareContentUtility.MEDIA_IMAGE, "", "couponId", "userId", "maxUser", "", "countUser", "effectiveDateTo", "barcode", "status", "effectiveDateFrom", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getBarcode", "()Ljava/lang/String;", "getCountUser", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getCouponId", "getEffectiveDateFrom", "getEffectiveDateTo", "getImage", "getMaxUser", "getStatus", "getUserId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponsItem;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class CouponsItem {
    @SerializedName("barcode")
    private final String barcode;
    @SerializedName("count_user")
    private final Integer countUser;
    @SerializedName("coupon_id")
    private final String couponId;
    @SerializedName("effective_date_from")
    private final Integer effectiveDateFrom;
    @SerializedName("effective_date_to")
    private final Integer effectiveDateTo;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private final String image;
    @SerializedName("max_user")
    private final Integer maxUser;
    @SerializedName("status")
    private final String status;
    @SerializedName(AccessToken.USER_ID_KEY)
    private final String userId;

    public CouponsItem() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ CouponsItem copy$default(CouponsItem couponsItem, String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4, int i, Object obj) {
        return couponsItem.copy((i & 1) != 0 ? couponsItem.image : str, (i & 2) != 0 ? couponsItem.couponId : str2, (i & 4) != 0 ? couponsItem.userId : str3, (i & 8) != 0 ? couponsItem.maxUser : num, (i & 16) != 0 ? couponsItem.countUser : num2, (i & 32) != 0 ? couponsItem.effectiveDateTo : num3, (i & 64) != 0 ? couponsItem.barcode : str4, (i & 128) != 0 ? couponsItem.status : str5, (i & 256) != 0 ? couponsItem.effectiveDateFrom : num4);
    }

    public final String component1() {
        return this.image;
    }

    public final String component2() {
        return this.couponId;
    }

    public final String component3() {
        return this.userId;
    }

    public final Integer component4() {
        return this.maxUser;
    }

    public final Integer component5() {
        return this.countUser;
    }

    public final Integer component6() {
        return this.effectiveDateTo;
    }

    public final String component7() {
        return this.barcode;
    }

    public final String component8() {
        return this.status;
    }

    public final Integer component9() {
        return this.effectiveDateFrom;
    }

    public final CouponsItem copy(String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4) {
        return new CouponsItem(str, str2, str3, num, num2, num3, str4, str5, num4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CouponsItem)) {
            return false;
        }
        CouponsItem couponsItem = (CouponsItem) obj;
        return Intrinsics.areEqual(this.image, couponsItem.image) && Intrinsics.areEqual(this.couponId, couponsItem.couponId) && Intrinsics.areEqual(this.userId, couponsItem.userId) && Intrinsics.areEqual(this.maxUser, couponsItem.maxUser) && Intrinsics.areEqual(this.countUser, couponsItem.countUser) && Intrinsics.areEqual(this.effectiveDateTo, couponsItem.effectiveDateTo) && Intrinsics.areEqual(this.barcode, couponsItem.barcode) && Intrinsics.areEqual(this.status, couponsItem.status) && Intrinsics.areEqual(this.effectiveDateFrom, couponsItem.effectiveDateFrom);
    }

    public int hashCode() {
        String str = this.image;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.couponId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num = this.maxUser;
        int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.countUser;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.effectiveDateTo;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        String str4 = this.barcode;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.status;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num4 = this.effectiveDateFrom;
        if (num4 != null) {
            i = num4.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "CouponsItem(image=" + this.image + ", couponId=" + this.couponId + ", userId=" + this.userId + ", maxUser=" + this.maxUser + ", countUser=" + this.countUser + ", effectiveDateTo=" + this.effectiveDateTo + ", barcode=" + this.barcode + ", status=" + this.status + ", effectiveDateFrom=" + this.effectiveDateFrom + ")";
    }

    public CouponsItem(String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4) {
        this.image = str;
        this.couponId = str2;
        this.userId = str3;
        this.maxUser = num;
        this.countUser = num2;
        this.effectiveDateTo = num3;
        this.barcode = str4;
        this.status = str5;
        this.effectiveDateFrom = num4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CouponsItem(String str, String str2, String str3, Integer num, Integer num2, Integer num3, String str4, String str5, Integer num4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : num, (i & 16) != 0 ? null : num2, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : str4, (i & 128) != 0 ? null : str5, (i & 256) != 0 ? null : num4);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getCouponId() {
        return this.couponId;
    }

    public final String getUserId() {
        return this.userId;
    }

    public final Integer getMaxUser() {
        return this.maxUser;
    }

    public final Integer getCountUser() {
        return this.countUser;
    }

    public final Integer getEffectiveDateTo() {
        return this.effectiveDateTo;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final String getStatus() {
        return this.status;
    }

    public final Integer getEffectiveDateFrom() {
        return this.effectiveDateFrom;
    }
}
