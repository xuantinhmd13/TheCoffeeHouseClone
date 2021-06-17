package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import com.bumptech.glide.Glide;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010%\u001a\u00020\u0006R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u0012\u0010\u001a\u001a\u00020\u001b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001dX.¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u001f\"\u0004\b$\u0010!¨\u0006&"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/ItemRowSmallRewards;", "", "reward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "onClick", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;Lkotlin/jvm/functions/Function1;)V", "imgLogo", "Landroid/widget/ImageView;", "getImgLogo", "()Landroid/widget/ImageView;", "setImgLogo", "(Landroid/widget/ImageView;)V", "imgRewards", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgRewards", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgRewards", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "mLayoutFeatureRewardRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMLayoutFeatureRewardRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMLayoutFeatureRewardRoot", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mPosition", "", "txtRewardContent", "Landroid/widget/TextView;", "getTxtRewardContent", "()Landroid/widget/TextView;", "setTxtRewardContent", "(Landroid/widget/TextView;)V", "txtRewardPoints", "getTxtRewardPoints", "setTxtRewardPoints", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowSmallRewards.kt */
public final class ItemRowSmallRewards {
    public ImageView imgLogo;
    public TLImageView imgRewards;
    public ConstraintLayout mLayoutFeatureRewardRoot;
    public int mPosition;
    private final Function1<Reward, Unit> onClick;
    private final Reward reward;
    public TextView txtRewardContent;
    public TextView txtRewardPoints;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSmallRewards> {
        public void bindLoadMore(ItemRowSmallRewards itemRowSmallRewards) {
        }

        public LoadMoreViewBinder(ItemRowSmallRewards itemRowSmallRewards) {
            super(itemRowSmallRewards);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.rewards.Reward, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowSmallRewards(Reward reward2, Function1<? super Reward, Unit> function1) {
        Intrinsics.checkNotNullParameter(reward2, "reward");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.reward = reward2;
        this.onClick = function1;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSmallRewards, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSmallRewards itemRowSmallRewards, View view) {
        }

        public ViewBinder(ItemRowSmallRewards itemRowSmallRewards) {
            super(itemRowSmallRewards, R.layout.item_row_small_reward, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSmallRewards itemRowSmallRewards) {
            itemRowSmallRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSmallRewards != null && isNullable) {
                itemRowSmallRewards.imgRewards = null;
                itemRowSmallRewards.mLayoutFeatureRewardRoot = null;
                itemRowSmallRewards.imgLogo = null;
                itemRowSmallRewards.txtRewardContent = null;
                itemRowSmallRewards.txtRewardPoints = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSmallRewards itemRowSmallRewards, int i) {
            itemRowSmallRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSmallRewards itemRowSmallRewards, View view) {
            itemRowSmallRewards.imgRewards = (TLImageView) view.findViewById(R.id.imgRewards);
            itemRowSmallRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) view.findViewById(R.id.layout_feature_reward_root);
            itemRowSmallRewards.imgLogo = (ImageView) view.findViewById(R.id.imgLogo);
            itemRowSmallRewards.txtRewardContent = (TextView) view.findViewById(R.id.txtRewardContent);
            itemRowSmallRewards.txtRewardPoints = (TextView) view.findViewById(R.id.txtRewardPoints);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSmallRewards itemRowSmallRewards, View view) {
            view.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowSmallRewards.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSmallRewards.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSmallRewards, View> {
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
        public void bindCollapse(ItemRowSmallRewards itemRowSmallRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSmallRewards itemRowSmallRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSmallRewards itemRowSmallRewards, View view) {
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

        public ExpandableViewBinder(ItemRowSmallRewards itemRowSmallRewards) {
            super(itemRowSmallRewards, R.layout.item_row_small_reward, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSmallRewards itemRowSmallRewards) {
            itemRowSmallRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSmallRewards itemRowSmallRewards, int i) {
            itemRowSmallRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSmallRewards itemRowSmallRewards, View view) {
            itemRowSmallRewards.imgRewards = (TLImageView) view.findViewById(R.id.imgRewards);
            itemRowSmallRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) view.findViewById(R.id.layout_feature_reward_root);
            itemRowSmallRewards.imgLogo = (ImageView) view.findViewById(R.id.imgLogo);
            itemRowSmallRewards.txtRewardContent = (TextView) view.findViewById(R.id.txtRewardContent);
            itemRowSmallRewards.txtRewardPoints = (TextView) view.findViewById(R.id.txtRewardPoints);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSmallRewards itemRowSmallRewards, View view) {
            view.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowSmallRewards.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSmallRewards.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSmallRewards itemRowSmallRewards, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowSmallRewards.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSmallRewards, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSmallRewards itemRowSmallRewards, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSmallRewards itemRowSmallRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSmallRewards itemRowSmallRewards) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSmallRewards itemRowSmallRewards) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowSmallRewards itemRowSmallRewards) {
            super(itemRowSmallRewards, R.layout.item_row_small_reward, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSmallRewards itemRowSmallRewards) {
            itemRowSmallRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSmallRewards != null && isNullable) {
                itemRowSmallRewards.imgRewards = null;
                itemRowSmallRewards.mLayoutFeatureRewardRoot = null;
                itemRowSmallRewards.imgLogo = null;
                itemRowSmallRewards.txtRewardContent = null;
                itemRowSmallRewards.txtRewardPoints = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSmallRewards itemRowSmallRewards, int i) {
            itemRowSmallRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSmallRewards itemRowSmallRewards, SwipePlaceHolderView.FrameView frameView) {
            itemRowSmallRewards.imgRewards = (TLImageView) frameView.findViewById(R.id.imgRewards);
            itemRowSmallRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_feature_reward_root);
            itemRowSmallRewards.imgLogo = (ImageView) frameView.findViewById(R.id.imgLogo);
            itemRowSmallRewards.txtRewardContent = (TextView) frameView.findViewById(R.id.txtRewardContent);
            itemRowSmallRewards.txtRewardPoints = (TextView) frameView.findViewById(R.id.txtRewardPoints);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSmallRewards itemRowSmallRewards, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowSmallRewards.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSmallRewards.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSmallRewards, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSmallRewards itemRowSmallRewards, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSmallRewards itemRowSmallRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSmallRewards itemRowSmallRewards) {
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
        public void bindSwipeOut(ItemRowSmallRewards itemRowSmallRewards) {
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

        public DirectionalViewBinder(ItemRowSmallRewards itemRowSmallRewards) {
            super(itemRowSmallRewards, R.layout.item_row_small_reward, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSmallRewards itemRowSmallRewards) {
            itemRowSmallRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSmallRewards itemRowSmallRewards = (ItemRowSmallRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSmallRewards != null && isNullable) {
                itemRowSmallRewards.imgRewards = null;
                itemRowSmallRewards.mLayoutFeatureRewardRoot = null;
                itemRowSmallRewards.imgLogo = null;
                itemRowSmallRewards.txtRewardContent = null;
                itemRowSmallRewards.txtRewardPoints = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSmallRewards itemRowSmallRewards, int i) {
            itemRowSmallRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSmallRewards itemRowSmallRewards, SwipePlaceHolderView.FrameView frameView) {
            itemRowSmallRewards.imgRewards = (TLImageView) frameView.findViewById(R.id.imgRewards);
            itemRowSmallRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_feature_reward_root);
            itemRowSmallRewards.imgLogo = (ImageView) frameView.findViewById(R.id.imgLogo);
            itemRowSmallRewards.txtRewardContent = (TextView) frameView.findViewById(R.id.txtRewardContent);
            itemRowSmallRewards.txtRewardPoints = (TextView) frameView.findViewById(R.id.txtRewardPoints);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSmallRewards itemRowSmallRewards, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowSmallRewards.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSmallRewards.onClick();
                }
            });
        }
    }

    public final TLImageView getImgRewards() {
        TLImageView tLImageView = this.imgRewards;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgRewards");
        }
        return tLImageView;
    }

    public final void setImgRewards(TLImageView tLImageView) {
        Intrinsics.checkNotNullParameter(tLImageView, "<set-?>");
        this.imgRewards = tLImageView;
    }

    public final ConstraintLayout getMLayoutFeatureRewardRoot() {
        ConstraintLayout constraintLayout = this.mLayoutFeatureRewardRoot;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutFeatureRewardRoot");
        }
        return constraintLayout;
    }

