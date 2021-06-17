package com.thecoffeehouse.guestapp;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.LinkHaravanRequest;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.LinkHaravanResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.server.CommonAPIService;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0014\u001a\u00020\u00152\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00150\u0017J\u001a\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00192\u0006\u0010\u001c\u001a\u00020\u001dR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\t\u001a\u00020\n8FX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001b\u0010\u000f\u001a\u00020\u00108FX\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001e"}, d2 = {"Lcom/thecoffeehouse/guestapp/CommonServiceManager;", "", "()V", "appExecutors", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "getAppExecutors", "()Lcom/thecoffeehouse/guestapp/AppExecutors;", "appExecutors$delegate", "Lkotlin/properties/ReadOnlyProperty;", "commonApiService", "Lcom/thecoffeehouse/guestapp/services/api/server/CommonAPIService;", "getCommonApiService", "()Lcom/thecoffeehouse/guestapp/services/api/server/CommonAPIService;", "commonApiService$delegate", "Lkotlin/Lazy;", "defaultHCMAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "getDefaultHCMAddress", "()Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "defaultHCMAddress$delegate", "getDefaultLocation", "", "onCompleted", "Lkotlin/Function1;", "linkHaraworkAccount", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/LinkHaravanResponse;", "codeHaravan", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CommonServiceManager.kt */
public final class CommonServiceManager {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CommonServiceManager.class, "appExecutors", "getAppExecutors()Lcom/thecoffeehouse/guestapp/AppExecutors;", 0))};
    private final ReadOnlyProperty appExecutors$delegate = new CommonServiceManager$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private final Lazy commonApiService$delegate = LazyKt.lazy(CommonServiceManager$commonApiService$2.INSTANCE);
    private final Lazy defaultHCMAddress$delegate = LazyKt.lazy(CommonServiceManager$defaultHCMAddress$2.INSTANCE);

    private final AppExecutors getAppExecutors() {
        return (AppExecutors) this.appExecutors$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public final CommonAPIService getCommonApiService() {
        return (CommonAPIService) this.commonApiService$delegate.getValue();
    }

    public final AddressSuggestion getDefaultHCMAddress() {
        return (AddressSuggestion) this.defaultHCMAddress$delegate.getValue();
    }

    public final void getDefaultLocation(Function1<? super AddressSuggestion, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "onCompleted");
        function1.invoke(getDefaultHCMAddress());
    }

    public final LiveData<Resource<LinkHaravanResponse>> linkHaraworkAccount(String str) {
        Intrinsics.checkNotNullParameter(str, "codeHaravan");
        return new CommonServiceManager$linkHaraworkAccount$1(this, new LinkHaravanRequest(str), getAppExecutors()).asLiveData();
    }
}
