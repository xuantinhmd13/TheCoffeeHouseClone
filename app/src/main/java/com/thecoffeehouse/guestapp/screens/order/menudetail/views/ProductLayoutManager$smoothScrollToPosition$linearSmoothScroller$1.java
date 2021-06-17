package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.graphics.PointF;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/menudetail/views/ProductLayoutManager$smoothScrollToPosition$linearSmoothScroller$1", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/ProductLayoutManager$SnapTopLinearSmoothScroller;", "computeScrollVectorForPosition", "Landroid/graphics/PointF;", "targetPosition", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductLayoutManager.kt */
public final class ProductLayoutManager$smoothScrollToPosition$linearSmoothScroller$1 extends ProductLayoutManager.SnapTopLinearSmoothScroller {
    final /* synthetic */ RecyclerView $recyclerView;
    final /* synthetic */ ProductLayoutManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductLayoutManager$smoothScrollToPosition$linearSmoothScroller$1(ProductLayoutManager productLayoutManager, RecyclerView recyclerView, Context context, int i) {
        super(context, i);
        this.this$0 = productLayoutManager;
        this.$recyclerView = recyclerView;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.SmoothScroller
    public PointF computeScrollVectorForPosition(int i) {
        return this.this$0.computeScrollVectorForPosition(i);
    }
}
