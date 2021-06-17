package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u00020\tH\u0002J\u0010\u0010\u0018\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u000e\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u0004J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u001e\u001a\u00020\t2\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/AtTableCheckoutInteraction;", "", "()V", "mAtStoreCheckoutLayout", "Landroid/view/View;", "mContext", "Landroid/content/Context;", "onChangeLocation", "Lkotlin/Function0;", "", "getOnChangeLocation", "()Lkotlin/jvm/functions/Function0;", "setOnChangeLocation", "(Lkotlin/jvm/functions/Function0;)V", "onChangePaymentMethod", "getOnChangePaymentMethod", "setOnChangePaymentMethod", "onChangeShippingMethod", "getOnChangeShippingMethod", "setOnChangeShippingMethod", "initBodyPayment", "order", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "initHeaderShippingMethod", "initStoreName", "initTableName", "initView", ViewHierarchyConstants.VIEW_KEY, "paymentIsNotSelected", "", "updateCheckoutOrder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AtTableCheckoutInteraction.kt */
public final class AtTableCheckoutInteraction {
    private View mAtStoreCheckoutLayout;
    private Context mContext;
    private Function0<Unit> onChangeLocation = AtTableCheckoutInteraction$onChangeLocation$1.INSTANCE;
    private Function0<Unit> onChangePaymentMethod = AtTableCheckoutInteraction$onChangePaymentMethod$1.INSTANCE;
    private Function0<Unit> onChangeShippingMethod = AtTableCheckoutInteraction$onChangeShippingMethod$1.INSTANCE;

    public static final /* synthetic */ View access$getMAtStoreCheckoutLayout$p(AtTableCheckoutInteraction atTableCheckoutInteraction) {
        View view = atTableCheckoutInteraction.mAtStoreCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        return view;
    }

    public final Function0<Unit> getOnChangeShippingMethod() {
        return this.onChangeShippingMethod;
    }

    public final void setOnChangeShippingMethod(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangeShippingMethod = function0;
    }

    public final Function0<Unit> getOnChangePaymentMethod() {
        return this.onChangePaymentMethod;
    }

    public final void setOnChangePaymentMethod(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangePaymentMethod = function0;
    }

    public final Function0<Unit> getOnChangeLocation() {
        return this.onChangeLocation;
    }

    public final void setOnChangeLocation(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangeLocation = function0;
    }

    public final void initView(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.mContext = context;
        this.mAtStoreCheckoutLayout = view;
    }

