package com.thecoffeehouse.guestapp.screens.home;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.media.GetMediaBoxResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.GetNotificationsResponse;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00070\u00062\u0006\u0010\r\u001a\u00020\u000e¨\u0006\u000f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/HomeViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getMediaBox", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/media/GetMediaBoxResponse;", "getNotifications", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/GetNotificationsResponse;", "readNotification", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "id", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HomeViewModel.kt */
public final class HomeViewModel extends BaseViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HomeViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final LiveData<Resource<GetNotificationsResponse>> getNotifications() {
        return new HomeViewModel$getNotifications$1(this, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<ServerErrorResponse>> readNotification(String str) {
        Intrinsics.checkNotNullParameter(str, "id");
        return new HomeViewModel$readNotification$1(this, str, getAppExecutors()).asLiveData();
    }

    public final LiveData<Resource<GetMediaBoxResponse>> getMediaBox() {
        return new HomeViewModel$getMediaBox$1(this, getAppExecutors()).asLiveData();
    }
}
