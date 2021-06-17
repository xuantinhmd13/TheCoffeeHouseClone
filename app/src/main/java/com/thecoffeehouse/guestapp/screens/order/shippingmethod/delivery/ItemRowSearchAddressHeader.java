package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

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
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/ItemRowSearchAddressHeader;", "", "headerTitle", "", "onClickListener", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "txtVoucherHeader", "Landroid/widget/TextView;", "getTxtVoucherHeader", "()Landroid/widget/TextView;", "setTxtVoucherHeader", "(Landroid/widget/TextView;)V", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowCouponHeader.kt */
public final class ItemRowSearchAddressHeader {
    private final String headerTitle;
    private final Function0<Unit> onClickListener;
    public TextView txtVoucherHeader;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSearchAddressHeader> {
        public void bindLoadMore(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
        }

        public LoadMoreViewBinder(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            super(itemRowSearchAddressHeader);
        }
    }

    public ItemRowSearchAddressHeader(String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "headerTitle");
        Intrinsics.checkNotNullParameter(function0, "onClickListener");
        this.headerTitle = str;
        this.onClickListener = function0;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSearchAddressHeader, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchAddressHeader itemRowSearchAddressHeader, int i) {
        }

        public ViewBinder(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            super(itemRowSearchAddressHeader, R.layout.item_row_search_address_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            itemRowSearchAddressHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchAddressHeader != null && isNullable) {
                itemRowSearchAddressHeader.txtVoucherHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
            itemRowSearchAddressHeader.txtVoucherHeader = (TextView) view.findViewById(R.id.txtVoucherHeader);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSearchAddressHeader, View> {
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
        public void bindClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchAddressHeader itemRowSearchAddressHeader, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            super(itemRowSearchAddressHeader, R.layout.item_row_search_address_header, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            itemRowSearchAddressHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
            itemRowSearchAddressHeader.txtVoucherHeader = (TextView) view.findViewById(R.id.txtVoucherHeader);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSearchAddressHeader itemRowSearchAddressHeader, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchAddressHeader.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSearchAddressHeader, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
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
        public void bindViewPosition(ItemRowSearchAddressHeader itemRowSearchAddressHeader, int i) {
        }

        public SwipeViewBinder(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            super(itemRowSearchAddressHeader, R.layout.item_row_search_address_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            itemRowSearchAddressHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchAddressHeader != null && isNullable) {
                itemRowSearchAddressHeader.txtVoucherHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddressHeader itemRowSearchAddressHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchAddressHeader.txtVoucherHeader = (TextView) frameView.findViewById(R.id.txtVoucherHeader);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSearchAddressHeader, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddressHeader itemRowSearchAddressHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
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
        public void bindSwipeOut(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
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
        public void bindViewPosition(ItemRowSearchAddressHeader itemRowSearchAddressHeader, int i) {
        }

        public DirectionalViewBinder(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            super(itemRowSearchAddressHeader, R.layout.item_row_search_address_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddressHeader itemRowSearchAddressHeader) {
            itemRowSearchAddressHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = (ItemRowSearchAddressHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchAddressHeader != null && isNullable) {
                itemRowSearchAddressHeader.txtVoucherHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddressHeader itemRowSearchAddressHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchAddressHeader.txtVoucherHeader = (TextView) frameView.findViewById(R.id.txtVoucherHeader);
        }
    }

    public final TextView getTxtVoucherHeader() {
        TextView textView = this.txtVoucherHeader;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtVoucherHeader");
        }
        return textView;
    }

    public final void setTxtVoucherHeader(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtVoucherHeader = textView;
    }

    public final void onResolve() {
        TextView textView = this.txtVoucherHeader;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtVoucherHeader");
        }
        textView.setText(this.headerTitle);
    }
}
