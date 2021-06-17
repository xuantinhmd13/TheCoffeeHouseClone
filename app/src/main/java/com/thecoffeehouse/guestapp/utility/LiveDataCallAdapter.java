package com.thecoffeehouse.guestapp.utility;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import java.lang.reflect.Type;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import retrofit2.Call;
import retrofit2.CallAdapter;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\u001a\u0012\u0004\u0012\u0002H\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00010\u00040\u00030\u0002B\r\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00040\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/utility/LiveDataCallAdapter;", "R", "Lretrofit2/CallAdapter;", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "responseType", "Ljava/lang/reflect/Type;", "(Ljava/lang/reflect/Type;)V", "adapt", NotificationCompat.CATEGORY_CALL, "Lretrofit2/Call;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LiveDataCallAdapter.kt */
public final class LiveDataCallAdapter<R> implements CallAdapter<R, LiveData<ApiResponse<R>>> {
    private final Type responseType;

    public LiveDataCallAdapter(Type type) {
        Intrinsics.checkNotNullParameter(type, "responseType");
        this.responseType = type;
    }

    @Override // retrofit2.CallAdapter
    public Type responseType() {
        return this.responseType;
    }

    @Override // retrofit2.CallAdapter
    public LiveData<ApiResponse<R>> adapt(Call<R> call) {
        Intrinsics.checkNotNullParameter(call, NotificationCompat.CATEGORY_CALL);
        return new LiveDataCallAdapter$adapt$1(call);
    }
}
