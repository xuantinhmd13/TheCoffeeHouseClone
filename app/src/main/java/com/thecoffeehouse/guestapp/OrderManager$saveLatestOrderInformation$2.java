package com.thecoffeehouse.guestapp;

import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
final class OrderManager$saveLatestOrderInformation$2 implements Runnable {
    final /* synthetic */ OrderManager this$0;

    OrderManager$saveLatestOrderInformation$2(OrderManager orderManager) {
        this.this$0 = orderManager;
    }

    public final void run() {
        String json = new Gson().toJson(this.this$0.getMLatestOrders());
        Profile userProfile = OrderManager.access$getApplication$p(this.this$0).requireClientManager().getUserProfile();
        SharePrefs.INSTANCE.putString(OrderManager.access$getApplication$p(this.this$0), OrderManager.access$getORDER_LOCAL$p(this.this$0), OrderManager.access$getLATEST_ORDERS$p(this.this$0) + (userProfile != null ? userProfile.getBarcode() : null), json);
    }
}
