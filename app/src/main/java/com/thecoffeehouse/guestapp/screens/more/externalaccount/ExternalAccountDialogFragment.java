package com.thecoffeehouse.guestapp.screens.more.externalaccount;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0002J\b\u0010\u000e\u001a\u00020\fH\u0002J\b\u0010\u000f\u001a\u00020\fH\u0002J\u001a\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0016R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/externalaccount/ExternalAccountDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mExternalAccountViewModel", "Lcom/thecoffeehouse/guestapp/screens/more/externalaccount/ExternalAccountViewModel;", "getMExternalAccountViewModel", "()Lcom/thecoffeehouse/guestapp/screens/more/externalaccount/ExternalAccountViewModel;", "mExternalAccountViewModel$delegate", "Lkotlin/Lazy;", "getAnalyticScreenName", "", "initLinkExternalAccountSetting", "", "userName", "initSettingViews", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ExternalAccountDialogFragment.kt */
public final class ExternalAccountDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private final Lazy mExternalAccountViewModel$delegate = LazyKt.lazy(new ExternalAccountDialogFragment$mExternalAccountViewModel$2(this));

    /* access modifiers changed from: private */
    public final ExternalAccountViewModel getMExternalAccountViewModel() {
        return (ExternalAccountViewModel) this.mExternalAccountViewModel$delegate.getValue();
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
        return TrackingScreenService.App_Setting;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_external_account;
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
        initSettingViews();
        getMExternalAccountViewModel().getHaravanInfo().observe(this, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new ExternalAccountDialogFragment$initViews$1(this), null, false, false, 14, null));
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_link_external_account));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ExternalAccountDialogFragment$initToolbar$1(this), 1, null);
    }

    private final void initSettingViews() {
        initLinkExternalAccountSetting(null);
    }

    /* access modifiers changed from: private */
    public final void initLinkExternalAccountSetting(String str) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_haraworks);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_haraworks");
        textView.setText(str != null ? str : getString(R.string.str_link_with_harawork));
        ((TextView) _$_findCachedViewById(R.id.txt_haraworks)).setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_haraworks), (Drawable) null, (Drawable) null, (Drawable) null);
        if (str == null) {
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_unlink);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_unlink");
            textView2.setVisibility(8);
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_haraworks);
            Intrinsics.checkNotNullExpressionValue(textView3, "txt_haraworks");
            textView3.setEnabled(true);
        } else {
            TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_unlink);
            Intrinsics.checkNotNullExpressionValue(textView4, "txt_unlink");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) _$_findCachedViewById(R.id.txt_haraworks);
            Intrinsics.checkNotNullExpressionValue(textView5, "txt_haraworks");
            textView5.setEnabled(false);
        }
        TextView textView6 = (TextView) _$_findCachedViewById(R.id.txt_haraworks);
        Intrinsics.checkNotNullExpressionValue(textView6, "txt_haraworks");
        ContextExtsKt.setOnSafeClickListener$default(textView6, 0, new ExternalAccountDialogFragment$initLinkExternalAccountSetting$1(this), 1, null);
        ((TextView) _$_findCachedViewById(R.id.txt_unlink)).setOnClickListener(new ExternalAccountDialogFragment$initLinkExternalAccountSetting$2(this));
    }
}
