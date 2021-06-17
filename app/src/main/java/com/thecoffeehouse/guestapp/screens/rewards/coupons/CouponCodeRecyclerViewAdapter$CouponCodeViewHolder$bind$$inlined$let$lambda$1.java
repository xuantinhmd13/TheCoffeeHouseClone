package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import com.thecoffeehouse.guestapp.screens.rewards.coupons.CouponCodeRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponCodeRecyclerViewAdapter.kt */
final class CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$$inlined$let$lambda$1 implements Runnable {
    final /* synthetic */ String $barcode;
    final /* synthetic */ Coupon $coupon$inlined;
    final /* synthetic */ Function1 $onClickListener$inlined;
    final /* synthetic */ CouponCodeRecyclerViewAdapter.CouponCodeViewHolder this$0;

    CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$$inlined$let$lambda$1(String str, CouponCodeRecyclerViewAdapter.CouponCodeViewHolder couponCodeViewHolder, Function1 function1, Coupon coupon) {
        this.$barcode = str;
        this.this$0 = couponCodeViewHolder;
        this.$onClickListener$inlined = function1;
        this.$coupon$inlined = coupon;
    }

    public final void run() {
        CouponCodeRecyclerViewAdapter.CouponCodeViewHolder couponCodeViewHolder = this.this$0;
        CouponCodeRecyclerViewAdapter.CouponCodeViewHolder.access$getMImgQrCode$p(this.this$0).setImageBitmap(CouponCodeRecyclerViewAdapter.CouponCodeViewHolder.access$createBarcodeBitmap(couponCodeViewHolder, this.$barcode, CouponCodeRecyclerViewAdapter.CouponCodeViewHolder.access$getMImgQrCode$p(couponCodeViewHolder).getWidth(), CouponCodeRecyclerViewAdapter.CouponCodeViewHolder.access$getMImgQrCode$p(this.this$0).getWidth()));
    }
}
