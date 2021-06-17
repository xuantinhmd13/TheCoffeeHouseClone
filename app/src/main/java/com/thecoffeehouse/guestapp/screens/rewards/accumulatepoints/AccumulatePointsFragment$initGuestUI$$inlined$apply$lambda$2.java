package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.view.ViewGroupKt;
import com.bumptech.glide.Glide;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.config.Benefit;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0007"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsFragment$initGuestUI$3$1$2", "com/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsFragment$$special$$inlined$forEachIndexed$lambda$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: AccumulatePointsFragment.kt */
final class AccumulatePointsFragment$initGuestUI$$inlined$apply$lambda$2 implements View.OnClickListener {
    final /* synthetic */ RankInfoItem $rank;
    final /* synthetic */ List $rankInfo$inlined;
    final /* synthetic */ View $rankView;
    final /* synthetic */ LinearLayout $this_apply$inlined;
    final /* synthetic */ View $viewStubGuest$inlined;
    final /* synthetic */ AccumulatePointsFragment this$0;

    AccumulatePointsFragment$initGuestUI$$inlined$apply$lambda$2(View view, RankInfoItem rankInfoItem, LinearLayout linearLayout, AccumulatePointsFragment accumulatePointsFragment, List list, View view2) {
        this.$rankView = view;
        this.$rank = rankInfoItem;
        this.$this_apply$inlined = linearLayout;
        this.this$0 = accumulatePointsFragment;
        this.$rankInfo$inlined = list;
        this.$viewStubGuest$inlined = view2;
    }

    public final void onClick(View view) {
        for (View view2 : ViewGroupKt.getChildren(this.$this_apply$inlined)) {
            Objects.requireNonNull(view2, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
            CardView cardView = (CardView) view2;
            if (cardView.getCardElevation() != 0.0f) {
                AccumulatePointsFragment.access$animateChildElevation(this.this$0, cardView, 0.0f);
                ImageView imageView = (ImageView) view2.findViewById(R.id.img_icon_rank);
                AccumulatePointsFragment accumulatePointsFragment = this.this$0;
                Intrinsics.checkNotNullExpressionValue(imageView, "imgIcon");
                AccumulatePointsFragment.access$animateScaleView(accumulatePointsFragment, imageView, 1.0f);
            }
        }
        AccumulatePointsFragment accumulatePointsFragment2 = this.this$0;
        View view3 = this.$rankView;
        Objects.requireNonNull(view3, "null cannot be cast to non-null type androidx.cardview.widget.CardView");
        AccumulatePointsFragment.access$animateChildElevation(accumulatePointsFragment2, (CardView) view3, 10.0f);
        ImageView imageView2 = (ImageView) this.$rankView.findViewById(R.id.img_icon_rank);
        if (imageView2 != null) {
            AccumulatePointsFragment.access$animateScaleView(this.this$0, imageView2, 1.2f);
        }
        List<Benefit> benefits = this.$rank.getBenefits();
        LinearLayout linearLayout = (LinearLayout) this.$viewStubGuest$inlined.findViewById(R.id.rcv_rank_benefit);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
            int i = 0;
            for (T t : benefits) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.item_row_rank_benefit, (ViewGroup) null, false);
                Glide.with(inflate.getContext()).load(t2.getIcon()).into((ImageView) inflate.findViewById(R.id.img_icon_rank_benefit));
                View findViewById = inflate.findViewById(R.id.txt_rank_benefit);
                Intrinsics.checkNotNullExpressionValue(findViewById, "findViewById<TextView>(R.id.txt_rank_benefit)");
                ((TextView) findViewById).setText(t2.getName());
                if (i == CollectionsKt.getLastIndex(benefits)) {
                    View findViewById2 = inflate.findViewById(R.id.view_line_bottom);
                    Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<View>(R.id.view_line_bottom)");
                    findViewById2.setVisibility(4);
                }
                linearLayout.addView(inflate);
                i = i2;
            }
        }
    }
}
