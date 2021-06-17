package com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers;

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
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0006\u0010\u001d\u001a\u00020\u001eR\u000e\u0010\u0006\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX.¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0014\u001a\u00020\u000fX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u00020\u0018X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/ItemRowRecentActivity;", "", "type", "", "title", "", FirebaseAnalytics.Param.CONTENT, "(ILjava/lang/String;Ljava/lang/String;)V", "imgTypeActivity", "Landroid/widget/ImageView;", "getImgTypeActivity", "()Landroid/widget/ImageView;", "setImgTypeActivity", "(Landroid/widget/ImageView;)V", "txtActivityContent", "Landroid/widget/TextView;", "getTxtActivityContent", "()Landroid/widget/TextView;", "setTxtActivityContent", "(Landroid/widget/TextView;)V", "txtActivityTitle", "getTxtActivityTitle", "setTxtActivityTitle", "viewLineDivider", "Landroid/view/View;", "getViewLineDivider", "()Landroid/view/View;", "setViewLineDivider", "(Landroid/view/View;)V", "onResolve", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowRecentActivity.kt */
public final class ItemRowRecentActivity {
    private final String content;
    public ImageView imgTypeActivity;
    private final String title;
    public TextView txtActivityContent;
    public TextView txtActivityTitle;
    private final int type;
    public View viewLineDivider;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowRecentActivity> {
        public void bindLoadMore(ItemRowRecentActivity itemRowRecentActivity) {
        }

        public LoadMoreViewBinder(ItemRowRecentActivity itemRowRecentActivity) {
            super(itemRowRecentActivity);
        }
    }

