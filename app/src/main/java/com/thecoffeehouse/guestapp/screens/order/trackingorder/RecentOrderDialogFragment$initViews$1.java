package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import androidx.lifecycle.LiveData;
import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersProcessingResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RecentOrderDialogFragment.kt */
final class RecentOrderDialogFragment$initViews$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ RecentOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentOrderDialogFragment$initViews$1(RecentOrderDialogFragment recentOrderDialogFragment) {
        super(0);
        this.this$0 = recentOrderDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        this.this$0.mPage = 1;
        ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).removeAllViews();
        LiveData<Resource<GetOrdersProcessingResponse>> ordersProcessing = this.this$0.getOrderViewModel().getOrdersProcessing();
        RecentOrderDialogFragment recentOrderDialogFragment = this.this$0;
        ordersProcessing.observe(recentOrderDialogFragment, recentOrderDialogFragment.mObserveOrdersProcessing);
    }
}
