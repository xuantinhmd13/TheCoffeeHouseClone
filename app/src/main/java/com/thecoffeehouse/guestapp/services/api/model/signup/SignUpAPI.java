package com.thecoffeehouse.guestapp.services.api.model.signup;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.MockResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.VerifyPhoneNumberRequest;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Tag;

public interface SignUpAPI {
    @POST("auth/sign-up")
    LiveData<ApiResponse<AuthResponse>> signUp(@Header("Authorization") String str, @Body SignUpRequest signUpRequest, @Tag MockResponse<AuthResponse> mockResponse);

    @POST("verify/sign-up-otp")
    LiveData<ApiResponse<AuthResponse>> signUpOTP(@Header("Authorization") String str, @Body VerifyPhoneNumberRequest verifyPhoneNumberRequest, @Tag MockResponse<AuthResponse> mockResponse);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.signup.SignUpAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData signUp$default(SignUpAPI signUpAPI, String str, SignUpRequest signUpRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    mockResponse = null;
                }
                return signUpAPI.signUp(str, signUpRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUp");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.signup.SignUpAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData signUpOTP$default(SignUpAPI signUpAPI, String str, VerifyPhoneNumberRequest verifyPhoneNumberRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    mockResponse = null;
                }
                return signUpAPI.signUpOTP(str, verifyPhoneNumberRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUpOTP");
        }
    }
}
