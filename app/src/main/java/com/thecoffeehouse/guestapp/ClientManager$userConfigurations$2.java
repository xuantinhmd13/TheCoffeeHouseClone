package com.thecoffeehouse.guestapp;

import com.google.gson.Gson;
import com.google.gson.JsonSyntaxException;
import com.thecoffeehouse.guestapp.services.local.UserConfigs;
import com.thecoffeehouse.guestapp.utility.SharePrefs;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/services/local/UserConfigs;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ClientManager.kt */
public final class ClientManager$userConfigurations$2 extends Lambda implements Function0<UserConfigs> {
    final /* synthetic */ ClientManager this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ClientManager$userConfigurations$2(ClientManager clientManager) {
        super(0);
        this.this$0 = clientManager;
    }

    @Override // kotlin.jvm.functions.Function0
    public final UserConfigs invoke() {
        UserConfigs userConfigs;
        try {
            String string = SharePrefs.INSTANCE.getString(this.this$0.application, this.this$0.USER_LOCAL_CONFIG_FILE, this.this$0.USER_CONFIGS_KEY);
            if (string != null) {
                userConfigs = (UserConfigs) new Gson().fromJson(string, UserConfigs.class);
            } else {
                userConfigs = new UserConfigs();
            }
            Intrinsics.checkNotNullExpressionValue(userConfigs, "if (jsonUserConfigs != n…erConfigs()\n            }");
            return userConfigs;
        } catch (JsonSyntaxException e) {
            e.printStackTrace();
            return new UserConfigs();
        }
    }
}
