package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import com.thecoffeehouse.guestapp.services.api.model.orders.DataRatingOrderInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.RatingOrderInfoResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "ratingOrderInfoResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/RatingOrderInfoResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailDialogFragment.kt */
final class RatingOrderDetailDialogFragment$onViewCreated$2 extends Lambda implements Function1<RatingOrderInfoResponse, Unit> {
    final /* synthetic */ RatingOrderDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RatingOrderDetailDialogFragment$onViewCreated$2(RatingOrderDetailDialogFragment ratingOrderDetailDialogFragment) {
        super(1);
        this.this$0 = ratingOrderDetailDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(RatingOrderInfoResponse ratingOrderInfoResponse) {
        invoke(ratingOrderInfoResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(RatingOrderInfoResponse ratingOrderInfoResponse) {
        RatingOrderDetailView ratingOrderDetailView;
        Intrinsics.checkNotNullParameter(ratingOrderInfoResponse, "ratingOrderInfoResponse");
        DataRatingOrderInfo dataRatingOrderInfo = ratingOrderInfoResponse.getDataRatingOrderInfo();
        if (dataRatingOrderInfo != null && (ratingOrderDetailView = this.this$0.mRatingOrderDetailView) != null) {
            ratingOrderDetailView.updateData(this.this$0.mDefaultRatingStar, dataRatingOrderInfo);
        }
    }
}
