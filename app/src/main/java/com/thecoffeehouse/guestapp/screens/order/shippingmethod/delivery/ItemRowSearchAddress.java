package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

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
import com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b\"\u00020\t¢\u0006\u0002\u0010\nJ\u0006\u0010\u0018\u001a\u00020\u0006J\u0006\u0010\u0019\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bX\u0004¢\u0006\u0004\n\u0002\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/ItemRowSearchAddress;", "", "autocompletePrediction", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Prediction;", "onClickSelect", "Lkotlin/Function1;", "", "textViewAttribute", "", "Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Prediction;Lkotlin/jvm/functions/Function1;[Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;)V", "layoutItemSearchStoreRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutItemSearchStoreRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setLayoutItemSearchStoreRoot", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "[Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "txtAddressSearchStore", "Landroid/widget/TextView;", "getTxtAddressSearchStore", "()Landroid/widget/TextView;", "setTxtAddressSearchStore", "(Landroid/widget/TextView;)V", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowSearchAddress.kt */
public final class ItemRowSearchAddress {
    private final Prediction autocompletePrediction;
    public ConstraintLayout layoutItemSearchStoreRoot;
    private final Function1<Prediction, Unit> onClickSelect;
    private final TextViewAttribute[] textViewAttribute;
    public TextView txtAddressSearchStore;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSearchAddress> {
        public void bindLoadMore(ItemRowSearchAddress itemRowSearchAddress) {
        }

        public LoadMoreViewBinder(ItemRowSearchAddress itemRowSearchAddress) {
            super(itemRowSearchAddress);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSearchAddress, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddress itemRowSearchAddress, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchAddress itemRowSearchAddress, int i) {
        }

        public ViewBinder(ItemRowSearchAddress itemRowSearchAddress) {
            super(itemRowSearchAddress, R.layout.item_row_search_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddress itemRowSearchAddress) {
            itemRowSearchAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchAddress != null && isNullable) {
                itemRowSearchAddress.txtAddressSearchStore = null;
                itemRowSearchAddress.layoutItemSearchStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddress itemRowSearchAddress, View view) {
            itemRowSearchAddress.txtAddressSearchStore = (TextView) view.findViewById(R.id.txt_address_search_store);
            itemRowSearchAddress.layoutItemSearchStoreRoot = (ConstraintLayout) view.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchAddress itemRowSearchAddress, View view) {
            view.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchAddress.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchAddress.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSearchAddress, View> {
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
        public void bindCollapse(ItemRowSearchAddress itemRowSearchAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSearchAddress itemRowSearchAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddress itemRowSearchAddress, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchAddress itemRowSearchAddress, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowSearchAddress itemRowSearchAddress) {
            super(itemRowSearchAddress, R.layout.item_row_search_store, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddress itemRowSearchAddress) {
            itemRowSearchAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddress itemRowSearchAddress, View view) {
            itemRowSearchAddress.txtAddressSearchStore = (TextView) view.findViewById(R.id.txt_address_search_store);
            itemRowSearchAddress.layoutItemSearchStoreRoot = (ConstraintLayout) view.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchAddress itemRowSearchAddress, View view) {
            view.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchAddress.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchAddress.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSearchAddress itemRowSearchAddress, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchAddress.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSearchAddress, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddress itemRowSearchAddress, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchAddress itemRowSearchAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchAddress itemRowSearchAddress) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSearchAddress itemRowSearchAddress) {
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
        public void bindViewPosition(ItemRowSearchAddress itemRowSearchAddress, int i) {
        }

        public SwipeViewBinder(ItemRowSearchAddress itemRowSearchAddress) {
            super(itemRowSearchAddress, R.layout.item_row_search_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddress itemRowSearchAddress) {
            itemRowSearchAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchAddress != null && isNullable) {
                itemRowSearchAddress.txtAddressSearchStore = null;
                itemRowSearchAddress.layoutItemSearchStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddress itemRowSearchAddress, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchAddress.txtAddressSearchStore = (TextView) frameView.findViewById(R.id.txt_address_search_store);
            itemRowSearchAddress.layoutItemSearchStoreRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchAddress itemRowSearchAddress, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchAddress.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchAddress.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowSearchAddress(Prediction prediction, Function1<? super Prediction, Unit> function1, TextViewAttribute... textViewAttributeArr) {
        Intrinsics.checkNotNullParameter(prediction, "autocompletePrediction");
        Intrinsics.checkNotNullParameter(function1, "onClickSelect");
        Intrinsics.checkNotNullParameter(textViewAttributeArr, "textViewAttribute");
        this.autocompletePrediction = prediction;
        this.onClickSelect = function1;
        this.textViewAttribute = textViewAttributeArr;
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSearchAddress, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchAddress itemRowSearchAddress, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchAddress itemRowSearchAddress) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchAddress itemRowSearchAddress) {
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
        public void bindSwipeOut(ItemRowSearchAddress itemRowSearchAddress) {
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
        public void bindViewPosition(ItemRowSearchAddress itemRowSearchAddress, int i) {
        }

        public DirectionalViewBinder(ItemRowSearchAddress itemRowSearchAddress) {
            super(itemRowSearchAddress, R.layout.item_row_search_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchAddress itemRowSearchAddress) {
            itemRowSearchAddress.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchAddress itemRowSearchAddress = (ItemRowSearchAddress) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchAddress != null && isNullable) {
                itemRowSearchAddress.txtAddressSearchStore = null;
                itemRowSearchAddress.layoutItemSearchStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchAddress itemRowSearchAddress, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchAddress.txtAddressSearchStore = (TextView) frameView.findViewById(R.id.txt_address_search_store);
            itemRowSearchAddress.layoutItemSearchStoreRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchAddress itemRowSearchAddress, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchAddress.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchAddress.onClick();
                }
            });
        }
    }

    public final TextView getTxtAddressSearchStore() {
        TextView textView = this.txtAddressSearchStore;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressSearchStore");
        }
        return textView;
    }

    public final void setTxtAddressSearchStore(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtAddressSearchStore = textView;
    }

    public final ConstraintLayout getLayoutItemSearchStoreRoot() {
        ConstraintLayout constraintLayout = this.layoutItemSearchStoreRoot;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutItemSearchStoreRoot");
        }
        return constraintLayout;
    }

    public final void setLayoutItemSearchStoreRoot(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.layoutItemSearchStoreRoot = constraintLayout;
    }

    public final void onResolve() {
        TextViewAttribute[] textViewAttributeArr = this.textViewAttribute;
        TextView textView = this.txtAddressSearchStore;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtAddressSearchStore");
        }
        TLTextViewKt.setTextMultipleFonts(textView, (TextViewAttribute[]) Arrays.copyOf(textViewAttributeArr, textViewAttributeArr.length));
    }

    public final void onClick() {
        this.onClickSelect.invoke(this.autocompletePrediction);
    }
}
