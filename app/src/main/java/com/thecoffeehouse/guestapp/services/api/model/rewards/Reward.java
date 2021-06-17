package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.facebook.share.internal.MessengerShareContentUtility;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010!J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020\tHÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000eR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u001a\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0016\u0010\u0010R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006'"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "", MessengerShareContentUtility.MEDIA_IMAGE, "", "name", "logo", "description", "id", "discountRate", "", "point", "supplier", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)V", "getDescription", "()Ljava/lang/String;", "getDiscountRate", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getId", "getImage", "getLogo", "getName", "getPoint", "getSupplier", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class Reward {
    @SerializedName("description")
    private final String description;
    @SerializedName("discount_rate")
    private final Integer discountRate;
    @SerializedName("id")
    private final String id;
    @SerializedName(MessengerShareContentUtility.MEDIA_IMAGE)
    private final String image;
    @SerializedName("logo")
    private final String logo;
    @SerializedName("name")
    private final String name;
    @SerializedName("point")
    private final Integer point;
    @SerializedName("supplier")
    private final String supplier;

    public Reward() {
        this(null, null, null, null, null, null, null, null, 255, null);
    }

    public static /* synthetic */ Reward copy$default(Reward reward, String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, int i, Object obj) {
        return reward.copy((i & 1) != 0 ? reward.image : str, (i & 2) != 0 ? reward.name : str2, (i & 4) != 0 ? reward.logo : str3, (i & 8) != 0 ? reward.description : str4, (i & 16) != 0 ? reward.id : str5, (i & 32) != 0 ? reward.discountRate : num, (i & 64) != 0 ? reward.point : num2, (i & 128) != 0 ? reward.supplier : str6);
    }

    public final String component1() {
        return this.image;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.logo;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.id;
    }

    public final Integer component6() {
        return this.discountRate;
    }

    public final Integer component7() {
        return this.point;
    }

    public final String component8() {
        return this.supplier;
    }

    public final Reward copy(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6) {
        return new Reward(str, str2, str3, str4, str5, num, num2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Reward)) {
            return false;
        }
        Reward reward = (Reward) obj;
        return Intrinsics.areEqual(this.image, reward.image) && Intrinsics.areEqual(this.name, reward.name) && Intrinsics.areEqual(this.logo, reward.logo) && Intrinsics.areEqual(this.description, reward.description) && Intrinsics.areEqual(this.id, reward.id) && Intrinsics.areEqual(this.discountRate, reward.discountRate) && Intrinsics.areEqual(this.point, reward.point) && Intrinsics.areEqual(this.supplier, reward.supplier);
    }

    public int hashCode() {
        String str = this.image;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.logo;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.id;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Integer num = this.discountRate;
        int hashCode6 = (hashCode5 + (num != null ? num.hashCode() : 0)) * 31;
        Integer num2 = this.point;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str6 = this.supplier;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode7 + i;
    }

    public String toString() {
        return "Reward(image=" + this.image + ", name=" + this.name + ", logo=" + this.logo + ", description=" + this.description + ", id=" + this.id + ", discountRate=" + this.discountRate + ", point=" + this.point + ", supplier=" + this.supplier + ")";
    }

    public Reward(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6) {
        this.image = str;
        this.name = str2;
        this.logo = str3;
        this.description = str4;
        this.id = str5;
        this.discountRate = num;
        this.point = num2;
        this.supplier = str6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Reward(String str, String str2, String str3, String str4, String str5, Integer num, Integer num2, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : num, (i & 64) != 0 ? null : num2, (i & 128) != 0 ? null : str6);
    }

    public final String getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getLogo() {
        return this.logo;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getDiscountRate() {
        return this.discountRate;
    }

    public final Integer getPoint() {
        return this.point;
    }

    public final String getSupplier() {
        return this.supplier;
    }
}
