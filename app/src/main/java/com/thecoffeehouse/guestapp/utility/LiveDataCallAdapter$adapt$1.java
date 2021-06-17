package com.thecoffeehouse.guestapp.utility;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import retrofit2.Call;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001J\b\u0010\u0005\u001a\u00020\u0006H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"com/thecoffeehouse/guestapp/utility/LiveDataCallAdapter$adapt$1", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "started", "Ljava/util/concurrent/atomic/AtomicBoolean;", "onActive", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LiveDataCallAdapter.kt */
public final class LiveDataCallAdapter$adapt$1 extends LiveData<ApiResponse<R>> {
    final /* synthetic */ Call $call;
    private AtomicBoolean started = new AtomicBoolean(false);

    LiveDataCallAdapter$adapt$1(Call call) {
        this.$call = call;
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.LiveData
    public void onActive() {
        super.onActive();
        if (this.started.compareAndSet(false, true)) {
            this.$call.enqueue(new LiveDataCallAdapter$adapt$1$onActive$1(this));
        }
    }
}
