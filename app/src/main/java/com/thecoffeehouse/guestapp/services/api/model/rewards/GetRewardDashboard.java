package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.gson.annotations.SerializedName;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R\u001c\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u0004\u0018\u00010\t8\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0007¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetRewardDashboard;", "", "()V", "categories", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", "getCategories", "()Ljava/util/List;", "error", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "getError", "()Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerError;", "groups", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GroupReward;", "getGroups", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class GetRewardDashboard {
    @SerializedName("categories")
    private final List<Category> categories = new ArrayList();
    @SerializedName("error")
    private final ServerError error;
    @SerializedName("groups")
    private final List<GroupReward> groups = new ArrayList();

    public final ServerError getError() {
        return this.error;
    }

    public final List<Category> getCategories() {
        return this.categories;
    }

    public final List<GroupReward> getGroups() {
        return this.groups;
    }
}
