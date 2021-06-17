package com.thecoffeehouse.guestapp.screens.more;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0002\u0010\u0006J\u0006\u0010\u0005\u001a\u00020\u0004J\u0006\u0010\u0002\u001a\u00020\u0004J\u0006\u0010\u0013\u001a\u00020\u0004R\u001a\u0010\u0007\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\n\"\u0004\b\u000f\u0010\fR\u001a\u0010\u0010\u001a\u00020\bX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\n\"\u0004\b\u0012\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ItemRowSupportMore;", "", "onClickRatingAndFeedback", "Lkotlin/Function0;", "", "onClickContact", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)V", "mTxtTitle", "Landroid/widget/TextView;", "getMTxtTitle", "()Landroid/widget/TextView;", "setMTxtTitle", "(Landroid/widget/TextView;)V", "rowContact", "getRowContact", "setRowContact", "rowRatingAndFeedback", "getRowRatingAndFeedback", "setRowRatingAndFeedback", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowSupportMore.kt */
public final class ItemRowSupportMore {
    public TextView mTxtTitle;
    private final Function0<Unit> onClickContact;
    private final Function0<Unit> onClickRatingAndFeedback;
    public TextView rowContact;
    public TextView rowRatingAndFeedback;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowSupportMore> {
        public void bindLoadMore(ItemRowSupportMore itemRowSupportMore) {
        }

        public LoadMoreViewBinder(ItemRowSupportMore itemRowSupportMore) {
            super(itemRowSupportMore);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowSupportMore, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSupportMore itemRowSupportMore, View view) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSupportMore itemRowSupportMore, int i) {
        }

