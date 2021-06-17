package com.thecoffeehouse.guestapp.screens.stores;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007J\u0006\u0010\u000f\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/ItemRowImageStore;", "", "any", "onClickListener", "Lkotlin/Function1;", "", "", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "imgImage", "Landroid/widget/ImageView;", "getImgImage", "()Landroid/widget/ImageView;", "setImgImage", "(Landroid/widget/ImageView;)V", "mPosition", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowImageStore.kt */
public final class ItemRowImageStore {
    private final Object any;
    public ImageView imgImage;
    public int mPosition;
    private final Function1<Integer, Unit> onClickListener;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowImageStore> {
        public void bindLoadMore(ItemRowImageStore itemRowImageStore) {
        }

        public LoadMoreViewBinder(ItemRowImageStore itemRowImageStore) {
            super(itemRowImageStore);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowImageStore(Object obj, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(obj, "any");
        Intrinsics.checkNotNullParameter(function1, "onClickListener");
        this.any = obj;
        this.onClickListener = function1;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowImageStore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageStore itemRowImageStore, View view) {
        }

        public ViewBinder(ItemRowImageStore itemRowImageStore) {
            super(itemRowImageStore, R.layout.item_row_image_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageStore itemRowImageStore) {
            itemRowImageStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowImageStore != null && isNullable) {
                itemRowImageStore.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageStore itemRowImageStore, int i) {
            itemRowImageStore.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageStore itemRowImageStore, View view) {
            itemRowImageStore.imgImage = (ImageView) view.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowImageStore itemRowImageStore, View view) {
            view.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowImageStore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowImageStore.onClick();
                }
            });
        }
    }

    public final ImageView getImgImage() {
        ImageView imageView = this.imgImage;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        return imageView;
    }

    public final void setImgImage(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgImage = imageView;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowImageStore, View> {
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
        public void bindCollapse(ItemRowImageStore itemRowImageStore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowImageStore itemRowImageStore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageStore itemRowImageStore, View view) {
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

        public ExpandableViewBinder(ItemRowImageStore itemRowImageStore) {
            super(itemRowImageStore, R.layout.item_row_image_store, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageStore itemRowImageStore) {
            itemRowImageStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageStore itemRowImageStore, int i) {
            itemRowImageStore.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageStore itemRowImageStore, View view) {
            itemRowImageStore.imgImage = (ImageView) view.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowImageStore itemRowImageStore, View view) {
            view.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowImageStore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowImageStore.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowImageStore itemRowImageStore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowImageStore.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowImageStore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageStore itemRowImageStore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowImageStore itemRowImageStore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowImageStore itemRowImageStore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowImageStore itemRowImageStore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowImageStore itemRowImageStore) {
            super(itemRowImageStore, R.layout.item_row_image_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageStore itemRowImageStore) {
            itemRowImageStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowImageStore != null && isNullable) {
                itemRowImageStore.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageStore itemRowImageStore, int i) {
            itemRowImageStore.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageStore itemRowImageStore, SwipePlaceHolderView.FrameView frameView) {
            itemRowImageStore.imgImage = (ImageView) frameView.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowImageStore itemRowImageStore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowImageStore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowImageStore.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowImageStore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowImageStore itemRowImageStore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowImageStore itemRowImageStore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowImageStore itemRowImageStore) {
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
        public void bindSwipeOut(ItemRowImageStore itemRowImageStore) {
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

        public DirectionalViewBinder(ItemRowImageStore itemRowImageStore) {
            super(itemRowImageStore, R.layout.item_row_image_store, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowImageStore itemRowImageStore) {
            itemRowImageStore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowImageStore itemRowImageStore = (ItemRowImageStore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowImageStore != null && isNullable) {
                itemRowImageStore.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowImageStore itemRowImageStore, int i) {
            itemRowImageStore.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowImageStore itemRowImageStore, SwipePlaceHolderView.FrameView frameView) {
            itemRowImageStore.imgImage = (ImageView) frameView.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowImageStore itemRowImageStore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.stores.ItemRowImageStore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowImageStore.onClick();
                }
            });
        }
    }

    public final void onClick() {
        this.onClickListener.invoke(Integer.valueOf(this.mPosition));
    }

    public final void onResolve() {
        ImageView imageView = this.imgImage;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        RequestBuilder<Drawable> load = Glide.with(imageView.getContext()).load(this.any);
        ImageView imageView2 = this.imgImage;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        load.into(imageView2);
    }
}
