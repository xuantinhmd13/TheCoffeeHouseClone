package com.thecoffeehouse.guestapp.services.api.model.profile;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.MockResponse;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Header;
import retrofit2.http.POST;
import retrofit2.http.Tag;

public interface ProfileAPI {
    @POST("verify/merge-profile")
    LiveData<ApiResponse<GetMergeProfilesResponse>> getMergeProfiles(@Header("Authorization") String str, @Tag MockResponse<GetMergeProfilesResponse> mockResponse);

    @POST("user/me")
    Call<GetProfileResponse> getMyProfile(@Header("Authorization") String str, @Tag MockResponse<GetProfileResponse> mockResponse);

    @POST("auth/merge-request")
    LiveData<ApiResponse<AuthResponse>> mergeProfile(@Header("Authorization") String str, @Body MergeProfileRequest mergeProfileRequest, @Tag MockResponse<GetMergeProfilesResponse> mockResponse);

    @POST("user/update-profile")
    LiveData<ApiResponse<UpdateProfileResponse>> updateMyProfile(@Body UpdateProfileRequest updateProfileRequest);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.profile.ProfileAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Call getMyProfile$default(ProfileAPI profileAPI, String str, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return profileAPI.getMyProfile(str, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMyProfile");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.profile.ProfileAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData getMergeProfiles$default(ProfileAPI profileAPI, String str, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return profileAPI.getMergeProfiles(str, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMergeProfiles");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.profile.ProfileAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData mergeProfile$default(ProfileAPI profileAPI, String str, MergeProfileRequest mergeProfileRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 4) != 0) {
                    mockResponse = null;
                }
                return profileAPI.mergeProfile(str, mergeProfileRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: mergeProfile");
        }
    }
}
