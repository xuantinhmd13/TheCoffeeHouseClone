package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.ShippingPayment;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/ShippingPayment;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
final class OrderManager$mShippingPayments$2 extends Lambda implements Function0<ShippingPayment> {
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$mShippingPayments$2(OrderManager orderManager) {
        super(0);
        this.this$0 = orderManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ShippingPayment invoke() {
        ShippingPayment shippingPayment;
        GetMetadataResponse value = OrderManager.access$getApplication$p(this.this$0).m0getMetadata().getValue();
        return (value == null || (shippingPayment = value.getShippingPayment()) == null) ? new ShippingPayment(null, null, null, 7, null) : shippingPayment;
    }
}
