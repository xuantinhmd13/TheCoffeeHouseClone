package com.thecoffeehouse.guestapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Application;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.configs.LocaleManager;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.MetadataRequest;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.EncryptionUtils;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.io.InputStreamReader;
import java.io.Reader;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001:\u0001AB\u0005¢\u0006\u0002\u0010\u0002J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0002J\b\u0010/\u001a\u000204H\u0002J\b\u00109\u001a\u000204H\u0002J\b\u0010:\u001a\u000204H\u0016J\u0012\u0010;\u001a\u0002042\b\u0010<\u001a\u0004\u0018\u00010\u0004H\u0002J\u0006\u0010=\u001a\u00020\u0016J\u0006\u0010>\u001a\u00020\u001cJ\u0006\u0010?\u001a\u00020#J\u0006\u0010@\u001a\u00020(R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\"\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\f\u001a\u00020\rX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0011@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u001b\u0010\u001b\u001a\u00020\u001c8BX\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b\u001d\u0010\u001eR\u0012\u0010 \u001a\u00060!R\u00020\u0000X.¢\u0006\u0002\n\u0000R\u001b\u0010\"\u001a\u00020#8BX\u0002¢\u0006\f\n\u0004\b&\u0010\u001a\u001a\u0004\b$\u0010%R\u001b\u0010'\u001a\u00020(8BX\u0002¢\u0006\f\n\u0004\b+\u0010\u001a\u001a\u0004\b)\u0010*R\u0017\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-8F¢\u0006\u0006\u001a\u0004\b/\u00100R\u0014\u00101\u001a\b\u0012\u0004\u0012\u00020.02X\u0004¢\u0006\u0002\n\u0000¨\u0006B"}, d2 = {"Lcom/thecoffeehouse/guestapp/TCHApplication;", "Landroid/app/Application;", "()V", "META_DATA_FILE", "", "ZALO_APP_ID", "", "<set-?>", "Landroid/app/Activity;", "currentActivity", "getCurrentActivity", "()Landroid/app/Activity;", "isChangedFcmToken", "", "()Z", "setChangedFcmToken", "(Z)V", "Landroidx/lifecycle/Lifecycle$Event;", "lifecycleState", "getLifecycleState", "()Landroidx/lifecycle/Lifecycle$Event;", "mClientManager", "Lcom/thecoffeehouse/guestapp/ClientManager;", "getMClientManager", "()Lcom/thecoffeehouse/guestapp/ClientManager;", "mClientManager$delegate", "Lkotlin/Lazy;", "mCommonServiceManager", "Lcom/thecoffeehouse/guestapp/CommonServiceManager;", "getMCommonServiceManager", "()Lcom/thecoffeehouse/guestapp/CommonServiceManager;", "mCommonServiceManager$delegate", "mMainActivityLifecycleCallback", "Lcom/thecoffeehouse/guestapp/TCHApplication$MainActivityLifecycleCallbacks;", "mOrderManager", "Lcom/thecoffeehouse/guestapp/OrderManager;", "getMOrderManager", "()Lcom/thecoffeehouse/guestapp/OrderManager;", "mOrderManager$delegate", "mRewardsManager", "Lcom/thecoffeehouse/guestapp/RewardsManager;", "getMRewardsManager", "()Lcom/thecoffeehouse/guestapp/RewardsManager;", "mRewardsManager$delegate", "metadata", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "getMetadata", "()Landroidx/lifecycle/LiveData;", "mutableMetadata", "Landroidx/lifecycle/MutableLiveData;", "attachBaseContext", "", "base", "Landroid/content/Context;", "checkUpdateIsAvailable", "createNotificationChannel", "initialization", "onCreate", "pingDeviceConnected", "barcode", "requireClientManager", "requireCommonServiceManager", "requireOrderManager", "requireRewardsManager", "MainActivityLifecycleCallbacks", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TCHApplication.kt */
public final class TCHApplication extends Application {
    private final String META_DATA_FILE = "metadata.txt";
    private final int ZALO_APP_ID = 99;
    private Activity currentActivity;
    private boolean isChangedFcmToken;
    private Lifecycle.Event lifecycleState = Lifecycle.Event.ON_CREATE;
    private final Lazy mClientManager$delegate = LazyKt.lazy(new TCHApplication$mClientManager$2(this));
    private final Lazy mCommonServiceManager$delegate = LazyKt.lazy(TCHApplication$mCommonServiceManager$2.INSTANCE);
    private MainActivityLifecycleCallbacks mMainActivityLifecycleCallback;
    private final Lazy mOrderManager$delegate = LazyKt.lazy(new TCHApplication$mOrderManager$2(this));
    private final Lazy mRewardsManager$delegate = LazyKt.lazy(new TCHApplication$mRewardsManager$2(this));
    private final MutableLiveData<GetMetadataResponse> mutableMetadata = new MutableLiveData<>();

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final ClientManager getMClientManager() {
        return (ClientManager) this.mClientManager$delegate.getValue();
    }

