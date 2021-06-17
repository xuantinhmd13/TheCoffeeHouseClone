package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.DeliveryInfo;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\b\u0010\u0012\u001a\u00020\u0010H\u0002J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\b\u0010\u0015\u001a\u00020\u0010H\u0002J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\u0017\u0010\u0017\u001a\u00020\u00102\b\u0010\u0018\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0002\u0010\u0019J\b\u0010\u001a\u001a\u00020\u0010H\u0002J\u000e\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\fR\u000e\u0010\u000b\u001a\u00020\fX.¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderInfoView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "orderProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "hasBeanReward", "", "hideLayoutPickupCode", "", "initCustomerInfo", "initDeliveryInfo", "initOrderRef", "initPaymentStatus", "initPickupInfo", "initTableInfo", "setEstimateBean", "etaBean", "(Ljava/lang/Integer;)V", "showLayoutPickupCode", "updateData", "order", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingOrderInfoView.kt */
public final class TrackingOrderInfoView extends FrameLayout {
    private HashMap _$_findViewCache;
    private OrderProcessing orderProcessing;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderInfoView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_info_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderInfoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_info_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderInfoView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_info_view, (ViewGroup) this, true);
    }

    public final void updateData(OrderProcessing orderProcessing2) {
        Intrinsics.checkNotNullParameter(orderProcessing2, "order");
        this.orderProcessing = orderProcessing2;
        initCustomerInfo();
    }

    private final void initCustomerInfo() {
        Phone phone;
        if (hasBeanReward()) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_reward_bean);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_reward_bean");
            textView.setVisibility(0);
            OrderProcessing orderProcessing2 = this.orderProcessing;
            if (orderProcessing2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
            }
            setEstimateBean(orderProcessing2.getEtaBean());
        } else {
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_reward_bean);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_reward_bean");
            textView2.setVisibility(8);
        }
        OrderProcessing orderProcessing3 = this.orderProcessing;
        if (orderProcessing3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        DeliveryInfo customerInfo = orderProcessing3.getCustomerInfo();
        String str = null;
        String name = customerInfo != null ? customerInfo.getName() : null;
        OrderProcessing orderProcessing4 = this.orderProcessing;
        if (orderProcessing4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        DeliveryInfo customerInfo2 = orderProcessing4.getCustomerInfo();
        if (!(customerInfo2 == null || (phone = customerInfo2.getPhone()) == null)) {
            str = phone.getPhoneNumber();
        }
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_receiver_name);
        Intrinsics.checkNotNullExpressionValue(textView3, "txt_receiver_name");
        textView3.setText(name);
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_user_phone_number);
        Intrinsics.checkNotNullExpressionValue(textView4, "txt_user_phone_number");
        textView4.setText(str);
        OrderProcessing orderProcessing5 = this.orderProcessing;
        if (orderProcessing5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        GeneralKt.log(orderProcessing5.getShippingType());
        OrderProcessing orderProcessing6 = this.orderProcessing;
        if (orderProcessing6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        String shippingType = orderProcessing6.getShippingType();
        if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
            hideLayoutPickupCode();
            initDeliveryInfo();
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP())) {
            showLayoutPickupCode();
            initPickupInfo();
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
            initTableInfo();
        }
        initPaymentStatus();
        initOrderRef();
    }

    private final void setEstimateBean(Integer num) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_reward_bean);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_reward_bean");
        textView.setText(getContext().getString(R.string.str_you_received_no_beans_for_this_order, String.valueOf(num)));
    }

    private final boolean hasBeanReward() {
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        Integer etaBean = orderProcessing2.getEtaBean();
        return (etaBean != null ? etaBean.intValue() : 0) > 0;
    }

    private final void initTableInfo() {
        String tableName;
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        if (orderProcessing2.getPuQueue() == null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.view3);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view3");
            _$_findCachedViewById.setVisibility(8);
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_queue_title);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_queue_title");
            textView.setVisibility(8);
            TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_queue_name);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_queue_name");
            textView2.setVisibility(8);
        } else {
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.view3);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "view3");
            _$_findCachedViewById2.setVisibility(0);
            TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_queue_title);
            Intrinsics.checkNotNullExpressionValue(textView3, "txt_queue_title");
            textView3.setVisibility(0);
            TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_queue_name);
            Intrinsics.checkNotNullExpressionValue(textView4, "txt_queue_name");
            textView4.setVisibility(0);
        }
        OrderProcessing orderProcessing3 = this.orderProcessing;
        if (orderProcessing3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        TableInfo tableInfo = orderProcessing3.getTableInfo();
        String str = null;
        if ((tableInfo != null ? tableInfo.getTableName() : null) == null) {
            TextView textView5 = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
            Intrinsics.checkNotNullExpressionValue(textView5, "txt_table_name_title");
            textView5.setVisibility(8);
            TextView textView6 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
            Intrinsics.checkNotNullExpressionValue(textView6, "txt_table_name");
            textView6.setVisibility(8);
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.view9);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "view9");
            _$_findCachedViewById3.setVisibility(8);
        } else {
            TextView textView7 = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
            Intrinsics.checkNotNullExpressionValue(textView7, "txt_table_name_title");
            textView7.setVisibility(0);
            TextView textView8 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
            Intrinsics.checkNotNullExpressionValue(textView8, "txt_table_name");
            textView8.setVisibility(0);
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.view9);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "view9");
            _$_findCachedViewById4.setVisibility(0);
        }
        OrderProcessing orderProcessing4 = this.orderProcessing;
        if (orderProcessing4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        TableInfo tableInfo2 = orderProcessing4.getTableInfo();
        GeneralKt.log(tableInfo2 != null ? tableInfo2.getTableName() : null);
        TextView textView9 = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
        Intrinsics.checkNotNullExpressionValue(textView9, "txt_table_name_title");
        textView9.setText(getContext().getString(R.string.str_table_name));
        TextView textView10 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
        Intrinsics.checkNotNullExpressionValue(textView10, "txt_table_name");
        OrderProcessing orderProcessing5 = this.orderProcessing;
        if (orderProcessing5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        TableInfo tableInfo3 = orderProcessing5.getTableInfo();
        textView10.setText((tableInfo3 == null || (tableName = tableInfo3.getTableName()) == null) ? null : StringExtsKt.toStringOrEmpty(tableName));
        TextView textView11 = (TextView) _$_findCachedViewById(R.id.txt_queue_title);
        Intrinsics.checkNotNullExpressionValue(textView11, "txt_queue_title");
        textView11.setText(getContext().getString(R.string.str_order_queue));
        TextView textView12 = (TextView) _$_findCachedViewById(R.id.txt_queue_name);
        Intrinsics.checkNotNullExpressionValue(textView12, "txt_queue_name");
        OrderProcessing orderProcessing6 = this.orderProcessing;
        if (orderProcessing6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        textView12.setText(String.valueOf(orderProcessing6.getPuQueue()));
        TextView textView13 = (TextView) _$_findCachedViewById(R.id.txt_deliver_to_title);
        Intrinsics.checkNotNullExpressionValue(textView13, "txt_deliver_to_title");
        textView13.setText(getContext().getString(R.string.str_receive_at));
        TextView textView14 = (TextView) _$_findCachedViewById(R.id.txt_deliver_to);
        Intrinsics.checkNotNullExpressionValue(textView14, "txt_deliver_to");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
        OrderProcessing orderProcessing7 = this.orderProcessing;
        if (orderProcessing7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        TableInfo tableInfo4 = orderProcessing7.getTableInfo();
        textViewAttributeArr[0] = new TextViewAttribute(Intrinsics.stringPlus(tableInfo4 != null ? tableInfo4.getStoreName() : null, "\n"), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
        OrderProcessing orderProcessing8 = this.orderProcessing;
        if (orderProcessing8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        TableInfo tableInfo5 = orderProcessing8.getTableInfo();
        if (tableInfo5 != null) {
            str = tableInfo5.getAddress();
        }
        textViewAttributeArr[1] = new TextViewAttribute(StringExtsKt.toStringOrEmpty(str), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView14, textViewAttributeArr);
    }

    private final void initOrderRef() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_ref);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_ref");
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        textView.setText(orderProcessing2.getRef());
    }

    private final void initPaymentStatus() {
        Payment payment;
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        List<Payment> payments = orderProcessing2.getPayments();
        if (payments != null && (payment = (Payment) CollectionsKt.firstOrNull((List) payments)) != null) {
            Integer status = payment.getStatus();
            if (status != null && status.intValue() == 0) {
                TextView textView = (TextView) _$_findCachedViewById(R.id.txt_payment_status);
                Intrinsics.checkNotNullExpressionValue(textView, "txt_payment_status");
                textView.setText(getContext().getString(R.string.str_unpaid));
                ((TextView) _$_findCachedViewById(R.id.txt_payment_status)).setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(getContext(), R.drawable.ic_unpaid), (Drawable) null, (Drawable) null, (Drawable) null);
            } else if (status != null && status.intValue() == 1) {
                TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_payment_status);
                Intrinsics.checkNotNullExpressionValue(textView2, "txt_payment_status");
                textView2.setText(getContext().getString(R.string.str_paid));
                ((TextView) _$_findCachedViewById(R.id.txt_payment_status)).setCompoundDrawablesRelativeWithIntrinsicBounds(ContextCompat.getDrawable(getContext(), R.drawable.ic_paid), (Drawable) null, (Drawable) null, (Drawable) null);
            }
        }
    }

    private final void initDeliveryInfo() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_deliver_to_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_deliver_to_title");
        textView.setText(getContext().getString(R.string.str_deliver_to));
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_deliver_to);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_deliver_to");
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        AddressOrder address = orderProcessing2.getAddress();
        textView2.setText(address != null ? address.getStreet() : null);
    }

    private final void initPickupInfo() {
        AddressOrder address;
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        if (orderProcessing2.getPuQueue() == null) {
            hideLayoutPickupCode();
            return;
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.view9);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view9");
        _$_findCachedViewById.setVisibility(0);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_table_name_title");
        textView.setVisibility(0);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_table_name");
        textView2.setVisibility(0);
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
        Intrinsics.checkNotNullExpressionValue(textView3, "txt_table_name_title");
        textView3.setText(getContext().getString(R.string.str_order_queue));
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_deliver_to_title);
        Intrinsics.checkNotNullExpressionValue(textView4, "txt_deliver_to_title");
        textView4.setText(getContext().getString(R.string.str_receive_at));
        TextView textView5 = (TextView) _$_findCachedViewById(R.id.txt_deliver_to);
        Intrinsics.checkNotNullExpressionValue(textView5, "txt_deliver_to");
        TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
        OrderProcessing orderProcessing3 = this.orderProcessing;
        if (orderProcessing3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        Shop shop = orderProcessing3.getShop();
        String str = null;
        textViewAttributeArr[0] = new TextViewAttribute(Intrinsics.stringPlus(shop != null ? shop.getName() : null, "\n"), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
        OrderProcessing orderProcessing4 = this.orderProcessing;
        if (orderProcessing4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        Shop shop2 = orderProcessing4.getShop();
        if (!(shop2 == null || (address = shop2.getAddress()) == null)) {
            str = address.getStreet();
        }
        textViewAttributeArr[1] = new TextViewAttribute(String.valueOf(str), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorTextTitle), Integer.valueOf((int) R.font.sfpd_regular));
        TLTextViewKt.setTextMultipleFonts(textView5, textViewAttributeArr);
        TextView textView6 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
        Intrinsics.checkNotNullExpressionValue(textView6, "txt_table_name");
        OrderProcessing orderProcessing5 = this.orderProcessing;
        if (orderProcessing5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        textView6.setText(String.valueOf(orderProcessing5.getPuQueue()));
    }

    private final void showLayoutPickupCode() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.view9);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view9");
        _$_findCachedViewById.setVisibility(0);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_table_name_title");
        textView.setVisibility(0);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_table_name");
        textView2.setVisibility(0);
    }

    private final void hideLayoutPickupCode() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.view9);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "view9");
        _$_findCachedViewById.setVisibility(8);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_table_name_title);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_table_name_title");
        textView.setVisibility(8);
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_table_name);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_table_name");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) _$_findCachedViewById(R.id.txt_queue_title);
        Intrinsics.checkNotNullExpressionValue(textView3, "txt_queue_title");
        textView3.setVisibility(8);
        TextView textView4 = (TextView) _$_findCachedViewById(R.id.txt_queue_name);
        Intrinsics.checkNotNullExpressionValue(textView4, "txt_queue_name");
        textView4.setVisibility(8);
    }
}
