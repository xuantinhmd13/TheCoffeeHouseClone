package com.thecoffeehouse.guestapp.screens.home;

import android.view.View;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010\u000e\u001a\u00020\u0006R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/ItemRowMediaBox;", "", "mediaBox", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;", "onClick", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;Lkotlin/jvm/functions/Function1;)V", "imgMediaBox", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgMediaBox", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgMediaBox", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowMediaBox.kt */
public final class ItemRowMediaBox {
    public TLImageView imgMediaBox;
    private final Notification mediaBox;
    private final Function1<Notification, Unit> onClick;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowMediaBox> {
        public void bindLoadMore(ItemRowMediaBox itemRowMediaBox) {
        }

        public LoadMoreViewBinder(ItemRowMediaBox itemRowMediaBox) {
            super(itemRowMediaBox);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowMediaBox, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowMediaBox itemRowMediaBox, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowMediaBox itemRowMediaBox, int i) {
        }

        public ViewBinder(ItemRowMediaBox itemRowMediaBox) {
            super(itemRowMediaBox, R.layout.item_row_image_media_box, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowMediaBox itemRowMediaBox) {
            itemRowMediaBox.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
            boolean isNullable = isNullable();
            if (itemRowMediaBox != null && isNullable) {
                itemRowMediaBox.imgMediaBox = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowMediaBox itemRowMediaBox, View view) {
            itemRowMediaBox.imgMediaBox = (TLImageView) view.findViewById(R.id.img_image_media_box);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowMediaBox itemRowMediaBox, View view) {
            view.findViewById(R.id.img_image_media_box).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowMediaBox.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowMediaBox.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowMediaBox, View> {
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
        public void bindCollapse(ItemRowMediaBox itemRowMediaBox) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowMediaBox itemRowMediaBox) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowMediaBox itemRowMediaBox, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowMediaBox itemRowMediaBox, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowMediaBox itemRowMediaBox) {
            super(itemRowMediaBox, R.layout.item_row_image_media_box, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowMediaBox itemRowMediaBox) {
            itemRowMediaBox.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowMediaBox itemRowMediaBox, View view) {
            itemRowMediaBox.imgMediaBox = (TLImageView) view.findViewById(R.id.img_image_media_box);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowMediaBox itemRowMediaBox, View view) {
            view.findViewById(R.id.img_image_media_box).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowMediaBox.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowMediaBox.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowMediaBox itemRowMediaBox, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowMediaBox.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowMediaBox, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowMediaBox itemRowMediaBox, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowMediaBox itemRowMediaBox) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowMediaBox itemRowMediaBox) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowMediaBox itemRowMediaBox) {
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
        public void bindViewPosition(ItemRowMediaBox itemRowMediaBox, int i) {
        }

        public SwipeViewBinder(ItemRowMediaBox itemRowMediaBox) {
            super(itemRowMediaBox, R.layout.item_row_image_media_box, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowMediaBox itemRowMediaBox) {
            itemRowMediaBox.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
            boolean isNullable = isNullable();
            if (itemRowMediaBox != null && isNullable) {
                itemRowMediaBox.imgMediaBox = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowMediaBox itemRowMediaBox, SwipePlaceHolderView.FrameView frameView) {
            itemRowMediaBox.imgMediaBox = (TLImageView) frameView.findViewById(R.id.img_image_media_box);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowMediaBox itemRowMediaBox, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.img_image_media_box).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowMediaBox.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowMediaBox.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowMediaBox(Notification notification, Function1<? super Notification, Unit> function1) {
        Intrinsics.checkNotNullParameter(notification, "mediaBox");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.mediaBox = notification;
        this.onClick = function1;
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowMediaBox, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowMediaBox itemRowMediaBox, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowMediaBox itemRowMediaBox) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowMediaBox itemRowMediaBox) {
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
        public void bindSwipeOut(ItemRowMediaBox itemRowMediaBox) {
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
        public void bindViewPosition(ItemRowMediaBox itemRowMediaBox, int i) {
        }

        public DirectionalViewBinder(ItemRowMediaBox itemRowMediaBox) {
            super(itemRowMediaBox, R.layout.item_row_image_media_box, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowMediaBox itemRowMediaBox) {
            itemRowMediaBox.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowMediaBox itemRowMediaBox = (ItemRowMediaBox) getResolver();
            boolean isNullable = isNullable();
            if (itemRowMediaBox != null && isNullable) {
                itemRowMediaBox.imgMediaBox = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowMediaBox itemRowMediaBox, SwipePlaceHolderView.FrameView frameView) {
            itemRowMediaBox.imgMediaBox = (TLImageView) frameView.findViewById(R.id.img_image_media_box);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowMediaBox itemRowMediaBox, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.img_image_media_box).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowMediaBox.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowMediaBox.onClick();
                }
            });
        }
    }

    public final TLImageView getImgMediaBox() {
        TLImageView tLImageView = this.imgMediaBox;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgMediaBox");
        }
        return tLImageView;
    }

    public final void setImgMediaBox(TLImageView tLImageView) {
        Intrinsics.checkNotNullParameter(tLImageView, "<set-?>");
        this.imgMediaBox = tLImageView;
    }

    public final void onClick() {
        this.onClick.invoke(this.mediaBox);
    }

    public final void onResolve() {
        TLImageView tLImageView = this.imgMediaBox;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgMediaBox");
        }
        tLImageView.post(new ItemRowMediaBox$onResolve$1(this));
    }
}
