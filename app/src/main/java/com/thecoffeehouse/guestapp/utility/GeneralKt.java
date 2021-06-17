package com.thecoffeehouse.guestapp.utility;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import androidx.core.app.NotificationCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u001a\u000e\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\n\u001a\u0010\u0010\r\u001a\u00020\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u001a\n\u0010\u0006\u001a\u00020\u0001*\u00020\u0010¨\u0006\u0011"}, d2 = {"checkKeyboardHideAndShow", "", "window", "Landroid/view/Window;", "keyboardStateListener", "Lcom/thecoffeehouse/guestapp/utility/KeyboardStateListener;", "forceCloseKeyboard", "context", "Landroid/content/Context;", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "forceOpenKeyboard", "editText", "log", NotificationCompat.CATEGORY_MESSAGE, "", "Landroid/app/Activity;", "app_liveRelease"}, k = 2, mv = {1, 4, 0})
/* compiled from: General.kt */
public final class GeneralKt {
    public static final void log(Object obj) {
    }

    public static final void checkKeyboardHideAndShow(Window window, KeyboardStateListener keyboardStateListener) {
        Intrinsics.checkNotNullParameter(window, "window");
        Intrinsics.checkNotNullParameter(keyboardStateListener, "keyboardStateListener");
        View decorView = window.getDecorView();
        Intrinsics.checkNotNullExpressionValue(decorView, "window.decorView");
        View rootView = decorView.getRootView();
        Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = 0;
        Intrinsics.checkNotNullExpressionValue(rootView, "rootView");
        rootView.getViewTreeObserver().addOnGlobalLayoutListener(new GeneralKt$checkKeyboardHideAndShow$1(rootView, intRef, keyboardStateListener));
    }

    public static final void forceCloseKeyboard(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "$this$forceCloseKeyboard");
        Object systemService = activity.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        InputMethodManager inputMethodManager = (InputMethodManager) systemService;
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
    }

    public static final void forceCloseKeyboard(Context context, View view) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Object systemService = context.getSystemService("input_method");
        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager) systemService).hideSoftInputFromWindow(view.getWindowToken(), 0);
    }

    public static final void forceOpenKeyboard(View view) {
        Intrinsics.checkNotNullParameter(view, "editText");
        view.post(new GeneralKt$forceOpenKeyboard$1(view));
    }
}
