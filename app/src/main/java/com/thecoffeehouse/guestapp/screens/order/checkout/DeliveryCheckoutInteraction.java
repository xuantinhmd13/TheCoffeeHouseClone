package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.orders.Day;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010\u001e\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001cH\u0002J\b\u0010 \u001a\u00020\tH\u0002J\u0010\u0010!\u001a\u00020\t2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u000e\u0010\"\u001a\u00020\t2\u0006\u0010#\u001a\u00020\u0006J\u0010\u0010$\u001a\u00020%2\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010&\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cR\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X.¢\u0006\u0002\n\u0000R\"\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u000b\"\u0004\b\u0010\u0010\rR\"\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000b\"\u0004\b\u0013\u0010\rR\"\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u000b\"\u0004\b\u0016\u0010\rR\"\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000b\"\u0004\b\u0019\u0010\r¨\u0006'"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/DeliveryCheckoutInteraction;", "", "()V", "mContext", "Landroid/content/Context;", "mDeliveryCheckoutLayout", "Landroid/view/View;", "onChangeLocation", "Lkotlin/Function0;", "", "getOnChangeLocation", "()Lkotlin/jvm/functions/Function0;", "setOnChangeLocation", "(Lkotlin/jvm/functions/Function0;)V", "onChangePaymentMethod", "getOnChangePaymentMethod", "setOnChangePaymentMethod", "onChangeReceiverInfo", "getOnChangeReceiverInfo", "setOnChangeReceiverInfo", "onChangeSchedulerTime", "getOnChangeSchedulerTime", "setOnChangeSchedulerTime", "onChangeShippingMethod", "getOnChangeShippingMethod", "setOnChangeShippingMethod", "initBodyDeliveryInfo", "order", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "initBodyPayment", "initBodyShippingMethod", "mOrder", "initHeaderShippingMethod", "initSaveDeliveryInfo", "initView", ViewHierarchyConstants.VIEW_KEY, "paymentIsNotSelected", "", "updateCheckoutOrder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: DeliveryCheckoutInteraction.kt */
public final class DeliveryCheckoutInteraction {
    private Context mContext;
    private View mDeliveryCheckoutLayout;
    private Function0<Unit> onChangeLocation = DeliveryCheckoutInteraction$onChangeLocation$1.INSTANCE;
    private Function0<Unit> onChangePaymentMethod = DeliveryCheckoutInteraction$onChangePaymentMethod$1.INSTANCE;
    private Function0<Unit> onChangeReceiverInfo = DeliveryCheckoutInteraction$onChangeReceiverInfo$1.INSTANCE;
    private Function0<Unit> onChangeSchedulerTime = DeliveryCheckoutInteraction$onChangeSchedulerTime$1.INSTANCE;
    private Function0<Unit> onChangeShippingMethod = DeliveryCheckoutInteraction$onChangeShippingMethod$1.INSTANCE;

    public static final /* synthetic */ View access$getMDeliveryCheckoutLayout$p(DeliveryCheckoutInteraction deliveryCheckoutInteraction) {
        View view = deliveryCheckoutInteraction.mDeliveryCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        return view;
    }

    public final Function0<Unit> getOnChangeLocation() {
        return this.onChangeLocation;
    }

    public final void setOnChangeLocation(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangeLocation = function0;
    }

    public final Function0<Unit> getOnChangeReceiverInfo() {
        return this.onChangeReceiverInfo;
    }

    public final void setOnChangeReceiverInfo(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangeReceiverInfo = function0;
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

    public final Function0<Unit> getOnChangeSchedulerTime() {
        return this.onChangeSchedulerTime;
    }

    public final void setOnChangeSchedulerTime(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onChangeSchedulerTime = function0;
    }

    public final void initView(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        Context context = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "view.context");
        this.mContext = context;
        this.mDeliveryCheckoutLayout = view;
    }

    public final void updateCheckoutOrder(Order order) {
        if (order != null) {
            initHeaderShippingMethod();
            initBodyShippingMethod(order);
            initBodyDeliveryInfo(order);
            initSaveDeliveryInfo(order);
            initBodyPayment(order);
        }
    }

