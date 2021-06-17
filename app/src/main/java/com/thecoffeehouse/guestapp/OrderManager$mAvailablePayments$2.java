package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.PaymentsItem;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/PaymentsItem;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderManager.kt */
final class OrderManager$mAvailablePayments$2 extends Lambda implements Function0<List<? extends PaymentsItem>> {
    final /* synthetic */ OrderManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderManager$mAvailablePayments$2(OrderManager orderManager) {
        super(0);
        this.this$0 = orderManager;
    }

    /* Return type fixed from 'java.util.List<com.thecoffeehouse.guestapp.services.api.model.common.config.PaymentsItem>' to match base method */
    @Override // kotlin.jvm.functions.Function0
    public final List<? extends PaymentsItem> invoke() {
        GetMetadataResponse value = OrderManager.access$getApplication$p(this.this$0).m0getMetadata().getValue();
        List<PaymentsItem> payments = value != null ? value.getPayments() : null;
        return payments != null ? payments : CollectionsKt.emptyList();
    }
}
