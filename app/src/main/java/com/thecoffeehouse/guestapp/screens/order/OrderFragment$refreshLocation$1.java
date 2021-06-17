package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "isOutOfThreadHold", "", "invoke", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$refreshLocation$1 extends Lambda implements Function2<AddressSuggestion, Boolean, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$refreshLocation$1(OrderFragment orderFragment) {
        super(2);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion, Boolean bool) {
        invoke(addressSuggestion, bool);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion, Boolean bool) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "addressSuggestion");
        GeneralKt.log("isOutOfThreadHold: " + bool);
        if (Intrinsics.areEqual((Object) bool, (Object) true)) {
            this.this$0.initShippingInfoByLocation(new Function0<Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$refreshLocation$1.AnonymousClass1 */
                final /* synthetic */ OrderFragment$refreshLocation$1 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.swipeToRefreshData();
                }
            });
        }
    }
}
