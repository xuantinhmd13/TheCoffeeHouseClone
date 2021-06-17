package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J \u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0016¨\u0006\u000b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreDialogFragment$initViews$1", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "onScrolled", "dx", "dy", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
public final class PickStoreDialogFragment$initViews$1 extends RecyclerView.OnScrollListener {
    final /* synthetic */ PickStoreDialogFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    PickStoreDialogFragment$initViews$1(PickStoreDialogFragment pickStoreDialogFragment) {
        this.this$0 = pickStoreDialogFragment;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (recyclerView.computeVerticalScrollOffset() == 0) {
            ViewCompat.setNestedScrollingEnabled(this.this$0.getMPlaceHolderView(), true);
        } else {
            ViewCompat.setNestedScrollingEnabled(this.this$0.getMPlaceHolderView(), false);
        }
    }
}
