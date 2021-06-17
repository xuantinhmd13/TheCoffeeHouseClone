package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.LinearSmoothScroller;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u001bB\u0011\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0004B!\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tB+\b\u0016\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\u0006¢\u0006\u0002\u0010\u000eJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0006J\u000e\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0006J$\u0010\u0015\u001a\u00020\u00112\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0012\u001a\u00020\u0006H\u0016J\b\u0010\u001a\u001a\u00020\bH\u0016R\u000e\u0010\u000f\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/ProductLayoutManager;", "Landroidx/recyclerview/widget/LinearLayoutManager;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "orientation", "", "reverseLayout", "", "(Landroid/content/Context;IZ)V", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "defStyleRes", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "offsetSmoothScroll", "scrollToCategoryPosition", "", "position", "setOffSetSmoothScroll", "offset", "smoothScrollToPosition", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "state", "Landroidx/recyclerview/widget/RecyclerView$State;", "supportsPredictiveItemAnimations", "SnapTopLinearSmoothScroller", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductLayoutManager.kt */
public final class ProductLayoutManager extends LinearLayoutManager {
    private int offsetSmoothScroll;

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public boolean supportsPredictiveItemAnimations() {
        return false;
    }

    public ProductLayoutManager(Context context) {
        super(context);
    }

    public ProductLayoutManager(Context context, int i, boolean z) {
        super(context, i, z);
    }

    public ProductLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    public final void scrollToCategoryPosition(int i) {
        scrollToPositionWithOffset(i, this.offsetSmoothScroll);
    }

    public final void setOffSetSmoothScroll(int i) {
        this.offsetSmoothScroll = i;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.LayoutManager, androidx.recyclerview.widget.LinearLayoutManager
    public void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.State state, int i) {
        if (recyclerView != null) {
            Context context = recyclerView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "recyclerView.context");
            ProductLayoutManager$smoothScrollToPosition$linearSmoothScroller$1 productLayoutManager$smoothScrollToPosition$linearSmoothScroller$1 = new ProductLayoutManager$smoothScrollToPosition$linearSmoothScroller$1(this, recyclerView, context, this.offsetSmoothScroll);
            productLayoutManager$smoothScrollToPosition$linearSmoothScroller$1.setTargetPosition(i);
            startSmoothScroll(productLayoutManager$smoothScrollToPosition$linearSmoothScroller$1);
            return;
        }
        super.smoothScrollToPosition(recyclerView, state, i);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J0\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0010\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0014R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/ProductLayoutManager$SnapTopLinearSmoothScroller;", "Landroidx/recyclerview/widget/LinearSmoothScroller;", "context", "Landroid/content/Context;", "offsetSmoothScroll", "", "(Landroid/content/Context;I)V", "factor", "", "calculateDtToFit", "viewStart", "viewEnd", "boxStart", "boxEnd", "snapPreference", "calculateSpeedPerPixel", "displayMetrics", "Landroid/util/DisplayMetrics;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ProductLayoutManager.kt */
    public static abstract class SnapTopLinearSmoothScroller extends LinearSmoothScroller {
        private final float factor = 0.5f;
        private final int offsetSmoothScroll;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SnapTopLinearSmoothScroller(Context context, int i) {
            super(context);
            Intrinsics.checkNotNullParameter(context, "context");
            this.offsetSmoothScroll = i;
        }

        /* access modifiers changed from: protected */
        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            Intrinsics.checkNotNullParameter(displayMetrics, "displayMetrics");
            return super.calculateSpeedPerPixel(displayMetrics) * this.factor;
        }

        @Override // androidx.recyclerview.widget.LinearSmoothScroller
        public int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return (i3 - i) + this.offsetSmoothScroll;
        }
    }
}
