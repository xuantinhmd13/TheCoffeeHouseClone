package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/thecoffeehouse/guestapp/screens/rewards/coupons/CouponDetailDialogFragmentV3$initCoupon$1$4"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponDetailDialogFragmentV3.kt */
public final class CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$5 implements View.OnClickListener {
    final /* synthetic */ Ref.ObjectRef $currentCoupon;
    final /* synthetic */ View $this_apply;
    final /* synthetic */ CouponDetailDialogFragmentV3 this$0;

    CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$5(View view, Ref.ObjectRef objectRef, CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        this.$this_apply = view;
        this.$currentCoupon = objectRef;
        this.this$0 = couponDetailDialogFragmentV3;
    }

    public final void onClick(View view) {
        int indexOf = CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons().indexOf(this.$currentCoupon.element);
        GeneralKt.log("currentIndex: " + indexOf);
        if (indexOf < CollectionsKt.getLastIndex(CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons())) {
            ((RecyclerView) this.$this_apply.findViewById(R.id.rcv_qr_code)).smoothScrollToPosition(indexOf + 1);
        }
        int i = indexOf + 1;
        if (i == 0) {
            ImageView imageView = (ImageView) this.$this_apply.findViewById(R.id.btn_left_button);
            Intrinsics.checkNotNullExpressionValue(imageView, "btn_left_button");
            imageView.setVisibility(4);
        } else {
            ImageView imageView2 = (ImageView) this.$this_apply.findViewById(R.id.btn_left_button);
            Intrinsics.checkNotNullExpressionValue(imageView2, "btn_left_button");
            imageView2.setVisibility(0);
        }
        if (i == CollectionsKt.getLastIndex(CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons())) {
            ImageView imageView3 = (ImageView) this.$this_apply.findViewById(R.id.btn_right_button);
            Intrinsics.checkNotNullExpressionValue(imageView3, "btn_right_button");
            imageView3.setVisibility(4);
            return;
        }
        ImageView imageView4 = (ImageView) this.$this_apply.findViewById(R.id.btn_right_button);
        Intrinsics.checkNotNullExpressionValue(imageView4, "btn_right_button");
        imageView4.setVisibility(0);
    }
}
