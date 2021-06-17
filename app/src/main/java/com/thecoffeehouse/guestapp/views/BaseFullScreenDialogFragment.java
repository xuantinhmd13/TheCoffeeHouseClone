package com.thecoffeehouse.guestapp.views;

import android.app.Application;
import android.app.Dialog;
import android.content.Context;
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
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.share.internal.MessengerShareContentUtility;
import com.facebook.share.internal.ShareConstants;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001:\u0001EB\u0005¢\u0006\u0002\u0010\u0002JL\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00142\u0012\b\u0002\u0010\u0017\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0018\u00010\u0018H\u0004J\u0010\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u0006H\u0002J\b\u0010\u001b\u001a\u00020\u0010H\u0002J'\u0010\u001c\u001a\u00020\u00102\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u0018H\u0004¢\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0010H\u0014J\b\u0010\"\u001a\u00020\u001eH\u0014J\n\u0010#\u001a\u0004\u0018\u00010\u0014H\u0014J\n\u0010$\u001a\u0004\u0018\u00010%H\u0004J\n\u0010&\u001a\u0004\u0018\u00010'H\u0004J\b\u0010(\u001a\u00020\u001eH\u0016J\b\u0010)\u001a\u00020\u0010H\u0016J\u001a\u0010*\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J \u0010-\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0004J\b\u00101\u001a\u00020\u001eH'J\u001a\u00102\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u001a\u00104\u001a\u00020\u00102\u0006\u00103\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\u0012\u00105\u001a\u00020\u00102\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J&\u00106\u001a\u0004\u0018\u00010\u00062\u0006\u00107\u001a\u0002082\b\u00109\u001a\u0004\u0018\u00010\b2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010:\u001a\u00020\u0010H\u0016J\u001a\u0010;\u001a\u00020\u00102\u0006\u0010\u001a\u001a\u00020\u00062\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u0010<\u001a\u00020\u0010H\u0004J\b\u0010=\u001a\u00020\u0010H\u0014J \u0010>\u001a\u00020\u00102\u0006\u0010.\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0006\u0010/\u001a\u000200H\u0004J\b\u0010?\u001a\u00020\u0010H\u0002J\u001a\u0010@\u001a\u00020\u00102\u0006\u0010A\u001a\u00020B2\b\u0010C\u001a\u0004\u0018\u00010\u0014H\u0016J\b\u0010D\u001a\u00020\u0010H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "Landroidx/fragment/app/DialogFragment;", "()V", "layoutLoading", "Landroid/widget/FrameLayout;", "mEmptyListLayout", "Landroid/view/View;", "rootView", "Landroid/view/ViewGroup;", "getRootView", "()Landroid/view/ViewGroup;", "setRootView", "(Landroid/view/ViewGroup;)V", "swipeRefreshLayout", "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout;", "addEmptyListLayout", "", "icon", "", "title", "", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "buttonText", "onClickButton", "Lkotlin/Function0;", "addFrontCenterLayout", ViewHierarchyConstants.VIEW_KEY, "addNoInternetConnectionLayout", "addSwipeToRefreshLayout", "id", "", "onRefreshListener", "(Ljava/lang/Integer;Lkotlin/jvm/functions/Function0;)V", "collectDataTracking", "getAnalyticLayoutName", "getAnalyticScreenName", "getMainActivity", "Lcom/thecoffeehouse/guestapp/MainActivity;", "getTCHApplication", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "getTheme", "hideLoading", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "internetConnectedScreen", MessengerShareContentUtility.MEDIA_IMAGE, "button", "Landroid/widget/Button;", "layoutResId", "listenViewInteractions", "inflated", "observeViewModel", "onActivityCreated", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "onResume", "onViewCreated", "removeEmptyListLayout", "retryButton", "serverErrorScreen", "setupAnalytics", "show", "manager", "Landroidx/fragment/app/FragmentManager;", ViewHierarchyConstants.TAG_KEY, "showLoading", "ObserverBaseResource", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseFullScreenDialogFragment.kt */
public abstract class BaseFullScreenDialogFragment extends DialogFragment {
    private HashMap _$_findViewCache;
    private FrameLayout layoutLoading;
    private View mEmptyListLayout;
    private ViewGroup rootView;
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

