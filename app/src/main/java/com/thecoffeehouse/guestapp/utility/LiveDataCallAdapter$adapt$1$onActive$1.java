package com.thecoffeehouse.guestapp.utility;

import androidx.core.app.NotificationCompat;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J$\u0010\b\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016¨\u0006\u000b"}, d2 = {"com/thecoffeehouse/guestapp/utility/LiveDataCallAdapter$adapt$1$onActive$1", "Lretrofit2/Callback;", "onFailure", "", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "throwable", "", "onResponse", "response", "Lretrofit2/Response;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LiveDataCallAdapter.kt */
public final class LiveDataCallAdapter$adapt$1$onActive$1 implements Callback<R> {
    final /* synthetic */ LiveDataCallAdapter$adapt$1 this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LiveDataCallAdapter$adapt$1$onActive$1(LiveDataCallAdapter$adapt$1 liveDataCallAdapter$adapt$1) {
        this.this$0 = liveDataCallAdapter$adapt$1;
    }

    @Override // retrofit2.Callback
    public void onResponse(Call<R> call, Response<R> response) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(response, "response");
        this.this$0.postValue(ApiResponse.Companion.create(response));
    }

    @Override // retrofit2.Callback
    public void onFailure(Call<R> call, Throwable th) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        Intrinsics.checkNotNullParameter(th, "throwable");
        GeneralKt.log(th.getMessage());
        this.this$0.postValue(ApiResponse.Companion.create(th));
    }
}
