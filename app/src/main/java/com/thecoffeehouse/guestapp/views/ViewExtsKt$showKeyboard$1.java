package com.thecoffeehouse.guestapp.views;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: ViewExts.kt */
final class ViewExtsKt$showKeyboard$1 implements Runnable {
    final /* synthetic */ View $this_showKeyboard;

    ViewExtsKt$showKeyboard$1(View view) {
        this.$this_showKeyboard = view;
    }

    public final void run() {
        Object systemService = this.$this_showKeyboard.getContext().getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).showSoftInput(this.$this_showKeyboard, 1);
    }
}