    public ItemRowRecentActivity(int i, String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, FirebaseAnalytics.Param.CONTENT);
        this.type = i;
        this.title = str;
        this.content = str2;
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowRecentActivity, View> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentActivity itemRowRecentActivity, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivity itemRowRecentActivity, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowRecentActivity itemRowRecentActivity, int i) {
        }

        public ViewBinder(ItemRowRecentActivity itemRowRecentActivity) {
            super(itemRowRecentActivity, R.layout.item_row_recent_activity, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivity itemRowRecentActivity) {
            itemRowRecentActivity.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentActivity != null && isNullable) {
                itemRowRecentActivity.viewLineDivider = null;
                itemRowRecentActivity.imgTypeActivity = null;
                itemRowRecentActivity.txtActivityTitle = null;
                itemRowRecentActivity.txtActivityContent = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivity itemRowRecentActivity, View view) {
            itemRowRecentActivity.viewLineDivider = view.findViewById(R.id.viewLineDivider);
            itemRowRecentActivity.imgTypeActivity = (ImageView) view.findViewById(R.id.imgTypeActivity);
            itemRowRecentActivity.txtActivityTitle = (TextView) view.findViewById(R.id.txtActivityTitle);
            itemRowRecentActivity.txtActivityContent = (TextView) view.findViewById(R.id.txtActivityContent);
        }
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowRecentActivity, View> {
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
        public void bindClick(ItemRowRecentActivity itemRowRecentActivity, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindCollapse(ItemRowRecentActivity itemRowRecentActivity) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowRecentActivity itemRowRecentActivity) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivity itemRowRecentActivity, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowRecentActivity itemRowRecentActivity, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowRecentActivity itemRowRecentActivity) {
            super(itemRowRecentActivity, R.layout.item_row_recent_activity, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivity itemRowRecentActivity) {
            itemRowRecentActivity.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivity itemRowRecentActivity, View view) {
            itemRowRecentActivity.viewLineDivider = view.findViewById(R.id.viewLineDivider);
            itemRowRecentActivity.imgTypeActivity = (ImageView) view.findViewById(R.id.imgTypeActivity);
            itemRowRecentActivity.txtActivityTitle = (TextView) view.findViewById(R.id.txtActivityTitle);
            itemRowRecentActivity.txtActivityContent = (TextView) view.findViewById(R.id.txtActivityContent);
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowRecentActivity itemRowRecentActivity, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers.ItemRowRecentActivity.ExpandableViewBinder.AnonymousClass1 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowRecentActivity, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentActivity itemRowRecentActivity, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivity itemRowRecentActivity, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowRecentActivity itemRowRecentActivity) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowRecentActivity itemRowRecentActivity) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowRecentActivity itemRowRecentActivity) {
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
        public void bindViewPosition(ItemRowRecentActivity itemRowRecentActivity, int i) {
        }

        public SwipeViewBinder(ItemRowRecentActivity itemRowRecentActivity) {
            super(itemRowRecentActivity, R.layout.item_row_recent_activity, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivity itemRowRecentActivity) {
            itemRowRecentActivity.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentActivity != null && isNullable) {
                itemRowRecentActivity.viewLineDivider = null;
                itemRowRecentActivity.imgTypeActivity = null;
                itemRowRecentActivity.txtActivityTitle = null;
                itemRowRecentActivity.txtActivityContent = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivity itemRowRecentActivity, SwipePlaceHolderView.FrameView frameView) {
            itemRowRecentActivity.viewLineDivider = frameView.findViewById(R.id.viewLineDivider);
            itemRowRecentActivity.imgTypeActivity = (ImageView) frameView.findViewById(R.id.imgTypeActivity);
            itemRowRecentActivity.txtActivityTitle = (TextView) frameView.findViewById(R.id.txtActivityTitle);
            itemRowRecentActivity.txtActivityContent = (TextView) frameView.findViewById(R.id.txtActivityContent);
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowRecentActivity, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindClick(ItemRowRecentActivity itemRowRecentActivity, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowRecentActivity itemRowRecentActivity, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowRecentActivity itemRowRecentActivity) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowRecentActivity itemRowRecentActivity) {
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
        public void bindSwipeOut(ItemRowRecentActivity itemRowRecentActivity) {
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
        public void bindViewPosition(ItemRowRecentActivity itemRowRecentActivity, int i) {
        }

        public DirectionalViewBinder(ItemRowRecentActivity itemRowRecentActivity) {
            super(itemRowRecentActivity, R.layout.item_row_recent_activity, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowRecentActivity itemRowRecentActivity) {
            itemRowRecentActivity.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowRecentActivity itemRowRecentActivity = (ItemRowRecentActivity) getResolver();
            boolean isNullable = isNullable();
            if (itemRowRecentActivity != null && isNullable) {
                itemRowRecentActivity.viewLineDivider = null;
                itemRowRecentActivity.imgTypeActivity = null;
                itemRowRecentActivity.txtActivityTitle = null;
                itemRowRecentActivity.txtActivityContent = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowRecentActivity itemRowRecentActivity, SwipePlaceHolderView.FrameView frameView) {
            itemRowRecentActivity.viewLineDivider = frameView.findViewById(R.id.viewLineDivider);
            itemRowRecentActivity.imgTypeActivity = (ImageView) frameView.findViewById(R.id.imgTypeActivity);
            itemRowRecentActivity.txtActivityTitle = (TextView) frameView.findViewById(R.id.txtActivityTitle);
            itemRowRecentActivity.txtActivityContent = (TextView) frameView.findViewById(R.id.txtActivityContent);
        }
    }

    public final View getViewLineDivider() {
        View view = this.viewLineDivider;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("viewLineDivider");
        }
        return view;
    }

    public final void setViewLineDivider(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.viewLineDivider = view;
    }

    public final ImageView getImgTypeActivity() {
        ImageView imageView = this.imgTypeActivity;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imgTypeActivity");
        }
        return imageView;
    }

    public final void setImgTypeActivity(ImageView imageView) {
        Intrinsics.checkNotNullParameter(imageView, "<set-?>");
        this.imgTypeActivity = imageView;
    }

    public final TextView getTxtActivityTitle() {
        TextView textView = this.txtActivityTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityTitle");
        }
        return textView;
    }

    public final void setTxtActivityTitle(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtActivityTitle = textView;
    }

    public final TextView getTxtActivityContent() {
        TextView textView = this.txtActivityContent;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityContent");
        }
        return textView;
    }

    public final void setTxtActivityContent(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.txtActivityContent = textView;
    }

    public final void onResolve() {
        boolean z = this.type % 2 == 0;
        if (z) {
            ImageView imageView = this.imgTypeActivity;
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgTypeActivity");
            }
            ViewExtsKt.setDrawable(imageView, R.drawable.ic_use_point);
        } else if (!z) {
            ImageView imageView2 = this.imgTypeActivity;
            if (imageView2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imgTypeActivity");
            }
            ViewExtsKt.setDrawable(imageView2, R.drawable.ic_add_point);
        }
        TextView textView = this.txtActivityTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityTitle");
        }
        textView.setText(this.title);
        TextView textView2 = this.txtActivityContent;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtActivityContent");
        }
        textView2.setText(this.content);
    }
}
