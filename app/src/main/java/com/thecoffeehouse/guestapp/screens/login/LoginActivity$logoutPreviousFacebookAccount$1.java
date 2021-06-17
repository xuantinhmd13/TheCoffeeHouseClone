package com.thecoffeehouse.guestapp.screens.login;

import com.facebook.GraphRequest;
import com.facebook.GraphResponse;
import com.facebook.login.LoginManager;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/facebook/GraphResponse;", "kotlin.jvm.PlatformType", "onCompleted"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$logoutPreviousFacebookAccount$1 implements GraphRequest.Callback {
    public static final LoginActivity$logoutPreviousFacebookAccount$1 INSTANCE = new LoginActivity$logoutPreviousFacebookAccount$1();

    LoginActivity$logoutPreviousFacebookAccount$1() {
    }

    @Override // com.facebook.GraphRequest.Callback
    public final void onCompleted(GraphResponse graphResponse) {
        LoginManager.getInstance().logOut();
    }
}
