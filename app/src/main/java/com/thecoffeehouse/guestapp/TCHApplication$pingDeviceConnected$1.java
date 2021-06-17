package com.thecoffeehouse.guestapp;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.iid.InstanceIdResult;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.MetadataAPI;
import com.thecoffeehouse.guestapp.services.api.model.common.config.PingDeviceRequest;
import com.thecoffeehouse.guestapp.services.api.model.common.config.PingDeviceResponse;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0014\u0010\u0002\u001a\u0010\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u00040\u0003H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "task", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/firebase/iid/InstanceIdResult;", "kotlin.jvm.PlatformType", "onComplete"}, k = 3, mv = {1, 4, 0})
/* compiled from: TCHApplication.kt */
public final class TCHApplication$pingDeviceConnected$1<TResult> implements OnCompleteListener<InstanceIdResult> {
    final /* synthetic */ String $barcode;
    final /* synthetic */ TCHApplication this$0;

    TCHApplication$pingDeviceConnected$1(TCHApplication tCHApplication, String str) {
        this.this$0 = tCHApplication;
        this.$barcode = str;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task<InstanceIdResult> task) {
        String str;
        String pingDeviceConnected;
        Intrinsics.checkNotNullParameter(task, "task");
        try {
            if (task.isSuccessful()) {
                InstanceIdResult result = task.getResult();
                String str2 = null;
                String token = result != null ? result.getToken() : null;
                GetMetadataResponse value = this.this$0.m0getMetadata().getValue();
                if (value == null || (pingDeviceConnected = value.getPingDeviceConnected()) == null || !StringsKt.endsWith$default(pingDeviceConnected, "/", false, 2, (Object) null)) {
                    GetMetadataResponse value2 = this.this$0.m0getMetadata().getValue();
                    str = Intrinsics.stringPlus(value2 != null ? value2.getPingDeviceConnected() : null, "/");
                } else {
                    GetMetadataResponse value3 = this.this$0.m0getMetadata().getValue();
                    str = value3 != null ? value3.getPingDeviceConnected() : null;
                }
                if (this.$barcode != null && token != null) {
                    GetMetadataResponse value4 = this.this$0.m0getMetadata().getValue();
                    if ((value4 != null ? value4.getPingDeviceConnected() : null) != null) {
                        PingDeviceRequest pingDeviceRequest = new PingDeviceRequest();
                        pingDeviceRequest.setBarcode(this.$barcode);
                        pingDeviceRequest.setFirebaseToken(token);
                        MetadataAPI metadataAPI = (MetadataAPI) new Retrofit.Builder().baseUrl(str).addConverterFactory(GsonConverterFactory.create()).build().create(MetadataAPI.class);
                        GetMetadataResponse value5 = this.this$0.m0getMetadata().getValue();
                        if (value5 != null) {
                            str2 = value5.getPingDeviceConnected();
                        }
                        Intrinsics.checkNotNull(str2);
                        metadataAPI.pingDeviceConnected(str2, pingDeviceRequest).enqueue(new Callback<PingDeviceResponse>() {
                            /* class com.thecoffeehouse.guestapp.TCHApplication$pingDeviceConnected$1.AnonymousClass1 */

                            @Override // retrofit2.Callback
                            public void onResponse(Call<PingDeviceResponse> call, Response<PingDeviceResponse> response) {
                                Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
                                Intrinsics.checkNotNullParameter(response, "response");
                                GeneralKt.log("response: " + response);
                            }

                            @Override // retrofit2.Callback
                            public void onFailure(Call<PingDeviceResponse> call, Throwable th) {
                                Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
                                Intrinsics.checkNotNullParameter(th, "t");
                                GeneralKt.log(th.getMessage());
                            }
                        });
                    }
                }
            }
        } catch (Exception e) {
            FirebaseCrashlytics.getInstance().recordException(e);
        }
    }
}
