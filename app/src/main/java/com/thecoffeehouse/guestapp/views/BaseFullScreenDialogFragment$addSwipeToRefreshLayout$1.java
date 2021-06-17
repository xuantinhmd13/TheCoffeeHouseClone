package com.thecoffeehouse.guestapp.views;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onRefresh"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFullScreenDialogFragment.kt */
public final class BaseFullScreenDialogFragment$addSwipeToRefreshLayout$1 implements SwipeRefreshLayout.OnRefreshListener {
    final /* synthetic */ Function0 $onRefreshListener;
    final /* synthetic */ BaseFullScreenDialogFragment this$0;

    BaseFullScreenDialogFragment$addSwipeToRefreshLayout$1(BaseFullScreenDialogFragment baseFullScreenDialogFragment, Function0 function0) {
        this.this$0 = baseFullScreenDialogFragment;
        this.$onRefreshListener = function0;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayout = this.this$0.swipeRefreshLayout;
        Intrinsics.checkNotNull(swipeRefreshLayout);
        swipeRefreshLayout.setRefreshing(true);
        this.$onRefreshListener.invoke();
    }
}
