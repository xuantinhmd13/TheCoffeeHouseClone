package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.stores.StoreAPI;
import com.thecoffeehouse.guestapp.services.api.server.StoreAPIService;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/StoreAPI;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
final class OrderManager$storeAPIService$2 extends Lambda implements Function0<StoreAPI> {
    public static final OrderManager$storeAPIService$2 INSTANCE = new OrderManager$storeAPIService$2();

    OrderManager$storeAPIService$2() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final StoreAPI invoke() {
        return new StoreAPIService().getStoreService();
    }
}
