package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Coupon;", "invoke", "com/thecoffeehouse/guestapp/screens/rewards/coupons/CouponDetailDialogFragmentV3$initCoupon$1$couponCodeAdapter$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponDetailDialogFragmentV3.kt */
public final class CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$2 extends Lambda implements Function1<Coupon, Unit> {
    final /* synthetic */ CouponDetailDialogFragmentV3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$2(CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        super(1);
        this.this$0 = couponDetailDialogFragmentV3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Coupon coupon) {
        invoke(coupon);
        return Unit.INSTANCE;
    }

    public final void invoke(Coupon coupon) {
        Intrinsics.checkNotNullParameter(coupon, "it");
        String barcode = coupon.getBarcode();
        if (barcode != null) {
            this.this$0.copyBarcodeToClipboard(barcode);
        }
    }
}
