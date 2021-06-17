package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u000b\u001a\u00020\fR\u001a\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/ItemRowRecentOrderHeader;", "", "title", "", "(Ljava/lang/String;)V", "layoutRoot", "Landroid/widget/LinearLayout;", "getLayoutRoot", "()Landroid/widget/LinearLayout;", "setLayoutRoot", "(Landroid/widget/LinearLayout;)V", "onResolve", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RecentOrdersRow.kt */
public final class ItemRowRecentOrderHeader {
    public LinearLayout layoutRoot;
    private final String title;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowRecentOrderHeader> {
        public void bindLoadMore(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
        }

        public LoadMoreViewBinder(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            super(itemRowRecentOrderHeader);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowRecentOrderHeader, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowRecentOrderHeader itemRowRecentOrderHeader, int i) {
        }

        public ViewBinder(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            super(itemRowRecentOrderHeader, R.layout.layout_option_product_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            itemRowRecentOrderHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentOrderHeader != null && isNullable) {
                itemRowRecentOrderHeader.layoutRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
            itemRowRecentOrderHeader.layoutRoot = (LinearLayout) view.findViewById(R.id.layout_selection);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowRecentOrderHeader, View> {
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
        public void bindClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowRecentOrderHeader itemRowRecentOrderHeader, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            super(itemRowRecentOrderHeader, R.layout.layout_option_product_header, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            itemRowRecentOrderHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
            itemRowRecentOrderHeader.layoutRoot = (LinearLayout) view.findViewById(R.id.layout_selection);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowRecentOrderHeader itemRowRecentOrderHeader, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowRecentOrderHeader.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowRecentOrderHeader, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
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
        public void bindViewPosition(ItemRowRecentOrderHeader itemRowRecentOrderHeader, int i) {
        }

        public SwipeViewBinder(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            super(itemRowRecentOrderHeader, R.layout.layout_option_product_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            itemRowRecentOrderHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentOrderHeader != null && isNullable) {
                itemRowRecentOrderHeader.layoutRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentOrderHeader itemRowRecentOrderHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowRecentOrderHeader.layoutRoot = (LinearLayout) frameView.findViewById(R.id.layout_selection);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowRecentOrderHeader, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentOrderHeader itemRowRecentOrderHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
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
        public void bindSwipeOut(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
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
        public void bindViewPosition(ItemRowRecentOrderHeader itemRowRecentOrderHeader, int i) {
        }

        public DirectionalViewBinder(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            super(itemRowRecentOrderHeader, R.layout.layout_option_product_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentOrderHeader itemRowRecentOrderHeader) {
            itemRowRecentOrderHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentOrderHeader itemRowRecentOrderHeader = (ItemRowRecentOrderHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentOrderHeader != null && isNullable) {
                itemRowRecentOrderHeader.layoutRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentOrderHeader itemRowRecentOrderHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowRecentOrderHeader.layoutRoot = (LinearLayout) frameView.findViewById(R.id.layout_selection);
        }
    }

    public ItemRowRecentOrderHeader(String str) {
        Intrinsics.checkNotNullParameter(str, "title");
        this.title = str;
    }

    public final LinearLayout getLayoutRoot() {
        LinearLayout linearLayout = this.layoutRoot;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        return linearLayout;
    }

    public final void setLayoutRoot(LinearLayout linearLayout) {
        Intrinsics.checkNotNullParameter(linearLayout, "<set-?>");
        this.layoutRoot = linearLayout;
    }

    public final void onResolve() {
        LinearLayout linearLayout = this.layoutRoot;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        ViewExtsKt.marginTop(linearLayout, ViewExtsKt.DPtoPX(16.0f));
        LinearLayout linearLayout2 = this.layoutRoot;
        if (linearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        TextView textView = (TextView) linearLayout2.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutRoot.txt_option_name");
        textView.setText(this.title);
        LinearLayout linearLayout3 = this.layoutRoot;
        if (linearLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        TextView textView2 = (TextView) linearLayout3.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutRoot.txt_option_desc");
        textView2.setVisibility(8);
        LinearLayout linearLayout4 = this.layoutRoot;
        if (linearLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        TLTextView tLTextView = (TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutRoot.txt_option_must_have");
        tLTextView.setVisibility(8);
    }
}
