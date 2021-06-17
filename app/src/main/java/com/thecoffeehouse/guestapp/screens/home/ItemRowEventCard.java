package com.thecoffeehouse.guestapp.screens.home;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.load.resource.drawable.DrawableTransitionOptions;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.config.EventCard;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010\u0010\u001a\u00020\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0012\u0010\u000e\u001a\u00020\u000f8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/ItemRowEventCard;", "", "eventCard", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/EventCard;", "onClick", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/config/EventCard;Lkotlin/jvm/functions/Function1;)V", "imgImage", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgImage", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgImage", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "mPosition", "", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowEventCard.kt */
public final class ItemRowEventCard {
    private final EventCard eventCard;
    public TLImageView imgImage;
    public int mPosition;
    private final Function1<EventCard, Unit> onClick;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowEventCard> {
        public void bindLoadMore(ItemRowEventCard itemRowEventCard) {
        }

        public LoadMoreViewBinder(ItemRowEventCard itemRowEventCard) {
            super(itemRowEventCard);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowEventCard, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowEventCard itemRowEventCard, View view) {
        }

        public ViewBinder(ItemRowEventCard itemRowEventCard) {
            super(itemRowEventCard, R.layout.item_row_event_card, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowEventCard itemRowEventCard) {
            itemRowEventCard.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
            boolean isNullable = isNullable();
            if (itemRowEventCard != null && isNullable) {
                itemRowEventCard.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowEventCard itemRowEventCard, int i) {
            itemRowEventCard.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowEventCard itemRowEventCard, View view) {
            itemRowEventCard.imgImage = (TLImageView) view.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowEventCard itemRowEventCard, View view) {
            view.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowEventCard.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowEventCard.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.common.config.EventCard, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowEventCard(EventCard eventCard2, Function1<? super EventCard, Unit> function1) {
        Intrinsics.checkNotNullParameter(eventCard2, "eventCard");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.eventCard = eventCard2;
        this.onClick = function1;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowEventCard, View> {
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
        public void bindCollapse(ItemRowEventCard itemRowEventCard) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowEventCard itemRowEventCard) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowEventCard itemRowEventCard, View view) {
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

        public ExpandableViewBinder(ItemRowEventCard itemRowEventCard) {
            super(itemRowEventCard, R.layout.item_row_event_card, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowEventCard itemRowEventCard) {
            itemRowEventCard.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowEventCard itemRowEventCard, int i) {
            itemRowEventCard.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowEventCard itemRowEventCard, View view) {
            itemRowEventCard.imgImage = (TLImageView) view.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowEventCard itemRowEventCard, View view) {
            view.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowEventCard.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowEventCard.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowEventCard itemRowEventCard, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowEventCard.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowEventCard, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowEventCard itemRowEventCard, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowEventCard itemRowEventCard) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowEventCard itemRowEventCard) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowEventCard itemRowEventCard) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowEventCard itemRowEventCard) {
            super(itemRowEventCard, R.layout.item_row_event_card, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowEventCard itemRowEventCard) {
            itemRowEventCard.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
            boolean isNullable = isNullable();
            if (itemRowEventCard != null && isNullable) {
                itemRowEventCard.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowEventCard itemRowEventCard, int i) {
            itemRowEventCard.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowEventCard itemRowEventCard, SwipePlaceHolderView.FrameView frameView) {
            itemRowEventCard.imgImage = (TLImageView) frameView.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowEventCard itemRowEventCard, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowEventCard.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowEventCard.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowEventCard, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowEventCard itemRowEventCard, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowEventCard itemRowEventCard) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowEventCard itemRowEventCard) {
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
        public void bindSwipeOut(ItemRowEventCard itemRowEventCard) {
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

        public DirectionalViewBinder(ItemRowEventCard itemRowEventCard) {
            super(itemRowEventCard, R.layout.item_row_event_card, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowEventCard itemRowEventCard) {
            itemRowEventCard.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowEventCard itemRowEventCard = (ItemRowEventCard) getResolver();
            boolean isNullable = isNullable();
            if (itemRowEventCard != null && isNullable) {
                itemRowEventCard.imgImage = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowEventCard itemRowEventCard, int i) {
            itemRowEventCard.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowEventCard itemRowEventCard, SwipePlaceHolderView.FrameView frameView) {
            itemRowEventCard.imgImage = (TLImageView) frameView.findViewById(R.id.imgImage);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowEventCard itemRowEventCard, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.imgImage).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.home.ItemRowEventCard.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowEventCard.onClick();
                }
            });
        }
    }

    public final void onClick() {
        this.onClick.invoke(this.eventCard);
    }

    public final TLImageView getImgImage() {
        TLImageView tLImageView = this.imgImage;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        return tLImageView;
    }

    public final void setImgImage(TLImageView tLImageView) {
        Intrinsics.checkNotNullParameter(tLImageView, "<set-?>");
        this.imgImage = tLImageView;
    }

    public final void onResolve() {
        TLImageView tLImageView = this.imgImage;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        RequestBuilder<Drawable> transition = Glide.with(tLImageView.getContext()).load(this.eventCard.getImage()).transition(DrawableTransitionOptions.withCrossFade());
        TLImageView tLImageView2 = this.imgImage;
        if (tLImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgImage");
        }
        transition.into(tLImageView2);
    }
}
