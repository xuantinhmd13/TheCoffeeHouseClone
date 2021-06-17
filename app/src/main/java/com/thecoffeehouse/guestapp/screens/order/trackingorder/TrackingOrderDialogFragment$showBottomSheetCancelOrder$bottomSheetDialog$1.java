package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.common.config.CancelReasonsItem;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "cancelReason", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: TrackingOrderDialogFragment.kt */
public final class TrackingOrderDialogFragment$showBottomSheetCancelOrder$bottomSheetDialog$1 extends Lambda implements Function1<CancelReasonsItem, Unit> {
    final /* synthetic */ TrackingOrderDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingOrderDialogFragment$showBottomSheetCancelOrder$bottomSheetDialog$1(TrackingOrderDialogFragment trackingOrderDialogFragment) {
        super(1);
        this.this$0 = trackingOrderDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CancelReasonsItem cancelReasonsItem) {
        invoke(cancelReasonsItem);
        return Unit.INSTANCE;
    }

    public final void invoke(CancelReasonsItem cancelReasonsItem) {
        Intrinsics.checkNotNullParameter(cancelReasonsItem, "cancelReason");
        LiveData<Resource<GetOrderTrackingResponse>> cancelOrder = this.this$0.getMOrderViewModel().cancelOrder(TrackingOrderDialogFragment.access$getMOrderTrackingResponse$p(this.this$0).getRef(), cancelReasonsItem.getId());
        TrackingOrderDialogFragment trackingOrderDialogFragment = this.this$0;
        cancelOrder.observe(trackingOrderDialogFragment, trackingOrderDialogFragment.mObserverRefreshOrderTracking);
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.reloadHomeFragment();
        }
    }
}
