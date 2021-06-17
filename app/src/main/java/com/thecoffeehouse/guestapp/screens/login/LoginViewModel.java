package com.thecoffeehouse.guestapp.screens.login;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.FacebookResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.login.RequestOTPPhoneNumberResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.SignUpWithFacebookRequest;
import com.thecoffeehouse.guestapp.services.api.model.login.SignUpWithGoogleRequest;
import com.thecoffeehouse.guestapp.services.api.model.login.VerifyPhoneNumberRequest;
import com.thecoffeehouse.guestapp.services.api.model.profile.GetMergeProfilesResponse;
import com.thecoffeehouse.guestapp.services.api.model.profile.MergeProfile;
import com.thecoffeehouse.guestapp.utility.EncryptionUtils;
import java.security.MessageDigest;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fJ\"\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010J\"\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fJ\"\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\t0\b2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\fJ2\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\fJN\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\f2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0019\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001dJ\"\u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\u001f\u001a\u00020\f2\u0006\u0010 \u001a\u00020\fJ\"\u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020\fJ\u0014\u0010$\u001a\u0004\u0018\u00010\f2\b\u0010\u0013\u001a\u0004\u0018\u00010\fH\u0002J\u001a\u0010%\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b2\u0006\u0010&\u001a\u00020\fJ\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/LoginViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "mSignUpWithFacebookRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/login/SignUpWithFacebookRequest;", "callListProfileToMerge", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/GetMergeProfilesResponse;", "token", "", "callMergeProfileRequest", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "mergeProfile", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/MergeProfile;", "callOTPVerificationAPI", "phoneNumber", "otp", "callRequestOTPToServer", "Lcom/thecoffeehouse/guestapp/services/api/model/login/RequestOTPPhoneNumberResponse;", RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE, "callSignUpOTPToServer", "callSignUpToServer", "firstName", "lastName", "birthday", "gender", "", "callSignUpWithFacebookAPI", "accessToken", "fbRawResponse", "callSignUpWithGoogleAPI", "googleId", "googleToken", "encryptedOTP", "exchangeTokenV4", "v4Token", "saveProfileToLocal", "", "authResponse", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginViewModel.kt */
public final class LoginViewModel extends BaseViewModel {
    private SignUpWithFacebookRequest mSignUpWithFacebookRequest;

    public static final /* synthetic */ SignUpWithFacebookRequest access$getMSignUpWithFacebookRequest$p(LoginViewModel loginViewModel) {
        SignUpWithFacebookRequest signUpWithFacebookRequest = loginViewModel.mSignUpWithFacebookRequest;
        if (signUpWithFacebookRequest == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mSignUpWithFacebookRequest");
        }
        return signUpWithFacebookRequest;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final LiveData<Resource<RequestOTPPhoneNumberResponse>> callRequestOTPToServer(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        return new LoginViewModel$callRequestOTPToServer$1(this, str2, str, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<AuthResponse>> callSignUpWithFacebookAPI(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "accessToken");
        Intrinsics.checkNotNullParameter(str2, "fbRawResponse");
        this.mSignUpWithFacebookRequest = new SignUpWithFacebookRequest(((FacebookResponse) new Gson().fromJson(str2, FacebookResponse.class)).getId(), str);
        return new LoginViewModel$callSignUpWithFacebookAPI$1(this, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<AuthResponse>> callSignUpWithGoogleAPI(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "googleId");
        Intrinsics.checkNotNullParameter(str2, "googleToken");
        return new LoginViewModel$callSignUpWithGoogleAPI$1(this, new SignUpWithGoogleRequest(str, str2), getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<AuthResponse>> callOTPVerificationAPI(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(str2, "otp");
        return new LoginViewModel$callOTPVerificationAPI$1(this, str, str2, getAppExecutors()).asLiveData();
    }

    public static /* synthetic */ LiveData callSignUpToServer$default(LoginViewModel loginViewModel, String str, String str2, String str3, String str4, String str5, String str6, int i, int i2, Object obj) {
        return loginViewModel.callSignUpToServer(str, str2, (i2 & 4) != 0 ? null : str3, str4, str5, str6, i);
    }

    public final LiveData<Resource<AuthResponse>> callSignUpToServer(String str, String str2, String str3, String str4, String str5, String str6, int i) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        Intrinsics.checkNotNullParameter(str4, "firstName");
        Intrinsics.checkNotNullParameter(str5, "lastName");
        Intrinsics.checkNotNullParameter(str6, "birthday");
        return new LoginViewModel$callSignUpToServer$1(this, str, str4, str5, str6, str2, i, str3, getAppExecutors()).asLiveData();
    }

    public final void saveProfileToLocal(AuthResponse authResponse) {
        Intrinsics.checkNotNullParameter(authResponse, "authResponse");
        Profile profile = authResponse.getProfile();
        profile.setToken(authResponse.getToken());
        EncryptionUtils.INSTANCE.encryptUserToken(getApplication(), authResponse.getToken());
        getApplication().requireClientManager().saveUserDataToLocal(profile);
    }

    public final LiveData<Resource<GetMergeProfilesResponse>> callListProfileToMerge(String str) {
        Intrinsics.checkNotNullParameter(str, "token");
        return new LoginViewModel$callListProfileToMerge$1(this, str, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<AuthResponse>> callMergeProfileRequest(String str, MergeProfile mergeProfile) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(mergeProfile, "mergeProfile");
        return new LoginViewModel$callMergeProfileRequest$1(this, str, mergeProfile, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<AuthResponse>> callSignUpOTPToServer(String str, String str2, String str3, String str4) {
        Intrinsics.checkNotNullParameter(str, "token");
        Intrinsics.checkNotNullParameter(str2, "phoneNumber");
        Intrinsics.checkNotNullParameter(str3, RemoteConfigConstants.RequestFieldKey.COUNTRY_CODE);
        Intrinsics.checkNotNullParameter(str4, "otp");
        return new LoginViewModel$callSignUpOTPToServer$1(this, str, new VerifyPhoneNumberRequest(new Phone(str3, str2), encryptedOTP(str4)), getAppExecutors()).asLiveData();
    }

    /* access modifiers changed from: private */
    public final String encryptedOTP(String str) {
        if (str == null) {
            return null;
        }
        MessageDigest instance = MessageDigest.getInstance("MD5");
        byte[] bytes = str.getBytes(Charsets.UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
        byte[] digest = instance.digest(bytes);
        Intrinsics.checkNotNullExpressionValue(digest, "hashedOTPByteArray");
        String joinToString$default = ArraysKt.joinToString$default(digest, (CharSequence) "", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) LoginViewModel$encryptedOTP$hashedOTPString$1.INSTANCE, 30, (Object) null);
        char charAt = joinToString$default.charAt(0);
        Objects.requireNonNull(joinToString$default, "null cannot be cast to non-null type java.lang.String");
        String substring = joinToString$default.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.String).substring(startIndex)");
        Objects.requireNonNull(substring, "null cannot be cast to non-null type kotlin.CharSequence");
        return String.valueOf(charAt) + StringsKt.reversed((CharSequence) substring).toString();
    }

    public final LiveData<Resource<AuthResponse>> exchangeTokenV4(String str) {
        Intrinsics.checkNotNullParameter(str, "v4Token");
        return getApplication().requireClientManager().exchangeV4Token(str);
    }
}
