package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Warning;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "createOrderResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/CreateOrderResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$mObserveCreateOrder$1 extends Lambda implements Function1<CreateOrderResponse, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$mObserveCreateOrder$1(OrderFragment orderFragment) {
        super(1);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CreateOrderResponse createOrderResponse) {
        invoke(createOrderResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(CreateOrderResponse createOrderResponse) {
        String str;
        Intrinsics.checkNotNullParameter(createOrderResponse, "createOrderResponse");
        if (createOrderResponse.getError() != null) {
            MainActivity mainActivity = this.this$0.getMainActivity();
            if (mainActivity != null) {
                MainActivity mainActivity2 = mainActivity;
                String string = this.this$0.getString(R.string.str_error);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
                ServerError error = createOrderResponse.getError();
                if (error == null || (str = error.getMessage()) == null) {
                    str = "";
                }
                ContextExtsKt.showOneButtonAlertDialog$default(mainActivity2, string, str, null, false, null, 28, null);
            }
        } else if (createOrderResponse.getWarning() != null) {
            OrderFragment orderFragment = this.this$0;
            Warning warning = createOrderResponse.getWarning();
            Intrinsics.checkNotNull(warning);
            orderFragment.showWarningButton(warning);
        } else {
            this.this$0.openOrderTrackingFragment(createOrderResponse);
            this.this$0.dismissAllDialogs();
            this.this$0.trackingCreateOrder(createOrderResponse);
        }
    }
}
