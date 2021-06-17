package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0014B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\tH\u0016J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\tH\u0016J\u001e\u0010\u0012\u001a\u00020\u000b2\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingItemRecyclerViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingItemRecyclerViewAdapter$ViewHolder;", "mOrderLines", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getItemCount", "", "onBindViewHolder", "", "p0", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "orderLines", "ViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingItemRecyclerViewAdapter.kt */
public final class TrackingItemRecyclerViewAdapter extends RecyclerView.Adapter<ViewHolder> {
    private ArrayList<OrderLineCreateOrder> mOrderLines;

    public TrackingItemRecyclerViewAdapter(ArrayList<OrderLineCreateOrder> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "mOrderLines");
        this.mOrderLines = arrayList;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0016\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\t\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingItemRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mTxtExtraItem", "Landroid/widget/TextView;", "mTxtNameItem", "mTxtPrice", "mTxtQuantity", "getMTxtQuantity", "()Landroid/widget/TextView;", "viewLineDividerTop", "getViewLineDividerTop", "()Landroid/view/View;", "bind", "", "orderline", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLineCreateOrder;", "position", "", "joinExtrasToString", "", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TrackingItemRecyclerViewAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final TextView mTxtExtraItem;
        private final TextView mTxtNameItem;
        private final TextView mTxtPrice;
        private final TextView mTxtQuantity;
        private final View viewLineDividerTop;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.txt_price);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.txt_price)");
            this.mTxtPrice = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.txt_quantity);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.txt_quantity)");
            this.mTxtQuantity = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.txt_name_product);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.txt_name_product)");
            this.mTxtNameItem = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.txt_extra);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.txt_extra)");
            this.mTxtExtraItem = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.view_line_divider)");
            this.viewLineDividerTop = findViewById5;
        }

        public final TextView getMTxtQuantity() {
            return this.mTxtQuantity;
        }

        public final View getViewLineDividerTop() {
            return this.viewLineDividerTop;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingItemRecyclerViewAdapter$ViewHolder$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingItemRecyclerViewAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TrackingItemRecyclerViewAdapter.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_cart_info, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new ViewHolder(inflate);
            }
        }

        public final void bind(OrderLineCreateOrder orderLineCreateOrder, int i) {
            Intrinsics.checkNotNullParameter(orderLineCreateOrder, "orderline");
            this.mTxtPrice.setText(Html.fromHtml(orderLineCreateOrder.getPriceStr(), 0));
            this.mTxtNameItem.setText(orderLineCreateOrder.getName());
            this.mTxtQuantity.setText(String.valueOf(orderLineCreateOrder.getQuantity()));
            this.mTxtExtraItem.setText(joinExtrasToString(orderLineCreateOrder));
        }

        private final String joinExtrasToString(OrderLineCreateOrder orderLineCreateOrder) {
            String joinToString$default = CollectionsKt.joinToString$default(orderLineCreateOrder.getExtra(), "/", null, null, 0, null, null, 62, null);
            String note = orderLineCreateOrder.getNote();
            return !(note == null || StringsKt.isBlank(note)) ? joinToString$default + '/' + orderLineCreateOrder.getNote() : joinToString$default;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return ViewHolder.Companion.from(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mOrderLines.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "p0");
        OrderLineCreateOrder orderLineCreateOrder = this.mOrderLines.get(i);
        Intrinsics.checkNotNullExpressionValue(orderLineCreateOrder, "mOrderLines[p1]");
        viewHolder.bind(orderLineCreateOrder, i);
    }

    public final void updateList(ArrayList<OrderLineCreateOrder> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "orderLines");
        GeneralKt.log("isExpanding:- " + arrayList.size());
        this.mOrderLines = arrayList;
    }
}
