package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\u000e\u001a\u00020\u0006H\u0002J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\b\u0010\u0012\u001a\u00020\u0006H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/ItemRowOrderHistory;", "", "orderHistory", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;", "onClickListener", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;Lkotlin/jvm/functions/Function1;)V", "mRootView", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMRootView", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMRootView", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "hideOrderTitle", "onClick", "onResolve", "oneItemName", "twoItemsName", "twoItemsNameAndOthers", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RecentOrdersRow.kt */
public final class ItemRowOrderHistory {
    public ConstraintLayout mRootView;
    private final Function1<OrderHistory, Unit> onClickListener;
    private final OrderHistory orderHistory;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowOrderHistory> {
        public void bindLoadMore(ItemRowOrderHistory itemRowOrderHistory) {
        }

        public LoadMoreViewBinder(ItemRowOrderHistory itemRowOrderHistory) {
            super(itemRowOrderHistory);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowOrderHistory, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderHistory itemRowOrderHistory, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOrderHistory itemRowOrderHistory, int i) {
        }

        public ViewBinder(ItemRowOrderHistory itemRowOrderHistory) {
            super(itemRowOrderHistory, R.layout.item_row_order_history, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderHistory itemRowOrderHistory) {
            itemRowOrderHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOrderHistory != null && isNullable) {
                itemRowOrderHistory.mRootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderHistory itemRowOrderHistory, View view) {
            itemRowOrderHistory.mRootView = (ConstraintLayout) view.findViewById(R.id.layout_root_order_history);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderHistory itemRowOrderHistory, View view) {
            view.findViewById(R.id.layout_root_order_history).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderHistory.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderHistory.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowOrderHistory, View> {
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
        public void bindCollapse(ItemRowOrderHistory itemRowOrderHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowOrderHistory itemRowOrderHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderHistory itemRowOrderHistory, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOrderHistory itemRowOrderHistory, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowOrderHistory itemRowOrderHistory) {
            super(itemRowOrderHistory, R.layout.item_row_order_history, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderHistory itemRowOrderHistory) {
            itemRowOrderHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderHistory itemRowOrderHistory, View view) {
            itemRowOrderHistory.mRootView = (ConstraintLayout) view.findViewById(R.id.layout_root_order_history);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderHistory itemRowOrderHistory, View view) {
            view.findViewById(R.id.layout_root_order_history).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderHistory.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderHistory.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowOrderHistory itemRowOrderHistory, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderHistory.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowOrderHistory, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderHistory itemRowOrderHistory, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowOrderHistory itemRowOrderHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowOrderHistory itemRowOrderHistory) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowOrderHistory itemRowOrderHistory) {
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
        public void bindViewPosition(ItemRowOrderHistory itemRowOrderHistory, int i) {
        }

        public SwipeViewBinder(ItemRowOrderHistory itemRowOrderHistory) {
            super(itemRowOrderHistory, R.layout.item_row_order_history, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderHistory itemRowOrderHistory) {
            itemRowOrderHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOrderHistory != null && isNullable) {
                itemRowOrderHistory.mRootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderHistory itemRowOrderHistory, SwipePlaceHolderView.FrameView frameView) {
            itemRowOrderHistory.mRootView = (ConstraintLayout) frameView.findViewById(R.id.layout_root_order_history);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderHistory itemRowOrderHistory, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_root_order_history).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderHistory.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderHistory.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowOrderHistory, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOrderHistory itemRowOrderHistory, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowOrderHistory itemRowOrderHistory) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowOrderHistory itemRowOrderHistory) {
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
        public void bindSwipeOut(ItemRowOrderHistory itemRowOrderHistory) {
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
        public void bindViewPosition(ItemRowOrderHistory itemRowOrderHistory, int i) {
        }

        public DirectionalViewBinder(ItemRowOrderHistory itemRowOrderHistory) {
            super(itemRowOrderHistory, R.layout.item_row_order_history, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOrderHistory itemRowOrderHistory) {
            itemRowOrderHistory.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOrderHistory itemRowOrderHistory = (ItemRowOrderHistory) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOrderHistory != null && isNullable) {
                itemRowOrderHistory.mRootView = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOrderHistory itemRowOrderHistory, SwipePlaceHolderView.FrameView frameView) {
            itemRowOrderHistory.mRootView = (ConstraintLayout) frameView.findViewById(R.id.layout_root_order_history);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOrderHistory itemRowOrderHistory, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_root_order_history).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.trackingorder.ItemRowOrderHistory.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOrderHistory.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowOrderHistory(OrderHistory orderHistory2, Function1<? super OrderHistory, Unit> function1) {
        Intrinsics.checkNotNullParameter(orderHistory2, "orderHistory");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.orderHistory = orderHistory2;
        this.onClickListener = function1;
    }

    public final ConstraintLayout getMRootView() {
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        return constraintLayout;
    }

    public final void setMRootView(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.mRootView = constraintLayout;
    }

    public final void onClick() {
        this.onClickListener.invoke(this.orderHistory);
    }

    public final void onResolve() {
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_ref_order);
        Intrinsics.checkNotNullExpressionValue(textView, "mRootView.txt_ref_order");
        textView.setText(this.orderHistory.getOrderTypeStr());
        if (this.orderHistory.getProducts().size() > 2) {
            twoItemsNameAndOthers();
        } else if (this.orderHistory.getProducts().size() == 2) {
            twoItemsName();
        } else if (!this.orderHistory.getProducts().isEmpty()) {
            oneItemName();
        } else {
            hideOrderTitle();
        }
        ConstraintLayout constraintLayout2 = this.mRootView;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.txt_order_price);
        Intrinsics.checkNotNullExpressionValue(textView2, "mRootView.txt_order_price");
        ViewExtsKt.formatHtmlCompact(textView2, this.orderHistory.getTotalStr());
        ConstraintLayout constraintLayout3 = this.mRootView;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView3 = (TextView) constraintLayout3.findViewById(R.id.txt_order_time);
        Intrinsics.checkNotNullExpressionValue(textView3, "mRootView.txt_order_time");
        textView3.setText(RewardExtsKt.convertSecondToTimeFormat(this.orderHistory.getTime(), StringDateUtilsKt.DF_hh_mm_dd_MM_yyyy));
    }

    private final void hideOrderTitle() {
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "mRootView.txt_order_items");
        textView.setVisibility(4);
    }

    private final void oneItemName() {
        String str = (String) CollectionsKt.first((List) this.orderHistory.getProducts());
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "mRootView.txt_order_items");
        textView.setText(str);
    }

    private final void twoItemsName() {
        String str = (((String) CollectionsKt.first((List) this.orderHistory.getProducts())) + ", ") + this.orderHistory.getProducts().get(1);
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "mRootView.txt_order_items");
        textView.setText(str);
    }

    private final void twoItemsNameAndOthers() {
        int size = this.orderHistory.getProducts().size() - 2;
        StringBuilder append = new StringBuilder().append(((((String) CollectionsKt.first((List) this.orderHistory.getProducts())) + ", ") + this.orderHistory.getProducts().get(1)) + " ");
        ConstraintLayout constraintLayout = this.mRootView;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        String sb = append.append(constraintLayout.getContext().getString(R.string.str_no_other_items, String.valueOf(size))).toString();
        ConstraintLayout constraintLayout2 = this.mRootView;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRootView");
        }
        TextView textView = (TextView) constraintLayout2.findViewById(R.id.txt_order_items);
        Intrinsics.checkNotNullExpressionValue(textView, "mRootView.txt_order_items");
        textView.setText(sb);
    }
}
