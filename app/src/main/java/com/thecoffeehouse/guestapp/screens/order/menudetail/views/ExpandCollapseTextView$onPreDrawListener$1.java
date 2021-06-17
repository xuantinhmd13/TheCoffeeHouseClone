package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.view.ViewTreeObserver;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/menudetail/views/ExpandCollapseTextView$onPreDrawListener$1", "Landroid/view/ViewTreeObserver$OnPreDrawListener;", "onPreDraw", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExpandCollapseTextView.kt */
public final class ExpandCollapseTextView$onPreDrawListener$1 implements ViewTreeObserver.OnPreDrawListener {
    final /* synthetic */ ExpandCollapseTextView this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ExpandCollapseTextView$onPreDrawListener$1(ExpandCollapseTextView expandCollapseTextView) {
        this.this$0 = expandCollapseTextView;
    }

    public boolean onPreDraw() {
        this.this$0.checkExpandCollapseTextView();
        this.this$0.getViewTreeObserver().removeOnPreDrawListener(this);
        return true;
    }
}
