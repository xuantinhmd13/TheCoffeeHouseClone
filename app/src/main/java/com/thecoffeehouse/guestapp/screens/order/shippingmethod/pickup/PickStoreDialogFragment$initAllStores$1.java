package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import com.thecoffeehouse.guestapp.screens.stores.StoresViewModel;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresPickUpResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "storePickUpIds", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresPickUpResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
public final class PickStoreDialogFragment$initAllStores$1 extends Lambda implements Function1<GetStoresPickUpResponse, Unit> {
    final /* synthetic */ ArrayList $allStores;
    final /* synthetic */ PickStoreDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickStoreDialogFragment$initAllStores$1(PickStoreDialogFragment pickStoreDialogFragment, ArrayList arrayList) {
        super(1);
        this.this$0 = pickStoreDialogFragment;
        this.$allStores = arrayList;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetStoresPickUpResponse getStoresPickUpResponse) {
        invoke(getStoresPickUpResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetStoresPickUpResponse getStoresPickUpResponse) {
        Intrinsics.checkNotNullParameter(getStoresPickUpResponse, "storePickUpIds");
        List<Integer> storeIds = getStoresPickUpResponse.getStoreIds();
        GeneralKt.log(storeIds != null ? Integer.valueOf(storeIds.size()) : null);
        if (!this.$allStores.isEmpty()) {
            GeneralKt.log(Integer.valueOf(this.$allStores.size()));
            PickStoreDialogFragment pickStoreDialogFragment = this.this$0;
            ArrayList arrayList = new ArrayList();
            for (Object obj : this.$allStores) {
                List<Integer> storeIds2 = getStoresPickUpResponse.getStoreIds();
                Intrinsics.checkNotNull(storeIds2);
                if (CollectionsKt.contains(storeIds2, ((Store) obj).getId())) {
                    arrayList.add(obj);
                }
            }
            pickStoreDialogFragment.setMStores(arrayList);
            this.this$0.updateDistanceToStore(new Function0<Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.PickStoreDialogFragment$initAllStores$1.AnonymousClass2 */
                final /* synthetic */ PickStoreDialogFragment$initAllStores$1 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.sortStoresByDistance();
                    this.this$0.this$0.addItemRowViewStores();
                }
            });
            ((StoresViewModel) this.this$0.getViewModel()).updateStore(this.this$0.getMStores());
        }
    }
}
