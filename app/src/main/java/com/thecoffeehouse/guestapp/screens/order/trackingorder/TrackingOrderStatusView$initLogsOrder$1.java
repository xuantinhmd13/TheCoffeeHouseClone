package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.view.View;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderStatusView.kt */
public final class TrackingOrderStatusView$initLogsOrder$1 implements View.OnClickListener {
    final /* synthetic */ TrackingOrderStatusView this$0;

    TrackingOrderStatusView$initLogsOrder$1(TrackingOrderStatusView trackingOrderStatusView) {
        this.this$0 = trackingOrderStatusView;
    }

    public final void onClick(View view) {
        TrackingOrderStatusView trackingOrderStatusView = this.this$0;
        trackingOrderStatusView.isExpanding = !trackingOrderStatusView.isExpanding;
        this.this$0.addLogOrderByExpandState();
        this.this$0.sendTrackingEventExpandCollapse();
    }
}
