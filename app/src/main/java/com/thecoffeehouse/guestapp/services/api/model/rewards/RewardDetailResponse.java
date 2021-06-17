package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b7\b\b\u0018\u00002\u00020\u0001BÁ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0014\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0019J\u000b\u00104\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u00105\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\t\u00106\u001a\u00020\u0006HÆ\u0003J\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010'J\u000b\u00109\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0013\u0010;\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u0005HÆ\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010=\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001bJ\u000b\u0010>\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010A\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0002\u0010/J\u000b\u0010B\u001a\u0004\u0018\u00010\u0012HÆ\u0003JÌ\u0001\u0010C\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0012\b\u0002\u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0014\u001a\u00020\u00062\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010DJ\u0013\u0010E\u001a\u00020\n2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0010HÖ\u0001J\t\u0010H\u001a\u00020\u0006HÖ\u0001R\u001a\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001c\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001eR\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b&\u0010'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0014\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b+\u0010\u001eR \u0010\u0004\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\"R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001eR\u001a\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0004¢\u0006\n\n\u0002\u00100\u001a\u0004\b.\u0010/R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b1\u0010\u001eR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b2\u0010\u001eR\u001a\u0010\u0016\u001a\u0004\u0018\u00010\u000e8\u0006X\u0004¢\u0006\n\n\u0002\u0010(\u001a\u0004\b3\u0010'¨\u0006I"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "images", "", "", "campaign", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", AppMeasurementSdk.ConditionalUserProperty.ACTIVE, "", "description", "banner", "fromTime", "", FirebaseAnalytics.Param.PRICE, "", "groupReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Supplier;", "name", "id", "categories", "toTime", "termCondition", "timeLeft", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Supplier;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)V", "getActive", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBanner", "()Ljava/lang/String;", "getCampaign", "()Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "getCategories", "()Ljava/util/List;", "getDescription", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getFromTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getGroupReward", "()Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Supplier;", "getId", "getImages", "getName", "getPrice", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTermCondition", "getTimeLeft", "getToTime", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;Ljava/util/List;Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;Ljava/lang/Integer;Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Supplier;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "equals", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class RewardDetailResponse {
    @SerializedName(AppMeasurementSdk.ConditionalUserProperty.ACTIVE)
    private final Boolean active;
    @SerializedName("banner")
    private final String banner;
    @SerializedName("campaign")
    private final Campaign campaign;
    @SerializedName("categories")
    private final List<String> categories;
    @SerializedName("description")
    private final String description;
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("from_time")
    private final Long fromTime;
    @SerializedName("supplier")
    private final Supplier groupReward;
    @SerializedName("id")
    private final String id;
    @SerializedName("images")
    private final List<String> images;
    @SerializedName("name")
    private final String name;
    @SerializedName(FirebaseAnalytics.Param.PRICE)
    private final Integer price;
    @SerializedName("term_condition")
    private final String termCondition;
    @SerializedName("time_left")
    private final String timeLeft;
    @SerializedName("to_time")
    private final Long toTime;

    public static /* synthetic */ RewardDetailResponse copy$default(RewardDetailResponse rewardDetailResponse, ServerError serverError, List list, Campaign campaign2, Boolean bool, String str, String str2, Long l, Integer num, Supplier supplier, String str3, String str4, List list2, Long l2, String str5, String str6, int i, Object obj) {
        return rewardDetailResponse.copy((i & 1) != 0 ? rewardDetailResponse.error : serverError, (i & 2) != 0 ? rewardDetailResponse.images : list, (i & 4) != 0 ? rewardDetailResponse.campaign : campaign2, (i & 8) != 0 ? rewardDetailResponse.active : bool, (i & 16) != 0 ? rewardDetailResponse.description : str, (i & 32) != 0 ? rewardDetailResponse.banner : str2, (i & 64) != 0 ? rewardDetailResponse.fromTime : l, (i & 128) != 0 ? rewardDetailResponse.price : num, (i & 256) != 0 ? rewardDetailResponse.groupReward : supplier, (i & 512) != 0 ? rewardDetailResponse.name : str3, (i & 1024) != 0 ? rewardDetailResponse.id : str4, (i & 2048) != 0 ? rewardDetailResponse.categories : list2, (i & 4096) != 0 ? rewardDetailResponse.toTime : l2, (i & 8192) != 0 ? rewardDetailResponse.termCondition : str5, (i & 16384) != 0 ? rewardDetailResponse.timeLeft : str6);
    }

    public final ServerError component1() {
        return this.error;
    }

    public final String component10() {
        return this.name;
    }

    public final String component11() {
        return this.id;
    }

    public final List<String> component12() {
        return this.categories;
    }

    public final Long component13() {
        return this.toTime;
    }

    public final String component14() {
        return this.termCondition;
    }

    public final String component15() {
        return this.timeLeft;
    }

    public final List<String> component2() {
        return this.images;
    }

    public final Campaign component3() {
        return this.campaign;
    }

    public final Boolean component4() {
        return this.active;
    }

    public final String component5() {
        return this.description;
    }

    public final String component6() {
        return this.banner;
    }

    public final Long component7() {
        return this.fromTime;
    }

    public final Integer component8() {
        return this.price;
    }

    public final Supplier component9() {
        return this.groupReward;
    }

    public final RewardDetailResponse copy(ServerError serverError, List<String> list, Campaign campaign2, Boolean bool, String str, String str2, Long l, Integer num, Supplier supplier, String str3, String str4, List<String> list2, Long l2, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str4, "id");
        Intrinsics.checkNotNullParameter(list2, "categories");
        return new RewardDetailResponse(serverError, list, campaign2, bool, str, str2, l, num, supplier, str3, str4, list2, l2, str5, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RewardDetailResponse)) {
            return false;
        }
        RewardDetailResponse rewardDetailResponse = (RewardDetailResponse) obj;
        return Intrinsics.areEqual(this.error, rewardDetailResponse.error) && Intrinsics.areEqual(this.images, rewardDetailResponse.images) && Intrinsics.areEqual(this.campaign, rewardDetailResponse.campaign) && Intrinsics.areEqual(this.active, rewardDetailResponse.active) && Intrinsics.areEqual(this.description, rewardDetailResponse.description) && Intrinsics.areEqual(this.banner, rewardDetailResponse.banner) && Intrinsics.areEqual(this.fromTime, rewardDetailResponse.fromTime) && Intrinsics.areEqual(this.price, rewardDetailResponse.price) && Intrinsics.areEqual(this.groupReward, rewardDetailResponse.groupReward) && Intrinsics.areEqual(this.name, rewardDetailResponse.name) && Intrinsics.areEqual(this.id, rewardDetailResponse.id) && Intrinsics.areEqual(this.categories, rewardDetailResponse.categories) && Intrinsics.areEqual(this.toTime, rewardDetailResponse.toTime) && Intrinsics.areEqual(this.termCondition, rewardDetailResponse.termCondition) && Intrinsics.areEqual(this.timeLeft, rewardDetailResponse.timeLeft);
    }

    public int hashCode() {
        ServerError serverError = this.error;
        int i = 0;
        int hashCode = (serverError != null ? serverError.hashCode() : 0) * 31;
        List<String> list = this.images;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Campaign campaign2 = this.campaign;
        int hashCode3 = (hashCode2 + (campaign2 != null ? campaign2.hashCode() : 0)) * 31;
        Boolean bool = this.active;
        int hashCode4 = (hashCode3 + (bool != null ? bool.hashCode() : 0)) * 31;
        String str = this.description;
        int hashCode5 = (hashCode4 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.banner;
        int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Long l = this.fromTime;
        int hashCode7 = (hashCode6 + (l != null ? l.hashCode() : 0)) * 31;
        Integer num = this.price;
        int hashCode8 = (hashCode7 + (num != null ? num.hashCode() : 0)) * 31;
        Supplier supplier = this.groupReward;
        int hashCode9 = (hashCode8 + (supplier != null ? supplier.hashCode() : 0)) * 31;
        String str3 = this.name;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.id;
        int hashCode11 = (hashCode10 + (str4 != null ? str4.hashCode() : 0)) * 31;
        List<String> list2 = this.categories;
        int hashCode12 = (hashCode11 + (list2 != null ? list2.hashCode() : 0)) * 31;
        Long l2 = this.toTime;
        int hashCode13 = (hashCode12 + (l2 != null ? l2.hashCode() : 0)) * 31;
        String str5 = this.termCondition;
        int hashCode14 = (hashCode13 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.timeLeft;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return hashCode14 + i;
    }

    public String toString() {
        return "RewardDetailResponse(error=" + this.error + ", images=" + this.images + ", campaign=" + this.campaign + ", active=" + this.active + ", description=" + this.description + ", banner=" + this.banner + ", fromTime=" + this.fromTime + ", price=" + this.price + ", groupReward=" + this.groupReward + ", name=" + this.name + ", id=" + this.id + ", categories=" + this.categories + ", toTime=" + this.toTime + ", termCondition=" + this.termCondition + ", timeLeft=" + this.timeLeft + ")";
    }

    public RewardDetailResponse(ServerError serverError, List<String> list, Campaign campaign2, Boolean bool, String str, String str2, Long l, Integer num, Supplier supplier, String str3, String str4, List<String> list2, Long l2, String str5, String str6) {
        Intrinsics.checkNotNullParameter(str4, "id");
        Intrinsics.checkNotNullParameter(list2, "categories");
        this.error = serverError;
        this.images = list;
        this.campaign = campaign2;
        this.active = bool;
        this.description = str;
        this.banner = str2;
        this.fromTime = l;
        this.price = num;
        this.groupReward = supplier;
        this.name = str3;
        this.id = str4;
        this.categories = list2;
        this.toTime = l2;
        this.termCondition = str5;
        this.timeLeft = str6;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RewardDetailResponse(ServerError serverError, List list, Campaign campaign2, Boolean bool, String str, String str2, Long l, Integer num, Supplier supplier, String str3, String str4, List list2, Long l2, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : serverError, (i & 2) != 0 ? null : list, (i & 4) != 0 ? null : campaign2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : str, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : l, (i & 128) != 0 ? null : num, (i & 256) != 0 ? null : supplier, (i & 512) != 0 ? null : str3, str4, (i & 2048) != 0 ? new ArrayList() : list2, (i & 4096) != 0 ? null : l2, (i & 8192) != 0 ? null : str5, (i & 16384) != 0 ? null : str6);
    }

    public final ServerError getError() {
        return this.error;
    }

    public final List<String> getImages() {
        return this.images;
    }

    public final Campaign getCampaign() {
        return this.campaign;
    }

    public final Boolean getActive() {
        return this.active;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getBanner() {
        return this.banner;
    }

    public final Long getFromTime() {
        return this.fromTime;
    }

    public final Integer getPrice() {
        return this.price;
    }

    public final Supplier getGroupReward() {
        return this.groupReward;
    }

    public final String getName() {
        return this.name;
    }

    public final String getId() {
        return this.id;
    }

    public final List<String> getCategories() {
        return this.categories;
    }

    public final Long getToTime() {
        return this.toTime;
    }

    public final String getTermCondition() {
        return this.termCondition;
    }

    public final String getTimeLeft() {
        return this.timeLeft;
    }
}
