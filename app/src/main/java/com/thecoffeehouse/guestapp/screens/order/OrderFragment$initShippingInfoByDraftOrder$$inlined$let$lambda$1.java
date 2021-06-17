package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke", "com/thecoffeehouse/guestapp/screens/order/OrderFragment$initShippingInfoByDraftOrder$1$3"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$initShippingInfoByDraftOrder$$inlined$let$lambda$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ CalculateOrderResponse $draftOrder$inlined;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$initShippingInfoByDraftOrder$$inlined$let$lambda$1(OrderFragment orderFragment, CalculateOrderResponse calculateOrderResponse) {
        super(1);
        this.this$0 = orderFragment;
        this.$draftOrder$inlined = calculateOrderResponse;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        TableInfo tableInfo;
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
        OrderFragment orderFragment = this.this$0;
        Order order = this.$draftOrder$inlined.getOrder();
        orderFragment.checkShowPopupWarningDraftCart((order == null || (tableInfo = order.getTableInfo()) == null) ? null : tableInfo.getLatLng(), addressSuggestion.getLatLng());
    }
}
