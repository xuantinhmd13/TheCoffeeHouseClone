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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/ShimmerItemRowNewsAndPromotionBody;", "", "()V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ShimmerItemRowNewsAndPromotionBody.kt */
public final class ShimmerItemRowNewsAndPromotionBody {

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ShimmerItemRowNewsAndPromotionBody> {
        public void bindLoadMore(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        public LoadMoreViewBinder(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
            super(shimmerItemRowNewsAndPromotionBody);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ShimmerItemRowNewsAndPromotionBody, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        public ViewBinder(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
            super(shimmerItemRowNewsAndPromotionBody, R.layout.item_row_shimmer_news_and_promotions_body, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
            boolean isNullable = isNullable();
            if (shimmerItemRowNewsAndPromotionBody != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ShimmerItemRowNewsAndPromotionBody, View> {
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
        public void bindClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
            super(shimmerItemRowNewsAndPromotionBody, R.layout.item_row_shimmer_news_and_promotions_body, false, false, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.newsandpromotions.ShimmerItemRowNewsAndPromotionBody.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ShimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
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
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        public SwipeViewBinder(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
            super(shimmerItemRowNewsAndPromotionBody, R.layout.item_row_shimmer_news_and_promotions_body, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
            boolean isNullable = isNullable();
            if (shimmerItemRowNewsAndPromotionBody != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ShimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
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
        public void bindSwipeOut(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
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
        public void bindViewPosition(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
        }

        public DirectionalViewBinder(ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody) {
            super(shimmerItemRowNewsAndPromotionBody, R.layout.item_row_shimmer_news_and_promotions_body, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ShimmerItemRowNewsAndPromotionBody shimmerItemRowNewsAndPromotionBody = (ShimmerItemRowNewsAndPromotionBody) getResolver();
            boolean isNullable = isNullable();
            if (shimmerItemRowNewsAndPromotionBody != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }
}
