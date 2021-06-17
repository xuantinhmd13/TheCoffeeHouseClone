package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0014\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\"\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR \u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\"\u0010\u0010\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR \u0010\u001e\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010\u000fR\"\u0010!\u001a\u0004\u0018\u00010\u00118\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001e\u0010$\u001a\u00020%8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R \u0010*\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\r\"\u0004\b,\u0010\u000fR \u0010-\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\r\"\u0004\b/\u0010\u000fR\"\u00100\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\t\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR \u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\r\"\u0004\b5\u0010\u000fR \u00106\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\r\"\u0004\b8\u0010\u000f¨\u00069"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "", "()V", "allowOrder", "", "getAllowOrder", "()Ljava/lang/Boolean;", "setAllowOrder", "(Ljava/lang/Boolean;)V", "Ljava/lang/Boolean;", "brand", "", "getBrand", "()Ljava/lang/String;", "setBrand", "(Ljava/lang/String;)V", "couponCount", "", "getCouponCount", "()Ljava/lang/Integer;", "setCouponCount", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "coupons", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Coupon;", "getCoupons", "()Ljava/util/List;", "setCoupons", "(Ljava/util/List;)V", "description", "getDescription", "setDescription", "discountRate", "getDiscountRate", "setDiscountRate", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", "id", "getId", "setId", MessengerShareContentUtility.MEDIA_IMAGE, "getImage", "setImage", "showAllCoupons", "getShowAllCoupons", "setShowAllCoupons", "timeLeft", "getTimeLeft", "setTimeLeft", "title", "getTitle", "setTitle", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class Campaign {
    @SerializedName("allow_order")
    @Expose
    private Boolean allowOrder = true;
    @SerializedName("brand")
    @Expose
    private String brand;
    @SerializedName("coupon_count")
    @Expose
    private Integer couponCount;
    @SerializedName("coupons")
    @Expose
    private List<Coupon> coupons = new ArrayList();
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("discount_rate")
    @Expose
    private Integer discountRate;
    @SerializedName("end_time")
    @Expose
    private long endTime;
    @SerializedName("id")
    @Expose
    private String id;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    @Expose
    private String image;
    @SerializedName("show_all_coupons")
    @Expose
    private Boolean showAllCoupons = false;
    @SerializedName("time_left")
    @Expose
    private String timeLeft;
    @SerializedName("title")
    @Expose
    private String title;

    public final String getId() {
        return this.id;
    }

    public final void setId(String str) {
        this.id = str;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final String getTimeLeft() {
        return this.timeLeft;
    }

    public final void setTimeLeft(String str) {
        this.timeLeft = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getDescription() {
        return this.description;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final String getImage() {
        return this.image;
    }

    public final void setImage(String str) {
        this.image = str;
    }

    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    public final void setDiscountRate(Integer num) {
        this.discountRate = num;
    }

    public final Integer getCouponCount() {
        return this.couponCount;
    }

    public final void setCouponCount(Integer num) {
        this.couponCount = num;
    }

    public final List<Coupon> getCoupons() {
        return this.coupons;
    }

    public final void setCoupons(List<Coupon> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.coupons = list;
    }

    public final String getBrand() {
        return this.brand;
    }

    public final void setBrand(String str) {
        this.brand = str;
    }

    public final Boolean getAllowOrder() {
        return this.allowOrder;
    }

    public final void setAllowOrder(Boolean bool) {
        this.allowOrder = bool;
    }

    public final Boolean getShowAllCoupons() {
        return this.showAllCoupons;
    }

    public final void setShowAllCoupons(Boolean bool) {
        this.showAllCoupons = bool;
    }
}
