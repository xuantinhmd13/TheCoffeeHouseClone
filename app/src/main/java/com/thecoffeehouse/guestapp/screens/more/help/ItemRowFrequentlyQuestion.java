package com.thecoffeehouse.guestapp.screens.more.help;

import android.view.View;
import android.widget.TextView;
import com.mindorks.placeholderview.LoadMoreCallbackBinder;
import com.mindorks.placeholderview.SwipeDecor;
import com.mindorks.placeholderview.SwipeDirection;
import com.mindorks.placeholderview.SwipeDirectionalView;
import com.mindorks.placeholderview.SwipeDirectionalViewBinder;
import com.mindorks.placeholderview.SwipePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¢\u0006\u0002\u0010\tJ\u0006\u0010\u0005\u001a\u00020\bJ\u0006\u0010\u001c\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u00020\rX.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\u00078\u0006@\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/help/ItemRowFrequentlyQuestion;", "", "question", "", "answer", "onClick", "Lkotlin/Function1;", "", "", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "isExpanded", "", "mLineDivider", "Landroid/view/View;", "getMLineDivider", "()Landroid/view/View;", "setMLineDivider", "(Landroid/view/View;)V", "mPosition", "mTxtAnswer", "Landroid/widget/TextView;", "getMTxtAnswer", "()Landroid/widget/TextView;", "setMTxtAnswer", "(Landroid/widget/TextView;)V", "mTxtQuestion", "getMTxtQuestion", "setMTxtQuestion", "onResolve", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ItemRowFrequentlyQuestion.kt */
public final class ItemRowFrequentlyQuestion {
    private final String answer;
    public boolean isExpanded;
    public View mLineDivider;
    public int mPosition;
    public TextView mTxtAnswer;
    public TextView mTxtQuestion;
    private final Function1<Integer, Unit> onClick;
    private final String question;

    public class LoadMoreViewBinder extends ViewBinder implements LoadMoreCallbackBinder<ItemRowFrequentlyQuestion> {
        public void bindLoadMore(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        public LoadMoreViewBinder(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            super(itemRowFrequentlyQuestion);
        }
    }

    public class ViewBinder extends com.mindorks.placeholderview.ViewBinder<ItemRowFrequentlyQuestion, View> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
        }

