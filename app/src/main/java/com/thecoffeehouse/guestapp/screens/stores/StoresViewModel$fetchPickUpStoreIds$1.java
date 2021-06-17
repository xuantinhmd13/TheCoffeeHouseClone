package com.thecoffeehouse.guestapp.screens.stores;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresPickUpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u000b0\nH\u0014J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0002H\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000f"}, d2 = {"com/thecoffeehouse/guestapp/screens/stores/StoresViewModel$fetchPickUpStoreIds$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresPickUpResponse;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "saveCallResult", "", "item", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoresViewModel.kt */
public final class StoresViewModel$fetchPickUpStoreIds$1 extends NetworkBoundResource<GetStoresPickUpResponse, GetStoresPickUpResponse> {
    private Class<GetStoresPickUpResponse> cachedResponseClass = GetStoresPickUpResponse.class;
    final /* synthetic */ StoresViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresViewModel$fetchPickUpStoreIds$1(StoresViewModel storesViewModel, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = storesViewModel;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public /* bridge */ /* synthetic */ Unit saveCallResult(GetStoresPickUpResponse getStoresPickUpResponse) {
        saveCallResult(getStoresPickUpResponse);
        return Unit.INSTANCE;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public Class<GetStoresPickUpResponse> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public void setCachedResponseClass(Class<GetStoresPickUpResponse> cls) {
        this.cachedResponseClass = cls;
    }

    /* access modifiers changed from: protected */
    public void saveCallResult(GetStoresPickUpResponse getStoresPickUpResponse) {
        Intrinsics.checkNotNullParameter(getStoresPickUpResponse, "item");
        StoresViewModel storesViewModel = this.this$0;
        List<Integer> storeIds = getStoresPickUpResponse.getStoreIds();
        Objects.requireNonNull(storeIds, "null cannot be cast to non-null type kotlin.collections.ArrayList<kotlin.Int> /* = java.util.ArrayList<kotlin.Int> */");
        storesViewModel.mPickUpStoreIds = (ArrayList) storeIds;
        super.saveCallResult((Object) getStoresPickUpResponse);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<GetStoresPickUpResponse>> createCall() {
        return this.this$0.getApplication().requireOrderManager().getStoreAPIService().getStoresPickUp();
    }
}
