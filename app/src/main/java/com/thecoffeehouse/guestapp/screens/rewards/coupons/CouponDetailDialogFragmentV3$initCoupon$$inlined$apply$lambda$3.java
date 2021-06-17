package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.view.View;
import android.widget.ImageView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b¸\u0006\u0000"}, d2 = {"com/thecoffeehouse/guestapp/screens/rewards/coupons/CouponDetailDialogFragmentV3$initCoupon$1$2", "Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;", "onScrollStateChanged", "", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "newState", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CouponDetailDialogFragmentV3.kt */
public final class CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$3 extends RecyclerView.OnScrollListener {
    final /* synthetic */ Ref.ObjectRef $currentCoupon;
    final /* synthetic */ LinearLayoutManager $rcCodeLayoutManager;
    final /* synthetic */ View $this_apply;
    final /* synthetic */ CouponDetailDialogFragmentV3 this$0;

    CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$3(View view, LinearLayoutManager linearLayoutManager, Ref.ObjectRef objectRef, CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        this.$this_apply = view;
        this.$rcCodeLayoutManager = linearLayoutManager;
        this.$currentCoupon = objectRef;
        this.this$0 = couponDetailDialogFragmentV3;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
    public void onScrollStateChanged(RecyclerView recyclerView, int i) {
        int findFirstCompletelyVisibleItemPosition;
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onScrollStateChanged(recyclerView, i);
        if (i == 0 && (findFirstCompletelyVisibleItemPosition = this.$rcCodeLayoutManager.findFirstCompletelyVisibleItemPosition()) != -1) {
            this.$currentCoupon.element = (T) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons().get(findFirstCompletelyVisibleItemPosition);
            if (findFirstCompletelyVisibleItemPosition == 0) {
                ImageView imageView = (ImageView) this.$this_apply.findViewById(R.id.btn_left_button);
                Intrinsics.checkNotNullExpressionValue(imageView, "btn_left_button");
                imageView.setVisibility(4);
            } else {
                ImageView imageView2 = (ImageView) this.$this_apply.findViewById(R.id.btn_left_button);
                Intrinsics.checkNotNullExpressionValue(imageView2, "btn_left_button");
                imageView2.setVisibility(0);
            }
            if (findFirstCompletelyVisibleItemPosition == CollectionsKt.getLastIndex(CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons())) {
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
}
