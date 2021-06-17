package com.thecoffeehouse.guestapp.screens.order;

import androidx.fragment.app.FragmentActivity;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductDetailDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "orderLine", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showProductDetailDialog$1 extends Lambda implements Function1<OrderLine, Unit> {
    final /* synthetic */ ProductDetailDialogFragment.ProductConfiguration $configs;
    final /* synthetic */ Integer $position;
    final /* synthetic */ Product $product;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showProductDetailDialog$1(OrderFragment orderFragment, Integer num, Product product, ProductDetailDialogFragment.ProductConfiguration productConfiguration) {
        super(1);
        this.this$0 = orderFragment;
        this.$position = num;
        this.$product = product;
        this.$configs = productConfiguration;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(OrderLine orderLine) {
        invoke(orderLine);
        return Unit.INSTANCE;
    }

    public final void invoke(final OrderLine orderLine) {
        Intrinsics.checkNotNullParameter(orderLine, "orderLine");
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (mainActivity != null) {
            mainActivity.runFlowLogin(new Function1<Boolean, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$showProductDetailDialog$1.AnonymousClass1 */
                final /* synthetic */ OrderFragment$showProductDetailDialog$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                    invoke(bool.booleanValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z) {
                    if (!z) {
                        return;
                    }
                    if (this.this$0.this$0.removeItemOut(orderLine)) {
                        this.this$0.this$0.deleteItemInCart(orderLine);
                    } else {
                        this.this$0.this$0.upsertItemInCart(orderLine, this.this$0.$position, this.this$0.$product, this.this$0.$configs);
                    }
                }
            });
        }
    }
}
