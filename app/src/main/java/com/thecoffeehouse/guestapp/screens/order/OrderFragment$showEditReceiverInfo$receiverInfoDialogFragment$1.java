package com.thecoffeehouse.guestapp.screens.order;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "updatedName", "", "updatedPhoneNumber", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showEditReceiverInfo$receiverInfoDialogFragment$1 extends Lambda implements Function2<String, String, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showEditReceiverInfo$receiverInfoDialogFragment$1(OrderFragment orderFragment) {
        super(2);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, String str2) {
        invoke(str, str2);
        return Unit.INSTANCE;
    }

    public final void invoke(String str, String str2) {
        Intrinsics.checkNotNullParameter(str, "updatedName");
        Intrinsics.checkNotNullParameter(str2, "updatedPhoneNumber");
        this.this$0.updateNotes();
        LiveData<Resource<CalculateOrderResponse>> updateReceiverInfo = ((OrderViewModel) this.this$0.getViewModel()).updateReceiverInfo(str, str2);
        OrderFragment orderFragment = this.this$0;
        updateReceiverInfo.observe(orderFragment, orderFragment.mObserverCalculateOrder);
    }
}
