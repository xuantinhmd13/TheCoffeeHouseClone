package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "valueAnimator", "Landroid/animation/ValueAnimator;", "kotlin.jvm.PlatformType", "onAnimationUpdate"}, k = 3, mv = {1, 4, 0})
/* compiled from: AccumulatePointsFragment.kt */
final class AccumulatePointsFragment$animateViewPaddingLeftAndRight$1 implements ValueAnimator.AnimatorUpdateListener {
    final /* synthetic */ ImageView $imgIcon;

    AccumulatePointsFragment$animateViewPaddingLeftAndRight$1(ImageView imageView) {
        this.$imgIcon = imageView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageView imageView = this.$imgIcon;
        Intrinsics.checkNotNullExpressionValue(valueAnimator, "valueAnimator");
        Object animatedValue = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue, "null cannot be cast to non-null type kotlin.Int");
        int intValue = ((Integer) animatedValue).intValue();
        int paddingTop = this.$imgIcon.getPaddingTop();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        Objects.requireNonNull(animatedValue2, "null cannot be cast to non-null type kotlin.Int");
        imageView.setPadding(intValue, paddingTop, ((Integer) animatedValue2).intValue(), this.$imgIcon.getPaddingBottom());
    }
}
