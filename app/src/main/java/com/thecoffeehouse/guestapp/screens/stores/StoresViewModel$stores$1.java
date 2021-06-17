package com.thecoffeehouse.guestapp.screens.stores;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresResponse;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a>\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002 \u0004*\u001e\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0003 \u0004*\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u00012\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "Landroidx/lifecycle/LiveData;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "kotlin.jvm.PlatformType", "it", "", "apply", "(Ljava/lang/Boolean;)Landroidx/lifecycle/LiveData;"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresViewModel.kt */
final class StoresViewModel$stores$1<I, O> implements Function<Boolean, LiveData<Resource<? extends GetStoresResponse>>> {
    final /* synthetic */ StoresViewModel this$0;

    StoresViewModel$stores$1(StoresViewModel storesViewModel) {
        this.this$0 = storesViewModel;
    }

    public final LiveData<Resource<GetStoresResponse>> apply(Boolean bool) {
        if (Intrinsics.areEqual((Object) ((Boolean) this.this$0._refreshStores.getValue()), (Object) true)) {
            return this.this$0.refreshStores();
        }
        return this.this$0._stores;
    }
}
