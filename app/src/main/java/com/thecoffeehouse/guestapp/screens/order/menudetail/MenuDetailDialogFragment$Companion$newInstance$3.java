package com.thecoffeehouse.guestapp.screens.order.menudetail;

import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "<anonymous parameter 0>", "", "<anonymous parameter 1>", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "<anonymous parameter 2>", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MenuDetailDialogFragment.kt */
final class MenuDetailDialogFragment$Companion$newInstance$3 extends Lambda implements Function3<Integer, AddressOrder, Store, Unit> {
    public static final MenuDetailDialogFragment$Companion$newInstance$3 INSTANCE = new MenuDetailDialogFragment$Companion$newInstance$3();

    MenuDetailDialogFragment$Companion$newInstance$3() {
        super(3);
    }

    public final void invoke(int i, AddressOrder addressOrder, Store store) {
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(Integer num, AddressOrder addressOrder, Store store) {
        invoke(num.intValue(), addressOrder, store);
        return Unit.INSTANCE;
    }
}
