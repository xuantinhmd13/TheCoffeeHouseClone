package com.thecoffeehouse.guestapp.screens.more;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0007\u0018\u00002\u00020\u0001B=\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\bJ\u0006\u0010\u0018\u001a\u00020\u0004J\u0006\u0010\u0002\u001a\u00020\u0004J\u0006\u0010\u0006\u001a\u00020\u0004J\u0006\u0010\u0007\u001a\u00020\u0004J\u0006\u0010\u0019\u001a\u00020\u0004R\u001a\u0010\t\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u000f\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\f\"\u0004\b\u0011\u0010\u000eR\u001a\u0010\u0012\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\f\"\u0004\b\u0014\u0010\u000eR\u001a\u0010\u0015\u001a\u00020\nX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\f\"\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ItemRowToolsMore;", "", "onClickMusicPlaying", "Lkotlin/Function0;", "", "onClickTerms", "onClickNewsAndPromotion", "onClickYourOrders", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "layoutHelp", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getLayoutHelp", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setLayoutHelp", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "layoutMusicPlaying", "getLayoutMusicPlaying", "setLayoutMusicPlaying", "layoutNewsAndPromotion", "getLayoutNewsAndPromotion", "setLayoutNewsAndPromotion", "layoutYourOrders", "getLayoutYourOrders", "setLayoutYourOrders", "onClickHelp", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowToolsMore.kt */
public final class ItemRowToolsMore {
    public ConstraintLayout layoutHelp;
    public ConstraintLayout layoutMusicPlaying;
    public ConstraintLayout layoutNewsAndPromotion;
    public ConstraintLayout layoutYourOrders;
    private final Function0<Unit> onClickMusicPlaying;
    private final Function0<Unit> onClickNewsAndPromotion;
    private final Function0<Unit> onClickTerms;
    private final Function0<Unit> onClickYourOrders;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowToolsMore> {
        public void bindLoadMore(ItemRowToolsMore itemRowToolsMore) {
        }

        public LoadMoreViewBinder(ItemRowToolsMore itemRowToolsMore) {
            super(itemRowToolsMore);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowToolsMore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowToolsMore itemRowToolsMore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowToolsMore itemRowToolsMore, int i) {
        }

        public ViewBinder(ItemRowToolsMore itemRowToolsMore) {
            super(itemRowToolsMore, R.layout.item_row_tools_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowToolsMore itemRowToolsMore) {
            itemRowToolsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowToolsMore != null && isNullable) {
                itemRowToolsMore.layoutNewsAndPromotion = null;
                itemRowToolsMore.layoutYourOrders = null;
                itemRowToolsMore.layoutHelp = null;
                itemRowToolsMore.layoutMusicPlaying = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowToolsMore itemRowToolsMore, View view) {
            itemRowToolsMore.layoutNewsAndPromotion = (ConstraintLayout) view.findViewById(R.id.layout_tool_news);
            itemRowToolsMore.layoutYourOrders = (ConstraintLayout) view.findViewById(R.id.layout_tools_yours_order);
            itemRowToolsMore.layoutHelp = (ConstraintLayout) view.findViewById(R.id.layout_tool_terms);
            itemRowToolsMore.layoutMusicPlaying = (ConstraintLayout) view.findViewById(R.id.layout_tool_music_playing);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowToolsMore itemRowToolsMore, View view) {
            view.findViewById(R.id.layout_tool_news).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickNewsAndPromotion();
                }
            });
            view.findViewById(R.id.layout_tools_yours_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickYourOrders();
                }
            });
            view.findViewById(R.id.layout_tool_terms).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickHelp();
                }
            });
            view.findViewById(R.id.layout_tool_music_playing).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickMusicPlaying();
                }
            });
        }
    }

    public ItemRowToolsMore(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
        Intrinsics.checkNotNullParameter(function0, "onClickMusicPlaying");
        Intrinsics.checkNotNullParameter(function02, "onClickTerms");
        Intrinsics.checkNotNullParameter(function03, "onClickNewsAndPromotion");
        Intrinsics.checkNotNullParameter(function04, "onClickYourOrders");
        this.onClickMusicPlaying = function0;
        this.onClickTerms = function02;
        this.onClickNewsAndPromotion = function03;
        this.onClickYourOrders = function04;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowToolsMore, View> {
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
        public void bindCollapse(ItemRowToolsMore itemRowToolsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowToolsMore itemRowToolsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowToolsMore itemRowToolsMore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowToolsMore itemRowToolsMore, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowToolsMore itemRowToolsMore) {
            super(itemRowToolsMore, R.layout.item_row_tools_more, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowToolsMore itemRowToolsMore) {
            itemRowToolsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowToolsMore itemRowToolsMore, View view) {
            itemRowToolsMore.layoutNewsAndPromotion = (ConstraintLayout) view.findViewById(R.id.layout_tool_news);
            itemRowToolsMore.layoutYourOrders = (ConstraintLayout) view.findViewById(R.id.layout_tools_yours_order);
            itemRowToolsMore.layoutHelp = (ConstraintLayout) view.findViewById(R.id.layout_tool_terms);
            itemRowToolsMore.layoutMusicPlaying = (ConstraintLayout) view.findViewById(R.id.layout_tool_music_playing);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowToolsMore itemRowToolsMore, View view) {
            view.findViewById(R.id.layout_tool_news).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickNewsAndPromotion();
                }
            });
            view.findViewById(R.id.layout_tools_yours_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickYourOrders();
                }
            });
            view.findViewById(R.id.layout_tool_terms).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ExpandableViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickHelp();
                }
            });
            view.findViewById(R.id.layout_tool_music_playing).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ExpandableViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickMusicPlaying();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowToolsMore itemRowToolsMore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.ExpandableViewBinder.AnonymousClass5 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowToolsMore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowToolsMore itemRowToolsMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowToolsMore itemRowToolsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowToolsMore itemRowToolsMore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowToolsMore itemRowToolsMore) {
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
        public void bindViewPosition(ItemRowToolsMore itemRowToolsMore, int i) {
        }

        public SwipeViewBinder(ItemRowToolsMore itemRowToolsMore) {
            super(itemRowToolsMore, R.layout.item_row_tools_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowToolsMore itemRowToolsMore) {
            itemRowToolsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowToolsMore != null && isNullable) {
                itemRowToolsMore.layoutNewsAndPromotion = null;
                itemRowToolsMore.layoutYourOrders = null;
                itemRowToolsMore.layoutHelp = null;
                itemRowToolsMore.layoutMusicPlaying = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowToolsMore itemRowToolsMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowToolsMore.layoutNewsAndPromotion = (ConstraintLayout) frameView.findViewById(R.id.layout_tool_news);
            itemRowToolsMore.layoutYourOrders = (ConstraintLayout) frameView.findViewById(R.id.layout_tools_yours_order);
            itemRowToolsMore.layoutHelp = (ConstraintLayout) frameView.findViewById(R.id.layout_tool_terms);
            itemRowToolsMore.layoutMusicPlaying = (ConstraintLayout) frameView.findViewById(R.id.layout_tool_music_playing);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowToolsMore itemRowToolsMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_tool_news).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickNewsAndPromotion();
                }
            });
            frameView.findViewById(R.id.layout_tools_yours_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.SwipeViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickYourOrders();
                }
            });
            frameView.findViewById(R.id.layout_tool_terms).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.SwipeViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickHelp();
                }
            });
            frameView.findViewById(R.id.layout_tool_music_playing).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.SwipeViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickMusicPlaying();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowToolsMore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowToolsMore itemRowToolsMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowToolsMore itemRowToolsMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowToolsMore itemRowToolsMore) {
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
        public void bindSwipeOut(ItemRowToolsMore itemRowToolsMore) {
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
        public void bindViewPosition(ItemRowToolsMore itemRowToolsMore, int i) {
        }

        public DirectionalViewBinder(ItemRowToolsMore itemRowToolsMore) {
            super(itemRowToolsMore, R.layout.item_row_tools_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowToolsMore itemRowToolsMore) {
            itemRowToolsMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowToolsMore itemRowToolsMore = (ItemRowToolsMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowToolsMore != null && isNullable) {
                itemRowToolsMore.layoutNewsAndPromotion = null;
                itemRowToolsMore.layoutYourOrders = null;
                itemRowToolsMore.layoutHelp = null;
                itemRowToolsMore.layoutMusicPlaying = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowToolsMore itemRowToolsMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowToolsMore.layoutNewsAndPromotion = (ConstraintLayout) frameView.findViewById(R.id.layout_tool_news);
            itemRowToolsMore.layoutYourOrders = (ConstraintLayout) frameView.findViewById(R.id.layout_tools_yours_order);
            itemRowToolsMore.layoutHelp = (ConstraintLayout) frameView.findViewById(R.id.layout_tool_terms);
            itemRowToolsMore.layoutMusicPlaying = (ConstraintLayout) frameView.findViewById(R.id.layout_tool_music_playing);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowToolsMore itemRowToolsMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_tool_news).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickNewsAndPromotion();
                }
            });
            frameView.findViewById(R.id.layout_tools_yours_order).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.DirectionalViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickYourOrders();
                }
            });
            frameView.findViewById(R.id.layout_tool_terms).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.DirectionalViewBinder.AnonymousClass3 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickHelp();
                }
            });
            frameView.findViewById(R.id.layout_tool_music_playing).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowToolsMore.DirectionalViewBinder.AnonymousClass4 */

                public void onClick(View view) {
                    itemRowToolsMore.onClickMusicPlaying();
                }
            });
        }
    }

    public final ConstraintLayout getLayoutNewsAndPromotion() {
        ConstraintLayout constraintLayout = this.layoutNewsAndPromotion;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNewsAndPromotion");
        }
        return constraintLayout;
    }

    public final void setLayoutNewsAndPromotion(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.layoutNewsAndPromotion = constraintLayout;
    }

    public final ConstraintLayout getLayoutYourOrders() {
        ConstraintLayout constraintLayout = this.layoutYourOrders;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutYourOrders");
        }
        return constraintLayout;
    }

    public final void setLayoutYourOrders(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.layoutYourOrders = constraintLayout;
    }

    public final ConstraintLayout getLayoutHelp() {
        ConstraintLayout constraintLayout = this.layoutHelp;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelp");
        }
        return constraintLayout;
    }

    public final void setLayoutHelp(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.layoutHelp = constraintLayout;
    }

    public final ConstraintLayout getLayoutMusicPlaying() {
        ConstraintLayout constraintLayout = this.layoutMusicPlaying;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutMusicPlaying");
        }
        return constraintLayout;
    }

    public final void setLayoutMusicPlaying(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.layoutMusicPlaying = constraintLayout;
    }

    public final void onClickNewsAndPromotion() {
        this.onClickNewsAndPromotion.invoke();
    }

    public final void onClickYourOrders() {
        this.onClickYourOrders.invoke();
    }

    public final void onClickHelp() {
        this.onClickTerms.invoke();
    }

    public final void onClickMusicPlaying() {
        this.onClickMusicPlaying.invoke();
    }

    public final void onResolve() {
        ConstraintLayout constraintLayout = this.layoutNewsAndPromotion;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNewsAndPromotion");
        }
        ((ImageView) constraintLayout.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_news_and_promotion);
        ConstraintLayout constraintLayout2 = this.layoutNewsAndPromotion;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNewsAndPromotion");
        }
        ImageView imageView = (ImageView) constraintLayout2.findViewById(R.id.img_icon_left);
        Intrinsics.checkNotNullExpressionValue(imageView, "layoutNewsAndPromotion.img_icon_left");
        imageView.setVisibility(4);
        ConstraintLayout constraintLayout3 = this.layoutNewsAndPromotion;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNewsAndPromotion");
        }
        TextView textView = (TextView) constraintLayout3.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutNewsAndPromotion.txt_title_tools");
        ConstraintLayout constraintLayout4 = this.layoutNewsAndPromotion;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNewsAndPromotion");
        }
        textView.setText(constraintLayout4.getContext().getString(R.string.str_news_and_promotions));
        ConstraintLayout constraintLayout5 = this.layoutYourOrders;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutYourOrders");
        }
        ((ImageView) constraintLayout5.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_order_history);
        ConstraintLayout constraintLayout6 = this.layoutYourOrders;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutYourOrders");
        }
        ImageView imageView2 = (ImageView) constraintLayout6.findViewById(R.id.img_icon_left);
        Intrinsics.checkNotNullExpressionValue(imageView2, "layoutYourOrders.img_icon_left");
        imageView2.setVisibility(4);
        ConstraintLayout constraintLayout7 = this.layoutYourOrders;
        if (constraintLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutYourOrders");
        }
        TextView textView2 = (TextView) constraintLayout7.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutYourOrders.txt_title_tools");
        ConstraintLayout constraintLayout8 = this.layoutNewsAndPromotion;
        if (constraintLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutNewsAndPromotion");
        }
        textView2.setText(constraintLayout8.getContext().getString(R.string.str_order_history));
        ConstraintLayout constraintLayout9 = this.layoutMusicPlaying;
        if (constraintLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutMusicPlaying");
        }
        ((ImageView) constraintLayout9.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_music);
        ConstraintLayout constraintLayout10 = this.layoutMusicPlaying;
        if (constraintLayout10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutMusicPlaying");
        }
        ImageView imageView3 = (ImageView) constraintLayout10.findViewById(R.id.img_icon_left);
        Intrinsics.checkNotNullExpressionValue(imageView3, "layoutMusicPlaying.img_icon_left");
        imageView3.setVisibility(4);
        ConstraintLayout constraintLayout11 = this.layoutMusicPlaying;
        if (constraintLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutMusicPlaying");
        }
        TextView textView3 = (TextView) constraintLayout11.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutMusicPlaying.txt_title_tools");
        ConstraintLayout constraintLayout12 = this.layoutMusicPlaying;
        if (constraintLayout12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutMusicPlaying");
        }
        textView3.setText(constraintLayout12.getContext().getString(R.string.str_music_playing));
        ConstraintLayout constraintLayout13 = this.layoutHelp;
        if (constraintLayout13 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelp");
        }
        ((ImageView) constraintLayout13.findViewById(R.id.img_icon_tools)).setImageResource(R.drawable.ic_badge_support);
        ConstraintLayout constraintLayout14 = this.layoutHelp;
        if (constraintLayout14 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelp");
        }
        TextView textView4 = (TextView) constraintLayout14.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView4, "layoutHelp.txt_title_tools");
        ConstraintLayout constraintLayout15 = this.layoutHelp;
        if (constraintLayout15 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelp");
        }
        textView4.setText(constraintLayout15.getContext().getString(R.string.str_terms));
        ConstraintLayout constraintLayout16 = this.layoutHelp;
        if (constraintLayout16 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutHelp");
        }
        ImageView imageView4 = (ImageView) constraintLayout16.findViewById(R.id.img_icon_left);
        Intrinsics.checkNotNullExpressionValue(imageView4, "layoutHelp.img_icon_left");
        imageView4.setVisibility(4);
    }
}
