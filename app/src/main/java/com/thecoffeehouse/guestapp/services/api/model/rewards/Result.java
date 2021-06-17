package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\b\u0018\u00002\u00020\u0001B%\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Result;", "", "rewards", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "campaigns", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "(Ljava/util/List;Ljava/util/List;)V", "getCampaigns", "()Ljava/util/List;", "getRewards", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class Result {
    @SerializedName("campaigns")
    private final List<Campaign> campaigns;
    @SerializedName("rewards")
    private final List<Reward> rewards;

    public Result() {
        this(null, null, 3, null);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.rewards.Result */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Result copy$default(Result result, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = result.rewards;
        }
        if ((i & 2) != 0) {
            list2 = result.campaigns;
        }
        return result.copy(list, list2);
    }

    public final List<Reward> component1() {
        return this.rewards;
    }

    public final List<Campaign> component2() {
        return this.campaigns;
    }

    public final Result copy(List<Reward> list, List<Campaign> list2) {
        Intrinsics.checkNotNullParameter(list, "rewards");
        Intrinsics.checkNotNullParameter(list2, "campaigns");
        return new Result(list, list2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Result)) {
            return false;
        }
        Result result = (Result) obj;
        return Intrinsics.areEqual(this.rewards, result.rewards) && Intrinsics.areEqual(this.campaigns, result.campaigns);
    }

    public int hashCode() {
        List<Reward> list = this.rewards;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<Campaign> list2 = this.campaigns;
        if (list2 != null) {
            i = list2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        return "Result(rewards=" + this.rewards + ", campaigns=" + this.campaigns + ")";
    }

    public Result(List<Reward> list, List<Campaign> list2) {
        Intrinsics.checkNotNullParameter(list, "rewards");
        Intrinsics.checkNotNullParameter(list2, "campaigns");
        this.rewards = list;
        this.campaigns = list2;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Result(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new ArrayList() : list, (i & 2) != 0 ? new ArrayList() : list2);
    }

    public final List<Reward> getRewards() {
        return this.rewards;
    }

    public final List<Campaign> getCampaigns() {
        return this.campaigns;
    }
}
