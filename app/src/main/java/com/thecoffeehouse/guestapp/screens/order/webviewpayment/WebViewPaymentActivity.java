package com.thecoffeehouse.guestapp.screens.order.webviewpayment;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.LinearLayout;

import com.thecoffeehouse.guestapp.R;

import java.util.HashMap;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0015J\b\u0010\u0007\u001a\u00020\u0004H\u0014¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/webviewpayment/WebViewPaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: WebViewPaymentActivity.kt */
public final class WebViewPaymentActivity extends AppCompatActivity {
    private HashMap _$_findViewCache;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        String stringExtra;
        super.onCreate(bundle);
        setContentView(R.layout.fragment_web_view);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        _$_findCachedViewById.setVisibility(8);
        String str = "";
        if (getIntent().hasExtra("payUrl") && (stringExtra = getIntent().getStringExtra("payUrl")) != null) {
            str = stringExtra;
        }
        WebView webView = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView, "webview");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webview.settings");
        boolean z = true;
        settings.setJavaScriptEnabled(true);
        if (str.length() <= 0) {
            z = false;
        }
        if (z) {
            ((WebView) _$_findCachedViewById(R.id.webview)).loadUrl(str);
        }
        WebView webView2 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView2, "webview");
        webView2.setWebViewClient(new WebViewPaymentActivity$onCreate$1(this));
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        ((LinearLayout) _$_findCachedViewById(R.id.layout_web_view_root)).removeView((WebView) _$_findCachedViewById(R.id.webview));
        ((WebView) _$_findCachedViewById(R.id.webview)).removeAllViews();
        ((WebView) _$_findCachedViewById(R.id.webview)).destroy();
    }
}
