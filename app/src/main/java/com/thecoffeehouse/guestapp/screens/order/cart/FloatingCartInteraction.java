package com.thecoffeehouse.guestapp.screens.order.cart;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLineCreateOrder;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FloatingCartInteraction {
    public static final Companion Companion = new Companion(null);
    public View layoutFloatingCart;
    private Context mContext;
    private Function0<Unit> setOnClickButtonActionListener = FloatingCartInteraction$setOnClickButtonActionListener$1.INSTANCE;
    private Function0<Unit> setOnSafeClickListener = FloatingCartInteraction$setOnSafeClickListener$1.INSTANCE;

    public final Function0<Unit> getSetOnClickButtonActionListener() {
        return this.setOnClickButtonActionListener;
    }

    public final void setSetOnClickButtonActionListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.setOnClickButtonActionListener = function0;
    }

    public final Function0<Unit> getSetOnSafeClickListener() {
        return this.setOnSafeClickListener;
    }

    public final void setSetOnSafeClickListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.setOnSafeClickListener = function0;
    }

    public final View getLayoutFloatingCart() {
        View view = this.layoutFloatingCart;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
        }
        return view;
    }

    public final void setLayoutFloatingCart(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.layoutFloatingCart = view;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int calculateTotalItemsInCart(ArrayList<OrderLine> arrayList) {
            Intrinsics.checkNotNullParameter(arrayList, "data");
            Iterator<OrderLine> it = arrayList.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += it.next().getQuantity();
            }
            return i;
        }

        public final int calculateTotalItemsInOrder(List<OrderLineCreateOrder> list) {
            Intrinsics.checkNotNullParameter(list, "data");
            int i = 0;
            for (OrderLineCreateOrder orderLineCreateOrder : list) {
                Integer quantity = orderLineCreateOrder.getQuantity();
                i += quantity != null ? quantity.intValue() : 0;
            }
            return i;
        }
    }

    public final void initView(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.mContext = context;
        this.layoutFloatingCart = view;
        listenViews();
    }

    private final void listenViews() {
        View view = this.layoutFloatingCart;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
        }
        TLButton tLButton = (TLButton) view.findViewById(R.id.btn_add_to_cart);
        Intrinsics.checkNotNullExpressionValue(tLButton, "layoutFloatingCart.btn_add_to_cart");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new FloatingCartInteraction$listenViews$1(this), 1, null);
        View view2 = this.layoutFloatingCart;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.layout_cart_info);
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "layoutFloatingCart.layout_cart_info");
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout, 0, new FloatingCartInteraction$listenViews$2(this), 1, null);
    }

    public static /* synthetic */ void updateCart$default(FloatingCartInteraction floatingCartInteraction, Order order, boolean z, String str, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            str = null;
        }
        floatingCartInteraction.updateCart(order, z, str);
    }

    public final void updateCart(Order order, boolean z, String str) {
        if (this.layoutFloatingCart != null) {
            String str2 = null;
            if ((order != null ? order.getOrderLines() : null) == null) {
                View view = this.layoutFloatingCart;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
                }
                view.setVisibility(8);
                return;
            }
            ArrayList<OrderLine> orderLines = order.getOrderLines();
            if (orderLines == null || orderLines.isEmpty()) {
                View view2 = this.layoutFloatingCart;
                if (view2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
                }
                view2.setVisibility(8);
                return;
            }
            View view3 = this.layoutFloatingCart;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
            }
            if (view3.getVisibility() == 8) {
                View view4 = this.layoutFloatingCart;
                if (view4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
                }
                view4.setVisibility(0);
            }
            View view5 = this.layoutFloatingCart;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
            }
            TextView textView = (TextView) view5.findViewById(R.id.txt_no_items);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutFloatingCart.txt_no_items");
            if (str == null) {
                Context context = this.mContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                str = context.getString(R.string.str_no_of_items_in_cart, Integer.valueOf(Companion.calculateTotalItemsInCart(order.getOrderLines())));
            }
            textView.setText(str);
            if (z) {
                View view6 = this.layoutFloatingCart;
                if (view6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
                }
                TextView textView2 = (TextView) view6.findViewById(R.id.txt_total_price);
                Intrinsics.checkNotNullExpressionValue(textView2, "layoutFloatingCart.txt_total_price");
                Integer afterDiscount = order.getAfterDiscount();
                if (afterDiscount != null) {
                    str2 = OrderExtsKt.formatVND(afterDiscount);
                }
                textView2.setText(str2);
                return;
            }
            View view7 = this.layoutFloatingCart;
            if (view7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutFloatingCart");
            }
            TextView textView3 = (TextView) view7.findViewById(R.id.txt_total_price);
            Intrinsics.checkNotNullExpressionValue(textView3, "layoutFloatingCart.txt_total_price");
            Integer total = order.getTotal();
            if (total != null) {
                str2 = OrderExtsKt.formatVND(total);
            }
            textView3.setText(str2);
        }
    }
}