    private final void initHeaderShippingMethod() {
        View view = this.mAtStoreCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_header_at_table);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mAtStoreCheckoutLayout.layout_header_at_table");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "mAtStoreCheckoutLayout.l…_at_table.txt_option_name");
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView.setText(context.getString(R.string.str_at_table));
        View view2 = this.mAtStoreCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_header_at_table);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mAtStoreCheckoutLayout.layout_header_at_table");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "mAtStoreCheckoutLayout.l…_at_table.txt_option_desc");
        textView2.setVisibility(8);
        View view3 = this.mAtStoreCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById3 = view3.findViewById(R.id.layout_header_at_table);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mAtStoreCheckoutLayout.layout_header_at_table");
        TLTextView tLTextView = (TLTextView) findViewById3.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "mAtStoreCheckoutLayout.l…able.txt_option_must_have");
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        tLTextView.setText(context2.getString(R.string.str_change));
        View view4 = this.mAtStoreCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById4 = view4.findViewById(R.id.layout_header_at_table);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mAtStoreCheckoutLayout.layout_header_at_table");
        TLTextView tLTextView2 = (TLTextView) findViewById4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "mAtStoreCheckoutLayout.l…able.txt_option_must_have");
        ContextExtsKt.setOnSafeClickListener$default(tLTextView2, 0, new AtTableCheckoutInteraction$initHeaderShippingMethod$1(this), 1, null);
    }

    private final void initTableName(Order order) {
        View view = this.mAtStoreCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_info_table);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mAtStoreCheckoutLayout.layout_info_table");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "mAtStoreCheckoutLayout.l…nfo_table.txt_option_name");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        String string = context.getString(R.string.str_you_are_at);
        Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.string.str_you_are_at)");
        textViewAttributeArr[0] = new TextViewAttribute(string, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
        View view2 = this.mAtStoreCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_info_table);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mAtStoreCheckoutLayout.layout_info_table");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "mAtStoreCheckoutLayout.l…nfo_table.txt_option_desc");
        TextViewAttribute[] textViewAttributeArr2 = new TextViewAttribute[1];
        TableInfo tableInfo = order.getTableInfo();
        textViewAttributeArr2[0] = new TextViewAttribute(StringExtsKt.toStringOrEmpty(tableInfo != null ? tableInfo.getTableName() : null), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_bold));
        TLTextViewKt.setTextMultipleFonts(textView2, textViewAttributeArr2);
        View view3 = this.mAtStoreCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById3 = view3.findViewById(R.id.layout_info_table);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mAtStoreCheckoutLayout.layout_info_table");
        TLTextView tLTextView = (TLTextView) findViewById3.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "mAtStoreCheckoutLayout.l…able.txt_option_must_have");
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        tLTextView.setText(context2.getString(R.string.str_change_table));
        View view4 = this.mAtStoreCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById4 = view4.findViewById(R.id.layout_info_table);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mAtStoreCheckoutLayout.layout_info_table");
        TLTextView tLTextView2 = (TLTextView) findViewById4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "mAtStoreCheckoutLayout.l…able.txt_option_must_have");
        ViewGroup.LayoutParams layoutParams = tLTextView2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).addRule(15);
        View view5 = this.mAtStoreCheckoutLayout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById5 = view5.findViewById(R.id.layout_info_table);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "mAtStoreCheckoutLayout.layout_info_table");
        ContextExtsKt.setOnSafeClickListener$default(findViewById5, 0, new AtTableCheckoutInteraction$initTableName$1(this), 1, null);
    }

    private final void initBodyPayment(Order order) {
        if (paymentIsNotSelected(order)) {
            View view = this.mAtStoreCheckoutLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
            }
            View findViewById = view.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById, "mAtStoreCheckoutLayout.layout_payment");
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(textView, "mAtStoreCheckoutLayout.l…t_payment.txt_title_price");
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            String string = context.getString(R.string.str_payment_click_to_select);
            Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…_payment_click_to_select)");
            textViewAttributeArr[0] = new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color2D72D2), Integer.valueOf((int) R.font.sfpd_regular));
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            View view2 = this.mAtStoreCheckoutLayout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
            }
            View findViewById2 = view2.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "mAtStoreCheckoutLayout.layout_payment");
            TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_price_amount);
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context2, R.drawable.ic_arrow_right), (Drawable) null);
            View view3 = this.mAtStoreCheckoutLayout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
            }
            View findViewById3 = view3.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "mAtStoreCheckoutLayout.layout_payment");
            View findViewById4 = findViewById3.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "mAtStoreCheckoutLayout.l…payment.view_line_divider");
            findViewById4.setVisibility(8);
        } else {
            View view4 = this.mAtStoreCheckoutLayout;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
            }
            View findViewById5 = view4.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "mAtStoreCheckoutLayout.layout_payment");
            TextView textView3 = (TextView) findViewById5.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(textView3, "mAtStoreCheckoutLayout.l…t_payment.txt_title_price");
            textView3.setText(order.getPayments().get(0).getText());
            Context context3 = this.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            Glide.with(context3).load(order.getPayments().get(0).getImage()).into(new AtTableCheckoutInteraction$initBodyPayment$1(this, ViewExtsKt.DPtoPX(20.0f), ViewExtsKt.DPtoPX(20.0f)));
            View view5 = this.mAtStoreCheckoutLayout;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
            }
            View findViewById6 = view5.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "mAtStoreCheckoutLayout.layout_payment");
            View findViewById7 = findViewById6.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "mAtStoreCheckoutLayout.l…payment.view_line_divider");
            findViewById7.setVisibility(8);
            View view6 = this.mAtStoreCheckoutLayout;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
            }
            View findViewById8 = view6.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "mAtStoreCheckoutLayout.layout_payment");
            TextView textView4 = (TextView) findViewById8.findViewById(R.id.txt_price_amount);
            Context context4 = this.mContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context4, R.drawable.ic_arrow_right), (Drawable) null);
        }
        View view7 = this.mAtStoreCheckoutLayout;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById9 = view7.findViewById(R.id.layout_payment);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "mAtStoreCheckoutLayout.layout_payment");
        ContextExtsKt.setOnSafeClickListener$default(findViewById9, 0, new AtTableCheckoutInteraction$initBodyPayment$2(this), 1, null);
    }

    private final boolean paymentIsNotSelected(Order order) {
        ArrayList<Payment> payments = order.getPayments();
        return payments == null || payments.isEmpty();
    }

    private final void initStoreName(Order order) {
        View view = this.mAtStoreCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_at_table_store);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mAtStoreCheckoutLayout.layout_at_table_store");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(textView, "mAtStoreCheckoutLayout.l…ble_store.txt_title_price");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
        TableInfo tableInfo = order.getTableInfo();
        String str = null;
        textViewAttributeArr[0] = new TextViewAttribute(Intrinsics.stringPlus(tableInfo != null ? tableInfo.getStoreName() : null, "\n"), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular));
        TableInfo tableInfo2 = order.getTableInfo();
        if (tableInfo2 != null) {
            str = tableInfo2.getAddress();
        }
        textViewAttributeArr[1] = new TextViewAttribute(StringExtsKt.toStringOrEmpty(str), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
        View view2 = this.mAtStoreCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAtStoreCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_at_table_store);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mAtStoreCheckoutLayout.layout_at_table_store");
        View findViewById3 = findViewById2.findViewById(R.id.view_line_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mAtStoreCheckoutLayout.l…e_store.view_line_divider");
        findViewById3.setVisibility(4);
    }

    public final void updateCheckoutOrder(Order order) {
        if (order != null) {
            initHeaderShippingMethod();
            initStoreName(order);
            initTableName(order);
            initBodyPayment(order);
        }
    }
}
