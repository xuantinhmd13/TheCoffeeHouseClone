package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetMenuByLatLngResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetMenuByLatLngResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$calculateOrder$1 extends Lambda implements Function1<GetMenuByLatLngResponse, Unit> {
    final /* synthetic */ AddressSuggestion $addressSuggestion;
    final /* synthetic */ String $currentMethod;
    final /* synthetic */ Store $pickUpInfo;
    final /* synthetic */ TableInfo $tableInfo;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$calculateOrder$1(OrderFragment orderFragment, String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo) {
        super(1);
        this.this$0 = orderFragment;
        this.$currentMethod = str;
        this.$addressSuggestion = addressSuggestion;
        this.$pickUpInfo = store;
        this.$tableInfo = tableInfo;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetMenuByLatLngResponse getMenuByLatLngResponse) {
        invoke(getMenuByLatLngResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetMenuByLatLngResponse getMenuByLatLngResponse) {
        Intrinsics.checkNotNullParameter(getMenuByLatLngResponse, "it");
        String str = this.$currentMethod;
        if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
            if (this.$addressSuggestion != null) {
                ProductRecyclerViewAdapter.setDeliveryInfo$default(this.this$0.getMProductAdapter(), this.$addressSuggestion, false, 2, null);
                ((OrderViewModel) this.this$0.getViewModel()).changeShippingMethodToDelivery(this.$addressSuggestion);
            }
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
            if (this.$pickUpInfo != null) {
                ProductRecyclerViewAdapter.setPickUpInfo$default(this.this$0.getMProductAdapter(), this.$pickUpInfo, false, 2, null);
                ((OrderViewModel) this.this$0.getViewModel()).changeShippingMethodToPickUp(this.$pickUpInfo);
            }
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getTABLE()) && this.$tableInfo != null) {
            ProductRecyclerViewAdapter.setTableInfo$default(this.this$0.getMProductAdapter(), this.$tableInfo, false, 2, null);
            ((OrderViewModel) this.this$0.getViewModel()).changeShippingMethodToAtTable(this.$tableInfo);
        }
    }
}
