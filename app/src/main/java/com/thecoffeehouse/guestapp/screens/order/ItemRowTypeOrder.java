package com.thecoffeehouse.guestapp.screens.order;

import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u0007\u001a\u00020\tJ\u0006\u0010\u001a\u001a\u00020\tR\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/ItemRowTypeOrder;", "", "icon", "name", "", FirebaseAnalytics.Param.QUANTITY, "", "onClick", "Lkotlin/Function0;", "", "(Ljava/lang/Object;Ljava/lang/String;ILkotlin/jvm/functions/Function0;)V", "imgIconType", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgIconType", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgIconType", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "txtName", "Landroid/widget/TextView;", "getTxtName", "()Landroid/widget/TextView;", "setTxtName", "(Landroid/widget/TextView;)V", "txtQuantity", "getTxtQuantity", "setTxtQuantity", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowTypeOrder.kt */
public final class ItemRowTypeOrder {
    private final Object icon;
    public TLImageView imgIconType;
    private final String name;
    private final Function0<Unit> onClick;
    private final int quantity;
    public TextView txtName;
    public TextView txtQuantity;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowTypeOrder> {
        public void bindLoadMore(ItemRowTypeOrder itemRowTypeOrder) {
        }

        public LoadMoreViewBinder(ItemRowTypeOrder itemRowTypeOrder) {
            super(itemRowTypeOrder);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowTypeOrder, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowTypeOrder itemRowTypeOrder, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowTypeOrder itemRowTypeOrder, int i) {
        }

        public ViewBinder(ItemRowTypeOrder itemRowTypeOrder) {
            super(itemRowTypeOrder, R.layout.item_row_type_order, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowTypeOrder itemRowTypeOrder) {
            itemRowTypeOrder.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
            boolean isNullable = isNullable();
            if (itemRowTypeOrder != null && isNullable) {
                itemRowTypeOrder.imgIconType = null;
                itemRowTypeOrder.txtName = null;
                itemRowTypeOrder.txtQuantity = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowTypeOrder itemRowTypeOrder, View view) {
            itemRowTypeOrder.imgIconType = (TLImageView) view.findViewById(R.id.imgIconTypeOrder);
            itemRowTypeOrder.txtName = (TextView) view.findViewById(R.id.txtNameTypeOrder);
            itemRowTypeOrder.txtQuantity = (TextView) view.findViewById(R.id.txtQuantityTypeOrder);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowTypeOrder itemRowTypeOrder, View view) {
            view.findViewById(R.id.layout_root_type_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.ItemRowTypeOrder.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowTypeOrder.onClick();
                }
            });
        }
    }