        public ViewBinder(ItemRowSupportMore itemRowSupportMore) {
            super(itemRowSupportMore, R.layout.item_row_support_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSupportMore itemRowSupportMore) {
            itemRowSupportMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSupportMore != null && isNullable) {
                itemRowSupportMore.mTxtTitle = null;
                itemRowSupportMore.rowContact = null;
                itemRowSupportMore.rowRatingAndFeedback = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSupportMore itemRowSupportMore, View view) {
            itemRowSupportMore.mTxtTitle = (TextView) view.findViewById(R.id.txt_title_support);
            itemRowSupportMore.rowContact = (TextView) view.findViewById(R.id.row_contact);
            itemRowSupportMore.rowRatingAndFeedback = (TextView) view.findViewById(R.id.row_rating_and_feedback);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSupportMore itemRowSupportMore, View view) {
            view.findViewById(R.id.row_rating_and_feedback).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickRatingAndFeedback();
                }
            });
            view.findViewById(R.id.row_contact).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.ViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickContact();
                }
            });
        }
    }

    public ItemRowSupportMore(Function0<Unit> function0, Function0<Unit> function02) {
        Intrinsics.checkNotNullParameter(function0, "onClickRatingAndFeedback");
        Intrinsics.checkNotNullParameter(function02, "onClickContact");
        this.onClickRatingAndFeedback = function0;
        this.onClickContact = function02;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowSupportMore, View> {
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
        public void bindCollapse(ItemRowSupportMore itemRowSupportMore) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowSupportMore itemRowSupportMore) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSupportMore itemRowSupportMore, View view) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder
        public void bindParentPosition(int i) {
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowSupportMore itemRowSupportMore, int i) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ExpandableViewBinder, com.mindorks.placeholderview.ViewBinder
        @Deprecated
        public void unbind() {
        }

        public ExpandableViewBinder(ItemRowSupportMore itemRowSupportMore) {
            super(itemRowSupportMore, R.layout.item_row_support_more, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSupportMore itemRowSupportMore) {
            itemRowSupportMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSupportMore itemRowSupportMore, View view) {
            itemRowSupportMore.mTxtTitle = (TextView) view.findViewById(R.id.txt_title_support);
            itemRowSupportMore.rowContact = (TextView) view.findViewById(R.id.row_contact);
            itemRowSupportMore.rowRatingAndFeedback = (TextView) view.findViewById(R.id.row_rating_and_feedback);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSupportMore itemRowSupportMore, View view) {
            view.findViewById(R.id.row_rating_and_feedback).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickRatingAndFeedback();
                }
            });
            view.findViewById(R.id.row_contact).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.ExpandableViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickContact();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowSupportMore itemRowSupportMore, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.ExpandableViewBinder.AnonymousClass3 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowSupportMore, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSupportMore itemRowSupportMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSupportMore itemRowSupportMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSupportMore itemRowSupportMore) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowSupportMore itemRowSupportMore) {
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
        public void bindViewPosition(ItemRowSupportMore itemRowSupportMore, int i) {
        }

        public SwipeViewBinder(ItemRowSupportMore itemRowSupportMore) {
            super(itemRowSupportMore, R.layout.item_row_support_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSupportMore itemRowSupportMore) {
            itemRowSupportMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSupportMore != null && isNullable) {
                itemRowSupportMore.mTxtTitle = null;
                itemRowSupportMore.rowContact = null;
                itemRowSupportMore.rowRatingAndFeedback = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSupportMore itemRowSupportMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowSupportMore.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title_support);
            itemRowSupportMore.rowContact = (TextView) frameView.findViewById(R.id.row_contact);
            itemRowSupportMore.rowRatingAndFeedback = (TextView) frameView.findViewById(R.id.row_rating_and_feedback);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSupportMore itemRowSupportMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.row_rating_and_feedback).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickRatingAndFeedback();
                }
            });
            frameView.findViewById(R.id.row_contact).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.SwipeViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickContact();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowSupportMore, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowSupportMore itemRowSupportMore, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowSupportMore itemRowSupportMore) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowSupportMore itemRowSupportMore) {
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
        public void bindSwipeOut(ItemRowSupportMore itemRowSupportMore) {
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
        public void bindViewPosition(ItemRowSupportMore itemRowSupportMore, int i) {
        }

        public DirectionalViewBinder(ItemRowSupportMore itemRowSupportMore) {
            super(itemRowSupportMore, R.layout.item_row_support_more, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowSupportMore itemRowSupportMore) {
            itemRowSupportMore.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowSupportMore itemRowSupportMore = (ItemRowSupportMore) getResolver();
            boolean isNullable = isNullable();
            if (itemRowSupportMore != null && isNullable) {
                itemRowSupportMore.mTxtTitle = null;
                itemRowSupportMore.rowContact = null;
                itemRowSupportMore.rowRatingAndFeedback = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowSupportMore itemRowSupportMore, SwipePlaceHolderView.FrameView frameView) {
            itemRowSupportMore.mTxtTitle = (TextView) frameView.findViewById(R.id.txt_title_support);
            itemRowSupportMore.rowContact = (TextView) frameView.findViewById(R.id.row_contact);
            itemRowSupportMore.rowRatingAndFeedback = (TextView) frameView.findViewById(R.id.row_rating_and_feedback);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowSupportMore itemRowSupportMore, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.row_rating_and_feedback).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickRatingAndFeedback();
                }
            });
            frameView.findViewById(R.id.row_contact).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.ItemRowSupportMore.DirectionalViewBinder.AnonymousClass2 */

                public void onClick(View view) {
                    itemRowSupportMore.onClickContact();
                }
            });
        }
    }

    public final TextView getMTxtTitle() {
        TextView textView = this.mTxtTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        return textView;
    }

    public final void setMTxtTitle(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtTitle = textView;
    }

    public final TextView getRowContact() {
        TextView textView = this.rowContact;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowContact");
        }
        return textView;
    }

    public final void setRowContact(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rowContact = textView;
    }

    public final TextView getRowRatingAndFeedback() {
        TextView textView = this.rowRatingAndFeedback;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        return textView;
    }

    public final void setRowRatingAndFeedback(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.rowRatingAndFeedback = textView;
    }

    public final void onClickRatingAndFeedback() {
        this.onClickRatingAndFeedback.invoke();
    }

    public final void onClickContact() {
        this.onClickContact.invoke();
    }

    public final void onResolve() {
        TextView textView = this.mTxtTitle;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        TextView textView2 = this.mTxtTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtTitle");
        }
        textView.setText(textView2.getContext().getString(R.string.str_title_support_tools));
        TextView textView3 = this.rowRatingAndFeedback;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        TextView textView4 = this.rowRatingAndFeedback;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        Drawable drawable = ContextCompat.getDrawable(textView4.getContext(), R.drawable.ic_rating_and_send_feedback);
        TextView textView5 = this.rowRatingAndFeedback;
        if (textView5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        textView3.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, ContextCompat.getDrawable(textView5.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        TextView textView6 = this.rowRatingAndFeedback;
        if (textView6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        TextView textView7 = this.rowRatingAndFeedback;
        if (textView7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        textView6.setText(textView7.getContext().getString(R.string.str_rating_order));
        TextView textView8 = this.rowContact;
        if (textView8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowContact");
        }
        TextView textView9 = this.rowContact;
        if (textView9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowContact");
        }
        Drawable drawable2 = ContextCompat.getDrawable(textView9.getContext(), R.drawable.ic_contact);
        TextView textView10 = this.rowRatingAndFeedback;
        if (textView10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowRatingAndFeedback");
        }
        textView8.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable2, (Drawable) null, ContextCompat.getDrawable(textView10.getContext(), R.drawable.ic_arrow_right), (Drawable) null);
        TextView textView11 = this.rowContact;
        if (textView11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowContact");
        }
        TextView textView12 = this.rowContact;
        if (textView12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rowContact");
        }
        textView11.setText(textView12.getContext().getString(R.string.str_contact_and_support));
    }
}
