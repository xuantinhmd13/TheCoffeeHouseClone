package com.thecoffeehouse.guestapp.screens.more.newsandpromotions;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.TabMoreEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.more.newsandpromotions.webview.WebViewDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.NewsAndPromotionItem;
import com.thecoffeehouse.guestapp.services.api.model.common.newsandpromotion.PostsItem;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J(\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\fH\u0002J\u0016\u0010\u0012\u001a\u00020\n2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0014J\b\u0010\u0017\u001a\u00020\nH\u0002J\u001a\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0014J \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020 H\u0002J\u0018\u0010!\u001a\u00020\"2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010#\u001a\u00020\fH\u0016J\b\u0010$\u001a\u00020\nH\u0016J\u0010\u0010%\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0010H\u0002J\u0010\u0010'\u001a\u00020\n2\u0006\u0010&\u001a\u00020\u0010H\u0003J\u0018\u0010(\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010)\u001a\u00020\nH\u0002J\b\u0010*\u001a\u00020\nH\u0002R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006+"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/NewsAndPromotionsDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "viewModel", "Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/NewsAndPromotionViewModel;", "getViewModel", "()Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/NewsAndPromotionViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "addItemRow", "", FirebaseAnalytics.Param.INDEX, "", "post", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/PostsItem;", "name", "", "lastIndex", "addItemRowNewsAndPromotions", "news", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/newsandpromotion/NewsAndPromotionItem;", "getAnalyticScreenName", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "itemRowBody", "Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/ItemRowNewsAndPromotionBody;", "isShowFooter", "", "itemRowHeader", "Lcom/thecoffeehouse/guestapp/screens/more/newsandpromotions/ItemRowNewsAndPromotionHead;", "layoutResId", "onStop", "openShareIntent", "shareUrl", "openShareReportPopup", "openWebViewActivity", "sendEventTrackingNews", "stopAndHideShimmer", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: NewsAndPromotionsDialogFragment.kt */
public final class NewsAndPromotionsDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private final Lazy viewModel$delegate = LazyKt.lazy(new NewsAndPromotionsDialogFragment$viewModel$2(this));

    private final NewsAndPromotionViewModel getViewModel() {
        return (NewsAndPromotionViewModel) this.viewModel$delegate.getValue();
    }

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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.News_Promotion_List;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_news_and_promotions;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        ((ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmer_layout)).startShimmer();
        getViewModel().fetchNewsAndPromotionsFromServer().observe(this, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new NewsAndPromotionsDialogFragment$initViews$1(this), null, false, false, 14, null));
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new NewsAndPromotionsDialogFragment$initToolbar$1(this), 1, null);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById2.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_news_and_promotions));
    }

    /* access modifiers changed from: private */
    public final void stopAndHideShimmer() {
        ShimmerFrameLayout shimmerFrameLayout = (ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmer_layout);
        Intrinsics.checkNotNullExpressionValue(shimmerFrameLayout, "shimmer_layout");
        shimmerFrameLayout.setVisibility(8);
        ((ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmer_layout)).stopShimmer();
    }

    /* access modifiers changed from: private */
    public final void addItemRowNewsAndPromotions(List<NewsAndPromotionItem> list) {
        for (T t : list) {
            String name = t.getName();
            List<PostsItem> posts = t.getPosts();
            int lastIndex = CollectionsKt.getLastIndex(t.getPosts());
            int i = 0;
            for (T t2 : posts) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                addItemRow(i, t2, name, lastIndex);
                i = i2;
            }
        }
    }

    private final void addItemRow(int i, PostsItem postsItem, String str, int i2) {
        if (i == 0) {
            ((PlaceHolderView) _$_findCachedViewById(R.id.phv_news_and_promotions)).addView(itemRowHeader(postsItem, str));
        } else if (i != i2) {
            ((PlaceHolderView) _$_findCachedViewById(R.id.phv_news_and_promotions)).addView(itemRowBody(postsItem, str, false));
        } else {
            ((PlaceHolderView) _$_findCachedViewById(R.id.phv_news_and_promotions)).addView(itemRowBody(postsItem, str, true));
        }
    }

    private final ItemRowNewsAndPromotionBody itemRowBody(PostsItem postsItem, String str, boolean z) {
        String str2;
        String thumbnail = postsItem.getThumbnail();
        String str3 = thumbnail != null ? thumbnail : "";
        String title = postsItem.getTitle();
        if (title != null) {
            str2 = title;
        } else {
            str2 = "";
        }
        Integer publish = postsItem.getPublish();
        return new ItemRowNewsAndPromotionBody(str3, str2, publish != null ? publish.intValue() : 0, str, z, new NewsAndPromotionsDialogFragment$itemRowBody$newsBody$1(this, postsItem, str), new NewsAndPromotionsDialogFragment$itemRowBody$newsBody$2(this, postsItem));
    }

    private final ItemRowNewsAndPromotionHead itemRowHeader(PostsItem postsItem, String str) {
        String str2;
        String thumbnail = postsItem.getThumbnail();
        String str3 = thumbnail != null ? thumbnail : "";
        String title = postsItem.getTitle();
        if (title != null) {
            str2 = title;
        } else {
            str2 = "";
        }
        Integer publish = postsItem.getPublish();
        return new ItemRowNewsAndPromotionHead(str3, str2, publish != null ? publish.intValue() : 0, str, new NewsAndPromotionsDialogFragment$itemRowHeader$1(this, postsItem, str), new NewsAndPromotionsDialogFragment$itemRowHeader$2(this, postsItem));
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onStop() {
        super.onStop();
        ((ShimmerFrameLayout) _$_findCachedViewById(R.id.shimmer_layout)).stopShimmer();
    }

    /* access modifiers changed from: private */
    public final void openShareIntent(String str) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType("text/plain");
        intent.putExtra("android.intent.extra.SUBJECT", "Sharing URL");
        intent.putExtra("android.intent.extra.TEXT", str);
        startActivity(Intent.createChooser(intent, "Share URL"));
    }

    /* access modifiers changed from: private */
    public final void openShareReportPopup(String str) {
        BottomSheetDialog bottomSheetDialog = new BottomSheetDialog(requireContext());
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_share_report_bottom_sheet, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutDialog");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_share);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutDialog.txt_share");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new NewsAndPromotionsDialogFragment$openShareReportPopup$1(this, str, bottomSheetDialog), 1, null);
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_report);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutDialog.txt_report");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new NewsAndPromotionsDialogFragment$openShareReportPopup$2(bottomSheetDialog), 1, null);
        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_cancel);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutDialog.txt_cancel");
        ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new NewsAndPromotionsDialogFragment$openShareReportPopup$3(bottomSheetDialog), 1, null);
        bottomSheetDialog.setContentView(inflate);
        bottomSheetDialog.show();
    }

    /* access modifiers changed from: private */
    public final void openWebViewActivity(PostsItem postsItem, String str) {
        postsItem.setTitle(str);
        WebViewDialogFragment newInstance$default = WebViewDialogFragment.Companion.newInstance$default(WebViewDialogFragment.Companion, postsItem, false, 2, null);
        sendEventTrackingNews();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance$default.show(supportFragmentManager, (String) null);
        }
    }

    private final void sendEventTrackingNews() {
        TrackingEventService.Companion.updateSourceTrackingEvent(TabMoreEvents.EventNewsAccessed.name, TabMoreEvents.EventNewsAccessed.Value.News);
        TrackingEventService.Companion.triggerSendTrackingEvent(TabMoreEvents.EventNewsAccessed.name);
    }
}