    public ItemRowTypeOrder(Object obj, String str, int i, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(obj, "icon");
        Intrinsics.checkNotNullParameter(str, "name");
        Intrinsics.checkNotNullParameter(function0, "onClick");
        this.icon = obj;
        this.name = str;
        this.quantity = i;
        this.onClick = function0;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowTypeOrder, View> {
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
        public void bindCollapse(ItemRowTypeOrder itemRowTypeOrder) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowTypeOrder itemRowTypeOrder) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowTypeOrder itemRowTypeOrder, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowTypeOrder itemRowTypeOrder, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowTypeOrder itemRowTypeOrder) {
            super(itemRowTypeOrder, R.layout.item_row_type_order, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowTypeOrder itemRowTypeOrder) {
            itemRowTypeOrder.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowTypeOrder itemRowTypeOrder, View view) {
            itemRowTypeOrder.imgIconType = (TLImageView) view.findViewById(R.id.imgIconTypeOrder);
            itemRowTypeOrder.txtName = (TextView) view.findViewById(R.id.txtNameTypeOrder);
            itemRowTypeOrder.txtQuantity = (TextView) view.findViewById(R.id.txtQuantityTypeOrder);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowTypeOrder itemRowTypeOrder, View view) {
            view.findViewById(R.id.layout_root_type_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.ItemRowTypeOrder.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowTypeOrder.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowTypeOrder itemRowTypeOrder, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.ItemRowTypeOrder.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowTypeOrder, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowTypeOrder itemRowTypeOrder, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowTypeOrder itemRowTypeOrder) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowTypeOrder itemRowTypeOrder) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowTypeOrder itemRowTypeOrder) {
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
        public void bindViewPosition(ItemRowTypeOrder itemRowTypeOrder, int i) {
        }

        public SwipeViewBinder(ItemRowTypeOrder itemRowTypeOrder) {
            super(itemRowTypeOrder, R.layout.item_row_type_order, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowTypeOrder itemRowTypeOrder) {
            itemRowTypeOrder.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
            boolean isNullable = isNullable();
            if (itemRowTypeOrder != null && isNullable) {
                itemRowTypeOrder.imgIconType = null;
                itemRowTypeOrder.txtName = null;
                itemRowTypeOrder.txtQuantity = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowTypeOrder itemRowTypeOrder, SwipePlaceHolderView.FrameView frameView) {
            itemRowTypeOrder.imgIconType = (TLImageView) frameView.findViewById(R.id.imgIconTypeOrder);
            itemRowTypeOrder.txtName = (TextView) frameView.findViewById(R.id.txtNameTypeOrder);
            itemRowTypeOrder.txtQuantity = (TextView) frameView.findViewById(R.id.txtQuantityTypeOrder);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowTypeOrder itemRowTypeOrder, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_root_type_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.ItemRowTypeOrder.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowTypeOrder.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowTypeOrder, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowTypeOrder itemRowTypeOrder, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowTypeOrder itemRowTypeOrder) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowTypeOrder itemRowTypeOrder) {
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
        public void bindSwipeOut(ItemRowTypeOrder itemRowTypeOrder) {
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
        public void bindViewPosition(ItemRowTypeOrder itemRowTypeOrder, int i) {
        }

        public DirectionalViewBinder(ItemRowTypeOrder itemRowTypeOrder) {
            super(itemRowTypeOrder, R.layout.item_row_type_order, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowTypeOrder itemRowTypeOrder) {
            itemRowTypeOrder.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowTypeOrder itemRowTypeOrder = (ItemRowTypeOrder) getResolver();
            boolean isNullable = isNullable();
            if (itemRowTypeOrder != null && isNullable) {
                itemRowTypeOrder.imgIconType = null;
                itemRowTypeOrder.txtName = null;
                itemRowTypeOrder.txtQuantity = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowTypeOrder itemRowTypeOrder, SwipePlaceHolderView.FrameView frameView) {
            itemRowTypeOrder.imgIconType = (TLImageView) frameView.findViewById(R.id.imgIconTypeOrder);
            itemRowTypeOrder.txtName = (TextView) frameView.findViewById(R.id.txtNameTypeOrder);
            itemRowTypeOrder.txtQuantity = (TextView) frameView.findViewById(R.id.txtQuantityTypeOrder);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowTypeOrder itemRowTypeOrder, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_root_type_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.ItemRowTypeOrder.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowTypeOrder.onClick();
                }
            });
        }
    }

    public final TLImageView getImgIconType() {
        TLImageView tLImageView = this.imgIconType;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgIconType");
        }
        return tLImageView;
    }

    public final void setImgIconType(TLImageView tLImageView) {
        Intrinsics.checkNotNullParameter(tLImageView, "<set-?>");
        this.imgIconType = tLImageView;
    }

    public final TextView getTxtName() {
        TextView textView = this.txtName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtName");
        }
        return textView;
    }

    public final void setTxtName(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtName = textView;
    }

    public final TextView getTxtQuantity() {
        TextView textView = this.txtQuantity;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtQuantity");
        }
        return textView;
    }

    public final void setTxtQuantity(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtQuantity = textView;
    }

    public final void onClick() {
        this.onClick.invoke();
    }

    public final void onResolve() {
        TLImageView tLImageView = this.imgIconType;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgIconType");
        }
        RequestBuilder requestBuilder = (RequestBuilder) ((RequestBuilder) Glide.with(tLImageView.getContext()).load(this.icon).placeholder((int) R.drawable.img_background_feature)).error(R.drawable.img_background_feature);
        TLImageView tLImageView2 = this.imgIconType;
        if (tLImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgIconType");
        }
        requestBuilder.into(tLImageView2);
        TextView textView = this.txtName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtName");
        }
        textView.setText(this.name);
        TextView textView2 = this.txtQuantity;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtQuantity");
        }
        TextView textView3 = this.txtQuantity;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtQuantity");
        }
        textView2.setText(textView3.getContext().getString(R.string.str_no_of_items, Integer.valueOf(this.quantity)));
    }
}