        public ViewBinder(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            super(itemRowFrequentlyQuestion, R.layout.item_row_frequently_question, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            itemRowFrequentlyQuestion.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
            boolean isNullable = isNullable();
            if (itemRowFrequentlyQuestion != null && isNullable) {
                itemRowFrequentlyQuestion.mTxtQuestion = null;
                itemRowFrequentlyQuestion.mLineDivider = null;
                itemRowFrequentlyQuestion.mTxtAnswer = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, int i) {
            itemRowFrequentlyQuestion.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
            itemRowFrequentlyQuestion.mTxtQuestion = (TextView) view.findViewById(R.id.txt_question);
            itemRowFrequentlyQuestion.mLineDivider = view.findViewById(R.id.view_line_divider);
            itemRowFrequentlyQuestion.mTxtAnswer = (TextView) view.findViewById(R.id.txt_answer);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
            view.findViewById(R.id.layout_frequently_question_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.help.ItemRowFrequentlyQuestion.ViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowFrequentlyQuestion.onClick();
                }
            });
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ItemRowFrequentlyQuestion(String str, String str2, Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(str, "question");
        Intrinsics.checkNotNullParameter(str2, "answer");
        Intrinsics.checkNotNullParameter(function1, "onClick");
        this.question = str;
        this.answer = str2;
        this.onClick = function1;
    }

    public class ExpandableViewBinder extends com.mindorks.placeholderview.ExpandableViewBinder<ItemRowFrequentlyQuestion, View> {
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
        public void bindCollapse(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        /* access modifiers changed from: protected */
        public void bindExpand(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
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

        public ExpandableViewBinder(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            super(itemRowFrequentlyQuestion, R.layout.item_row_frequently_question, false, false, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            itemRowFrequentlyQuestion.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, int i) {
            itemRowFrequentlyQuestion.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
            itemRowFrequentlyQuestion.mTxtQuestion = (TextView) view.findViewById(R.id.txt_question);
            itemRowFrequentlyQuestion.mLineDivider = view.findViewById(R.id.view_line_divider);
            itemRowFrequentlyQuestion.mTxtAnswer = (TextView) view.findViewById(R.id.txt_answer);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
            view.findViewById(R.id.layout_frequently_question_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.help.ItemRowFrequentlyQuestion.ExpandableViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowFrequentlyQuestion.onClick();
                }
            });
        }

        /* access modifiers changed from: protected */
        public void bindToggle(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, View view) {
            view.setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.help.ItemRowFrequentlyQuestion.ExpandableViewBinder.AnonymousClass2 */

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

    public class SwipeViewBinder extends com.mindorks.placeholderview.SwipeViewBinder<ItemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView, SwipePlaceHolderView.SwipeOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeInState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeOut(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeOutState() {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeView(SwipePlaceHolderView.FrameView frameView) {
        }

        public SwipeViewBinder(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            super(itemRowFrequentlyQuestion, R.layout.item_row_frequently_question, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            itemRowFrequentlyQuestion.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
            boolean isNullable = isNullable();
            if (itemRowFrequentlyQuestion != null && isNullable) {
                itemRowFrequentlyQuestion.mTxtQuestion = null;
                itemRowFrequentlyQuestion.mLineDivider = null;
                itemRowFrequentlyQuestion.mTxtAnswer = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, int i) {
            itemRowFrequentlyQuestion.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView frameView) {
            itemRowFrequentlyQuestion.mTxtQuestion = (TextView) frameView.findViewById(R.id.txt_question);
            itemRowFrequentlyQuestion.mLineDivider = frameView.findViewById(R.id.view_line_divider);
            itemRowFrequentlyQuestion.mTxtAnswer = (TextView) frameView.findViewById(R.id.txt_answer);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_frequently_question_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.help.ItemRowFrequentlyQuestion.SwipeViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowFrequentlyQuestion.onClick();
                }
            });
        }
    }

    public class DirectionalViewBinder extends SwipeDirectionalViewBinder<ItemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView, SwipeDirectionalView.SwipeDirectionalOption, SwipeDecor> {
        /* access modifiers changed from: protected */
        public void bindLongClick(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView frameView) {
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.SwipeViewBinder
        public void bindSwipeCancelState() {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeHead(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
        }

        /* access modifiers changed from: protected */
        public void bindSwipeIn(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
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
        public void bindSwipeOut(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
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

        public DirectionalViewBinder(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            super(itemRowFrequentlyQuestion, R.layout.item_row_frequently_question, false);
        }

        /* access modifiers changed from: protected */
        public void resolveView(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion) {
            itemRowFrequentlyQuestion.onResolve();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void recycleView() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
        }

        /* access modifiers changed from: protected */
        @Override // com.mindorks.placeholderview.ViewBinder
        public void unbind() {
            ItemRowFrequentlyQuestion itemRowFrequentlyQuestion = (ItemRowFrequentlyQuestion) getResolver();
            boolean isNullable = isNullable();
            if (itemRowFrequentlyQuestion != null && isNullable) {
                itemRowFrequentlyQuestion.mTxtQuestion = null;
                itemRowFrequentlyQuestion.mLineDivider = null;
                itemRowFrequentlyQuestion.mTxtAnswer = null;
                setResolver(null);
                setAnimationResolver(null);
            }
        }

        /* access modifiers changed from: protected */
        public void bindViewPosition(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, int i) {
            itemRowFrequentlyQuestion.mPosition = i;
        }

        /* access modifiers changed from: protected */
        public void bindViews(ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView frameView) {
            itemRowFrequentlyQuestion.mTxtQuestion = (TextView) frameView.findViewById(R.id.txt_question);
            itemRowFrequentlyQuestion.mLineDivider = frameView.findViewById(R.id.view_line_divider);
            itemRowFrequentlyQuestion.mTxtAnswer = (TextView) frameView.findViewById(R.id.txt_answer);
        }

        /* access modifiers changed from: protected */
        public void bindClick(final ItemRowFrequentlyQuestion itemRowFrequentlyQuestion, SwipePlaceHolderView.FrameView frameView) {
            frameView.findViewById(R.id.layout_frequently_question_root).setOnClickListener(new View.OnClickListener() {
                /* class com.thecoffeehouse.guestapp.screens.more.help.ItemRowFrequentlyQuestion.DirectionalViewBinder.AnonymousClass1 */

                public void onClick(View view) {
                    itemRowFrequentlyQuestion.onClick();
                }
            });
        }
    }

    public final TextView getMTxtQuestion() {
        TextView textView = this.mTxtQuestion;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtQuestion");
        }
        return textView;
    }

    public final void setMTxtQuestion(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtQuestion = textView;
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

    public final TextView getMTxtAnswer() {
        TextView textView = this.mTxtAnswer;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtAnswer");
        }
        return textView;
    }

    public final void setMTxtAnswer(TextView textView) {
        Intrinsics.checkNotNullParameter(textView, "<set-?>");
        this.mTxtAnswer = textView;
    }

    public final void onClick() {
        GeneralKt.log("item: " + this.mPosition + " -  isExpanded: " + this.isExpanded);
        this.onClick.invoke(Integer.valueOf(this.mPosition));
    }

    public final void onResolve() {
        TextView textView = this.mTxtQuestion;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtQuestion");
        }
        textView.setText(this.question);
        TextView textView2 = this.mTxtAnswer;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtAnswer");
        }
        textView2.setText(this.answer);
    }
}
