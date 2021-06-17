package com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers;

import android.view.View;
import android.widget.TextView;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\t\u001a\u00020\nR\u001a\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/ItemRowRecentActivityHeader;", "", "()V", "txtActivityHeader", "Landroid/widget/TextView;", "getTxtActivityHeader", "()Landroid/widget/TextView;", "setTxtActivityHeader", "(Landroid/widget/TextView;)V", "onResolve", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowRecentActivityHeader.kt */
public final class ItemRowRecentActivityHeader {
    public TextView txtActivityHeader;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowRecentActivityHeader> {
        public void bindLoadMore(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
        }

        public LoadMoreViewBinder(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            super(itemRowRecentActivityHeader);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowRecentActivityHeader, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowRecentActivityHeader itemRowRecentActivityHeader, int i) {
        }

        public ViewBinder(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            super(itemRowRecentActivityHeader, R.layout.item_row_recent_activity_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            itemRowRecentActivityHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentActivityHeader != null && isNullable) {
                itemRowRecentActivityHeader.txtActivityHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
            itemRowRecentActivityHeader.txtActivityHeader = (TextView) view.findViewById(R.id.txtActivityHeader);
        }
    }

    public final TextView getTxtActivityHeader() {
        TextView textView = this.txtActivityHeader;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityHeader");
        }
        return textView;
    }

    public final void setTxtActivityHeader(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtActivityHeader = textView;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowRecentActivityHeader, View> {
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
        public void bindClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowRecentActivityHeader itemRowRecentActivityHeader, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            super(itemRowRecentActivityHeader, R.layout.item_row_recent_activity_header, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            itemRowRecentActivityHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
            itemRowRecentActivityHeader.txtActivityHeader = (TextView) view.findViewById(R.id.txtActivityHeader);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowRecentActivityHeader itemRowRecentActivityHeader, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers.ItemRowRecentActivityHeader.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowRecentActivityHeader, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
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
        public void bindViewPosition(ItemRowRecentActivityHeader itemRowRecentActivityHeader, int i) {
        }

        public SwipeViewBinder(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            super(itemRowRecentActivityHeader, R.layout.item_row_recent_activity_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            itemRowRecentActivityHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentActivityHeader != null && isNullable) {
                itemRowRecentActivityHeader.txtActivityHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivityHeader itemRowRecentActivityHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowRecentActivityHeader.txtActivityHeader = (TextView) frameView.findViewById(R.id.txtActivityHeader);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowRecentActivityHeader, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivityHeader itemRowRecentActivityHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
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
        public void bindSwipeOut(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
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
        public void bindViewPosition(ItemRowRecentActivityHeader itemRowRecentActivityHeader, int i) {
        }

        public DirectionalViewBinder(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            super(itemRowRecentActivityHeader, R.layout.item_row_recent_activity_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivityHeader itemRowRecentActivityHeader) {
            itemRowRecentActivityHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentActivityHeader itemRowRecentActivityHeader = (ItemRowRecentActivityHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentActivityHeader != null && isNullable) {
                itemRowRecentActivityHeader.txtActivityHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivityHeader itemRowRecentActivityHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowRecentActivityHeader.txtActivityHeader = (TextView) frameView.findViewById(R.id.txtActivityHeader);
        }
    }

    public final void onResolve() {
        TextView textView = this.txtActivityHeader;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityHeader");
        }
        TextView textView2 = this.txtActivityHeader;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityHeader");
        }
        textView.setText(textView2.getContext().getString(R.string.str_recent_activities));
    }
}
