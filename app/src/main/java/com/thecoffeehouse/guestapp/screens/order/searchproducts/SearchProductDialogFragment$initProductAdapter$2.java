package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0018\u00010\u0005R\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\b\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment$initProductAdapter$2", "Landroidx/recyclerview/widget/LinearLayoutManager;", "onLayoutChildren", "", "recycler", "Landroidx/recyclerview/widget/RecyclerView$Recycler;", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "supportsPredictiveItemAnimations", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchProductDialogFragment.kt */
public final class SearchProductDialogFragment$initProductAdapter$2 extends LinearLayoutManager {
    final /* synthetic */ SearchProductDialogFragment this$0;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchProductDialogFragment$initProductAdapter$2(SearchProductDialogFragment searchProductDialogFragment, Context context) {
        super(context);
        this.this$0 = searchProductDialogFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void onLayoutChildren(RecyclerView.Recycler recycler, RecyclerView.State state) {
        try {
            super.onLayoutChildren(recycler, state);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
