package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.HeaderItemDecoration;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J \u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter$onScrollListener$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "isScrollingDown", "", "dy", "", "isScrollingUp", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "setCategoryByHeaderViewHolder", "setCategoryByProduct", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductRecyclerViewAdapter.kt */
public final class ProductRecyclerViewAdapter$onScrollListener$1 extends RecyclerView.OnScrollListener {
    final /* synthetic */ ProductRecyclerViewAdapter this$0;

    private final boolean isScrollingDown(int i) {
        return i < 0;
    }

    private final boolean isScrollingUp(int i) {
        return i > 0;
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ProductRecyclerViewAdapter$onScrollListener$1(ProductRecyclerViewAdapter productRecyclerViewAdapter) {
        this.this$0 = productRecyclerViewAdapter;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (isScrollingUp(i2)) {
            setCategoryByHeaderViewHolder(recyclerView);
        } else if (isScrollingDown(i2)) {
            setCategoryByProduct(recyclerView);
        } else if (i2 == 0) {
            onScrolled(recyclerView, i, 1);
        }
    }

    private final void setCategoryByProduct(RecyclerView recyclerView) {
        RecyclerView.ViewHolder findViewHolderForAdapterPosition;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1 && (findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition)) != null && (findViewHolderForAdapterPosition instanceof ProductRecyclerViewAdapter.ProductViewHolder)) {
            Object obj = this.this$0.mProducts.get(findFirstVisibleItemPosition);
            String str = null;
            if (!(obj instanceof Product)) {
                obj = null;
            }
            Product product = (Product) obj;
            HeaderItemDecoration access$getStickyHeader$p = ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0);
            if (product != null) {
                str = product.getCategoryName();
            }
            access$getStickyHeader$p.setCurrentCategory(str);
        }
    }

    private final void setCategoryByHeaderViewHolder(RecyclerView recyclerView) {
        View view;
        RecyclerView.ViewHolder second;
        View view2;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        int findFirstVisibleItemPosition = ((LinearLayoutManager) layoutManager).findFirstVisibleItemPosition();
        if (findFirstVisibleItemPosition != -1) {
            RecyclerView.ViewHolder findViewHolderForAdapterPosition = recyclerView.findViewHolderForAdapterPosition(findFirstVisibleItemPosition);
            int i = findFirstVisibleItemPosition + 1;
            RecyclerView.ViewHolder findViewHolderForAdapterPosition2 = recyclerView.findViewHolderForAdapterPosition(i);
            if (findViewHolderForAdapterPosition2 != null && (findViewHolderForAdapterPosition2 instanceof ProductRecyclerViewAdapter.HeaderViewHolder) && (this.this$0.mProducts.get(i) instanceof String)) {
                Pair<Integer, RecyclerView.ViewHolder> currentHeader = ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0).getCurrentHeader();
                int i2 = 0;
                int bottom = (currentHeader == null || (second = currentHeader.getSecond()) == null || (view2 = second.itemView) == null) ? 0 : view2.getBottom();
                if (!(findViewHolderForAdapterPosition == null || (view = findViewHolderForAdapterPosition.itemView) == null)) {
                    i2 = view.getBottom();
                }
                if (bottom >= i2) {
                    Object obj = this.this$0.mProducts.get(i);
                    if (!(obj instanceof String)) {
                        obj = null;
                    }
                    ProductRecyclerViewAdapter.access$getStickyHeader$p(this.this$0).setCurrentCategory((String) obj);
                }
            }
        }
    }
}
