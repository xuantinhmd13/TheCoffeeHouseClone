package com.thecoffeehouse.guestapp.views;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001;B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0012H\u0014J\b\u0010\u0016\u001a\u00020\u0012H\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\n\u0010\u0019\u001a\u0004\u0018\u00010\u001aH&J\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004J\n\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0004J\b\u0010\u001e\u001a\u00020\u0018H\u0016J\b\u0010\u001f\u001a\u00020\u0018H\u0016J\b\u0010 \u001a\u00020\u0012H\u0016J\u001a\u0010!\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$H\u0014J\b\u0010%\u001a\u00020\u0018H&J\u0012\u0010&\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010'\u001a\u00020\u0012H\u0014J\u0012\u0010(\u001a\u00020)2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u0010*\u001a\u00020\u0012H\u0016J\b\u0010+\u001a\u00020\u0012H\u0016J\u0018\u0010,\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u0007H\u0014J\b\u0010/\u001a\u00020\u0012H\u0016J\u0018\u00100\u001a\u00020\u00122\u0006\u0010-\u001a\u00020\u00052\u0006\u00101\u001a\u00020\u0018H\u0016J\u001a\u00102\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00052\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\b\u00103\u001a\u00020\u0012H\u0002J\b\u00104\u001a\u00020\u0012H\u0002J\u0016\u00105\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0016J\u001a\u00106\u001a\u00020\u00122\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010:\u001a\u00020\u0012H\u0016R\u0016\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007XD¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006<"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "behavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/View;", "dismissOffset", "", "lazyLayoutView", "offset", "rootView", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "addFragment", "", "fragment", "Landroidx/fragment/app/Fragment;", "collectDataTracking", "disableAnimation", "getAnalyticLayoutName", "", "getAnalyticScreenName", "", "getBehavior", "getMainActivity", "Lcom/thecoffeehouse/guestapp/MainActivity;", "getStateStart", "getTheme", "hideLoading", "initViews", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "onActivityCreated", "onBackPress", "onCreateDialog", "Landroid/app/Dialog;", "onPause", "onResume", "onSlide", "bottomSheet", "slideOffset", "onStart", "onStateChanged", "newState", "onViewCreated", "resetAnimation", "setupAnalytics", "setupBehavior", "show", "manager", "Landroidx/fragment/app/FragmentManager;", ViewHierarchyConstants.TAG_KEY, "showLoading", "ObserverBaseResource", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseBottomSheetDialogFragment.kt */
public abstract class BaseBottomSheetDialogFragment extends BottomSheetDialogFragment {
    private HashMap _$_findViewCache;
    private BottomSheetBehavior<View> behavior;
    private final float dismissOffset = 0.86f;
    private View lazyLayoutView;
    private float offset = 1.0f;
    private View rootView;
    private SwipeRefreshLayout swipeRefreshLayout;

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
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* access modifiers changed from: protected */
    public void collectDataTracking() {
    }

    public abstract String getAnalyticScreenName();

    public int getStateStart() {
        return 3;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.AppBottomSheetDialogTheme;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
    }

    public abstract int layoutResId();

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void onSlide(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
    }

    public void onStateChanged(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
    }

    public void setupBehavior(BottomSheetBehavior<View> bottomSheetBehavior) {
        Intrinsics.checkNotNullParameter(bottomSheetBehavior, "behavior");
    }

    /* access modifiers changed from: protected */
    public View getRootView() {
        return this.rootView;
    }