    public final void setMLayoutFeatureRewardRoot(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.mLayoutFeatureRewardRoot = constraintLayout;
    }

    public final ImageView getImgLogo() {
        ImageView imageView = this.imgLogo;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgLogo");
        }
        return imageView;
    }

    public final void setImgLogo(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgLogo = imageView;
    }

    public final TextView getTxtRewardContent() {
        TextView textView = this.txtRewardContent;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRewardContent");
        }
        return textView;
    }

    public final void setTxtRewardContent(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtRewardContent = textView;
    }

    public final TextView getTxtRewardPoints() {
        TextView textView = this.txtRewardPoints;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRewardPoints");
        }
        return textView;
    }

    public final void setTxtRewardPoints(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtRewardPoints = textView;
    }

    public final void onClick() {
        this.onClick.invoke(this.reward);
    }

    public final void onResolve() {
        if (this.mPosition % 2 == 0) {
            ConstraintLayout constraintLayout = this.mLayoutFeatureRewardRoot;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutFeatureRewardRoot");
            }
            ViewExtsKt.marginEnd(constraintLayout, ViewExtsKt.DPtoPX(5.0f));
            ConstraintLayout constraintLayout2 = this.mLayoutFeatureRewardRoot;
            if (constraintLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutFeatureRewardRoot");
            }
            ViewExtsKt.marginBottom(constraintLayout2, ViewExtsKt.DPtoPX(8.0f));
        } else {
            ConstraintLayout constraintLayout3 = this.mLayoutFeatureRewardRoot;
            if (constraintLayout3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutFeatureRewardRoot");
            }
            ViewExtsKt.marginStart(constraintLayout3, ViewExtsKt.DPtoPX(5.0f));
            ConstraintLayout constraintLayout4 = this.mLayoutFeatureRewardRoot;
            if (constraintLayout4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutFeatureRewardRoot");
            }
            ViewExtsKt.marginBottom(constraintLayout4, ViewExtsKt.DPtoPX(8.0f));
        }
        TLImageView tLImageView = this.imgRewards;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgRewards");
        }
        TLImageView tLImageView2 = tLImageView;
        if (!ViewCompat.isLaidOut(tLImageView2) || tLImageView2.isLayoutRequested()) {
            tLImageView2.addOnLayoutChangeListener(new ItemRowSmallRewards$onResolve$$inlined$doOnLayout$1(this));
        } else {
            Glide.with(getImgRewards().getContext()).load(this.reward.getImage()).into(getImgRewards());
        }
        ImageView imageView = this.imgLogo;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgLogo");
        }
        ImageView imageView2 = imageView;
        if (!ViewCompat.isLaidOut(imageView2) || imageView2.isLayoutRequested()) {
            imageView2.addOnLayoutChangeListener(new ItemRowSmallRewards$onResolve$$inlined$doOnLayout$2(this));
        } else {
            Glide.with(getImgLogo().getContext()).load(this.reward.getLogo()).into(getImgLogo());
        }
        TextView textView = this.txtRewardContent;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRewardContent");
        }
        textView.setText(this.reward.getName());
        TextView textView2 = this.txtRewardPoints;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRewardPoints");
        }
        textView2.setText(String.valueOf(this.reward.getPoint()));
    }
}
