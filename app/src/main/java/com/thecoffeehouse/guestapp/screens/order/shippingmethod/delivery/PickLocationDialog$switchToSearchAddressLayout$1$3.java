package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0016¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$switchToSearchAddressLayout$1$3", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrolled", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "dx", "", "dy", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
public final class PickLocationDialog$switchToSearchAddressLayout$1$3 extends RecyclerView.OnScrollListener {
    final /* synthetic */ View $this_apply;

    PickLocationDialog$switchToSearchAddressLayout$1$3(View view) {
        this.$this_apply = view;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrolled(RecyclerView recyclerView, int i, int i2) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrolled(recyclerView, i, i2);
        if (recyclerView.computeVerticalScrollOffset() == 0) {
            View rootView = this.$this_apply.getRootView();
            Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
            ViewCompat.setNestedScrollingEnabled((PlaceHolderView) rootView.findViewById(R.id.phv_address), true);
            return;
        }
        View rootView2 = this.$this_apply.getRootView();
        Intrinsics.checkNotNullExpressionValue(rootView2, "rootView");
        ViewCompat.setNestedScrollingEnabled((PlaceHolderView) rootView2.findViewById(R.id.phv_address), false);
    }
}
