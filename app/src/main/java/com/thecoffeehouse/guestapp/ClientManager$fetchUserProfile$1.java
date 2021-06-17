package com.thecoffeehouse.guestapp;

import androidx.core.app.NotificationCompat;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.services.api.model.profile.GetProfileResponse;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/thecoffeehouse/guestapp/ClientManager$fetchUserProfile$1", "Lretrofit2/Callback;", "Lcom/thecoffeehouse/guestapp/services/api/model/profile/GetProfileResponse;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ClientManager.kt */
public final class ClientManager$fetchUserProfile$1 implements Callback<GetProfileResponse> {
    final /* synthetic */ String $token;
    final /* synthetic */ ClientManager this$0;

    ClientManager$fetchUserProfile$1(ClientManager clientManager, String str) {
        this.this$0 = clientManager;
        this.$token = str;
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<GetProfileResponse> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(th, "t");
        GeneralKt.log(th.toString());
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<GetProfileResponse> call, Response<GetProfileResponse> response) {
        Profile profile;
        String barcode;
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        if (response.isSuccessful()) {
            this.this$0.setUserProfile(response, this.$token);
            this.this$0.registerFcmTokenToServer("Bearer " + this.$token);
            GetProfileResponse body = response.body();
            if (body != null && (profile = body.getProfile()) != null && (barcode = profile.getBarcode()) != null) {
                this.this$0.setUserIdentifyAnalytics(barcode);
                return;
            }
            return;
        }
        int code = response.code();
        if (code == 401) {
            this.this$0.refreshToken(this.$token);
        } else if (code == 403) {
            this.this$0.forceLogout();
        }
    }
}
