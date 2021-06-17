package com.thecoffeehouse.guestapp.screens.login;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI;
import com.thecoffeehouse.guestapp.services.api.model.login.SignUpWithGoogleRequest;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/LoginViewModel$callSignUpWithGoogleAPI$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginViewModel.kt */
public final class LoginViewModel$callSignUpWithGoogleAPI$1 extends NetworkBoundResource<AuthResponse, AuthResponse> {
    final /* synthetic */ SignUpWithGoogleRequest $signUpWithGoogleRequest;
    final /* synthetic */ LoginViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginViewModel$callSignUpWithGoogleAPI$1(LoginViewModel loginViewModel, SignUpWithGoogleRequest signUpWithGoogleRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = loginViewModel;
        this.$signUpWithGoogleRequest = signUpWithGoogleRequest;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<AuthResponse>> createCall() {
        return LoginAPI.DefaultImpls.signUpWithGoogle$default(this.this$0.getApplication().requireClientManager().getUserAPIService().getLoginService(), this.$signUpWithGoogleRequest, null, 2, null);
    }
}
