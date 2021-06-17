package com.thecoffeehouse.guestapp.screens.more.feedback;

import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.more.MoreViewModel;
import com.thecoffeehouse.guestapp.services.api.model.feedbackandrating.FeedbackResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000W\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0006\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0014H\u0002J\b\u0010\u0015\u001a\u00020\u0014H\u0002J\n\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001aH\u0002J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\b\u0010 \u001a\u00020\u0014H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/feedback/ApplicationSuggestionDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "btnSendSuggestion", "Lcom/thecoffeehouse/guestapp/views/TLButton;", "edtFeedBackTextWatcher", "com/thecoffeehouse/guestapp/screens/more/feedback/ApplicationSuggestionDialogFragment$edtFeedBackTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/more/feedback/ApplicationSuggestionDialogFragment$edtFeedBackTextWatcher$1;", "edtSuggestion", "Landroidx/appcompat/widget/AppCompatEditText;", "mMoreViewModel", "Lcom/thecoffeehouse/guestapp/screens/more/MoreViewModel;", "getMMoreViewModel", "()Lcom/thecoffeehouse/guestapp/screens/more/MoreViewModel;", "mMoreViewModel$delegate", "Lkotlin/Lazy;", "mObserverApplicationSuggestion", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackResponse;", "disableSendSuggestion", "", "enableSendSuggestion", "getAnalyticScreenName", "", "initToolbar", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "onDestroy", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ApplicationSuggestionDialogFragment.kt */
public final class ApplicationSuggestionDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private TLButton btnSendSuggestion;
    private final ApplicationSuggestionDialogFragment$edtFeedBackTextWatcher$1 edtFeedBackTextWatcher = new ApplicationSuggestionDialogFragment$edtFeedBackTextWatcher$1(this);
    private AppCompatEditText edtSuggestion;
    private final Lazy mMoreViewModel$delegate = LazyKt.lazy(new ApplicationSuggestionDialogFragment$mMoreViewModel$2(this));
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<FeedbackResponse> mObserverApplicationSuggestion = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, ApplicationSuggestionDialogFragment$mObserverApplicationSuggestion$1.INSTANCE, null, false, false, 14, null);

    /* access modifiers changed from: private */
    public final MoreViewModel getMMoreViewModel() {
        return (MoreViewModel) this.mMoreViewModel$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
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

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.App_Feedback_Form;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.fragment_application_suggestion;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/feedback/ApplicationSuggestionDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/more/feedback/ApplicationSuggestionDialogFragment;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ApplicationSuggestionDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ApplicationSuggestionDialogFragment newInstance() {
            return new ApplicationSuggestionDialogFragment();
        }
    }

    /* access modifiers changed from: private */
    public final void enableSendSuggestion() {
        TLButton tLButton = this.btnSendSuggestion;
        if (tLButton != null) {
            tLButton.setEnabled(true);
        }
        TLButton tLButton2 = this.btnSendSuggestion;
        if (tLButton2 != null) {
            tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorC5671B)));
        }
    }

    /* access modifiers changed from: private */
    public final void disableSendSuggestion() {
        TLButton tLButton = this.btnSendSuggestion;
        if (tLButton != null) {
            tLButton.setEnabled(false);
        }
        TLButton tLButton2 = this.btnSendSuggestion;
        if (tLButton2 != null) {
            tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorBBBBBB)));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar(view);
        this.btnSendSuggestion = (TLButton) view.findViewById(R.id.btn_send_suggestion);
        AppCompatEditText appCompatEditText = (AppCompatEditText) view.findViewById(R.id.edt_suggestion_content);
        this.edtSuggestion = appCompatEditText;
        if (appCompatEditText != null) {
            appCompatEditText.addTextChangedListener(this.edtFeedBackTextWatcher);
        }
        AppCompatEditText appCompatEditText2 = this.edtSuggestion;
        if (appCompatEditText2 != null) {
            GeneralKt.forceOpenKeyboard(appCompatEditText2);
        }
        TLButton tLButton = this.btnSendSuggestion;
        if (tLButton != null) {
            ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new ApplicationSuggestionDialogFragment$initViews$2(this), 1, null);
        }
        ((LinearLayout) view.findViewById(R.id.layout_feedback)).setOnTouchListener(new ApplicationSuggestionDialogFragment$initViews$3(this));
        disableSendSuggestion();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        AppCompatEditText appCompatEditText = this.edtSuggestion;
        if (appCompatEditText != null) {
            appCompatEditText.removeTextChangedListener(this.edtFeedBackTextWatcher);
        }
    }

    private final void initToolbar(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.toolbar);
        ImageView imageView = (ImageView) viewGroup.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_back");
        imageView.setVisibility(8);
        TextView textView = (TextView) viewGroup.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_title_sub_screen");
        textView.setText(getString(R.string.str_send_application_feedback));
        ImageView imageView2 = (ImageView) viewGroup.findViewById(R.id.img_right_icon);
        Intrinsics.checkNotNullExpressionValue(imageView2, "img_right_icon");
        imageView2.setVisibility(0);
        ((ImageView) viewGroup.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_close_bottom_sheet);
        ImageView imageView3 = (ImageView) viewGroup.findViewById(R.id.img_right_icon);
        Intrinsics.checkNotNullExpressionValue(imageView3, "img_right_icon");
        ContextExtsKt.setOnSafeClickListener$default(imageView3, 0, new ApplicationSuggestionDialogFragment$initToolbar$$inlined$apply$lambda$1(this), 1, null);
    }
}
