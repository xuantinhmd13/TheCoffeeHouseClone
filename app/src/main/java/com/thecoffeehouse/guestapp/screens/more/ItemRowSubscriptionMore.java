package com.thecoffeehouse.guestapp.screens.more;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B-\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\u0006\u0010\u0007\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\tH\u0007R\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0014\"\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ItemRowSubscriptionMore;", "", "icon", "", "title", "", FirebaseAnalytics.Param.CONTENT, "onClick", "Lkotlin/Function0;", "", "(ILjava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V", "mImgIconSub", "Landroid/widget/ImageView;", "getMImgIconSub", "()Landroid/widget/ImageView;", "setMImgIconSub", "(Landroid/widget/ImageView;)V", "mTxtContentSub", "Landroid/widget/TextView;", "getMTxtContentSub", "()Landroid/widget/TextView;", "setMTxtContentSub", "(Landroid/widget/TextView;)V", "mTxtTitleSub", "getMTxtTitleSub", "setMTxtTitleSub", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowSubscriptionMore.kt */
public final class ItemRowSubscriptionMore {
    private final String content;
    private final int icon;
    public ImageView mImgIconSub;
    public TextView mTxtContentSub;
    public TextView mTxtTitleSub;
    private final Function0<Unit> onClick;
    private final String title;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSubscriptionMore> {
        public void bindLoadMore(ItemRowSubscriptionMore itemRowSubscriptionMore) {
        }

        public LoadMoreViewBinder(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            super(itemRowSubscriptionMore);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSubscriptionMore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSubscriptionMore itemRowSubscriptionMore, int i) {
        }

        public ViewBinder(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            super(itemRowSubscriptionMore, R.layout.item_subscription_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            itemRowSubscriptionMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSubscriptionMore != null && isNullable) {
                itemRowSubscriptionMore.mImgIconSub = null;
                itemRowSubscriptionMore.mTxtTitleSub = null;
                itemRowSubscriptionMore.mTxtContentSub = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
            itemRowSubscriptionMore.mImgIconSub = (ImageView) view.findViewById(R.id.img_icon_sub);
            itemRowSubscriptionMore.mTxtTitleSub = (TextView) view.findViewById(R.id.txt_title_sub);
            itemRowSubscriptionMore.mTxtContentSub = (TextView) view.findViewById(R.id.txt_content_sub);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
            view.findViewById(R.id.layout_subscription_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSubscriptionMore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSubscriptionMore.onClick();
                }
            });
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSubscriptionMore, View> {
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
        public void bindCollapse(ItemRowSubscriptionMore itemRowSubscriptionMore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSubscriptionMore itemRowSubscriptionMore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSubscriptionMore itemRowSubscriptionMore, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            super(itemRowSubscriptionMore, R.layout.item_subscription_more, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            itemRowSubscriptionMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
            itemRowSubscriptionMore.mImgIconSub = (ImageView) view.findViewById(R.id.img_icon_sub);
            itemRowSubscriptionMore.mTxtTitleSub = (TextView) view.findViewById(R.id.txt_title_sub);
            itemRowSubscriptionMore.mTxtContentSub = (TextView) view.findViewById(R.id.txt_content_sub);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
            view.findViewById(R.id.layout_subscription_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSubscriptionMore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSubscriptionMore.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSubscriptionMore itemRowSubscriptionMore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSubscriptionMore.ExpandableViewBinder.AnonymousClass2 */

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

    public ItemRowSubscriptionMore(int i, String str, String str2, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CONTENT);
        Intrinsics.checkNotNullParameter(function0, "onClick");
        this.icon = i;
        this.title = str;
        this.content = str2;
        this.onClick = function0;
    }

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSubscriptionMore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSubscriptionMore itemRowSubscriptionMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSubscriptionMore itemRowSubscriptionMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSubscriptionMore itemRowSubscriptionMore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSubscriptionMore itemRowSubscriptionMore) {
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
        public void bindViewPosition(ItemRowSubscriptionMore itemRowSubscriptionMore, int i) {
        }

        public SwipeViewBinder(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            super(itemRowSubscriptionMore, R.layout.item_subscription_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            itemRowSubscriptionMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSubscriptionMore != null && isNullable) {
                itemRowSubscriptionMore.mImgIconSub = null;
                itemRowSubscriptionMore.mTxtTitleSub = null;
                itemRowSubscriptionMore.mTxtContentSub = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSubscriptionMore itemRowSubscriptionMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowSubscriptionMore.mImgIconSub = (ImageView) frameView.findViewById(R.id.img_icon_sub);
            itemRowSubscriptionMore.mTxtTitleSub = (TextView) frameView.findViewById(R.id.txt_title_sub);
            itemRowSubscriptionMore.mTxtContentSub = (TextView) frameView.findViewById(R.id.txt_content_sub);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSubscriptionMore itemRowSubscriptionMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_subscription_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSubscriptionMore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSubscriptionMore.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSubscriptionMore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSubscriptionMore itemRowSubscriptionMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSubscriptionMore itemRowSubscriptionMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSubscriptionMore itemRowSubscriptionMore) {
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
        public void bindSwipeOut(ItemRowSubscriptionMore itemRowSubscriptionMore) {
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
        public void bindViewPosition(ItemRowSubscriptionMore itemRowSubscriptionMore, int i) {
        }

        public DirectionalViewBinder(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            super(itemRowSubscriptionMore, R.layout.item_subscription_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSubscriptionMore itemRowSubscriptionMore) {
            itemRowSubscriptionMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSubscriptionMore itemRowSubscriptionMore = (ItemRowSubscriptionMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSubscriptionMore != null && isNullable) {
                itemRowSubscriptionMore.mImgIconSub = null;
                itemRowSubscriptionMore.mTxtTitleSub = null;
                itemRowSubscriptionMore.mTxtContentSub = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSubscriptionMore itemRowSubscriptionMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowSubscriptionMore.mImgIconSub = (ImageView) frameView.findViewById(R.id.img_icon_sub);
            itemRowSubscriptionMore.mTxtTitleSub = (TextView) frameView.findViewById(R.id.txt_title_sub);
            itemRowSubscriptionMore.mTxtContentSub = (TextView) frameView.findViewById(R.id.txt_content_sub);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSubscriptionMore itemRowSubscriptionMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_subscription_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSubscriptionMore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSubscriptionMore.onClick();
                }
            });
        }
    }

    public final ImageView getMImgIconSub() {
        ImageView imageView = this.mImgIconSub;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgIconSub");
        }
        return imageView;
    }

    public final void setMImgIconSub(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.mImgIconSub = imageView;
    }

    public final TextView getMTxtTitleSub() {
        TextView textView = this.mTxtTitleSub;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitleSub");
        }
        return textView;
    }

    public final void setMTxtTitleSub(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtTitleSub = textView;
    }

    public final TextView getMTxtContentSub() {
        TextView textView = this.mTxtContentSub;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtContentSub");
        }
        return textView;
    }

    public final void setMTxtContentSub(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtContentSub = textView;
    }

    public final void onClick() {
        this.onClick.invoke();
    }

    public final void onResolve() {
        ImageView imageView = this.mImgIconSub;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgIconSub");
        }
        imageView.setImageResource(this.icon);
        TextView textView = this.mTxtTitleSub;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitleSub");
        }
        textView.setText(this.title);
        TextView textView2 = this.mTxtContentSub;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtContentSub");
        }
        textView2.setText(this.content);
    }
}
