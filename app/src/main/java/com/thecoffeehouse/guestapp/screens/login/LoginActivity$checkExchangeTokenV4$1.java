package com.thecoffeehouse.guestapp.screens.login;

import androidx.lifecycle.Observer;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.login.LoginActivity;
import com.thecoffeehouse.guestapp.services.api.model.authen.AuthResponse;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u001a\u0010\u0002\u001a\u0016\u0012\u0004\u0012\u00020\u0004 \u0005*\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "resources", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/AuthResponse;", "kotlin.jvm.PlatformType", "onChanged"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$checkExchangeTokenV4$1<T> implements Observer<Resource<? extends AuthResponse>> {
    final /* synthetic */ LoginActivity this$0;

    LoginActivity$checkExchangeTokenV4$1(LoginActivity loginActivity) {
        this.this$0 = loginActivity;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // androidx.lifecycle.Observer
    public /* bridge */ /* synthetic */ void onChanged(Resource<? extends AuthResponse> resource) {
        onChanged((Resource<AuthResponse>) resource);
    }

    public final void onChanged(Resource<AuthResponse> resource) {
        int i = LoginActivity.WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()];
        if (i == 2) {
            SharePrefs sharePrefs = SharePrefs.INSTANCE;
            LoginActivity loginActivity = this.this$0;
            sharePrefs.putString(loginActivity, loginActivity.EXCHANGE_TOKEN_PREFS, this.this$0.EXCHANGE_TOKEN_KEY, (String) null);
            AuthResponse data = resource.getData();
            if (data != null) {
                this.this$0.checkProfileStatus(data);
            }
        } else if (i == 3) {
            SharePrefs sharePrefs2 = SharePrefs.INSTANCE;
            LoginActivity loginActivity2 = this.this$0;
            sharePrefs2.putString(loginActivity2, loginActivity2.EXCHANGE_TOKEN_PREFS, this.this$0.EXCHANGE_TOKEN_KEY, (String) null);
        }
    }
}
