package com.thecoffeehouse.guestapp.screens.more.settings;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;
import android.widget.TextView;
import androidx.core.app.NotificationManagerCompat;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.BuildConfig;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0002J\b\u0010\b\u001a\u00020\u0006H\u0002J\b\u0010\t\u001a\u00020\u0006H\u0002J\b\u0010\n\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0002J\u001a\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/settings/SettingsDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "getAnalyticScreenName", "", "initAboutUsSetting", "", "initLinkExternalAccountSetting", "initNotificationSetting", "initSettingViews", "initToolbar", "initVersionName", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "onResume", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SettingsDialogFragment.kt */
public final class SettingsDialogFragment extends BaseFullScreenDialogFragment {
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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.App_Setting;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_settings;
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
        textView.setText(getString(R.string.str_settings));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new SettingsDialogFragment$initToolbar$1(this), 1, null);
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        Switch r0;
        super.onResume();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.row_switch_notification);
        if (_$_findCachedViewById != null && (r0 = (Switch) _$_findCachedViewById.findViewById(R.id.swt)) != null) {
            r0.setChecked(NotificationManagerCompat.from(requireContext()).areNotificationsEnabled());
        }
    }

    private final void initSettingViews() {
        initNotificationSetting();
        initLinkExternalAccountSetting();
        initAboutUsSetting();
        initVersionName();
    }

    private final void initVersionName() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_version_name);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_version_name");
        textView.setText(BuildConfig.VERSION_NAME);
    }

    private final void initLinkExternalAccountSetting() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.row_link_external_account);
        Objects.requireNonNull(_$_findCachedViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) _$_findCachedViewById).setText(getString(R.string.str_link_external_account));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.row_link_external_account);
        Objects.requireNonNull(_$_findCachedViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) _$_findCachedViewById2).setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_link_account), (Drawable) null, (Drawable) null, (Drawable) null);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.row_link_external_account);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "row_link_external_account");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById3, 0, new SettingsDialogFragment$initLinkExternalAccountSetting$1(this), 1, null);
    }

    private final void initAboutUsSetting() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.row_about_us);
        Objects.requireNonNull(_$_findCachedViewById, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) _$_findCachedViewById).setText(getString(R.string.str_about_us));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.row_about_us);
        Objects.requireNonNull(_$_findCachedViewById2, "null cannot be cast to non-null type android.widget.TextView");
        ((TextView) _$_findCachedViewById2).setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_about_us), (Drawable) null, (Drawable) null, (Drawable) null);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.row_about_us);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "row_about_us");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById3, 0, new SettingsDialogFragment$initAboutUsSetting$1(this), 1, null);
    }

    private final void initNotificationSetting() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.row_switch_notification);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "row_switch_notification");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_menu);
        Intrinsics.checkNotNullExpressionValue(textView, "row_switch_notification.txt_menu");
        textView.setText(getString(R.string.str_notification_setting));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.row_switch_notification);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "row_switch_notification");
        Switch r0 = (Switch) _$_findCachedViewById2.findViewById(R.id.swt);
        Intrinsics.checkNotNullExpressionValue(r0, "row_switch_notification.swt");
        r0.setChecked(NotificationManagerCompat.from(requireContext()).areNotificationsEnabled());
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.row_switch_notification);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "row_switch_notification");
        ((Switch) _$_findCachedViewById3.findViewById(R.id.swt)).setOnTouchListener(SettingsDialogFragment$initNotificationSetting$1.INSTANCE);
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.row_switch_notification);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "row_switch_notification");
        ((TextView) _$_findCachedViewById4.findViewById(R.id.txt_menu)).setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_notification), (Drawable) null, (Drawable) null, (Drawable) null);
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.row_switch_notification);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "row_switch_notification");
        ContextExtsKt.setOnSafeClickListener$default(_$_findCachedViewById5, 0, new SettingsDialogFragment$initNotificationSetting$2(this), 1, null);
    }
}
