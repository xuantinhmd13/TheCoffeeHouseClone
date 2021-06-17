package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "addressSuggest", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$initShippingInfoByLocation$2 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ Function0 $onCompleted;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$initShippingInfoByLocation$2(OrderFragment orderFragment, Function0 function0) {
        super(1);
        this.this$0 = orderFragment;
        this.$onCompleted = function0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggest");
        this.this$0.getMProductAdapter().setDeliveryInfo(addressSuggestion, false);
        this.this$0.getMProductAdapter().setSelectedShippingMethod(ShippingType.INSTANCE.getDELI());
        if (!(this.this$0.isUsingDefaultAddress(addressSuggestion))) {
            this.this$0.fillPickUpInfoDefault(new Function1<Store, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$initShippingInfoByLocation$2.AnonymousClass1 */
                final /* synthetic */ OrderFragment$initShippingInfoByLocation$2 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(Store store) {
                    invoke(store);
                    return Unit.INSTANCE;
                }

                public final void invoke(Store store) {
                    Intrinsics.checkNotNullParameter(store, "nearestStore");
                    this.this$0.this$0.getMProductAdapter().setPickUpInfo(store, false);
                    this.this$0.this$0.hideLoading();
                    this.this$0.$onCompleted.invoke();
                }
            });
        } else {
            this.$onCompleted.invoke();
        }
    }
}
