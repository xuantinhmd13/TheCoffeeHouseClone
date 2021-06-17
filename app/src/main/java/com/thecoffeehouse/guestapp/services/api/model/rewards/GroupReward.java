package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.facebook.internal.AnalyticsEvents;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B9\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nJ\u000f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0016\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0002\u0010\u0011JB\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\tHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GroupReward;", "", "rewards", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "name", "", "id", AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE, "", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getName", "getRewards", "()Ljava/util/List;", "getStyle", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GroupReward;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class GroupReward {
    @SerializedName("id")
    private final String id;
    @SerializedName("name")
    private final String name;
    @SerializedName("rewards")
    private final List<Reward> rewards;
    @SerializedName(AnalyticsEvents.PARAMETER_LIKE_VIEW_STYLE)
    private final Integer style;

    public GroupReward() {
        this(null, null, null, null, 15, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.rewards.GroupReward */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GroupReward copy$default(GroupReward groupReward, List list, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = groupReward.rewards;
        }
        if ((i & 2) != 0) {
            str = groupReward.name;
        }
        if ((i & 4) != 0) {
            str2 = groupReward.id;
        }
        if ((i & 8) != 0) {
            num = groupReward.style;
        }
        return groupReward.copy(list, str, str2, num);
    }

    public final List<Reward> component1() {
        return this.rewards;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.id;
    }

    public final Integer component4() {
        return this.style;
    }

    public final GroupReward copy(List<Reward> list, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(list, "rewards");
        return new GroupReward(list, str, str2, num);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupReward)) {
            return false;
        }
        GroupReward groupReward = (GroupReward) obj;
        return Intrinsics.areEqual(this.rewards, groupReward.rewards) && Intrinsics.areEqual(this.name, groupReward.name) && Intrinsics.areEqual(this.id, groupReward.id) && Intrinsics.areEqual(this.style, groupReward.style);
    }

    public int hashCode() {
        List<Reward> list = this.rewards;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.name;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.id;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.style;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        return "GroupReward(rewards=" + this.rewards + ", name=" + this.name + ", id=" + this.id + ", style=" + this.style + ")";
    }

    public GroupReward(List<Reward> list, String str, String str2, Integer num) {
        Intrinsics.checkNotNullParameter(list, "rewards");
        this.rewards = list;
        this.name = str;
        this.id = str2;
        this.style = num;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GroupReward(List list, String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : num);
    }

    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final String getName() {
        return this.name;
    }

    public final String getId() {
        return this.id;
    }

    public final Integer getStyle() {
        return this.style;
    }
}
