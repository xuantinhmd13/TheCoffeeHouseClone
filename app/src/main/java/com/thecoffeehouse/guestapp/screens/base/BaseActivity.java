package com.thecoffeehouse.guestapp.screens.base;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.LocaleManager;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u00012B\u0005¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0014J\u0012\u0010\u0019\u001a\u00020\u00162\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00062\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001d\u001a\u00020\u0016H\u0014J\b\u0010\u001e\u001a\u00020\u001fH'J\b\u0010 \u001a\u00020!H\u0004J\b\u0010\"\u001a\u00020#H&J\b\u0010$\u001a\u00020\u0016H\u0004J\b\u0010%\u001a\u00020\u0016H\u0014J\b\u0010&\u001a\u00020\u0016H\u0014J\b\u0010'\u001a\u00020\u0016H\u0014J\u0012\u0010(\u001a\u00020\u00162\b\u0010)\u001a\u0004\u0018\u00010*H\u0014J\b\u0010+\u001a\u00020\u0016H\u0014J\u0010\u0010,\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*H\u0014J\u0010\u0010-\u001a\u00020\u00162\u0006\u0010.\u001a\u00020*H\u0014J\b\u0010/\u001a\u00020\u0016H\u0014J\b\u00100\u001a\u00020\u0016H&J\b\u00101\u001a\u00020\u0016H\u0004R\u001a\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0007\"\u0004\b\b\u0010\tR\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00028\u00008DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00063"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "isPreventCloseKeyboard", "", "()Z", "setPreventCloseKeyboard", "(Z)V", "mLoadingLayout", "Landroid/view/View;", "viewModel", "getViewModel", "()Landroidx/lifecycle/ViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "attachBaseContext", "", "newBase", "Landroid/content/Context;", "closeKeyboardWhenTouchOutside", "ev", "Landroid/view/MotionEvent;", "dispatchTouchEvent", "getIntentExtra", "getLayoutResId", "", "getTCHApplication", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "hideLoading", "initViews", "listenViews", "observeViewModel", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onRestoreInstanceState", "onSaveInstanceState", "outState", "registersAndCallsBackground", "saveStateViewModelWhenProcessIsKilled", "showLoading", "ObserverBaseResource", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseActivity.kt */
public abstract class BaseActivity<T extends ViewModel> extends AppCompatActivity {
    private HashMap _$_findViewCache;
    private boolean isPreventCloseKeyboard;
    private View mLoadingLayout;
    private final Lazy viewModel$delegate = LazyKt.lazy(new BaseActivity$viewModel$2(this));

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
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public abstract int getLayoutResId();

    /* access modifiers changed from: protected */
    public final T getViewModel() {
        return (T) ((ViewModel) this.viewModel$delegate.getValue());
    }

    public abstract Class<T> getViewModelClass();

    public abstract ViewModelProvider.Factory getViewModelFactory();

    /* access modifiers changed from: protected */
    public void initViews() {
    }

    /* access modifiers changed from: protected */
    public void listenViews() {
    }

    /* access modifiers changed from: protected */
    public void observeViewModel() {
    }

    /* access modifiers changed from: protected */
    public void registersAndCallsBackground() {
    }

    public abstract void saveStateViewModelWhenProcessIsKilled();

    public boolean isPreventCloseKeyboard() {
        return this.isPreventCloseKeyboard;
    }

    public void setPreventCloseKeyboard(boolean z) {
        this.isPreventCloseKeyboard = z;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(getLayoutResId());
        getIntentExtra();
        initViews();
        observeViewModel();
        listenViews();
        registersAndCallsBackground();
    }

