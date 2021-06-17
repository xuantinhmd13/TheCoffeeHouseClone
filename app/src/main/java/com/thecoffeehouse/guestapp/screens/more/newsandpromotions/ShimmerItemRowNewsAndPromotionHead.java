package com.thecoffeehouse.guestapp.screens.more.newsandpromotions;

import android.view.View;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/ShimmerItemRowNewsAndPromotionHead;", "", "()V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ShimmerItemRowNewsAndPromotionHead.kt */
public final class ShimmerItemRowNewsAndPromotionHead {

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ShimmerItemRowNewsAndPromotionHead> {
        public void bindLoadMore(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        public LoadMoreViewBinder(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
            super(shimmerItemRowNewsAndPromotionHead);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ShimmerItemRowNewsAndPromotionHead, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        public ViewBinder(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
            super(shimmerItemRowNewsAndPromotionHead, R.layout.item_row_shimmer_news_and_promotions_head, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
            boolean isNullable = isNullable();
            if (shimmerItemRowNewsAndPromotionHead != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ShimmerItemRowNewsAndPromotionHead, View> {
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
        public void bindClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
            super(shimmerItemRowNewsAndPromotionHead, R.layout.item_row_shimmer_news_and_promotions_head, false, false, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ShimmerItemRowNewsAndPromotionHead.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ShimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
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
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        public SwipeViewBinder(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
            super(shimmerItemRowNewsAndPromotionHead, R.layout.item_row_shimmer_news_and_promotions_head, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
            boolean isNullable = isNullable();
            if (shimmerItemRowNewsAndPromotionHead != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ShimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
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
        public void bindSwipeOut(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
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
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
        }

        public DirectionalViewBinder(ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead) {
            super(shimmerItemRowNewsAndPromotionHead, R.layout.item_row_shimmer_news_and_promotions_head, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ShimmerItemRowNewsAndPromotionHead shimmerItemRowNewsAndPromotionHead = (ShimmerItemRowNewsAndPromotionHead) getResolver();
            boolean isNullable = isNullable();
            if (shimmerItemRowNewsAndPromotionHead != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }
}
