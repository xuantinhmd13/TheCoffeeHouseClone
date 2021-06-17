package com.thecoffeehouse.guestapp.screens.order;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "shippingNote", "", "billNote", "saveConfirm", "", "invoke", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showShippingAndPaymentDialog$6 extends Lambda implements Function3<String, String, Boolean, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showShippingAndPaymentDialog$6(OrderFragment orderFragment) {
        super(3);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2, Boolean bool) {
        invoke(str, str2, bool);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2, Boolean bool) {
        LiveData<Resource<CreateOrderResponse>> updateDeliveryInfoAndCreateOrder = ((OrderViewModel) this.this$0.getViewModel()).updateDeliveryInfoAndCreateOrder(str, str2, bool);
        OrderFragment orderFragment = this.this$0;
        updateDeliveryInfoAndCreateOrder.observe(orderFragment, orderFragment.mObserveCreateOrder);
    }
}
