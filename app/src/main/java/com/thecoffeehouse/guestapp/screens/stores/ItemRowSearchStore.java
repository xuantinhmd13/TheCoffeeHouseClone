package com.thecoffeehouse.guestapp.screens.stores;

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
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\n\"\u00020\u000b¢\u0006\u0002\u0010\fJ\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001b\u001a\u00020\bR\u001a\u0010\r\u001a\u00020\u000eX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0006\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000b0\nX\u0004¢\u0006\u0004\n\u0002\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/ItemRowSearchStore;", "", "type", "Lcom/thecoffeehouse/guestapp/screens/stores/SearchStoreType;", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "onClickSelect", "Lkotlin/Function1;", "", "textViewAttribute", "", "Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "(Lcom/thecoffeehouse/guestapp/screens/stores/SearchStoreType;Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;Lkotlin/jvm/functions/Function1;[Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;)V", "layoutItemSearchStoreRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutItemSearchStoreRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setLayoutItemSearchStoreRoot", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "[Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "txtAddressSearchStore", "Landroid/widget/TextView;", "getTxtAddressSearchStore", "()Landroid/widget/TextView;", "setTxtAddressSearchStore", "(Landroid/widget/TextView;)V", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowSearchStore.kt */
public final class ItemRowSearchStore {
    public ConstraintLayout layoutItemSearchStoreRoot;
    private final Function1<Store, Unit> onClickSelect;
    private final Store store;
    private final TextViewAttribute[] textViewAttribute;
    public TextView txtAddressSearchStore;
    private final SearchStoreType type;

    public final void onResolve() {
    }

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSearchStore> {
        public void bindLoadMore(ItemRowSearchStore itemRowSearchStore) {
        }

        public LoadMoreViewBinder(ItemRowSearchStore itemRowSearchStore) {
            super(itemRowSearchStore);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSearchStore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchStore itemRowSearchStore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchStore itemRowSearchStore, int i) {
        }

        public ViewBinder(ItemRowSearchStore itemRowSearchStore) {
            super(itemRowSearchStore, R.layout.item_row_search_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchStore itemRowSearchStore) {
            itemRowSearchStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchStore != null && isNullable) {
                itemRowSearchStore.txtAddressSearchStore = null;
                itemRowSearchStore.layoutItemSearchStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchStore itemRowSearchStore, View view) {
            itemRowSearchStore.txtAddressSearchStore = (TextView) view.findViewById(R.id.txt_address_search_store);
            itemRowSearchStore.layoutItemSearchStoreRoot = (ConstraintLayout) view.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchStore itemRowSearchStore, View view) {
            view.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchStore.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSearchStore, View> {
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
        public void bindCollapse(ItemRowSearchStore itemRowSearchStore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSearchStore itemRowSearchStore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchStore itemRowSearchStore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSearchStore itemRowSearchStore, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowSearchStore itemRowSearchStore) {
            super(itemRowSearchStore, R.layout.item_row_search_store, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchStore itemRowSearchStore) {
            itemRowSearchStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchStore itemRowSearchStore, View view) {
            itemRowSearchStore.txtAddressSearchStore = (TextView) view.findViewById(R.id.txt_address_search_store);
            itemRowSearchStore.layoutItemSearchStoreRoot = (ConstraintLayout) view.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchStore itemRowSearchStore, View view) {
            view.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchStore.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSearchStore itemRowSearchStore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSearchStore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchStore itemRowSearchStore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchStore itemRowSearchStore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchStore itemRowSearchStore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSearchStore itemRowSearchStore) {
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
        public void bindViewPosition(ItemRowSearchStore itemRowSearchStore, int i) {
        }

        public SwipeViewBinder(ItemRowSearchStore itemRowSearchStore) {
            super(itemRowSearchStore, R.layout.item_row_search_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchStore itemRowSearchStore) {
            itemRowSearchStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchStore != null && isNullable) {
                itemRowSearchStore.txtAddressSearchStore = null;
                itemRowSearchStore.layoutItemSearchStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchStore itemRowSearchStore, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchStore.txtAddressSearchStore = (TextView) frameView.findViewById(R.id.txt_address_search_store);
            itemRowSearchStore.layoutItemSearchStoreRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchStore itemRowSearchStore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchStore.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.stores.Store, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowSearchStore(SearchStoreType searchStoreType, Store store2, Function1<? super Store, Unit> function1, TextViewAttribute... textViewAttributeArr) {
        Intrinsics.checkNotNullParameter(searchStoreType, "type");
        Intrinsics.checkNotNullParameter(function1, "onClickSelect");
        Intrinsics.checkNotNullParameter(textViewAttributeArr, "textViewAttribute");
        this.type = searchStoreType;
        this.store = store2;
        this.onClickSelect = function1;
        this.textViewAttribute = textViewAttributeArr;
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSearchStore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSearchStore itemRowSearchStore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSearchStore itemRowSearchStore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSearchStore itemRowSearchStore) {
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
        public void bindSwipeOut(ItemRowSearchStore itemRowSearchStore) {
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
        public void bindViewPosition(ItemRowSearchStore itemRowSearchStore, int i) {
        }

        public DirectionalViewBinder(ItemRowSearchStore itemRowSearchStore) {
            super(itemRowSearchStore, R.layout.item_row_search_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSearchStore itemRowSearchStore) {
            itemRowSearchStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSearchStore itemRowSearchStore = (ItemRowSearchStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSearchStore != null && isNullable) {
                itemRowSearchStore.txtAddressSearchStore = null;
                itemRowSearchStore.layoutItemSearchStoreRoot = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSearchStore itemRowSearchStore, SwipePlaceHolderView.FrameView frameView) {
            itemRowSearchStore.txtAddressSearchStore = (TextView) frameView.findViewById(R.id.txt_address_search_store);
            itemRowSearchStore.layoutItemSearchStoreRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_item_search_store_root);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSearchStore itemRowSearchStore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_item_search_store_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSearchStore.onClick();
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

    public final void onClick() {
        this.onClickSelect.invoke(this.store);
    }
}
