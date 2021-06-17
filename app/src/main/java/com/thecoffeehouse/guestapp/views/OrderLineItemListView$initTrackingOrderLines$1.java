package com.thecoffeehouse.guestapp.views;

import android.view.View;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderLineItemListView.kt */
public final class OrderLineItemListView$initTrackingOrderLines$1 implements View.OnClickListener {
    final /* synthetic */ OrderLineItemListView this$0;

    OrderLineItemListView$initTrackingOrderLines$1(OrderLineItemListView orderLineItemListView) {
        this.this$0 = orderLineItemListView;
    }

    public final void onClick(View view) {
        OrderLineItemListView orderLineItemListView = this.this$0;
        orderLineItemListView.isExpanding = !orderLineItemListView.isExpanding;
        OrderLineItemListView orderLineItemListView2 = this.this$0;
        orderLineItemListView2.setCollapseExpandFooter(orderLineItemListView2.isExpanding);
        OrderLineItemListView orderLineItemListView3 = this.this$0;
        orderLineItemListView3.setListCollapseExpand(orderLineItemListView3.isExpanding);
    }
}
