package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.WriterException;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.QRCodeWriter;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\"\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0016H\u0002J\b\u0010\u0018\u001a\u00020\u0004H\u0016J\b\u0010\u0019\u001a\u00020\nH\u0003J\u001a\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u0016H\u0016J\u0010\u0010 \u001a\u00020\n2\u0006\u0010!\u001a\u00020\"H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\n0\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000e¨\u0006$"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponDetailDialogFragmentV3;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", Constants.FirelogAnalytics.PARAM_CAMPAIGN_ID, "", "couponCode", "mCampaign", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "onSelectCoupon", "Lkotlin/Function1;", "", "viewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "copyBarcodeToClipboard", "createBarcodeBitmap", "Landroid/graphics/Bitmap;", "data", "widthImage", "", "heightImage", "getAnalyticScreenName", "initCoupon", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "selectCoupon", FirebaseAnalytics.Param.COUPON, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Coupon;", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CouponDetailDialogFragmentV3.kt */
public final class CouponDetailDialogFragmentV3 extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private String campaignId;
    private String couponCode;
    private Campaign mCampaign;
    private Function1<? super String, Unit> onSelectCoupon;
    private final Lazy viewModel$delegate = LazyKt.lazy(new CouponDetailDialogFragmentV3$viewModel$2(this));

    private final OrderViewModel getViewModel() {
        return (OrderViewModel) this.viewModel$delegate.getValue();
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
        return "Voucher_Detail";
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.fragment_coupon_detail_v3;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Campaign access$getMCampaign$p(CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        Campaign campaign = couponDetailDialogFragmentV3.mCampaign;
        if (campaign == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
        }
        return campaign;
    }

    public static final /* synthetic */ Function1 access$getOnSelectCoupon$p(CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        Function1<? super String, Unit> function1 = couponDetailDialogFragmentV3.onSelectCoupon;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onSelectCoupon");
        }
        return function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponDetailDialogFragmentV3$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponDetailDialogFragmentV3;", Constants.FirelogAnalytics.PARAM_CAMPAIGN_ID, "", "couponCode", "onSelectCoupon", "Lkotlin/Function1;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CouponDetailDialogFragmentV3.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CouponDetailDialogFragmentV3 newInstance$default(Companion companion, String str, String str2, Function1 function1, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                str2 = null;
            }
            return companion.newInstance(str, str2, function1);
        }

        public final CouponDetailDialogFragmentV3 newInstance(String str, String str2, Function1<? super String, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onSelectCoupon");
            CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3 = new CouponDetailDialogFragmentV3();
            couponDetailDialogFragmentV3.campaignId = str;
            couponDetailDialogFragmentV3.couponCode = str2;
            couponDetailDialogFragmentV3.onSelectCoupon = function1;
            return couponDetailDialogFragmentV3;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        getViewModel().getExistedCouponDetail(this.campaignId, this.couponCode).observe(this, new BaseBottomSheetDialogFragment.ObserverBaseResource(this, new CouponDetailDialogFragmentV3$initViews$1(this), new CouponDetailDialogFragmentV3$initViews$2(this), false, false, 12, null));
    }

    /* access modifiers changed from: private */
    public final void copyBarcodeToClipboard(String str) {
        GeneralKt.log("copyBarcodeToClipboard");
        ClipboardManager clipboardManager = (ClipboardManager) requireContext().getSystemService("clipboard");
        if (clipboardManager != null) {
            String str2 = str;
            clipboardManager.setPrimaryClip(ClipData.newPlainText(str2, str2));
        }
        Toast.makeText(requireContext(), getString(R.string.str_copied) + ": " + str, 0).show();
    }

    /* access modifiers changed from: private */
    public final void selectCoupon(Coupon coupon) {
        GeneralKt.log("select coupon: " + coupon.getBarcode());
        Function1<? super String, Unit> function1 = this.onSelectCoupon;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onSelectCoupon");
        }
        function1.invoke(String.valueOf(coupon.getBarcode()));
        TrackingEventService.Companion.collectParamWithEventName(SelectVoucherEvents.EventApplyAVoucher.name, new TrackingData("voucherID", String.valueOf(coupon.getBarcode())), new TrackingData("daysTilExpired", Long.valueOf(RewardExtsKt.secondToExpiredDate(coupon.getEndTime()))));
        TrackingEventService.Companion.triggerSendTrackingEvent(SelectVoucherEvents.EventApplyAVoucher.name);
        dismiss();
    }

    /* access modifiers changed from: private */
    public final void initCoupon() {
        View rootView = getRootView();
        if (rootView != null) {
            LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_coupon_info);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "layout_coupon_info");
            boolean z = false;
            linearLayout.setVisibility(0);
            TextView textView = (TextView) rootView.findViewById(R.id.txt_brand_name);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_brand_name");
            Campaign campaign = this.mCampaign;
            if (campaign == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
            }
            textView.setText(campaign.getBrand());
            ((ImageView) rootView.findViewById(R.id.img_close)).setOnClickListener(new CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$1(this));
            Campaign campaign2 = this.mCampaign;
            if (campaign2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
            }
            if (Intrinsics.areEqual((Object) campaign2.getAllowOrder(), (Object) true)) {
                LinearLayout linearLayout2 = (LinearLayout) rootView.findViewById(R.id.btn_use_coupon);
                Intrinsics.checkNotNullExpressionValue(linearLayout2, "btn_use_coupon");
                linearLayout2.setVisibility(0);
            } else {
                LinearLayout linearLayout3 = (LinearLayout) rootView.findViewById(R.id.btn_use_coupon);
                Intrinsics.checkNotNullExpressionValue(linearLayout3, "btn_use_coupon");
                linearLayout3.setVisibility(8);
            }
            TextView textView2 = (TextView) rootView.findViewById(R.id.txt_publish_name);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_publish_name");
            Campaign campaign3 = this.mCampaign;
            if (campaign3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
            }
            textView2.setText(campaign3.getTitle());
            TextView textView3 = (TextView) rootView.findViewById(R.id.txt_description);
            Intrinsics.checkNotNullExpressionValue(textView3, "txt_description");
            Campaign campaign4 = this.mCampaign;
            if (campaign4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
            }
            textView3.setText(campaign4.getDescription());
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            Campaign campaign5 = this.mCampaign;
            if (campaign5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
            }
            T t = (T) ((Coupon) CollectionsKt.firstOrNull((List) campaign5.getCoupons()));
            if (t != null) {
                objectRef.element = t;
                Campaign campaign6 = this.mCampaign;
                if (campaign6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
                }
                CouponCodeRecyclerViewAdapter couponCodeRecyclerViewAdapter = new CouponCodeRecyclerViewAdapter(campaign6.getCoupons(), new CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$2(this));
                LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
                RecyclerView recyclerView = (RecyclerView) rootView.findViewById(R.id.rcv_qr_code);
                Intrinsics.checkNotNullExpressionValue(recyclerView, "rcv_qr_code");
                recyclerView.setLayoutManager(linearLayoutManager);
                RecyclerView recyclerView2 = (RecyclerView) rootView.findViewById(R.id.rcv_qr_code);
                Intrinsics.checkNotNullExpressionValue(recyclerView2, "rcv_qr_code");
                recyclerView2.setAdapter(couponCodeRecyclerViewAdapter);
                ViewCompat.setNestedScrollingEnabled((RecyclerView) rootView.findViewById(R.id.rcv_qr_code), false);
                ((RecyclerView) rootView.findViewById(R.id.rcv_qr_code)).addOnScrollListener(new CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$3(rootView, linearLayoutManager, objectRef, this));
                new PagerSnapHelper().attachToRecyclerView((RecyclerView) rootView.findViewById(R.id.rcv_qr_code));
                Campaign campaign7 = this.mCampaign;
                if (campaign7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
                }
                if (campaign7.getCoupons().size() > 1) {
                    ImageView imageView = (ImageView) rootView.findViewById(R.id.btn_left_button);
                    Intrinsics.checkNotNullExpressionValue(imageView, "btn_left_button");
                    imageView.setVisibility(0);
                    ImageView imageView2 = (ImageView) rootView.findViewById(R.id.btn_right_button);
                    Intrinsics.checkNotNullExpressionValue(imageView2, "btn_right_button");
                    imageView2.setVisibility(0);
                } else {
                    ImageView imageView3 = (ImageView) rootView.findViewById(R.id.btn_left_button);
                    Intrinsics.checkNotNullExpressionValue(imageView3, "btn_left_button");
                    imageView3.setVisibility(4);
                    ImageView imageView4 = (ImageView) rootView.findViewById(R.id.btn_right_button);
                    Intrinsics.checkNotNullExpressionValue(imageView4, "btn_right_button");
                    imageView4.setVisibility(4);
                }
                ImageView imageView5 = (ImageView) rootView.findViewById(R.id.btn_left_button);
                Intrinsics.checkNotNullExpressionValue(imageView5, "btn_left_button");
                imageView5.setVisibility(4);
                ((ImageView) rootView.findViewById(R.id.btn_left_button)).setOnClickListener(new CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$4(rootView, objectRef, this));
                ((ImageView) rootView.findViewById(R.id.btn_right_button)).setOnClickListener(new CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$5(rootView, objectRef, this));
                Campaign campaign8 = this.mCampaign;
                if (campaign8 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
                }
                String str = null;
                if (campaign8.getCouponCount() != null) {
                    TextView textView4 = (TextView) rootView.findViewById(R.id.txt_coupon_count);
                    Intrinsics.checkNotNullExpressionValue(textView4, "txt_coupon_count");
                    MainActivity mainActivity = getMainActivity();
                    StringBuilder append = new StringBuilder().append(Intrinsics.stringPlus(mainActivity != null ? mainActivity.getString(R.string.str_total) : null, " "));
                    Campaign campaign9 = this.mCampaign;
                    if (campaign9 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
                    }
                    StringBuilder append2 = new StringBuilder().append(append.append(String.valueOf(campaign9.getCouponCount())).toString() + " ");
                    MainActivity mainActivity2 = getMainActivity();
                    textView4.setText(append2.append(mainActivity2 != null ? mainActivity2.getString(R.string.str_vouchers) : null).toString());
                } else {
                    TextView textView5 = (TextView) rootView.findViewById(R.id.txt_coupon_count);
                    Intrinsics.checkNotNullExpressionValue(textView5, "txt_coupon_count");
                    textView5.setVisibility(8);
                }
                View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_calculate_order_item, (ViewGroup) null, false);
                TextView textView6 = (TextView) inflate.findViewById(R.id.txt_price_amount);
                Intrinsics.checkNotNullExpressionValue(textView6, "txt_price_amount");
                Campaign campaign10 = this.mCampaign;
                if (campaign10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mCampaign");
                }
                ViewExtsKt.formatHtmlCompact(textView6, campaign10.getTimeLeft());
                TextView textView7 = (TextView) inflate.findViewById(R.id.txt_title_price);
                Intrinsics.checkNotNullExpressionValue(textView7, "txt_title_price");
                textView7.setText(getString(R.string.str_expired_date));
                ((LinearLayout) rootView.findViewById(R.id.layout_coupon_info)).addView(inflate);
                Order orderResponse = getViewModel().getOrderResponse();
                ArrayList<OrderLine> orderLines = orderResponse != null ? orderResponse.getOrderLines() : null;
                if (orderLines == null || orderLines.isEmpty()) {
                    z = true;
                }
                if (z) {
                    LinearLayout linearLayout4 = (LinearLayout) rootView.findViewById(R.id.btn_use_coupon);
                    Intrinsics.checkNotNullExpressionValue(linearLayout4, "btn_use_coupon");
                    linearLayout4.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorTextTitle)));
                    TextView textView8 = (TextView) rootView.findViewById(R.id.txt_use_coupon);
                    Intrinsics.checkNotNullExpressionValue(textView8, "txt_use_coupon");
                    textView8.setText(getString(R.string.str_order_now));
                } else {
                    Order orderResponse2 = getViewModel().getOrderResponse();
                    if (orderResponse2 != null) {
                        str = orderResponse2.getCouponCode();
                    }
                    if (Intrinsics.areEqual(str, objectRef.element.getBarcode())) {
                        LinearLayout linearLayout5 = (LinearLayout) rootView.findViewById(R.id.btn_use_coupon);
                        Intrinsics.checkNotNullExpressionValue(linearLayout5, "btn_use_coupon");
                        linearLayout5.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorED5252)));
                        TextView textView9 = (TextView) rootView.findViewById(R.id.txt_use_coupon);
                        Intrinsics.checkNotNullExpressionValue(textView9, "txt_use_coupon");
                        textView9.setText(getString(R.string.str_use_later));
                    } else {
                        LinearLayout linearLayout6 = (LinearLayout) rootView.findViewById(R.id.btn_use_coupon);
                        Intrinsics.checkNotNullExpressionValue(linearLayout6, "btn_use_coupon");
                        linearLayout6.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorTextTitle)));
                        TextView textView10 = (TextView) rootView.findViewById(R.id.txt_use_coupon);
                        Intrinsics.checkNotNullExpressionValue(textView10, "txt_use_coupon");
                        textView10.setText(getString(R.string.str_use_now));
                    }
                }
                LinearLayout linearLayout7 = (LinearLayout) rootView.findViewById(R.id.btn_use_coupon);
                Intrinsics.checkNotNullExpressionValue(linearLayout7, "btn_use_coupon");
                ContextExtsKt.setOnSafeClickListener$default(linearLayout7, 0, new CouponDetailDialogFragmentV3$initCoupon$$inlined$apply$lambda$6(objectRef, this), 1, null);
            }
        }
    }

    private final Bitmap createBarcodeBitmap(String str, int i, int i2) throws WriterException {
        try {
            Hashtable hashtable = new Hashtable();
            hashtable.put(EncodeHintType.ERROR_CORRECTION, ErrorCorrectionLevel.L);
            BitMatrix encode = new QRCodeWriter().encode(str, BarcodeFormat.QR_CODE, i, i2, hashtable);
            Intrinsics.checkNotNullExpressionValue(encode, "codeWriter.encode(\n     …    hintMap\n            )");
            int width = encode.getWidth();
            int height = encode.getHeight();
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.RGB_565);
            for (int i3 = 0; i3 < width; i3++) {
                for (int i4 = 0; i4 < height; i4++) {
                    createBitmap.setPixel(i3, i4, encode.get(i3, i4) ? ViewCompat.MEASURED_STATE_MASK : -1);
                }
            }
            return createBitmap;
        } catch (WriterException e) {
            e.printStackTrace();
            return null;
        }
    }
}
