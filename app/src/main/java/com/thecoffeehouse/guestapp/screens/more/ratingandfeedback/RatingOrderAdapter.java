package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.RatingOrderHeaderView;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.StarsRatingView;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory;
import com.thecoffeehouse.guestapp.services.api.model.orders.Rating;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014BG\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007\u0012\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007¢\u0006\u0002\u0010\u000bJ\b\u0010\f\u001a\u00020\bH\u0016J\u0018\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\bH\u0016J\u0018\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R \u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/RatingOrderAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/RatingOrderAdapter$RatingOrderViewHolder;", "mOrders", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;", "onClickListener", "Lkotlin/Function2;", "", "", "onRatingListener", "(Ljava/util/List;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "getItemCount", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "RatingOrderViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderAdapter.kt */
public final class RatingOrderAdapter extends RecyclerView.Adapter<RatingOrderViewHolder> {
    private final List<OrderHistory> mOrders;
    private final Function2<OrderHistory, Integer, Unit> onClickListener;
    private final Function2<OrderHistory, Integer, Unit> onRatingListener;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public RatingOrderAdapter(List<OrderHistory> list, Function2<? super OrderHistory, ? super Integer, Unit> function2, Function2<? super OrderHistory, ? super Integer, Unit> function22) {
        Intrinsics.checkNotNullParameter(list, "mOrders");
        Intrinsics.checkNotNullParameter(function2, "onClickListener");
        Intrinsics.checkNotNullParameter(function22, "onRatingListener");
        this.mOrders = list;
        this.onClickListener = function2;
        this.onRatingListener = function22;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/RatingOrderAdapter$RatingOrderViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "ratingOrderHeaderView", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderHeaderView;", "getRatingOrderHeaderView", "()Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderHeaderView;", "startRatingView", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/StarsRatingView;", "getStartRatingView", "()Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/StarsRatingView;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RatingOrderAdapter.kt */
    public static final class RatingOrderViewHolder extends RecyclerView.ViewHolder {
        private final RatingOrderHeaderView ratingOrderHeaderView;
        private final StarsRatingView startRatingView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public RatingOrderViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.rating_order_detail_header);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.…ting_order_detail_header)");
            this.ratingOrderHeaderView = (RatingOrderHeaderView) findViewById;
            View findViewById2 = view.findViewById(R.id.stars_rating);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.stars_rating)");
            this.startRatingView = (StarsRatingView) findViewById2;
        }

        public final RatingOrderHeaderView getRatingOrderHeaderView() {
            return this.ratingOrderHeaderView;
        }

        public final StarsRatingView getStartRatingView() {
            return this.startRatingView;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public RatingOrderViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_rating_order, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
        return new RatingOrderViewHolder(inflate);
    }

    public void onBindViewHolder(RatingOrderViewHolder ratingOrderViewHolder, int i) {
        Integer rating;
        Intrinsics.checkNotNullParameter(ratingOrderViewHolder, "holder");
        OrderHistory orderHistory = this.mOrders.get(i);
        ratingOrderViewHolder.getRatingOrderHeaderView().updateData(StringExtsKt.toStringOrEmpty(orderHistory.getOrderTypeStr()), Long.valueOf(orderHistory.getTime()), orderHistory.getProducts());
        StarsRatingView startRatingView = ratingOrderViewHolder.getStartRatingView();
        Rating rating2 = orderHistory.getRating();
        boolean z = false;
        int intValue = (rating2 == null || (rating = rating2.getRating()) == null) ? 0 : rating.intValue();
        Rating rating3 = orderHistory.getRating();
        if ((rating3 != null ? rating3.getRating() : null) == null) {
            z = true;
        }
        startRatingView.updateData(intValue, z);
        ratingOrderViewHolder.itemView.setOnClickListener(new RatingOrderAdapter$onBindViewHolder$1(this, orderHistory, i));
        ratingOrderViewHolder.getStartRatingView().setOnRatingListener(new RatingOrderAdapter$onBindViewHolder$2(this, orderHistory));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mOrders.size();
    }
}
