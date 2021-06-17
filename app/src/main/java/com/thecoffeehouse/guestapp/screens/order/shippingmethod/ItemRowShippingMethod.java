package com.thecoffeehouse.guestapp.screens.order.shippingmethod;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u00020\u000bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/ItemRowShippingMethod;", "", "activity", "Landroidx/fragment/app/FragmentActivity;", "onInitDone", "Lkotlin/Function0;", "", "(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V", "initDone", "", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowShippingMethod.kt */
public final class ItemRowShippingMethod {
    private final FragmentActivity activity;
    private boolean initDone;
    private final Function0<Unit> onInitDone;
    public View rootView;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowShippingMethod> {
        public void bindLoadMore(ItemRowShippingMethod itemRowShippingMethod) {
        }

        public LoadMoreViewBinder(ItemRowShippingMethod itemRowShippingMethod) {
            super(itemRowShippingMethod);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowShippingMethod, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowShippingMethod itemRowShippingMethod, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowShippingMethod itemRowShippingMethod, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowShippingMethod itemRowShippingMethod, int i) {
        }

        public ViewBinder(ItemRowShippingMethod itemRowShippingMethod) {
            super(itemRowShippingMethod, R.layout.layout_shipping_method, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowShippingMethod itemRowShippingMethod) {
            itemRowShippingMethod.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
            boolean isNullable = isNullable();
            if (itemRowShippingMethod != null && isNullable) {
                itemRowShippingMethod.rootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowShippingMethod itemRowShippingMethod, View view) {
            itemRowShippingMethod.rootView = view.findViewById(R.id.root_view_shipping_method);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowShippingMethod, View> {
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
        public void bindClick(ItemRowShippingMethod itemRowShippingMethod, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowShippingMethod itemRowShippingMethod) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowShippingMethod itemRowShippingMethod) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowShippingMethod itemRowShippingMethod, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowShippingMethod itemRowShippingMethod, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowShippingMethod itemRowShippingMethod) {
            super(itemRowShippingMethod, R.layout.layout_shipping_method, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowShippingMethod itemRowShippingMethod) {
            itemRowShippingMethod.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowShippingMethod itemRowShippingMethod, View view) {
            itemRowShippingMethod.rootView = view.findViewById(R.id.root_view_shipping_method);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowShippingMethod itemRowShippingMethod, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.ItemRowShippingMethod.ExpandableViewBinder.AnonymousClass1 */

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

    public ItemRowShippingMethod(FragmentActivity fragmentActivity, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(fragmentActivity, "activity");
        Intrinsics.checkNotNullParameter(function0, "onInitDone");
        this.activity = fragmentActivity;
        this.onInitDone = function0;
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowShippingMethod, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowShippingMethod itemRowShippingMethod, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowShippingMethod itemRowShippingMethod, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowShippingMethod itemRowShippingMethod) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowShippingMethod itemRowShippingMethod) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowShippingMethod itemRowShippingMethod) {
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
        public void bindViewPosition(ItemRowShippingMethod itemRowShippingMethod, int i) {
        }

        public SwipeViewBinder(ItemRowShippingMethod itemRowShippingMethod) {
            super(itemRowShippingMethod, R.layout.layout_shipping_method, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowShippingMethod itemRowShippingMethod) {
            itemRowShippingMethod.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
            boolean isNullable = isNullable();
            if (itemRowShippingMethod != null && isNullable) {
                itemRowShippingMethod.rootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowShippingMethod itemRowShippingMethod, SwipePlaceHolderView.FrameView frameView) {
            itemRowShippingMethod.rootView = frameView.findViewById(R.id.root_view_shipping_method);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowShippingMethod, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowShippingMethod itemRowShippingMethod, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowShippingMethod itemRowShippingMethod, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowShippingMethod itemRowShippingMethod) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowShippingMethod itemRowShippingMethod) {
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
        public void bindSwipeOut(ItemRowShippingMethod itemRowShippingMethod) {
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
        public void bindViewPosition(ItemRowShippingMethod itemRowShippingMethod, int i) {
        }

        public DirectionalViewBinder(ItemRowShippingMethod itemRowShippingMethod) {
            super(itemRowShippingMethod, R.layout.layout_shipping_method, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowShippingMethod itemRowShippingMethod) {
            itemRowShippingMethod.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowShippingMethod itemRowShippingMethod = (ItemRowShippingMethod) getResolver();
            boolean isNullable = isNullable();
            if (itemRowShippingMethod != null && isNullable) {
                itemRowShippingMethod.rootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowShippingMethod itemRowShippingMethod, SwipePlaceHolderView.FrameView frameView) {
            itemRowShippingMethod.rootView = frameView.findViewById(R.id.root_view_shipping_method);
        }
    }

    public final View getRootView() {
        View view = this.rootView;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return view;
    }

    public final void setRootView(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.rootView = view;
    }

    public final void onResolve() {
        if (!this.initDone) {
            this.onInitDone.invoke();
            this.initDone = true;
        }
    }
}