    /* access modifiers changed from: protected */
    public String getAnalyticScreenName() {
        return null;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.FullScreenDialogTheme;
    }

    /* access modifiers changed from: protected */
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
    }

    /* access modifiers changed from: protected */
    public final void internetConnectedScreen(Object obj, String str, Button button) {
        Intrinsics.checkNotNullParameter(obj, MessengerShareContentUtility.MEDIA_IMAGE);
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(button, "button");
    }

    public abstract int layoutResId();

    /* access modifiers changed from: protected */
    public void listenViewInteractions(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "inflated");
    }

    /* access modifiers changed from: protected */
    public void observeViewModel(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "inflated");
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void retryButton() {
    }

    /* access modifiers changed from: protected */
    public final void serverErrorScreen(Object obj, String str, Button button) {
        Intrinsics.checkNotNullParameter(obj, MessengerShareContentUtility.MEDIA_IMAGE);
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(button, "button");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.layout_view_stub_fragment, viewGroup);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        setupAnalytics();
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002BC\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0002\u0010\fJ\u0018\u0010\u000f\u001a\u00020\u00062\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016R\u000e\u0010\r\u001a\u00020\u000eXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment$ObserverBaseResource;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "onSuccess", "Lkotlin/Function1;", "", "onError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "isShowLoading", "", "isShowError", "(Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZ)V", "TIMEOUT_IN_MILLIS", "", "onChanged", "t", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: BaseFullScreenDialogFragment.kt */
    public class ObserverBaseResource<T> implements Observer<Resource<? extends T>> {
        private final long TIMEOUT_IN_MILLIS;
        private final boolean isShowError;
        private final boolean isShowLoading;
        private final Function1<ServerErrorResponse, Unit> onError;
        private final Function1<T, Unit> onSuccess;
        final /* synthetic */ BaseFullScreenDialogFragment this$0;

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
        public ObserverBaseResource(BaseFullScreenDialogFragment baseFullScreenDialogFragment, Function1<? super T, Unit> function1, Function1<? super ServerErrorResponse, Unit> function12, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(function1, "onSuccess");
            Intrinsics.checkNotNullParameter(function12, "onError");
            this.this$0 = baseFullScreenDialogFragment;
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
        public /* synthetic */ ObserverBaseResource(BaseFullScreenDialogFragment baseFullScreenDialogFragment, Function1 function1, Function1 function12, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseFullScreenDialogFragment, function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function12, (i & 4) != 0 ? true : z, (i & 8) != 0 ? true : z2);
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
                    new Handler().postDelayed(new BaseFullScreenDialogFragment$ObserverBaseResource$onChanged$1(this), this.TIMEOUT_IN_MILLIS);
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

    /* access modifiers changed from: protected */
    public final TCHApplication getTCHApplication() {
        MainActivity mainActivity = getMainActivity();
        TCHApplication tCHApplication = null;
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        if (application instanceof TCHApplication) {
            tCHApplication = application;
        }
        return tCHApplication;
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

    /* access modifiers changed from: protected */
    public final ViewGroup getRootView() {
        return this.rootView;
    }

    /* access modifiers changed from: protected */
    public final void setRootView(ViewGroup viewGroup) {
        this.rootView = viewGroup;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_fragment);
        this.layoutLoading = (FrameLayout) view.findViewById(R.id.layout_loading);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new BaseFullScreenDialogFragment$onViewCreated$$inlined$let$lambda$1(this, viewStub, bundle));
            viewStub.setLayoutResource(layoutResId());
            viewStub.inflate();
        }
    }

    public static /* synthetic */ void addSwipeToRefreshLayout$default(BaseFullScreenDialogFragment baseFullScreenDialogFragment, Integer num, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                num = null;
            }
            baseFullScreenDialogFragment.addSwipeToRefreshLayout(num, function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addSwipeToRefreshLayout");
    }

    /* access modifiers changed from: protected */
    public final void addSwipeToRefreshLayout(Integer num, Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onRefreshListener");
        SwipeRefreshLayout swipeRefreshLayout2 = null;
        ViewParent viewParent = null;
        if (num == null) {
            this.swipeRefreshLayout = new SwipeRefreshLayout(requireContext());
            ((FrameLayout) _$_findCachedViewById(R.id.root_view_stub)).addView(this.swipeRefreshLayout);
            ViewGroup viewGroup = this.rootView;
            if (viewGroup != null) {
                viewParent = viewGroup.getParent();
            }
            Objects.requireNonNull(viewParent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) viewParent).removeView(this.rootView);
            SwipeRefreshLayout swipeRefreshLayout3 = this.swipeRefreshLayout;
            Intrinsics.checkNotNull(swipeRefreshLayout3);
            swipeRefreshLayout3.addView(this.rootView);
            FrameLayout frameLayout = this.layoutLoading;
            if (frameLayout != null) {
                frameLayout.bringToFront();
            }
        } else {
            ViewGroup viewGroup2 = this.rootView;
            if (viewGroup2 != null) {
                swipeRefreshLayout2 = (SwipeRefreshLayout) viewGroup2.findViewById(num.intValue());
            }
            this.swipeRefreshLayout = swipeRefreshLayout2;
        }
        SwipeRefreshLayout swipeRefreshLayout4 = this.swipeRefreshLayout;
        Intrinsics.checkNotNull(swipeRefreshLayout4);
        swipeRefreshLayout4.setOnRefreshListener(new BaseFullScreenDialogFragment$addSwipeToRefreshLayout$1(this, function0));
    }

    public void showLoading() {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 == null) {
            FrameLayout frameLayout = this.layoutLoading;
            if (frameLayout != null) {
                frameLayout.setVisibility(0);
            }
        } else if (swipeRefreshLayout2 == null || !swipeRefreshLayout2.isRefreshing()) {
            FrameLayout frameLayout2 = this.layoutLoading;
            if (frameLayout2 != null) {
                frameLayout2.setVisibility(0);
            }
        } else {
            SwipeRefreshLayout swipeRefreshLayout3 = this.swipeRefreshLayout;
            if (swipeRefreshLayout3 != null) {
                swipeRefreshLayout3.setRefreshing(true);
            }
        }
    }

    public void hideLoading() {
        SwipeRefreshLayout swipeRefreshLayout2 = this.swipeRefreshLayout;
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setRefreshing(false);
        }
        FrameLayout frameLayout = this.layoutLoading;
        if (frameLayout != null) {
            frameLayout.setVisibility(8);
        }
    }

    private final void addFrontCenterLayout(View view) {
        FrameLayout frameLayout = (FrameLayout) _$_findCachedViewById(R.id.root_view_stub);
        if (frameLayout != null) {
            frameLayout.addView(view, new FrameLayout.LayoutParams(-2, -2, 17));
        }
        view.bringToFront();
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v0, resolved type: com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void addEmptyListLayout$default(BaseFullScreenDialogFragment baseFullScreenDialogFragment, Object obj, String str, String str2, String str3, Function0 function0, int i, Object obj2) {
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
            baseFullScreenDialogFragment.addEmptyListLayout(obj, str, str2, str3, function0);
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
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        if (!ContextExtsKt.hasInternetConnected(requireContext)) {
            addNoInternetConnectionLayout();
            return;
        }
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
                ((TLButton) view8.findViewById(R.id.btn_empty_action)).setOnClickListener(new BaseFullScreenDialogFragment$addEmptyListLayout$$inlined$let$lambda$1(this, obj, str, str2, str3, function0));
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
            ((TLButton) view5.findViewById(R.id.btn_empty_action)).setOnClickListener(new BaseFullScreenDialogFragment$addNoInternetConnectionLayout$$inlined$let$lambda$1(this));
        }
    }

    /* access modifiers changed from: protected */
    public final void removeEmptyListLayout() {
        ViewGroup viewGroup = this.rootView;
        if (viewGroup != null) {
            viewGroup.removeView(this.mEmptyListLayout);
        }
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
