package com.thecoffeehouse.guestapp.screens.order.cart;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.adapters.RecyclerSwipeAdapter;
import com.daimajia.swipe.implments.SwipeItemRecyclerMangerImpl;
import com.daimajia.swipe.util.Attributes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.CornerConstraintLayout;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aBQ\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006\u0012\u0018\u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\u0018\u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\fJ\u0006\u0010\r\u001a\u00020\nJ\b\u0010\u000e\u001a\u00020\tH\u0016J\u0010\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\tH\u0016J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\tH\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\tH\u0016J\u001e\u0010\u0018\u001a\u00020\n2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R \u0010\u000b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter;", "Lcom/daimajia/swipe/adapters/RecyclerSwipeAdapter;", "Lcom/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter$ViewHolder;", "mOrderLines", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "Lkotlin/collections/ArrayList;", "onItemEditListener", "Lkotlin/Function2;", "", "", "onItemDeleteListener", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;)V", "closeAllSwipeLayout", "getItemCount", "getSwipeLayoutResourceId", "position", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateList", "orderLines", "ViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CartItemRecyclerViewAdapter.kt */
public final class CartItemRecyclerViewAdapter extends RecyclerSwipeAdapter<ViewHolder> {
    private ArrayList<OrderLine> mOrderLines;
    private final Function2<OrderLine, Integer, Unit> onItemDeleteListener;
    private final Function2<OrderLine, Integer, Unit> onItemEditListener;

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public int getSwipeLayoutResourceId(int i) {
        return R.id.swipe;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function2<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function2<? super com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine, ? super java.lang.Integer, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public CartItemRecyclerViewAdapter(ArrayList<OrderLine> arrayList, Function2<? super OrderLine, ? super Integer, Unit> function2, Function2<? super OrderLine, ? super Integer, Unit> function22) {
        Intrinsics.checkNotNullParameter(arrayList, "mOrderLines");
        Intrinsics.checkNotNullParameter(function2, "onItemEditListener");
        Intrinsics.checkNotNullParameter(function22, "onItemDeleteListener");
        this.mOrderLines = arrayList;
        this.onItemEditListener = function2;
        this.onItemDeleteListener = function22;
        SwipeItemRecyclerMangerImpl swipeItemRecyclerMangerImpl = this.mItemManger;
        Intrinsics.checkNotNullExpressionValue(swipeItemRecyclerMangerImpl, "mItemManger");
        swipeItemRecyclerMangerImpl.setMode(Attributes.Mode.Single);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u0018\u0000 %2\u00020\u0001:\u0001%B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004JJ\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0018\u0010\u001e\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u001f2\u0018\u0010!\u001a\u0014\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u001b0\u001f2\u0006\u0010\"\u001a\u00020 J\u0010\u0010#\u001a\u00020$2\u0006\u0010\u001c\u001a\u00020\u001dH\u0002R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0013\u001a\u00020\u0014¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "layoutAction", "Landroid/widget/FrameLayout;", "getLayoutAction", "()Landroid/widget/FrameLayout;", "mImgEdit", "Landroid/widget/ImageView;", "getMImgEdit", "()Landroid/widget/ImageView;", "mLayoutItemCart", "Lcom/thecoffeehouse/guestapp/views/CornerConstraintLayout;", "mTxtExtraItem", "Landroid/widget/TextView;", "mTxtNameItem", "mTxtPrice", "swipeLayout", "Lcom/daimajia/swipe/SwipeLayout;", "getSwipeLayout", "()Lcom/daimajia/swipe/SwipeLayout;", "viewLineDividerTop", "getViewLineDividerTop", "()Landroid/view/View;", "bind", "", "orderline", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "onItemClickListener", "Lkotlin/Function2;", "", "onItemDeleteListener", "position", "joinExtrasToString", "", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CartItemRecyclerViewAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final FrameLayout layoutAction;
        private final ImageView mImgEdit;
        private final CornerConstraintLayout mLayoutItemCart;
        private final TextView mTxtExtraItem;
        private final TextView mTxtNameItem;
        private final TextView mTxtPrice;
        private final SwipeLayout swipeLayout;
        private final View viewLineDividerTop;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.txt_price);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.txt_price)");
            this.mTxtPrice = (TextView) findViewById;
            View findViewById2 = view.findViewById(R.id.img_edit);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.img_edit)");
            this.mImgEdit = (ImageView) findViewById2;
            View findViewById3 = view.findViewById(R.id.txt_name_product);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.txt_name_product)");
            this.mTxtNameItem = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.txt_extra);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.txt_extra)");
            this.mTxtExtraItem = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.layout_item_cart);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.layout_item_cart)");
            this.mLayoutItemCart = (CornerConstraintLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.swipe);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.swipe)");
            this.swipeLayout = (SwipeLayout) findViewById6;
            View findViewById7 = view.findViewById(R.id.layout_action_item_cart);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "itemView.findViewById(R.….layout_action_item_cart)");
            this.layoutAction = (FrameLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "itemView.findViewById(R.id.view_line_divider)");
            this.viewLineDividerTop = findViewById8;
        }

        public final ImageView getMImgEdit() {
            return this.mImgEdit;
        }

        public final SwipeLayout getSwipeLayout() {
            return this.swipeLayout;
        }

        public final FrameLayout getLayoutAction() {
            return this.layoutAction;
        }

        public final View getViewLineDividerTop() {
            return this.viewLineDividerTop;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter$ViewHolder$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/thecoffeehouse/guestapp/screens/order/cart/CartItemRecyclerViewAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: CartItemRecyclerViewAdapter.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_cart_swipable, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new ViewHolder(inflate);
            }
        }

        public final void bind(OrderLine orderLine, Function2<? super OrderLine, ? super Integer, Unit> function2, Function2<? super OrderLine, ? super Integer, Unit> function22, int i) {
            Intrinsics.checkNotNullParameter(orderLine, "orderline");
            Intrinsics.checkNotNullParameter(function2, "onItemClickListener");
            Intrinsics.checkNotNullParameter(function22, "onItemDeleteListener");
            if (i == 0) {
                this.viewLineDividerTop.setVisibility(4);
            }
            this.mTxtPrice.setText(Html.fromHtml(orderLine.getPriceStr(), 0));
            this.mTxtNameItem.setText((String.valueOf(orderLine.getQuantity()) + "x ") + orderLine.getName());
            this.mTxtExtraItem.setText(joinExtrasToString(orderLine));
            if (orderLine.getEditable()) {
                this.mImgEdit.setVisibility(0);
                ContextExtsKt.setOnSafeClickListener$default(this.mLayoutItemCart, 0, new CartItemRecyclerViewAdapter$ViewHolder$bind$1(function2, orderLine, i), 1, null);
                View findViewById = this.layoutAction.findViewById(R.id.btn_edit);
                Intrinsics.checkNotNullExpressionValue(findViewById, "layoutAction.btn_edit");
                ContextExtsKt.setOnSafeClickListener$default(findViewById, 0, new CartItemRecyclerViewAdapter$ViewHolder$bind$2(this, function2, orderLine, i), 1, null);
                View findViewById2 = this.layoutAction.findViewById(R.id.btn_remove);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "layoutAction.btn_remove");
                ContextExtsKt.setOnSafeClickListener$default(findViewById2, 0, new CartItemRecyclerViewAdapter$ViewHolder$bind$3(this, function22, orderLine, i), 1, null);
                return;
            }
            this.mImgEdit.setVisibility(4);
        }

        private final String joinExtrasToString(OrderLine orderLine) {
            String joinToString$default = CollectionsKt.joinToString$default(orderLine.getExtra(), "/", null, null, 0, null, CartItemRecyclerViewAdapter$ViewHolder$joinExtrasToString$optionsAndNote$1.INSTANCE, 30, null);
            String note = orderLine.getNote();
            return !(note == null || StringsKt.isBlank(note)) ? joinToString$default + '/' + orderLine.getNote() : joinToString$default;
        }
    }

    @Override // com.daimajia.swipe.adapters.RecyclerSwipeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
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
        OrderLine orderLine = this.mOrderLines.get(i);
        Intrinsics.checkNotNullExpressionValue(orderLine, "mOrderLines[p1]");
        OrderLine orderLine2 = orderLine;
        viewHolder.bind(orderLine2, this.onItemEditListener, this.onItemDeleteListener, i);
        if (orderLine2.getEditable()) {
            this.mItemManger.bindView(viewHolder.itemView, i);
            ContextExtsKt.setOnSafeClickListener$default(viewHolder.getMImgEdit(), 0, new CartItemRecyclerViewAdapter$onBindViewHolder$1(viewHolder), 1, null);
            viewHolder.getSwipeLayout().addSwipeListener(new CartItemRecyclerViewAdapter$onBindViewHolder$2(this));
            return;
        }
        viewHolder.itemView.setOnTouchListener(CartItemRecyclerViewAdapter$onBindViewHolder$3.INSTANCE);
    }

    public final void closeAllSwipeLayout() {
        SwipeItemRecyclerMangerImpl swipeItemRecyclerMangerImpl = this.mItemManger;
        Intrinsics.checkNotNullExpressionValue(swipeItemRecyclerMangerImpl, "mItemManger");
        List<Integer> openItems = swipeItemRecyclerMangerImpl.getOpenItems();
        Intrinsics.checkNotNullExpressionValue(openItems, "mItemManger.openItems");
        if (!openItems.isEmpty()) {
            this.mItemManger.closeAllItems();
        }
    }

    public final void updateList(ArrayList<OrderLine> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "orderLines");
        GeneralKt.log("isExpanding:- " + arrayList.size());
        this.mOrderLines = arrayList;
    }
}
