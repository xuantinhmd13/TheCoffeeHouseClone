package com.thecoffeehouse.guestapp.services.api.model.common.config;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001BW\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t¢\u0006\u0002\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00060\tHÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0003J[\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\tHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0006HÖ\u0001R\u001c\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0016\u0010\n\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0012¨\u0006%"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RankInfoItem;", "", "min", "", "max", "name", "", "id", "gradients", "", "icon", "benefits", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/Benefit;", "(IILjava/lang/String;ILjava/util/List;Ljava/lang/String;Ljava/util/List;)V", "getBenefits", "()Ljava/util/List;", "getGradients", "getIcon", "()Ljava/lang/String;", "getId", "()I", "getMax", "getMin", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Metadata.kt */
public final class RankInfoItem {
    @SerializedName("benefits")
    private final List<Benefit> benefits;
    @SerializedName("gradients")
    private final List<String> gradients;
    @SerializedName("icon")
    private final String icon;
    @SerializedName("id")
    private final int id;
    @SerializedName("max")
    private final int max;
    @SerializedName("min")
    private final int min;
    @SerializedName("name")
    private final String name;

    public RankInfoItem() {
        this(0, 0, null, 0, null, null, null, 127, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r5v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RankInfoItem copy$default(RankInfoItem rankInfoItem, int i, int i2, String str, int i3, List list, String str2, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = rankInfoItem.min;
        }
        if ((i4 & 2) != 0) {
            i2 = rankInfoItem.max;
        }
        if ((i4 & 4) != 0) {
            str = rankInfoItem.name;
        }
        if ((i4 & 8) != 0) {
            i3 = rankInfoItem.id;
        }
        if ((i4 & 16) != 0) {
            list = rankInfoItem.gradients;
        }
        if ((i4 & 32) != 0) {
            str2 = rankInfoItem.icon;
        }
        if ((i4 & 64) != 0) {
            list2 = rankInfoItem.benefits;
        }
        return rankInfoItem.copy(i, i2, str, i3, list, str2, list2);
    }

    public final int component1() {
        return this.min;
    }

    public final int component2() {
        return this.max;
    }

    public final String component3() {
        return this.name;
    }

    public final int component4() {
        return this.id;
    }

    public final List<String> component5() {
        return this.gradients;
    }

    public final String component6() {
        return this.icon;
    }

    public final List<Benefit> component7() {
        return this.benefits;
    }

    public final RankInfoItem copy(int i, int i2, String str, int i3, List<String> list, String str2, List<Benefit> list2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "gradients");
        Intrinsics.checkNotNullParameter(str2, "icon");
        Intrinsics.checkNotNullParameter(list2, "benefits");
        return new RankInfoItem(i, i2, str, i3, list, str2, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RankInfoItem)) {
            return false;
        }
        RankInfoItem rankInfoItem = (RankInfoItem) obj;
        return this.min == rankInfoItem.min && this.max == rankInfoItem.max && Intrinsics.areEqual(this.name, rankInfoItem.name) && this.id == rankInfoItem.id && Intrinsics.areEqual(this.gradients, rankInfoItem.gradients) && Intrinsics.areEqual(this.icon, rankInfoItem.icon) && Intrinsics.areEqual(this.benefits, rankInfoItem.benefits);
    }

    public int hashCode() {
        int hashCode = ((Integer.hashCode(this.min) * 31) + Integer.hashCode(this.max)) * 31;
        String str = this.name;
        int i = 0;
        int hashCode2 = (((hashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.id)) * 31;
        List<String> list = this.gradients;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        String str2 = this.icon;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<Benefit> list2 = this.benefits;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode4 + i;
    }

    public String toString() {
        return "RankInfoItem(min=" + this.min + ", max=" + this.max + ", name=" + this.name + ", id=" + this.id + ", gradients=" + this.gradients + ", icon=" + this.icon + ", benefits=" + this.benefits + ")";
    }

    public RankInfoItem(int i, int i2, String str, int i3, List<String> list, String str2, List<Benefit> list2) {
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(list, "gradients");
        Intrinsics.checkNotNullParameter(str2, "icon");
        Intrinsics.checkNotNullParameter(list2, "benefits");
        this.min = i;
        this.max = i2;
        this.name = str;
        this.id = i3;
        this.gradients = list;
        this.icon = str2;
        this.benefits = list2;
    }

    public final int getMin() {
        return this.min;
    }

    public final int getMax() {
        return this.max;
    }

    public final String getName() {
        return this.name;
    }

    public final int getId() {
        return this.id;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RankInfoItem(int i, int i2, String str, int i3, List list, String str2, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? 0 : i, (i4 & 2) == 0 ? i2 : 0, (i4 & 4) != 0 ? "" : str, (i4 & 8) != 0 ? 1 : i3, (i4 & 16) != 0 ? new ArrayList() : list, (i4 & 32) != 0 ? "" : str2, (i4 & 64) != 0 ? new ArrayList() : list2);
    }

    public final List<String> getGradients() {
        return this.gradients;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final List<Benefit> getBenefits() {
        return this.benefits;
    }
}