    /* access modifiers changed from: protected */
    public void setRootView(View view) {
        this.rootView = view;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Dialog dialog;
        Window window;
        WindowManager.LayoutParams attributes;
        super.onActivityCreated(bundle);
        if (getDialog() != null) {
            Dialog dialog2 = getDialog();
            if (!((dialog2 != null ? dialog2.getWindow() : null) == null || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null || (attributes = window.getAttributes()) == null)) {
                attributes.windowAnimations = R.style.BottomSheetAnimation;
            }
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setOnKeyListener(new BaseBottomSheetDialogFragment$onActivityCreated$$inlined$let$lambda$1(this));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_fragment);
        viewStub.setOnInflateListener(new BaseBottomSheetDialogFragment$onViewCreated$1(this, bundle));
        Intrinsics.checkNotNullExpressionValue(viewStub, "viewStubFragment");
        viewStub.setLayoutResource(layoutResId());
        viewStub.inflate();
    }

    /* access modifiers changed from: protected */
    public void onBackPress() {
        try {
            if (!getChildFragmentManager().popBackStackImmediate()) {
                dismiss();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void showLoading() {
        View findViewById;
        View view = this.lazyLayoutView;
        if (view != null && (findViewById = view.findViewById(R.id.layout_loading)) != null) {
            findViewById.setVisibility(0);
        }
    }

    public void hideLoading() {
        View findViewById;
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        View view = this.lazyLayoutView;
        if (view != null && (findViewById = view.findViewById(R.id.layout_loading)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public final BottomSheetBehavior<View> getBehavior() {
        return this.behavior;
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        BottomSheetBehavior<View> bottomSheetBehavior = this.behavior;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.setState(getStateStart());
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            ViewGroup viewGroup = (ViewGroup) dialog.findViewById(R.id.design_bottom_sheet);
            Intrinsics.checkNotNullExpressionValue(viewGroup, ViewHierarchyConstants.VIEW_KEY);
            viewGroup.getLayoutParams().height = -1;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        resetAnimation();
        setupAnalytics();
        MainActivity mainActivity = getMainActivity();
        Objects.requireNonNull(mainActivity, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.base.BaseActivity<*>");
        mainActivity.setPreventCloseKeyboard(false);
    }

    private final void resetAnimation() {
        new Handler().postDelayed(new BaseBottomSheetDialogFragment$resetAnimation$1(this), 200);
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        disableAnimation();
    }

    private final void disableAnimation() {
        Window window;
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(-1);
        }
    }

    private final void setupAnalytics() {
        String analyticScreenName = getAnalyticScreenName();
        if (analyticScreenName != null) {
            TrackingScreenService.Companion.logScreenViewByLayoutResId(analyticScreenName, getAnalyticLayoutName());
        }
    }

    /* access modifiers changed from: protected */
    public int getAnalyticLayoutName() {
        return layoutResId();
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        View decorView;
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Objects.requireNonNull(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) onCreateDialog;
        Window window = bottomSheetDialog.getWindow();
        if (!(window == null || (decorView = window.getDecorView()) == null)) {
            decorView.setBackgroundDrawable(new ColorDrawable(0));
        }
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_bottom_sheet_view_stub_fragment, (ViewGroup) null, false);
        this.lazyLayoutView = inflate;
        Intrinsics.checkNotNull(inflate);
        bottomSheetDialog.setContentView(inflate);
        View view = this.lazyLayoutView;
        Intrinsics.checkNotNull(view);
        ViewParent parent = view.getParent();
        Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.View");
        BottomSheetBehavior<View> from = BottomSheetBehavior.from((View) parent);
        Intrinsics.checkNotNullExpressionValue(from, "it");
        setupBehavior(from);
        from.setBottomSheetCallback(new BaseBottomSheetDialogFragment$onCreateDialog$$inlined$also$lambda$1(from, this));
        from.setFitToContents(false);
        from.setHideable(true);
        from.setSkipCollapsed(true);
        from.setState(3);
        from.setHalfExpandedRatio(1.0E-7f);
        Unit unit = Unit.INSTANCE;
        this.behavior = from;
        View view2 = this.lazyLayoutView;
        Intrinsics.checkNotNull(view2);
        onViewCreated(view2, bundle);
        return bottomSheetDialog;
    }

    public final void addFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        FrameLayout frameLayout = new FrameLayout(requireContext());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        View rootView2 = getRootView();
        Objects.requireNonNull(rootView2, "null cannot be cast to non-null type android.view.ViewGroup");
        ((ViewGroup) rootView2).addView(frameLayout, layoutParams);
        frameLayout.setElevation(10.0f);
        frameLayout.setId(View.generateViewId());
        getChildFragmentManager().beginTransaction().addToBackStack(Reflection.getOrCreateKotlinClass(fragment.getClass()).getSimpleName()).add(frameLayout.getId(), fragment, Reflection.getOrCreateKotlinClass(fragment.getClass()).getSimpleName()).commit();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002BC\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016R\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$ObserverBaseResource;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "onSuccess", "Lkotlin/Function1;", "", "onError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "isShowLoading", "", "isShowError", "(Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "TIMEOUT_IN_MILLIS", "", "onChanged", "t", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: BaseBottomSheetDialogFragment.kt */
    public class ObserverBaseResource<T> implements Observer<Resource<? extends T>> {
        private final long TIMEOUT_IN_MILLIS;
        private final boolean isShowError;
        private final boolean isShowLoading;
        private final Function1<ServerErrorResponse, Unit> onError;
        private final Function1<T, Unit> onSuccess;
        final /* synthetic */ BaseBottomSheetDialogFragment this$0;

        @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
        public final /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Status.values().length];
                $EnumSwitchMapping$0 = iArr;
                iArr[Status.LOADING.ordinal()] = 1;
                iArr[Status.SUCCESS.ordinal()] = 2;
                iArr[Status.ERROR.ordinal()] = 3;
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super T, kotlin.Unit> */
        /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public ObserverBaseResource(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Function1<? super T, Unit> function1, Function1<? super ServerErrorResponse, Unit> function12, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(function1, "onSuccess");
            Intrinsics.checkNotNullParameter(function12, "onError");
            this.this$0 = baseBottomSheetDialogFragment;
            this.onSuccess = function1;
            this.onError = function12;
            this.isShowLoading = z;
            this.isShowError = z2;
            this.TIMEOUT_IN_MILLIS = 20000;
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            onChanged((Resource) ((Resource) obj));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ObserverBaseResource(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Function1 function1, Function1 function12, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseBottomSheetDialogFragment, function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function12, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v8, resolved type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public void onChanged(Resource<? extends T> resource) {
            String str;
            if (this.this$0.isAdded() && resource != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
                if (i != 1) {
                    if (i == 2) {
                        this.this$0.hideLoading();
                        Object data = resource.getData();
                        if (data != null) {
                            this.onSuccess.invoke(data);
                        }
                    } else if (i == 3) {
                        this.this$0.hideLoading();
                        if (this.isShowError && resource.getServerError() != null) {
                            this.onError.invoke(resource.getServerError());
                            MainActivity mainActivity = this.this$0.getMainActivity();
                            if (mainActivity != null) {
                                MainActivity mainActivity2 = mainActivity;
                                String string = this.this$0.getString(R.string.str_error);
                                Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
                                ServerError error = resource.getServerError().getError();
                                if (error == null || (str = error.getMessage()) == null) {
                                    str = "";
                                }
                                ContextExtsKt.showOneButtonAlertDialog$default(mainActivity2, string, str, null, false, null, 28, null);
                            }
                        }
                    }
                } else if (this.isShowLoading) {
                    this.this$0.showLoading();
                    new Handler().postDelayed(new BaseBottomSheetDialogFragment$ObserverBaseResource$onChanged$1(this), this.TIMEOUT_IN_MILLIS);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public final MainActivity getMainActivity() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        return (MainActivity) activity;
    }

    @Override // androidx.fragment.app.DialogFragment
    public void show(FragmentManager fragmentManager, String str) {
        Intrinsics.checkNotNullParameter(fragmentManager, "manager");
        try {
            super.show(fragmentManager, str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
