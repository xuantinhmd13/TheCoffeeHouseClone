package com.thecoffeehouse.guestapp.screens.rewards.coupons;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000e\u001a\u00020\u0006R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/ItemRowCouponHeader;", "", "voucherType", "", "onClickListener", "Lkotlin/Function0;", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "txtVoucherHeader", "Landroid/widget/TextView;", "getTxtVoucherHeader", "()Landroid/widget/TextView;", "setTxtVoucherHeader", "(Landroid/widget/TextView;)V", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowCouponHeader.kt */
public final class ItemRowCouponHeader {
    private final Function0<Unit> onClickListener;
    public TextView txtVoucherHeader;
    private final String voucherType;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowCouponHeader> {
        public void bindLoadMore(ItemRowCouponHeader itemRowCouponHeader) {
        }

        public LoadMoreViewBinder(ItemRowCouponHeader itemRowCouponHeader) {
            super(itemRowCouponHeader);
        }
    }

    public ItemRowCouponHeader(String str, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "voucherType");
        Intrinsics.checkNotNullParameter(function0, "onClickListener");
        this.voucherType = str;
        this.onClickListener = function0;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowCouponHeader, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowCouponHeader itemRowCouponHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCouponHeader itemRowCouponHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowCouponHeader itemRowCouponHeader, int i) {
        }

        public ViewBinder(ItemRowCouponHeader itemRowCouponHeader) {
            super(itemRowCouponHeader, R.layout.item_row_voucher_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCouponHeader itemRowCouponHeader) {
            itemRowCouponHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowCouponHeader != null && isNullable) {
                itemRowCouponHeader.txtVoucherHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCouponHeader itemRowCouponHeader, View view) {
            itemRowCouponHeader.txtVoucherHeader = (TextView) view.findViewById(R.id.txtVoucherHeader);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowCouponHeader, View> {
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
        public void bindClick(ItemRowCouponHeader itemRowCouponHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowCouponHeader itemRowCouponHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowCouponHeader itemRowCouponHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCouponHeader itemRowCouponHeader, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowCouponHeader itemRowCouponHeader, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowCouponHeader itemRowCouponHeader) {
            super(itemRowCouponHeader, R.layout.item_row_voucher_header, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCouponHeader itemRowCouponHeader) {
            itemRowCouponHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCouponHeader itemRowCouponHeader, View view) {
            itemRowCouponHeader.txtVoucherHeader = (TextView) view.findViewById(R.id.txtVoucherHeader);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowCouponHeader itemRowCouponHeader, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCouponHeader.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowCouponHeader, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowCouponHeader itemRowCouponHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCouponHeader itemRowCouponHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowCouponHeader itemRowCouponHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowCouponHeader itemRowCouponHeader) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowCouponHeader itemRowCouponHeader) {
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
        public void bindViewPosition(ItemRowCouponHeader itemRowCouponHeader, int i) {
        }

        public SwipeViewBinder(ItemRowCouponHeader itemRowCouponHeader) {
            super(itemRowCouponHeader, R.layout.item_row_voucher_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCouponHeader itemRowCouponHeader) {
            itemRowCouponHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowCouponHeader != null && isNullable) {
                itemRowCouponHeader.txtVoucherHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCouponHeader itemRowCouponHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowCouponHeader.txtVoucherHeader = (TextView) frameView.findViewById(R.id.txtVoucherHeader);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowCouponHeader, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowCouponHeader itemRowCouponHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowCouponHeader itemRowCouponHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowCouponHeader itemRowCouponHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowCouponHeader itemRowCouponHeader) {
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
        public void bindSwipeOut(ItemRowCouponHeader itemRowCouponHeader) {
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
        public void bindViewPosition(ItemRowCouponHeader itemRowCouponHeader, int i) {
        }

        public DirectionalViewBinder(ItemRowCouponHeader itemRowCouponHeader) {
            super(itemRowCouponHeader, R.layout.item_row_voucher_header, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowCouponHeader itemRowCouponHeader) {
            itemRowCouponHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowCouponHeader itemRowCouponHeader = (ItemRowCouponHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowCouponHeader != null && isNullable) {
                itemRowCouponHeader.txtVoucherHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowCouponHeader itemRowCouponHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowCouponHeader.txtVoucherHeader = (TextView) frameView.findViewById(R.id.txtVoucherHeader);
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
        textView.setText(this.voucherType);
    }
}
