package com.thecoffeehouse.guestapp.screens.rewards.beanhistory;

import androidx.lifecycle.LiveData;
import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: BeanHistoryDialogFragment.kt */
final class BeanHistoryDialogFragment$initViews$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ BeanHistoryDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeanHistoryDialogFragment$initViews$1(BeanHistoryDialogFragment beanHistoryDialogFragment) {
        super(0);
        this.this$0 = beanHistoryDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        ((InfinitePlaceHolderView) this.this$0._$_findCachedViewById(R.id.iphv_recent_orders)).removeAllViews();
        LiveData<Resource<GetBeanHistoryResponse>> beanHistory = this.this$0.getRewardViewModel().getBeanHistory(this.this$0.mPage, this.this$0.mLimit);
        BeanHistoryDialogFragment beanHistoryDialogFragment = this.this$0;
        beanHistory.observe(beanHistoryDialogFragment, beanHistoryDialogFragment.mObserveOrdersHistory);
    }
}
