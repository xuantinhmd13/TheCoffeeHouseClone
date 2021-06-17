package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStoreKt;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.Day;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010\u001b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001c\u001a\u00020\tH\u0002J\u000e\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001e\u001a\u00020\u0006J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\u0010\u0010!\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019J\u0018\u0010\"\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010#\u001a\u00020$R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\r¨\u0006%"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/PickUpCheckoutInteraction;", "", "()V", "mContext", "Landroid/content/Context;", "mPickUpCheckoutLayout", "Landroid/view/View;", "onChangeLocation", "Lkotlin/Function0;", "", "getOnChangeLocation", "()Lkotlin/jvm/functions/Function0;", "setOnChangeLocation", "(Lkotlin/jvm/functions/Function0;)V", "onChangePaymentMethod", "getOnChangePaymentMethod", "setOnChangePaymentMethod", "onChangeSchedulerTime", "getOnChangeSchedulerTime", "setOnChangeSchedulerTime", "onChangeShippingMethod", "getOnChangeShippingMethod", "setOnChangeShippingMethod", "initBodyDeliveryScheduleTime", "order", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "initBodyPayment", "initBodyShippingMethod", "initHeaderShippingMethod", "initView", ViewHierarchyConstants.VIEW_KEY, "paymentIsNotSelected", "", "updateCheckoutOrder", "updateDistanceToStoreLocation", "distance", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickUpCheckoutInteraction.kt */
public final class PickUpCheckoutInteraction {
    private Context mContext;
    private View mPickUpCheckoutLayout;
    private Function0<Unit> onChangeLocation = PickUpCheckoutInteraction$onChangeLocation$1.INSTANCE;
    private Function0<Unit> onChangePaymentMethod = PickUpCheckoutInteraction$onChangePaymentMethod$1.INSTANCE;
    private Function0<Unit> onChangeSchedulerTime = PickUpCheckoutInteraction$onChangeSchedulerTime$1.INSTANCE;
    private Function0<Unit> onChangeShippingMethod = PickUpCheckoutInteraction$onChangeShippingMethod$1.INSTANCE;

