package com.thecoffeehouse.guestapp.screens.rewards.coupons;

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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/ItemRowAddCoupon;", "", "onClickListener", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowAddCoupon.kt */
public final class ItemRowAddCoupon {
    private final Function0<Unit> onClickListener;

    public final void onResolve() {
    }

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowAddCoupon> {
        public void bindLoadMore(ItemRowAddCoupon itemRowAddCoupon) {
        }

        public LoadMoreViewBinder(ItemRowAddCoupon itemRowAddCoupon) {
            super(itemRowAddCoupon);
        }
    }

    public ItemRowAddCoupon(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onClickListener");
        this.onClickListener = function0;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowAddCoupon, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddCoupon itemRowAddCoupon, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAddCoupon itemRowAddCoupon, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddCoupon itemRowAddCoupon, View view) {
        }

        public ViewBinder(ItemRowAddCoupon itemRowAddCoupon) {
            super(itemRowAddCoupon, R.layout.layout_add_coupon, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddCoupon itemRowAddCoupon) {
            itemRowAddCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAddCoupon != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddCoupon itemRowAddCoupon, View view) {
            view.findViewById(R.id.layout_add_coupon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowAddCoupon.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddCoupon.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowAddCoupon, View> {
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
        public void bindCollapse(ItemRowAddCoupon itemRowAddCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowAddCoupon itemRowAddCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddCoupon itemRowAddCoupon, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAddCoupon itemRowAddCoupon, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddCoupon itemRowAddCoupon, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowAddCoupon itemRowAddCoupon) {
            super(itemRowAddCoupon, R.layout.layout_add_coupon, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddCoupon itemRowAddCoupon) {
            itemRowAddCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddCoupon itemRowAddCoupon, View view) {
            view.findViewById(R.id.layout_add_coupon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowAddCoupon.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddCoupon.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowAddCoupon itemRowAddCoupon, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowAddCoupon.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowAddCoupon, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddCoupon itemRowAddCoupon, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAddCoupon itemRowAddCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAddCoupon itemRowAddCoupon) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowAddCoupon itemRowAddCoupon) {
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
        public void bindViewPosition(ItemRowAddCoupon itemRowAddCoupon, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddCoupon itemRowAddCoupon, SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowAddCoupon itemRowAddCoupon) {
            super(itemRowAddCoupon, R.layout.layout_add_coupon, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddCoupon itemRowAddCoupon) {
            itemRowAddCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAddCoupon != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddCoupon itemRowAddCoupon, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_add_coupon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowAddCoupon.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddCoupon.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowAddCoupon, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddCoupon itemRowAddCoupon, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAddCoupon itemRowAddCoupon) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAddCoupon itemRowAddCoupon) {
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
        public void bindSwipeOut(ItemRowAddCoupon itemRowAddCoupon) {
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
        public void bindViewPosition(ItemRowAddCoupon itemRowAddCoupon, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddCoupon itemRowAddCoupon, SwipePlaceHolderView.FrameView frameView) {
        }

        public DirectionalViewBinder(ItemRowAddCoupon itemRowAddCoupon) {
            super(itemRowAddCoupon, R.layout.layout_add_coupon, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddCoupon itemRowAddCoupon) {
            itemRowAddCoupon.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAddCoupon itemRowAddCoupon = (ItemRowAddCoupon) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAddCoupon != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddCoupon itemRowAddCoupon, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_add_coupon).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowAddCoupon.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddCoupon.onClick();
                }
            });
        }
    }

    public final void onClick() {
        this.onClickListener.invoke();
    }
}
