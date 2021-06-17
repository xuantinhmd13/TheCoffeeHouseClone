package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.PickStoreBottomSheetHolderFragment;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showPickUpStoreDialog$pickStoreDialogFragment$1 extends Lambda implements Function1<Store, Unit> {
    final /* synthetic */ PickStoreBottomSheetHolderFragment $blankBottomSheetFragment;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showPickUpStoreDialog$pickStoreDialogFragment$1(OrderFragment orderFragment, PickStoreBottomSheetHolderFragment pickStoreBottomSheetHolderFragment) {
        super(1);
        this.this$0 = orderFragment;
        this.$blankBottomSheetFragment = pickStoreBottomSheetHolderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Store store) {
        invoke(store);
        return Unit.INSTANCE;
    }

    public final void invoke(Store store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.this$0.dismissSelectShippingMethod();
        ProductRecyclerViewAdapter.setPickUpInfo$default(this.this$0.getMProductAdapter(), store, false, 2, null);
        OrderFragment orderFragment = this.this$0;
        orderFragment.onChangeShippingMethod(orderFragment.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
        OrderFragment orderFragment2 = this.this$0;
        orderFragment2.trackingShippingDetailChange(orderFragment2.getMProductAdapter().getSelectedMethod());
        this.$blankBottomSheetFragment.dismiss();
    }
}
