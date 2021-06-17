package com.thecoffeehouse.guestapp.views;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.os.Handler;
import android.text.Html;
import android.text.Spanned;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.AccelerateInterpolator;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.core.widget.ImageViewCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0004\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\u001a\u000e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003\u001a\n\u0010\u0007\u001a\u00020\b*\u00020\t\u001a\u0012\u0010\n\u001a\u00020\b*\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0001\u001a\u0014\u0010\f\u001a\u00020\b*\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\u0010\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u0011*\u00020\t\u001a\u0016\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0013*\u00020\u0014\u001a\n\u0010\u0015\u001a\u00020\b*\u00020\t\u001a\u0012\u0010\u0016\u001a\u00020\b*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0012\u0010\u0018\u001a\u00020\b*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0012\u0010\u0019\u001a\u00020\b*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0012\u0010\u001a\u001a\u00020\b*\u00020\t2\u0006\u0010\u0017\u001a\u00020\u0001\u001a\u0014\u0010\u001b\u001a\u00020\b*\u00020\t2\b\b\u0001\u0010\u001c\u001a\u00020\u0001\u001a\u0014\u0010\u001d\u001a\u00020\b*\u00020\t2\b\b\u0001\u0010\u001e\u001a\u00020\u0001\u001a\u001a\u0010\u001f\u001a\u00020\b*\u00020\t2\u0006\u0010 \u001a\u00020\u00012\u0006\u0010!\u001a\u00020\u0001\u001a\u0014\u0010\"\u001a\u00020\b*\u00020#2\b\b\u0001\u0010\u001e\u001a\u00020\u0001\u001a\u0014\u0010$\u001a\u00020\b*\u00020#2\b\b\u0001\u0010%\u001a\u00020\u0001\u001a\n\u0010&\u001a\u00020\b*\u00020\t\u001a\u001a\u0010'\u001a\u00020\b*\u00020\t2\u0006\u0010(\u001a\u00020\u00012\u0006\u0010)\u001a\u00020*¨\u0006+"}, d2 = {"DPtoPX", "", "dp", "", "PXtoDP", "", "px", "collapse", "", "Landroid/view/View;", "expand", "targetHeight", "formatHtmlCompact", "Landroid/widget/TextView;", "htmlString", "", "getAllChildren", "", "getScreenWidthAndHeight", "Lkotlin/Pair;", "Landroid/app/Activity;", "hideKeyboard", "marginBottom", "margin", "marginEnd", "marginStart", "marginTop", "setBackgroundColorWithoutResettingPadding", "color", "setBackgroundDrawableWithoutResettingPadding", "drawable", "setDimen", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "setDrawable", "Landroid/widget/ImageView;", "setTint", "colorRes", "showKeyboard", "slideView", "newHeight", "durationInMillis", "", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: ViewExts.kt */
public final class ViewExtsKt {
    public static final void setTint(ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "$this$setTint");
        ImageViewCompat.setImageTintList(imageView, ColorStateList.valueOf(ContextCompat.getColor(imageView.getContext(), i)));
    }

    public static final void setDrawable(ImageView imageView, int i) {
        Intrinsics.checkNotNullParameter(imageView, "$this$setDrawable");
        imageView.setImageDrawable(ContextCompat.getDrawable(imageView.getContext(), i));
    }

    public static final void setBackgroundDrawableWithoutResettingPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$setBackgroundDrawableWithoutResettingPadding");
        int paddingBottom = view.getPaddingBottom();
        int paddingStart = ViewCompat.getPaddingStart(view);
        int paddingEnd = ViewCompat.getPaddingEnd(view);
        int paddingTop = view.getPaddingTop();
        view.setBackgroundResource(i);
        ViewCompat.setPaddingRelative(view, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public static final void setBackgroundColorWithoutResettingPadding(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$setBackgroundColorWithoutResettingPadding");
        int paddingBottom = view.getPaddingBottom();
        int paddingStart = ViewCompat.getPaddingStart(view);
        int paddingEnd = ViewCompat.getPaddingEnd(view);
        int paddingTop = view.getPaddingTop();
        view.setBackgroundColor(ContextCompat.getColor(view.getContext(), i));
        ViewCompat.setPaddingRelative(view, paddingStart, paddingTop, paddingEnd, paddingBottom);
    }

    public static final void slideView(View view, int i, long j) {
        Intrinsics.checkNotNullParameter(view, "$this$slideView");
        ValueAnimator duration = ValueAnimator.ofInt(view.getHeight(), i).setDuration(j);
        duration.addUpdateListener(new ViewExtsKt$slideView$1(view));
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateInterpolator());
        animatorSet.play(duration);
        animatorSet.start();
    }

    public static final void marginStart(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$marginStart");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(i, marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static final void marginEnd(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$marginEnd");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), marginLayoutParams.topMargin, i, marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static final void marginTop(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$marginTop");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), i, marginLayoutParams.getMarginEnd(), marginLayoutParams.bottomMargin);
            view.requestLayout();
        }
    }

    public static final void marginBottom(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$marginBottom");
        if (view.getLayoutParams() instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.setMargins(marginLayoutParams.getMarginStart(), marginLayoutParams.topMargin, marginLayoutParams.getMarginEnd(), i);
            view.requestLayout();
        }
    }

    public static final void setDimen(View view, int i, int i2) {
        Intrinsics.checkNotNullParameter(view, "$this$setDimen");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams.width = i;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        Objects.requireNonNull(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        layoutParams2.height = i2;
        view.requestLayout();
    }

    public static final void expand(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "$this$expand");
        view.measure(-1, -2);
        view.getLayoutParams().height = -2;
        view.setVisibility(0);
        ViewExtsKt$expand$a$1 viewExtsKt$expand$a$1 = new ViewExtsKt$expand$a$1(view, i);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "v.context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "v.context.resources");
        viewExtsKt$expand$a$1.setDuration((long) (((float) i) / resources.getDisplayMetrics().density));
        view.startAnimation(viewExtsKt$expand$a$1);
    }

    public static final void collapse(View view) {
        Intrinsics.checkNotNullParameter(view, "$this$collapse");
        int measuredHeight = view.getMeasuredHeight();
        ViewExtsKt$collapse$a$1 viewExtsKt$collapse$a$1 = new ViewExtsKt$collapse$a$1(view, measuredHeight);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "v.context");
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "v.context.resources");
        viewExtsKt$collapse$a$1.setDuration((long) (((float) measuredHeight) / resources.getDisplayMetrics().density));
        view.startAnimation(viewExtsKt$collapse$a$1);
    }

    public static final int DPtoPX(float f) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return (int) (f * system.getDisplayMetrics().density);
    }

    public static final Number PXtoDP(float f) {
        Resources system = Resources.getSystem();
        Intrinsics.checkNotNullExpressionValue(system, "Resources.getSystem()");
        return Float.valueOf(f / system.getDisplayMetrics().density);
    }

    public static final void showKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "$this$showKeyboard");
        view.requestFocus();
        new Handler().postDelayed(new ViewExtsKt$showKeyboard$1(view), 400);
    }

    public static final void hideKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "$this$hideKeyboard");
        Object systemService = view.getContext().getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final Pair<Integer, Integer> getScreenWidthAndHeight(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$this$getScreenWidthAndHeight");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = activity.getWindowManager();
        Intrinsics.checkNotNullExpressionValue(windowManager, "this.windowManager");
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new Pair<>(Integer.valueOf(displayMetrics.widthPixels), Integer.valueOf(displayMetrics.heightPixels));
    }

    public static final void formatHtmlCompact(TextView textView, String str) {
        Intrinsics.checkNotNullParameter(textView, "$this$formatHtmlCompact");
        if (str == null) {
            textView.setText("");
            return;
        }
        Spanned fromHtml = Html.fromHtml(str, 63);
        Intrinsics.checkNotNullExpressionValue(fromHtml, "Html.fromHtml(htmlString…l.FROM_HTML_MODE_COMPACT)");
        textView.setText(StringsKt.trim(fromHtml));
    }

    public static final List<View> getAllChildren(View view) {
        Intrinsics.checkNotNullParameter(view, "$this$getAllChildren");
        ArrayList arrayList = new ArrayList();
        if (!(view instanceof ViewGroup)) {
            arrayList.add(view);
        } else {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                Intrinsics.checkNotNullExpressionValue(childAt, "child");
                arrayList.addAll(getAllChildren(childAt));
            }
        }
        return arrayList;
    }
}
