package com.thecoffeehouse.guestapp.utility;

import androidx.core.app.NotificationCompat;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.RegisterFcmTokenResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f¸\u0006\u0000"}, d2 = {"com/thecoffeehouse/guestapp/utility/ContextExtsKt$deRegisterFcmToken$1$1$1", "Lretrofit2/Callback;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/RegisterFcmTokenResponse;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ContextExts.kt */
public final class ContextExtsKt$deRegisterFcmToken$1$$special$$inlined$let$lambda$1 implements Callback<RegisterFcmTokenResponse> {
    final /* synthetic */ String $token$inlined;
    final /* synthetic */ ContextExtsKt$deRegisterFcmToken$1 this$0;

    ContextExtsKt$deRegisterFcmToken$1$$special$$inlined$let$lambda$1(ContextExtsKt$deRegisterFcmToken$1 contextExtsKt$deRegisterFcmToken$1, String str) {
        this.this$0 = contextExtsKt$deRegisterFcmToken$1;
        this.$token$inlined = str;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<RegisterFcmTokenResponse> call, Response<RegisterFcmTokenResponse> response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        GeneralKt.log("de-register successfully");
        this.this$0.$onCompleted.invoke();
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<RegisterFcmTokenResponse> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(th, "t");
        GeneralKt.log(th.getMessage());
        this.this$0.$onCompleted.invoke();
    }
}
