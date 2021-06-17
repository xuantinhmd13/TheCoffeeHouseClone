package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.view.View;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.CouponCodeRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/rewards/coupons/CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$1$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponCodeRecyclerViewAdapter.kt */
final class CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$$inlined$let$lambda$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Coupon $coupon$inlined;
    final /* synthetic */ Function1 $onClickListener$inlined;
    final /* synthetic */ CouponCodeRecyclerViewAdapter.CouponCodeViewHolder this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponCodeRecyclerViewAdapter$CouponCodeViewHolder$bind$$inlined$let$lambda$2(CouponCodeRecyclerViewAdapter.CouponCodeViewHolder couponCodeViewHolder, Function1 function1, Coupon coupon) {
        super(1);
        this.this$0 = couponCodeViewHolder;
        this.$onClickListener$inlined = function1;
        this.$coupon$inlined = coupon;
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
        this.$onClickListener$inlined.invoke(this.$coupon$inlined);
    }
}
