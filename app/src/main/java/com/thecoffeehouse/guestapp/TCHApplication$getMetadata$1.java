package com.thecoffeehouse.guestapp;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.google.gson.Gson;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import com.thecoffeehouse.guestapp.utility.EncryptionUtils;
import java.nio.charset.Charset;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001e\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J$\u0010\t\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016¨\u0006\f"}, d2 = {"com/thecoffeehouse/guestapp/TCHApplication$getMetadata$1", "Lretrofit2/Callback;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/GetMetadataResponse;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "t", "", "onResponse", "response", "Lretrofit2/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TCHApplication.kt */
public final class TCHApplication$getMetadata$1 implements Callback<GetMetadataResponse> {
    final /* synthetic */ TCHApplication this$0;

    @Override // retrofit2.Callback
    public void onFailure(Call<GetMetadataResponse> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(th, "t");
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    TCHApplication$getMetadata$1(TCHApplication tCHApplication) {
        this.this$0 = tCHApplication;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<GetMetadataResponse> call, Response<GetMetadataResponse> response) {
        String barcode;
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        GetMetadataResponse body = response.body();
        if (body != null) {
            this.this$0.mutableMetadata.setValue(body);
            EncryptionUtils encryptionUtils = EncryptionUtils.INSTANCE;
            Context applicationContext = this.this$0.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            String str = this.this$0.META_DATA_FILE;
            String json = new Gson().toJson(this.this$0.mutableMetadata.getValue());
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(mutableMetadata.value)");
            Charset charset = Charsets.UTF_8;
            Objects.requireNonNull(json, "null cannot be cast to non-null type java.lang.String");
            byte[] bytes = json.getBytes(charset);
            Intrinsics.checkNotNullExpressionValue(bytes, "(this as java.lang.String).getBytes(charset)");
            encryptionUtils.writeLocalEncrypted(applicationContext, str, bytes);
            this.this$0.checkUpdateIsAvailable();
            Profile userProfile = this.this$0.getMClientManager().getUserProfile();
            if (userProfile != null && (barcode = userProfile.getBarcode()) != null) {
                this.this$0.pingDeviceConnected(barcode);
            }
        }
    }
}
