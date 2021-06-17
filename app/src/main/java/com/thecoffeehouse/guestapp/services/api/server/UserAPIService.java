package com.thecoffeehouse.guestapp.services.api.server;

import com.thecoffeehouse.guestapp.services.api.model.authen.AuthAPI;
import com.thecoffeehouse.guestapp.services.api.model.feedbackandrating.FeedbackAPI;
import com.thecoffeehouse.guestapp.services.api.model.login.LoginAPI;
import com.thecoffeehouse.guestapp.services.api.model.profile.ProfileAPI;
import com.thecoffeehouse.guestapp.services.api.model.signup.SignUpAPI;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004J\u0006\u0010\u0005\u001a\u00020\u0006J\u0006\u0010\u0007\u001a\u00020\bJ\u0006\u0010\t\u001a\u00020\nJ\u0006\u0010\u000b\u001a\u00020\f¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/services/api/server/UserAPIService;", "Lcom/thecoffeehouse/guestapp/services/api/server/APIService;", "()V", "getAuthenticationService", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthAPI;", "getFeedbackService", "Lcom/thecoffeehouse/guestapp/services/api/model/feedbackandrating/FeedbackAPI;", "getLoginService", "Lcom/thecoffeehouse/guestapp/services/api/model/login/LoginAPI;", "getProfileService", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/ProfileAPI;", "getSignUpService", "Lcom/thecoffeehouse/guestapp/services/api/model/signup/SignUpAPI;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: UserAPIService.kt */
public final class UserAPIService extends APIService {
    public final LoginAPI getLoginService() {
        return (LoginAPI) getRetrofit().createService(LoginAPI.class);
    }

    public final SignUpAPI getSignUpService() {
        return (SignUpAPI) getRetrofit().createService(SignUpAPI.class);
    }

    public final ProfileAPI getProfileService() {
        return (ProfileAPI) getRetrofit().createService(ProfileAPI.class);
    }

    public final AuthAPI getAuthenticationService() {
        return (AuthAPI) getRetrofit().createService(AuthAPI.class);
    }

    public final FeedbackAPI getFeedbackService() {
        return (FeedbackAPI) getRetrofit().createService(FeedbackAPI.class);
    }
}
