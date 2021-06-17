package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.content.Context;
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
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0014\u001a\u00020\u0006J\u0006\u0010\u0015\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/ItemRowAddDeliveryAddress;", "", "addressType", "", "onClickSelect", "Lkotlin/Function1;", "", "(ILkotlin/jvm/functions/Function1;)V", "imgAddressAddType", "Landroid/widget/ImageView;", "getImgAddressAddType", "()Landroid/widget/ImageView;", "setImgAddressAddType", "(Landroid/widget/ImageView;)V", "txtAddressAddType", "Landroid/widget/TextView;", "getTxtAddressAddType", "()Landroid/widget/TextView;", "setTxtAddressAddType", "(Landroid/widget/TextView;)V", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowAddDeliveryAddress.kt */
public final class ItemRowAddDeliveryAddress {
    private final int addressType;
    public ImageView imgAddressAddType;
    private final Function1<Integer, Unit> onClickSelect;
    public TextView txtAddressAddType;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowAddDeliveryAddress> {
        public void bindLoadMore(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
        }

        public LoadMoreViewBinder(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            super(itemRowAddDeliveryAddress);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowAddDeliveryAddress, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, int i) {
        }

        public ViewBinder(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            super(itemRowAddDeliveryAddress, R.layout.item_row_add_delivery_address, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            itemRowAddDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAddDeliveryAddress != null && isNullable) {
                itemRowAddDeliveryAddress.txtAddressAddType = null;
                itemRowAddDeliveryAddress.imgAddressAddType = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
            itemRowAddDeliveryAddress.txtAddressAddType = (TextView) view.findViewById(R.id.txt_address_add_type);
            itemRowAddDeliveryAddress.imgAddressAddType = (ImageView) view.findViewById(R.id.img_address_type);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
            view.findViewById(R.id.txt_address_add_type).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowAddDeliveryAddress.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddDeliveryAddress.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowAddDeliveryAddress(int i, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onClickSelect");
        this.addressType = i;
        this.onClickSelect = function1;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowAddDeliveryAddress, View> {
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
        public void bindCollapse(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            super(itemRowAddDeliveryAddress, R.layout.item_row_add_delivery_address, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            itemRowAddDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
            itemRowAddDeliveryAddress.txtAddressAddType = (TextView) view.findViewById(R.id.txt_address_add_type);
            itemRowAddDeliveryAddress.imgAddressAddType = (ImageView) view.findViewById(R.id.img_address_type);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
            view.findViewById(R.id.txt_address_add_type).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowAddDeliveryAddress.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddDeliveryAddress.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowAddDeliveryAddress.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
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
        public void bindViewPosition(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, int i) {
        }

        public SwipeViewBinder(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            super(itemRowAddDeliveryAddress, R.layout.item_row_add_delivery_address, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            itemRowAddDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAddDeliveryAddress != null && isNullable) {
                itemRowAddDeliveryAddress.txtAddressAddType = null;
                itemRowAddDeliveryAddress.imgAddressAddType = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            itemRowAddDeliveryAddress.txtAddressAddType = (TextView) frameView.findViewById(R.id.txt_address_add_type);
            itemRowAddDeliveryAddress.imgAddressAddType = (ImageView) frameView.findViewById(R.id.img_address_type);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.txt_address_add_type).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowAddDeliveryAddress.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddDeliveryAddress.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
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
        public void bindSwipeOut(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
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
        public void bindViewPosition(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, int i) {
        }

        public DirectionalViewBinder(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            super(itemRowAddDeliveryAddress, R.layout.item_row_add_delivery_address, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress) {
            itemRowAddDeliveryAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = (ItemRowAddDeliveryAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAddDeliveryAddress != null && isNullable) {
                itemRowAddDeliveryAddress.txtAddressAddType = null;
                itemRowAddDeliveryAddress.imgAddressAddType = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            itemRowAddDeliveryAddress.txtAddressAddType = (TextView) frameView.findViewById(R.id.txt_address_add_type);
            itemRowAddDeliveryAddress.imgAddressAddType = (ImageView) frameView.findViewById(R.id.img_address_type);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAddDeliveryAddress itemRowAddDeliveryAddress, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.txt_address_add_type).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowAddDeliveryAddress.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAddDeliveryAddress.onClick();
                }
            });
        }
    }

    public final TextView getTxtAddressAddType() {
        TextView textView = this.txtAddressAddType;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressAddType");
        }
        return textView;
    }

    public final void setTxtAddressAddType(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtAddressAddType = textView;
    }

    public final ImageView getImgAddressAddType() {
        ImageView imageView = this.imgAddressAddType;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgAddressAddType");
        }
        return imageView;
    }

    public final void setImgAddressAddType(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgAddressAddType = imageView;
    }

    public final void onResolve() {
        TextView textView = this.txtAddressAddType;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressAddType");
        }
        Context context = textView.getContext();
        int i = this.addressType;
        if (i == AddressType.INSTANCE.getHOME()) {
            TextView textView2 = this.txtAddressAddType;
            if (textView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtAddressAddType");
            }
            textView2.setText(context.getString(R.string.str_add_home_address));
            ImageView imageView = this.imgAddressAddType;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgAddressAddType");
            }
            imageView.setImageResource(R.drawable.ic_home_address);
        } else if (i == AddressType.INSTANCE.getWORK()) {
            TextView textView3 = this.txtAddressAddType;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtAddressAddType");
            }
            textView3.setText(context.getString(R.string.str_add_work_address));
            ImageView imageView2 = this.imgAddressAddType;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgAddressAddType");
            }
            imageView2.setImageResource(R.drawable.ic_work_address);
        } else {
            TextView textView4 = this.txtAddressAddType;
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtAddressAddType");
            }
            textView4.setText(context.getString(R.string.str_add_other_address));
            ImageView imageView3 = this.imgAddressAddType;
            if (imageView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgAddressAddType");
            }
            imageView3.setImageResource(R.drawable.ic_plus);
        }
    }

    public final void onClick() {
        this.onClickSelect.invoke(Integer.valueOf(this.addressType));
    }
}
