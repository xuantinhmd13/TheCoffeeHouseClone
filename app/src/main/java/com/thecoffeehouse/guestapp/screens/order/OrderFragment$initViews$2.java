package com.thecoffeehouse.guestapp.screens.order;

import android.view.View;
import android.view.ViewStub;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
final class OrderFragment$initViews$2 implements ViewStub.OnInflateListener {
    final /* synthetic */ View $view;
    final /* synthetic */ OrderFragment this$0;

    OrderFragment$initViews$2(OrderFragment orderFragment, View view) {
        this.this$0 = orderFragment;
        this.$view = view;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        if (this.this$0.getContext() != null) {
            OrderFragment orderFragment = this.this$0;
            Intrinsics.checkNotNullExpressionValue(view, "inflated");
            orderFragment.initInflatedViewStubOrder(view, this.$view);
        }
    }
}
