package com.thecoffeehouse.guestapp;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.LiveData;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.CancelReasonsItem;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.WebLinks;
import com.thecoffeehouse.guestapp.services.api.model.feedbackandrating.FeedbackRequest;
import com.thecoffeehouse.guestapp.services.api.model.feedbackandrating.FeedbackResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.ExchangeTokenRequest;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.profile.GetProfileResponse;
import com.thecoffeehouse.guestapp.services.api.model.profile.ProfileAPI;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileRequest;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileResponse;
import com.thecoffeehouse.guestapp.services.api.server.UserAPIService;
import com.thecoffeehouse.guestapp.services.local.UserConfigs;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.EncryptionUtils;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import java.io.File;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.Dispatchers;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\"\u001a\u00020#H\u0002J\u001a\u0010$\u001a\u00020#2\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020#0&J\u001a\u0010'\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020*0)0(2\u0006\u0010+\u001a\u00020\u0006J\u0010\u0010,\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0006H\u0002J\b\u0010.\u001a\u00020#H\u0002J\f\u0010/\u001a\b\u0012\u0004\u0012\u00020100J\b\u00102\u001a\u0004\u0018\u00010\u0006J\b\u00103\u001a\u00020#H\u0002J\u0010\u00104\u001a\u00020#2\u0006\u00105\u001a\u00020\u0006H\u0002J\u0006\u00106\u001a\u00020\u0010J\u0006\u00107\u001a\u00020\u0010J\u0010\u00108\u001a\u00020#2\u0006\u0010-\u001a\u00020\u0006H\u0002J\u0010\u00109\u001a\u00020#2\u0006\u0010:\u001a\u00020\u0006H\u0002J\u0006\u0010;\u001a\u00020#J\u000e\u0010<\u001a\u00020#2\u0006\u0010=\u001a\u00020\u001eJ\u001a\u0010>\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020?0)0(2\u0006\u0010@\u001a\u00020\u0006J\u000e\u0010A\u001a\u00020#2\u0006\u0010B\u001a\u00020\u0006J\u0010\u0010C\u001a\u00020#2\u0006\u0010D\u001a\u00020\u0006H\u0002J\u001e\u0010E\u001a\u00020#2\f\u0010F\u001a\b\u0012\u0004\u0012\u00020H0G2\u0006\u0010-\u001a\u00020\u0006H\u0002J\u001a\u0010I\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0)0(2\u0006\u0010K\u001a\u00020LR\u000e\u0010\u0005\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006XD¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u000f\u001a\u00020\u00108F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138FX\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198FX\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001e@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u0006M"}, d2 = {"Lcom/thecoffeehouse/guestapp/ClientManager;", "", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "(Lcom/thecoffeehouse/guestapp/TCHApplication;)V", "USER_CONFIGS_KEY", "", "USER_DATA_FILE", "USER_LOCAL_CONFIG_FILE", "appExecutors", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "getAppExecutors", "()Lcom/thecoffeehouse/guestapp/AppExecutors;", "appExecutors$delegate", "Lkotlin/properties/ReadOnlyProperty;", "isLoggedIn", "", "()Z", "userAPIService", "Lcom/thecoffeehouse/guestapp/services/api/server/UserAPIService;", "getUserAPIService", "()Lcom/thecoffeehouse/guestapp/services/api/server/UserAPIService;", "userAPIService$delegate", "Lkotlin/Lazy;", "userConfigurations", "Lcom/thecoffeehouse/guestapp/services/local/UserConfigs;", "getUserConfigurations", "()Lcom/thecoffeehouse/guestapp/services/local/UserConfigs;", "userConfigurations$delegate", "<set-?>", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "userProfile", "getUserProfile", "()Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "decryptTokenAndFetchUserProfile", "", "deleteUserDataFromLocal", "onDeleteDone", "Lkotlin/Function1;", "exchangeV4Token", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "v4Token", "fetchUserProfile", "token", "forceLogout", "getCancelReasons", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "getYourInterestUrl", "initUserData", "initUserProfileObj", "decryptedToken", "isFistTimeUsingOrderAtTable", "isShowPopupShortcutOrderAtTable", "refreshToken", "registerFcmTokenToServer", "userToken", "saveUserConfigurationsToLocal", "saveUserDataToLocal", "userInfo", "sendFeedback", "Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackResponse;", "feedback", "setNewToken", "newToken", "setUserIdentifyAnalytics", "barcode", "setUserProfile", "response", "Lretrofit2/Response;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/GetProfileResponse;", "updateUserProfile", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileResponse;", "updateProfileRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileRequest;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ClientManager.kt */
public final class ClientManager {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ClientManager.class, "appExecutors", "getAppExecutors()Lcom/thecoffeehouse/guestapp/AppExecutors;", 0))};
    private final String USER_CONFIGS_KEY = "user_configs";
    private final String USER_DATA_FILE = "user_data.txt";
    private final String USER_LOCAL_CONFIG_FILE = "user_config.txt";
    private final ReadOnlyProperty appExecutors$delegate = new ClientManager$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private final TCHApplication application;
    private final Lazy userAPIService$delegate = LazyKt.lazy(ClientManager$userAPIService$2.INSTANCE);
    private final Lazy userConfigurations$delegate;
    private Profile userProfile;

    private final AppExecutors getAppExecutors() {
        return (AppExecutors) this.appExecutors$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final UserAPIService getUserAPIService() {
        return (UserAPIService) this.userAPIService$delegate.getValue();
    }

    public final UserConfigs getUserConfigurations() {
        return (UserConfigs) this.userConfigurations$delegate.getValue();
    }

    public ClientManager(TCHApplication tCHApplication) {
        Intrinsics.checkNotNullParameter(tCHApplication, "application");
        this.application = tCHApplication;
        initUserData();
        this.userConfigurations$delegate = LazyKt.lazy(new ClientManager$userConfigurations$2(this));
    }

    public final Profile getUserProfile() {
        return this.userProfile;
    }

    public final boolean isLoggedIn() {
        String token;
        Profile profile = this.userProfile;
        if (!(profile == null || (token = profile.getToken()) == null)) {
            if (!(token.length() == 0)) {
                return true;
            }
        }
        return false;
    }

    public final void deleteUserDataFromLocal(Function1<? super Boolean, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onDeleteDone");
        File file = new File(this.application.getFilesDir(), this.USER_DATA_FILE);
        if (file.exists()) {
            this.userProfile = null;
            function1.invoke(Boolean.valueOf(file.delete()));
            return;
        }
        function1.invoke(true);
    }

    private final void initUserData() {
        BuildersKt.runBlocking(Dispatchers.getIO(), new ClientManager$initUserData$1(this, null));
    }

    /* access modifiers changed from: private */
    public final void decryptTokenAndFetchUserProfile() {
        String decryptUserToken = EncryptionUtils.INSTANCE.decryptUserToken(this.application);
        if (decryptUserToken.length() > 0) {
            fetchUserProfile(decryptUserToken);
        }
    }

    public final void saveUserDataToLocal(Profile profile) {
        Intrinsics.checkNotNullParameter(profile, "userInfo");
        BuildersKt.runBlocking(Dispatchers.getIO(), new ClientManager$saveUserDataToLocal$1(this, profile, null));
    }

    /* access modifiers changed from: private */
    public final void initUserProfileObj(String str) {
        if (this.userProfile == null) {
            this.userProfile = new Profile(null, null, null, null, null, null, null, null, 0, str, FrameMetricsAggregator.EVERY_DURATION, null);
        }
    }

    public final boolean isFistTimeUsingOrderAtTable() {
        if (!getUserConfigurations().getFirstTimeUsingOrderAtTable()) {
            return false;
        }
        getUserConfigurations().setFirstTimeUsingOrderAtTable(false);
        return true;
    }

    public final void saveUserConfigurationsToLocal() {
        GeneralKt.log("userConfigurations.showPopupShowPopupOrderAtTableCount: " + getUserConfigurations().getShowPopupShowPopupOrderAtTableCount());
        GeneralKt.log("userConfigurations.firstTimeUsingOrderAtTable: " + getUserConfigurations().getFirstTimeUsingOrderAtTable());
        SharePrefs.INSTANCE.putString(this.application, this.USER_LOCAL_CONFIG_FILE, this.USER_CONFIGS_KEY, new Gson().toJson(getUserConfigurations()));
    }

    public final void setNewToken(String str) {
        Intrinsics.checkNotNullParameter(str, "newToken");
        EncryptionUtils.INSTANCE.encryptUserToken(this.application, str);
        Profile profile = this.userProfile;
        if (profile != null) {
            profile.setToken(str);
        }
    }

    /* access modifiers changed from: private */
    public final void forceLogout() {
        Activity currentActivity = this.application.getCurrentActivity();
        if (currentActivity != null) {
            ContextExtsKt.logout(currentActivity, true);
        }
    }

    /* access modifiers changed from: private */
    public final void refreshToken(String str) {
        getUserAPIService().getAuthenticationService().refreshToken("Bearer " + str).enqueue(new ClientManager$refreshToken$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void setUserIdentifyAnalytics(String str) {
        TrackingEventService.Companion.setUserId(str);
        FirebaseCrashlytics.getInstance().setUserId(str);
    }

    /* access modifiers changed from: private */
    public final void registerFcmTokenToServer(String str) {
        FirebaseInstanceId instance = FirebaseInstanceId.getInstance();
        Intrinsics.checkNotNullExpressionValue(instance, "FirebaseInstanceId.getInstance()");
        instance.getInstanceId().addOnCompleteListener(new ClientManager$registerFcmTokenToServer$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void fetchUserProfile(String str) {
        ProfileAPI.DefaultImpls.getMyProfile$default(getUserAPIService().getProfileService(), "Bearer " + str, null, 2, null).enqueue(new ClientManager$fetchUserProfile$1(this, str));
    }

    /* access modifiers changed from: private */
    public final void setUserProfile(Response<GetProfileResponse> response, String str) {
        GetProfileResponse body = response.body();
        Profile profile = body != null ? body.getProfile() : null;
        if (profile != null) {
            saveUserDataToLocal(profile);
            this.userProfile = profile;
            Intrinsics.checkNotNull(profile);
            profile.setToken(str);
            EncryptionUtils.INSTANCE.encryptUserToken(this.application, str);
        }
    }

    public final LiveData<Resource<UpdateProfileResponse>> updateUserProfile(UpdateProfileRequest updateProfileRequest) {
        Intrinsics.checkNotNullParameter(updateProfileRequest, "updateProfileRequest");
        return new ClientManager$updateUserProfile$1(this, updateProfileRequest, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<FeedbackResponse>> sendFeedback(String str) {
        Intrinsics.checkNotNullParameter(str, "feedback");
        return new ClientManager$sendFeedback$1(this, new FeedbackRequest(null, str), getAppExecutors()).asLiveData();
    }

    public final List<CancelReasonsItem> getCancelReasons() {
        GetMetadataResponse value = this.application.m0getMetadata().getValue();
        List<CancelReasonsItem> cancelReasons = value != null ? value.getCancelReasons() : null;
        return cancelReasons != null ? cancelReasons : CollectionsKt.emptyList();
    }

    public final String getYourInterestUrl() {
        WebLinks webLinks;
        GetMetadataResponse value = this.application.m0getMetadata().getValue();
        if (value == null || (webLinks = value.getWebLinks()) == null) {
            return null;
        }
        return webLinks.getReward();
    }

    public final LiveData<Resource<AuthResponse>> exchangeV4Token(String str) {
        Intrinsics.checkNotNullParameter(str, "v4Token");
        return new ClientManager$exchangeV4Token$1(this, new ExchangeTokenRequest(str), getAppExecutors()).asLiveData();
    }

    public final boolean isShowPopupShortcutOrderAtTable() {
        UserConfigs userConfigurations = getUserConfigurations();
        userConfigurations.setShowPopupShowPopupOrderAtTableCount(userConfigurations.getShowPopupShowPopupOrderAtTableCount() + 1);
        if (getUserConfigurations().getShowPopupShowPopupOrderAtTableCount() < 2) {
            return true;
        }
        return false;
    }
}
