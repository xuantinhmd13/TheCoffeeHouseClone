package com.thecoffeehouse.guestapp.screens.stores;

import android.view.View;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/LoadMoreView;", "", "callback", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onLoadMore", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoadMoreView.kt */
public final class LoadMoreView {
    private final Function0<Unit> callback;

    public LoadMoreView(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "callback");
        this.callback = function0;
    }

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<LoadMoreView> {
        public LoadMoreViewBinder(LoadMoreView loadMoreView) {
            super(loadMoreView);
        }

        public void bindLoadMore(LoadMoreView loadMoreView) {
            loadMoreView.onLoadMore();
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<LoadMoreView, View> {
        /* access modifiers changed from: protected */
        public void bindClick(LoadMoreView loadMoreView, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(LoadMoreView loadMoreView, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(LoadMoreView loadMoreView, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(LoadMoreView loadMoreView, View view) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(LoadMoreView loadMoreView) {
        }

        public ViewBinder(LoadMoreView loadMoreView) {
            super(loadMoreView, R.layout.layout_load_more, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
            boolean isNullable = isNullable();
            if (loadMoreView != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<LoadMoreView, View> {
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
        public void bindClick(LoadMoreView loadMoreView, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(LoadMoreView loadMoreView) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(LoadMoreView loadMoreView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(LoadMoreView loadMoreView, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(LoadMoreView loadMoreView, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(LoadMoreView loadMoreView, View view) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(LoadMoreView loadMoreView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(LoadMoreView loadMoreView) {
            super(loadMoreView, R.layout.layout_load_more, false, false, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindToggle(LoadMoreView loadMoreView, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.LoadMoreView.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<LoadMoreView, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(LoadMoreView loadMoreView, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(LoadMoreView loadMoreView, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(LoadMoreView loadMoreView) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(LoadMoreView loadMoreView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(LoadMoreView loadMoreView) {
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
        public void bindViewPosition(LoadMoreView loadMoreView, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(LoadMoreView loadMoreView, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(LoadMoreView loadMoreView) {
        }

        public SwipeViewBinder(LoadMoreView loadMoreView) {
            super(loadMoreView, R.layout.layout_load_more, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
            boolean isNullable = isNullable();
            if (loadMoreView != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }

    public final void onLoadMore() {
        this.callback.invoke();
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<LoadMoreView, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(LoadMoreView loadMoreView, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(LoadMoreView loadMoreView, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(LoadMoreView loadMoreView) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(LoadMoreView loadMoreView) {
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
        public void bindSwipeOut(LoadMoreView loadMoreView) {
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
        public void bindViewPosition(LoadMoreView loadMoreView, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(LoadMoreView loadMoreView, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void resolveView(LoadMoreView loadMoreView) {
        }

        public DirectionalViewBinder(LoadMoreView loadMoreView) {
            super(loadMoreView, R.layout.layout_load_more, false);
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            LoadMoreView loadMoreView = (LoadMoreView) getResolver();
            boolean isNullable = isNullable();
            if (loadMoreView != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }
    }
}