    public static final /* synthetic */ View access$getMPickUpCheckoutLayout$p(PickUpCheckoutInteraction pickUpCheckoutInteraction) {
        View view = pickUpCheckoutInteraction.mPickUpCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
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

    public final Function0<Unit> getOnChangeSchedulerTime() {
        return this.onChangeSchedulerTime;
    }

    public final void setOnChangeSchedulerTime(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangeSchedulerTime = function0;
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
        this.mPickUpCheckoutLayout = view;
    }

    private final void initHeaderShippingMethod() {
        View view = this.mPickUpCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_header_pickup);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mPickUpCheckoutLayout.layout_header_pickup");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "mPickUpCheckoutLayout.la…er_pickup.txt_option_name");
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView.setText(context.getString(R.string.str_pick_up_method));
        View view2 = this.mPickUpCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_header_pickup);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mPickUpCheckoutLayout.layout_header_pickup");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "mPickUpCheckoutLayout.la…er_pickup.txt_option_desc");
        textView2.setVisibility(8);
        View view3 = this.mPickUpCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById3 = view3.findViewById(R.id.layout_header_pickup);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mPickUpCheckoutLayout.layout_header_pickup");
        TLTextView tLTextView = (TLTextView) findViewById3.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "mPickUpCheckoutLayout.la…ckup.txt_option_must_have");
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        tLTextView.setText(context2.getString(R.string.str_change));
        View view4 = this.mPickUpCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById4 = view4.findViewById(R.id.layout_header_pickup);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mPickUpCheckoutLayout.layout_header_pickup");
        TLTextView tLTextView2 = (TLTextView) findViewById4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "mPickUpCheckoutLayout.la…ckup.txt_option_must_have");
        ContextExtsKt.setOnSafeClickListener$default(tLTextView2, 0, new PickUpCheckoutInteraction$initHeaderShippingMethod$1(this), 1, null);
    }

    private final void initBodyDeliveryScheduleTime(Order order) {
        Day time;
        Day day;
        View view = this.mPickUpCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mPickUpCheckoutLayout.layout_schedule_time");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(textView, "mPickUpCheckoutLayout.la…dule_time.txt_title_price");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
        ScheduleTime scheduleTime = order.getScheduleTime();
        textViewAttributeArr[0] = new TextViewAttribute(String.valueOf((scheduleTime == null || (day = scheduleTime.getDay()) == null) ? null : day.getText()) + "\n", Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.colorTextContent), Integer.valueOf((int) R.font.sfpd_bold));
        ScheduleTime scheduleTime2 = order.getScheduleTime();
        textViewAttributeArr[1] = new TextViewAttribute(String.valueOf((scheduleTime2 == null || (time = scheduleTime2.getTime()) == null) ? null : time.getText()), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
        View view2 = this.mPickUpCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mPickUpCheckoutLayout.layout_schedule_time");
        View findViewById3 = findViewById2.findViewById(R.id.view_line_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mPickUpCheckoutLayout.la…le_time.view_line_divider");
        findViewById3.setVisibility(8);
        View view3 = this.mPickUpCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById4 = view3.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mPickUpCheckoutLayout.layout_schedule_time");
        ((TextView) findViewById4.findViewById(R.id.txt_title_price)).setLineSpacing(4.0f, 1.2f);
        View view4 = this.mPickUpCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById5 = view4.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "mPickUpCheckoutLayout.layout_schedule_time");
        TextView textView2 = (TextView) findViewById5.findViewById(R.id.txt_price_amount);
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context, R.drawable.ic_arrow_right), (Drawable) null);
        View view5 = this.mPickUpCheckoutLayout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById6 = view5.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "mPickUpCheckoutLayout.layout_schedule_time");
        ContextExtsKt.setOnSafeClickListener$default(findViewById6, 0, new PickUpCheckoutInteraction$initBodyDeliveryScheduleTime$1(this), 1, null);
    }

    private final void initBodyPayment(Order order) {
        if (paymentIsNotSelected(order)) {
            View view = this.mPickUpCheckoutLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
            }
            View findViewById = view.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById, "mPickUpCheckoutLayout.layout_payment");
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(textView, "mPickUpCheckoutLayout.la…t_payment.txt_title_price");
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            String string = context.getString(R.string.str_payment_click_to_select);
            Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…_payment_click_to_select)");
            textViewAttributeArr[0] = new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color2D72D2), Integer.valueOf((int) R.font.sfpd_regular));
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            View view2 = this.mPickUpCheckoutLayout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
            }
            View findViewById2 = view2.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "mPickUpCheckoutLayout.layout_payment");
            TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_price_amount);
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context2, R.drawable.ic_arrow_right), (Drawable) null);
            View view3 = this.mPickUpCheckoutLayout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
            }
            View findViewById3 = view3.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "mPickUpCheckoutLayout.layout_payment");
            View findViewById4 = findViewById3.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "mPickUpCheckoutLayout.la…payment.view_line_divider");
            findViewById4.setVisibility(8);
        } else {
            View view4 = this.mPickUpCheckoutLayout;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
            }
            View findViewById5 = view4.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "mPickUpCheckoutLayout.layout_payment");
            TextView textView3 = (TextView) findViewById5.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(textView3, "mPickUpCheckoutLayout.la…t_payment.txt_title_price");
            textView3.setText(order.getPayments().get(0).getText());
            Context context3 = this.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            Glide.with(context3).load(order.getPayments().get(0).getImage()).into(new PickUpCheckoutInteraction$initBodyPayment$1(this, ViewExtsKt.DPtoPX(20.0f), ViewExtsKt.DPtoPX(20.0f)));
            View view5 = this.mPickUpCheckoutLayout;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
            }
            View findViewById6 = view5.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "mPickUpCheckoutLayout.layout_payment");
            View findViewById7 = findViewById6.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "mPickUpCheckoutLayout.la…payment.view_line_divider");
            findViewById7.setVisibility(8);
            View view6 = this.mPickUpCheckoutLayout;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
            }
            View findViewById8 = view6.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "mPickUpCheckoutLayout.layout_payment");
            TextView textView4 = (TextView) findViewById8.findViewById(R.id.txt_price_amount);
            Context context4 = this.mContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context4, R.drawable.ic_arrow_right), (Drawable) null);
        }
        View view7 = this.mPickUpCheckoutLayout;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById9 = view7.findViewById(R.id.layout_payment);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "mPickUpCheckoutLayout.layout_payment");
        ContextExtsKt.setOnSafeClickListener$default(findViewById9, 0, new PickUpCheckoutInteraction$initBodyPayment$2(this), 1, null);
    }

    private final boolean paymentIsNotSelected(Order order) {
        ArrayList<Payment> payments = order.getPayments();
        return payments == null || payments.isEmpty();
    }

    private final void initBodyShippingMethod(Order order) {
        AddressOrder address;
        View view = this.mPickUpCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_pick_up_store);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mPickUpCheckoutLayout.layout_pick_up_store");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(textView, "mPickUpCheckoutLayout.la…_up_store.txt_title_price");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
        Shop shop = order.getShop();
        StringBuilder append = new StringBuilder().append(Intrinsics.stringPlus(shop != null ? shop.getName() : null, "\n"));
        Shop shop2 = order.getShop();
        textViewAttributeArr[0] = new TextViewAttribute(append.append((shop2 == null || (address = shop2.getAddress()) == null) ? null : address.getStreet()).toString() + "\n", Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
        View view2 = this.mPickUpCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_pick_up_store);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mPickUpCheckoutLayout.layout_pick_up_store");
        View findViewById3 = findViewById2.findViewById(R.id.view_line_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mPickUpCheckoutLayout.la…p_store.view_line_divider");
        findViewById3.setVisibility(8);
        View view3 = this.mPickUpCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById4 = view3.findViewById(R.id.layout_pick_up_store);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mPickUpCheckoutLayout.layout_pick_up_store");
        TextView textView2 = (TextView) findViewById4.findViewById(R.id.txt_price_amount);
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context, R.drawable.ic_arrow_right), (Drawable) null);
        View view4 = this.mPickUpCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById5 = view4.findViewById(R.id.layout_pick_up_store);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "mPickUpCheckoutLayout.layout_pick_up_store");
        ContextExtsKt.setOnSafeClickListener$default(findViewById5, 0, new PickUpCheckoutInteraction$initBodyShippingMethod$1(this), 1, null);
    }

    public final void updateCheckoutOrder(Order order) {
        if (order != null) {
            initHeaderShippingMethod();
            initBodyShippingMethod(order);
            initBodyDeliveryScheduleTime(order);
            initBodyPayment(order);
        }
    }

    public final void updateDistanceToStoreLocation(Order order, double d) {
        Shop shop;
        AddressOrder address;
        Shop shop2;
        String str = ItemRowPickStoreKt.formatDistanceToString(d / ((double) 1000)) + "km";
        View view = this.mPickUpCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPickUpCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_pick_up_store);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mPickUpCheckoutLayout.layout_pick_up_store");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(textView, "mPickUpCheckoutLayout.la…_up_store.txt_title_price");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
        String str2 = null;
        StringBuilder append = new StringBuilder().append(Intrinsics.stringPlus((order == null || (shop2 = order.getShop()) == null) ? null : shop2.getName(), "\n"));
        if (!(order == null || (shop = order.getShop()) == null || (address = shop.getAddress()) == null)) {
            str2 = address.getStreet();
        }
        textViewAttributeArr[0] = new TextViewAttribute(append.append(str2).toString() + "\n", Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color333333), Integer.valueOf((int) R.font.sfpd_regular));
        textViewAttributeArr[1] = new TextViewAttribute(str, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.color666666), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
    }
}
