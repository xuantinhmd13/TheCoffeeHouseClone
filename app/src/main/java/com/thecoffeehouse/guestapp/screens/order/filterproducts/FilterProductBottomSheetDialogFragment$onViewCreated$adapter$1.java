package com.thecoffeehouse.guestapp.screens.order.filterproducts;

import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "menu", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: FilterProductBottomSheetDialogFragment.kt */
final class FilterProductBottomSheetDialogFragment$onViewCreated$adapter$1 extends Lambda implements Function1<Menu, Unit> {
    final /* synthetic */ FilterProductBottomSheetDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FilterProductBottomSheetDialogFragment$onViewCreated$adapter$1(FilterProductBottomSheetDialogFragment filterProductBottomSheetDialogFragment) {
        super(1);
        this.this$0 = filterProductBottomSheetDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Menu menu) {
        invoke(menu);
        return Unit.INSTANCE;
    }

    public final void invoke(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        this.this$0.onSelectCategoryListener.invoke(menu);
        this.this$0.sendTrackingEventSelectCategory(menu);
        this.this$0.dismiss();
    }
}
