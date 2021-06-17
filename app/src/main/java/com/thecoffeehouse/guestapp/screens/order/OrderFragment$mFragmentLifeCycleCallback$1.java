package com.thecoffeehouse.guestapp.screens.order;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.screens.order.checkout.CheckoutDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.favouriteproducts.FavouriteProductDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductDetailDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.recentorders.RecentProductsDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/OrderFragment$mFragmentLifeCycleCallback$1", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "deInitDialog", "", "f", "Landroidx/fragment/app/Fragment;", "onFragmentDestroyed", "fm", "Landroidx/fragment/app/FragmentManager;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$mFragmentLifeCycleCallback$1 extends FragmentManager.FragmentLifecycleCallbacks {
    final /* synthetic */ OrderFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    OrderFragment$mFragmentLifeCycleCallback$1(OrderFragment orderFragment) {
        this.this$0 = orderFragment;
    }

    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        Intrinsics.checkNotNullParameter(fragment, "f");
        super.onFragmentDestroyed(fragmentManager, fragment);
        deInitDialog(fragment);
    }

    private final void deInitDialog(Fragment fragment) {
        String simpleName = fragment.getClass().getSimpleName();
        if (Intrinsics.areEqual(simpleName, CheckoutDialogFragment.class.getSimpleName())) {
            this.this$0.mCheckoutDialogFragment = null;
        } else if (Intrinsics.areEqual(simpleName, ProductDetailDialogFragment.class.getSimpleName())) {
            this.this$0.mProductDetailDialogFragment = null;
        } else if (Intrinsics.areEqual(simpleName, SearchProductDialogFragment.class.getSimpleName())) {
            this.this$0.mSearchProductDialog = null;
        } else if (Intrinsics.areEqual(simpleName, FavouriteProductDialogFragment.class.getSimpleName())) {
            this.this$0.mFavouriteProductDialogFragment = null;
        } else if (Intrinsics.areEqual(simpleName, RecentProductsDialogFragment.class.getSimpleName())) {
            this.this$0.mRecentProductsDialogFragment = null;
        }
    }
}
