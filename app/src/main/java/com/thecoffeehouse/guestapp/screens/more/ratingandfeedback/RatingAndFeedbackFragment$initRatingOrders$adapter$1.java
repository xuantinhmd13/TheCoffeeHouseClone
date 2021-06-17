package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.RatingOrderDetailDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "orderSelected", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;", "position", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingAndFeedbackFragment.kt */
public final class RatingAndFeedbackFragment$initRatingOrders$adapter$1 extends Lambda implements Function2<OrderHistory, Integer, Unit> {
    final /* synthetic */ RatingAndFeedbackFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RatingAndFeedbackFragment$initRatingOrders$adapter$1(RatingAndFeedbackFragment ratingAndFeedbackFragment) {
        super(2);
        this.this$0 = ratingAndFeedbackFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(OrderHistory orderHistory, Integer num) {
        invoke(orderHistory, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(OrderHistory orderHistory, int i) {
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(orderHistory, "orderSelected");
        if (orderHistory.getRating() == null) {
            RatingOrderDetailDialogFragment newInstance = RatingOrderDetailDialogFragment.Companion.newInstance(orderHistory.getRef(), orderHistory.getOrderType(), 0, new RatingAndFeedbackFragment$initRatingOrders$adapter$1$ratingOrderDetailFragment$1(this));
            FragmentActivity activity = this.this$0.getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it");
                newInstance.show(supportFragmentManager, (String) null);
                return;
            }
            return;
        }
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            String string = this.this$0.getString(R.string.str_you_rate_this_order);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_you_rate_this_order)");
            ContextExtsKt.showOneButtonAlertDialog$default(mainActivity, "", string, this.this$0.getString(R.string.str_ok), false, null, 24, null);
        }
    }
}
