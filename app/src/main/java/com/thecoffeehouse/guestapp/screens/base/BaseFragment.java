package com.thecoffeehouse.guestapp.screens.base;

import android.app.Application;
import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
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
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.ShareConstants;
import com.google.firebase.perf.FirebasePerformance;
import com.google.firebase.perf.metrics.Trace;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002klB\u0005¢\u0006\u0002\u0010\u0004JL\u0010,\u001a\u00020\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u0001002\u0012\b\u0002\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0004JL\u00104\u001a\u00020\u000e2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010/\u001a\u0004\u0018\u0001002\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\n\b\u0002\u00102\u001a\u0004\u0018\u0001002\u0012\b\u0002\u00103\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0018\u00010\rH\u0004J\u0010\u00105\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u0006H\u0002J\b\u00107\u001a\u00020\u000eH\u0002J\u000e\u00108\u001a\u00020\u000e2\u0006\u00109\u001a\u00020*J'\u0010:\u001a\u00020\u000e2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0004¢\u0006\u0002\u0010>J\b\u0010?\u001a\u00020<H\u0014J\n\u0010@\u001a\u0004\u0018\u000100H\u0014J\n\u0010A\u001a\u0004\u0018\u00010BH\u0004J\b\u0010C\u001a\u00020<H\u0016J\b\u0010D\u001a\u00020EH&J\b\u0010F\u001a\u00020\u000eH\u0014J\u001a\u0010G\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020<H&J\u001a\u0010K\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\u001a\u0010L\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\u0012\u0010M\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\"\u0010N\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020<2\u0006\u0010P\u001a\u00020<2\b\u0010Q\u001a\u0004\u0018\u00010RH\u0016J\u0012\u0010S\u001a\u00020\u000e2\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J&\u0010T\u001a\u0004\u0018\u00010\u00062\u0006\u0010U\u001a\u00020V2\b\u0010W\u001a\u0004\u0018\u00010\u00142\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010X\u001a\u00020\u000eH\u0016J\u0010\u0010Y\u001a\u00020\u000e2\u0006\u0010Z\u001a\u00020\bH\u0016J\b\u0010[\u001a\u00020\u000eH\u0014J\b\u0010\\\u001a\u00020\u000eH\u0016J\u001a\u0010]\u001a\u00020\u000e2\u0006\u00106\u001a\u00020\u00062\b\u0010H\u001a\u0004\u0018\u00010IH\u0016J\b\u0010^\u001a\u00020\u000eH\u0002J\b\u0010_\u001a\u00020\u000eH\u0004J\u000e\u0010`\u001a\u00020\u000e2\u0006\u00109\u001a\u00020*J\n\u0010a\u001a\u0004\u0018\u00010bH\u0004J\b\u0010c\u001a\u00020\u000eH\u0014J\b\u0010d\u001a\u00020\bH\u0014J\b\u0010e\u001a\u00020\u000eH\u0014J\u0018\u0010f\u001a\u00020\u000e2\u0006\u0010g\u001a\u00020<2\u0006\u0010h\u001a\u00020.H\u0014J\b\u0010i\u001a\u00020\u000eH\u0002J\b\u0010j\u001a\u00020\u000eH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0004¢\u0006\u0002\n\u0000R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001b\u0010\u001f\u001a\u00028\u00008FX\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000%X¦\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001e\u0010(\u001a\u0012\u0012\u0004\u0012\u00020*0)j\b\u0012\u0004\u0012\u00020*`+X\u0004¢\u0006\u0002\n\u0000¨\u0006m"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "VM", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "Landroidx/fragment/app/DialogFragment;", "()V", "mEmptyListLayout", "Landroid/view/View;", "mIsTracingStarted", "", "mIsTracingStopped", "mTrace", "Lcom/google/firebase/perf/metrics/Trace;", "onInitViewDone", "Lkotlin/Function0;", "", "getOnInitViewDone", "()Lkotlin/jvm/functions/Function0;", "setOnInitViewDone", "(Lkotlin/jvm/functions/Function0;)V", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "setRootView", "(Landroid/view/ViewGroup;)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "getSwipeRefreshLayout", "()Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "setSwipeRefreshLayout", "(Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;)V", "viewModel", "getViewModel", "()Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "visibilityChangeListener", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$OnHiddenChangeListener;", "Lkotlin/collections/ArrayList;", "addEmptyList", "icon", "", "title", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "buttonText", "onClickButton", "addEmptyListLayout", "addFrontCenterLayout", ViewHierarchyConstants.VIEW_KEY, "addNoInternetConnectionLayout", "addOnHiddenChangedListener", "l", "addSwipeToRefreshLayout", "id", "", "onRefreshListener", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "getAnalyticLayoutName", "getAnalyticScreenName", "getMainActivity", "Lcom/thecoffeehouse/guestapp/MainActivity;", "getTheme", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "hideLoading", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "listenViewInteractions", "observeViewModel", "onActivityCreated", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onDestroy", "onHiddenChanged", "hidden", "onLoggedInUserListener", "onResume", "onViewCreated", "registerTracer", "removeEmptyListLayout", "removeOnHiddenChangedListener", "requireTCHApplication", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "retryButton", "setPreventCloseKeyboardWhenTouchOutside", "setTagForView", "setTagLayout", "key", ViewHierarchyConstants.TAG_KEY, "setupAnalytics", "showLoading", "ObserverBaseResource", "OnHiddenChangeListener", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
public abstract class BaseFragment<VM extends BaseViewModel> extends DialogFragment {
    private HashMap _$_findViewCache;
    private View mEmptyListLayout;
    private boolean mIsTracingStarted;
    private boolean mIsTracingStopped;
    private final Trace mTrace;
    private Function0<Unit> onInitViewDone = BaseFragment$onInitViewDone$1.INSTANCE;
    protected ViewGroup rootView;
    private SwipeRefreshLayout swipeRefreshLayout;
    private final Lazy viewModel$delegate;
    private final ArrayList<OnHiddenChangeListener> visibilityChangeListener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$OnHiddenChangeListener;", "", "onHidden", "", "hidden", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: BaseFragment.kt */
    public interface OnHiddenChangeListener {
        void onHidden(boolean z);
    }

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Lifecycle.Event.ON_START.ordinal()] = 1;
            iArr[Lifecycle.Event.ON_STOP.ordinal()] = 2;
            iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 3;
        }
    }

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
    public String getAnalyticScreenName() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.FullScreenDialogTheme;
    }

    public final VM getViewModel() {
        return (VM) ((BaseViewModel) this.viewModel$delegate.getValue());
    }

    public abstract Class<VM> getViewModelClass();

    public abstract ViewModelProvider.Factory getViewModelFactory();

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
    }

    public abstract int layoutResId();

    /* access modifiers changed from: protected */
    public void listenViewInteractions(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
    }

    /* access modifiers changed from: protected */
    public void observeViewModel(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void onLoggedInUserListener() {
    }

    /* access modifiers changed from: protected */
    public void retryButton() {
    }

    /* access modifiers changed from: protected */
    public boolean setPreventCloseKeyboardWhenTouchOutside() {
        return false;
    }

    /* access modifiers changed from: protected */
    public void setTagForView() {
    }

    /* access modifiers changed from: protected */
    public void setTagLayout(int i, Object obj) {
        Intrinsics.checkNotNullParameter(obj, ViewHierarchyConstants.TAG_KEY);
    }

    public BaseFragment() {
        Trace newTrace = FirebasePerformance.getInstance().newTrace(getClass().getSimpleName());
        Intrinsics.checkNotNullExpressionValue(newTrace, "FirebasePerformance.getI…s::class.java.simpleName)");
        this.mTrace = newTrace;
        this.viewModel$delegate = LazyKt.lazy(new BaseFragment$viewModel$2(this));
        this.visibilityChangeListener = new ArrayList<>();
    }

    public final Function0<Unit> getOnInitViewDone() {
        return this.onInitViewDone;
    }

    public final void setOnInitViewDone(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onInitViewDone = function0;
    }

    /* access modifiers changed from: protected */
    public final ViewGroup getRootView() {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        return viewGroup;
    }

    /* access modifiers changed from: protected */
    public final void setRootView(ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(viewGroup, "<set-?>");
        this.rootView = viewGroup;
    }

    /* access modifiers changed from: protected */
    public final SwipeRefreshLayout getSwipeRefreshLayout() {
        return this.swipeRefreshLayout;
    }

    /* access modifiers changed from: protected */
    public final void setSwipeRefreshLayout(SwipeRefreshLayout swipeRefreshLayout2) {
        this.swipeRefreshLayout = swipeRefreshLayout2;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.layout_view_stub_fragment, viewGroup, false);
    }

    public static /* synthetic */ void addSwipeToRefreshLayout$default(BaseFragment baseFragment, Integer num, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            baseFragment.addSwipeToRefreshLayout(num, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSwipeToRefreshLayout");
    }

    /* access modifiers changed from: protected */
    public final void addSwipeToRefreshLayout(Integer num, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onRefreshListener");
        if (num == null) {
            this.swipeRefreshLayout = new SwipeRefreshLayout(requireContext());
            ((FrameLayout) _$_findCachedViewById(R.id.root_view_stub)).addView(this.swipeRefreshLayout);
            ViewGroup viewGroup = this.rootView;
            if (viewGroup == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            ViewParent parent = viewGroup.getParent();
            Objects.requireNonNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup2 = (ViewGroup) parent;
            ViewGroup viewGroup3 = this.rootView;
            if (viewGroup3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            viewGroup2.removeView(viewGroup3);
            SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
            Intrinsics.checkNotNull(swipeRefreshLayout2);
            ViewGroup viewGroup4 = this.rootView;
            if (viewGroup4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            swipeRefreshLayout2.addView(viewGroup4);
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_loading);
            if (_$_findCachedViewById != null) {
                _$_findCachedViewById.bringToFront();
            }
        } else {
            ViewGroup viewGroup5 = this.rootView;
            if (viewGroup5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("rootView");
            }
            this.swipeRefreshLayout = (SwipeRefreshLayout) viewGroup5.findViewById(num.intValue());
        }
        SwipeRefreshLayout swipeRefreshLayout3 = this.swipeRefreshLayout;
        Intrinsics.checkNotNull(swipeRefreshLayout3);
        swipeRefreshLayout3.setOnRefreshListener(new BaseFragment$addSwipeToRefreshLayout$1(this, function0));
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.thecoffeehouse.guestapp.screens.base.BaseFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEmptyList$default(BaseFragment baseFragment, Object obj, String str, String str2, String str3, Function0 function0, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                function0 = null;
            }
            baseFragment.addEmptyList(obj, str, str2, str3, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEmptyList");
    }

    /* access modifiers changed from: protected */
    public final void addEmptyList(Object obj, String str, String str2, String str3, Function0<Unit> function0) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_empty, (ViewGroup) null, false);
        Intrinsics.checkNotNullExpressionValue(inflate, "emptyListLayout");
        addFrontCenterLayout(inflate);
        if (obj != null) {
            Glide.with(requireContext()).load(obj).into((ImageView) inflate.findViewById(R.id.img_empty));
        }
        if (str != null) {
            TextView textView = (TextView) inflate.findViewById(R.id.txt_empty_title);
            Intrinsics.checkNotNullExpressionValue(textView, "emptyListLayout.txt_empty_title");
            textView.setText(str);
        }
        if (str2 != null) {
            TextView textView2 = (TextView) inflate.findViewById(R.id.txt_empty_message);
            Intrinsics.checkNotNullExpressionValue(textView2, "emptyListLayout.txt_empty_message");
            textView2.setText(str2);
        }
        if (str3 != null) {
            TLButton tLButton = (TLButton) inflate.findViewById(R.id.btn_empty_action);
            Intrinsics.checkNotNullExpressionValue(tLButton, "emptyListLayout.btn_empty_action");
            tLButton.setText(str3);
            ((TLButton) inflate.findViewById(R.id.btn_empty_action)).setOnClickListener(new BaseFragment$addEmptyList$$inlined$let$lambda$1(inflate, str3, function0));
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!this.mIsTracingStarted) {
            this.mTrace.start();
            this.mIsTracingStarted = true;
        }
        registerTracer();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_fragment);
        if (viewStub != null) {
            if (!this.mIsTracingStopped) {
                this.mTrace.stop();
                this.mIsTracingStopped = true;
            }
            viewStub.setLayoutResource(layoutResId());
            viewStub.setOnInflateListener(new BaseFragment$onViewCreated$$inlined$let$lambda$1(this, viewStub, bundle));
            viewStub.inflate();
        }
    }

    public void showLoading() {
        View _$_findCachedViewById;
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if ((swipeRefreshLayout2 == null || !swipeRefreshLayout2.isRefreshing()) && (_$_findCachedViewById = _$_findCachedViewById(R.id.layout_loading)) != null) {
            _$_findCachedViewById.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void hideLoading() {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_loading);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        setupAnalytics();
        MainActivity mainActivity = getMainActivity();
        Objects.requireNonNull(mainActivity, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.base.BaseActivity<*>");
        mainActivity.setPreventCloseKeyboard(false);
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

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.visibilityChangeListener.clear();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        Iterator<T> it = this.visibilityChangeListener.iterator();
        while (it.hasNext()) {
            it.next().onHidden(z);
        }
    }

    public final void addOnHiddenChangedListener(OnHiddenChangeListener onHiddenChangeListener) {
        Intrinsics.checkNotNullParameter(onHiddenChangeListener, "l");
        this.visibilityChangeListener.add(onHiddenChangeListener);
    }

    public final void removeOnHiddenChangedListener(OnHiddenChangeListener onHiddenChangeListener) {
        Intrinsics.checkNotNullParameter(onHiddenChangeListener, "l");
        this.visibilityChangeListener.remove(onHiddenChangeListener);
    }

    /* access modifiers changed from: protected */
    public final MainActivity getMainActivity() {
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        return (MainActivity) activity;
    }

    /* access modifiers changed from: protected */
    public final TCHApplication requireTCHApplication() {
        MainActivity mainActivity = getMainActivity();
        TCHApplication tCHApplication = null;
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        if (application instanceof TCHApplication) {
            tCHApplication = application;
        }
        return tCHApplication;
    }

    private final void registerTracer() {
        String str = "Tracing: " + getClass().getSimpleName();
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        getLifecycle().addObserver(new BaseFragment$registerTracer$1(this, objectRef, str, new BaseFragment$registerTracer$onHiddenChangedListener$1(this, objectRef, str)));
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        Window window;
        WindowManager.LayoutParams attributes;
        super.onActivityCreated(bundle);
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null && (attributes = window.getAttributes()) != null) {
            attributes.windowAnimations = R.style.DialogAnimation;
        }
    }

    private final void addFrontCenterLayout(View view) {
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.root_view_stub);
        if (frameLayout != null) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
        }
        view.bringToFront();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.thecoffeehouse.guestapp.screens.base.BaseFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEmptyListLayout$default(BaseFragment baseFragment, Object obj, String str, String str2, String str3, Function0 function0, int i, Object obj2) {
        if (obj2 == null) {
            if ((i & 1) != 0) {
                obj = null;
            }
            if ((i & 2) != 0) {
                str = null;
            }
            if ((i & 4) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                str3 = null;
            }
            if ((i & 16) != 0) {
                function0 = null;
            }
            baseFragment.addEmptyListLayout(obj, str, str2, str3, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addEmptyListLayout");
    }

    /* access modifiers changed from: protected */
    public final void addEmptyListLayout(Object obj, String str, String str2, String str3, Function0<Unit> function0) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_empty, (ViewGroup) null, false);
        this.mEmptyListLayout = inflate;
        Intrinsics.checkNotNull(inflate);
        addFrontCenterLayout(inflate);
        View view = this.mEmptyListLayout;
        if (view != null) {
            if (obj != null) {
                RequestBuilder<Drawable> load = Glide.with(requireContext()).load(obj);
                View view2 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view2);
                Intrinsics.checkNotNullExpressionValue(load.into((ImageView) view2.findViewById(R.id.img_empty)), "Glide.with(requireContex…tyListLayout!!.img_empty)");
            } else {
                Intrinsics.checkNotNull(view);
                ImageView imageView = (ImageView) view.findViewById(R.id.img_empty);
                Intrinsics.checkNotNullExpressionValue(imageView, "mEmptyListLayout!!.img_empty");
                imageView.setVisibility(8);
            }
            if (str != null) {
                View view3 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view3);
                TextView textView = (TextView) view3.findViewById(R.id.txt_empty_title);
                Intrinsics.checkNotNullExpressionValue(textView, "mEmptyListLayout!!.txt_empty_title");
                textView.setText(str);
            } else {
                View view4 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view4);
                TextView textView2 = (TextView) view4.findViewById(R.id.txt_empty_title);
                Intrinsics.checkNotNullExpressionValue(textView2, "mEmptyListLayout!!.txt_empty_title");
                textView2.setVisibility(8);
            }
            if (str2 != null) {
                View view5 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view5);
                TextView textView3 = (TextView) view5.findViewById(R.id.txt_empty_message);
                Intrinsics.checkNotNullExpressionValue(textView3, "mEmptyListLayout!!.txt_empty_message");
                textView3.setText(str2);
            } else {
                View view6 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view6);
                TextView textView4 = (TextView) view6.findViewById(R.id.txt_empty_message);
                Intrinsics.checkNotNullExpressionValue(textView4, "mEmptyListLayout!!.txt_empty_message");
                textView4.setVisibility(8);
            }
            if (str3 != null) {
                View view7 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view7);
                TLButton tLButton = (TLButton) view7.findViewById(R.id.btn_empty_action);
                Intrinsics.checkNotNullExpressionValue(tLButton, "mEmptyListLayout!!.btn_empty_action");
                tLButton.setText(str3);
                View view8 = this.mEmptyListLayout;
                Intrinsics.checkNotNull(view8);
                ((TLButton) view8.findViewById(R.id.btn_empty_action)).setOnClickListener(new BaseFragment$addEmptyListLayout$$inlined$let$lambda$1(this, obj, str, str2, str3, function0));
                return;
            }
            View view9 = this.mEmptyListLayout;
            Intrinsics.checkNotNull(view9);
            TLButton tLButton2 = (TLButton) view9.findViewById(R.id.btn_empty_action);
            Intrinsics.checkNotNullExpressionValue(tLButton2, "mEmptyListLayout!!.btn_empty_action");
            tLButton2.setVisibility(8);
        }
    }

    private final void addNoInternetConnectionLayout() {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_empty, (ViewGroup) null, false);
        this.mEmptyListLayout = inflate;
        Intrinsics.checkNotNull(inflate);
        addFrontCenterLayout(inflate);
        if (this.mEmptyListLayout != null) {
            RequestBuilder<Drawable> load = Glide.with(requireContext()).load(Integer.valueOf((int) R.drawable.ic_no_internet_connection));
            View view = this.mEmptyListLayout;
            Intrinsics.checkNotNull(view);
            load.into((ImageView) view.findViewById(R.id.img_empty));
            View view2 = this.mEmptyListLayout;
            Intrinsics.checkNotNull(view2);
            TextView textView = (TextView) view2.findViewById(R.id.txt_empty_message);
            Intrinsics.checkNotNullExpressionValue(textView, "mEmptyListLayout!!.txt_empty_message");
            textView.setText(getString(R.string.str_no_internet_connection_message));
            View view3 = this.mEmptyListLayout;
            Intrinsics.checkNotNull(view3);
            TextView textView2 = (TextView) view3.findViewById(R.id.txt_empty_title);
            Intrinsics.checkNotNullExpressionValue(textView2, "mEmptyListLayout!!.txt_empty_title");
            textView2.setVisibility(8);
            View view4 = this.mEmptyListLayout;
            Intrinsics.checkNotNull(view4);
            TLButton tLButton = (TLButton) view4.findViewById(R.id.btn_empty_action);
            Intrinsics.checkNotNullExpressionValue(tLButton, "mEmptyListLayout!!.btn_empty_action");
            tLButton.setText(getString(R.string.str_retry));
            View view5 = this.mEmptyListLayout;
            Intrinsics.checkNotNull(view5);
            ((TLButton) view5.findViewById(R.id.btn_empty_action)).setOnClickListener(new BaseFragment$addNoInternetConnectionLayout$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void removeEmptyListLayout() {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup == null) {
            Intrinsics.throwUninitializedPropertyAccessException("rootView");
        }
        viewGroup.removeView(this.mEmptyListLayout);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002BC\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H\u0016R\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$ObserverBaseResource;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "onSuccess", "Lkotlin/Function1;", "", "onError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "isShowLoading", "", "isShowError", "(Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "TIMEOUT_IN_MILLIS", "", "onChanged", "t", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: BaseFragment.kt */
    public class ObserverBaseResource<T> implements Observer<Resource<? extends T>> {
        private final long TIMEOUT_IN_MILLIS;
        private final boolean isShowError;
        private final boolean isShowLoading;
        private final Function1<ServerErrorResponse, Unit> onError;
        private final Function1<T, Unit> onSuccess;
        final /* synthetic */ BaseFragment this$0;

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
        public ObserverBaseResource(BaseFragment baseFragment, Function1<? super T, Unit> function1, Function1<? super ServerErrorResponse, Unit> function12, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(function1, "onSuccess");
            Intrinsics.checkNotNullParameter(function12, "onError");
            this.this$0 = baseFragment;
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
        public /* synthetic */ ObserverBaseResource(BaseFragment baseFragment, Function1 function1, Function1 function12, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseFragment, function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function12, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
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
                    new Handler().postDelayed(new BaseFragment$ObserverBaseResource$onChanged$1(this), this.TIMEOUT_IN_MILLIS);
                }
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        FragmentActivity activity = getActivity();
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (mainActivity != null && i == mainActivity.getLOGIN_REQUEST_CODE()) {
            onLoggedInUserListener();
        }
    }
}
