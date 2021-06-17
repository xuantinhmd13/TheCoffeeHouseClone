package com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview;

import android.content.Intent;
import android.net.Uri;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.MainActivity;
import java.net.URISyntaxException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/more/newsandpromotions/webview/WebViewDialogFragment$initViews$4", "Landroid/webkit/WebViewClient;", "shouldOverrideUrlLoading", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/webkit/WebView;", "url", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: WebViewDialogFragment.kt */
public final class WebViewDialogFragment$initViews$4 extends WebViewClient {
    final /* synthetic */ WebViewDialogFragment this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    WebViewDialogFragment$initViews$4(WebViewDialogFragment webViewDialogFragment) {
        this.this$0 = webViewDialogFragment;
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (this.this$0.isHandledInsideApp(str)) {
            String queryParameter = Uri.parse(str).getQueryParameter("link");
            if (queryParameter != null) {
                MainActivity mainActivity = this.this$0.getMainActivity();
                if (mainActivity == null) {
                    return false;
                }
                mainActivity.parseDeepLink(queryParameter);
                return false;
            } else if (webView != null) {
                webView.loadUrl(str);
            }
        } else {
            if (str != null && StringsKt.startsWith$default(str, "intent:", false, 2, (Object) null)) {
                try {
                    FragmentActivity activity = this.this$0.getActivity();
                    if (activity != null) {
                        Intent parseUri = Intent.parseUri(str, 1);
                        Intrinsics.checkNotNullExpressionValue(activity, "it");
                        if (parseUri.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivity(parseUri);
                            return true;
                        }
                        String stringExtra = parseUri.getStringExtra("browser_fallback_url");
                        if (stringExtra != null) {
                            if (webView != null) {
                                webView.loadUrl(stringExtra);
                            }
                            return true;
                        }
                        Intent data = new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + parseUri.getPackage()));
                        Intrinsics.checkNotNullExpressionValue(data, "Intent(Intent.ACTION_VIE…                        )");
                        if (data.resolveActivity(activity.getPackageManager()) != null) {
                            activity.startActivity(data);
                            return true;
                        }
                    }
                } catch (URISyntaxException unused) {
                }
            }
            if (webView != null) {
                webView.loadUrl(str);
            }
        }
        return true;
    }
}
