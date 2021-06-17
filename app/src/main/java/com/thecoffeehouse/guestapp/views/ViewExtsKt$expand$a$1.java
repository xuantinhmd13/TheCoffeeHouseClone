package com.thecoffeehouse.guestapp.views;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0014J\b\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"com/thecoffeehouse/guestapp/views/ViewExtsKt$expand$a$1", "Landroid/view/animation/Animation;", "applyTransformation", "", "interpolatedTime", "", "t", "Landroid/view/animation/Transformation;", "willChangeBounds", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ViewExts.kt */
public final class ViewExtsKt$expand$a$1 extends Animation {
    final /* synthetic */ int $targetHeight;
    final /* synthetic */ View $v;

    public boolean willChangeBounds() {
        return true;
    }

    ViewExtsKt$expand$a$1(View view, int i) {
        this.$v = view;
        this.$targetHeight = i;
    }

    /* access modifiers changed from: protected */
    public void applyTransformation(float f, Transformation transformation) {
        int i;
        Intrinsics.checkNotNullParameter(transformation, "t");
        ViewGroup.LayoutParams layoutParams = this.$v.getLayoutParams();
        if (f == 1.0f) {
            i = -2;
        } else {
            i = (int) (((float) this.$targetHeight) * f);
        }
        layoutParams.height = i;
        this.$v.requestLayout();
    }
}
