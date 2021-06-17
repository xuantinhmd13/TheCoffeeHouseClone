package com.thecoffeehouse.guestapp.screens.stores;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.Transformations;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresPickUpResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.services.api.model.stores.StorePickUpRequest;
import com.thecoffeehouse.guestapp.services.api.model.stores.StorePickUpResponse;
import com.thecoffeehouse.guestapp.utility.ConvertVNCharacter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\r0\u00162\u0006\u0010\u001e\u001a\u00020\u0011J\u0012\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\r0\u0016J\u0016\u0010!\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0013j\b\u0012\u0004\u0012\u00020\u0011`\u0014J\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00110#J\u0010\u0010$\u001a\u0004\u0018\u00010\n2\u0006\u0010%\u001a\u00020\u0011J\u0006\u0010&\u001a\u00020\u0007J\u000e\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0007J\u0014\u0010*\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0016H\u0002J\u000e\u0010+\u001a\u00020(2\u0006\u0010,\u001a\u00020\nJ\u000e\u0010-\u001a\u00020(2\u0006\u0010,\u001a\u00020\nJ\u0010\u0010.\u001a\u00020(2\b\u0010/\u001a\u0004\u0018\u000100J\u000e\u00101\u001a\u00020(2\u0006\u00102\u001a\u00020\nJ\u0006\u00103\u001a\u00020(J\u0006\u00104\u001a\u00020(J\u001e\u00105\u001a\u00020(2\u0016\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u000e¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00110\tj\b\u0012\u0004\u0012\u00020\u0011`\u000bX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\n0\u0013j\b\u0012\u0004\u0012\u00020\n`\u0014X\u0004¢\u0006\u0002\n\u0000RJ\u0010\u0017\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u00162\u001c\u0010\u0015\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b0\u0016@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u0016¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0019¨\u00066"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/StoresViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_refreshStores", "Landroidx/lifecycle/MutableLiveData;", "", "_searchStores", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "Lkotlin/collections/ArrayList;", "_stores", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "fullStores", "mPickUpStoreIds", "", "mRecentlySearchStores", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "<set-?>", "Landroidx/lifecycle/LiveData;", "searchStores", "getSearchStores", "()Landroidx/lifecycle/LiveData;", "stores", "getStores", "checkStoreHasPickUpMethod", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/StorePickUpResponse;", "id", "fetchPickUpStoreIds", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresPickUpResponse;", "getFavouriteStoreIds", "getRecentStoreIds", "", "getStoreById", "storeId", "hasRecentlySearch", "refreshStore", "", "fetchFromServer", "refreshStores", "saveFavouriteStoreToLocal", "store", "saveRecentlySearchStore", "searchStore", "newText", "", "selectSearchedStore", "selectedStore", "showRecentlySearch", "updateSearchedStores", "updateStore", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoresViewModel.kt */
public final class StoresViewModel extends BaseViewModel {
    private MutableLiveData<Boolean> _refreshStores = new MutableLiveData<>();
    private final MutableLiveData<ArrayList<Store>> _searchStores;
    private MutableLiveData<Resource<GetStoresResponse>> _stores;
    private ArrayList<Store> fullStores;
    private ArrayList<Integer> mPickUpStoreIds;
    private final HashSet<Store> mRecentlySearchStores;
    private LiveData<ArrayList<Store>> searchStores;
    private final LiveData<Resource<GetStoresResponse>> stores;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public StoresViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        MutableLiveData<ArrayList<Store>> mutableLiveData = new MutableLiveData<>();
        this._searchStores = mutableLiveData;
        this._stores = new MutableLiveData<>();
        this.fullStores = new ArrayList<>();
        this.mRecentlySearchStores = new HashSet<>();
        this.searchStores = mutableLiveData;
        LiveData<Resource<GetStoresResponse>> switchMap = Transformations.switchMap(this._refreshStores, new StoresViewModel$stores$1(this));
        Intrinsics.checkNotNullExpressionValue(switchMap, "Transformations.switchMa…p _stores\n        }\n    }");
        this.stores = switchMap;
        this.mPickUpStoreIds = new ArrayList<>();
    }

    public final LiveData<ArrayList<Store>> getSearchStores() {
        return this.searchStores;
    }

    public final LiveData<Resource<GetStoresResponse>> getStores() {
        return this.stores;
    }

    public final boolean hasRecentlySearch() {
        return !this.mRecentlySearchStores.isEmpty();
    }

    public final void refreshStore(boolean z) {
        if (!z) {
            this._stores.setValue(Resource.Companion.success(new GetStoresResponse(null, this.fullStores, 1, null)));
        }
        this._refreshStores.setValue(Boolean.valueOf(z));
    }

    public final LiveData<Resource<GetStoresPickUpResponse>> fetchPickUpStoreIds() {
        if (!(!this.mPickUpStoreIds.isEmpty())) {
            return new StoresViewModel$fetchPickUpStoreIds$1(this, getAppExecutors()).asLiveData();
        }
        MutableLiveData mutableLiveData = new MutableLiveData();
        mutableLiveData.setValue(new Resource(Status.SUCCESS, new GetStoresPickUpResponse(null, this.mPickUpStoreIds), null));
        return mutableLiveData;
    }

    public final void saveRecentlySearchStore(Store store) {
        Intrinsics.checkNotNullParameter(store, "store");
        if (store.getId() != null) {
            this.mRecentlySearchStores.add(store);
        }
    }

    public final void searchStore(String str) {
        String str2 = str;
        boolean z = false;
        if (!(str2 == null || str2.length() == 0)) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            }
            if (!z) {
                ArrayList arrayList = new ArrayList();
                for (T t : this.fullStores) {
                    ConvertVNCharacter convertVNCharacter = ConvertVNCharacter.INSTANCE;
                    String fullAddress = t.getFullAddress();
                    Objects.requireNonNull(fullAddress, "null cannot be cast to non-null type kotlin.CharSequence");
                    ConvertVNCharacter convertVNCharacter2 = ConvertVNCharacter.INSTANCE;
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (StringsKt.contains((CharSequence) convertVNCharacter.unaccent(StringsKt.trim((CharSequence) fullAddress).toString()), (CharSequence) convertVNCharacter2.unaccent(StringsKt.trim((CharSequence) str2).toString()), true)) {
                        arrayList.add(t);
                    }
                }
                this._searchStores.setValue(new ArrayList<>(CollectionsKt.sortedWith(arrayList, new StoresViewModel$searchStore$$inlined$sortedBy$1())));
                return;
            }
        }
        this._searchStores.setValue(new ArrayList<>());
    }

    public final void selectSearchedStore(Store store) {
        Intrinsics.checkNotNullParameter(store, "selectedStore");
        this._stores.setValue(Resource.Companion.success(new GetStoresResponse(null, CollectionsKt.arrayListOf(store), 1, null)));
        this._refreshStores.setValue(false);
    }

    public final void showRecentlySearch() {
        this._searchStores.setValue(new ArrayList<>(this.mRecentlySearchStores));
    }

    public final void updateSearchedStores() {
        ArrayList arrayList;
        ArrayList<Store> value = this._searchStores.getValue();
        if (value != null) {
            ArrayList arrayList2 = new ArrayList();
            for (T t : value) {
                if (t.getId() != null) {
                    arrayList2.add(t);
                }
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        Intrinsics.checkNotNull(arrayList);
        this._stores.setValue(Resource.Companion.success(new GetStoresResponse(null, new ArrayList(arrayList), 1, null)));
        this._refreshStores.setValue(false);
    }

    /* access modifiers changed from: private */
    public final LiveData<Resource<GetStoresResponse>> refreshStores() {
        return new StoresViewModel$refreshStores$1(this, getAppExecutors()).asLiveData();
    }

    public final void saveFavouriteStoreToLocal(Store store) {
        Intrinsics.checkNotNullParameter(store, "store");
        if (store.isFavourite()) {
            HashSet<Integer> favouriteStoreIds = getApplication().requireClientManager().getUserConfigurations().getFavouriteStoreIds();
            Integer id = store.getId();
            Intrinsics.checkNotNull(id);
            favouriteStoreIds.add(id);
            return;
        }
        HashSet<Integer> favouriteStoreIds2 = getApplication().requireClientManager().getUserConfigurations().getFavouriteStoreIds();
        Integer id2 = store.getId();
        Intrinsics.checkNotNull(id2);
        favouriteStoreIds2.remove(id2);
    }

    public final HashSet<Integer> getFavouriteStoreIds() {
        return getApplication().requireClientManager().getUserConfigurations().getFavouriteStoreIds();
    }

    public final LiveData<Resource<StorePickUpResponse>> checkStoreHasPickUpMethod(int i) {
        return new StoresViewModel$checkStoreHasPickUpMethod$1(this, new StorePickUpRequest(i), getAppExecutors()).asLiveData();
    }

    public final List<Integer> getRecentStoreIds() {
        return getApplication().requireOrderManager().getRecentStoreIds();
    }

    public final void updateStore(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "stores");
        this.fullStores = arrayList;
    }

    public final Store getStoreById(int i) {
        T t;
        boolean z;
        Iterator<T> it = this.fullStores.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Integer id = t.getId();
            if (id != null && id.intValue() == i) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        return t;
    }
}
