package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "dialog", "Lcom/thecoffeehouse/guestapp/screens/stores/StoreDetailBottomSheetFragment;", "pickUpStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2 extends Lambda implements Function2<StoreDetailBottomSheetFragment, Store, Unit> {
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2(StoresFragment storesFragment) {
        super(2);
        this.this$0 = storesFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment, Store store) {
        invoke(storeDetailBottomSheetFragment, store);
        return Unit.INSTANCE;
    }

    public final void invoke(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment, Store store) {
        Intrinsics.checkNotNullParameter(storeDetailBottomSheetFragment, "dialog");
        Intrinsics.checkNotNullParameter(store, "pickUpStore");
        Integer id = store.getId();
        if (id != null) {
            int intValue = id.intValue();
            ((StoresViewModel) this.this$0.getViewModel()).checkStoreHasPickUpMethod(intValue).observe(this.this$0, new BaseFragment.ObserverBaseResource(this.this$0, new StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2$$special$$inlined$let$lambda$1(intValue, this, storeDetailBottomSheetFragment), null, false, false, 14, null));
        }
    }
}
