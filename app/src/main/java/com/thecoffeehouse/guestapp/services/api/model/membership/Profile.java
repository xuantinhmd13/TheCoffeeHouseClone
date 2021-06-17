package com.thecoffeehouse.guestapp.services.api.model.membership;

import androidx.core.app.FrameMetricsAggregator;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b%\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001Bo\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0002\u0010\rJ\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010 \u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u0010\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010'\u001a\u00020\u0005HÆ\u0003Jx\u0010(\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001¢\u0006\u0002\u0010)J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010-\u001a\u00020\u0003HÖ\u0001J\t\u0010.\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R \u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000f\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0018\u0010\u0011R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0019\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u000fR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u001b\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u000fR\u001a\u0010\f\u001a\u00020\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000f\"\u0004\b\u001e\u0010\u0017¨\u0006/"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/membership/Profile;", "", "rankId", "", "rankName", "", "beenNeedNext", "barcode", "cutOff", "beenNeedKeep", "bean", "beanExpire", "userName", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getBarcode", "()Ljava/lang/String;", "getBean", "()Ljava/lang/Integer;", "setBean", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getBeanExpire", "setBeanExpire", "(Ljava/lang/String;)V", "getBeenNeedKeep", "getBeenNeedNext", "getCutOff", "getRankId", "getRankName", "getUserName", "setUserName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lcom/thecoffeehouse/guestapp/services/api/model/membership/Profile;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: GetMembershipResponse.kt */
public final class Profile {
    @SerializedName("barcode")
    private final String barcode;
    @SerializedName("bean")
    private Integer bean;
    @SerializedName("bean_expire")
    private String beanExpire;
    @SerializedName("bean_need_keep")
    private final Integer beenNeedKeep;
    @SerializedName("bean_need_next")
    private final Integer beenNeedNext;
    @SerializedName("cut_off")
    private final String cutOff;
    @SerializedName("rank_id")
    private final Integer rankId;
    @SerializedName("rank_name")
    private final String rankName;
    private String userName;

    public Profile() {
        this(null, null, null, null, null, null, null, null, null, FrameMetricsAggregator.EVERY_DURATION, null);
    }

    public static /* synthetic */ Profile copy$default(Profile profile, Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, String str4, String str5, int i, Object obj) {
        return profile.copy((i & 1) != 0 ? profile.rankId : num, (i & 2) != 0 ? profile.rankName : str, (i & 4) != 0 ? profile.beenNeedNext : num2, (i & 8) != 0 ? profile.barcode : str2, (i & 16) != 0 ? profile.cutOff : str3, (i & 32) != 0 ? profile.beenNeedKeep : num3, (i & 64) != 0 ? profile.bean : num4, (i & 128) != 0 ? profile.beanExpire : str4, (i & 256) != 0 ? profile.userName : str5);
    }

    public final Integer component1() {
        return this.rankId;
    }

    public final String component2() {
        return this.rankName;
    }

    public final Integer component3() {
        return this.beenNeedNext;
    }

    public final String component4() {
        return this.barcode;
    }

    public final String component5() {
        return this.cutOff;
    }

    public final Integer component6() {
        return this.beenNeedKeep;
    }

    public final Integer component7() {
        return this.bean;
    }

    public final String component8() {
        return this.beanExpire;
    }

    public final String component9() {
        return this.userName;
    }

    public final Profile copy(Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str5, "userName");
        return new Profile(num, str, num2, str2, str3, num3, num4, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Profile)) {
            return false;
        }
        Profile profile = (Profile) obj;
        return Intrinsics.areEqual(this.rankId, profile.rankId) && Intrinsics.areEqual(this.rankName, profile.rankName) && Intrinsics.areEqual(this.beenNeedNext, profile.beenNeedNext) && Intrinsics.areEqual(this.barcode, profile.barcode) && Intrinsics.areEqual(this.cutOff, profile.cutOff) && Intrinsics.areEqual(this.beenNeedKeep, profile.beenNeedKeep) && Intrinsics.areEqual(this.bean, profile.bean) && Intrinsics.areEqual(this.beanExpire, profile.beanExpire) && Intrinsics.areEqual(this.userName, profile.userName);
    }

    public int hashCode() {
        Integer num = this.rankId;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.rankName;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        Integer num2 = this.beenNeedNext;
        int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str2 = this.barcode;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.cutOff;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Integer num3 = this.beenNeedKeep;
        int hashCode6 = (hashCode5 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.bean;
        int hashCode7 = (hashCode6 + (num4 != null ? num4.hashCode() : 0)) * 31;
        String str4 = this.beanExpire;
        int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.userName;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode8 + i;
    }

    public String toString() {
        return "Profile(rankId=" + this.rankId + ", rankName=" + this.rankName + ", beenNeedNext=" + this.beenNeedNext + ", barcode=" + this.barcode + ", cutOff=" + this.cutOff + ", beenNeedKeep=" + this.beenNeedKeep + ", bean=" + this.bean + ", beanExpire=" + this.beanExpire + ", userName=" + this.userName + ")";
    }

    public Profile(Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, String str4, String str5) {
        Intrinsics.checkNotNullParameter(str5, "userName");
        this.rankId = num;
        this.rankName = str;
        this.beenNeedNext = num2;
        this.barcode = str2;
        this.cutOff = str3;
        this.beenNeedKeep = num3;
        this.bean = num4;
        this.beanExpire = str4;
        this.userName = str5;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Profile(Integer num, String str, Integer num2, String str2, String str3, Integer num3, Integer num4, String str4, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num2, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? null : num3, (i & 64) != 0 ? null : num4, (i & 128) != 0 ? null : str4, (i & 256) != 0 ? "" : str5);
    }

    public final Integer getRankId() {
        return this.rankId;
    }

    public final String getRankName() {
        return this.rankName;
    }

    public final Integer getBeenNeedNext() {
        return this.beenNeedNext;
    }

    public final String getBarcode() {
        return this.barcode;
    }

    public final String getCutOff() {
        return this.cutOff;
    }

    public final Integer getBeenNeedKeep() {
        return this.beenNeedKeep;
    }

    public final Integer getBean() {
        return this.bean;
    }

    public final void setBean(Integer num) {
        this.bean = num;
    }

    public final String getBeanExpire() {
        return this.beanExpire;
    }

    public final void setBeanExpire(String str) {
        this.beanExpire = str;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final void setUserName(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.userName = str;
    }
}
