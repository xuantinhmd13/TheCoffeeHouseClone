package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "allStores", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
final class StoresFragment$observeViewModel$1 extends Lambda implements Function1<GetStoresResponse, Unit> {
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$observeViewModel$1(StoresFragment storesFragment) {
        super(1);
        this.this$0 = storesFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetStoresResponse getStoresResponse) {
        invoke(getStoresResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetStoresResponse getStoresResponse) {
        Intrinsics.checkNotNullParameter(getStoresResponse, "allStores");
        this.this$0.showLoading();
        if (this.this$0.isAdded()) {
            this.this$0.getMPlaceHolderView().removeAllViews();
            StoresFragment storesFragment = this.this$0;
            List<Store> stores = getStoresResponse.getStores();
            Objects.requireNonNull(stores, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.stores.Store> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.stores.Store> */");
            storesFragment.initAllStores((ArrayList) stores);
            this.this$0.mIsFetchFromServer = false;
            this.this$0.getOnInitViewDone().invoke();
        }
    }
}
