package com.thecoffeehouse.guestapp.services.api.model.login;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.MockResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;

public interface LoginAPI {
    @POST("auth/exchange-v4")
    LiveData<ApiResponse<AuthResponse>> exchangeTokenV4(@Body ExchangeTokenRequest exchangeTokenRequest, @Tag MockResponse<AuthResponse> mockResponse);

    @POST("auth/request-otp")
    LiveData<ApiResponse<RequestOTPPhoneNumberResponse>> requestOTPPhoneNumber(@Body RequestOTPPhoneNumberRequest requestOTPPhoneNumberRequest, @Tag MockResponse<RequestOTPPhoneNumberResponse> mockResponse);

    @POST("auth/sign-in-social")
    LiveData<ApiResponse<AuthResponse>> signUpWithFacebook(@Body SignUpWithFacebookRequest signUpWithFacebookRequest, @Tag MockResponse<AuthResponse> mockResponse);

    @POST("auth/sign-in-social")
    LiveData<ApiResponse<AuthResponse>> signUpWithGoogle(@Body SignUpWithGoogleRequest signUpWithGoogleRequest, @Tag MockResponse<AuthResponse> mockResponse);

    @POST("auth/verify-otp")
    LiveData<ApiResponse<AuthResponse>> verifyOTPPhoneNumber(@Body VerifyPhoneNumberRequest verifyPhoneNumberRequest, @Tag MockResponse<AuthResponse> mockResponse);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData requestOTPPhoneNumber$default(LoginAPI loginAPI, RequestOTPPhoneNumberRequest requestOTPPhoneNumberRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return loginAPI.requestOTPPhoneNumber(requestOTPPhoneNumberRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestOTPPhoneNumber");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData verifyOTPPhoneNumber$default(LoginAPI loginAPI, VerifyPhoneNumberRequest verifyPhoneNumberRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return loginAPI.verifyOTPPhoneNumber(verifyPhoneNumberRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: verifyOTPPhoneNumber");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData signUpWithFacebook$default(LoginAPI loginAPI, SignUpWithFacebookRequest signUpWithFacebookRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return loginAPI.signUpWithFacebook(signUpWithFacebookRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUpWithFacebook");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData signUpWithGoogle$default(LoginAPI loginAPI, SignUpWithGoogleRequest signUpWithGoogleRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return loginAPI.signUpWithGoogle(signUpWithGoogleRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: signUpWithGoogle");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData exchangeTokenV4$default(LoginAPI loginAPI, ExchangeTokenRequest exchangeTokenRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return loginAPI.exchangeTokenV4(exchangeTokenRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: exchangeTokenV4");
        }
    }
}
