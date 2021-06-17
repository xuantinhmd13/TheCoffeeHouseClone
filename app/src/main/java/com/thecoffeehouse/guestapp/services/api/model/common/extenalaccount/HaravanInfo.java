package com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount;

import com.facebook.AccessToken;
import com.google.firebase.messaging.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\b\u0018\u00002\u00020\u0001B5\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/HaravanInfo;", "", "icon", "", Constants.ScionAnalytics.PARAM_LABEL, "userName", "userId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIcon", "()Ljava/lang/String;", "getLabel", "getUserId", "getUserName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExternalAccount.kt */
public final class HaravanInfo {
    @SerializedName("icon")
    private final String icon;
    @SerializedName(Constants.ScionAnalytics.PARAM_LABEL)
    private final String label;
    @SerializedName(AccessToken.USER_ID_KEY)
    private final String userId;
    @SerializedName("user_name")
    private final String userName;

    public HaravanInfo() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ HaravanInfo copy$default(HaravanInfo haravanInfo, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = haravanInfo.icon;
        }
        if ((i & 2) != 0) {
            str2 = haravanInfo.label;
        }
        if ((i & 4) != 0) {
            str3 = haravanInfo.userName;
        }
        if ((i & 8) != 0) {
            str4 = haravanInfo.userId;
        }
        return haravanInfo.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.icon;
    }

    public final String component2() {
        return this.label;
    }

    public final String component3() {
        return this.userName;
    }

    public final String component4() {
        return this.userId;
    }

    public final HaravanInfo copy(String str, String str2, String str3, String str4) {
        return new HaravanInfo(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HaravanInfo)) {
            return false;
        }
        HaravanInfo haravanInfo = (HaravanInfo) obj;
        return Intrinsics.areEqual(this.icon, haravanInfo.icon) && Intrinsics.areEqual(this.label, haravanInfo.label) && Intrinsics.areEqual(this.userName, haravanInfo.userName) && Intrinsics.areEqual(this.userId, haravanInfo.userId);
    }

    public int hashCode() {
        String str = this.icon;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.label;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.userName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.userId;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "HaravanInfo(icon=" + this.icon + ", label=" + this.label + ", userName=" + this.userName + ", userId=" + this.userId + ")";
    }

    public HaravanInfo(String str, String str2, String str3, String str4) {
        this.icon = str;
        this.label = str2;
        this.userName = str3;
        this.userId = str4;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ HaravanInfo(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getLabel() {
        return this.label;
    }

    public final String getUserName() {
        return this.userName;
    }

    public final String getUserId() {
        return this.userId;
    }
}
