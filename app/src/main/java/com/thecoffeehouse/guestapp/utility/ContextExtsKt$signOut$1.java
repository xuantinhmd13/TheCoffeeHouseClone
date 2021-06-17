package com.thecoffeehouse.guestapp.utility;

import androidx.core.app.NotificationCompat;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.services.api.model.authen.RefreshTokenResponse;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/thecoffeehouse/guestapp/utility/ContextExtsKt$signOut$1", "Lretrofit2/Callback;", "Lcom/thecoffeehouse/guestapp/services/api/model/authen/RefreshTokenResponse;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ContextExts.kt */
public final class ContextExtsKt$signOut$1 implements Callback<RefreshTokenResponse> {
    final /* synthetic */ Function0 $onCompleted;
    final /* synthetic */ TCHApplication $tchApplication;

    ContextExtsKt$signOut$1(TCHApplication tCHApplication, Function0 function0) {
        this.$tchApplication = tCHApplication;
        this.$onCompleted = function0;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<RefreshTokenResponse> call, Response<RefreshTokenResponse> response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        ContextExtsKt.deRegisterFcmToken(this.$tchApplication, this.$onCompleted);
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<RefreshTokenResponse> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(th, "t");
        ContextExtsKt.deRegisterFcmToken(this.$tchApplication, this.$onCompleted);
    }
}