    private final CommonServiceManager getMCommonServiceManager() {
        return (CommonServiceManager) this.mCommonServiceManager$delegate.getValue();
    }

    private final OrderManager getMOrderManager() {
        return (OrderManager) this.mOrderManager$delegate.getValue();
    }

    private final RewardsManager getMRewardsManager() {
        return (RewardsManager) this.mRewardsManager$delegate.getValue();
    }

    public static final /* synthetic */ MainActivityLifecycleCallbacks access$getMMainActivityLifecycleCallback$p(TCHApplication tCHApplication) {
        MainActivityLifecycleCallbacks mainActivityLifecycleCallbacks = tCHApplication.mMainActivityLifecycleCallback;
        if (mainActivityLifecycleCallbacks == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMainActivityLifecycleCallback");
        }
        return mainActivityLifecycleCallbacks;
    }

    public final Activity getCurrentActivity() {
        return this.currentActivity;
    }

    public final boolean isChangedFcmToken() {
        return this.isChangedFcmToken;
    }

    public final void setChangedFcmToken(boolean z) {
        this.isChangedFcmToken = z;
    }

    public final Lifecycle.Event getLifecycleState() {
        return this.lifecycleState;
    }

    /* renamed from: getMetadata  reason: collision with other method in class */
    public final LiveData<GetMetadataResponse> m0getMetadata() {
        return this.mutableMetadata;
    }

    public void onCreate() {
        super.onCreate();
        initialization();
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        super.attachBaseContext(LocaleManager.setLocale(context));
    }

    public final ClientManager requireClientManager() {
        return getMClientManager();
    }

    public final CommonServiceManager requireCommonServiceManager() {
        return getMCommonServiceManager();
    }

    public final OrderManager requireOrderManager() {
        return getMOrderManager();
    }

    public final RewardsManager requireRewardsManager() {
        return getMRewardsManager();
    }

