package com.thecoffeehouse.guestapp.utility;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "onGlobalLayout"}, k = 3, mv = {1, 4, 0})
/* compiled from: General.kt */
final class GeneralKt$checkKeyboardHideAndShow$1 implements ViewTreeObserver.OnGlobalLayoutListener {
    final /* synthetic */ KeyboardStateListener $keyboardStateListener;
    final /* synthetic */ Ref.IntRef $oldKeypadHeight;
    final /* synthetic */ View $rootView;

    GeneralKt$checkKeyboardHideAndShow$1(View view, Ref.IntRef intRef, KeyboardStateListener keyboardStateListener) {
        this.$rootView = view;
        this.$oldKeypadHeight = intRef;
        this.$keyboardStateListener = keyboardStateListener;
    }

    public final void onGlobalLayout() {
        Rect rect = new Rect();
        this.$rootView.getWindowVisibleDisplayFrame(rect);
        View view = this.$rootView;
        Intrinsics.checkNotNullExpressionValue(view, "rootView");
        int height = view.getHeight();
        int i = height - rect.bottom;
        if (i != this.$oldKeypadHeight.element) {
            if (((float) i) > ((float) height) * 0.15f) {
                this.$keyboardStateListener.onShowKeyboard(i);
            } else {
                this.$keyboardStateListener.onHideKeyboard();
            }
            this.$oldKeypadHeight.element = i;
        }
    }
}
