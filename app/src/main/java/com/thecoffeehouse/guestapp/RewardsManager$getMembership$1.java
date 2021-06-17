package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetMembershipResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.MembershipAPI;
import com.thecoffeehouse.guestapp.services.api.model.membership.Profile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\nH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"com/thecoffeehouse/guestapp/RewardsManager$getMembership$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetMembershipResponse;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "saveCallResult", "", "item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsManager.kt */
public final class RewardsManager$getMembership$1 extends NetworkBoundResource<GetMembershipResponse, GetMembershipResponse> {
    private Class<GetMembershipResponse> cachedResponseClass = GetMembershipResponse.class;
    final /* synthetic */ RewardsManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardsManager$getMembership$1(RewardsManager rewardsManager, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = rewardsManager;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public /* bridge */ /* synthetic */ Unit saveCallResult(GetMembershipResponse getMembershipResponse) {
        saveCallResult(getMembershipResponse);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public Class<GetMembershipResponse> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public void setCachedResponseClass(Class<GetMembershipResponse> cls) {
        this.cachedResponseClass = cls;
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(GetMembershipResponse getMembershipResponse) {
        String fullName;
        Profile profile;
        Intrinsics.checkNotNullParameter(getMembershipResponse, "item");
        com.thecoffeehouse.guestapp.services.api.model.login.Profile userProfile = this.this$0.application.requireClientManager().getUserProfile();
        if (!(userProfile == null || (fullName = userProfile.getFullName()) == null || (profile = getMembershipResponse.getProfile()) == null)) {
            profile.setUserName(fullName);
        }
        super.saveCallResult((Object) getMembershipResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<GetMembershipResponse>> createCall() {
        return MembershipAPI.DefaultImpls.getMembership$default(this.this$0.getMembershipAPIService(), null, 1, null);
    }
}
