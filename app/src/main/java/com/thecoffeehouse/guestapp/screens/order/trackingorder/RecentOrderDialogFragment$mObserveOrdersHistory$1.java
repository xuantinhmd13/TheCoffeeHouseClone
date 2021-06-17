package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersHistoryResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RecentOrderDialogFragment.kt */
public final class RecentOrderDialogFragment$mObserveOrdersHistory$1 extends Lambda implements Function1<GetOrdersHistoryResponse, Unit> {
    final /* synthetic */ RecentOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RecentOrderDialogFragment$mObserveOrdersHistory$1(RecentOrderDialogFragment recentOrderDialogFragment) {
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
        if (!getOrdersHistoryResponse.getHistories().isEmpty()) {
            if (this.this$0.mPage == 1) {
                String string = this.this$0.getString(R.string.str_completed_orders);
                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_completed_orders)");
                ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).addView(new ItemRowRecentOrderHeader(string));
            }
            for (OrderHistory orderHistory : getOrdersHistoryResponse.getHistories()) {
                ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).addView(new ItemRowOrderHistory(orderHistory, new RecentOrderDialogFragment$mObserveOrdersHistory$1$rowOrderProcessing$1(this, orderHistory)));
            }
            ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).loadingDone();
            this.this$0.mIsAbleToLoadMore = true;
            RecentOrderDialogFragment recentOrderDialogFragment = this.this$0;
            recentOrderDialogFragment.mPage = recentOrderDialogFragment.mPage + 1;
            return;
        }
        ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).noMoreToLoad();
        this.this$0.mIsAbleToLoadMore = false;
        this.this$0.mPage = 1;
    }
}
