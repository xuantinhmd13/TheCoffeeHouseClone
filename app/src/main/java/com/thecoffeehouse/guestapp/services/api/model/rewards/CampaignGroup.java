package com.thecoffeehouse.guestapp.services.api.model.rewards;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002R$\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CampaignGroup;", "", "()V", "campaigns", "", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "getCampaigns", "()Ljava/util/List;", "setCampaigns", "(Ljava/util/List;)V", "title", "", "getTitle", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: Rewards.kt */
public final class CampaignGroup {
    @SerializedName("campaigns")
    @Expose
    private List<Campaign> campaigns = new ArrayList();
    @SerializedName("title")
    private String title = "";

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final List<Campaign> getCampaigns() {
        return this.campaigns;
    }

    public final void setCampaigns(List<Campaign> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.campaigns = list;
    }
}
