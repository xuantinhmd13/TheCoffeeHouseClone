package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresPickUpResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.GetStoresResponse;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "allStoresResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/GetStoresResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$fillPickUpInfoDefault$2 extends Lambda implements Function1<GetStoresResponse, Unit> {
    final /* synthetic */ Function1 $onCompleted;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$fillPickUpInfoDefault$2(OrderFragment orderFragment, Function1 function1) {
        super(1);
        this.this$0 = orderFragment;
        this.$onCompleted = function1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetStoresResponse getStoresResponse) {
        invoke(getStoresResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(final GetStoresResponse getStoresResponse) {
        Intrinsics.checkNotNullParameter(getStoresResponse, "allStoresResponse");
        this.this$0.getMStoreViewModel().fetchPickUpStoreIds().observe(this.this$0, new BaseFragment.ObserverBaseResource(this.this$0, new Function1<GetStoresPickUpResponse, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$fillPickUpInfoDefault$2.AnonymousClass1 */
            final /* synthetic */ OrderFragment$fillPickUpInfoDefault$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(GetStoresPickUpResponse getStoresPickUpResponse) {
                invoke(getStoresPickUpResponse);
                return Unit.INSTANCE;
            }

            public final void invoke(GetStoresPickUpResponse getStoresPickUpResponse) {
                Intrinsics.checkNotNullParameter(getStoresPickUpResponse, "storePickUpIdsResponse");
                if (!getStoresResponse.getStores().isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (T t : getStoresResponse.getStores()) {
                        List<Integer> storeIds = getStoresPickUpResponse.getStoreIds();
                        Intrinsics.checkNotNull(storeIds);
                        if (CollectionsKt.contains(storeIds, t.getId())) {
                            arrayList.add(t);
                        }
                    }
                    final ArrayList arrayList2 = arrayList;
                    MainActivity mainActivity = this.this$0.this$0.getMainActivity();
                    if (mainActivity != null) {
                        mainActivity.getMyAddress(new Function1<AddressSuggestion, Unit>(this) {
                            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$fillPickUpInfoDefault$2.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
                                invoke(addressSuggestion);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(AddressSuggestion addressSuggestion) {
                                Intrinsics.checkNotNullParameter(addressSuggestion, "myLatLng");
                                this.this$0.this$0.this$0.getNearestStore(arrayList2, addressSuggestion.getLatLng(), this.this$0.this$0.$onCompleted);
                            }
                        });
                    }
                    this.this$0.this$0.showLoading();
                    return;
                }
                this.this$0.$onCompleted.invoke(CollectionsKt.first((List) getStoresResponse.getStores()));
                this.this$0.this$0.showLoading();
            }
        }, null, false, false, 14, null));
    }
}
