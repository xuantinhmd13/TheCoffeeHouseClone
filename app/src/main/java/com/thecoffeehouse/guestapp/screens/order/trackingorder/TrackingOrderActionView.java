package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderButtonStatus;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u0010.\u001a\u00020\u00142\u0006\u0010,\u001a\u00020-H\u0002J<\u0010/\u001a(\u0012\n\u0012\b\u0012\u0004\u0012\u00020-0000j\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020-00j\b\u0012\u0004\u0012\u00020-`1`12\f\u00102\u001a\b\u0012\u0004\u0012\u00020-03H\u0002J\b\u00104\u001a\u00020\u0014H\u0002J\u0010\u00105\u001a\u00020\u00142\u0006\u00106\u001a\u00020\fH\u0002J\u0010\u00107\u001a\u00020\u00142\u0006\u00108\u001a\u000209H\u0002J(\u0010:\u001a\u00020\u00142\u0016\u0010;\u001a\u0012\u0012\u0004\u0012\u00020-00j\b\u0012\u0004\u0012\u00020-`12\u0006\u0010<\u001a\u00020=H\u0002J\u001e\u0010>\u001a\u00020\u00142\f\u0010;\u001a\b\u0012\u0004\u0012\u00020-002\u0006\u0010<\u001a\u00020=H\u0002J\u000e\u0010?\u001a\u00020\u00142\u0006\u0010@\u001a\u00020)R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\fXD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\fXD¢\u0006\u0002\n\u0000R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R \u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R \u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0016\"\u0004\b\u001e\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0016\"\u0004\b!\u0010\u0018R \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0016\"\u0004\b$\u0010\u0018R \u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0016\"\u0004\b'\u0010\u0018R\u000e\u0010(\u001a\u00020)X.¢\u0006\u0002\n\u0000¨\u0006A"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderActionView;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "CALL_ASSIST_BUTTON_ID", "", "CALL_DRIVER_BUTTON_ID", "CANCEL_ORDER_BUTTON_ID", "RATING_ORDER_BUTTON_ID", "REPAY_ORDER_BUTTON_ID", "RE_ORDER_BUTTON_ID", "onCallAssistListener", "Lkotlin/Function0;", "", "getOnCallAssistListener", "()Lkotlin/jvm/functions/Function0;", "setOnCallAssistListener", "(Lkotlin/jvm/functions/Function0;)V", "onCallDriverListener", "getOnCallDriverListener", "setOnCallDriverListener", "onCancelOrderListener", "getOnCancelOrderListener", "setOnCancelOrderListener", "onRatingOrderListener", "getOnRatingOrderListener", "setOnRatingOrderListener", "onReorderListener", "getOnReorderListener", "setOnReorderListener", "onRepayListener", "getOnRepayListener", "setOnRepayListener", "orderProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "buttonIsCancelOrder", "", "button", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderButtonStatus;", "getActionButtonById", "groupingButtonIntoPairs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "activeButtons", "", "initActionsOrder", "sendEventTrackingAction", "eventName", "setCancelButtonStyle", "textView", "Landroid/widget/TextView;", "showOneButtonFullWidth", "orderButtonStatus", "layoutAction", "Landroid/view/View;", "showTwoButtonsEqualWidth", "updateData", "order", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingOrderActionView.kt */
public final class TrackingOrderActionView extends FrameLayout {
    private final String CALL_ASSIST_BUTTON_ID = "call_assist";
    private final String CALL_DRIVER_BUTTON_ID = "call_driver";
    private final String CANCEL_ORDER_BUTTON_ID = "cancel_order";
    private final String RATING_ORDER_BUTTON_ID = "rating";
    private final String REPAY_ORDER_BUTTON_ID = "repay";
    private final String RE_ORDER_BUTTON_ID = "re_order";
    private HashMap _$_findViewCache;
    private Function0<Unit> onCallAssistListener = TrackingOrderActionView$onCallAssistListener$1.INSTANCE;
    private Function0<Unit> onCallDriverListener = TrackingOrderActionView$onCallDriverListener$1.INSTANCE;
    private Function0<Unit> onCancelOrderListener = TrackingOrderActionView$onCancelOrderListener$1.INSTANCE;
    private Function0<Unit> onRatingOrderListener = TrackingOrderActionView$onRatingOrderListener$1.INSTANCE;
    private Function0<Unit> onReorderListener = TrackingOrderActionView$onReorderListener$1.INSTANCE;
    private Function0<Unit> onRepayListener = TrackingOrderActionView$onRepayListener$1.INSTANCE;
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
    public TrackingOrderActionView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_action_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderActionView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_action_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderActionView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_action_view, (ViewGroup) this, true);
    }

    public final void updateData(OrderProcessing orderProcessing2) {
        Intrinsics.checkNotNullParameter(orderProcessing2, "order");
        this.orderProcessing = orderProcessing2;
        initActionsOrder();
    }

    private final void initActionsOrder() {
        Object obj;
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.layout_actions);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        Context context = getContext();
        if (context != null) {
            OrderProcessing orderProcessing2 = this.orderProcessing;
            if (orderProcessing2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
            }
            ArrayList arrayList = new ArrayList();
            for (T t : orderProcessing2.getButtonStatus()) {
                if (t.getActive()) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            if (arrayList2.isEmpty()) {
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.layout_actions);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "layout_actions");
                linearLayout2.setVisibility(8);
                return;
            }
            LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R.id.layout_actions);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "layout_actions");
            linearLayout3.setVisibility(0);
            Iterator<T> it = groupingButtonIntoPairs(arrayList2).iterator();
            int i = 0;
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = next;
                View inflate = LayoutInflater.from(context).inflate(R.layout.layout_buttons_order_tracking, (ViewGroup) null, false);
                int size = t2.size();
                if (size == 1) {
                    Intrinsics.checkNotNullExpressionValue(inflate, "layoutAction");
                    showOneButtonFullWidth(t2, inflate);
                } else if (size == 2) {
                    Intrinsics.checkNotNullExpressionValue(inflate, "layoutAction");
                    showTwoButtonsEqualWidth(t2, inflate);
                }
                Intrinsics.checkNotNullExpressionValue(inflate, "layoutAction");
                inflate.setPadding(inflate.getPaddingLeft(), inflate.getPaddingTop(), inflate.getPaddingRight(), ViewExtsKt.DPtoPX(10.0f));
                LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(R.id.layout_actions);
                if (linearLayout4 != null) {
                    linearLayout4.addView(inflate);
                }
                i = i2;
            }
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next2 = it2.next();
                if (((OrderButtonStatus) next2).getAuto()) {
                    obj = next2;
                    break;
                }
            }
            OrderButtonStatus orderButtonStatus = (OrderButtonStatus) obj;
            if (orderButtonStatus != null) {
                getActionButtonById(orderButtonStatus);
            }
        }
    }

    private final void showTwoButtonsEqualWidth(ArrayList<OrderButtonStatus> arrayList, View view) {
        int i = 0;
        for (T t : arrayList) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            if (i == 0) {
                if (buttonIsCancelOrder(t2)) {
                    TextView textView = (TextView) view.findViewById(R.id.txt_action_left);
                    Intrinsics.checkNotNullExpressionValue(textView, "layoutAction.txt_action_left");
                    setCancelButtonStyle(textView);
                }
                TextView textView2 = (TextView) view.findViewById(R.id.txt_action_left);
                Intrinsics.checkNotNullExpressionValue(textView2, "layoutAction.txt_action_left");
                textView2.setText(t2.getText());
                TextView textView3 = (TextView) view.findViewById(R.id.txt_action_left);
                Intrinsics.checkNotNullExpressionValue(textView3, "layoutAction.txt_action_left");
                ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new TrackingOrderActionView$showTwoButtonsEqualWidth$$inlined$forEachIndexed$lambda$1(t2, this, view), 1, null);
            } else if (i == 1) {
                TextView textView4 = (TextView) view.findViewById(R.id.txt_action_right);
                Intrinsics.checkNotNullExpressionValue(textView4, "layoutAction.txt_action_right");
                textView4.setText(t2.getText());
                TextView textView5 = (TextView) view.findViewById(R.id.txt_action_right);
                Intrinsics.checkNotNullExpressionValue(textView5, "layoutAction.txt_action_right");
                ContextExtsKt.setOnSafeClickListener$default(textView5, 0, new TrackingOrderActionView$showTwoButtonsEqualWidth$$inlined$forEachIndexed$lambda$2(t2, this, view), 1, null);
                if (buttonIsCancelOrder(t2)) {
                    TextView textView6 = (TextView) view.findViewById(R.id.txt_action_right);
                    Intrinsics.checkNotNullExpressionValue(textView6, "layoutAction.txt_action_right");
                    setCancelButtonStyle(textView6);
                }
            }
            i = i2;
        }
    }

    private final void showOneButtonFullWidth(ArrayList<OrderButtonStatus> arrayList, View view) {
        OrderButtonStatus orderButtonStatus = (OrderButtonStatus) CollectionsKt.first((List) arrayList);
        TextView textView = (TextView) view.findViewById(R.id.txt_action_left);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutAction.txt_action_left");
        textView.setText(orderButtonStatus.getText());
        TextView textView2 = (TextView) view.findViewById(R.id.txt_action_right);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutAction.txt_action_right");
        textView2.setVisibility(8);
        TextView textView3 = (TextView) view.findViewById(R.id.txt_action_left);
        Intrinsics.checkNotNullExpressionValue(textView3, "layoutAction.txt_action_left");
        ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new TrackingOrderActionView$showOneButtonFullWidth$1(this, orderButtonStatus), 1, null);
        if (buttonIsCancelOrder(orderButtonStatus)) {
            TextView textView4 = (TextView) view.findViewById(R.id.txt_action_left);
            Intrinsics.checkNotNullExpressionValue(textView4, "layoutAction.txt_action_left");
            setCancelButtonStyle(textView4);
        }
    }

    private final boolean buttonIsCancelOrder(OrderButtonStatus orderButtonStatus) {
        return Intrinsics.areEqual(orderButtonStatus.getId(), "cancel_order");
    }

    private final void setCancelButtonStyle(TextView textView) {
        textView.setBackground(ContextCompat.getDrawable(getContext(), R.drawable.background_cancel_order));
        textView.setTextColor(ContextCompat.getColor(getContext(), R.color.colorWhite));
    }

    public final Function0<Unit> getOnRepayListener() {
        return this.onRepayListener;
    }

    public final void setOnRepayListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onRepayListener = function0;
    }

    public final Function0<Unit> getOnCancelOrderListener() {
        return this.onCancelOrderListener;
    }

    public final void setOnCancelOrderListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCancelOrderListener = function0;
    }

    public final Function0<Unit> getOnRatingOrderListener() {
        return this.onRatingOrderListener;
    }

    public final void setOnRatingOrderListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onRatingOrderListener = function0;
    }

    public final Function0<Unit> getOnCallAssistListener() {
        return this.onCallAssistListener;
    }

    public final void setOnCallAssistListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCallAssistListener = function0;
    }

    public final Function0<Unit> getOnCallDriverListener() {
        return this.onCallDriverListener;
    }

    public final void setOnCallDriverListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCallDriverListener = function0;
    }

    public final Function0<Unit> getOnReorderListener() {
        return this.onReorderListener;
    }

    public final void setOnReorderListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onReorderListener = function0;
    }

    /* access modifiers changed from: private */
    public final void getActionButtonById(OrderButtonStatus orderButtonStatus) {
        String id = orderButtonStatus.getId();
        if (Intrinsics.areEqual(id, this.REPAY_ORDER_BUTTON_ID)) {
            this.onRepayListener.invoke();
        } else if (Intrinsics.areEqual(id, this.CANCEL_ORDER_BUTTON_ID)) {
            this.onCancelOrderListener.invoke();
        } else if (Intrinsics.areEqual(id, this.RATING_ORDER_BUTTON_ID)) {
            this.onRatingOrderListener.invoke();
        } else if (Intrinsics.areEqual(id, this.CALL_ASSIST_BUTTON_ID)) {
            sendEventTrackingAction(OrderTrackingEvents.EventOrderTrackingSupportSelected.name);
            this.onCallAssistListener.invoke();
        } else if (Intrinsics.areEqual(id, this.CALL_DRIVER_BUTTON_ID)) {
            sendEventTrackingAction(OrderTrackingEvents.EventOrderTrackingShipperSelected.name);
            this.onCallDriverListener.invoke();
        } else if (Intrinsics.areEqual(id, this.RE_ORDER_BUTTON_ID)) {
            this.onReorderListener.invoke();
        }
    }

    private final void sendEventTrackingAction(String str) {
        TrackingEventService.Companion.updateSourceTrackingEvent(str, str);
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        trackingDataArr[0] = new TrackingData("orderID", orderProcessing2.getRef());
        companion.collectParamWithEventName(str, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(str);
    }

    private final ArrayList<ArrayList<OrderButtonStatus>> groupingButtonIntoPairs(List<OrderButtonStatus> list) {
        ArrayList<ArrayList<OrderButtonStatus>> arrayList = new ArrayList<>();
        IntProgression step = RangesKt.step(CollectionsKt.getIndices(list), 2);
        int first = step.getFirst();
        int last = step.getLast();
        int step2 = step.getStep();
        if (step2 < 0 ? first >= last : first <= last) {
            while (true) {
                arrayList.add(new ArrayList<>(list.subList(first, Math.min(first + 2, list.size()))));
                if (first == last) {
                    break;
                }
                first += step2;
            }
        }
        return arrayList;
    }
}
