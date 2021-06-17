package com.thecoffeehouse.guestapp.screens.home;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.ReadNotificationRequest;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00050\u0004H\u0014¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/home/HomeViewModel$readNotification$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel$readNotification$1 extends NetworkBoundResource<ServerErrorResponse, ServerErrorResponse> {
    final /* synthetic */ String $id;
    final /* synthetic */ HomeViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeViewModel$readNotification$1(HomeViewModel homeViewModel, String str, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = homeViewModel;
        this.$id = str;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<ServerErrorResponse>> createCall() {
        return this.this$0.getApplication().requireCommonServiceManager().getCommonApiService().getNotificationService().readNotification(new ReadNotificationRequest(this.$id));
    }
}
