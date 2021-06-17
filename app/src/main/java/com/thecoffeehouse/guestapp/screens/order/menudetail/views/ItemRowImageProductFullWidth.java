package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/ItemRowImageProductFullWidth;", "", "any", "(Ljava/lang/Object;)V", "imgImage", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgImage", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgImage", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "mPosition", "", "onResolve", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowImageProduct.kt */
public final class ItemRowImageProductFullWidth {
    private final Object any;
    public TLImageView imgImage;
    public int mPosition;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowImageProductFullWidth> {
        public void bindLoadMore(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        public LoadMoreViewBinder(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            super(itemRowImageProductFullWidth);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowImageProductFullWidth, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
        }

        public ViewBinder(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            super(itemRowImageProductFullWidth, R.layout.item_row_image_product_full_width, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            itemRowImageProductFullWidth.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
            boolean isNullable = isNullable();
            if (itemRowImageProductFullWidth != null && isNullable) {
                itemRowImageProductFullWidth.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageProductFullWidth itemRowImageProductFullWidth, int i) {
            itemRowImageProductFullWidth.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
            itemRowImageProductFullWidth.imgImage = (TLImageView) view.findViewById(R.id.imgImage);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowImageProductFullWidth, View> {
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
        public void bindClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            super(itemRowImageProductFullWidth, R.layout.item_row_image_product_full_width, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            itemRowImageProductFullWidth.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageProductFullWidth itemRowImageProductFullWidth, int i) {
            itemRowImageProductFullWidth.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
            itemRowImageProductFullWidth.imgImage = (TLImageView) view.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowImageProductFullWidth itemRowImageProductFullWidth, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.ItemRowImageProductFullWidth.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowImageProductFullWidth, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            super(itemRowImageProductFullWidth, R.layout.item_row_image_product_full_width, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            itemRowImageProductFullWidth.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
            boolean isNullable = isNullable();
            if (itemRowImageProductFullWidth != null && isNullable) {
                itemRowImageProductFullWidth.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageProductFullWidth itemRowImageProductFullWidth, int i) {
            itemRowImageProductFullWidth.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageProductFullWidth itemRowImageProductFullWidth, SwipePlaceHolderView.FrameView frameView) {
            itemRowImageProductFullWidth.imgImage = (TLImageView) frameView.findViewById(R.id.imgImage);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowImageProductFullWidth, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageProductFullWidth itemRowImageProductFullWidth, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
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
        public void bindSwipeOut(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
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

        public DirectionalViewBinder(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            super(itemRowImageProductFullWidth, R.layout.item_row_image_product_full_width, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageProductFullWidth itemRowImageProductFullWidth) {
            itemRowImageProductFullWidth.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowImageProductFullWidth itemRowImageProductFullWidth = (ItemRowImageProductFullWidth) getResolver();
            boolean isNullable = isNullable();
            if (itemRowImageProductFullWidth != null && isNullable) {
                itemRowImageProductFullWidth.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageProductFullWidth itemRowImageProductFullWidth, int i) {
            itemRowImageProductFullWidth.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageProductFullWidth itemRowImageProductFullWidth, SwipePlaceHolderView.FrameView frameView) {
            itemRowImageProductFullWidth.imgImage = (TLImageView) frameView.findViewById(R.id.imgImage);
        }
    }

    public ItemRowImageProductFullWidth(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "any");
        this.any = obj;
    }

    public final TLImageView getImgImage() {
        TLImageView tLImageView = this.imgImage;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        return tLImageView;
    }

    public final void setImgImage(TLImageView tLImageView) {
        Intrinsics.checkNotNullParameter(tLImageView, "<set-?>");
        this.imgImage = tLImageView;
    }

    public final void onResolve() {
        TLImageView tLImageView = this.imgImage;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        RequestBuilder<Drawable> transition = Glide.with(tLImageView.getContext()).load(this.any).transition(DrawableTransitionOptions.withCrossFade());
        TLImageView tLImageView2 = this.imgImage;
        if (tLImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        transition.into(tLImageView2);
    }
}
