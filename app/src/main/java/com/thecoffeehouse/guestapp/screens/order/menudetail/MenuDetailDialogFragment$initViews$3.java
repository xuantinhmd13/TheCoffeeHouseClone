package com.thecoffeehouse.guestapp.screens.order.menudetail;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/menudetail/MenuDetailDialogFragment$initViews$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MenuDetailDialogFragment.kt */
public final class MenuDetailDialogFragment$initViews$3 extends RecyclerView.OnScrollListener {
    final /* synthetic */ MenuDetailDialogFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MenuDetailDialogFragment$initViews$3(MenuDetailDialogFragment menuDetailDialogFragment) {
        this.this$0 = menuDetailDialogFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        MenuDetailDialogFragment.access$getMProductAdapter$p(this.this$0).closeAllSwipeLayout();
    }
}
