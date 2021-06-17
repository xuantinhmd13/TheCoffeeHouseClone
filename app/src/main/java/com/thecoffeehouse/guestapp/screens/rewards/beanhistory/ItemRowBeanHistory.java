package com.thecoffeehouse.guestapp.screens.rewards.beanhistory;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.membership.BeanHistory;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/beanhistory/ItemRowBeanHistory;", "", "beanHistory", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/BeanHistory;", "(Lcom/thecoffeehouse/guestapp/services/api/model/membership/BeanHistory;)V", "mRootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMRootView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMRootView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "onResolve", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowBeanHistory.kt */
public final class ItemRowBeanHistory {
    private final BeanHistory beanHistory;
    public ConstraintLayout mRootView;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowBeanHistory> {
        public void bindLoadMore(ItemRowBeanHistory itemRowBeanHistory) {
        }

        public LoadMoreViewBinder(ItemRowBeanHistory itemRowBeanHistory) {
            super(itemRowBeanHistory);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowBeanHistory, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowBeanHistory itemRowBeanHistory, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBeanHistory itemRowBeanHistory, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowBeanHistory itemRowBeanHistory, int i) {
        }

        public ViewBinder(ItemRowBeanHistory itemRowBeanHistory) {
            super(itemRowBeanHistory, R.layout.item_row_order_history, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBeanHistory itemRowBeanHistory) {
            itemRowBeanHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
            boolean isNullable = isNullable();
            if (itemRowBeanHistory != null && isNullable) {
                itemRowBeanHistory.mRootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBeanHistory itemRowBeanHistory, View view) {
            itemRowBeanHistory.mRootView = (ConstraintLayout) view.findViewById(R.id.layout_root_order_history);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowBeanHistory, View> {
        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void bindAnimation(int i, int i2, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindChildPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindClick(ItemRowBeanHistory itemRowBeanHistory, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBeanHistory itemRowBeanHistory, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowBeanHistory itemRowBeanHistory, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowBeanHistory itemRowBeanHistory) {
            super(itemRowBeanHistory, R.layout.item_row_order_history, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBeanHistory itemRowBeanHistory) {
            itemRowBeanHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBeanHistory itemRowBeanHistory, View view) {
            itemRowBeanHistory.mRootView = (ConstraintLayout) view.findViewById(R.id.layout_root_order_history);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowBeanHistory itemRowBeanHistory, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.beanhistory.ItemRowBeanHistory.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    if (ExpandableViewBinder.this.isExpanded()) {
                        ExpandableViewBinder.this.collapse();
                    } else {
                        ExpandableViewBinder.this.expand();
                    }
                }
            });
        }
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowBeanHistory, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowBeanHistory itemRowBeanHistory, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBeanHistory itemRowBeanHistory, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowBeanHistory itemRowBeanHistory, int i) {
        }

        public SwipeViewBinder(ItemRowBeanHistory itemRowBeanHistory) {
            super(itemRowBeanHistory, R.layout.item_row_order_history, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBeanHistory itemRowBeanHistory) {
            itemRowBeanHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
            boolean isNullable = isNullable();
            if (itemRowBeanHistory != null && isNullable) {
                itemRowBeanHistory.mRootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBeanHistory itemRowBeanHistory, SwipePlaceHolderView.FrameView frameView) {
            itemRowBeanHistory.mRootView = (ConstraintLayout) frameView.findViewById(R.id.layout_root_order_history);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowBeanHistory, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowBeanHistory itemRowBeanHistory, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBeanHistory itemRowBeanHistory, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeInDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowBeanHistory itemRowBeanHistory) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeOutDirectional(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipeTouch(float f, float f2, float f3, float f4) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeDirectionalViewBinder
        public void bindSwipingDirection(SwipeDirection swipeDirection) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowBeanHistory itemRowBeanHistory, int i) {
        }

        public DirectionalViewBinder(ItemRowBeanHistory itemRowBeanHistory) {
            super(itemRowBeanHistory, R.layout.item_row_order_history, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBeanHistory itemRowBeanHistory) {
            itemRowBeanHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowBeanHistory itemRowBeanHistory = (ItemRowBeanHistory) getResolver();
            boolean isNullable = isNullable();
            if (itemRowBeanHistory != null && isNullable) {
                itemRowBeanHistory.mRootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBeanHistory itemRowBeanHistory, SwipePlaceHolderView.FrameView frameView) {
            itemRowBeanHistory.mRootView = (ConstraintLayout) frameView.findViewById(R.id.layout_root_order_history);
        }
    }

    public ItemRowBeanHistory(BeanHistory beanHistory2) {
        Intrinsics.checkNotNullParameter(beanHistory2, "beanHistory");
        this.beanHistory = beanHistory2;
    }

    public final ConstraintLayout getMRootView() {
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return constraintLayout;
    }

    public final void setMRootView(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.mRootView = constraintLayout;
    }

    public final void onResolve() {
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_ref_order);
        Intrinsics.checkNotNullExpressionValue(textView, "mRootView.txt_ref_order");
        textView.setText(RewardExtsKt.convertSecondToTimeFormat(this.beanHistory.getTime(), StringDateUtilsKt.DF_hh_mm_dd_MM_yyyy));
        ConstraintLayout constraintLayout2 = this.mRootView;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView2, "mRootView.txt_order_items");
        textView2.setText(this.beanHistory.getTitle());
        ConstraintLayout constraintLayout3 = this.mRootView;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView3 = (TextView) constraintLayout3.findViewById(R.id.txt_order_price);
        Intrinsics.checkNotNullExpressionValue(textView3, "mRootView.txt_order_price");
        ViewExtsKt.formatHtmlCompact(textView3, this.beanHistory.getValueStr());
        ConstraintLayout constraintLayout4 = this.mRootView;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView4 = (TextView) constraintLayout4.findViewById(R.id.txt_order_time);
        Intrinsics.checkNotNullExpressionValue(textView4, "mRootView.txt_order_time");
        textView4.setVisibility(8);
    }
}
