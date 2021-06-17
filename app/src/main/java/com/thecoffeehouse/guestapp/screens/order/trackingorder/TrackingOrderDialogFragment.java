package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderTrackingEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.RatingOrderDetailDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderMapViewDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.login.Phone;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.Adjustment;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderButtonStatus;
import com.thecoffeehouse.guestapp.services.api.model.orders.Payment;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shipper;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.OrderLineItemListView;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class TrackingOrderDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private boolean isPayingNow;
    private boolean mIsRepayingOrder;
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<GetOrderTrackingResponse> mObserverGetOrderTracking = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new TrackingOrderDialogFragment$mObserverGetOrderTracking$1(this), null, false, false, 14, null);
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<GetOrderTrackingResponse> mObserverRefreshOrderTracking = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new TrackingOrderDialogFragment$mObserverRefreshOrderTracking$1(this), null, false, false, 14, null);
    private GetOrderTrackingResponse mOrderTrackingResponse;
    private final Lazy mOrderViewModel$delegate = LazyKt.lazy(new TrackingOrderDialogFragment$mOrderViewModel$2(this));
    private View mRootView;
    private String orderRef = "";
    private String orderType = "";

    /* access modifiers changed from: public */
    private final OrderViewModel getMOrderViewModel() {
        return (OrderViewModel) this.mOrderViewModel$delegate.getValue();
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
    public int getAnalyticLayoutName() {
        return R.layout.fragment_tracking_order;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Order_Tracking;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.layout_sub_header_view_stub_fragment;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ GetOrderTrackingResponse access$getMOrderTrackingResponse$p(TrackingOrderDialogFragment trackingOrderDialogFragment) {
        GetOrderTrackingResponse getOrderTrackingResponse = trackingOrderDialogFragment.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        return getOrderTrackingResponse;
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ TrackingOrderDialogFragment newInstance$default(Companion companion, String str, String str2, boolean z, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 4) != 0) {
                z = false;
            }
            return companion.newInstance(str, str2, z);
        }

        public final TrackingOrderDialogFragment newInstance(String str, String str2, boolean z) {
            Intrinsics.checkNotNullParameter(str, "orderRef");
            TrackingOrderDialogFragment trackingOrderDialogFragment = new TrackingOrderDialogFragment();
            trackingOrderDialogFragment.setOrderRef(str);
            trackingOrderDialogFragment.setOrderType(str2);
            trackingOrderDialogFragment.isPayingNow = z;
            return trackingOrderDialogFragment;
        }
    }

    public final String getOrderRef() {
        return this.orderRef;
    }

    public final void setOrderRef(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.orderRef = str;
    }

    public final String getOrderType() {
        return this.orderType;
    }

    public final void setOrderType(String str) {
        this.orderType = str;
    }

    private final void runInAppRatingFlow() {
        ReviewManager create = ReviewManagerFactory.create(requireContext());
        create.requestReviewFlow().addOnCompleteListener(new TrackingOrderDialogFragment$runInAppRatingFlow$1(this, create));
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        GeneralKt.log("mIsRepayingOrder: " + this.mIsRepayingOrder);
        if (this.mIsRepayingOrder) {
            this.mIsRepayingOrder = false;
            getMOrderViewModel().getOrderTracking(this.orderRef, this.orderType).observe(this, new BaseBottomSheetDialogFragment.ObserverBaseResource(this, new TrackingOrderDialogFragment$onResume$1(this), null, false, false, 14, null));
            MainActivity mainActivity = getMainActivity();
            if (mainActivity != null) {
                mainActivity.reloadHomeFragment();
            }
        }
    }

    /* access modifiers changed from: public */
    private final boolean retryPaymentSuccessfully(GetOrderTrackingResponse getOrderTrackingResponse) {
        return !payingIsNotCompleted(getOrderTrackingResponse.getButtonStatus()) && !this.isPayingNow;
    }

    /* access modifiers changed from: public */
    private final boolean payingIsNotCompleted(List<OrderButtonStatus> list) {
        T t;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getId(), "repay")) {
                break;
            }
        }
        T t2 = t;
        return t2 != null && t2.getActive();
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        getMOrderViewModel().getOrderTracking(this.orderRef, this.orderType).observe(this, this.mObserverGetOrderTracking);
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void collectDataTracking() {
        super.collectDataTracking();
        sendTrackingOpenTrackingOrder();
    }

    private final void sendTrackingOpenTrackingOrder() {
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderTrackingEvents.EventOrderTrackingOpenSelected.name);
    }

    /* access modifiers changed from: public */
    private final void dialToAssistCenter() {
        MainActivity mainActivity = getMainActivity();
        String str = null;
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        GetMetadataResponse value = ((TCHApplication) application).m0getMetadata().getValue();
        if (value != null) {
            str = value.getCallCenter();
        }
        if (str != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OrderExtsKt.openDialApp(requireContext, str);
        }
    }

    /* access modifiers changed from: public */
    private final void dialToShipper() {
        Phone phone;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        Shipper shipper = getOrderTrackingResponse.getShipper();
        String phoneNumber = (shipper == null || (phone = shipper.getPhone()) == null) ? null : phone.getPhoneNumber();
        if (phoneNumber != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OrderExtsKt.openDialApp(requireContext, phoneNumber);
        }
    }

    /* access modifiers changed from: public */
    private final void openPaymentOnlineService() {
        MainActivity mainActivity;
        this.mIsRepayingOrder = true;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        List<Payment> payments = getOrderTrackingResponse.getPayments();
        Payment payment = payments != null ? (Payment) CollectionsKt.firstOrNull((List) payments) : null;
        if (payment != null && (mainActivity = getMainActivity()) != null) {
            OrderExtsKt.openThirdPartyPaymentService(mainActivity, payment);
        }
    }

    private final void initItemsOrder() {
        OrderLineItemListView orderLineItemListView;
        OrderLineItemListView orderLineItemListView2;
        OrderLineItemListView orderLineItemListView3;
        View findViewById;
        TLTextView tLTextView;
        View findViewById2;
        TextView textView;
        View findViewById3;
        TextView textView2;
        View view = this.mRootView;
        if (!(view == null || (findViewById3 = view.findViewById(R.id.layout_order_header_items)) == null || (textView2 = (TextView) findViewById3.findViewById(R.id.txt_option_name)) == null)) {
            textView2.setText(getString(R.string.str_selected_items));
        }
        View view2 = this.mRootView;
        if (!(view2 == null || (findViewById2 = view2.findViewById(R.id.layout_order_header_items)) == null || (textView = (TextView) findViewById2.findViewById(R.id.txt_option_desc)) == null)) {
            textView.setVisibility(8);
        }
        View view3 = this.mRootView;
        if (!(view3 == null || (findViewById = view3.findViewById(R.id.layout_order_header_items)) == null || (tLTextView = (TLTextView) findViewById.findViewById(R.id.txt_option_must_have)) == null)) {
            tLTextView.setVisibility(8);
        }
        View view4 = this.mRootView;
        if (!(view4 == null || (orderLineItemListView3 = (OrderLineItemListView) view4.findViewById(R.id.layout_tracking_item_list)) == null)) {
            orderLineItemListView3.setEditableNote(false);
        }
        View view5 = this.mRootView;
        if (!(view5 == null || (orderLineItemListView2 = (OrderLineItemListView) view5.findViewById(R.id.layout_tracking_item_list)) == null)) {
            GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            orderLineItemListView2.updateNote(getOrderTrackingResponse.getNote());
        }
        View view6 = this.mRootView;
        if (view6 != null && (orderLineItemListView = (OrderLineItemListView) view6.findViewById(R.id.layout_tracking_item_list)) != null) {
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            orderLineItemListView.initTrackingOrderLines(getOrderTrackingResponse2.getOrderlines());
        }
    }

    /* access modifiers changed from: public */
    private final void initOrderTracking() {
        TrackingOrderActionView trackingOrderActionView;
        TrackingOrderActionView trackingOrderActionView2;
        TrackingOrderStatusView trackingOrderStatusView;
        TrackingOrderStatusView trackingOrderStatusView2;
        TrackingOrderInfoView trackingOrderInfoView;
        View view = this.mRootView;
        if (!(view == null || (trackingOrderInfoView = (TrackingOrderInfoView) view.findViewById(R.id.layout_order_info)) == null)) {
            GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            trackingOrderInfoView.updateData(getOrderTrackingResponse);
        }
        View view2 = this.mRootView;
        if (!(view2 == null || (trackingOrderStatusView2 = (TrackingOrderStatusView) view2.findViewById(R.id.layout_order_status)) == null)) {
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            TrackingOrderStatusView.updateData$default(trackingOrderStatusView2, getOrderTrackingResponse2, false, 2, null);
        }
        View view3 = this.mRootView;
        if (!(view3 == null || (trackingOrderStatusView = (TrackingOrderStatusView) view3.findViewById(R.id.layout_order_status)) == null)) {
            trackingOrderStatusView.setOnOpenMapListener(new TrackingOrderDialogFragment$initOrderTracking$1(this));
        }
        View view4 = this.mRootView;
        if (!(view4 == null || (trackingOrderActionView2 = (TrackingOrderActionView) view4.findViewById(R.id.layout_order_actions)) == null)) {
            trackingOrderActionView2.setOnRepayListener(new TrackingOrderDialogFragment$initOrderTracking$$inlined$apply$lambda$1(this));
            trackingOrderActionView2.setOnCancelOrderListener(new TrackingOrderDialogFragment$initOrderTracking$$inlined$apply$lambda$2(this));
            trackingOrderActionView2.setOnRatingOrderListener(new TrackingOrderDialogFragment$initOrderTracking$$inlined$apply$lambda$3(this));
            trackingOrderActionView2.setOnCallAssistListener(new TrackingOrderDialogFragment$initOrderTracking$$inlined$apply$lambda$4(this));
            trackingOrderActionView2.setOnCallDriverListener(new TrackingOrderDialogFragment$initOrderTracking$$inlined$apply$lambda$5(this));
            trackingOrderActionView2.setOnReorderListener(new TrackingOrderDialogFragment$initOrderTracking$$inlined$apply$lambda$6(this));
        }
        View view5 = this.mRootView;
        if (!(view5 == null || (trackingOrderActionView = (TrackingOrderActionView) view5.findViewById(R.id.layout_order_actions)) == null)) {
            GetOrderTrackingResponse getOrderTrackingResponse3 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            trackingOrderActionView.updateData(getOrderTrackingResponse3);
        }
        initItemsOrder();
        initTotalOrder();
        if (this.isPayingNow) {
            this.mIsRepayingOrder = true;
            this.isPayingNow = false;
            openPaymentOnlineService();
        }
    }

    /* access modifiers changed from: public */
    private final void showTrackingOrderMapViewDialog() {
        AddressOrder address;
        LatLng latLng;
        FragmentManager supportFragmentManager;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        String shippingType = getOrderTrackingResponse.getShippingType();
        if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
            TrackingOrderMapViewDialogFragment.Companion companion = TrackingOrderMapViewDialogFragment.Companion;
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            TrackingOrderMapViewDialogFragment newInstance = companion.newInstance(getOrderTrackingResponse2);
            FragmentActivity activity = getActivity();
            if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it");
                newInstance.show(supportFragmentManager, (String) null);
            }
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP()) || Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
            GetOrderTrackingResponse getOrderTrackingResponse3 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            Shop shop = getOrderTrackingResponse3.getShop();
            if (shop != null && (address = shop.getAddress()) != null && (latLng = address.getLatLng()) != null) {
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                OrderExtsKt.openExternalDirectionApp(requireContext, latLng);
            }
        }
    }

    private final void initTotalOrder() {
        Payment payment;
        View findViewById;
        TLTextView tLTextView;
        View findViewById2;
        TextView textView;
        View findViewById3;
        TextView textView2;
        LinearLayout linearLayout;
        View view = this.mRootView;
        if (!(view == null || (linearLayout = (LinearLayout) view.findViewById(R.id.layout_calculate_order)) == null)) {
            linearLayout.removeAllViews();
        }
        View view2 = this.mRootView;
        if (!(view2 == null || (findViewById3 = view2.findViewById(R.id.layout_total_header)) == null || (textView2 = (TextView) findViewById3.findViewById(R.id.txt_option_name)) == null)) {
            textView2.setText(getString(R.string.str_total));
        }
        View view3 = this.mRootView;
        if (!(view3 == null || (findViewById2 = view3.findViewById(R.id.layout_total_header)) == null || (textView = (TextView) findViewById2.findViewById(R.id.txt_option_desc)) == null)) {
            textView.setVisibility(8);
        }
        View view4 = this.mRootView;
        if (!(view4 == null || (findViewById = view4.findViewById(R.id.layout_total_header)) == null || (tLTextView = (TLTextView) findViewById.findViewById(R.id.txt_option_must_have)) == null)) {
            tLTextView.setVisibility(8);
        }
        String string = getString(R.string.str_total);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_total)");
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        setCalculateItem(string, getOrderTrackingResponse.getTotalStr());
        GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        List<Adjustment> adjustments = getOrderTrackingResponse2.getAdjustments();
        if (adjustments != null) {
            for (Adjustment adjustment : adjustments) {
                if (!Intrinsics.areEqual(adjustment.getId(), FirebaseAnalytics.Param.COUPON)) {
                    setCalculateItem(String.valueOf(adjustment.getName()), adjustment.getPriceStr());
                }
            }
        }
        GetOrderTrackingResponse getOrderTrackingResponse3 = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        List<Adjustment> adjustments2 = getOrderTrackingResponse3.getAdjustments();
        Adjustment adjustment2 = null;
        if (adjustments2 != null) {
            Iterator<T> it = adjustments2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (Intrinsics.areEqual(next.getId(), FirebaseAnalytics.Param.COUPON)) {
                    adjustment2 = next;
                    break;
                }
            }
            adjustment2 = adjustment2;
        }
        setCalculateDiscountItem(adjustment2);
        GetOrderTrackingResponse getOrderTrackingResponse4 = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        setCalculatePayAfterDiscountItem(getOrderTrackingResponse4.getAfterDiscount());
        GetOrderTrackingResponse getOrderTrackingResponse5 = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        List<Payment> payments = getOrderTrackingResponse5.getPayments();
        if (!(payments == null || (payment = (Payment) CollectionsKt.firstOrNull((List) payments)) == null)) {
            setPaymentMethod(payment);
        }
    }

    private final void setPaymentMethod(Payment payment) {
        LinearLayout linearLayout;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
        TextView textView = (TextView) inflate.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(textView, "title");
        textView.setText(payment.getText());
        Glide.with(requireContext()).load(payment.getImage()).into(new TrackingOrderDialogFragment$setPaymentMethod$1(textView, ViewExtsKt.DPtoPX(20.0f), ViewExtsKt.DPtoPX(20.0f)));
        View findViewById = inflate.findViewById(R.id.view_line_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layoutCalculateOrderItem…>(R.id.view_line_divider)");
        findViewById.setVisibility(8);
        View view = this.mRootView;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.layout_calculate_order)) != null) {
            linearLayout.addView(inflate);
        }
    }

    /* access modifiers changed from: public */
    private final void initViews() {
        View rootView = getRootView();
        ViewStub viewStub = rootView != null ? (ViewStub) rootView.findViewById(R.id.view_stub_fragment) : null;
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.fragment_tracking_order);
            viewStub.setOnInflateListener(new TrackingOrderDialogFragment$initViews$$inlined$let$lambda$1(this));
            viewStub.inflate();
        }
    }

    private final void initToolbar() {
        View findViewById;
        TextView textView;
        View findViewById2;
        ImageView imageView;
        View findViewById3;
        ImageView imageView2;
        View findViewById4;
        ImageView imageView3;
        View findViewById5;
        ImageView imageView4;
        View rootView = getRootView();
        if (!(rootView == null || (findViewById5 = rootView.findViewById(R.id.toolbar)) == null || (imageView4 = (ImageView) findViewById5.findViewById(R.id.img_right_icon)) == null)) {
            imageView4.setVisibility(0);
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById4 = rootView2.findViewById(R.id.toolbar)) == null || (imageView3 = (ImageView) findViewById4.findViewById(R.id.img_right_icon)) == null)) {
            imageView3.setImageResource(R.drawable.ic_close_bottom_sheet);
        }
        View rootView3 = getRootView();
        if (!(rootView3 == null || (findViewById3 = rootView3.findViewById(R.id.toolbar)) == null || (imageView2 = (ImageView) findViewById3.findViewById(R.id.img_right_icon)) == null)) {
            imageView2.setOnClickListener(new TrackingOrderDialogFragment$initToolbar$1(this));
        }
        View rootView4 = getRootView();
        if (!(rootView4 == null || (findViewById2 = rootView4.findViewById(R.id.toolbar)) == null || (imageView = (ImageView) findViewById2.findViewById(R.id.img_back)) == null)) {
            imageView.setVisibility(4);
        }
        View rootView5 = getRootView();
        if (rootView5 != null && (findViewById = rootView5.findViewById(R.id.toolbar)) != null && (textView = (TextView) findViewById.findViewById(R.id.txt_title_sub_screen)) != null) {
            textView.setText(getString(R.string.str_order_status));
        }
    }

    private final void setCalculateDiscountItem(Adjustment adjustment) {
        LinearLayout linearLayout;
        if (adjustment != null) {
            View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
            View findViewById = inflate.findViewById(R.id.txt_title_price);
            Intrinsics.checkNotNullExpressionValue(findViewById, "layoutCalculateOrderItem…ew>(R.id.txt_title_price)");
            TextView textView = (TextView) findViewById;
            TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
            textViewAttributeArr[0] = new TextViewAttribute(getString(R.string.str_select_promotion) + "\n", Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color2D72D2), Integer.valueOf((int) R.font.sfpd_regular));
            String name = adjustment.getName();
            if (name == null) {
                name = getString(R.string.str_discount_click_to_choose);
                Intrinsics.checkNotNullExpressionValue(name, "getString(R.string.str_discount_click_to_choose)");
            }
            textViewAttributeArr[1] = new TextViewAttribute(name, Integer.valueOf((int) R.dimen._14sp), Integer.valueOf((int) R.color.color838387), Integer.valueOf((int) R.font.sfpd_regular));
            TLTextViewKt.setTextMultipleFonts(textView, textViewAttributeArr);
            View findViewById2 = inflate.findViewById(R.id.txt_price_amount);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "layoutCalculateOrderItem…w>(R.id.txt_price_amount)");
            ViewExtsKt.formatHtmlCompact((TextView) findViewById2, adjustment.getPriceStr());
            ((TextView) inflate.findViewById(R.id.txt_price_amount)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            View view = this.mRootView;
            if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.layout_calculate_order)) != null) {
                linearLayout.addView(inflate);
            }
        }
    }

    private final void setCalculateItem(String str, String str2) {
        LinearLayout linearLayout;
        View inflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
        View findViewById = inflate.findViewById(R.id.txt_title_price);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layoutCalculateOrderItem…ew>(R.id.txt_title_price)");
        ((TextView) findViewById).setText(str);
        TextView textView = (TextView) inflate.findViewById(R.id.txt_price_amount);
        Intrinsics.checkNotNullExpressionValue(textView, "it");
        ViewExtsKt.formatHtmlCompact(textView, str2);
        View view = this.mRootView;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.layout_calculate_order)) != null) {
            linearLayout.addView(inflate);
        }
    }

    private final void setCalculatePayAfterDiscountItem(Integer num) {
        LinearLayout linearLayout;
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
        View view = this.mRootView;
        if (view != null && (linearLayout = (LinearLayout) view.findViewById(R.id.layout_calculate_order)) != null) {
            linearLayout.addView(inflate);
        }
    }

    /* access modifiers changed from: public */
    private final void showBottomSheetCancelOrder() {
        CancelOrderDialogFragment newInstance = CancelOrderDialogFragment.Companion.newInstance(getMOrderViewModel().getCancelReasons(), new TrackingOrderDialogFragment$showBottomSheetCancelOrder$bottomSheetDialog$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: public */
    private final void ratingOrder() {
        RatingOrderDetailDialogFragment.Companion companion = RatingOrderDetailDialogFragment.Companion;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        String ref = getOrderTrackingResponse.getRef();
        GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        RatingOrderDetailDialogFragment newInstance = companion.newInstance(ref, getOrderTrackingResponse2.getOrderType(), 0, new TrackingOrderDialogFragment$ratingOrder$ratingOrderDetailDialogFragment$1(this));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    private final boolean ratingAppFlowIsSufficient() {
        return getMOrderViewModel().ratingAppFlowIsSufficient();
    }

    public final void reloadData() {
        if (getContext() != null) {
            try {
                getMOrderViewModel().getOrderTracking(this.orderRef, this.orderType).observe(this, this.mObserverRefreshOrderTracking);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
