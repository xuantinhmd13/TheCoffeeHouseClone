package com.thecoffeehouse.guestapp.services.api.model.membership;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.MockResponse;
import retrofit2.http.Body;
import retrofit2.http.POST;
import retrofit2.http.Tag;

public interface MembershipAPI {
    @POST("membership/bean-history")
    LiveData<ApiResponse<GetBeanHistoryResponse>> getBeanHistory(@Body GetBeanHistoryRequest getBeanHistoryRequest, @Tag MockResponse<GetBeanHistoryRequest> mockResponse);

    @POST("membership/me")
    LiveData<ApiResponse<GetMembershipResponse>> getMembership(@Tag MockResponse<GetMembershipResponse> mockResponse);

    public static final class DefaultImpls {
        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.membership.MembershipAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData getMembership$default(MembershipAPI membershipAPI, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 1) != 0) {
                    mockResponse = null;
                }
                return membershipAPI.getMembership(mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getMembership");
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.services.api.model.membership.MembershipAPI */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ LiveData getBeanHistory$default(MembershipAPI membershipAPI, GetBeanHistoryRequest getBeanHistoryRequest, MockResponse mockResponse, int i, Object obj) {
            if (obj == null) {
                if ((i & 2) != 0) {
                    mockResponse = null;
                }
                return membershipAPI.getBeanHistory(getBeanHistoryRequest, mockResponse);
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getBeanHistory");
        }
    }
}
