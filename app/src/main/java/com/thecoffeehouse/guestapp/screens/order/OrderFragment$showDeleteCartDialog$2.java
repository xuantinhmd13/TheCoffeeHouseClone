package com.thecoffeehouse.guestapp.screens.order;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.lifecycle.MutableLiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.order.checkout.CheckoutDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.CalculateOrderResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "which", "", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showDeleteCartDialog$2 implements DialogInterface.OnClickListener {
    final /* synthetic */ OrderFragment this$0;

    OrderFragment$showDeleteCartDialog$2(OrderFragment orderFragment) {
        this.this$0 = orderFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ArrayList arrayList;
        ArrayList<OrderLine> orderLines;
        Dialog dialog;
        CheckoutDialogFragment checkoutDialogFragment = this.this$0.mCheckoutDialogFragment;
        if (!(checkoutDialogFragment == null || (dialog = checkoutDialogFragment.getDialog()) == null)) {
            dialog.dismiss();
        }
        Order orderResponse = ((OrderViewModel) this.this$0.getViewModel()).getOrderResponse();
        if (orderResponse == null || (orderLines = orderResponse.getOrderLines()) == null) {
            arrayList = null;
        } else {
            ArrayList<OrderLine> arrayList2 = orderLines;
            ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
            Iterator<T> it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(it.next().getId());
            }
            arrayList = arrayList3;
        }
        MutableLiveData<Resource<CalculateOrderResponse>> deleteDraftCart = ((OrderViewModel) this.this$0.getViewModel()).deleteDraftCart();
        OrderFragment orderFragment = this.this$0;
        deleteDraftCart.observe(orderFragment, orderFragment.mObserverCalculateOrder);
        this.this$0.trackingDeleteCart(arrayList);
    }
}
