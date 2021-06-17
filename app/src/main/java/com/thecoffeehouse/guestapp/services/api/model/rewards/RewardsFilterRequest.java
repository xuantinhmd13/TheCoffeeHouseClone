package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R \u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterRequest;", "", "()V", "catgId", "", "getCatgId", "()Ljava/lang/String;", "setCatgId", "(Ljava/lang/String;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class RewardsFilterRequest {
    @SerializedName("category_id")
    private String catgId;

    public final String getCatgId() {
        return this.catgId;
    }

    public final void setCatgId(String str) {
        this.catgId = str;
    }
}
