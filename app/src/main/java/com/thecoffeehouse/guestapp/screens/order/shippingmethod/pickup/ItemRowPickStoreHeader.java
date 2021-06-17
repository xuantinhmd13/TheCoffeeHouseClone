package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLLinearLayout;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u001a\u001a\u00020\u001bR\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/ItemRowPickStoreHeader;", "", "drawableStart", "", "type", "", "(Ljava/lang/Integer;Ljava/lang/String;)V", "Ljava/lang/Integer;", "mImgIconHeader", "Landroid/widget/ImageView;", "getMImgIconHeader", "()Landroid/widget/ImageView;", "setMImgIconHeader", "(Landroid/widget/ImageView;)V", "mLayoutRoot", "Lcom/thecoffeehouse/guestapp/views/TLLinearLayout;", "getMLayoutRoot", "()Lcom/thecoffeehouse/guestapp/views/TLLinearLayout;", "setMLayoutRoot", "(Lcom/thecoffeehouse/guestapp/views/TLLinearLayout;)V", "mTxtHeader", "Landroid/widget/TextView;", "getMTxtHeader", "()Landroid/widget/TextView;", "setMTxtHeader", "(Landroid/widget/TextView;)V", "onResolve", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowPickStore.kt */
public final class ItemRowPickStoreHeader {
    private final Integer drawableStart;
    public ImageView mImgIconHeader;
    public TLLinearLayout mLayoutRoot;
    public TextView mTxtHeader;
    private final String type;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowPickStoreHeader> {
        public void bindLoadMore(ItemRowPickStoreHeader itemRowPickStoreHeader) {
        }

        public LoadMoreViewBinder(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            super(itemRowPickStoreHeader);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowPickStoreHeader, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowPickStoreHeader itemRowPickStoreHeader, int i) {
        }

        public ViewBinder(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            super(itemRowPickStoreHeader, R.layout.layout_header_store_type, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            itemRowPickStoreHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowPickStoreHeader != null && isNullable) {
                itemRowPickStoreHeader.mTxtHeader = null;
                itemRowPickStoreHeader.mLayoutRoot = null;
                itemRowPickStoreHeader.mImgIconHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
            itemRowPickStoreHeader.mTxtHeader = (TextView) view.findViewById(R.id.txt_header);
            itemRowPickStoreHeader.mLayoutRoot = (TLLinearLayout) view.findViewById(R.id.layout_root_header);
            itemRowPickStoreHeader.mImgIconHeader = (ImageView) view.findViewById(R.id.img_icon_header);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowPickStoreHeader, View> {
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
        public void bindClick(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowPickStoreHeader itemRowPickStoreHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowPickStoreHeader itemRowPickStoreHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowPickStoreHeader itemRowPickStoreHeader, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            super(itemRowPickStoreHeader, R.layout.layout_header_store_type, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            itemRowPickStoreHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
            itemRowPickStoreHeader.mTxtHeader = (TextView) view.findViewById(R.id.txt_header);
            itemRowPickStoreHeader.mLayoutRoot = (TLLinearLayout) view.findViewById(R.id.layout_root_header);
            itemRowPickStoreHeader.mImgIconHeader = (ImageView) view.findViewById(R.id.img_icon_header);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowPickStoreHeader itemRowPickStoreHeader, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStoreHeader.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowPickStoreHeader, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowPickStoreHeader itemRowPickStoreHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStoreHeader itemRowPickStoreHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowPickStoreHeader itemRowPickStoreHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowPickStoreHeader itemRowPickStoreHeader) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowPickStoreHeader itemRowPickStoreHeader) {
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
        public void bindViewPosition(ItemRowPickStoreHeader itemRowPickStoreHeader, int i) {
        }

        public SwipeViewBinder(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            super(itemRowPickStoreHeader, R.layout.layout_header_store_type, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            itemRowPickStoreHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowPickStoreHeader != null && isNullable) {
                itemRowPickStoreHeader.mTxtHeader = null;
                itemRowPickStoreHeader.mLayoutRoot = null;
                itemRowPickStoreHeader.mImgIconHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStoreHeader itemRowPickStoreHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowPickStoreHeader.mTxtHeader = (TextView) frameView.findViewById(R.id.txt_header);
            itemRowPickStoreHeader.mLayoutRoot = (TLLinearLayout) frameView.findViewById(R.id.layout_root_header);
            itemRowPickStoreHeader.mImgIconHeader = (ImageView) frameView.findViewById(R.id.img_icon_header);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowPickStoreHeader, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowPickStoreHeader itemRowPickStoreHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStoreHeader itemRowPickStoreHeader, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowPickStoreHeader itemRowPickStoreHeader) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowPickStoreHeader itemRowPickStoreHeader) {
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
        public void bindSwipeOut(ItemRowPickStoreHeader itemRowPickStoreHeader) {
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
        public void bindViewPosition(ItemRowPickStoreHeader itemRowPickStoreHeader, int i) {
        }

        public DirectionalViewBinder(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            super(itemRowPickStoreHeader, R.layout.layout_header_store_type, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStoreHeader itemRowPickStoreHeader) {
            itemRowPickStoreHeader.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowPickStoreHeader itemRowPickStoreHeader = (ItemRowPickStoreHeader) getResolver();
            boolean isNullable = isNullable();
            if (itemRowPickStoreHeader != null && isNullable) {
                itemRowPickStoreHeader.mTxtHeader = null;
                itemRowPickStoreHeader.mLayoutRoot = null;
                itemRowPickStoreHeader.mImgIconHeader = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStoreHeader itemRowPickStoreHeader, SwipePlaceHolderView.FrameView frameView) {
            itemRowPickStoreHeader.mTxtHeader = (TextView) frameView.findViewById(R.id.txt_header);
            itemRowPickStoreHeader.mLayoutRoot = (TLLinearLayout) frameView.findViewById(R.id.layout_root_header);
            itemRowPickStoreHeader.mImgIconHeader = (ImageView) frameView.findViewById(R.id.img_icon_header);
        }
    }

    public ItemRowPickStoreHeader(Integer num, String str) {
        Intrinsics.checkNotNullParameter(str, "type");
        this.drawableStart = num;
        this.type = str;
    }

    public final TextView getMTxtHeader() {
        TextView textView = this.mTxtHeader;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtHeader");
        }
        return textView;
    }

    public final void setMTxtHeader(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtHeader = textView;
    }

    public final TLLinearLayout getMLayoutRoot() {
        TLLinearLayout tLLinearLayout = this.mLayoutRoot;
        if (tLLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRoot");
        }
        return tLLinearLayout;
    }

    public final void setMLayoutRoot(TLLinearLayout tLLinearLayout) {
        Intrinsics.checkNotNullParameter(tLLinearLayout, "<set-?>");
        this.mLayoutRoot = tLLinearLayout;
    }

    public final ImageView getMImgIconHeader() {
        ImageView imageView = this.mImgIconHeader;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgIconHeader");
        }
        return imageView;
    }

    public final void setMImgIconHeader(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mImgIconHeader = imageView;
    }

    public final void onResolve() {
        TextView textView = this.mTxtHeader;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtHeader");
        }
        textView.setEnabled(false);
        TextView textView2 = this.mTxtHeader;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtHeader");
        }
        textView2.setText(this.type);
        TLLinearLayout tLLinearLayout = this.mLayoutRoot;
        if (tLLinearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRoot");
        }
        ViewExtsKt.marginBottom(tLLinearLayout, ViewExtsKt.DPtoPX(8.0f));
        TLLinearLayout tLLinearLayout2 = this.mLayoutRoot;
        if (tLLinearLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRoot");
        }
        ViewExtsKt.marginTop(tLLinearLayout2, ViewExtsKt.DPtoPX(8.0f));
        Integer num = this.drawableStart;
        if (num != null) {
            num.intValue();
            ImageView imageView = this.mImgIconHeader;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mImgIconHeader");
            }
            ViewExtsKt.setDrawable(imageView, this.drawableStart.intValue());
        }
    }
}
