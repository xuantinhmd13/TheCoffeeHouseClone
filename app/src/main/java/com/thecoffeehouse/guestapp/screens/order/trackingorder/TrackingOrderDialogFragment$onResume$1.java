package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderDialogFragment.kt */
final class TrackingOrderDialogFragment$onResume$1 extends Lambda implements Function1<GetOrderTrackingResponse, Unit> {
    final /* synthetic */ TrackingOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingOrderDialogFragment$onResume$1(TrackingOrderDialogFragment trackingOrderDialogFragment) {
        super(1);
        this.this$0 = trackingOrderDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetOrderTrackingResponse getOrderTrackingResponse) {
        invoke(getOrderTrackingResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetOrderTrackingResponse getOrderTrackingResponse) {
        Payment payment;
        Payment payment2;
        Intrinsics.checkNotNullParameter(getOrderTrackingResponse, "it");
        String str = null;
        if (this.this$0.payingIsNotCompleted(getOrderTrackingResponse.getButtonStatus())) {
            if (this.this$0.isPayingNow) {
                TrackingEventService.Companion.updateSourceTrackingEvent(OrderTrackingEvents.EventOrderPaymentFailed.name, "orderTracking");
                TrackingEventService.Companion companion = TrackingEventService.Companion;
                TrackingData[] trackingDataArr = new TrackingData[2];
                List<Payment> payments = TrackingOrderDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getPayments();
                if (!(payments == null || (payment2 = (Payment) CollectionsKt.firstOrNull((List) payments)) == null)) {
                    str = payment2.getMethod();
                }
                trackingDataArr[0] = new TrackingData("paymentMethod", str);
                trackingDataArr[1] = new TrackingData("cartValue", TrackingOrderDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getTotal());
                companion.collectParamWithEventName(OrderTrackingEvents.EventOrderPaymentFailed.name, trackingDataArr);
                TrackingEventService.Companion.triggerSendTrackingEvent(OrderTrackingEvents.EventOrderPaymentFailed.name);
            }
        } else if (this.this$0.retryPaymentSuccessfully(getOrderTrackingResponse)) {
            TrackingEventService.Companion.updateSourceTrackingEvent("Payment_Retried_Successfully", "orderTracking");
            TrackingEventService.Companion companion2 = TrackingEventService.Companion;
            TrackingData[] trackingDataArr2 = new TrackingData[1];
            List<Payment> payments2 = TrackingOrderDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getPayments();
            if (!(payments2 == null || (payment = (Payment) CollectionsKt.firstOrNull((List) payments2)) == null)) {
                str = payment.getMethod();
            }
            trackingDataArr2[0] = new TrackingData("paymentMethod", str);
            companion2.collectParamWithEventName("Payment_Retried_Successfully", trackingDataArr2);
            TrackingEventService.Companion.triggerSendTrackingEvent("Payment_Retried_Successfully");
        }
    }
}
