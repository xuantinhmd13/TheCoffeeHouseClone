package com.thecoffeehouse.guestapp.screens.stores;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandle;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModel;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ConvertVNCharacter;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0010\u0010\u001b\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dJ\u000e\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\bJ\u0006\u0010\u001f\u001a\u00020\u0019J\u0014\u0010 \u001a\u00020\u00192\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rX\u0004¢\u0006\u0002\n\u0000R&\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011¨\u0006\""}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/SearchStoreViewModel;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "_searchStores", "Landroidx/lifecycle/MutableLiveData;", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "_stores", "fullStores", "mRecentlySearchStores", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "searchStores", "Landroidx/lifecycle/LiveData;", "getSearchStores", "()Landroidx/lifecycle/LiveData;", "setSearchStores", "(Landroidx/lifecycle/LiveData;)V", "stores", "getStores", "hasRecentlySearch", "", "saveRecentlySearch", "", "selectedStore", "searchStore", "newText", "", "selectSearchedStore", "showRecentlySearch", "updateStores", "data", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchStoreViewModel.kt */
public final class SearchStoreViewModel extends BaseViewModel {
    private final MutableLiveData<ArrayList<Store>> _searchStores;
    private final MutableLiveData<ArrayList<Store>> _stores;
    private ArrayList<Store> fullStores = new ArrayList<>();
    private final LinkedHashSet<Store> mRecentlySearchStores = new LinkedHashSet<>();
    private LiveData<ArrayList<Store>> searchStores;
    private final LiveData<ArrayList<Store>> stores;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchStoreViewModel(SavedStateHandle savedStateHandle) {
        super(savedStateHandle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        MutableLiveData<ArrayList<Store>> mutableLiveData = new MutableLiveData<>();
        this._stores = mutableLiveData;
        this.stores = mutableLiveData;
        MutableLiveData<ArrayList<Store>> mutableLiveData2 = new MutableLiveData<>();
        this._searchStores = mutableLiveData2;
        this.searchStores = mutableLiveData2;
    }

    public final LiveData<ArrayList<Store>> getStores() {
        return this.stores;
    }

    public final LiveData<ArrayList<Store>> getSearchStores() {
        return this.searchStores;
    }

    public final void setSearchStores(LiveData<ArrayList<Store>> liveData) {
        Intrinsics.checkNotNullParameter(liveData, "<set-?>");
        this.searchStores = liveData;
    }

    public final void updateStores(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "data");
        this.fullStores = arrayList;
        this._stores.setValue(arrayList);
    }

    public final void searchStore(String str) {
        String str2 = str;
        boolean z = false;
        if (!(str2 == null || str2.length() == 0)) {
            if (str2 == null || StringsKt.isBlank(str2)) {
                z = true;
            }
            if (!z) {
                ArrayList<Store> arrayList = new ArrayList<>();
                for (T t : this.fullStores) {
                    ConvertVNCharacter convertVNCharacter = ConvertVNCharacter.INSTANCE;
                    String str3 = t.getFullAddress().toString();
                    Objects.requireNonNull(str3, "null cannot be cast to non-null type kotlin.CharSequence");
                    ConvertVNCharacter convertVNCharacter2 = ConvertVNCharacter.INSTANCE;
                    Objects.requireNonNull(str, "null cannot be cast to non-null type kotlin.CharSequence");
                    if (StringsKt.contains((CharSequence) convertVNCharacter.unaccent(StringsKt.trim((CharSequence) str3).toString()), (CharSequence) convertVNCharacter2.unaccent(StringsKt.trim((CharSequence) str2).toString()), true)) {
                        arrayList.add(t);
                    }
                }
                ArrayList<Store> arrayList2 = arrayList;
                this._searchStores.setValue(arrayList2);
                this._stores.setValue(arrayList2);
                return;
            }
        }
        this._searchStores.setValue(new ArrayList<>());
        this._stores.setValue(this.fullStores);
    }

    public final boolean hasRecentlySearch() {
        return !this.mRecentlySearchStores.isEmpty();
    }

    public final void showRecentlySearch() {
        StringBuilder append = new StringBuilder().append("before: ");
        ArrayList<Store> value = this._searchStores.getValue();
        Integer num = null;
        GeneralKt.log(append.append(value != null ? Integer.valueOf(value.size()) : null).toString());
        this._searchStores.setValue(new ArrayList<>(this.mRecentlySearchStores));
        StringBuilder append2 = new StringBuilder().append("after: ");
        ArrayList<Store> value2 = this._searchStores.getValue();
        if (value2 != null) {
            num = Integer.valueOf(value2.size());
        }
        GeneralKt.log(append2.append(num).toString());
    }

    public final void saveRecentlySearch(Store store) {
        Intrinsics.checkNotNullParameter(store, "selectedStore");
        this.mRecentlySearchStores.add(store);
    }

    public final void selectSearchedStore(Store store) {
        Intrinsics.checkNotNullParameter(store, "selectedStore");
        this._stores.setValue(CollectionsKt.arrayListOf(store));
    }
}
