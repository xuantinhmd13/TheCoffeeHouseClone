package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileRequest;
import com.thecoffeehouse.guestapp.services.api.model.profile.UpdateProfileResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0002H\u0014¨\u0006\t"}, d2 = {"com/thecoffeehouse/guestapp/ClientManager$updateUserProfile$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/UpdateProfileResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "saveCallResult", "", "item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ClientManager.kt */
public final class ClientManager$updateUserProfile$1 extends NetworkBoundResource<UpdateProfileResponse, UpdateProfileResponse> {
    final /* synthetic */ UpdateProfileRequest $updateProfileRequest;
    final /* synthetic */ ClientManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClientManager$updateUserProfile$1(ClientManager clientManager, UpdateProfileRequest updateProfileRequest, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = clientManager;
        this.$updateProfileRequest = updateProfileRequest;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public /* bridge */ /* synthetic */ Unit saveCallResult(UpdateProfileResponse updateProfileResponse) {
        saveCallResult(updateProfileResponse);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(UpdateProfileResponse updateProfileResponse) {
        Profile userProfile;
        Profile userProfile2;
        Profile userProfile3;
        Profile userProfile4;
        Intrinsics.checkNotNullParameter(updateProfileResponse, "item");
        String firstName = this.$updateProfileRequest.getFirstName();
        if (!(firstName == null || (userProfile4 = this.this$0.getUserProfile()) == null)) {
            userProfile4.setFirstName(firstName);
        }
        String lastName = this.$updateProfileRequest.getLastName();
        if (!(lastName == null || (userProfile3 = this.this$0.getUserProfile()) == null)) {
            userProfile3.setLastName(lastName);
        }
        String email = this.$updateProfileRequest.getEmail();
        if (!(email == null || (userProfile2 = this.this$0.getUserProfile()) == null)) {
            userProfile2.setEmail(email);
        }
        Integer gender = this.$updateProfileRequest.getGender();
        if (gender != null) {
            int intValue = gender.intValue();
            Profile userProfile5 = this.this$0.getUserProfile();
            if (userProfile5 != null) {
                userProfile5.setGender(Integer.valueOf(intValue));
            }
        }
        String image = updateProfileResponse.getImage();
        if (image != null && (userProfile = this.this$0.getUserProfile()) != null) {
            userProfile.setAvatar(image);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<UpdateProfileResponse>> createCall() {
        return this.this$0.application.requireClientManager().getUserAPIService().getProfileService().updateMyProfile(this.$updateProfileRequest);
    }
}
