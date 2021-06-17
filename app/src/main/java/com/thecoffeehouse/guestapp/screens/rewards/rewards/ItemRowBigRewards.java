package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0004\u001a\u00020\u0006J\u0006\u0010&\u001a\u00020\u0006R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001a\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001a\u0010#\u001a\u00020\u001bX.¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001d\"\u0004\b%\u0010\u001f¨\u0006'"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/ItemRowBigRewards;", "", "reward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "onClick", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;Lkotlin/jvm/functions/Function1;)V", "imgLogo", "Landroid/widget/ImageView;", "getImgLogo", "()Landroid/widget/ImageView;", "setImgLogo", "(Landroid/widget/ImageView;)V", "imgRewards", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgRewards", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgRewards", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "mLayoutFeatureRewardRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMLayoutFeatureRewardRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMLayoutFeatureRewardRoot", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "txtDiscountRate", "Landroid/widget/TextView;", "getTxtDiscountRate", "()Landroid/widget/TextView;", "setTxtDiscountRate", "(Landroid/widget/TextView;)V", "txtRewardContent", "getTxtRewardContent", "setTxtRewardContent", "txtRewardPoints", "getTxtRewardPoints", "setTxtRewardPoints", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowBigRewards.kt */
public final class ItemRowBigRewards {
    public ImageView imgLogo;
    public TLImageView imgRewards;
    public ConstraintLayout mLayoutFeatureRewardRoot;
    private final Function1<Reward, Unit> onClick;
    private final Reward reward;
    public TextView txtDiscountRate;
    public TextView txtRewardContent;
    public TextView txtRewardPoints;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowBigRewards> {
        public void bindLoadMore(ItemRowBigRewards itemRowBigRewards) {
        }

        public LoadMoreViewBinder(ItemRowBigRewards itemRowBigRewards) {
            super(itemRowBigRewards);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowBigRewards, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBigRewards itemRowBigRewards, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowBigRewards itemRowBigRewards, int i) {
        }

        public ViewBinder(ItemRowBigRewards itemRowBigRewards) {
            super(itemRowBigRewards, R.layout.item_row_big_reward, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBigRewards itemRowBigRewards) {
            itemRowBigRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowBigRewards != null && isNullable) {
                itemRowBigRewards.imgRewards = null;
                itemRowBigRewards.mLayoutFeatureRewardRoot = null;
                itemRowBigRewards.imgLogo = null;
                itemRowBigRewards.txtRewardContent = null;
                itemRowBigRewards.txtRewardPoints = null;
                itemRowBigRewards.txtDiscountRate = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBigRewards itemRowBigRewards, View view) {
            itemRowBigRewards.imgRewards = (TLImageView) view.findViewById(R.id.imgRewards);
            itemRowBigRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) view.findViewById(R.id.layout_feature_reward_root);
            itemRowBigRewards.imgLogo = (ImageView) view.findViewById(R.id.imgLogo);
            itemRowBigRewards.txtRewardContent = (TextView) view.findViewById(R.id.txtRewardContent);
            itemRowBigRewards.txtRewardPoints = (TextView) view.findViewById(R.id.txtRewardPoints);
            itemRowBigRewards.txtDiscountRate = (TextView) view.findViewById(R.id.txt_discount_rate);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowBigRewards itemRowBigRewards, View view) {
            view.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowBigRewards.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowBigRewards.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowBigRewards, View> {
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
        public void bindCollapse(ItemRowBigRewards itemRowBigRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowBigRewards itemRowBigRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBigRewards itemRowBigRewards, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowBigRewards itemRowBigRewards, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowBigRewards itemRowBigRewards) {
            super(itemRowBigRewards, R.layout.item_row_big_reward, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBigRewards itemRowBigRewards) {
            itemRowBigRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBigRewards itemRowBigRewards, View view) {
            itemRowBigRewards.imgRewards = (TLImageView) view.findViewById(R.id.imgRewards);
            itemRowBigRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) view.findViewById(R.id.layout_feature_reward_root);
            itemRowBigRewards.imgLogo = (ImageView) view.findViewById(R.id.imgLogo);
            itemRowBigRewards.txtRewardContent = (TextView) view.findViewById(R.id.txtRewardContent);
            itemRowBigRewards.txtRewardPoints = (TextView) view.findViewById(R.id.txtRewardPoints);
            itemRowBigRewards.txtDiscountRate = (TextView) view.findViewById(R.id.txt_discount_rate);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowBigRewards itemRowBigRewards, View view) {
            view.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowBigRewards.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowBigRewards.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowBigRewards itemRowBigRewards, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowBigRewards.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowBigRewards, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBigRewards itemRowBigRewards, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowBigRewards itemRowBigRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowBigRewards itemRowBigRewards) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowBigRewards itemRowBigRewards) {
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
        public void bindViewPosition(ItemRowBigRewards itemRowBigRewards, int i) {
        }

        public SwipeViewBinder(ItemRowBigRewards itemRowBigRewards) {
            super(itemRowBigRewards, R.layout.item_row_big_reward, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBigRewards itemRowBigRewards) {
            itemRowBigRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowBigRewards != null && isNullable) {
                itemRowBigRewards.imgRewards = null;
                itemRowBigRewards.mLayoutFeatureRewardRoot = null;
                itemRowBigRewards.imgLogo = null;
                itemRowBigRewards.txtRewardContent = null;
                itemRowBigRewards.txtRewardPoints = null;
                itemRowBigRewards.txtDiscountRate = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBigRewards itemRowBigRewards, SwipePlaceHolderView.FrameView frameView) {
            itemRowBigRewards.imgRewards = (TLImageView) frameView.findViewById(R.id.imgRewards);
            itemRowBigRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_feature_reward_root);
            itemRowBigRewards.imgLogo = (ImageView) frameView.findViewById(R.id.imgLogo);
            itemRowBigRewards.txtRewardContent = (TextView) frameView.findViewById(R.id.txtRewardContent);
            itemRowBigRewards.txtRewardPoints = (TextView) frameView.findViewById(R.id.txtRewardPoints);
            itemRowBigRewards.txtDiscountRate = (TextView) frameView.findViewById(R.id.txt_discount_rate);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowBigRewards itemRowBigRewards, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowBigRewards.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowBigRewards.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.rewards.Reward, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowBigRewards(Reward reward2, Function1<? super Reward, Unit> function1) {
        Intrinsics.checkNotNullParameter(reward2, "reward");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.reward = reward2;
        this.onClick = function1;
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowBigRewards, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowBigRewards itemRowBigRewards, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowBigRewards itemRowBigRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowBigRewards itemRowBigRewards) {
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
        public void bindSwipeOut(ItemRowBigRewards itemRowBigRewards) {
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
        public void bindViewPosition(ItemRowBigRewards itemRowBigRewards, int i) {
        }

        public DirectionalViewBinder(ItemRowBigRewards itemRowBigRewards) {
            super(itemRowBigRewards, R.layout.item_row_big_reward, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowBigRewards itemRowBigRewards) {
            itemRowBigRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowBigRewards itemRowBigRewards = (ItemRowBigRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowBigRewards != null && isNullable) {
                itemRowBigRewards.imgRewards = null;
                itemRowBigRewards.mLayoutFeatureRewardRoot = null;
                itemRowBigRewards.imgLogo = null;
                itemRowBigRewards.txtRewardContent = null;
                itemRowBigRewards.txtRewardPoints = null;
                itemRowBigRewards.txtDiscountRate = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowBigRewards itemRowBigRewards, SwipePlaceHolderView.FrameView frameView) {
            itemRowBigRewards.imgRewards = (TLImageView) frameView.findViewById(R.id.imgRewards);
            itemRowBigRewards.mLayoutFeatureRewardRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_feature_reward_root);
            itemRowBigRewards.imgLogo = (ImageView) frameView.findViewById(R.id.imgLogo);
            itemRowBigRewards.txtRewardContent = (TextView) frameView.findViewById(R.id.txtRewardContent);
            itemRowBigRewards.txtRewardPoints = (TextView) frameView.findViewById(R.id.txtRewardPoints);
            itemRowBigRewards.txtDiscountRate = (TextView) frameView.findViewById(R.id.txt_discount_rate);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowBigRewards itemRowBigRewards, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_feature_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowBigRewards.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowBigRewards.onClick();
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

    public final TextView getTxtDiscountRate() {
        TextView textView = this.txtDiscountRate;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDiscountRate");
        }
        return textView;
    }

    public final void setTxtDiscountRate(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtDiscountRate = textView;
    }

    public final void onClick() {
        this.onClick.invoke(this.reward);
    }

    public final void onResolve() {
        TLImageView tLImageView = this.imgRewards;
        if (tLImageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgRewards");
        }
        RequestBuilder<Drawable> load = Glide.with(tLImageView.getContext()).load(this.reward.getImage());
        TLImageView tLImageView2 = this.imgRewards;
        if (tLImageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgRewards");
        }
        load.into(tLImageView2);
        ImageView imageView = this.imgLogo;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgLogo");
        }
        RequestBuilder<Drawable> load2 = Glide.with(imageView.getContext()).load(this.reward.getLogo());
        ImageView imageView2 = this.imgLogo;
        if (imageView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgLogo");
        }
        load2.into(imageView2);
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
        if (this.reward.getDiscountRate() != null) {
            TextView textView3 = this.txtDiscountRate;
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("txtDiscountRate");
            }
            textView3.setText(new StringBuilder().append('-').append(this.reward.getDiscountRate()).append('%').toString());
            return;
        }
        TextView textView4 = this.txtDiscountRate;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDiscountRate");
        }
        textView4.setVisibility(8);
    }
}
