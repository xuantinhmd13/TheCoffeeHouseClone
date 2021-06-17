package com.thecoffeehouse.guestapp.screens.more.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.LocaleManager;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0002J\b\u0010\u0005\u001a\u00020\u0004H\u0002J\u001a\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014J\b\u0010\u000b\u001a\u00020\fH\u0016¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/settings/LanguageSettingDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "initSettingViews", "", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LanguageSettingDialogFragment.kt */
public final class LanguageSettingDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;

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
        return R.layout.fragment_setting_language;
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
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_notification_setting));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new LanguageSettingDialogFragment$initToolbar$1(this), 1, null);
    }

    private final void initSettingViews() {
        String languageCode = LocaleManager.getLanguageCode(requireContext());
        GeneralKt.log("mCurrentLanguage: " + LocaleManager.getLanguageCode(requireContext()));
        if (Intrinsics.areEqual(languageCode, "vi")) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.row_language_vi);
            Objects.requireNonNull(_$_findCachedViewById, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById).setText(getString(R.string.str_language_vi));
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.row_language_vi);
            Objects.requireNonNull(_$_findCachedViewById2, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById2).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_selected), (Drawable) null);
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.row_language_en);
            Objects.requireNonNull(_$_findCachedViewById3, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById3).setText(getString(R.string.str_language_en));
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.row_language_en);
            Objects.requireNonNull(_$_findCachedViewById4, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById4).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.row_language_en);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "row_language_en");
            ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById5, 0, new LanguageSettingDialogFragment$initSettingViews$1(this), 1, null);
        } else if (Intrinsics.areEqual(languageCode, "en")) {
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.row_language_vi);
            Objects.requireNonNull(_$_findCachedViewById6, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById6).setText(getString(R.string.str_language_vi));
            View _$_findCachedViewById7 = _$_findCachedViewById(R.id.row_language_vi);
            Objects.requireNonNull(_$_findCachedViewById7, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById7).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            View _$_findCachedViewById8 = _$_findCachedViewById(R.id.row_language_en);
            Objects.requireNonNull(_$_findCachedViewById8, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById8).setText(getString(R.string.str_language_en));
            View _$_findCachedViewById9 = _$_findCachedViewById(R.id.row_language_en);
            Objects.requireNonNull(_$_findCachedViewById9, "null cannot be cast to non-null type android.widget.TextView");
            ((TextView) _$_findCachedViewById9).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_selected), (Drawable) null);
            View _$_findCachedViewById10 = _$_findCachedViewById(R.id.row_language_vi);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById10, "row_language_vi");
            ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById10, 0, new LanguageSettingDialogFragment$initSettingViews$2(this), 1, null);
        }
    }
}
