package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.LogOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import com.thecoffeehouse.guestapp.services.api.model.orders.Rating;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

public final class TrackingOrderStatusView extends FrameLayout {
    private HashMap _$_findViewCache;
    private boolean isExpanding;
    private Function0<Unit> onOpenMapListener = TrackingOrderStatusView$onOpenMapListener$1.INSTANCE;
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

    public final Function0<Unit> getOnOpenMapListener() {
        return this.onOpenMapListener;
    }

    public final void setOnOpenMapListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onOpenMapListener = function0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderStatusView(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_status_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderStatusView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_status_view, (ViewGroup) this, true);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrackingOrderStatusView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_order_tracking_status_view, (ViewGroup) this, true);
    }

    public static /* synthetic */ void updateData$default(TrackingOrderStatusView trackingOrderStatusView, OrderProcessing orderProcessing2, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        trackingOrderStatusView.updateData(orderProcessing2, z);
    }

    public final void updateData(OrderProcessing orderProcessing2, boolean z) {
        Intrinsics.checkNotNullParameter(orderProcessing2, "orderProcessing");
        this.orderProcessing = orderProcessing2;
        initStatusOrder();
        initRatingOrder();
        initLogsOrder(z);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.img_map);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_map");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new TrackingOrderStatusView$updateData$1(this), 1, null);
    }

    /* access modifiers changed from: public */
    private final void sendTrackingEventMapSelected() {
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderTrackingEvents.EventOrderTrackingMapSelected.name, OrderTrackingEvents.EventOrderTrackingMapSelected.name);
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        trackingDataArr[0] = new TrackingData("orderID", orderProcessing2.getRef());
        companion.collectParamWithEventName(OrderTrackingEvents.EventOrderTrackingMapSelected.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderTrackingEvents.EventOrderTrackingMapSelected.name);
    }

    private final void initStatusOrder() {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_eta_deli_time);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_eta_deli_time");
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        textView.setText(orderProcessing2.getMessage());
        OrderProcessing orderProcessing3 = this.orderProcessing;
        if (orderProcessing3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        Integer status = orderProcessing3.getStatus();
        OrderProcessing orderProcessing4 = this.orderProcessing;
        if (orderProcessing4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        int draft = orderProcessing4.getDRAFT();
        if (status != null && status.intValue() == draft) {
            ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_unpaid);
        } else {
            OrderProcessing orderProcessing5 = this.orderProcessing;
            if (orderProcessing5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
            }
            int cancel = orderProcessing5.getCANCEL();
            if (status != null && status.intValue() == cancel) {
                ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_ordercancellation);
            } else {
                OrderProcessing orderProcessing6 = this.orderProcessing;
                if (orderProcessing6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
                }
                int confirmed = orderProcessing6.getCONFIRMED();
                if (status != null && status.intValue() == confirmed) {
                    ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_orderconfirmed);
                } else {
                    OrderProcessing orderProcessing7 = this.orderProcessing;
                    if (orderProcessing7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
                    }
                    int processing = orderProcessing7.getPROCESSING();
                    if (status != null && status.intValue() == processing) {
                        ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_preparing);
                    } else {
                        OrderProcessing orderProcessing8 = this.orderProcessing;
                        if (orderProcessing8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
                        }
                        int shipping = orderProcessing8.getSHIPPING();
                        if (status != null && status.intValue() == shipping) {
                            ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_ondeli);
                        } else {
                            OrderProcessing orderProcessing9 = this.orderProcessing;
                            if (orderProcessing9 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
                            }
                            int pickup_ready = orderProcessing9.getPICKUP_READY();
                            if (status != null && status.intValue() == pickup_ready) {
                                ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_waitforpickup);
                            } else {
                                OrderProcessing orderProcessing10 = this.orderProcessing;
                                if (orderProcessing10 == null) {
                                    Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
                                }
                                int done = orderProcessing10.getDONE();
                                if (status != null && status.intValue() == done) {
                                    ((TLImageView) _$_findCachedViewById(R.id.img_order_status)).setImageResource(R.drawable.img_order_status_completed);
                                }
                            }
                        }
                    }
                }
            }
        }
        showWarningViewOrderAtTable();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0038, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getShippingType(), com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType.INSTANCE.getTABLE()) == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006e, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r0.getShippingType(), com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType.INSTANCE.getTABLE()) == false) goto L_0x0070;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void showWarningViewOrderAtTable() {
        /*
        // Method dump skipped, instructions count: 197
        */
        throw new UnsupportedOperationException("Method not decompiled: com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderStatusView.showWarningViewOrderAtTable():void");
    }

    private final void initRatingOrder() {
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        if (orderProcessing2.getRating() != null) {
            showRatingInfo();
        } else {
            hideRatingOrderButton();
        }
    }

    private final void showRatingInfo() {
        ImageView imageView;
        ImageView imageView2;
        ImageView imageView3;
        ImageView imageView4;
        ImageView imageView5;
        ImageView imageView6;
        ImageView imageView7;
        ImageView imageView8;
        ImageView imageView9;
        ImageView imageView10;
        ImageView imageView11;
        ImageView imageView12;
        ImageView imageView13;
        ImageView imageView14;
        ImageView imageView15;
        ImageView imageView16;
        ImageView imageView17;
        ImageView imageView18;
        ImageView imageView19;
        ImageView imageView20;
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.layout_rating);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(0);
        }
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_thank_you_for_your_rating);
        if (textView != null) {
            textView.setText(getContext().getString(R.string.str_thank_you_for_your_rating_order));
        }
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_stars_rating);
        if (_$_findCachedViewById != null) {
            _$_findCachedViewById.setVisibility(0);
        }
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        Rating rating = orderProcessing2.getRating();
        Integer rating2 = rating != null ? rating.getRating() : null;
        if (rating2 == null || rating2.intValue() != 5) {
            if (rating2 != null && rating2.intValue() == 4) {
                View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById2 == null || (imageView20 = (ImageView) _$_findCachedViewById2.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setDrawable(imageView20, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (_$_findCachedViewById3 != null && (imageView19 = (ImageView) _$_findCachedViewById3.findViewById(R.id.rating_start_5)) != null) {
                    ViewExtsKt.setTint(imageView19, R.color.color838387);
                }
            } else if (rating2 != null && rating2.intValue() == 3) {
                View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById4 == null || (imageView18 = (ImageView) _$_findCachedViewById4.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setDrawable(imageView18, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById5 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById5 == null || (imageView17 = (ImageView) _$_findCachedViewById5.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setTint(imageView17, R.color.color838387);
                }
                View _$_findCachedViewById6 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById6 == null || (imageView16 = (ImageView) _$_findCachedViewById6.findViewById(R.id.rating_start_4)) == null)) {
                    ViewExtsKt.setDrawable(imageView16, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById7 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (_$_findCachedViewById7 != null && (imageView15 = (ImageView) _$_findCachedViewById7.findViewById(R.id.rating_start_4)) != null) {
                    ViewExtsKt.setTint(imageView15, R.color.color838387);
                }
            } else if (rating2 != null && rating2.intValue() == 2) {
                View _$_findCachedViewById8 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById8 == null || (imageView14 = (ImageView) _$_findCachedViewById8.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setDrawable(imageView14, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById9 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById9 == null || (imageView13 = (ImageView) _$_findCachedViewById9.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setTint(imageView13, R.color.color838387);
                }
                View _$_findCachedViewById10 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById10 == null || (imageView12 = (ImageView) _$_findCachedViewById10.findViewById(R.id.rating_start_4)) == null)) {
                    ViewExtsKt.setDrawable(imageView12, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById11 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById11 == null || (imageView11 = (ImageView) _$_findCachedViewById11.findViewById(R.id.rating_start_4)) == null)) {
                    ViewExtsKt.setTint(imageView11, R.color.color838387);
                }
                View _$_findCachedViewById12 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById12 == null || (imageView10 = (ImageView) _$_findCachedViewById12.findViewById(R.id.rating_start_3)) == null)) {
                    ViewExtsKt.setDrawable(imageView10, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById13 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (_$_findCachedViewById13 != null && (imageView9 = (ImageView) _$_findCachedViewById13.findViewById(R.id.rating_start_3)) != null) {
                    ViewExtsKt.setTint(imageView9, R.color.color838387);
                }
            } else if (rating2 != null && rating2.intValue() == 1) {
                View _$_findCachedViewById14 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById14 == null || (imageView8 = (ImageView) _$_findCachedViewById14.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setDrawable(imageView8, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById15 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById15 == null || (imageView7 = (ImageView) _$_findCachedViewById15.findViewById(R.id.rating_start_5)) == null)) {
                    ViewExtsKt.setTint(imageView7, R.color.color838387);
                }
                View _$_findCachedViewById16 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById16 == null || (imageView6 = (ImageView) _$_findCachedViewById16.findViewById(R.id.rating_start_4)) == null)) {
                    ViewExtsKt.setDrawable(imageView6, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById17 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById17 == null || (imageView5 = (ImageView) _$_findCachedViewById17.findViewById(R.id.rating_start_4)) == null)) {
                    ViewExtsKt.setTint(imageView5, R.color.color838387);
                }
                View _$_findCachedViewById18 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById18 == null || (imageView4 = (ImageView) _$_findCachedViewById18.findViewById(R.id.rating_start_3)) == null)) {
                    ViewExtsKt.setDrawable(imageView4, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById19 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById19 == null || (imageView3 = (ImageView) _$_findCachedViewById19.findViewById(R.id.rating_start_3)) == null)) {
                    ViewExtsKt.setTint(imageView3, R.color.color838387);
                }
                View _$_findCachedViewById20 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (!(_$_findCachedViewById20 == null || (imageView2 = (ImageView) _$_findCachedViewById20.findViewById(R.id.rating_start_2)) == null)) {
                    ViewExtsKt.setDrawable(imageView2, R.drawable.ic_star_stroke);
                }
                View _$_findCachedViewById21 = _$_findCachedViewById(R.id.layout_stars_rating);
                if (_$_findCachedViewById21 != null && (imageView = (ImageView) _$_findCachedViewById21.findViewById(R.id.rating_start_2)) != null) {
                    ViewExtsKt.setTint(imageView, R.color.color838387);
                }
            }
        }
    }

    private final void hideRatingOrderButton() {
        ConstraintLayout constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.layout_rating);
        if (constraintLayout != null) {
            constraintLayout.setVisibility(8);
        }
    }

    private final void initLogsOrder(boolean z) {
        ConstraintLayout constraintLayout;
        ((LinearLayout) _$_findCachedViewById(R.id.layout_order_logs)).removeAllViews();
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        List<LogOrder> logs = orderProcessing2.getLogs();
        if (logs == null || logs.isEmpty()) {
            ImageView imageView = (ImageView) _$_findCachedViewById(R.id.img_arrow_expand_collapse);
            Intrinsics.checkNotNullExpressionValue(imageView, "img_arrow_expand_collapse");
            imageView.setVisibility(4);
            LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
            if (linearLayout != null) {
                LinearLayout linearLayout2 = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "layout_order_logs");
                int paddingLeft = linearLayout2.getPaddingLeft();
                LinearLayout linearLayout3 = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "layout_order_logs");
                int paddingTop = linearLayout3.getPaddingTop();
                LinearLayout linearLayout4 = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
                Intrinsics.checkNotNullExpressionValue(linearLayout4, "layout_order_logs");
                linearLayout.setPadding(paddingLeft, paddingTop, linearLayout4.getPaddingRight(), ViewExtsKt.DPtoPX(16.0f));
                return;
            }
            return;
        }
        ImageView imageView2 = (ImageView) _$_findCachedViewById(R.id.img_arrow_expand_collapse);
        Intrinsics.checkNotNullExpressionValue(imageView2, "img_arrow_expand_collapse");
        imageView2.setVisibility(0);
        LinearLayout linearLayout5 = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
        if (linearLayout5 != null) {
            linearLayout5.setPadding(0, 0, 0, 0);
        }
        addLogOrderByExpandState();
        if (z && (constraintLayout = (ConstraintLayout) _$_findCachedViewById(R.id.layout_root_order_processing)) != null) {
            constraintLayout.setOnClickListener(new TrackingOrderStatusView$initLogsOrder$1(this));
        }
    }

    /* access modifiers changed from: public */
    private final void sendTrackingEventExpandCollapse() {
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderTrackingEvents.EventOrderTrackingExpandSelected.name, OrderTrackingEvents.EventOrderTrackingExpandSelected.name);
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        trackingDataArr[0] = new TrackingData("orderID", orderProcessing2.getRef());
        companion.collectParamWithEventName(OrderTrackingEvents.EventOrderTrackingExpandSelected.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderTrackingEvents.EventOrderTrackingExpandSelected.name);
    }

    /* access modifiers changed from: public */
    private final void addLogOrderByExpandState() {
        TextView textView;
        TextView textView2;
        View findViewById;
        View findViewById2;
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
        if (linearLayout != null) {
            linearLayout.removeAllViews();
        }
        if (this.isExpanding) {
            ((ImageView) _$_findCachedViewById(R.id.img_arrow_expand_collapse)).animate().rotation(90.0f).start();
            OrderProcessing orderProcessing2 = this.orderProcessing;
            if (orderProcessing2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
            }
            int i = 0;
            for (T t : orderProcessing2.getLogs()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                addLogOrderView(t, i);
                i = i2;
            }
            return;
        }
        ((ImageView) _$_findCachedViewById(R.id.img_arrow_expand_collapse)).animate().rotation(0.0f).start();
        OrderProcessing orderProcessing3 = this.orderProcessing;
        if (orderProcessing3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        LogOrder logOrder = (LogOrder) CollectionsKt.lastOrNull((List) orderProcessing3.getLogs());
        if (logOrder != null) {
            OrderProcessing orderProcessing4 = this.orderProcessing;
            if (orderProcessing4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
            }
            View addLogOrderView = addLogOrderView(logOrder, CollectionsKt.getLastIndex(orderProcessing4.getLogs()));
            if (!(addLogOrderView == null || (findViewById2 = addLogOrderView.findViewById(R.id.view_line_top)) == null)) {
                findViewById2.setVisibility(4);
            }
            if (!(addLogOrderView == null || (findViewById = addLogOrderView.findViewById(R.id.view_line_bottom)) == null)) {
                findViewById.setVisibility(4);
            }
            if (!(addLogOrderView == null || (textView2 = (TextView) addLogOrderView.findViewById(R.id.txt_time_log)) == null)) {
                textView2.setText("●");
            }
            if (!(addLogOrderView == null || (textView = (TextView) addLogOrderView.findViewById(R.id.txt_time_log)) == null)) {
                textView.setTextColor(ContextCompat.getColor(getContext(), R.color.colorF6A81F));
            }
        }
    }

    private final View addLogOrderView(LogOrder logOrder, int i) {
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.item_row_log, (ViewGroup) null, false);
        String ToFormat = StringDateUtilsKt.ToFormat(new Date(((long) logOrder.getTime()) * ((long) 1000)), StringDateUtilsKt.DF_hh_mm);
        if (ToFormat == null) {
            ToFormat = "";
        }
        Intrinsics.checkNotNullExpressionValue(inflate, "itemLogLayout");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_time_log);
        Intrinsics.checkNotNullExpressionValue(textView, "itemLogLayout.txt_time_log");
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute("●" + "\n", Integer.valueOf((int) R.dimen._10sp), Integer.valueOf((int) R.color.colorF6A81F), Integer.valueOf((int) R.font.sfpd_bold)), new TextViewAttribute(ToFormat, Integer.valueOf((int) R.dimen._10sp), Integer.valueOf((int) R.color.colorBBBBBB), Integer.valueOf((int) R.font.sfpd_bold)));
        TextView textView2 = (TextView) inflate.findViewById(R.id.txt_title_log);
        Intrinsics.checkNotNullExpressionValue(textView2, "itemLogLayout.txt_title_log");
        textView2.setText(logOrder.getTitle());
        TextView textView3 = (TextView) inflate.findViewById(R.id.txt_body_log);
        Intrinsics.checkNotNullExpressionValue(textView3, "itemLogLayout.txt_body_log");
        textView3.setText(logOrder.getMessage());
        LinearLayout linearLayout = (LinearLayout) _$_findCachedViewById(R.id.layout_order_logs);
        if (linearLayout != null) {
            linearLayout.addView(inflate);
        }
        if (i == 0) {
            View findViewById = inflate.findViewById(R.id.view_line_top);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemLogLayout.view_line_top");
            findViewById.setVisibility(4);
        }
        OrderProcessing orderProcessing2 = this.orderProcessing;
        if (orderProcessing2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("orderProcessing");
        }
        if (i == CollectionsKt.getLastIndex(orderProcessing2.getLogs())) {
            View findViewById2 = inflate.findViewById(R.id.view_line_bottom);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemLogLayout.view_line_bottom");
            findViewById2.setVisibility(4);
            TextView textView4 = (TextView) inflate.findViewById(R.id.txt_title_log);
            Intrinsics.checkNotNullExpressionValue(textView4, "itemLogLayout.txt_title_log");
            textView4.setVisibility(0);
            TextView textView5 = (TextView) inflate.findViewById(R.id.txt_body_log);
            Intrinsics.checkNotNullExpressionValue(textView5, "itemLogLayout.txt_body_log");
            textView5.setVisibility(0);
            ((TextView) inflate.findViewById(R.id.txt_title_log)).setTextColor(ContextCompat.getColor(getContext(), R.color.colorC5671B));
        }
        return inflate;
    }
}
