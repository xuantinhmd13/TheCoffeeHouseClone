package com.thecoffeehouse.guestapp.services.api.server;

import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsAPI;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/server/RewardsAPIService;", "Lcom/thecoffeehouse/guestapp/services/api/server/APIService;", "()V", "getRewardsService", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsAPI;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsAPIService.kt */
public final class RewardsAPIService extends APIService {
    public final RewardsAPI getRewardsService() {
        return (RewardsAPI) getRetrofit().createService(RewardsAPI.class);
    }
}
