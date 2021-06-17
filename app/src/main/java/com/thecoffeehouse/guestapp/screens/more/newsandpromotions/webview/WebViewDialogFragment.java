package com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.crashlytics.internal.common.AbstractSpiCall;
import com.thecoffeehouse.guestapp.BuildConfig;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.LocaleManager;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.Retrofit;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class WebViewDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private boolean mIsFullScreen;
    private PostsItem mPost = new PostsItem(null, null, null, null, null, null, null, null, 255, null);

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_web_view;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ WebViewDialogFragment newInstance$default(Companion companion, PostsItem postsItem, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.newInstance(postsItem, z);
        }

        public final WebViewDialogFragment newInstance(PostsItem postsItem, boolean z) {
            Intrinsics.checkNotNullParameter(postsItem, "post");
            WebViewDialogFragment webViewDialogFragment = new WebViewDialogFragment();
            webViewDialogFragment.mPost = postsItem;
            webViewDialogFragment.mIsFullScreen = z;
            return webViewDialogFragment;
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        if (this.mIsFullScreen) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
            _$_findCachedViewById.setVisibility(8);
        } else {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
            TextView textView = (TextView) _$_findCachedViewById2.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
            String title = this.mPost.getTitle();
            if (title == null) {
                title = "";
            }
            textView.setText(title);
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "toolbar");
            ImageView imageView = (ImageView) _$_findCachedViewById3.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_right_icon");
            imageView.setVisibility(0);
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "toolbar");
            ((ImageView) _$_findCachedViewById4.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_share);
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "toolbar");
            ImageView imageView2 = (ImageView) _$_findCachedViewById5.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView2, "toolbar.img_right_icon");
            ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new WebViewDialogFragment$initViews$1(this), 1, null);
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById6, "toolbar");
            ImageView imageView3 = (ImageView) _$_findCachedViewById6.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView3, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView3, 0, new WebViewDialogFragment$initViews$2(this), 1, null);
        }
        WebView webView = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView, "webview");
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webview.settings");
        settings.setBuiltInZoomControls(false);
        WebView webView2 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView2, "webview");
        webView2.getSettings().setSupportZoom(false);
        WebView webView3 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView3, "webview");
        WebSettings settings2 = webView3.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings2, "webview.settings");
        settings2.setJavaScriptCanOpenWindowsAutomatically(true);
        WebView webView4 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView4, "webview");
        WebSettings settings3 = webView4.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings3, "webview.settings");
        settings3.setAllowFileAccess(true);
        WebView webView5 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView5, "webview");
        WebSettings settings4 = webView5.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings4, "webview.settings");
        settings4.setDomStorageEnabled(true);
        WebView webView6 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView6, "webview");
        WebSettings settings5 = webView6.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings5, "webview.settings");
        settings5.setJavaScriptEnabled(true);
        if (this.mPost.getUrl() != null) {
            ((WebView) _$_findCachedViewById(R.id.webview)).loadUrl(this.mPost.getUrl(), defaultHeaders());
        }
        WebView webView7 = (WebView) _$_findCachedViewById(R.id.webview);
        Intrinsics.checkNotNullExpressionValue(webView7, "webview");
        webView7.setWebViewClient(new WebViewDialogFragment$initViews$4(this));
        Dialog dialog = getDialog();
        if (dialog != null) {
            dialog.setOnKeyListener(new WebViewDialogFragment$initViews$5(this));
        }
    }

    /* access modifiers changed from: public */
    private final boolean isHandledInsideApp(String str) {
        if (str == null) {
            return true;
        }
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, ShareConstants.MEDIA_URI);
        return Intrinsics.areEqual(parse.getHost(), "links.thecoffeehouse.com");
    }

    /* access modifiers changed from: public */
    private final void openShareIntent(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
        intent.putExtra("android.intent.extra.TEXT", str);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.startActivity(Intent.createChooser(intent, "Share URL"));
        }
    }

    private final Map<String, String> defaultHeaders() {
        ClientManager requireClientManager;
        Profile userProfile;
        TCHApplication tCHApplication = getTCHApplication();
        String token = (tCHApplication == null || (requireClientManager = tCHApplication.requireClientManager()) == null || (userProfile = requireClientManager.getUserProfile()) == null) ? null : userProfile.getToken();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return MapsKt.mapOf(new Pair(Retrofit.AUTHORIZATION_HEADER, "Bearer " + token), new Pair("TCH-APP-VERSION", BuildConfig.VERSION_NAME), new Pair("TCH-DEVICE-ID", Settings.Secure.getString(requireContext.getContentResolver(), "android_id")), new Pair(AbstractSpiCall.HEADER_USER_AGENT, Build.MANUFACTURER + ";Android" + Build.VERSION.SDK_INT), new Pair("Accept-Language", LocaleManager.getLanguageCode(requireContext())));
    }
}
