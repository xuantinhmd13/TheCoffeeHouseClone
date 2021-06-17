package com.thecoffeehouse.guestapp.utility;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: General.kt */
public final class GeneralKt$forceOpenKeyboard$1 implements Runnable {
    final /* synthetic */ View $editText;

    GeneralKt$forceOpenKeyboard$1(View view) {
        this.$editText = view;
    }

    public final void run() {
        InputMethodManager inputMethodManager = (InputMethodManager) this.$editText.getContext().getSystemService("input_method");
        if (inputMethodManager != null) {
            ViewParent parent = this.$editText.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            inputMethodManager.toggleSoftInputFromWindow(((ViewGroup) parent).getWindowToken(), 0, 0);
        }
    }
}
