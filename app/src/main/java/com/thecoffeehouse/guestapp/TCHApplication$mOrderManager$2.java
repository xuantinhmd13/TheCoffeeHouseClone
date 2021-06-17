package com.thecoffeehouse.guestapp;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/OrderManager;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: TCHApplication.kt */
final class TCHApplication$mOrderManager$2 extends Lambda implements Function0<OrderManager> {
    final /* synthetic */ TCHApplication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TCHApplication$mOrderManager$2(TCHApplication tCHApplication) {
        super(0);
        this.this$0 = tCHApplication;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OrderManager invoke() {
        return new OrderManager(this.this$0);
    }
}