    /* access modifiers changed from: private */
    public final void createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= 26) {
            try {
                Object systemService = getSystemService("notification");
                if (systemService != null) {
                    NotificationManager notificationManager = (NotificationManager) systemService;
                    if (notificationManager.getNotificationChannel(getString(R.string.default_notification_channel_id_general)) == null) {
                        NotificationChannel notificationChannel = new NotificationChannel(getString(R.string.default_notification_channel_id_general), getString(R.string.default_notification_channel_name_general), 4);
                        notificationChannel.setDescription(getString(R.string.default_notification_channel_description_general));
                        notificationChannel.setShowBadge(true);
                        notificationChannel.canShowBadge();
                        notificationChannel.setLockscreenVisibility(1);
                        notificationChannel.enableLights(true);
                        notificationChannel.setLightColor(ContextCompat.getColor(this, R.color.colorPrimary));
                        notificationChannel.enableVibration(true);
                        notificationChannel.setVibrationPattern(new long[]{100, 200, 300, 400, 500});
                        notificationManager.createNotificationChannel(notificationChannel);
                        NotificationChannel notificationChannel2 = new NotificationChannel(getString(R.string.default_notification_channel_id_in_app), getString(R.string.default_notification_channel_name_in_app), 4);
                        notificationChannel2.setDescription(getString(R.string.default_notification_channel_description_in_app));
                        notificationChannel2.setShowBadge(true);
                        notificationChannel2.canShowBadge();
                        notificationChannel2.setSound(null, null);
                        notificationChannel2.setLockscreenVisibility(1);
                        notificationChannel2.enableLights(true);
                        notificationChannel2.setLightColor(ContextCompat.getColor(this, R.color.colorPrimary));
                        notificationChannel2.enableVibration(true);
                        notificationChannel2.setVibrationPattern(new long[]{100, 200, 300, 400, 500});
                        notificationManager.createNotificationChannel(notificationChannel2);
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.NotificationManager");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private final void initialization() {
        BuildersKt.runBlocking(Dispatchers.getDefault(), new TCHApplication$initialization$1(this, null));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void getMetadata() {
        requireCommonServiceManager().getCommonApiService().getConfigService().getMetadata(new MetadataRequest(0, 1, null)).enqueue(new TCHApplication$getMetadata$1(this));
    }

    /* access modifiers changed from: private */
    /* access modifiers changed from: public */
    private final void pingDeviceConnected(String str) {
        try {
            FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
            Intrinsics.checkNotNullExpressionValue(instance, "FirebaseInstanceId.getInstance()");
            Intrinsics.checkNotNullExpressionValue(instance.getInstanceId().addOnCompleteListener(new TCHApplication$pingDeviceConnected$1(this, str)), "FirebaseInstanceId.getIn…          }\n            }");
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }

    /* access modifiers changed from: private */
    public final void checkUpdateIsAvailable() {
        Activity activity;
        GetMetadataResponse value = m0getMetadata().getValue();
        Boolean updateOptional = value != null ? value.getUpdateOptional() : null;
        GetMetadataResponse value2 = m0getMetadata().getValue();
        Boolean updateRequired = value2 != null ? value2.getUpdateRequired() : null;
        if (Intrinsics.areEqual((Object) updateOptional, (Object) true) && (activity = this.currentActivity) != null) {
            String string = getString(R.string.str_update);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_update)");
            String string2 = getString(R.string.str_update_optional_message);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_update_optional_message)");
            ContextExtsKt.showOneButtonAlertDialog(activity, string, string2, getString(R.string.str_update), true, new TCHApplication$checkUpdateIsAvailable$1(this));
        }
        if (Intrinsics.areEqual((Object) updateRequired, (Object) true) && this.currentActivity != null) {
            new AlertDialog.Builder(this.currentActivity).setTitle(getString(R.string.str_update)).setMessage(getString(R.string.str_update_required_message)).setCancelable(false).setPositiveButton(getString(R.string.str_update), (DialogInterface.OnClickListener) null).show().getButton(-1).setOnClickListener(new TCHApplication$checkUpdateIsAvailable$$inlined$let$lambda$1(this));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0016J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0018\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0016J\u0010\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/TCHApplication$MainActivityLifecycleCallbacks;", "Landroid/app/Application$ActivityLifecycleCallbacks;", "(Lcom/thecoffeehouse/guestapp/TCHApplication;)V", "onActivityCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onActivityDestroyed", "onActivityPaused", "onActivityResumed", "onActivitySaveInstanceState", "outState", "onActivityStarted", "onActivityStopped", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TCHApplication.kt */
    public final class MainActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(bundle, "outState");
        }

        /* JADX WARN: Incorrect args count in method signature: ()V */
        public MainActivityLifecycleCallbacks() {
        }

        public void onActivityPaused(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof MainActivity) {
                TCHApplication.this.lifecycleState = Lifecycle.Event.ON_PAUSE;
                GeneralKt.log(TCHApplication.this.getLifecycleState().name());
            }
        }

        public void onActivityStarted(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof MainActivity) {
                TCHApplication.this.lifecycleState = Lifecycle.Event.ON_START;
            }
        }

        public void onActivityDestroyed(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof MainActivity) {
                TCHApplication.this.lifecycleState = Lifecycle.Event.ON_DESTROY;
                TCHApplication tCHApplication = TCHApplication.this;
                tCHApplication.unregisterActivityLifecycleCallbacks(TCHApplication.access$getMMainActivityLifecycleCallback$p(tCHApplication));
                TrackingEventService.Companion.clearTrackingData();
            }
        }

        public void onActivityStopped(Activity activity) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof MainActivity) {
                TCHApplication.this.getMClientManager().saveUserConfigurationsToLocal();
                TCHApplication.this.lifecycleState = Lifecycle.Event.ON_STOP;
                GeneralKt.log(TCHApplication.this.getLifecycleState().name());
            }
            TCHApplication.this.currentActivity = null;
        }

        public void onActivityCreated(Activity activity, Bundle bundle) {
            GetMetadataResponse getMetadataResponse;
            Intrinsics.checkNotNullParameter(activity, "activity");
            if (activity instanceof MainActivity) {
                TCHApplication.this.lifecycleState = Lifecycle.Event.ON_CREATE;
                try {
                    EncryptionUtils encryptionUtils = EncryptionUtils.INSTANCE;
                    Context applicationContext = TCHApplication.this.getApplicationContext();
                    Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
                    String readLocalEncrypted = encryptionUtils.readLocalEncrypted(applicationContext, TCHApplication.this.META_DATA_FILE);
                    if (readLocalEncrypted.length() > 0) {
                        getMetadataResponse = (GetMetadataResponse) new Gson().fromJson(readLocalEncrypted, GetMetadataResponse.class);
                    } else {
                        getMetadataResponse = (GetMetadataResponse) new Gson().fromJson((Reader) new InputStreamReader(TCHApplication.this.getAssets().open("metadata.json")), GetMetadataResponse.class);
                    }
                    TCHApplication.this.mutableMetadata.setValue(getMetadataResponse);
                } catch (Exception e) {
                    e.printStackTrace();
                    TCHApplication.this.mutableMetadata.setValue((GetMetadataResponse) new Gson().fromJson((Reader) new InputStreamReader(TCHApplication.this.getAssets().open("metadata.json")), GetMetadataResponse.class));
                } catch (Throwable th) {
                    TCHApplication.this.getMetadata();
                    throw th;
                }
                TCHApplication.this.getMetadata();
            }
        }

        public void onActivityResumed(Activity activity) {
            String barcode;
            Intrinsics.checkNotNullParameter(activity, "activity");
            TCHApplication.this.currentActivity = activity;
            if (activity instanceof MainActivity) {
                TCHApplication.this.lifecycleState = Lifecycle.Event.ON_RESUME;
                Profile userProfile = TCHApplication.this.getMClientManager().getUserProfile();
                if (!(userProfile == null || (barcode = userProfile.getBarcode()) == null)) {
                    TCHApplication.this.pingDeviceConnected(barcode);
                }
                ((MainActivity) activity).getMOrderFragment().refreshLocation();
            }
        }
    }
}