    private final void initBodyPayment(Order order) {
        if (paymentIsNotSelected(order)) {
            View view = this.mDeliveryCheckoutLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById = view.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById, "mDeliveryCheckoutLayout.layout_payment");
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(textView, "mDeliveryCheckoutLayout.…t_payment.txt_title_price");
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[1];
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            String string = context.getString(R.string.str_payment_click_to_select);
            Intrinsics.checkNotNullExpressionValue(string, "mContext.getString(R.str…_payment_click_to_select)");
            textViewAttributeArr[0] = new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color2D72D2), Integer.valueOf((int) R.font.sfpd_regular));
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            View view2 = this.mDeliveryCheckoutLayout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById2 = view2.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "mDeliveryCheckoutLayout.layout_payment");
            TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_price_amount);
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView2.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context2, R.drawable.ic_arrow_right), (Drawable) null);
            View view3 = this.mDeliveryCheckoutLayout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById3 = view3.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "mDeliveryCheckoutLayout.layout_payment");
            View findViewById4 = findViewById3.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "mDeliveryCheckoutLayout.…payment.view_line_divider");
            findViewById4.setVisibility(8);
        } else {
            View view4 = this.mDeliveryCheckoutLayout;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById5 = view4.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "mDeliveryCheckoutLayout.layout_payment");
            TextView textView3 = (TextView) findViewById5.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(textView3, "mDeliveryCheckoutLayout.…t_payment.txt_title_price");
            textView3.setText(order.getPayments().get(0).getText());
            Context context3 = this.mContext;
            if (context3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            Glide.with(context3).load(order.getPayments().get(0).getImage()).into(new DeliveryCheckoutInteraction$initBodyPayment$1(this, ViewExtsKt.DPtoPX(20.0f), ViewExtsKt.DPtoPX(20.0f)));
            View view5 = this.mDeliveryCheckoutLayout;
            if (view5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById6 = view5.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "mDeliveryCheckoutLayout.layout_payment");
            View findViewById7 = findViewById6.findViewById(R.id.view_line_divider);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "mDeliveryCheckoutLayout.…payment.view_line_divider");
            findViewById7.setVisibility(8);
            View view6 = this.mDeliveryCheckoutLayout;
            if (view6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById8 = view6.findViewById(R.id.layout_payment);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "mDeliveryCheckoutLayout.layout_payment");
            TextView textView4 = (TextView) findViewById8.findViewById(R.id.txt_price_amount);
            Context context4 = this.mContext;
            if (context4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView4.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(context4, R.drawable.ic_arrow_right), (Drawable) null);
        }
        View view7 = this.mDeliveryCheckoutLayout;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById9 = view7.findViewById(R.id.layout_payment);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "mDeliveryCheckoutLayout.layout_payment");
        ContextExtsKt.setOnSafeClickListener$default(findViewById9, 0, new DeliveryCheckoutInteraction$initBodyPayment$2(this), 1, null);
    }

    private final boolean paymentIsNotSelected(Order order) {
        ArrayList<Payment> payments = order.getPayments();
        return payments == null || payments.isEmpty();
    }

    private final void initBodyDeliveryInfo(Order order) {
        Phone phone;
        Day time;
        Day day;
        View view = this.mDeliveryCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_date_delivery);
        Intrinsics.checkNotNullExpressionValue(textView, "mDeliveryCheckoutLayout.…le_time.txt_date_delivery");
        ScheduleTime scheduleTime = order.getScheduleTime();
        String str = null;
        textView.setText(String.valueOf((scheduleTime == null || (day = scheduleTime.getDay()) == null) ? null : day.getText()));
        View view2 = this.mDeliveryCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_time_delivery);
        Intrinsics.checkNotNullExpressionValue(textView2, "mDeliveryCheckoutLayout.…le_time.txt_time_delivery");
        ScheduleTime scheduleTime2 = order.getScheduleTime();
        textView2.setText(String.valueOf((scheduleTime2 == null || (time = scheduleTime2.getTime()) == null) ? null : time.getText()));
        View view3 = this.mDeliveryCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById3 = view3.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView3 = (TextView) findViewById3.findViewById(R.id.txt_receiver_name);
        Intrinsics.checkNotNullExpressionValue(textView3, "mDeliveryCheckoutLayout.…le_time.txt_receiver_name");
        AddressSuggestion addressSuggestion = order.getAddressSuggestion();
        textView3.setText(addressSuggestion != null ? addressSuggestion.getName() : null);
        View view4 = this.mDeliveryCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById4 = view4.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView4 = (TextView) findViewById4.findViewById(R.id.txt_receiver_phone_number);
        Intrinsics.checkNotNullExpressionValue(textView4, "mDeliveryCheckoutLayout.…txt_receiver_phone_number");
        AddressSuggestion addressSuggestion2 = order.getAddressSuggestion();
        if (!(addressSuggestion2 == null || (phone = addressSuggestion2.getPhone()) == null)) {
            str = phone.getPhoneNumber();
        }
        textView4.setText(str);
        View view5 = this.mDeliveryCheckoutLayout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById5 = view5.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView5 = (TextView) findViewById5.findViewById(R.id.txt_receiver_name);
        Intrinsics.checkNotNullExpressionValue(textView5, "mDeliveryCheckoutLayout.…le_time.txt_receiver_name");
        ContextExtsKt.setOnSafeClickListener$default(textView5, 0, new DeliveryCheckoutInteraction$initBodyDeliveryInfo$1(this), 1, null);
        View view6 = this.mDeliveryCheckoutLayout;
        if (view6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById6 = view6.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView6 = (TextView) findViewById6.findViewById(R.id.txt_receiver_phone_number);
        Intrinsics.checkNotNullExpressionValue(textView6, "mDeliveryCheckoutLayout.…txt_receiver_phone_number");
        ContextExtsKt.setOnSafeClickListener$default(textView6, 0, new DeliveryCheckoutInteraction$initBodyDeliveryInfo$2(this), 1, null);
        View view7 = this.mDeliveryCheckoutLayout;
        if (view7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById7 = view7.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView7 = (TextView) findViewById7.findViewById(R.id.txt_date_delivery);
        Intrinsics.checkNotNullExpressionValue(textView7, "mDeliveryCheckoutLayout.…le_time.txt_date_delivery");
        ContextExtsKt.setOnSafeClickListener$default(textView7, 0, new DeliveryCheckoutInteraction$initBodyDeliveryInfo$3(this), 1, null);
        View view8 = this.mDeliveryCheckoutLayout;
        if (view8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById8 = view8.findViewById(R.id.layout_schedule_time);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "mDeliveryCheckoutLayout.layout_schedule_time");
        TextView textView8 = (TextView) findViewById8.findViewById(R.id.txt_time_delivery);
        Intrinsics.checkNotNullExpressionValue(textView8, "mDeliveryCheckoutLayout.…le_time.txt_time_delivery");
        ContextExtsKt.setOnSafeClickListener$default(textView8, 0, new DeliveryCheckoutInteraction$initBodyDeliveryInfo$4(this), 1, null);
    }

    private final void initSaveDeliveryInfo(Order order) {
        AddressSuggestion addressSuggestion = order.getAddressSuggestion();
        if (Intrinsics.areEqual((Object) (addressSuggestion != null ? addressSuggestion.getAllowSave() : null), (Object) true)) {
            View view = this.mDeliveryCheckoutLayout;
            if (view == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById = view.findViewById(R.id.layout_save_delivery_info);
            Intrinsics.checkNotNullExpressionValue(findViewById, "mDeliveryCheckoutLayout.layout_save_delivery_info");
            findViewById.setVisibility(0);
            View view2 = this.mDeliveryCheckoutLayout;
            if (view2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById2 = view2.findViewById(R.id.layout_save_delivery_info);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "mDeliveryCheckoutLayout.layout_save_delivery_info");
            ((TextView) findViewById2.findViewById(R.id.txt_menu)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            View view3 = this.mDeliveryCheckoutLayout;
            if (view3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            view3.findViewById(R.id.layout_save_delivery_info).setOnClickListener(new DeliveryCheckoutInteraction$initSaveDeliveryInfo$1(this));
            View view4 = this.mDeliveryCheckoutLayout;
            if (view4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
            }
            View findViewById3 = view4.findViewById(R.id.layout_save_delivery_info);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "mDeliveryCheckoutLayout.layout_save_delivery_info");
            TextView textView = (TextView) findViewById3.findViewById(R.id.txt_menu);
            Intrinsics.checkNotNullExpressionValue(textView, "mDeliveryCheckoutLayout.…ve_delivery_info.txt_menu");
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            textView.setText(context.getString(R.string.str_save_address_info));
            return;
        }
        View view5 = this.mDeliveryCheckoutLayout;
        if (view5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById4 = view5.findViewById(R.id.layout_save_delivery_info);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mDeliveryCheckoutLayout.layout_save_delivery_info");
        findViewById4.setVisibility(8);
    }

    private final void initBodyShippingMethod(Order order) {
        String str;
        View view = this.mDeliveryCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_delivery_address_info);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mDeliveryCheckoutLayout.…out_delivery_address_info");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_address);
        Intrinsics.checkNotNullExpressionValue(textView, "mDeliveryCheckoutLayout.…ss_info.txt_title_address");
        AddressSuggestion addressSuggestion = order.getAddressSuggestion();
        String str2 = null;
        String title = addressSuggestion != null ? addressSuggestion.getTitle() : null;
        if (title == null || title.length() == 0) {
            AddressSuggestion addressSuggestion2 = order.getAddressSuggestion();
            str = addressSuggestion2 != null ? addressSuggestion2.getTitleAddress() : null;
        } else {
            AddressSuggestion addressSuggestion3 = order.getAddressSuggestion();
            str = addressSuggestion3 != null ? addressSuggestion3.getTitle() : null;
        }
        textView.setText(str);
        View view2 = this.mDeliveryCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_delivery_address_info);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mDeliveryCheckoutLayout.…out_delivery_address_info");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_full_address);
        Intrinsics.checkNotNullExpressionValue(textView2, "mDeliveryCheckoutLayout.…ess_info.txt_full_address");
        AddressSuggestion addressSuggestion4 = order.getAddressSuggestion();
        if (addressSuggestion4 != null) {
            str2 = addressSuggestion4.getFullAddress();
        }
        textView2.setText(str2);
        View view3 = this.mDeliveryCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById3 = view3.findViewById(R.id.layout_delivery_address_info);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mDeliveryCheckoutLayout.…out_delivery_address_info");
        ContextExtsKt.setOnSafeClickListener$default(findViewById3, 0, new DeliveryCheckoutInteraction$initBodyShippingMethod$1(this), 1, null);
    }

    private final void initHeaderShippingMethod() {
        View view = this.mDeliveryCheckoutLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById = view.findViewById(R.id.layout_header_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mDeliveryCheckoutLayout.layout_header_delivery");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "mDeliveryCheckoutLayout.…_delivery.txt_option_name");
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        textView.setText(context.getString(R.string.str_delivery_method));
        View view2 = this.mDeliveryCheckoutLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById2 = view2.findViewById(R.id.layout_header_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "mDeliveryCheckoutLayout.layout_header_delivery");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "mDeliveryCheckoutLayout.…_delivery.txt_option_desc");
        textView2.setVisibility(8);
        View view3 = this.mDeliveryCheckoutLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById3 = view3.findViewById(R.id.layout_header_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "mDeliveryCheckoutLayout.layout_header_delivery");
        TLTextView tLTextView = (TLTextView) findViewById3.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "mDeliveryCheckoutLayout.…very.txt_option_must_have");
        Context context2 = this.mContext;
        if (context2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        tLTextView.setText(context2.getString(R.string.str_change));
        View view4 = this.mDeliveryCheckoutLayout;
        if (view4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mDeliveryCheckoutLayout");
        }
        View findViewById4 = view4.findViewById(R.id.layout_header_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "mDeliveryCheckoutLayout.layout_header_delivery");
        TLTextView tLTextView2 = (TLTextView) findViewById4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "mDeliveryCheckoutLayout.…very.txt_option_must_have");
        ContextExtsKt.setOnSafeClickListener$default(tLTextView2, 0, new DeliveryCheckoutInteraction$initHeaderShippingMethod$1(this), 1, null);
    }
}
