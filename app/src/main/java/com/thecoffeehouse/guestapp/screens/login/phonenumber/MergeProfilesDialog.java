package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.profile.MergeProfile;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BA\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0002\u0010\u000bJ\b\u0010\u0012\u001a\u00020\nH\u0002J\b\u0010\u0013\u001a\u00020\nH\u0002J\b\u0010\u0014\u001a\u00020\nH\u0002J\b\u0010\u0015\u001a\u00020\nH\u0002J\u001a\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\r2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\b\u0010\u0019\u001a\u00020\u001aH\u0016J\b\u0010\u001b\u001a\u00020\nH\u0002J\b\u0010\u001c\u001a\u00020\nH\u0016J\u0010\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001aH\u0002R\u001e\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\r0\u0005j\b\u0012\u0004\u0012\u00020\r`\u0007X.¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007X\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0003X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/MergeProfilesDialog;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "phoneNumber", "", "profiles", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/MergeProfile;", "Lkotlin/collections/ArrayList;", "profileSelected", "Lkotlin/Function2;", "", "(Ljava/lang/String;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;)V", "mCardViews", "Landroid/view/View;", "mMergeProfiles", "mOnMergeProfileSelected", "mPhoneNumber", "mSelectedMergeProfile", "initMergeHint", "initMergeProfiles", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "listenViews", "onDestroy", "toggleProfileSelect", "i", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MergeProfilesDialog.kt */
public final class MergeProfilesDialog extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private ArrayList<View> mCardViews;
    private ArrayList<MergeProfile> mMergeProfiles;
    private Function2<? super MergeProfilesDialog, ? super MergeProfile, Unit> mOnMergeProfileSelected;
    private String mPhoneNumber;
    private MergeProfile mSelectedMergeProfile;

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
        return R.layout.layout_merge_profiles;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ MergeProfile access$getMSelectedMergeProfile$p(MergeProfilesDialog mergeProfilesDialog) {
        MergeProfile mergeProfile = mergeProfilesDialog.mSelectedMergeProfile;
        if (mergeProfile == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSelectedMergeProfile");
        }
        return mergeProfile;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        if (getDialog() != null) {
            Dialog dialog = getDialog();
            Intrinsics.checkNotNull(dialog);
            dialog.dismiss();
        }
    }

    public MergeProfilesDialog(String str, ArrayList<MergeProfile> arrayList, Function2<? super MergeProfilesDialog, ? super MergeProfile, Unit> function2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(arrayList, "profiles");
        Intrinsics.checkNotNullParameter(function2, "profileSelected");
        this.mPhoneNumber = str;
        this.mOnMergeProfileSelected = function2;
        this.mMergeProfiles = arrayList;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        setCancelable(false);
        initViews();
        listenViews();
    }

    private final void listenViews() {
        TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_update");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new MergeProfilesDialog$listenViews$1(this), 1, null);
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        TLButton tLButton2 = (TLButton) _$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton2, "btn_update");
        GeneralKt.forceCloseKeyboard(requireContext, tLButton2);
    }

    private final void initViews() {
        initToolbar();
        initMergeHint();
        initMergeProfiles();
    }

    private final void initMergeHint() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_merge_profile_hint);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_merge_profile_hint");
        textView.setText(requireContext().getString(R.string.str_merge_profiles_hint, this.mPhoneNumber));
    }

    private final void initMergeProfiles() {
        this.mCardViews = new ArrayList<>();
        int size = this.mMergeProfiles.size();
        for (int i = 0; i < size; i++) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_row_merge_profile, (ViewGroup) null, false);
            RequestBuilder<Drawable> load = Glide.with(requireContext()).load(this.mMergeProfiles.get(i).getAvatar());
            Intrinsics.checkNotNullExpressionValue(inflate, "layoutMerge");
            load.into((TLImageView) inflate.findViewById(R.id.img_avatar));
            TextView textView = (TextView) inflate.findViewById(R.id.txt_username);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutMerge.txt_username");
            textView.setText(this.mMergeProfiles.get(i).getName());
            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_last_logged_in);
            Intrinsics.checkNotNullExpressionValue(textView2, "layoutMerge.txt_last_logged_in");
            textView2.setText(getString(R.string.str_last_active_at, RewardExtsKt.convertSecondToTimeFormat(this.mMergeProfiles.get(i).getLast_active(), StringDateUtilsKt.DF_dd_MM_YYYY)));
            TextView textView3 = (TextView) inflate.findViewById(R.id.txt_beans);
            Intrinsics.checkNotNullExpressionValue(textView3, "layoutMerge.txt_beans");
            String string = requireContext().getString(R.string.str_bean);
            Intrinsics.checkNotNullExpressionValue(string, "requireContext().getString(R.string.str_bean)");
            TLTextViewKt.setTextMultipleFonts(textView3, new TextViewAttribute(String.valueOf(this.mMergeProfiles.get(i).getBean()) + " ", Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorC5671B), Integer.valueOf((int) R.font.sfpd_semibold)), new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular)));
            if (i == 0) {
                MergeProfile mergeProfile = this.mMergeProfiles.get(i);
                Intrinsics.checkNotNullExpressionValue(mergeProfile, "mMergeProfiles[i]");
                this.mSelectedMergeProfile = mergeProfile;
                inflate.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.background_corner_select_merge_account));
            } else {
                inflate.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.background_corner_bottom_solid_white_shadow));
            }
            inflate.setPadding(ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f));
            ((LinearLayout) _$_findCachedViewById(R.id.layout_profiles)).addView(inflate);
            ArrayList<View> arrayList = this.mCardViews;
            if (arrayList == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCardViews");
            }
            arrayList.add(inflate);
            ViewExtsKt.marginStart(inflate, ViewExtsKt.DPtoPX(16.0f));
            ViewExtsKt.marginEnd(inflate, ViewExtsKt.DPtoPX(16.0f));
            ViewExtsKt.marginTop(inflate, ViewExtsKt.DPtoPX(8.0f));
            ViewExtsKt.marginBottom(inflate, ViewExtsKt.DPtoPX(8.0f));
            ContextExtsKt.setOnSafeClickListener$default(inflate, 0, new MergeProfilesDialog$initMergeProfiles$1(this, i), 1, null);
        }
    }

    /* access modifiers changed from: private */
    public final void toggleProfileSelect(int i) {
        GeneralKt.log("position: " + i);
        MergeProfile mergeProfile = this.mMergeProfiles.get(i);
        Intrinsics.checkNotNullExpressionValue(mergeProfile, "mMergeProfiles[i]");
        this.mSelectedMergeProfile = mergeProfile;
        ArrayList<View> arrayList = this.mCardViews;
        if (arrayList == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCardViews");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ArrayList<View> arrayList2 = this.mCardViews;
            if (arrayList2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCardViews");
            }
            View view = arrayList2.get(i2);
            Intrinsics.checkNotNullExpressionValue(view, "mCardViews[cardIndex]");
            View view2 = view;
            if (i2 != i) {
                view2.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.background_corner_bottom_solid_white_shadow));
            } else {
                view2.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.background_corner_select_merge_account));
            }
            view2.setPadding(ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f), ViewExtsKt.DPtoPX(16.0f));
            view2.invalidate();
            view2.requestLayout();
        }
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        imageView.setVisibility(0);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView2 = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView2, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new MergeProfilesDialog$initToolbar$1(this), 1, null);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById3.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(requireContext().getString(R.string.str_merge_profiles_toolbar));
    }
}
