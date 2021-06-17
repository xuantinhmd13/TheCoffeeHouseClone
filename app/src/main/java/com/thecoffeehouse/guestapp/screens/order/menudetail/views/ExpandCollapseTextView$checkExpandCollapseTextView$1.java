package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.view.View;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: ExpandCollapseTextView.kt */
public final class ExpandCollapseTextView$checkExpandCollapseTextView$1 implements View.OnClickListener {
    final /* synthetic */ ExpandCollapseTextView this$0;

    ExpandCollapseTextView$checkExpandCollapseTextView$1(ExpandCollapseTextView expandCollapseTextView) {
        this.this$0 = expandCollapseTextView;
    }

    public final void onClick(View view) {
        ExpandCollapseTextView expandCollapseTextView = this.this$0;
        expandCollapseTextView.isExpanding = !expandCollapseTextView.isExpanding;
        this.this$0.setTextExpandCollapse();
    }
}
