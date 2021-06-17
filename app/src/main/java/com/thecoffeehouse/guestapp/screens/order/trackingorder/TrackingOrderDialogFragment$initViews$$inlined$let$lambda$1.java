package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.view.View;
import android.view.ViewStub;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate", "com/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderDialogFragment$initViews$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderDialogFragment.kt */
public final class TrackingOrderDialogFragment$initViews$$inlined$let$lambda$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ TrackingOrderDialogFragment this$0;

    TrackingOrderDialogFragment$initViews$$inlined$let$lambda$1(TrackingOrderDialogFragment trackingOrderDialogFragment) {
        this.this$0 = trackingOrderDialogFragment;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        this.this$0.mRootView = view;
        this.this$0.initOrderTracking();
    }
}
