package com.thecoffeehouse.guestapp.screens.order;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$initDefaultShippingMethod$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ Function0 $onCompleted;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$initDefaultShippingMethod$3(OrderFragment orderFragment, Function0 function0) {
        super(0);
        this.this$0 = orderFragment;
        this.$onCompleted = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        this.this$0.isInitDefaultShippingMethod = true;
        this.$onCompleted.invoke();
    }
}
