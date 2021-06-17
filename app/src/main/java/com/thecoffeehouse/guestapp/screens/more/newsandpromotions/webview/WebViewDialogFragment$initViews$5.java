package com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.webkit.WebView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 0})
/* compiled from: WebViewDialogFragment.kt */
final class WebViewDialogFragment$initViews$5 implements DialogInterface.OnKeyListener {
    final /* synthetic */ WebViewDialogFragment this$0;

    WebViewDialogFragment$initViews$5(WebViewDialogFragment webViewDialogFragment) {
        this.this$0 = webViewDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        GeneralKt.log(Integer.valueOf(i));
        GeneralKt.log(Boolean.valueOf(((WebView) this.this$0._$_findCachedViewById(R.id.webview)).canGoBack()));
        Intrinsics.checkNotNullExpressionValue(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i != 4) {
            return true;
        }
        if (((WebView) this.this$0._$_findCachedViewById(R.id.webview)).canGoBack()) {
            ((WebView) this.this$0._$_findCachedViewById(R.id.webview)).goBack();
            return true;
        }
        this.this$0.dismiss();
        return true;
    }
}
