package com.thecoffeehouse.guestapp.screens.base;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "VM", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "onRefresh"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
public final class BaseFragment$addSwipeToRefreshLayout$1 implements SwipeRefreshLayout.OnRefreshListener {
    final /* synthetic */ Function0 $onRefreshListener;
    final /* synthetic */ BaseFragment this$0;

    BaseFragment$addSwipeToRefreshLayout$1(BaseFragment baseFragment, Function0 function0) {
        this.this$0 = baseFragment;
        this.$onRefreshListener = function0;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
    public final void onRefresh() {
        SwipeRefreshLayout swipeRefreshLayout = this.this$0.getSwipeRefreshLayout();
        Intrinsics.checkNotNull(swipeRefreshLayout);
        swipeRefreshLayout.setRefreshing(true);
        this.$onRefreshListener.invoke();
    }
}
