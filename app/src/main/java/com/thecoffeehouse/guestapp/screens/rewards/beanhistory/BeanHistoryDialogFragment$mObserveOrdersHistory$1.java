package com.thecoffeehouse.guestapp.screens.rewards.beanhistory;

import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowRecentOrderHeader;
import com.thecoffeehouse.guestapp.services.api.model.membership.BeanHistory;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetBeanHistoryResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: BeanHistoryDialogFragment.kt */
public final class BeanHistoryDialogFragment$mObserveOrdersHistory$1 extends Lambda implements Function1<GetBeanHistoryResponse, Unit> {
    final /* synthetic */ BeanHistoryDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeanHistoryDialogFragment$mObserveOrdersHistory$1(BeanHistoryDialogFragment beanHistoryDialogFragment) {
        super(1);
        this.this$0 = beanHistoryDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetBeanHistoryResponse getBeanHistoryResponse) {
        invoke(getBeanHistoryResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetBeanHistoryResponse getBeanHistoryResponse) {
        Intrinsics.checkNotNullParameter(getBeanHistoryResponse, "it");
        String string = this.this$0.getString(R.string.str_bean_history_title);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_bean_history_title)");
        ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).addView(new ItemRowRecentOrderHeader(string));
        for (BeanHistory beanHistory : getBeanHistoryResponse.getHistories()) {
            ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).addView(new ItemRowBeanHistory(beanHistory));
        }
    }
}
