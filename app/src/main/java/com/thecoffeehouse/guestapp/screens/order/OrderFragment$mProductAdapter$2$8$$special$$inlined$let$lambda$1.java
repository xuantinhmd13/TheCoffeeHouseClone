package com.thecoffeehouse.guestapp.screens.order;

import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment$mProductAdapter$2;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "menu", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "invoke", "com/thecoffeehouse/guestapp/screens/order/OrderFragment$mProductAdapter$2$8$1$filterFragment$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$mProductAdapter$2$8$$special$$inlined$let$lambda$1 extends Lambda implements Function1<Menu, Unit> {
    final /* synthetic */ OrderFragment$mProductAdapter$2.AnonymousClass8 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$mProductAdapter$2$8$$special$$inlined$let$lambda$1(OrderFragment$mProductAdapter$2.AnonymousClass8 r1) {
        super(1);
        this.this$0 = r1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Menu menu) {
        invoke(menu);
        return Unit.INSTANCE;
    }

    public final void invoke(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Iterator it = this.this$0.this$0.this$0.getMProducts().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            Object next = it.next();
            if ((next instanceof String) && Intrinsics.areEqual(menu.getName(), next)) {
                break;
            }
            i++;
        }
        RecyclerView.LayoutManager layoutManager = OrderFragment.access$getMViewRcvProduct$p(this.this$0.this$0.this$0).getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager");
        ((ProductLayoutManager) layoutManager).scrollToCategoryPosition(i);
    }
}
