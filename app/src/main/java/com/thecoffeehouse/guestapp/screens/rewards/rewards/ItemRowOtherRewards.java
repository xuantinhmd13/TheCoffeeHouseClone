package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.graphics.drawable.Drawable;
import android.view.View;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\u0006\u00100\u001a\u00020\u0006J\u0006\u00101\u001a\u00020\u0006R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u0015X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020 X.¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0012\u0010%\u001a\u00020&8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010'\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000b\"\u0004\b)\u0010\rR\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u000b\"\u0004\b,\u0010\rR\u001a\u0010-\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000b\"\u0004\b/\u0010\r¨\u00062"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/ItemRowOtherRewards;", "", "reward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "onClickReward", "Lkotlin/Function1;", "", "(Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;Lkotlin/jvm/functions/Function1;)V", "imgLogo", "Landroid/widget/TextView;", "getImgLogo", "()Landroid/widget/TextView;", "setImgLogo", "(Landroid/widget/TextView;)V", "imgRewards", "Lcom/thecoffeehouse/guestapp/views/TLImageView;", "getImgRewards", "()Lcom/thecoffeehouse/guestapp/views/TLImageView;", "setImgRewards", "(Lcom/thecoffeehouse/guestapp/views/TLImageView;)V", "isBottomItem", "", "()Z", "setBottomItem", "(Z)V", "mLayoutOtherRewardRoot", "Landroidx/constraintlayout/widget/ConstraintLayout;", "getMLayoutOtherRewardRoot", "()Landroidx/constraintlayout/widget/ConstraintLayout;", "setMLayoutOtherRewardRoot", "(Landroidx/constraintlayout/widget/ConstraintLayout;)V", "mLineDivider", "Landroid/view/View;", "getMLineDivider", "()Landroid/view/View;", "setMLineDivider", "(Landroid/view/View;)V", "mPosition", "", "mTxtBranchName", "getMTxtBranchName", "setMTxtBranchName", "txtRewardContent", "getTxtRewardContent", "setTxtRewardContent", "txtRewardPoints", "getTxtRewardPoints", "setTxtRewardPoints", "onClick", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowOtherRewards.kt */
public final class ItemRowOtherRewards {
    public TextView imgLogo;
    public TLImageView imgRewards;
    private boolean isBottomItem;
    public ConstraintLayout mLayoutOtherRewardRoot;
    public View mLineDivider;
    public int mPosition;
    public TextView mTxtBranchName;
    private final Function1<Reward, Unit> onClickReward;
    private final Reward reward;
    public TextView txtRewardContent;
    public TextView txtRewardPoints;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowOtherRewards> {
        public void bindLoadMore(ItemRowOtherRewards itemRowOtherRewards) {
        }

        public LoadMoreViewBinder(ItemRowOtherRewards itemRowOtherRewards) {
            super(itemRowOtherRewards);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.rewards.Reward, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowOtherRewards(Reward reward2, Function1<? super Reward, Unit> function1) {
        Intrinsics.checkNotNullParameter(reward2, "reward");
        Intrinsics.checkNotNullParameter(function1, "onClickReward");
        this.reward = reward2;
        this.onClickReward = function1;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowOtherRewards, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOtherRewards itemRowOtherRewards, View view) {
        }

        public ViewBinder(ItemRowOtherRewards itemRowOtherRewards) {
            super(itemRowOtherRewards, R.layout.item_row_other_rewards, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOtherRewards itemRowOtherRewards) {
            itemRowOtherRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOtherRewards != null && isNullable) {
                itemRowOtherRewards.imgRewards = null;
                itemRowOtherRewards.mLayoutOtherRewardRoot = null;
                itemRowOtherRewards.imgLogo = null;
                itemRowOtherRewards.txtRewardContent = null;
                itemRowOtherRewards.txtRewardPoints = null;
                itemRowOtherRewards.mLineDivider = null;
                itemRowOtherRewards.mTxtBranchName = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOtherRewards itemRowOtherRewards, int i) {
            itemRowOtherRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOtherRewards itemRowOtherRewards, View view) {
            itemRowOtherRewards.imgRewards = (TLImageView) view.findViewById(R.id.imgRewards);
            itemRowOtherRewards.mLayoutOtherRewardRoot = (ConstraintLayout) view.findViewById(R.id.layout_other_reward_root);
            itemRowOtherRewards.imgLogo = (TextView) view.findViewById(R.id.imgLogo);
            itemRowOtherRewards.txtRewardContent = (TextView) view.findViewById(R.id.txtRewardContent);
            itemRowOtherRewards.txtRewardPoints = (TextView) view.findViewById(R.id.txtRewardPoints);
            itemRowOtherRewards.mLineDivider = view.findViewById(R.id.view_line_divider);
            itemRowOtherRewards.mTxtBranchName = (TextView) view.findViewById(R.id.txt_branch_name);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOtherRewards itemRowOtherRewards, View view) {
            view.findViewById(R.id.layout_other_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowOtherRewards.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOtherRewards.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowOtherRewards, View> {
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
        public void bindCollapse(ItemRowOtherRewards itemRowOtherRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowOtherRewards itemRowOtherRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOtherRewards itemRowOtherRewards, View view) {
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

        public ExpandableViewBinder(ItemRowOtherRewards itemRowOtherRewards) {
            super(itemRowOtherRewards, R.layout.item_row_other_rewards, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOtherRewards itemRowOtherRewards) {
            itemRowOtherRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOtherRewards itemRowOtherRewards, int i) {
            itemRowOtherRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOtherRewards itemRowOtherRewards, View view) {
            itemRowOtherRewards.imgRewards = (TLImageView) view.findViewById(R.id.imgRewards);
            itemRowOtherRewards.mLayoutOtherRewardRoot = (ConstraintLayout) view.findViewById(R.id.layout_other_reward_root);
            itemRowOtherRewards.imgLogo = (TextView) view.findViewById(R.id.imgLogo);
            itemRowOtherRewards.txtRewardContent = (TextView) view.findViewById(R.id.txtRewardContent);
            itemRowOtherRewards.txtRewardPoints = (TextView) view.findViewById(R.id.txtRewardPoints);
            itemRowOtherRewards.mLineDivider = view.findViewById(R.id.view_line_divider);
            itemRowOtherRewards.mTxtBranchName = (TextView) view.findViewById(R.id.txt_branch_name);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOtherRewards itemRowOtherRewards, View view) {
            view.findViewById(R.id.layout_other_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowOtherRewards.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOtherRewards.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowOtherRewards itemRowOtherRewards, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowOtherRewards.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowOtherRewards, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOtherRewards itemRowOtherRewards, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowOtherRewards itemRowOtherRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowOtherRewards itemRowOtherRewards) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowOtherRewards itemRowOtherRewards) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowOtherRewards itemRowOtherRewards) {
            super(itemRowOtherRewards, R.layout.item_row_other_rewards, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOtherRewards itemRowOtherRewards) {
            itemRowOtherRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOtherRewards != null && isNullable) {
                itemRowOtherRewards.imgRewards = null;
                itemRowOtherRewards.mLayoutOtherRewardRoot = null;
                itemRowOtherRewards.imgLogo = null;
                itemRowOtherRewards.txtRewardContent = null;
                itemRowOtherRewards.txtRewardPoints = null;
                itemRowOtherRewards.mLineDivider = null;
                itemRowOtherRewards.mTxtBranchName = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOtherRewards itemRowOtherRewards, int i) {
            itemRowOtherRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOtherRewards itemRowOtherRewards, SwipePlaceHolderView.FrameView frameView) {
            itemRowOtherRewards.imgRewards = (TLImageView) frameView.findViewById(R.id.imgRewards);
            itemRowOtherRewards.mLayoutOtherRewardRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_other_reward_root);
            itemRowOtherRewards.imgLogo = (TextView) frameView.findViewById(R.id.imgLogo);
            itemRowOtherRewards.txtRewardContent = (TextView) frameView.findViewById(R.id.txtRewardContent);
            itemRowOtherRewards.txtRewardPoints = (TextView) frameView.findViewById(R.id.txtRewardPoints);
            itemRowOtherRewards.mLineDivider = frameView.findViewById(R.id.view_line_divider);
            itemRowOtherRewards.mTxtBranchName = (TextView) frameView.findViewById(R.id.txt_branch_name);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOtherRewards itemRowOtherRewards, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_other_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowOtherRewards.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOtherRewards.onClick();
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

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowOtherRewards, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowOtherRewards itemRowOtherRewards, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowOtherRewards itemRowOtherRewards) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowOtherRewards itemRowOtherRewards) {
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
        public void bindSwipeOut(ItemRowOtherRewards itemRowOtherRewards) {
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

        public DirectionalViewBinder(ItemRowOtherRewards itemRowOtherRewards) {
            super(itemRowOtherRewards, R.layout.item_row_other_rewards, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowOtherRewards itemRowOtherRewards) {
            itemRowOtherRewards.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowOtherRewards itemRowOtherRewards = (ItemRowOtherRewards) getResolver();
            boolean isNullable = isNullable();
            if (itemRowOtherRewards != null && isNullable) {
                itemRowOtherRewards.imgRewards = null;
                itemRowOtherRewards.mLayoutOtherRewardRoot = null;
                itemRowOtherRewards.imgLogo = null;
                itemRowOtherRewards.txtRewardContent = null;
                itemRowOtherRewards.txtRewardPoints = null;
                itemRowOtherRewards.mLineDivider = null;
                itemRowOtherRewards.mTxtBranchName = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowOtherRewards itemRowOtherRewards, int i) {
            itemRowOtherRewards.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowOtherRewards itemRowOtherRewards, SwipePlaceHolderView.FrameView frameView) {
            itemRowOtherRewards.imgRewards = (TLImageView) frameView.findViewById(R.id.imgRewards);
            itemRowOtherRewards.mLayoutOtherRewardRoot = (ConstraintLayout) frameView.findViewById(R.id.layout_other_reward_root);
            itemRowOtherRewards.imgLogo = (TextView) frameView.findViewById(R.id.imgLogo);
            itemRowOtherRewards.txtRewardContent = (TextView) frameView.findViewById(R.id.txtRewardContent);
            itemRowOtherRewards.txtRewardPoints = (TextView) frameView.findViewById(R.id.txtRewardPoints);
            itemRowOtherRewards.mLineDivider = frameView.findViewById(R.id.view_line_divider);
            itemRowOtherRewards.mTxtBranchName = (TextView) frameView.findViewById(R.id.txt_branch_name);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowOtherRewards itemRowOtherRewards, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_other_reward_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowOtherRewards.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowOtherRewards.onClick();
                }
            });
        }
    }

    public final ConstraintLayout getMLayoutOtherRewardRoot() {
        ConstraintLayout constraintLayout = this.mLayoutOtherRewardRoot;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutOtherRewardRoot");
        }
        return constraintLayout;
    }

    public final void setMLayoutOtherRewardRoot(ConstraintLayout constraintLayout) {
        Intrinsics.checkNotNullParameter(constraintLayout, "<set-?>");
        this.mLayoutOtherRewardRoot = constraintLayout;
    }

    public final TextView getImgLogo() {
        TextView textView = this.imgLogo;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgLogo");
        }
        return textView;
    }

    public final void setImgLogo(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.imgLogo = textView;
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

    public final View getMLineDivider() {
        View view = this.mLineDivider;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLineDivider");
        }
        return view;
    }

    public final void setMLineDivider(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mLineDivider = view;
    }

    public final TextView getMTxtBranchName() {
        TextView textView = this.mTxtBranchName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtBranchName");
        }
        return textView;
    }

    public final void setMTxtBranchName(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtBranchName = textView;
    }

    public final boolean isBottomItem() {
        return this.isBottomItem;
    }

    public final void setBottomItem(boolean z) {
        this.isBottomItem = z;
    }

    public final void onClick() {
        this.onClickReward.invoke(this.reward);
    }

    public final void onResolve() {
        TextView textView = this.txtRewardPoints;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRewardPoints");
        }
        textView.setText(String.valueOf(this.reward.getPoint()));
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
        TextView textView2 = this.txtRewardContent;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtRewardContent");
        }
        textView2.setText(this.reward.getName());
        TextView textView3 = this.mTxtBranchName;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtBranchName");
        }
        textView3.setText(this.reward.getSupplier());
        if (this.isBottomItem) {
            View view = this.mLineDivider;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLineDivider");
            }
            view.setVisibility(8);
        }
    }
}
