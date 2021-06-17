package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u0010\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002J\u001a\u0010\u0017\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\t2\b\b\u0002\u0010\u0019\u001a\u00020\u001aR&\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0012\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/StarsRatingView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onRatingListener", "Lkotlin/Function1;", "", "getOnRatingListener", "()Lkotlin/jvm/functions/Function1;", "setOnRatingListener", "(Lkotlin/jvm/functions/Function1;)V", "ratingStar", "setDisableStar", "starView", "Landroid/widget/ImageView;", "setEnableStar", "updateData", "defaultStar", "canRating", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StarsRatingView.kt */
public final class StarsRatingView extends FrameLayout {
    private HashMap _$_findViewCache;
    private Function1<? super Integer, Unit> onRatingListener = StarsRatingView$onRatingListener$1.INSTANCE;
    private int ratingStar;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super java.lang.Integer, kotlin.Unit>, kotlin.jvm.functions.Function1<java.lang.Integer, kotlin.Unit> */
    public final Function1<Integer, Unit> getOnRatingListener() {
        return this.onRatingListener;
    }

    public final void setOnRatingListener(Function1<? super Integer, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onRatingListener = function1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarsRatingView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_stars_rating, (ViewGroup) this, true);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.rating_start_1);
        Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass1 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 1;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setDisableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setDisableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.rating_start_2);
        Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
        ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass2 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 2;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setDisableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.rating_start_3);
        Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
        ContextExtsKt.setOnSafeClickListener$default(imageView3, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass3 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 3;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView4 = (ImageView) _$_findCachedViewById(R.id.rating_start_4);
        Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
        ContextExtsKt.setOnSafeClickListener$default(imageView4, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass4 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 4;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setEnableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView5 = (ImageView) _$_findCachedViewById(R.id.rating_start_5);
        Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
        ContextExtsKt.setOnSafeClickListener$default(imageView5, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass5 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 5;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setEnableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setEnableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarsRatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_stars_rating, (ViewGroup) this, true);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.rating_start_1);
        Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass1 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 1;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setDisableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setDisableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.rating_start_2);
        Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
        ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass2 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 2;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setDisableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.rating_start_3);
        Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
        ContextExtsKt.setOnSafeClickListener$default(imageView3, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass3 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 3;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView4 = (ImageView) _$_findCachedViewById(R.id.rating_start_4);
        Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
        ContextExtsKt.setOnSafeClickListener$default(imageView4, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass4 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 4;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setEnableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView5 = (ImageView) _$_findCachedViewById(R.id.rating_start_5);
        Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
        ContextExtsKt.setOnSafeClickListener$default(imageView5, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass5 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 5;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setEnableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setEnableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StarsRatingView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_stars_rating, (ViewGroup) this, true);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.rating_start_1);
        Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass1 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 1;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setDisableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setDisableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.rating_start_2);
        Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
        ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass2 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 2;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setDisableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.rating_start_3);
        Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
        ContextExtsKt.setOnSafeClickListener$default(imageView3, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass3 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 3;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setDisableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView4 = (ImageView) _$_findCachedViewById(R.id.rating_start_4);
        Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
        ContextExtsKt.setOnSafeClickListener$default(imageView4, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass4 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 4;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setEnableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setDisableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
        ImageView imageView5 = (ImageView) _$_findCachedViewById(R.id.rating_start_5);
        Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
        ContextExtsKt.setOnSafeClickListener$default(imageView5, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView.AnonymousClass5 */
            final /* synthetic */ StarsRatingView this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                this.this$0.ratingStar = 5;
                StarsRatingView starsRatingView = this.this$0;
                ImageView imageView = (ImageView) starsRatingView._$_findCachedViewById(R.id.rating_start_1);
                Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
                starsRatingView.setEnableStar(imageView);
                StarsRatingView starsRatingView2 = this.this$0;
                ImageView imageView2 = (ImageView) starsRatingView2._$_findCachedViewById(R.id.rating_start_2);
                Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
                starsRatingView2.setEnableStar(imageView2);
                StarsRatingView starsRatingView3 = this.this$0;
                ImageView imageView3 = (ImageView) starsRatingView3._$_findCachedViewById(R.id.rating_start_3);
                Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
                starsRatingView3.setEnableStar(imageView3);
                StarsRatingView starsRatingView4 = this.this$0;
                ImageView imageView4 = (ImageView) starsRatingView4._$_findCachedViewById(R.id.rating_start_4);
                Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
                starsRatingView4.setEnableStar(imageView4);
                StarsRatingView starsRatingView5 = this.this$0;
                ImageView imageView5 = (ImageView) starsRatingView5._$_findCachedViewById(R.id.rating_start_5);
                Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
                starsRatingView5.setEnableStar(imageView5);
                this.this$0.getOnRatingListener().invoke(Integer.valueOf(this.this$0.ratingStar));
            }
        }, 1, null);
    }

    public static /* synthetic */ void updateData$default(StarsRatingView starsRatingView, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            z = true;
        }
        starsRatingView.updateData(i, z);
    }

    public final void updateData(int i, boolean z) {
        if (i == 0) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.rating_start_1);
            Intrinsics.checkNotNullExpressionValue(imageView, "rating_start_1");
            setDisableStar(imageView);
            ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.rating_start_2);
            Intrinsics.checkNotNullExpressionValue(imageView2, "rating_start_2");
            setDisableStar(imageView2);
            ImageView imageView3 = (ImageView) _$_findCachedViewById(R.id.rating_start_3);
            Intrinsics.checkNotNullExpressionValue(imageView3, "rating_start_3");
            setDisableStar(imageView3);
            ImageView imageView4 = (ImageView) _$_findCachedViewById(R.id.rating_start_4);
            Intrinsics.checkNotNullExpressionValue(imageView4, "rating_start_4");
            setDisableStar(imageView4);
            ImageView imageView5 = (ImageView) _$_findCachedViewById(R.id.rating_start_5);
            Intrinsics.checkNotNullExpressionValue(imageView5, "rating_start_5");
            setDisableStar(imageView5);
        } else if (i == 1) {
            ((ImageView) _$_findCachedViewById(R.id.rating_start_1)).performClick();
        } else if (i == 2) {
            ((ImageView) _$_findCachedViewById(R.id.rating_start_2)).performClick();
        } else if (i == 3) {
            ((ImageView) _$_findCachedViewById(R.id.rating_start_3)).performClick();
        } else if (i == 4) {
            ((ImageView) _$_findCachedViewById(R.id.rating_start_4)).performClick();
        } else if (i == 5) {
            ((ImageView) _$_findCachedViewById(R.id.rating_start_5)).performClick();
        }
        ImageView imageView6 = (ImageView) _$_findCachedViewById(R.id.rating_start_1);
        Intrinsics.checkNotNullExpressionValue(imageView6, "rating_start_1");
        imageView6.setEnabled(z);
        ImageView imageView7 = (ImageView) _$_findCachedViewById(R.id.rating_start_2);
        Intrinsics.checkNotNullExpressionValue(imageView7, "rating_start_2");
        imageView7.setEnabled(z);
        ImageView imageView8 = (ImageView) _$_findCachedViewById(R.id.rating_start_3);
        Intrinsics.checkNotNullExpressionValue(imageView8, "rating_start_3");
        imageView8.setEnabled(z);
        ImageView imageView9 = (ImageView) _$_findCachedViewById(R.id.rating_start_4);
        Intrinsics.checkNotNullExpressionValue(imageView9, "rating_start_4");
        imageView9.setEnabled(z);
        ImageView imageView10 = (ImageView) _$_findCachedViewById(R.id.rating_start_5);
        Intrinsics.checkNotNullExpressionValue(imageView10, "rating_start_5");
        imageView10.setEnabled(z);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setDisableStar(ImageView imageView) {
        ViewExtsKt.setDrawable(imageView, R.drawable.ic_star_stroke);
        ViewExtsKt.setTint(imageView, R.color.color838387);
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void setEnableStar(ImageView imageView) {
        ViewExtsKt.setDrawable(imageView, R.drawable.ic_star_filled);
        ViewExtsKt.setTint(imageView, R.color.colorF6A81F);
    }
}
