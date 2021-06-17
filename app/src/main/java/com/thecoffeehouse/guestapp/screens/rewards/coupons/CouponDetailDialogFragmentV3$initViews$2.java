package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponDetailDialogFragmentV3.kt */
final class CouponDetailDialogFragmentV3$initViews$2 extends Lambda implements Function1<ServerErrorResponse, Unit> {
    final /* synthetic */ CouponDetailDialogFragmentV3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponDetailDialogFragmentV3$initViews$2(CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        super(1);
        this.this$0 = couponDetailDialogFragmentV3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServerErrorResponse serverErrorResponse) {
        invoke(serverErrorResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(ServerErrorResponse serverErrorResponse) {
        Intrinsics.checkNotNullParameter(serverErrorResponse, "it");
        this.this$0.dismiss();
    }
}
