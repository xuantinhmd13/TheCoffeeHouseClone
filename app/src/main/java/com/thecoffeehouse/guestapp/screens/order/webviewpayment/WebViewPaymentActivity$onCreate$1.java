package com.thecoffeehouse.guestapp.screens.order.webviewpayment;

import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/webviewpayment/WebViewPaymentActivity$onCreate$1", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: WebViewPaymentActivity.kt */
public final class WebViewPaymentActivity$onCreate$1 extends WebViewClient {
    final /* synthetic */ WebViewPaymentActivity this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    WebViewPaymentActivity$onCreate$1(WebViewPaymentActivity webViewPaymentActivity) {
        this.this$0 = webViewPaymentActivity;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        ((WebView) this.this$0._$_findCachedViewById(R.id.webview)).loadUrl(str);
        return super.shouldOverrideUrlLoading(webView, str);
    }
}
