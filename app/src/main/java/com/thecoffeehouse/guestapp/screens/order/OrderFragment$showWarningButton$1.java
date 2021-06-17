package com.thecoffeehouse.guestapp.screens.order;

import android.content.DialogInterface;
import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.orders.CreateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Warning;
import com.thecoffeehouse.guestapp.services.api.model.orders.WarningButton;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showWarningButton$1 implements DialogInterface.OnClickListener {
    final /* synthetic */ Warning $warning;
    final /* synthetic */ OrderFragment this$0;

    OrderFragment$showWarningButton$1(OrderFragment orderFragment, Warning warning) {
        this.this$0 = orderFragment;
        this.$warning = warning;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        WarningButton warningButton = this.$warning.getButtons().get(i);
        if (warningButton.getId() != null) {
            LiveData<Resource<CreateOrderResponse>> updateWarningSelectedAndCreateOrder = ((OrderViewModel) this.this$0.getViewModel()).updateWarningSelectedAndCreateOrder(warningButton);
            OrderFragment orderFragment = this.this$0;
            updateWarningSelectedAndCreateOrder.observe(orderFragment, orderFragment.mObserveCreateOrder);
        }
    }
}
