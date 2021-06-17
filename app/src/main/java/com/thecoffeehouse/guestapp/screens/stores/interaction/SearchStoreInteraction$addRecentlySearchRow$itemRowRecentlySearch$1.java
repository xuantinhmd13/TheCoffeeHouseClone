package com.thecoffeehouse.guestapp.screens.stores.interaction;

import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectedStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SearchStoreInteraction.kt */
public final class SearchStoreInteraction$addRecentlySearchRow$itemRowRecentlySearch$1 extends Lambda implements Function1<Store, Unit> {
    final /* synthetic */ SearchStoreInteraction this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SearchStoreInteraction$addRecentlySearchRow$itemRowRecentlySearch$1(SearchStoreInteraction searchStoreInteraction) {
        super(1);
        this.this$0 = searchStoreInteraction;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Store store) {
        invoke(store);
        return Unit.INSTANCE;
    }

    public final void invoke(Store store) {
        Intrinsics.checkNotNullParameter(store, "selectedStore");
        this.this$0.onClickSelectedStore.invoke(store);
    }
}
