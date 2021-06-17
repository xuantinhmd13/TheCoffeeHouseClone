package com.thecoffeehouse.guestapp.screens.more;

import android.view.View;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0013\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0005J\u0006\u0010\u0002\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ItemRowAccountsAnonymousMore;", "", "onClickLogin", "Lkotlin/Function0;", "", "(Lkotlin/jvm/functions/Function0;)V", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowAccountsAnonymousMore.kt */
public final class ItemRowAccountsAnonymousMore {
    private final Function0<Unit> onClickLogin;

    public final void onResolve() {
    }

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowAccountsAnonymousMore> {
        public void bindLoadMore(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
        }

        public LoadMoreViewBinder(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            super(itemRowAccountsAnonymousMore);
        }
    }

    public ItemRowAccountsAnonymousMore(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onClickLogin");
        this.onClickLogin = function0;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowAccountsAnonymousMore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
        }

        public ViewBinder(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            super(itemRowAccountsAnonymousMore, R.layout.item_row_accounts_anonymous_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            itemRowAccountsAnonymousMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAccountsAnonymousMore != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
            view.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsAnonymousMore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsAnonymousMore.onClickLogin();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowAccountsAnonymousMore, View> {
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
        public void bindCollapse(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            super(itemRowAccountsAnonymousMore, R.layout.item_row_accounts_anonymous_more, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            itemRowAccountsAnonymousMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
            view.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsAnonymousMore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsAnonymousMore.onClickLogin();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsAnonymousMore.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
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
        public void bindViewPosition(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            super(itemRowAccountsAnonymousMore, R.layout.item_row_accounts_anonymous_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            itemRowAccountsAnonymousMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAccountsAnonymousMore != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsAnonymousMore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsAnonymousMore.onClickLogin();
                }
            });
        }
    }

    public final void onClickLogin() {
        this.onClickLogin.invoke();
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
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
        public void bindSwipeOut(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
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
        public void bindViewPosition(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView frameView) {
        }

        public DirectionalViewBinder(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            super(itemRowAccountsAnonymousMore, R.layout.item_row_accounts_anonymous_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore) {
            itemRowAccountsAnonymousMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore = (ItemRowAccountsAnonymousMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowAccountsAnonymousMore != null && isNullable) {
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowAccountsAnonymousMore itemRowAccountsAnonymousMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowAccountsAnonymousMore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowAccountsAnonymousMore.onClickLogin();
                }
            });
        }
    }
}
