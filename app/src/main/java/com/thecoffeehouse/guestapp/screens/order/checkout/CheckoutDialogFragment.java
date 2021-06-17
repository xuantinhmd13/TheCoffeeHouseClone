package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.CheckoutEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.EditCartEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.LocationEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.screens.order.cart.FloatingCartInteraction;
import com.thecoffeehouse.guestapp.screens.order.checkout.PaymentMethodSelectionDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.checkout.ScheduleTimeBottomSheet;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.orders.Adjustment;
import com.thecoffeehouse.guestapp.services.api.model.orders.Day;
import com.thecoffeehouse.guestapp.services.api.model.orders.DayOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.OrderLineItemListView;
import com.thecoffeehouse.guestapp.views.TLButton;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class CheckoutDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private View inflatedView;
    private AtTableCheckoutInteraction mAtTableCheckoutInteraction;
    private DeliveryCheckoutInteraction mDeliveryCheckoutInteraction;
    private final Lazy mFloatingCartInteraction$delegate = LazyKt.lazy(CheckoutDialogFragment$mFloatingCartInteraction$2.INSTANCE);
    private Order mOrder;
    private PickUpCheckoutInteraction mPickUpCheckoutInteraction;
    private Function0<Unit> onChangeLocation = CheckoutDialogFragment$onChangeLocation$1.INSTANCE;
    private Function1<? super Payment, Unit> onChangePaymentMethod = CheckoutDialogFragment$onChangePaymentMethod$1.INSTANCE;
    private Function0<Unit> onChangeReceiverInfo = CheckoutDialogFragment$onChangeReceiverInfo$1.INSTANCE;
    private Function1<? super ScheduleTime, Unit> onChangeSchedulerTime = CheckoutDialogFragment$onChangeSchedulerTime$1.INSTANCE;
    private Function0<Unit> onChangeShippingMethod = CheckoutDialogFragment$onChangeShippingMethod$1.INSTANCE;
    private Function3<? super String, ? super String, ? super Boolean, Unit> onCreateOrder = CheckoutDialogFragment$onCreateOrder$1.INSTANCE;
    private Function0<Unit> onDeleteCart = CheckoutDialogFragment$onDeleteCart$1.INSTANCE;
    private Function0<Unit> onEditCoupon = CheckoutDialogFragment$onEditCoupon$1.INSTANCE;
    private Function2<? super OrderLine, ? super Integer, Unit> onOrderLineDelete = CheckoutDialogFragment$onOrderLineDelete$1.INSTANCE;
    private Function2<? super OrderLine, ? super Integer, Unit> onOrderLineEdit = CheckoutDialogFragment$onOrderLineEdit$1.INSTANCE;

    private final FloatingCartInteraction getMFloatingCartInteraction() {
        return (FloatingCartInteraction) this.mFloatingCartInteraction$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Order_Checkout;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.checkout_dialog;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CheckoutDialogFragment newInstance$default(Companion companion, Order order, Function0 function0, Function0 function02, Function0 function03, Function1 function1, Function1 function12, Function3 function3, Function2 function2, Function2 function22, Function0 function04, Function0 function05, int i, Object obj) {
            return companion.newInstance(order, (i & 2) != 0 ? CheckoutDialogFragment$Companion$newInstance$1.INSTANCE : function0, (i & 4) != 0 ? CheckoutDialogFragment$Companion$newInstance$2.INSTANCE : function02, (i & 8) != 0 ? CheckoutDialogFragment$Companion$newInstance$3.INSTANCE : function03, (i & 16) != 0 ? CheckoutDialogFragment$Companion$newInstance$4.INSTANCE : function1, (i & 32) != 0 ? CheckoutDialogFragment$Companion$newInstance$5.INSTANCE : function12, (i & 64) != 0 ? CheckoutDialogFragment$Companion$newInstance$6.INSTANCE : function3, function2, function22, function04, function05);
        }

        public final CheckoutDialogFragment newInstance(Order order, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function1<? super Payment, Unit> function1, Function1<? super ScheduleTime, Unit> function12, Function3<? super String, ? super String, ? super Boolean, Unit> function3, Function2<? super OrderLine, ? super Integer, Unit> function2, Function2<? super OrderLine, ? super Integer, Unit> function22, Function0<Unit> function04, Function0<Unit> function05) {
            Intrinsics.checkNotNullParameter(order, "mOrder");
            Intrinsics.checkNotNullParameter(function0, "onChangeShippingMethod");
            Intrinsics.checkNotNullParameter(function02, "onChangeLocation");
            Intrinsics.checkNotNullParameter(function03, "onChangeReceiverInfo");
            Intrinsics.checkNotNullParameter(function1, "onChangePaymentMethod");
            Intrinsics.checkNotNullParameter(function12, "onChangeSchedulerTime");
            Intrinsics.checkNotNullParameter(function3, "onCreateOrder");
            Intrinsics.checkNotNullParameter(function2, "onOrderLineEdit");
            Intrinsics.checkNotNullParameter(function22, "onOrderLineDelete");
            Intrinsics.checkNotNullParameter(function04, "onEditCoupon");
            Intrinsics.checkNotNullParameter(function05, "onDeleteCart");
            CheckoutDialogFragment checkoutDialogFragment = new CheckoutDialogFragment();
            checkoutDialogFragment.mOrder = order;
            checkoutDialogFragment.onChangeShippingMethod = function0;
            checkoutDialogFragment.onChangeReceiverInfo = function03;
            checkoutDialogFragment.onChangeLocation = function02;
            checkoutDialogFragment.onChangePaymentMethod = function1;
            checkoutDialogFragment.onChangeSchedulerTime = function12;
            checkoutDialogFragment.onCreateOrder = function3;
            checkoutDialogFragment.onOrderLineEdit = function2;
            checkoutDialogFragment.onOrderLineDelete = function22;
            checkoutDialogFragment.onEditCoupon = function04;
            checkoutDialogFragment.onDeleteCart = function05;
            return checkoutDialogFragment;
        }
    }

    public final String getNoteShipping() {
        EditText editText;
        View view = this.inflatedView;
        String stringOrEmpty = StringExtsKt.toStringOrEmpty(String.valueOf((view == null || (editText = (EditText) view.findViewById(R.id.edt_bill_note)) == null) ? null : editText.getText()));
        Objects.requireNonNull(stringOrEmpty, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.trim((CharSequence) stringOrEmpty).toString();
    }

    public final String getDeliveryShipping() {
        EditText editText;
        View view = this.inflatedView;
        String stringOrEmpty = StringExtsKt.toStringOrEmpty(String.valueOf((view == null || (editText = (EditText) view.findViewById(R.id.edt_shipping_note)) == null) ? null : editText.getText()));
        Objects.requireNonNull(stringOrEmpty, "null cannot be cast to non-null type kotlin.CharSequence");
        return StringsKt.trim((CharSequence) stringOrEmpty).toString();
    }

    public final Boolean getSaveConfirm() {
        View findViewById;
        Switch r0;
        View view = this.inflatedView;
        if (view == null || (findViewById = view.findViewById(R.id.layout_save_delivery_info)) == null || (r0 = (Switch) findViewById.findViewById(R.id.swt)) == null) {
            return null;
        }
        return Boolean.valueOf(r0.isChecked());
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        View rootView = getRootView();
        if (rootView != null) {
            initFloatingCart(rootView);
            updateOrder$default(this, this.mOrder, false, 2, null);
        }
    }

    private final void initFloatingCart(View view) {
        TLButton tLButton;
        View findViewById = view.findViewById(R.id.layout_floating_cart);
        if (!(findViewById instanceof CardView)) {
            findViewById = null;
        }
        CardView cardView = (CardView) findViewById;
        if (cardView != null) {
            cardView.setRadius(0.0f);
        }
        View findViewById2 = view.findViewById(R.id.layout_floating_cart);
        if (!(findViewById2 == null || (tLButton = (TLButton) findViewById2.findViewById(R.id.btn_add_to_cart)) == null)) {
            tLButton.setText(getString(R.string.str_checkout));
        }
        FloatingCartInteraction mFloatingCartInteraction = getMFloatingCartInteraction();
        View findViewById3 = view.findViewById(R.id.layout_floating_cart);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "it.layout_floating_cart");
        mFloatingCartInteraction.initView(findViewById3);
    }

    private final void initCartItems(View view) {
        OrderLineItemListView orderLineItemListView;
        OrderLineItemListView orderLineItemListView2;
        OrderLineItemListView orderLineItemListView3;
        OrderLineItemListView orderLineItemListView4;
        Order order = this.mOrder;
        if (order != null) {
            View rootView = getRootView();
            if (!(rootView == null || (orderLineItemListView4 = (OrderLineItemListView) rootView.findViewById(R.id.layout_checkout_item_list)) == null)) {
                orderLineItemListView4.setEditableNote(true);
            }
            View rootView2 = getRootView();
            if (!(rootView2 == null || (orderLineItemListView3 = (OrderLineItemListView) rootView2.findViewById(R.id.layout_checkout_item_list)) == null)) {
                orderLineItemListView3.updateNote(order.getNote());
            }
            View rootView3 = getRootView();
            if (!(rootView3 == null || (orderLineItemListView2 = (OrderLineItemListView) rootView3.findViewById(R.id.layout_checkout_item_list)) == null)) {
                orderLineItemListView2.initCartOrderLines(order.getOrderLines());
            }
            View rootView4 = getRootView();
            if (!(rootView4 == null || (orderLineItemListView = (OrderLineItemListView) rootView4.findViewById(R.id.layout_checkout_item_list)) == null)) {
                orderLineItemListView.setOnClickOrderLineEdit(this.onOrderLineEdit);
                orderLineItemListView.setOnClickOrderLineDelete(this.onOrderLineDelete);
            }
            initCalculateLayout(view);
            TrackingEventService.Companion.collectParamWithEventName(EditCartEvents.EventViewCart.name, new TrackingData("qtyItemsInCart", Integer.valueOf(FloatingCartInteraction.Companion.calculateTotalItemsInCart(order.getOrderLines()))), new TrackingData("qtyItemsInCart", order.getTotal()), new TrackingData("currentShipping", ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(order.getShippingType())));
        }
    }

    private final void initCalculateLayout(View view) {
        T t;
        ArrayList<Adjustment> adjustments;
        T t2;
        ArrayList<Adjustment> adjustments2;
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_calculate_order);
        linearLayout.removeAllViews();
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.layout_total_header);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "layoutTotalHeader");
        LinearLayout linearLayout3 = linearLayout2;
        TextView textView = (TextView) linearLayout3.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutTotalHeader.txt_option_name");
        textView.setText(getString(R.string.str_total));
        TextView textView2 = (TextView) linearLayout3.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutTotalHeader.txt_option_desc");
        textView2.setVisibility(8);
        TLTextView tLTextView = (TLTextView) linearLayout3.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutTotalHeader.txt_option_must_have");
        tLTextView.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "layoutCalculateOrder");
        LinearLayout linearLayout4 = linearLayout;
        String string = getString(R.string.str_total);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_total)");
        Order order = this.mOrder;
        Integer num = null;
        setCalculateItem(linearLayout4, string, order != null ? order.getTotal() : null);
        Order order2 = this.mOrder;
        if (!(order2 == null || (adjustments2 = order2.getAdjustments()) == null)) {
            Iterator<Adjustment> it = adjustments2.iterator();
            while (it.hasNext()) {
                Adjustment next = it.next();
                if (!Intrinsics.areEqual(next.getId(), FirebaseAnalytics.Param.COUPON)) {
                    setCalculateItem(view, String.valueOf(next.getName()), next.getPrice());
                }
            }
        }
        Order order3 = this.mOrder;
        if (order3 == null || (adjustments = order3.getAdjustments()) == null) {
            t = null;
        } else {
            Iterator<T> it2 = adjustments.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    t2 = null;
                    break;
                }
                t2 = it2.next();
                if (Intrinsics.areEqual(t2.getId(), FirebaseAnalytics.Param.COUPON)) {
                    break;
                }
            }
            t = t2;
        }
        setCalculateDiscountItem(linearLayout, t);
        Order order4 = this.mOrder;
        if (order4 != null) {
            num = order4.getAfterDiscount();
        }
        setCalculatePayAfterDiscountItem(linearLayout, num);
    }

    private final void setCalculatePayAfterDiscountItem(LinearLayout linearLayout, Integer num) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(textView, "title");
        String string = getString(R.string.str_pay_amount);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_pay_amount)");
        Integer valueOf = Integer.valueOf((int) R.dimen._16sp);
        Integer valueOf2 = Integer.valueOf((int) R.color.colorBlack);
        Integer valueOf3 = Integer.valueOf((int) R.font.sfpd_bold);
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(string, valueOf, valueOf2, valueOf3));
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_price_amount);
        Intrinsics.checkNotNullExpressionValue(textView2, "amount");
        TLTextViewKt.setTextMultipleFonts(textView2, new TextViewAttribute(OrderExtsKt.formatVND(num), valueOf, valueOf2, valueOf3));
        View findViewById = inflate.findViewById(R.id.view_line_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layoutCalculateOrderItem…>(R.id.view_line_divider)");
        findViewById.setVisibility(8);
        linearLayout.addView(inflate);
    }

    private final void setCalculateDiscountItem(LinearLayout linearLayout, Adjustment adjustment) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
        String str = "";
        Integer valueOf = Integer.valueOf((int) R.color.color2D72D2);
        Integer valueOf2 = Integer.valueOf((int) R.dimen._16sp);
        Integer valueOf3 = Integer.valueOf((int) R.font.sfpd_regular);
        if (adjustment != null) {
            View findViewById = inflate.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(findViewById, "layoutCalculateOrderItem…ew>(R.id.txt_title_price)");
            TextView textView = (TextView) findViewById;
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
            textViewAttributeArr[0] = new TextViewAttribute(getString(R.string.str_promotion) + "\n", valueOf2, valueOf, valueOf3);
            String name = adjustment.getName();
            if (name != null) {
                str = name;
            }
            textViewAttributeArr[1] = new TextViewAttribute(str, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.color838387), valueOf3);
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            View findViewById2 = inflate.findViewById(R.id.txt_price_amount);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "layoutCalculateOrderItem…w>(R.id.txt_price_amount)");
            ViewExtsKt.formatHtmlCompact((TextView) findViewById2, adjustment.getPriceStr());
            ((TextView) inflate.findViewById(R.id.txt_price_amount)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            View findViewById3 = inflate.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "layoutCalculateOrderItem…ew>(R.id.txt_title_price)");
            String string = getString(R.string.str_select_promotion);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_select_promotion)");
            TLTextViewKt.setTextMultipleFonts((TextView) findViewById3, new TextViewAttribute(string, valueOf2, valueOf, valueOf3));
            View findViewById4 = inflate.findViewById(R.id.txt_price_amount);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "layoutCalculateOrderItem…w>(R.id.txt_price_amount)");
            ((TextView) findViewById4).setText(str);
            ((TextView) inflate.findViewById(R.id.txt_price_amount)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(requireContext(), R.drawable.ic_arrow_right), (Drawable) null);
        }
        Intrinsics.checkNotNullExpressionValue(inflate, "layoutCalculateOrderItem");
        ContextExtsKt.setOnSafeClickListener$default(inflate, 0, new CheckoutDialogFragment$setCalculateDiscountItem$1(this), 1, null);
        linearLayout.addView(inflate);
    }

    private final void setCalculateItem(View view, String str, Integer num) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layoutCalculateOrderItem…ew>(R.id.txt_title_price)");
        ((TextView) findViewById).setText(str);
        View findViewById2 = inflate.findViewById(R.id.txt_price_amount);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "layoutCalculateOrderItem…w>(R.id.txt_price_amount)");
        ((TextView) findViewById2).setText(OrderExtsKt.formatVND(num));
        ((LinearLayout) view.findViewById(R.id.layout_calculate_order)).addView(inflate);
    }

    private final void initHeaderItemsInCart(View view) {
        View findViewById = view.findViewById(R.id.layout_selected_items);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.layout_selected_items");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "view.layout_selected_items.txt_option_name");
        textView.setText(getString(R.string.str_selected_items));
        View findViewById2 = view.findViewById(R.id.layout_selected_items);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.layout_selected_items");
        TextView textView2 = (TextView) findViewById2.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "view.layout_selected_items.txt_option_desc");
        textView2.setVisibility(8);
        View findViewById3 = view.findViewById(R.id.layout_selected_items);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.layout_selected_items");
        TLTextView tLTextView = (TLTextView) findViewById3.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "view.layout_selected_items.txt_option_must_have");
        tLTextView.setText(getString(R.string.str_add_product));
        View findViewById4 = view.findViewById(R.id.layout_selected_items);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.layout_selected_items");
        ((TLTextView) findViewById4.findViewById(R.id.txt_option_must_have)).setOnClickListener(new CheckoutDialogFragment$initHeaderItemsInCart$1(this));
        View findViewById5 = view.findViewById(R.id.layout_selected_items);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.layout_selected_items");
        TLTextView tLTextView2 = (TLTextView) findViewById5.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "view.layout_selected_items.txt_option_must_have");
        ViewGroup.LayoutParams layoutParams = tLTextView2.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).addRule(15);
    }

    private final void initLayoutDelivery() {
        NestedScrollView nestedScrollView;
        NestedScrollView nestedScrollView2;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_delivery_checkout, (ViewGroup) null, false);
        this.inflatedView = inflate;
        if (inflate != null) {
            DeliveryCheckoutInteraction deliveryCheckoutInteraction = new DeliveryCheckoutInteraction();
            this.mDeliveryCheckoutInteraction = deliveryCheckoutInteraction;
            Intrinsics.checkNotNull(deliveryCheckoutInteraction);
            deliveryCheckoutInteraction.initView(inflate);
            View rootView = getRootView();
            if (!(rootView == null || (nestedScrollView2 = (NestedScrollView) rootView.findViewById(R.id.layout_checkout)) == null)) {
                nestedScrollView2.removeAllViews();
            }
            View rootView2 = getRootView();
            if (!(rootView2 == null || (nestedScrollView = (NestedScrollView) rootView2.findViewById(R.id.layout_checkout)) == null)) {
                nestedScrollView.addView(inflate);
            }
            initHeaderItemsInCart(inflate);
            initNotesAndSaveConfirmCheckout();
            initCartItems(inflate);
            initViewDeliveryInfo();
            initViewDeliveryListenViews();
        }
    }

    private final void initNotesAndSaveConfirmCheckout() {
        View findViewById;
        Switch r0;
        View findViewById2;
        Switch r02;
        Boolean switchSaveAddress;
        EditText editText;
        AddressSuggestion addressSuggestion;
        AddressSuggestion addressSuggestion2;
        AddressSuggestion addressSuggestion3;
        Order order = this.mOrder;
        String str = null;
        GeneralKt.log((order == null || (addressSuggestion3 = order.getAddressSuggestion()) == null) ? null : addressSuggestion3.getNote());
        Order order2 = this.mOrder;
        GeneralKt.log(StringExtsKt.toStringOrEmpty((order2 == null || (addressSuggestion2 = order2.getAddressSuggestion()) == null) ? null : addressSuggestion2.getNote()));
        View view = this.inflatedView;
        if (!(view == null || (editText = (EditText) view.findViewById(R.id.edt_shipping_note)) == null)) {
            Order order3 = this.mOrder;
            if (!(order3 == null || (addressSuggestion = order3.getAddressSuggestion()) == null)) {
                str = addressSuggestion.getNote();
            }
            editText.setText(StringExtsKt.toStringOrEmpty(str));
        }
        View view2 = this.inflatedView;
        if (!(view2 == null || (findViewById2 = view2.findViewById(R.id.layout_save_delivery_info)) == null || (r02 = (Switch) findViewById2.findViewById(R.id.swt)) == null)) {
            Order order4 = this.mOrder;
            r02.setChecked((order4 == null || (switchSaveAddress = order4.getSwitchSaveAddress()) == null) ? false : switchSaveAddress.booleanValue());
        }
        View view3 = this.inflatedView;
        if (view3 != null && (findViewById = view3.findViewById(R.id.layout_save_delivery_info)) != null && (r0 = (Switch) findViewById.findViewById(R.id.swt)) != null) {
            r0.setOnCheckedChangeListener(new CheckoutDialogFragment$initNotesAndSaveConfirmCheckout$1(this));
        }
    }

    /* access modifiers changed from: public */
    private final void sendEventTrackingSavedAddressButtonTurn() {
        TrackingEventService.Companion.updateSourceTrackingEvent(LocationEvents.EventSaveAddressButtonTurned.name, "CheckOut");
        TrackingEventService.Companion.triggerSendTrackingEvent(LocationEvents.EventSaveAddressButtonTurned.name);
    }

    private final void initLayoutPickUp() {
        NestedScrollView nestedScrollView;
        NestedScrollView nestedScrollView2;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_pickup_checkout, (ViewGroup) null, false);
        this.inflatedView = inflate;
        if (inflate != null) {
            ViewExtsKt.marginTop(inflate, ViewExtsKt.DPtoPX(16.0f));
            PickUpCheckoutInteraction pickUpCheckoutInteraction = new PickUpCheckoutInteraction();
            this.mPickUpCheckoutInteraction = pickUpCheckoutInteraction;
            Intrinsics.checkNotNull(pickUpCheckoutInteraction);
            pickUpCheckoutInteraction.initView(inflate);
            View rootView = getRootView();
            if (!(rootView == null || (nestedScrollView2 = (NestedScrollView) rootView.findViewById(R.id.layout_checkout)) == null)) {
                nestedScrollView2.removeAllViews();
            }
            View rootView2 = getRootView();
            if (!(rootView2 == null || (nestedScrollView = (NestedScrollView) rootView2.findViewById(R.id.layout_checkout)) == null)) {
                nestedScrollView.addView(inflate);
            }
            initHeaderItemsInCart(inflate);
            initCartItems(inflate);
            initViewPickUpInfo();
            initViewPickUpListenViews();
            initNotesAndSaveConfirmCheckout();
        }
    }

    private final void initToolbar() {
        View findViewById;
        View rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.toolbar)) != null) {
            TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_title_sub_screen");
            textView.setText(getString(R.string.str_confirm_checkout));
            ((ImageView) findViewById.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_close_bottom_sheet);
            ImageView imageView = (ImageView) findViewById.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView, "img_right_icon");
            imageView.setVisibility(0);
            ((ImageView) findViewById.findViewById(R.id.img_right_icon)).setOnClickListener(new CheckoutDialogFragment$initToolbar$$inlined$apply$lambda$1(this));
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TrackingEventService.Companion.updateSourceTrackingEvent(ShippingMethodEvents.EventChangeShipping.name, "Checkout - Change Method");
        TrackingEventService.Companion.triggerSendTrackingEvent(CheckoutEvents.EventStartCheckout.name);
    }

    private final void initViewPickUpListenViews() {
        PickUpCheckoutInteraction pickUpCheckoutInteraction = this.mPickUpCheckoutInteraction;
        if (pickUpCheckoutInteraction != null) {
            pickUpCheckoutInteraction.setOnChangeShippingMethod(new CheckoutDialogFragment$initViewPickUpListenViews$1(this));
        }
        PickUpCheckoutInteraction pickUpCheckoutInteraction2 = this.mPickUpCheckoutInteraction;
        if (pickUpCheckoutInteraction2 != null) {
            pickUpCheckoutInteraction2.setOnChangePaymentMethod(new CheckoutDialogFragment$initViewPickUpListenViews$2(this));
        }
        PickUpCheckoutInteraction pickUpCheckoutInteraction3 = this.mPickUpCheckoutInteraction;
        if (pickUpCheckoutInteraction3 != null) {
            pickUpCheckoutInteraction3.setOnChangeLocation(new CheckoutDialogFragment$initViewPickUpListenViews$3(this));
        }
        PickUpCheckoutInteraction pickUpCheckoutInteraction4 = this.mPickUpCheckoutInteraction;
        if (pickUpCheckoutInteraction4 != null) {
            pickUpCheckoutInteraction4.setOnChangeSchedulerTime(new CheckoutDialogFragment$initViewPickUpListenViews$4(this));
        }
        getMFloatingCartInteraction().setSetOnClickButtonActionListener(new CheckoutDialogFragment$initViewPickUpListenViews$5(this));
    }

    private final void initViewAtTableListenViews() {
        AtTableCheckoutInteraction atTableCheckoutInteraction = this.mAtTableCheckoutInteraction;
        if (atTableCheckoutInteraction != null) {
            atTableCheckoutInteraction.setOnChangeShippingMethod(new CheckoutDialogFragment$initViewAtTableListenViews$1(this));
        }
        AtTableCheckoutInteraction atTableCheckoutInteraction2 = this.mAtTableCheckoutInteraction;
        if (atTableCheckoutInteraction2 != null) {
            atTableCheckoutInteraction2.setOnChangePaymentMethod(new CheckoutDialogFragment$initViewAtTableListenViews$2(this));
        }
        AtTableCheckoutInteraction atTableCheckoutInteraction3 = this.mAtTableCheckoutInteraction;
        if (atTableCheckoutInteraction3 != null) {
            atTableCheckoutInteraction3.setOnChangeLocation(new CheckoutDialogFragment$initViewAtTableListenViews$3(this));
        }
        getMFloatingCartInteraction().setSetOnClickButtonActionListener(new CheckoutDialogFragment$initViewAtTableListenViews$4(this));
    }

    private final void initViewDeliveryListenViews() {
        DeliveryCheckoutInteraction deliveryCheckoutInteraction = this.mDeliveryCheckoutInteraction;
        if (deliveryCheckoutInteraction != null) {
            deliveryCheckoutInteraction.setOnChangeLocation(new CheckoutDialogFragment$initViewDeliveryListenViews$1(this));
        }
        DeliveryCheckoutInteraction deliveryCheckoutInteraction2 = this.mDeliveryCheckoutInteraction;
        if (deliveryCheckoutInteraction2 != null) {
            deliveryCheckoutInteraction2.setOnChangePaymentMethod(new CheckoutDialogFragment$initViewDeliveryListenViews$2(this));
        }
        DeliveryCheckoutInteraction deliveryCheckoutInteraction3 = this.mDeliveryCheckoutInteraction;
        if (deliveryCheckoutInteraction3 != null) {
            deliveryCheckoutInteraction3.setOnChangeShippingMethod(new CheckoutDialogFragment$initViewDeliveryListenViews$3(this));
        }
        DeliveryCheckoutInteraction deliveryCheckoutInteraction4 = this.mDeliveryCheckoutInteraction;
        if (deliveryCheckoutInteraction4 != null) {
            deliveryCheckoutInteraction4.setOnChangeSchedulerTime(new CheckoutDialogFragment$initViewDeliveryListenViews$4(this));
        }
        DeliveryCheckoutInteraction deliveryCheckoutInteraction5 = this.mDeliveryCheckoutInteraction;
        if (deliveryCheckoutInteraction5 != null) {
            deliveryCheckoutInteraction5.setOnChangeReceiverInfo(new CheckoutDialogFragment$initViewDeliveryListenViews$5(this));
        }
        getMFloatingCartInteraction().setSetOnClickButtonActionListener(new CheckoutDialogFragment$initViewDeliveryListenViews$6(this));
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void showLoading() {
        View findViewById;
        ProgressBar progressBar;
        View findViewById2;
        TLButton tLButton;
        FrameLayout frameLayout;
        View rootView = getRootView();
        if (!(rootView == null || (frameLayout = (FrameLayout) rootView.findViewById(R.id.loading_layout)) == null)) {
            frameLayout.setVisibility(0);
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById2 = rootView2.findViewById(R.id.layout_floating_cart)) == null || (tLButton = (TLButton) findViewById2.findViewById(R.id.btn_add_to_cart)) == null)) {
            tLButton.setVisibility(4);
        }
        View rootView3 = getRootView();
        if (rootView3 != null && (findViewById = rootView3.findViewById(R.id.layout_floating_cart)) != null && (progressBar = (ProgressBar) findViewById.findViewById(R.id.progress_bar_loading)) != null) {
            progressBar.setVisibility(0);
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void hideLoading() {
        View findViewById;
        ProgressBar progressBar;
        View findViewById2;
        TLButton tLButton;
        FrameLayout frameLayout;
        View rootView = getRootView();
        if (!(rootView == null || (frameLayout = (FrameLayout) rootView.findViewById(R.id.loading_layout)) == null)) {
            frameLayout.setVisibility(8);
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById2 = rootView2.findViewById(R.id.layout_floating_cart)) == null || (tLButton = (TLButton) findViewById2.findViewById(R.id.btn_add_to_cart)) == null)) {
            tLButton.setVisibility(0);
        }
        View rootView3 = getRootView();
        if (rootView3 != null && (findViewById = rootView3.findViewById(R.id.layout_floating_cart)) != null && (progressBar = (ProgressBar) findViewById.findViewById(R.id.progress_bar_loading)) != null) {
            progressBar.setVisibility(4);
        }
    }

    /* access modifiers changed from: public */
    private final void showChangePaymentMethodDialog() {
        ArrayList<Payment> payments;
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        ShippingMethodEvents shippingMethodEvents = ShippingMethodEvents.INSTANCE;
        Order order = this.mOrder;
        trackingDataArr[0] = new TrackingData("currentShippingMethod", shippingMethodEvents.standardizeShippingMethodValue(order != null ? order.getShippingType() : null));
        companion.collectParamWithEventName(CheckoutEvents.EventPaymentMethodChangedSuccessfully.name, trackingDataArr);
        TrackingEventService.Companion companion2 = TrackingEventService.Companion;
        TrackingData[] trackingDataArr2 = new TrackingData[1];
        ShippingMethodEvents shippingMethodEvents2 = ShippingMethodEvents.INSTANCE;
        Order order2 = this.mOrder;
        trackingDataArr2[0] = new TrackingData("shippingMethod", shippingMethodEvents2.standardizeShippingMethodValue(order2 != null ? order2.getShippingType() : null));
        companion2.collectParamWithEventName(CheckoutEvents.EventRequestCheckout.name, trackingDataArr2);
        PaymentMethodSelectionDialogFragment.Companion companion3 = PaymentMethodSelectionDialogFragment.Companion;
        Order order3 = this.mOrder;
        PaymentMethodSelectionDialogFragment newInstance = companion3.newInstance((order3 == null || (payments = order3.getPayments()) == null) ? null : (Payment) CollectionsKt.firstOrNull((List) payments), new CheckoutDialogFragment$showChangePaymentMethodDialog$paymentMethodSelectionDialog$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    public static /* synthetic */ void updateOrder$default(CheckoutDialogFragment checkoutDialogFragment, Order order, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            order = null;
        }
        if ((i & 2) != 0) {
            z = false;
        }
        checkoutDialogFragment.updateOrder(order, z);
    }

    public final void updateOrder(Order order, boolean z) {
        ArrayList<OrderLine> orderLines;
        if (getContext() != null) {
            this.mOrder = order;
            if (order == null || (orderLines = order.getOrderLines()) == null || !orderLines.isEmpty()) {
                Order order2 = this.mOrder;
                String shippingType = order2 != null ? order2.getShippingType() : null;
                if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP())) {
                    initLayoutPickUp();
                } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
                    initLayoutDelivery();
                } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
                    initLayoutAtTable();
                }
                initFloatingCart();
                initDeleteCart();
                if (z) {
                    checkScrollIfPaymentEmpty();
                }
                trackingCheckoutDialog();
                return;
            }
            dismiss();
        }
    }

    private final void initLayoutAtTable() {
        NestedScrollView nestedScrollView;
        NestedScrollView nestedScrollView2;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_at_table_checkout, (ViewGroup) null, false);
        this.inflatedView = inflate;
        if (inflate != null) {
            AtTableCheckoutInteraction atTableCheckoutInteraction = new AtTableCheckoutInteraction();
            this.mAtTableCheckoutInteraction = atTableCheckoutInteraction;
            Intrinsics.checkNotNull(atTableCheckoutInteraction);
            atTableCheckoutInteraction.initView(inflate);
            View rootView = getRootView();
            if (!(rootView == null || (nestedScrollView2 = (NestedScrollView) rootView.findViewById(R.id.layout_checkout)) == null)) {
                nestedScrollView2.removeAllViews();
            }
            View rootView2 = getRootView();
            if (!(rootView2 == null || (nestedScrollView = (NestedScrollView) rootView2.findViewById(R.id.layout_checkout)) == null)) {
                nestedScrollView.addView(inflate);
            }
            initViewTableInfo();
            initHeaderItemsInCart(inflate);
            initNotesAndSaveConfirmCheckout();
            initCartItems(inflate);
            initViewAtTableListenViews();
        }
    }

    private final void initViewTableInfo() {
        AtTableCheckoutInteraction atTableCheckoutInteraction = this.mAtTableCheckoutInteraction;
        if (atTableCheckoutInteraction != null) {
            atTableCheckoutInteraction.updateCheckoutOrder(this.mOrder);
        }
    }

    private final void initFloatingCart() {
        FloatingCartInteraction.updateCart$default(getMFloatingCartInteraction(), this.mOrder, false, formatTitleFloatingCartCheckout(), 2, null);
    }

    private final void initDeleteCart() {
        TextView textView;
        View view = this.inflatedView;
        if (view != null && (textView = (TextView) view.findViewById(R.id.txt_delete_cart)) != null) {
            textView.setOnClickListener(new CheckoutDialogFragment$initDeleteCart$1(this));
        }
    }

    /* access modifiers changed from: public */
    private final void checkScrollIfPaymentEmpty() {
        ArrayList<Payment> payments;
        View rootView;
        NestedScrollView nestedScrollView;
        Order order = this.mOrder;
        if (order != null && (payments = order.getPayments()) != null) {
            ArrayList<Payment> arrayList = payments;
            if ((arrayList == null || arrayList.isEmpty()) && (rootView = getRootView()) != null && (nestedScrollView = (NestedScrollView) rootView.findViewById(R.id.layout_checkout)) != null) {
                nestedScrollView.post(new CheckoutDialogFragment$checkScrollIfPaymentEmpty$1(this));
            }
        }
    }

    private final void trackingCheckoutDialog() {
        Boolean bool;
        String note;
        Order order = this.mOrder;
        if (order != null) {
            TrackingEventService.Companion.updateSourceTrackingEvent(CheckoutEvents.EventStartCheckout.name, "source");
            TrackingEventService.Companion companion = TrackingEventService.Companion;
            TrackingData[] trackingDataArr = new TrackingData[6];
            boolean z = false;
            trackingDataArr[0] = new TrackingData("qtyItemsInCart", Integer.valueOf(FloatingCartInteraction.Companion.calculateTotalItemsInCart(order.getOrderLines())));
            trackingDataArr[1] = new TrackingData("cartValue", order.getTotal());
            trackingDataArr[2] = new TrackingData("shippingMethod", ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(order.getShippingType()));
            String couponCode = order.getCouponCode();
            trackingDataArr[3] = new TrackingData("isVoucherApplied", Boolean.valueOf(!(couponCode == null || couponCode.length() == 0)));
            Payment payment = (Payment) CollectionsKt.firstOrNull((List) order.getPayments());
            trackingDataArr[4] = new TrackingData(CheckoutEvents.EventStartCheckout.Param.defaultPaymentMethod, payment != null ? payment.getMethod() : null);
            AddressSuggestion addressSuggestion = order.getAddressSuggestion();
            if (addressSuggestion == null || (note = addressSuggestion.getNote()) == null) {
                bool = null;
            } else {
                bool = Boolean.valueOf(note.length() > 0);
            }
            trackingDataArr[5] = new TrackingData("isNoted", bool);
            companion.collectParamWithEventName(CheckoutEvents.EventStartCheckout.name, trackingDataArr);
            TrackingEventService.Companion companion2 = TrackingEventService.Companion;
            TrackingData[] trackingDataArr2 = new TrackingData[5];
            trackingDataArr2[0] = new TrackingData("qtyItemsInCart", Integer.valueOf(FloatingCartInteraction.Companion.calculateTotalItemsInCart(order.getOrderLines())));
            trackingDataArr2[1] = new TrackingData("cartValue", order.getTotal());
            trackingDataArr2[2] = new TrackingData("shippingMethod", ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(order.getShippingType()));
            String couponCode2 = order.getCouponCode();
            trackingDataArr2[3] = new TrackingData("isVoucherApplied", Boolean.valueOf(!(couponCode2 == null || couponCode2.length() == 0)));
            Payment payment2 = (Payment) CollectionsKt.firstOrNull((List) order.getPayments());
            trackingDataArr2[4] = new TrackingData("paymentMethod", payment2 != null ? payment2.getMethod() : null);
            companion2.collectParamWithEventName(CheckoutEvents.EventRequestCheckout.name, trackingDataArr2);
            TrackingEventService.Companion companion3 = TrackingEventService.Companion;
            TrackingData[] trackingDataArr3 = new TrackingData[5];
            trackingDataArr3[0] = new TrackingData("qtyItemsInCart", Integer.valueOf(FloatingCartInteraction.Companion.calculateTotalItemsInCart(order.getOrderLines())));
            trackingDataArr3[1] = new TrackingData("cartValue", order.getTotal());
            trackingDataArr3[2] = new TrackingData("shippingMethod", ShippingMethodEvents.INSTANCE.standardizeShippingMethodValue(order.getShippingType()));
            String couponCode3 = order.getCouponCode();
            if (couponCode3 == null || couponCode3.length() == 0) {
                z = true;
            }
            trackingDataArr3[3] = new TrackingData("isVoucherApplied", Boolean.valueOf(!z));
            Payment payment3 = (Payment) CollectionsKt.firstOrNull((List) order.getPayments());
            trackingDataArr3[4] = new TrackingData("paymentMethod", payment3 != null ? payment3.getMethod() : null);
            companion3.collectParamWithEventName(CheckoutEvents.EventRequestCheckout.name, trackingDataArr3);
        }
    }

    private final void initViewPickUpInfo() {
        PickUpCheckoutInteraction pickUpCheckoutInteraction = this.mPickUpCheckoutInteraction;
        if (pickUpCheckoutInteraction != null) {
            pickUpCheckoutInteraction.updateCheckoutOrder(this.mOrder);
        }
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.getMyAddress(new CheckoutDialogFragment$initViewPickUpInfo$1(this));
        }
    }

    private final void initViewDeliveryInfo() {
        DeliveryCheckoutInteraction deliveryCheckoutInteraction = this.mDeliveryCheckoutInteraction;
        if (deliveryCheckoutInteraction != null) {
            deliveryCheckoutInteraction.updateCheckoutOrder(this.mOrder);
        }
    }

    private final String formatTitleFloatingCartCheckout() {
        Order order = this.mOrder;
        ArrayList<OrderLine> arrayList = null;
        String shippingType = order != null ? order.getShippingType() : null;
        if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
            StringBuilder append = new StringBuilder().append(getString(R.string.str_delivery) + " • ");
            Object[] objArr = new Object[1];
            FloatingCartInteraction.Companion companion = FloatingCartInteraction.Companion;
            Order order2 = this.mOrder;
            if (order2 != null) {
                arrayList = order2.getOrderLines();
            }
            ArrayList<OrderLine> arrayList2 = arrayList;
            if (arrayList2 == null) {
                arrayList2 = CollectionsKt.emptyList();
            }
            Objects.requireNonNull(arrayList2, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> */");
            objArr[0] = Integer.valueOf(companion.calculateTotalItemsInCart((ArrayList) arrayList2));
            return append.append(getString(R.string.str_no_of_items, objArr)).toString();
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP())) {
            StringBuilder append2 = new StringBuilder().append(getString(R.string.str_pick_up) + " • ");
            Object[] objArr2 = new Object[1];
            FloatingCartInteraction.Companion companion2 = FloatingCartInteraction.Companion;
            Order order3 = this.mOrder;
            if (order3 != null) {
                arrayList = order3.getOrderLines();
            }
            ArrayList<OrderLine> arrayList3 = arrayList;
            if (arrayList3 == null) {
                arrayList3 = CollectionsKt.emptyList();
            }
            Objects.requireNonNull(arrayList3, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> */");
            objArr2[0] = Integer.valueOf(companion2.calculateTotalItemsInCart((ArrayList) arrayList3));
            return append2.append(getString(R.string.str_no_of_items, objArr2)).toString();
        } else if (!Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
            return "";
        } else {
            StringBuilder append3 = new StringBuilder().append(getString(R.string.str_at_table) + " • ");
            Object[] objArr3 = new Object[1];
            FloatingCartInteraction.Companion companion3 = FloatingCartInteraction.Companion;
            Order order4 = this.mOrder;
            if (order4 != null) {
                arrayList = order4.getOrderLines();
            }
            ArrayList<OrderLine> arrayList4 = arrayList;
            if (arrayList4 == null) {
                arrayList4 = CollectionsKt.emptyList();
            }
            Objects.requireNonNull(arrayList4, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine> */");
            objArr3[0] = Integer.valueOf(companion3.calculateTotalItemsInCart((ArrayList) arrayList4));
            return append3.append(getString(R.string.str_no_of_items, objArr3)).toString();
        }
    }

    public final void showScheduleTimeBottomSheet(ArrayList<DayOrder> arrayList) {
        ScheduleTime scheduleTime;
        ScheduleTime scheduleTime2;
        Intrinsics.checkNotNullParameter(arrayList, "scheduleOrderTime");
        ScheduleTimeBottomSheet.Companion companion = ScheduleTimeBottomSheet.Companion;
        Order order = this.mOrder;
        Day day = (order == null || (scheduleTime2 = order.getScheduleTime()) == null) ? null : scheduleTime2.getDay();
        Order order2 = this.mOrder;
        ScheduleTimeBottomSheet newInstance = companion.newInstance(new Pair<>(day, (order2 == null || (scheduleTime = order2.getScheduleTime()) == null) ? null : scheduleTime.getTime()), arrayList, new CheckoutDialogFragment$showScheduleTimeBottomSheet$scheduleBottomSheet$1(this));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            newInstance.show(activity.getSupportFragmentManager(), (String) null);
        }
    }
}