    /* access modifiers changed from: protected */
    @Override // androidx.fragment.app.FragmentActivity
    public void onPause() {
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public final void showLoading() {
        if (this.mLoadingLayout == null) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.layout_loading, (ViewGroup) null, false);
            this.mLoadingLayout = inflate;
            ((ViewGroup) findViewById(16908290)).addView(inflate, new ViewGroup.LayoutParams(-1, -1));
        }
    }

    /* access modifiers changed from: protected */
    public final void hideLoading() {
        View view = this.mLoadingLayout;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                parent = null;
            }
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup != null) {
                viewGroup.removeView(view);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        GeneralKt.log("On save instance state");
        saveStateViewModelWhenProcessIsKilled();
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "savedInstanceState");
        super.onRestoreInstanceState(bundle);
        GeneralKt.log("On restore instance state");
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity
    public void attachBaseContext(Context context) {
        if (context != null) {
            super.attachBaseContext(LocaleManager.setLocale(context));
        } else {
            super.attachBaseContext(context);
        }
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (!isPreventCloseKeyboard()) {
            closeKeyboardWhenTouchOutside(motionEvent);
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    /* access modifiers changed from: protected */
    public void getIntentExtra() {
        Intent intent = getIntent();
        Intrinsics.checkNotNullExpressionValue(intent, "intent");
        if (intent.getExtras() == null) {
        }
    }

    /* access modifiers changed from: protected */
    public final TCHApplication getTCHApplication() {
        Application application = getApplication();
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        return (TCHApplication) application;
    }

    private final void closeKeyboardWhenTouchOutside(MotionEvent motionEvent) {
        View currentFocus = getCurrentFocus();
        if (currentFocus != null) {
            if (((motionEvent != null && motionEvent.getAction() == 1) || (motionEvent != null && motionEvent.getAction() == 2)) && (currentFocus instanceof EditText)) {
                String name = currentFocus.getClass().getName();
                Intrinsics.checkNotNullExpressionValue(name, "view::class.java.name");
                Float f = null;
                if (!StringsKt.startsWith$default(name, "android.webkit.", false, 2, (Object) null)) {
                    int[] iArr = new int[2];
                    currentFocus.getLocationOnScreen(iArr);
                    if (motionEvent != null) {
                        f = Float.valueOf(motionEvent.getRawX());
                    }
                    Intrinsics.checkNotNull(f);
                    EditText editText = (EditText) currentFocus;
                    float floatValue = (f.floatValue() + ((float) editText.getLeft())) - ((float) iArr[0]);
                    float rawY = (motionEvent.getRawY() + ((float) editText.getTop())) - ((float) iArr[1]);
                    if (floatValue < ((float) editText.getLeft()) || floatValue > ((float) editText.getRight()) || rawY < ((float) editText.getTop()) || rawY > ((float) editText.getBottom())) {
                        currentFocus.clearFocus();
                        Object systemService = getSystemService("input_method");
                        Objects.requireNonNull(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
                        Window window = getWindow();
                        Intrinsics.checkNotNullExpressionValue(window, "this.window");
                        View decorView = window.getDecorView();
                        Intrinsics.checkNotNullExpressionValue(decorView, "this.window.decorView");
                        ((InputMethodManager) systemService).hideSoftInputFromWindow(decorView.getApplicationWindowToken(), 0);
                    }
                }
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0001\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity$ObserverBaseResource;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "onSuccess", "Lkotlin/Function1;", "", "onError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "(Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "TIMEOUT_IN_MILLIS", "", "onChanged", "t", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: BaseActivity.kt */
    public class ObserverBaseResource<T> implements Observer<Resource<? extends T>> {
        private final long TIMEOUT_IN_MILLIS;
        private final Function1<ServerErrorResponse, Unit> onError;
        private final Function1<T, Unit> onSuccess;
        final /* synthetic */ BaseActivity this$0;

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
        public ObserverBaseResource(BaseActivity baseActivity, Function1<? super T, Unit> function1, Function1<? super ServerErrorResponse, Unit> function12) {
            Intrinsics.checkNotNullParameter(function1, "onSuccess");
            Intrinsics.checkNotNullParameter(function12, "onError");
            this.this$0 = baseActivity;
            this.onSuccess = function1;
            this.onError = function12;
            this.TIMEOUT_IN_MILLIS = 20000;
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            onChanged((Resource) ((Resource) obj));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ObserverBaseResource(BaseActivity baseActivity, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(baseActivity, function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public void onChanged(Resource<? extends T> resource) {
            String str;
            if (resource != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
                if (i == 1) {
                    this.this$0.showLoading();
                    new Handler().postDelayed(new BaseActivity$ObserverBaseResource$onChanged$$inlined$let$lambda$1(this, resource), this.TIMEOUT_IN_MILLIS);
                } else if (i == 2) {
                    this.this$0.hideLoading();
                    Object data = resource.getData();
                    if (data != null) {
                        this.onSuccess.invoke(data);
                    }
                } else if (i == 3) {
                    this.this$0.hideLoading();
                    if (resource.getServerError() != null) {
                        this.onError.invoke(resource.getServerError());
                        BaseActivity baseActivity = this.this$0;
                        String string = baseActivity.getString(R.string.str_error);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
                        ServerError error = resource.getServerError().getError();
                        if (error == null || (str = error.getMessage()) == null) {
                            str = "";
                        }
                        ContextExtsKt.showOneButtonAlertDialog$default(baseActivity, string, str, null, false, null, 28, null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }
}
