package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.views.CornerConstraintLayout;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/ItemRowPickStore;", "", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "onClick", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;Lkotlin/jvm/functions/Function1;)V", "itemRowStoreRoot", "Lcom/thecoffeehouse/guestapp/views/CornerConstraintLayout;", "getItemRowStoreRoot", "()Lcom/thecoffeehouse/guestapp/views/CornerConstraintLayout;", "setItemRowStoreRoot", "(Lcom/thecoffeehouse/guestapp/views/CornerConstraintLayout;)V", "getStore", "()Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowPickStore.kt */
public final class ItemRowPickStore {
    public CornerConstraintLayout itemRowStoreRoot;
    private final Function1<Store, Unit> onClick;
    private final Store store;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowPickStore> {
        public void bindLoadMore(ItemRowPickStore itemRowPickStore) {
        }

        public LoadMoreViewBinder(ItemRowPickStore itemRowPickStore) {
            super(itemRowPickStore);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowPickStore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStore itemRowPickStore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowPickStore itemRowPickStore, int i) {
        }

        public ViewBinder(ItemRowPickStore itemRowPickStore) {
            super(itemRowPickStore, R.layout.item_row_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStore itemRowPickStore) {
            itemRowPickStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowPickStore != null && isNullable) {
                itemRowPickStore.itemRowStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStore itemRowPickStore, View view) {
            itemRowPickStore.itemRowStoreRoot = (CornerConstraintLayout) view.findViewById(R.id.item_row_store_layout);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowPickStore itemRowPickStore, View view) {
            view.findViewById(R.id.item_row_store_layout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowPickStore.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowPickStore, View> {
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
        public void bindCollapse(ItemRowPickStore itemRowPickStore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowPickStore itemRowPickStore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStore itemRowPickStore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowPickStore itemRowPickStore, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowPickStore itemRowPickStore) {
            super(itemRowPickStore, R.layout.item_row_store, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStore itemRowPickStore) {
            itemRowPickStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStore itemRowPickStore, View view) {
            itemRowPickStore.itemRowStoreRoot = (CornerConstraintLayout) view.findViewById(R.id.item_row_store_layout);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowPickStore itemRowPickStore, View view) {
            view.findViewById(R.id.item_row_store_layout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowPickStore.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowPickStore itemRowPickStore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowPickStore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStore itemRowPickStore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowPickStore itemRowPickStore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowPickStore itemRowPickStore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowPickStore itemRowPickStore) {
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
        public void bindViewPosition(ItemRowPickStore itemRowPickStore, int i) {
        }

        public SwipeViewBinder(ItemRowPickStore itemRowPickStore) {
            super(itemRowPickStore, R.layout.item_row_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStore itemRowPickStore) {
            itemRowPickStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowPickStore != null && isNullable) {
                itemRowPickStore.itemRowStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStore itemRowPickStore, SwipePlaceHolderView.FrameView frameView) {
            itemRowPickStore.itemRowStoreRoot = (CornerConstraintLayout) frameView.findViewById(R.id.item_row_store_layout);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowPickStore itemRowPickStore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.item_row_store_layout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowPickStore.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowPickStore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowPickStore itemRowPickStore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowPickStore itemRowPickStore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowPickStore itemRowPickStore) {
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
        public void bindSwipeOut(ItemRowPickStore itemRowPickStore) {
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
        public void bindViewPosition(ItemRowPickStore itemRowPickStore, int i) {
        }

        public DirectionalViewBinder(ItemRowPickStore itemRowPickStore) {
            super(itemRowPickStore, R.layout.item_row_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowPickStore itemRowPickStore) {
            itemRowPickStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowPickStore itemRowPickStore = (ItemRowPickStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowPickStore != null && isNullable) {
                itemRowPickStore.itemRowStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowPickStore itemRowPickStore, SwipePlaceHolderView.FrameView frameView) {
            itemRowPickStore.itemRowStoreRoot = (CornerConstraintLayout) frameView.findViewById(R.id.item_row_store_layout);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowPickStore itemRowPickStore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.item_row_store_layout).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowPickStore.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.stores.Store, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowPickStore(Store store2, Function1<? super Store, Unit> function1) {
        Intrinsics.checkNotNullParameter(store2, "store");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.store = store2;
        this.onClick = function1;
    }

    public final Store getStore() {
        return this.store;
    }

    public final CornerConstraintLayout getItemRowStoreRoot() {
        CornerConstraintLayout cornerConstraintLayout = this.itemRowStoreRoot;
        if (cornerConstraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("itemRowStoreRoot");
        }
        return cornerConstraintLayout;
    }

    public final void setItemRowStoreRoot(CornerConstraintLayout cornerConstraintLayout) {
        Intrinsics.checkNotNullParameter(cornerConstraintLayout, "<set-?>");
        this.itemRowStoreRoot = cornerConstraintLayout;
    }

    public final void onClick() {
        this.onClick.invoke(this.store);
    }

    public final void onResolve() {
        if (this.itemRowStoreRoot != null) {
            CornerConstraintLayout cornerConstraintLayout = this.itemRowStoreRoot;
            if (cornerConstraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("itemRowStoreRoot");
            }
            ViewExtsKt.marginBottom(cornerConstraintLayout, ViewExtsKt.DPtoPX(4.0f));
            TextView textView = (TextView) cornerConstraintLayout._$_findCachedViewById(R.id.txt_address_store);
            Intrinsics.checkNotNullExpressionValue(textView, "it.txt_address_store");
            textView.setText(this.store.getFullAddress());
            Double distance = this.store.getDistance();
            if (distance != null) {
                String formatDistanceToString = ItemRowPickStoreKt.formatDistanceToString(distance.doubleValue() / ((double) 1000));
                TextView textView2 = (TextView) cornerConstraintLayout._$_findCachedViewById(R.id.txt_distance);
                Intrinsics.checkNotNullExpressionValue(textView2, "it.txt_distance");
                TextView textView3 = (TextView) cornerConstraintLayout._$_findCachedViewById(R.id.txt_distance);
                Intrinsics.checkNotNullExpressionValue(textView3, "it.txt_distance");
                textView2.setText(textView3.getContext().getString(R.string.str_store_distance_away, formatDistanceToString));
            } else {
                TextView textView4 = (TextView) cornerConstraintLayout._$_findCachedViewById(R.id.txt_distance);
                Intrinsics.checkNotNullExpressionValue(textView4, "it.txt_distance");
                TextView textView5 = (TextView) cornerConstraintLayout._$_findCachedViewById(R.id.txt_distance);
                Intrinsics.checkNotNullExpressionValue(textView5, "it.txt_distance");
                textView4.setText(textView5.getContext().getString(R.string.str_unknown));
            }
            if (!this.store.getImages().isEmpty()) {
                ((RequestBuilder) ((RequestBuilder) Glide.with((TLImageView) cornerConstraintLayout._$_findCachedViewById(R.id.img_store)).load(this.store.getImages().get(0)).error((int) R.drawable.ic_placeholder_store)).placeholder(R.drawable.ic_placeholder_store)).into((TLImageView) cornerConstraintLayout._$_findCachedViewById(R.id.img_store));
            }
            if (this.store.isFavourite()) {
                ImageView imageView = (ImageView) cornerConstraintLayout._$_findCachedViewById(R.id.img_favourite_store);
                Intrinsics.checkNotNullExpressionValue(imageView, "it.img_favourite_store");
                imageView.setVisibility(0);
                return;
            }
            ImageView imageView2 = (ImageView) cornerConstraintLayout._$_findCachedViewById(R.id.img_favourite_store);
            Intrinsics.checkNotNullExpressionValue(imageView2, "it.img_favourite_store");
            imageView2.setVisibility(8);
        }
    }
}
