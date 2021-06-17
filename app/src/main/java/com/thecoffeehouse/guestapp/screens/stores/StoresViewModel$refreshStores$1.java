package com.thecoffeehouse.guestapp.screens.stores;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.repositories.NetworkBoundResource;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.ApiResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.services.api.model.stores.StoreAPI;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\t\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u0002H\u0014J\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\r0\fH\u0014R\"\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/stores/StoresViewModel$refreshStores$1", "Lcom/thecoffeehouse/guestapp/repositories/NetworkBoundResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "cachedResponseClass", "Ljava/lang/Class;", "getCachedResponseClass", "()Ljava/lang/Class;", "setCachedResponseClass", "(Ljava/lang/Class;)V", "convertRequestToResult", "newData", "createCall", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/services/api/model/ApiResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoresViewModel.kt */
public final class StoresViewModel$refreshStores$1 extends NetworkBoundResource<GetStoresResponse, GetStoresResponse> {
    private Class<GetStoresResponse> cachedResponseClass = GetStoresResponse.class;
    final /* synthetic */ StoresViewModel this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresViewModel$refreshStores$1(StoresViewModel storesViewModel, AppExecutors appExecutors) {
        super(appExecutors);
        this.this$0 = storesViewModel;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public Class<GetStoresResponse> getCachedResponseClass() {
        return this.cachedResponseClass;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public void setCachedResponseClass(Class<GetStoresResponse> cls) {
        this.cachedResponseClass = cls;
    }

    /* access modifiers changed from: protected */
    public GetStoresResponse convertRequestToResult(GetStoresResponse getStoresResponse) {
        boolean z;
        Intrinsics.checkNotNullParameter(getStoresResponse, "newData");
        ArrayList arrayList = new ArrayList(getStoresResponse.getStores());
        Iterator<T> it = this.this$0.getApplication().requireClientManager().getUserConfigurations().getFavouriteStoreIds().iterator();
        while (true) {
            Store store = null;
            if (it.hasNext()) {
                int intValue = it.next().intValue();
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Object next = it2.next();
                    Integer id = ((Store) next).getId();
                    if (id != null && id.intValue() == intValue) {
                        z = true;
                        continue;
                    } else {
                        z = false;
                        continue;
                    }
                    if (z) {
                        store = next;
                        break;
                    }
                }
                Store store2 = store;
                if (store2 != null) {
                    ((Store) arrayList.get(arrayList.indexOf(store2))).setFavourite(true);
                }
            } else {
                this.this$0._stores.setValue(Resource.Companion.success(new GetStoresResponse(null, arrayList, 1, null)));
                this.this$0.fullStores = arrayList;
                super.saveCallResult(getStoresResponse);
                return getStoresResponse;
            }
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.repositories.NetworkBoundResource
    public LiveData<ApiResponse<GetStoresResponse>> createCall() {
        return StoreAPI.DefaultImpls.getStores$default(this.this$0.getApplication().requireOrderManager().getStoreAPIService(), null, 1, null);
    }
}
