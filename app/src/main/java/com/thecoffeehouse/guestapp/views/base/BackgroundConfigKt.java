package com.thecoffeehouse.guestapp.views.base;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class BackgroundConfigKt {
    public static /* synthetic */ Drawable initBackground$default(View view, BackgroundConfig backgroundConfig, GradientDrawable.Orientation orientation, int i, Object obj) {
        if ((i & 2) != 0) {
            orientation = GradientDrawable.Orientation.LEFT_RIGHT;
        }
        return initBackground(view, backgroundConfig, orientation);
    }

    public static final Drawable initBackground(View view, BackgroundConfig backgroundConfig, GradientDrawable.Orientation orientation) {
        int i;
        float f;
        int i2;
        Intrinsics.checkNotNullParameter(view, "$this$initBackground");
        Intrinsics.checkNotNullParameter(backgroundConfig, "bgConfig");
        Intrinsics.checkNotNullParameter(orientation, "orientation");
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setShape(0);
        float[] fArr = new float[8];
        for (int i3 = 0; i3 < 8; i3++) {
            switch (i3) {
                case 0:
                case 1:
                    i2 = backgroundConfig.getTopLeft();
                    break;
                case 2:
                case 3:
                    i2 = backgroundConfig.getTopRight();
                    break;
                case 4:
                case 5:
                    i2 = backgroundConfig.getBotRight();
                    break;
                case 6:
                case 7:
                    i2 = backgroundConfig.getBotLeft();
                    break;
                default:
                    f = 0.0f;
                    continue;
                    fArr[i3] = f;
            }
            f = (float) i2;
            fArr[i3] = f;
        }
        gradientDrawable.setCornerRadii(fArr);
        if (backgroundConfig.getBgColorEnd() != 0) {
            gradientDrawable.setOrientation(orientation);
            int[] iArr = new int[2];
            for (int i4 = 0; i4 < 2; i4++) {
                if (i4 != 0) {
                    i = backgroundConfig.getBgColorEnd();
                } else {
                    i = backgroundConfig.getBgColor();
                }
                iArr[i4] = i;
            }
            gradientDrawable.setColors(iArr);
        } else if (backgroundConfig.getBgColor() != 0) {
            gradientDrawable.setColor(backgroundConfig.getBgColor());
        }
        gradientDrawable.setStroke(backgroundConfig.getStrokeWidth(), 0);
        GradientDrawable gradientDrawable2 = gradientDrawable;
        view.setBackground(gradientDrawable2);
        return gradientDrawable2;
    }

    public static final boolean isNumber(CharSequence charSequence) {
        StringBuilder sb = charSequence != null ? new StringBuilder(charSequence) : null;
        if (!(StringsKt.toIntOrNull(String.valueOf(sb)) == null && StringsKt.toFloatOrNull(String.valueOf(sb)) == null && StringsKt.toDoubleOrNull(String.valueOf(sb)) == null && StringsKt.toLongOrNull(String.valueOf(sb)) == null)) {
            return true;
        }
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        boolean z = false;
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (Intrinsics.compare((int) charAt, 48) < 0 || Intrinsics.compare((int) charAt, 57) > 0) {
                if (charAt != '.' || i == 0 || z) {
                    return false;
                }
                z = true;
            }
        }
        return true;
    }
}
