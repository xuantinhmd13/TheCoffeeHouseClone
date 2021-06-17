package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.screens.stores.LoadMoreView;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersHistoryResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersHistoryResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RecentOrderDialogFragment.kt */
public final class RecentOrderDialogFragment$initOrdersProcessing$1 extends Lambda implements Function1<GetOrdersHistoryResponse, Unit> {
    final /* synthetic */ RecentOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentOrderDialogFragment$initOrdersProcessing$1(RecentOrderDialogFragment recentOrderDialogFragment) {
        super(1);
        this.this$0 = recentOrderDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetOrdersHistoryResponse getOrdersHistoryResponse) {
        invoke(getOrdersHistoryResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetOrdersHistoryResponse getOrdersHistoryResponse) {
        Intrinsics.checkNotNullParameter(getOrdersHistoryResponse, "it");
        ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).setLoadMoreResolver(new LoadMoreView(new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.RecentOrderDialogFragment$initOrdersProcessing$1.AnonymousClass1 */
            final /* synthetic */ RecentOrderDialogFragment$initOrdersProcessing$1 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                if (this.this$0.this$0.mIsAbleToLoadMore) {
                    OrderViewModel.getOrdersHistory$default(this.this$0.this$0.getOrderViewModel(), this.this$0.this$0.mPage, 0, 2, null).observe(this.this$0.this$0, this.this$0.this$0.mObserveOrdersHistory);
                    return;
                }
                ((InfinitePlaceHolderView) this.this$0.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).loadingDone();
                ((InfinitePlaceHolderView) this.this$0.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).noMoreToLoad();
            }
        }));
    }
}
