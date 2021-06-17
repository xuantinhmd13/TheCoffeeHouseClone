package com.thecoffeehouse.guestapp.screens.login;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.login.phonenumber.MergeProfilesDialog;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.services.api.model.profile.GetMergeProfilesResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "resourceMergeProfile", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/GetMergeProfilesResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$checkProfileStatus$1<T> implements Observer<Resource<? extends GetMergeProfilesResponse>> {
    final /* synthetic */ AuthResponse $resource;
    final /* synthetic */ LoginActivity this$0;

    LoginActivity$checkProfileStatus$1(LoginActivity loginActivity, AuthResponse authResponse) {
        this.this$0 = loginActivity;
        this.$resource = authResponse;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Resource<? extends GetMergeProfilesResponse> resource) {
        onChanged((Resource<GetMergeProfilesResponse>) resource);
    }

    public final void onChanged(Resource<GetMergeProfilesResponse> resource) {
        if (resource.getData() != null) {
            MergeProfilesDialog mergeProfilesDialog = new MergeProfilesDialog(this.this$0.mPhoneNumber, resource.getData().getMergeProfiles(), new LoginActivity$checkProfileStatus$1$$special$$inlined$let$lambda$1(this, resource));
            FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
            mergeProfilesDialog.show(supportFragmentManager, (String) null);
        }
    }
}
