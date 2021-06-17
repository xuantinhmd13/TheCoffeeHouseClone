package com.thecoffeehouse.guestapp.screens.login;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.signup.SignUpAPI;
import com.thecoffeehouse.guestapp.services.api.model.signup.SignUpRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/LoginViewModel$callSignUpToServer$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginViewModel.kt */
public final class LoginViewModel$callSignUpToServer$1 extends NetworkBoundResource<AuthResponse, AuthResponse> {
    final /* synthetic */ String $birthday;
    final /* synthetic */ String $firstName;
    final /* synthetic */ int $gender;
    final /* synthetic */ String $lastName;
    final /* synthetic */ String $otp;
    final /* synthetic */ String $phoneNumber;
    final /* synthetic */ String $token;
    final /* synthetic */ LoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginViewModel$callSignUpToServer$1(LoginViewModel loginViewModel, String str, String str2, String str3, String str4, String str5, int i, String str6, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = loginViewModel;
        this.$token = str;
        this.$firstName = str2;
        this.$lastName = str3;
        this.$birthday = str4;
        this.$phoneNumber = str5;
        this.$gender = i;
        this.$otp = str6;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<AuthResponse>> createCall() {
        return SignUpAPI.DefaultImpls.signUp$default(this.this$0.getApplication().requireClientManager().getUserAPIService().getSignUpService(), "Bearer " + this.$token, new SignUpRequest(this.$firstName, this.$lastName, this.$birthday, new Phone("+84", this.$phoneNumber), null, Integer.valueOf(this.$gender), this.this$0.encryptedOTP(this.$otp)), null, 4, null);
    }
}
