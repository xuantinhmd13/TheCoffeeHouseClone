package com.thecoffeehouse.guestapp.screens.main;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.SavedStateHandle;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.LinkHaravanResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.media.GetBannerResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Profile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u001a\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\n0\fJ\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00070\u00062\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/main/MainViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getBanner", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/media/GetBannerResponse;", "getDefaultLocation", "", "onCompleted", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "getUserInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/login/Profile;", "linkHaraworkAccount", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanResponse;", "codeHaravan", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainViewModel.kt */
public final class MainViewModel extends BaseViewModel {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MainViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
    }

    public final LiveData<Resource<GetBannerResponse>> getBanner() {
        return new MainViewModel$getBanner$1(this, getAppExecutors()).asLiveData();
    }

    public final Profile getUserInfo() {
        return getApplication().requireClientManager().getUserProfile();
    }

    public final void getDefaultLocation(Function1<? super AddressSuggestion, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onCompleted");
        getApplication().requireCommonServiceManager().getDefaultLocation(function1);
    }

    public final LiveData<Resource<LinkHaravanResponse>> linkHaraworkAccount(String str) {
        Intrinsics.checkNotNullParameter(str, "codeHaravan");
        return getApplication().requireCommonServiceManager().linkHaraworkAccount(str);
    }
}
