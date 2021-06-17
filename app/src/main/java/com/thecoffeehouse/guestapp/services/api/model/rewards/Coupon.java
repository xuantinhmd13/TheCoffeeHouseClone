package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR \u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\"\u0010\u0012\u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Coupon;", "", "()V", "barcode", "", "getBarcode", "()Ljava/lang/String;", "setBarcode", "(Ljava/lang/String;)V", "endTime", "", "getEndTime", "()J", "setEndTime", "(J)V", MessengerShareContentUtility.MEDIA_IMAGE, "getImage", "setImage", FirebaseAnalytics.Param.QUANTITY, "", "getQuantity", "()Ljava/lang/Integer;", "setQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class Coupon {
    @SerializedName("barcode")
    @Expose
    private String barcode;
    @SerializedName("end_time")
    @Expose
    private long endTime;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    @Expose
    private String image;
    @SerializedName(FirebaseAnalytics.Param.QUANTITY)
    @Expose
    private Integer quantity;

    public final String getBarcode() {
        return this.barcode;
    }

    public final void setBarcode(String str) {
        this.barcode = str;
    }

    public final Integer getQuantity() {
        return this.quantity;
    }

    public final void setQuantity(Integer num) {
        this.quantity = num;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final void setEndTime(long j) {
        this.endTime = j;
    }

    public final String getImage() {
        return this.image;
    }

    public final void setImage(String str) {
        this.image = str;
    }
}
