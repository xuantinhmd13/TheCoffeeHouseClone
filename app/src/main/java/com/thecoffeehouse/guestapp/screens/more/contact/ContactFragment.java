package com.thecoffeehouse.guestapp.screens.more.contact;

import android.app.Application;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\b\u0010\u000b\u001a\u00020\u0004H\u0002J\u001a\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0010H\u0016¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/contact/ContactFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "initApplicationFeedback", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initFacebook", "initRowCall", "initRowEmail", "initRowWebsite", "initToolbar", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ContactFragment.kt */
public final class ContactFragment extends BaseFullScreenDialogFragment {
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
        return R.layout.fragment_contact;
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
        initRowCall(view);
        initRowEmail(view);
        initRowWebsite(view);
        initFacebook(view);
        initApplicationFeedback(view);
    }

    private final void initApplicationFeedback(View view) {
        TextView textView = (TextView) view.findViewById(R.id.row_application_feedback);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        textView.setLineSpacing(TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), 1.0f);
        String string = getString(R.string.str_send_feedback_about_application);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_s…edback_about_application)");
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular)));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_feedback_application), (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_right), (Drawable) null);
        Intrinsics.checkNotNullExpressionValue(textView, "rowApplicationFeedback");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new ContactFragment$initApplicationFeedback$2(this), 1, null);
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_contact_and_support));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ContactFragment$initToolbar$1(this), 1, null);
    }

    private final void initFacebook(View view) {
        TextView textView = (TextView) view.findViewById(R.id.row_facebook);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        textView.setLineSpacing(TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), 1.0f);
        Integer valueOf = Integer.valueOf((int) R.dimen._16sp);
        Integer valueOf2 = Integer.valueOf((int) R.color.colorTextTitle);
        Integer valueOf3 = Integer.valueOf((int) R.font.sfpd_regular);
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(getString(R.string.str_facebook) + "\n", valueOf, valueOf2, valueOf3), new TextViewAttribute("facebook.com/" + "The.Coffee.House.2014", Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), valueOf3));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_facebook_brown), (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_right), (Drawable) null);
        Intrinsics.checkNotNullExpressionValue(textView, "rowFacebook");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new ContactFragment$initFacebook$2(this), 1, null);
    }

    private final void initRowWebsite(View view) {
        TextView textView = (TextView) view.findViewById(R.id.row_website);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        textView.setLineSpacing(TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), 1.0f);
        Integer valueOf = Integer.valueOf((int) R.dimen._16sp);
        Integer valueOf2 = Integer.valueOf((int) R.color.colorTextTitle);
        Integer valueOf3 = Integer.valueOf((int) R.font.sfpd_regular);
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(getString(R.string.str_website) + "\n", valueOf, valueOf2, valueOf3), new TextViewAttribute("http://www.thecoffeehouse.com", Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), valueOf3));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_website), (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_right), (Drawable) null);
        Intrinsics.checkNotNullExpressionValue(textView, "rowWebsite");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new ContactFragment$initRowWebsite$2(this, "http://www.thecoffeehouse.com"), 1, null);
    }

    private final void initRowEmail(View view) {
        TextView textView = (TextView) view.findViewById(R.id.row_email);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        textView.setLineSpacing(TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), 1.0f);
        Integer valueOf = Integer.valueOf((int) R.dimen._16sp);
        Integer valueOf2 = Integer.valueOf((int) R.color.colorTextTitle);
        Integer valueOf3 = Integer.valueOf((int) R.font.sfpd_regular);
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(getString(R.string.str_email) + "\n", valueOf, valueOf2, valueOf3), new TextViewAttribute("hi@thecoffeehouse.com", Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), valueOf3));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_email), (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_right), (Drawable) null);
        Intrinsics.checkNotNullExpressionValue(textView, "rowEmail");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new ContactFragment$initRowEmail$2(this, "hi@thecoffeehouse.com"), 1, null);
    }

    private final void initRowCall(View view) {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        FragmentActivity activity = getActivity();
        Application application = activity != null ? activity.getApplication() : null;
        if (!(application instanceof TCHApplication)) {
            application = null;
        }
        TCHApplication tCHApplication = (TCHApplication) application;
        String callCenter = (tCHApplication == null || (metadata = tCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null) ? null : value.getCallCenter();
        TextView textView = (TextView) view.findViewById(R.id.row_call);
        Resources resources = textView.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "resources");
        textView.setLineSpacing(TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics()), 1.0f);
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(getString(R.string.str_central) + "\n", Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular)), new TextViewAttribute(String.valueOf(callCenter), Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), Integer.valueOf((int) R.font.sfpd_regular)));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(requireContext(), R.drawable.ic_call_central), (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_right), (Drawable) null);
        Intrinsics.checkNotNullExpressionValue(textView, "rowCall");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new ContactFragment$initRowCall$2(this, callCenter), 1, null);
    }
}
