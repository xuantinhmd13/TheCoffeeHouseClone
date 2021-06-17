package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.view.View;
import android.widget.CompoundButton;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.config.CancelReasonsItem;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CancelOrderDialogFragment.kt */
final class CancelOrderDialogFragment$initViews$3 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ CancelOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CancelOrderDialogFragment$initViews$3(CancelOrderDialogFragment cancelOrderDialogFragment) {
        super(1);
        this.this$0 = cancelOrderDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        List access$getCancelOrderReasons$p = CancelOrderDialogFragment.access$getCancelOrderReasons$p(this.this$0);
        CompoundButton checkedItem = ((CustomRadioGroup) this.this$0._$_findCachedViewById(R.id.rdg_cancel_reason)).getCheckedItem();
        Integer valueOf = checkedItem != null ? Integer.valueOf(checkedItem.getId()) : null;
        Intrinsics.checkNotNull(valueOf);
        CancelReasonsItem cancelReasonsItem = (CancelReasonsItem) access$getCancelOrderReasons$p.get(valueOf.intValue());
        CancelOrderDialogFragment.access$getCancelOrderListener$p(this.this$0).invoke(cancelReasonsItem);
        TrackingEventService.Companion.updateSourceTrackingEvent("Order_Canceled", "orderTracking");
        TrackingEventService.Companion.collectParamWithEventName("Order_Canceled", new TrackingData(OrderTrackingEvents.EventOrderCanceled.Param.cancelType, cancelReasonsItem.getId()));
        TrackingEventService.Companion.triggerSendTrackingEvent("Order_Canceled");
        TrackingEventService.Companion.updateSourceTrackingEvent("Order_Canceled", "orderTracking");
        TrackingEventService.Companion.collectParamWithEventName("Order_Canceled", new TrackingData("source", "orderTracking"));
        TrackingEventService.Companion.triggerSendTrackingEvent("Order_Canceled");
        this.this$0.dismiss();
    }
}
