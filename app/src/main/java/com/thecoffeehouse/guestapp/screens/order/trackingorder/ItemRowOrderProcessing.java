package com.thecoffeehouse.guestapp.screens.order.trackingorder;

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
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u0018\u001a\u00020\u0006R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/ItemRowOrderProcessing;", "", "orderProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "onClickListener", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;Lkotlin/jvm/functions/Function1;)V", "layoutRoot", "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderStatusView;", "getLayoutRoot", "()Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderStatusView;", "setLayoutRoot", "(Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderStatusView;)V", "txtOrderItems", "Landroid/widget/TextView;", "getTxtOrderItems", "()Landroid/widget/TextView;", "setTxtOrderItems", "(Landroid/widget/TextView;)V", "txtRefOrder", "getTxtRefOrder", "setTxtRefOrder", "onClickOrder", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RecentOrdersRow.kt */
public final class ItemRowOrderProcessing {
    public TrackingOrderStatusView layoutRoot;
    private final Function1<OrderProcessing, Unit> onClickListener;
    private final OrderProcessing orderProcessing;
    public TextView txtOrderItems;
    public TextView txtRefOrder;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowOrderProcessing> {
        public void bindLoadMore(ItemRowOrderProcessing itemRowOrderProcessing) {
        }

        public LoadMoreViewBinder(ItemRowOrderProcessing itemRowOrderProcessing) {
            super(itemRowOrderProcessing);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowOrderProcessing, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderProcessing itemRowOrderProcessing, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOrderProcessing itemRowOrderProcessing, int i) {
        }

        public ViewBinder(ItemRowOrderProcessing itemRowOrderProcessing) {
            super(itemRowOrderProcessing, R.layout.item_row_order_processing, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderProcessing itemRowOrderProcessing) {
            itemRowOrderProcessing.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOrderProcessing != null && isNullable) {
                itemRowOrderProcessing.layoutRoot = null;
                itemRowOrderProcessing.txtRefOrder = null;
                itemRowOrderProcessing.txtOrderItems = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderProcessing itemRowOrderProcessing, View view) {
            itemRowOrderProcessing.layoutRoot = (TrackingOrderStatusView) view.findViewById(R.id.layout_tracking_order_info);
            itemRowOrderProcessing.txtRefOrder = (TextView) view.findViewById(R.id.txt_ref_order);
            itemRowOrderProcessing.txtOrderItems = (TextView) view.findViewById(R.id.txt_order_items);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderProcessing itemRowOrderProcessing, View view) {
            view.findViewById(R.id.layout_row_order_processing_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderProcessing.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderProcessing.onClickOrder();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowOrderProcessing, View> {
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
        public void bindCollapse(ItemRowOrderProcessing itemRowOrderProcessing) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowOrderProcessing itemRowOrderProcessing) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderProcessing itemRowOrderProcessing, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOrderProcessing itemRowOrderProcessing, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowOrderProcessing itemRowOrderProcessing) {
            super(itemRowOrderProcessing, R.layout.item_row_order_processing, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderProcessing itemRowOrderProcessing) {
            itemRowOrderProcessing.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderProcessing itemRowOrderProcessing, View view) {
            itemRowOrderProcessing.layoutRoot = (TrackingOrderStatusView) view.findViewById(R.id.layout_tracking_order_info);
            itemRowOrderProcessing.txtRefOrder = (TextView) view.findViewById(R.id.txt_ref_order);
            itemRowOrderProcessing.txtOrderItems = (TextView) view.findViewById(R.id.txt_order_items);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderProcessing itemRowOrderProcessing, View view) {
            view.findViewById(R.id.layout_row_order_processing_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderProcessing.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderProcessing.onClickOrder();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowOrderProcessing itemRowOrderProcessing, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderProcessing.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowOrderProcessing, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderProcessing itemRowOrderProcessing, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowOrderProcessing itemRowOrderProcessing) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowOrderProcessing itemRowOrderProcessing) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowOrderProcessing itemRowOrderProcessing) {
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
        public void bindViewPosition(ItemRowOrderProcessing itemRowOrderProcessing, int i) {
        }

        public SwipeViewBinder(ItemRowOrderProcessing itemRowOrderProcessing) {
            super(itemRowOrderProcessing, R.layout.item_row_order_processing, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderProcessing itemRowOrderProcessing) {
            itemRowOrderProcessing.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOrderProcessing != null && isNullable) {
                itemRowOrderProcessing.layoutRoot = null;
                itemRowOrderProcessing.txtRefOrder = null;
                itemRowOrderProcessing.txtOrderItems = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderProcessing itemRowOrderProcessing, SwipePlaceHolderView.FrameView frameView) {
            itemRowOrderProcessing.layoutRoot = (TrackingOrderStatusView) frameView.findViewById(R.id.layout_tracking_order_info);
            itemRowOrderProcessing.txtRefOrder = (TextView) frameView.findViewById(R.id.txt_ref_order);
            itemRowOrderProcessing.txtOrderItems = (TextView) frameView.findViewById(R.id.txt_order_items);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderProcessing itemRowOrderProcessing, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_row_order_processing_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderProcessing.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderProcessing.onClickOrder();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowOrderProcessing, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderProcessing itemRowOrderProcessing, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowOrderProcessing itemRowOrderProcessing) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowOrderProcessing itemRowOrderProcessing) {
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
        public void bindSwipeOut(ItemRowOrderProcessing itemRowOrderProcessing) {
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
        public void bindViewPosition(ItemRowOrderProcessing itemRowOrderProcessing, int i) {
        }

        public DirectionalViewBinder(ItemRowOrderProcessing itemRowOrderProcessing) {
            super(itemRowOrderProcessing, R.layout.item_row_order_processing, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderProcessing itemRowOrderProcessing) {
            itemRowOrderProcessing.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOrderProcessing itemRowOrderProcessing = (ItemRowOrderProcessing) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOrderProcessing != null && isNullable) {
                itemRowOrderProcessing.layoutRoot = null;
                itemRowOrderProcessing.txtRefOrder = null;
                itemRowOrderProcessing.txtOrderItems = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderProcessing itemRowOrderProcessing, SwipePlaceHolderView.FrameView frameView) {
            itemRowOrderProcessing.layoutRoot = (TrackingOrderStatusView) frameView.findViewById(R.id.layout_tracking_order_info);
            itemRowOrderProcessing.txtRefOrder = (TextView) frameView.findViewById(R.id.txt_ref_order);
            itemRowOrderProcessing.txtOrderItems = (TextView) frameView.findViewById(R.id.txt_order_items);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderProcessing itemRowOrderProcessing, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_row_order_processing_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderProcessing.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderProcessing.onClickOrder();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowOrderProcessing(OrderProcessing orderProcessing2, Function1<? super OrderProcessing, Unit> function1) {
        Intrinsics.checkNotNullParameter(orderProcessing2, "orderProcessing");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.orderProcessing = orderProcessing2;
        this.onClickListener = function1;
    }

    public final TrackingOrderStatusView getLayoutRoot() {
        TrackingOrderStatusView trackingOrderStatusView = this.layoutRoot;
        if (trackingOrderStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        return trackingOrderStatusView;
    }

    public final void setLayoutRoot(TrackingOrderStatusView trackingOrderStatusView) {
        Intrinsics.checkNotNullParameter(trackingOrderStatusView, "<set-?>");
        this.layoutRoot = trackingOrderStatusView;
    }

    public final TextView getTxtRefOrder() {
        TextView textView = this.txtRefOrder;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRefOrder");
        }
        return textView;
    }

    public final void setTxtRefOrder(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtRefOrder = textView;
    }

    public final TextView getTxtOrderItems() {
        TextView textView = this.txtOrderItems;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtOrderItems");
        }
        return textView;
    }

    public final void setTxtOrderItems(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtOrderItems = textView;
    }

    public final void onClickOrder() {
        this.onClickListener.invoke(this.orderProcessing);
    }

    public final void onResolve() {
        TextView textView = this.txtRefOrder;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRefOrder");
        }
        textView.setText(this.orderProcessing.getOrderTypeStr());
        TextView textView2 = this.txtOrderItems;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtOrderItems");
        }
        textView2.setText(CollectionsKt.joinToString$default(this.orderProcessing.getOrderlines(), ",", null, null, 0, null, ItemRowOrderProcessing$onResolve$1.INSTANCE, 30, null));
        TrackingOrderStatusView trackingOrderStatusView = this.layoutRoot;
        if (trackingOrderStatusView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        ImageView imageView = (ImageView) trackingOrderStatusView._$_findCachedViewById(R.id.img_map);
        Intrinsics.checkNotNullExpressionValue(imageView, "layoutRoot.img_map");
        imageView.setVisibility(4);
        TrackingOrderStatusView trackingOrderStatusView2 = this.layoutRoot;
        if (trackingOrderStatusView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutRoot");
        }
        trackingOrderStatusView2.updateData(this.orderProcessing, false);
    }
}
