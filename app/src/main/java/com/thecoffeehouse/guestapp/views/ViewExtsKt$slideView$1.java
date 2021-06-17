package com.thecoffeehouse.guestapp.views;

import android.animation.ValueAnimator;
import android.view.View;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 0})
/* compiled from: ViewExts.kt */
final class ViewExtsKt$slideView$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ View $this_slideView;

    ViewExtsKt$slideView$1(View view) {
        this.$this_slideView = view;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        Intrinsics.checkNotNullExpressionValue(valueAnimator, "it");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        this.$this_slideView.getLayoutParams().height = ((Integer) animatedValue).intValue();
        this.$this_slideView.requestLayout();
    }
}
