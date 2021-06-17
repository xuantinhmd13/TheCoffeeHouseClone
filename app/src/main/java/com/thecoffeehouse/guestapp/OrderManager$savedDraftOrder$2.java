package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CalculateOrderResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
final class OrderManager$savedDraftOrder$2 extends Lambda implements Function0<CalculateOrderResponse> {
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$savedDraftOrder$2(OrderManager orderManager) {
        super(0);
        this.this$0 = orderManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final CalculateOrderResponse invoke() {
        SharePrefs sharePrefs = SharePrefs.INSTANCE;
        TCHApplication access$getApplication$p = OrderManager.access$getApplication$p(this.this$0);
        String access$getORDER_LOCAL$p = OrderManager.access$getORDER_LOCAL$p(this.this$0);
        StringBuilder append = new StringBuilder().append(OrderManager.access$getDRAFT_ORDER$p(this.this$0));
        Profile userProfile = OrderManager.access$getApplication$p(this.this$0).requireClientManager().getUserProfile();
        String string = sharePrefs.getString(access$getApplication$p, access$getORDER_LOCAL$p, append.append(userProfile != null ? userProfile.getBarcode() : null).toString());
        String str = string;
        if ((str == null || str.length() == 0) || Intrinsics.areEqual(string, "{}")) {
            return null;
        }
        return OrderManager.access$initDraftOrder(this.this$0, string);
    }
}
