package com.thecoffeehouse.guestapp.screens.login;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.AccessToken;
import com.facebook.CallbackManager;
import com.facebook.GraphRequest;
import com.facebook.HttpMethod;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.login.LoginManager;
import com.facebook.share.internal.ShareConstants;
import com.google.android.gms.auth.api.Auth;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.phone.SmsRetriever;
import com.google.android.gms.auth.api.signin.GoogleSignIn;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInClient;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.tasks.Task;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.LocaleManager;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.screens.base.BaseActivity;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.ConfirmationOTPDialog;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.SignUpDialogFragment;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.VerifyPhoneDialog;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t*\u0002\u0017\u001d\u0018\u0000 S2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0002STB\u0005¢\u0006\u0002\u0010\u0003JB\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u00052\u0006\u0010&\u001a\u00020\u00052\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010(\u001a\u00020\u00132\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020$0*H\u0002J$\u0010,\u001a\u00020$2\u0006\u0010'\u001a\u00020\u00052\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020$0*H\u0002J\u001c\u0010.\u001a\u00020$2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020+\u0012\u0004\u0012\u00020$0*H\u0002J\b\u0010/\u001a\u00020$H\u0002J\u0010\u00100\u001a\u00020$2\u0006\u00101\u001a\u00020+H\u0002J\b\u00102\u001a\u00020$H\u0003J\b\u00103\u001a\u00020$H\u0002J\b\u00104\u001a\u00020$H\u0014J\b\u00105\u001a\u00020\bH\u0016J\b\u00106\u001a\u000207H\u0016J\u0014\u00108\u001a\u00020$2\n\b\u0002\u00109\u001a\u0004\u0018\u00010+H\u0002J\u0016\u0010:\u001a\u00020$2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020=0<H\u0002J\u0012\u0010>\u001a\u00020$2\b\u0010?\u001a\u0004\u0018\u00010\u0005H\u0002J\b\u0010@\u001a\u00020$H\u0002J\b\u0010A\u001a\u00020$H\u0014J\u0010\u0010B\u001a\u00020\u00132\u0006\u0010C\u001a\u00020\u0005H\u0002J\b\u0010D\u001a\u00020$H\u0014J\b\u0010E\u001a\u00020$H\u0002J\b\u0010F\u001a\u00020$H\u0002J\b\u0010G\u001a\u00020$H\u0002J\b\u0010H\u001a\u00020$H\u0014J\"\u0010I\u001a\u00020$2\u0006\u0010J\u001a\u00020\b2\u0006\u0010K\u001a\u00020\b2\b\u00109\u001a\u0004\u0018\u00010LH\u0014J\b\u0010M\u001a\u00020$H\u0014J\b\u0010N\u001a\u00020$H\u0002J\b\u0010O\u001a\u00020\u0013H\u0002J\b\u0010P\u001a\u00020$H\u0002J\b\u0010Q\u001a\u00020$H\u0016J\b\u0010R\u001a\u00020$H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0004\n\u0002\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u00020\u001dX\u0004¢\u0006\u0004\n\u0002\u0010\u001eR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020 X\u0004¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"¨\u0006U"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/LoginActivity;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseActivity;", "Lcom/thecoffeehouse/guestapp/screens/login/LoginViewModel;", "()V", "EXCHANGE_TOKEN_KEY", "", "EXCHANGE_TOKEN_PREFS", "RESOLVE_HINT", "", "RESULT_CODE_GOOGLE_SIGN_IN", "SMS_CONSENT_REQUEST", "mConfirmationOTPDialog", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/ConfirmationOTPDialog;", "mDefaultCountryCode", "mFbLoginCallbackManager", "Lcom/facebook/CallbackManager;", "mGoogleSignInClient", "Lcom/google/android/gms/auth/api/signin/GoogleSignInClient;", "mLoginWithPhone", "", "mOTP", "mPhoneNumber", "mPhoneNumberTextWatcher", "com/thecoffeehouse/guestapp/screens/login/LoginActivity$mPhoneNumberTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/login/LoginActivity$mPhoneNumberTextWatcher$1;", "mRequestCode", "mSmsRetrieverBroadcastReceiver", "Landroid/content/BroadcastReceiver;", "mSmsVerificationReceiver", "com/thecoffeehouse/guestapp/screens/login/LoginActivity$mSmsVerificationReceiver$1", "Lcom/thecoffeehouse/guestapp/screens/login/LoginActivity$mSmsVerificationReceiver$1;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "callRequestOTPToServer", "", "phoneNumber", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "token", "loginWithPhone", "completed", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "callSignUpOTPToServer", "onCompleted", "callVerifyOTPPhoneNumberToServer", "checkExchangeTokenV4", "checkProfileStatus", "resource", "enterPhoneNumberListener", "facebookLoginCallbackListener", "getIntentExtra", "getLayoutResId", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "goToMainActivity", "data", "handleSignInResult", "completedTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "handleSmSMessage", ShareConstants.WEB_DIALOG_PARAM_MESSAGE, "initSettingViews", "initViews", "isValidPhoneNumber", ViewHierarchyConstants.TEXT_KEY, "listenViews", "loginWithGoogleFlow", "loginWithPhoneNumberFlow", "logoutPreviousFacebookAccount", "observeViewModel", "onActivityResult", "requestCode", "resultCode", "Landroid/content/Intent;", "onDestroy", "openFacebookLoginWithPermission", "openWithoutSendResult", "requestHint", "saveStateViewModelWhenProcessIsKilled", "startFlowLoginWithPhoneNumber", "Companion", "ObserverBaseResource", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity extends BaseActivity<LoginViewModel> {
    public static final Companion Companion = new Companion(null);
    private static final String REQUEST_CODE_KEY = "RequestCode";
    private final String EXCHANGE_TOKEN_KEY = "tch_v4_old_token";
    private final String EXCHANGE_TOKEN_PREFS = "react-native";
    private final int RESOLVE_HINT = 101;
    private final int RESULT_CODE_GOOGLE_SIGN_IN = 101;
    private final int SMS_CONSENT_REQUEST = 2;
    private HashMap _$_findViewCache;
    private ConfirmationOTPDialog mConfirmationOTPDialog;
    private final String mDefaultCountryCode = "+84";
    private CallbackManager mFbLoginCallbackManager;
    private GoogleSignInClient mGoogleSignInClient;
    private boolean mLoginWithPhone = true;
    private String mOTP = "";
    private String mPhoneNumber = "";
    private LoginActivity$mPhoneNumberTextWatcher$1 mPhoneNumberTextWatcher = new LoginActivity$mPhoneNumberTextWatcher$1(this);
    private int mRequestCode = -1;
    private BroadcastReceiver mSmsRetrieverBroadcastReceiver;
    private final LoginActivity$mSmsVerificationReceiver$1 mSmsVerificationReceiver = new LoginActivity$mSmsVerificationReceiver$1(this);
    private final Class<LoginViewModel> viewModelClass = LoginViewModel.class;

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

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
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

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public int getLayoutResId() {
        return R.layout.activity_login;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void saveStateViewModelWhenProcessIsKilled() {
    }

    public static final /* synthetic */ GoogleSignInClient access$getMGoogleSignInClient$p(LoginActivity loginActivity) {
        GoogleSignInClient googleSignInClient = loginActivity.mGoogleSignInClient;
        if (googleSignInClient == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGoogleSignInClient");
        }
        return googleSignInClient;
    }

    public static final /* synthetic */ LoginViewModel access$getViewModel$p(LoginActivity loginActivity) {
        return (LoginViewModel) loginActivity.getViewModel();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/LoginActivity$Companion;", "", "()V", "REQUEST_CODE_KEY", "", "openWithActivityResult", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "requestCode", "", "bundle", "Landroid/os/Bundle;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: LoginActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void openWithActivityResult(AppCompatActivity appCompatActivity, int i, Bundle bundle) {
            Intrinsics.checkNotNullParameter(appCompatActivity, "activity");
            Intent intent = new Intent(appCompatActivity, LoginActivity.class);
            if (bundle != null) {
                intent.putExtras(bundle);
            }
            intent.putExtra(LoginActivity.REQUEST_CODE_KEY, i);
            appCompatActivity.startActivityForResult(intent, i);
        }
    }

    /* access modifiers changed from: private */
    public final boolean isValidPhoneNumber(String str) {
        return str.length() >= 9;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public Class<LoginViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void initViews() {
        super.initViews();
        checkExchangeTokenV4();
        logoutPreviousFacebookAccount();
        CallbackManager create = CallbackManager.Factory.create();
        Intrinsics.checkNotNullExpressionValue(create, "CallbackManager.Factory.create()");
        this.mFbLoginCallbackManager = create;
        SmsRetriever.getClient((Activity) this).startSmsUserConsent(null);
        registerReceiver(this.mSmsVerificationReceiver, new IntentFilter(SmsRetriever.SMS_RETRIEVED_ACTION));
        initSettingViews();
        requestHint();
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.img_close);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_close");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new LoginActivity$initViews$1(this), 1, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void getIntentExtra() {
        super.getIntentExtra();
        this.mRequestCode = getIntent().getIntExtra(REQUEST_CODE_KEY, -1);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00030\u0002B/\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\f\u001a\u00020\u00062\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003H\u0016R\u000e\u0010\n\u001a\u00020\u000bXD¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/LoginActivity$ObserverBaseResource;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "onSuccess", "Lkotlin/Function1;", "", "onError", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "(Lcom/thecoffeehouse/guestapp/screens/login/LoginActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "TIMEOUT_IN_MILLIS", "", "onChanged", "t", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: LoginActivity.kt */
    public class ObserverBaseResource<T> implements Observer<Resource<? extends T>> {
        private final long TIMEOUT_IN_MILLIS;
        private final Function1<ServerErrorResponse, Unit> onError;
        private final Function1<T, Unit> onSuccess;
        final /* synthetic */ LoginActivity this$0;

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
        public ObserverBaseResource(LoginActivity loginActivity, Function1<? super T, Unit> function1, Function1<? super ServerErrorResponse, Unit> function12) {
            Intrinsics.checkNotNullParameter(function1, "onSuccess");
            Intrinsics.checkNotNullParameter(function12, "onError");
            this.this$0 = loginActivity;
            this.onSuccess = function1;
            this.onError = function12;
            this.TIMEOUT_IN_MILLIS = 20000;
        }

        @Override // androidx.lifecycle.Observer
        public /* bridge */ /* synthetic */ void onChanged(Object obj) {
            onChanged((Resource) ((Resource) obj));
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ObserverBaseResource(LoginActivity loginActivity, Function1 function1, Function1 function12, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(loginActivity, function1, (i & 2) != 0 ? AnonymousClass1.INSTANCE : function12);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v6, resolved type: kotlin.jvm.functions.Function1<T, kotlin.Unit> */
        /* JADX WARN: Multi-variable type inference failed */
        public void onChanged(Resource<? extends T> resource) {
            String str;
            if (resource != null) {
                int i = WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
                if (i == 1) {
                    this.this$0.showLoading();
                    new Handler().postDelayed(new LoginActivity$ObserverBaseResource$onChanged$$inlined$let$lambda$1(this, resource), this.TIMEOUT_IN_MILLIS);
                } else if (i == 2) {
                    this.this$0.hideLoading();
                    Object data = resource.getData();
                    Intrinsics.checkNotNull(data);
                    this.onSuccess.invoke(data);
                } else if (i == 3) {
                    this.this$0.hideLoading();
                    if (resource.getServerError() != null) {
                        this.onError.invoke(resource.getServerError());
                        LoginActivity loginActivity = this.this$0;
                        String string = loginActivity.getString(R.string.str_error);
                        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
                        ServerError error = resource.getServerError().getError();
                        if (error == null || (str = error.getMessage()) == null) {
                            str = "";
                        }
                        ContextExtsKt.showOneButtonAlertDialog$default(loginActivity, string, str, null, false, null, 28, null);
                    }
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
    }

    private final void checkExchangeTokenV4() {
        String string = SharePrefs.INSTANCE.getString(this, this.EXCHANGE_TOKEN_PREFS, this.EXCHANGE_TOKEN_KEY);
        if (string != null) {
            ((LoginViewModel) getViewModel()).exchangeTokenV4(string).observe(this, new LoginActivity$checkExchangeTokenV4$1(this));
        }
    }

    private final void logoutPreviousFacebookAccount() {
        if (AccessToken.getCurrentAccessToken() != null) {
            new GraphRequest(AccessToken.getCurrentAccessToken(), "/me/permissions/", null, HttpMethod.DELETE, LoginActivity$logoutPreviousFacebookAccount$1.INSTANCE).executeAsync();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void listenViews() {
        super.listenViews();
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.btn_login_with_facebook);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "btn_login_with_facebook");
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout, 0, new LoginActivity$listenViews$1(this), 1, null);
        facebookLoginCallbackListener();
        ConstraintLayout constraintLayout2 = (ConstraintLayout) _$_findCachedViewById(R.id.btn_login_with_google);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "btn_login_with_google");
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout2, 0, new LoginActivity$listenViews$2(this), 1, null);
        TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_verify_phone_number);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_verify_phone_number");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new LoginActivity$listenViews$3(this), 1, null);
        enterPhoneNumberListener();
    }

    /* access modifiers changed from: private */
    public final void loginWithGoogleFlow() {
        GoogleSignInClient client = GoogleSignIn.getClient((Activity) this, new GoogleSignInOptions.Builder(GoogleSignInOptions.DEFAULT_SIGN_IN).requestEmail().requestId().requestIdToken(getString(R.string.str_google_login_client_id)).build());
        Intrinsics.checkNotNullExpressionValue(client, "GoogleSignIn.getClient(this, googleSignInOptions)");
        this.mGoogleSignInClient = client;
        if (client == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mGoogleSignInClient");
        }
        Intent signInIntent = client.getSignInIntent();
        Intrinsics.checkNotNullExpressionValue(signInIntent, "mGoogleSignInClient.signInIntent");
        startActivityForResult(signInIntent, this.RESULT_CODE_GOOGLE_SIGN_IN);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.activity.ComponentActivity, androidx.fragment.app.FragmentActivity
    public void onActivityResult(int i, int i2, Intent intent) {
        CallbackManager callbackManager = this.mFbLoginCallbackManager;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFbLoginCallbackManager");
        }
        callbackManager.onActivityResult(i, i2, intent);
        super.onActivityResult(i, i2, intent);
        if (i == this.RESULT_CODE_GOOGLE_SIGN_IN) {
            Task<GoogleSignInAccount> signedInAccountFromIntent = GoogleSignIn.getSignedInAccountFromIntent(intent);
            Intrinsics.checkNotNullExpressionValue(signedInAccountFromIntent, "GoogleSignIn.getSignedInAccountFromIntent(data)");
            handleSignInResult(signedInAccountFromIntent);
        }
        if (i == this.RESOLVE_HINT && i2 == -1) {
            String str = null;
            Credential credential = intent != null ? (Credential) intent.getParcelableExtra(Credential.EXTRA_KEY) : null;
            GeneralKt.log(credential != null ? credential.getId() : null);
            EditText editText = (EditText) _$_findCachedViewById(R.id.edt_phone_number);
            if (credential != null) {
                str = credential.getId();
            }
            editText.setText(str);
            ((EditText) _$_findCachedViewById(R.id.edt_phone_number)).performClick();
        }
        if (i == this.SMS_CONSENT_REQUEST && i2 == -1 && intent != null) {
            String stringExtra = intent.getStringExtra(SmsRetriever.EXTRA_SMS_MESSAGE);
            GeneralKt.log(stringExtra);
            handleSmSMessage(stringExtra);
        }
    }

    private final void handleSmSMessage(String str) {
        Matcher matcher = Pattern.compile("(\\d{6})").matcher(str);
        if (matcher.find()) {
            String group = matcher.group(0);
            ConfirmationOTPDialog confirmationOTPDialog = this.mConfirmationOTPDialog;
            if (confirmationOTPDialog != null) {
                confirmationOTPDialog.setAutoFillCode(group);
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity
    public void onDestroy() {
        super.onDestroy();
        BroadcastReceiver broadcastReceiver = this.mSmsRetrieverBroadcastReceiver;
        if (broadcastReceiver != null) {
            unregisterReceiver(broadcastReceiver);
        }
        unregisterReceiver(this.mSmsVerificationReceiver);
    }

    private final void handleSignInResult(Task<GoogleSignInAccount> task) {
        try {
            GoogleSignInAccount result = task.getResult(ApiException.class);
            LoginViewModel loginViewModel = (LoginViewModel) getViewModel();
            String str = null;
            String valueOf = String.valueOf(result != null ? result.getId() : null);
            if (result != null) {
                str = result.getIdToken();
            }
            loginViewModel.callSignUpWithGoogleAPI(valueOf, String.valueOf(str)).observe(this, new ObserverBaseResource(this, new LoginActivity$handleSignInResult$1(this), null, 2, null));
            if (this.mGoogleSignInClient != null) {
                GoogleSignInClient googleSignInClient = this.mGoogleSignInClient;
                if (googleSignInClient == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mGoogleSignInClient");
                }
                googleSignInClient.signOut();
            }
        } catch (ApiException e) {
            GeneralKt.log("signInResult:failed code=" + e.getStatusCode());
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public void observeViewModel() {
        super.observeViewModel();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseActivity
    public ViewModelProvider.Factory getViewModelFactory() {
        return new LoginViewModelFactory(this, null);
    }

    /* access modifiers changed from: private */
    public final void loginWithPhoneNumberFlow() {
        EditText editText = (EditText) _$_findCachedViewById(R.id.edt_phone_number);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_phone_number");
        if (!isValidPhoneNumber(editText.getText().toString())) {
            String string = getString(R.string.str_invalid_phone_number);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_invalid_phone_number)");
            String string2 = getString(R.string.str_please_check_and_retry_again);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_p…se_check_and_retry_again)");
            ContextExtsKt.showOneButtonAlertDialog(this, string, string2, getString(R.string.str_done), false, new LoginActivity$loginWithPhoneNumberFlow$1(this));
            TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_verify_phone_number);
            Intrinsics.checkNotNullExpressionValue(tLButton, "btn_verify_phone_number");
            tLButton.setEnabled(true);
            return;
        }
        EditText editText2 = (EditText) _$_findCachedViewById(R.id.edt_phone_number);
        Intrinsics.checkNotNullExpressionValue(editText2, "edt_phone_number");
        this.mPhoneNumber = editText2.getText().toString();
        try {
            PhoneNumberUtil instance = PhoneNumberUtil.getInstance();
            if (instance.isValidNumber(instance.parse(this.mPhoneNumber, "VN"))) {
                startFlowLoginWithPhoneNumber();
                return;
            }
            String string3 = getString(R.string.str_invalid_phone_number);
            Intrinsics.checkNotNullExpressionValue(string3, "getString(R.string.str_invalid_phone_number)");
            String string4 = getString(R.string.str_please_check_and_retry_again);
            Intrinsics.checkNotNullExpressionValue(string4, "getString(R.string.str_p…se_check_and_retry_again)");
            ContextExtsKt.showOneButtonAlertDialog(this, string3, string4, getString(R.string.str_done), false, new LoginActivity$loginWithPhoneNumberFlow$2(this));
            TLButton tLButton2 = (TLButton) _$_findCachedViewById(R.id.btn_verify_phone_number);
            Intrinsics.checkNotNullExpressionValue(tLButton2, "btn_verify_phone_number");
            tLButton2.setEnabled(true);
        } catch (NumberParseException e) {
            e.printStackTrace();
        }
    }

    private final void startFlowLoginWithPhoneNumber() {
        callRequestOTPToServer$default(this, this.mPhoneNumber, this.mDefaultCountryCode, null, false, new LoginActivity$startFlowLoginWithPhoneNumber$1(this), 12, null);
    }

    /* access modifiers changed from: private */
    public final void callVerifyOTPPhoneNumberToServer(Function1<? super AuthResponse, Unit> function1) {
        ((LoginViewModel) getViewModel()).callOTPVerificationAPI(this.mPhoneNumber, this.mOTP).observe(this, new ObserverBaseResource(this, new LoginActivity$callVerifyOTPPhoneNumberToServer$1(this, function1), new LoginActivity$callVerifyOTPPhoneNumberToServer$2(this)));
    }

    /* access modifiers changed from: private */
    public final void checkProfileStatus(AuthResponse authResponse) {
        Window window;
        Window window2;
        int profileStatus = authResponse.getProfileStatus();
        if (profileStatus == -1) {
            GeneralKt.log("profileStatus: UNKNOWN");
        } else if (profileStatus == 0) {
            GeneralKt.log("profileStatus: NEW_USER");
            if (this.mLoginWithPhone) {
                SignUpDialogFragment newInstance = SignUpDialogFragment.Companion.newInstance(authResponse, new LoginActivity$checkProfileStatus$signUpDialog$1(this, authResponse));
                FragmentManager supportFragmentManager = getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
                newInstance.show(supportFragmentManager, (String) null);
                return;
            }
            VerifyPhoneDialog newInstance2 = VerifyPhoneDialog.Companion.newInstance(new LoginActivity$checkProfileStatus$verifyPhoneDialog$1(this, authResponse));
            Dialog dialog = newInstance2.getDialog();
            if (!(dialog == null || (window = dialog.getWindow()) == null)) {
                window.setSoftInputMode(4);
            }
            FragmentManager supportFragmentManager2 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager2, "supportFragmentManager");
            newInstance2.show(supportFragmentManager2, (String) null);
        } else if (profileStatus == 1) {
            GeneralKt.log("profileStatus: VERIFY");
            goToMainActivity(authResponse);
        } else if (profileStatus == 2) {
            GeneralKt.log("profileStatus: MULTIPLE ACCOUNTS");
            ((LoginViewModel) getViewModel()).callListProfileToMerge(authResponse.getToken()).observe(this, new LoginActivity$checkProfileStatus$1(this, authResponse));
        } else if (profileStatus == 3) {
            GeneralKt.log("profileStatus: USER_VERIFY_PHONE");
            VerifyPhoneDialog newInstance3 = VerifyPhoneDialog.Companion.newInstance(new LoginActivity$checkProfileStatus$verifyPhoneDialog$2(this, authResponse));
            Dialog dialog2 = newInstance3.getDialog();
            if (!(dialog2 == null || (window2 = dialog2.getWindow()) == null)) {
                window2.setSoftInputMode(4);
            }
            FragmentManager supportFragmentManager3 = getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager3, "supportFragmentManager");
            newInstance3.show(supportFragmentManager3, (String) null);
        }
    }

    static /* synthetic */ void goToMainActivity$default(LoginActivity loginActivity, AuthResponse authResponse, int i, Object obj) {
        if ((i & 1) != 0) {
            authResponse = null;
        }
        loginActivity.goToMainActivity(authResponse);
    }

    private final void goToMainActivity(AuthResponse authResponse) {
        if (authResponse != null) {
            ((LoginViewModel) getViewModel()).saveProfileToLocal(authResponse);
        }
        if (openWithoutSendResult()) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(268533760);
            startActivity(intent);
            return;
        }
        setResult(-1);
        finish();
    }

    private final boolean openWithoutSendResult() {
        return this.mRequestCode == -1;
    }

    /* access modifiers changed from: private */
    public final void callSignUpOTPToServer(String str, Function1<? super AuthResponse, Unit> function1) {
        ((LoginViewModel) getViewModel()).callSignUpOTPToServer(str, this.mPhoneNumber, this.mDefaultCountryCode, this.mOTP).observe(this, new ObserverBaseResource(this, new LoginActivity$callSignUpOTPToServer$1(this, function1), new LoginActivity$callSignUpOTPToServer$2(this)));
    }

    private final void enterPhoneNumberListener() {
        ((EditText) _$_findCachedViewById(R.id.edt_phone_number)).addTextChangedListener(this.mPhoneNumberTextWatcher);
        ((EditText) _$_findCachedViewById(R.id.edt_phone_number)).setOnTouchListener(new LoginActivity$enterPhoneNumberListener$1(this));
    }

    private final void facebookLoginCallbackListener() {
        LoginManager instance = LoginManager.getInstance();
        CallbackManager callbackManager = this.mFbLoginCallbackManager;
        if (callbackManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFbLoginCallbackManager");
        }
        instance.registerCallback(callbackManager, new LoginActivity$facebookLoginCallbackListener$1(this));
    }

    private final void initSettingViews() {
        LoginActivity loginActivity = this;
        String languageCode = LocaleManager.getLanguageCode(loginActivity);
        GeneralKt.log("mCurrentLanguage: " + LocaleManager.getLanguageCode(loginActivity));
        if (Intrinsics.areEqual(languageCode, "vi")) {
            ((TextView) _$_findCachedViewById(R.id.txt_vi_language)).setTextColor(ContextCompat.getColor(loginActivity, R.color.color323232));
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_vi_language);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_vi_language");
            textView.setText(getString(R.string.str_language_vi));
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_en_language);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_en_language");
            textView2.setText(getString(R.string.str_language_en));
            ((TextView) _$_findCachedViewById(R.id.txt_en_language)).setTextColor(ContextCompat.getColor(loginActivity, R.color.color838387));
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_en_language);
            Intrinsics.checkNotNullExpressionValue(textView3, "txt_en_language");
            ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new LoginActivity$initSettingViews$1(this), 1, null);
        } else if (Intrinsics.areEqual(languageCode, "en")) {
            ((TextView) _$_findCachedViewById(R.id.txt_vi_language)).setTextColor(ContextCompat.getColor(loginActivity, R.color.color838387));
            TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_vi_language);
            Intrinsics.checkNotNullExpressionValue(textView4, "txt_vi_language");
            textView4.setText(getString(R.string.str_language_vi));
            ((TextView) _$_findCachedViewById(R.id.txt_en_language)).setTextColor(ContextCompat.getColor(loginActivity, R.color.color323232));
            TextView textView5 = (TextView) _$_findCachedViewById(R.id.txt_en_language);
            Intrinsics.checkNotNullExpressionValue(textView5, "txt_en_language");
            textView5.setText(getString(R.string.str_language_en));
            TextView textView6 = (TextView) _$_findCachedViewById(R.id.txt_vi_language);
            Intrinsics.checkNotNullExpressionValue(textView6, "txt_vi_language");
            ContextExtsKt.setOnSafeClickListener$default(textView6, 0, new LoginActivity$initSettingViews$2(this), 1, null);
        }
    }

    /* access modifiers changed from: private */
    public final void openFacebookLoginWithPermission() {
        LoginManager.getInstance().logInWithReadPermissions(this, CollectionsKt.arrayListOf("public_profile", "email", "user_birthday"));
    }

    static /* synthetic */ void callRequestOTPToServer$default(LoginActivity loginActivity, String str, String str2, String str3, boolean z, Function1 function1, int i, Object obj) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            z = true;
        }
        loginActivity.callRequestOTPToServer(str, str2, str3, z, function1);
    }

    /* access modifiers changed from: private */
    public final void callRequestOTPToServer(String str, String str2, String str3, boolean z, Function1<? super AuthResponse, Unit> function1) {
        ((LoginViewModel) getViewModel()).callRequestOTPToServer(str2, str).observe(this, new ObserverBaseResource(this, new LoginActivity$callRequestOTPToServer$1(this, z, function1, str3), new LoginActivity$callRequestOTPToServer$2(this)));
    }

    private final void requestHint() {
        try {
            HintRequest build = new HintRequest.Builder().setPhoneNumberIdentifierSupported(true).build();
            PendingIntent hintPickerIntent = Auth.CredentialsApi.getHintPickerIntent(new GoogleApiClient.Builder(this).addApi(Auth.CREDENTIALS_API).enableAutoManage(this, LoginActivity$requestHint$apiClient$1.INSTANCE).build(), build);
            Intrinsics.checkNotNullExpressionValue(hintPickerIntent, "intent");
            startIntentSenderForResult(hintPickerIntent.getIntentSender(), this.RESOLVE_HINT, null, 0, 0, 0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
