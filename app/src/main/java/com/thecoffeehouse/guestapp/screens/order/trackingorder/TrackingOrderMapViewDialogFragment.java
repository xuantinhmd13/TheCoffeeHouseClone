package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.os.BundleKt;
import com.facebook.appevents.UserDataStore;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.maps.android.SphericalUtil;
import com.google.maps.android.ui.IconGenerator;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrderTrackingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shipper;
import com.thecoffeehouse.guestapp.services.api.model.orders.Shop;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageButton;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 B2\u00020\u00012\u00020\u0002:\u0002BCB\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\b\u0010\u0019\u001a\u00020\u0016H\u0002J\b\u0010\u001a\u001a\u00020\u0016H\u0002J\u0018\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0018H\u0002J$\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\u00180\u001f2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0018H\u0002J\b\u0010$\u001a\u00020\u0016H\u0002J\n\u0010%\u001a\u0004\u0018\u00010&H\u0016J\b\u0010'\u001a\u00020\u0016H\u0002J\u001a\u0010(\u001a\u00020\u00162\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0014J\b\u0010-\u001a\u00020.H\u0002J\b\u0010/\u001a\u00020\"H\u0016J\u0012\u00100\u001a\u00020\u00162\b\u0010+\u001a\u0004\u0018\u00010,H\u0016J\b\u00101\u001a\u00020\u0016H\u0016J\u0012\u00102\u001a\u00020\u00162\b\u00103\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u00104\u001a\u00020\u0016H\u0016J\b\u00105\u001a\u00020\u0016H\u0016J\b\u00106\u001a\u00020\u0016H\u0016J\b\u00107\u001a\u00020\u0016H\u0002J.\u00108\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u00112\u0006\u00109\u001a\u00020:2\u0006\u0010;\u001a\u00020:2\f\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160=H\u0002J\b\u0010>\u001a\u00020\u0016H\u0002J\b\u0010?\u001a\u00020\u0016H\u0002J\b\u0010@\u001a\u00020\u0016H\u0002J\b\u0010A\u001a\u00020\u0016H\u0002R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006D"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "mAnimatedMarkerHandler", "Landroid/os/Handler;", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mOrderTrackingResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingResponse;", "mOrderViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getMOrderViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "mOrderViewModel$delegate", "Lkotlin/Lazy;", "mShipperMarker", "Lcom/google/android/gms/maps/model/Marker;", "mUpdateShipperLocationHandler", "periodicUpdate", "Ljava/lang/Runnable;", "addDeliveryAndShipperMarker", "", "shipperLocation", "Lcom/google/android/gms/maps/model/LatLng;", "addDeliveryAndStoreMarkers", "addStoreMarker", "animateMarkerV2", "marker", "destination", "createMarkerPair", "Lkotlin/Pair;", "Lcom/google/maps/android/ui/IconGenerator;", "icon", "", "latLng", "fakeShipperDelivering", "getAnalyticScreenName", "", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "isShipperDelivering", "", "layoutResId", "onCreate", "onDestroy", "onMapReady", "p0", "onPause", "onResume", "onStop", "relocateGoogleMapWatermark", "rotateMarker", "toRotation", "", UserDataStore.STATE, "onCompleted", "Lkotlin/Function0;", "setupGoogleMapStyle", "updateShipperLocationFrequently", "zoomMapToAddressLocation", "zoomToMarker", "Companion", "LatLngInterpolator", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: TrackingOrderMapViewDialogFragment.kt */
public final class TrackingOrderMapViewDialogFragment extends BaseBottomSheetDialogFragment implements OnMapReadyCallback {
    public static final Companion Companion = new Companion(null);
    private static final String ORDER_TRACKING_KEY = "order_tracking_key";
    private HashMap _$_findViewCache;
    private Handler mAnimatedMarkerHandler = new Handler();
    private GoogleMap mGoogleMap;
    private GetOrderTrackingResponse mOrderTrackingResponse;
    private final Lazy mOrderViewModel$delegate = LazyKt.lazy(new TrackingOrderMapViewDialogFragment$mOrderViewModel$2(this));
    private Marker mShipperMarker;
    private Handler mUpdateShipperLocationHandler = new Handler();
    private Runnable periodicUpdate;

    /* access modifiers changed from: private */
    public final OrderViewModel getMOrderViewModel() {
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
    public String getAnalyticScreenName() {
        return null;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.layout_bottom_sheet_order_tracking_map_view;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ GetOrderTrackingResponse access$getMOrderTrackingResponse$p(TrackingOrderMapViewDialogFragment trackingOrderMapViewDialogFragment) {
        GetOrderTrackingResponse getOrderTrackingResponse = trackingOrderMapViewDialogFragment.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        return getOrderTrackingResponse;
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            GetOrderTrackingResponse getOrderTrackingResponse = (GetOrderTrackingResponse) arguments.getParcelable(ORDER_TRACKING_KEY);
            if (getOrderTrackingResponse == null) {
                getOrderTrackingResponse = new GetOrderTrackingResponse();
            }
            this.mOrderTrackingResponse = getOrderTrackingResponse;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        View findViewById;
        MapView mapView;
        View findViewById2;
        TLImageButton tLImageButton;
        View findViewById3;
        TLImageButton tLImageButton2;
        View findViewById4;
        TLImageButton tLImageButton3;
        View findViewById5;
        MapView mapView2;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        View rootView = getRootView();
        if (!(rootView == null || (findViewById5 = rootView.findViewById(R.id.layout_map_view)) == null || (mapView2 = (MapView) findViewById5.findViewById(R.id.map_view)) == null)) {
            mapView2.onCreate(bundle);
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById4 = rootView2.findViewById(R.id.layout_map_view)) == null || (tLImageButton3 = (TLImageButton) findViewById4.findViewById(R.id.btn_my_location)) == null)) {
            tLImageButton3.setVisibility(8);
        }
        View rootView3 = getRootView();
        if (!(rootView3 == null || (findViewById3 = rootView3.findViewById(R.id.layout_map_view)) == null || (tLImageButton2 = (TLImageButton) findViewById3.findViewById(R.id.btn_zoom_in)) == null)) {
            tLImageButton2.setVisibility(8);
        }
        View rootView4 = getRootView();
        if (!(rootView4 == null || (findViewById2 = rootView4.findViewById(R.id.layout_map_view)) == null || (tLImageButton = (TLImageButton) findViewById2.findViewById(R.id.btn_zoom_out)) == null)) {
            tLImageButton.setVisibility(8);
        }
        View rootView5 = getRootView();
        if (rootView5 != null && (findViewById = rootView5.findViewById(R.id.layout_map_view)) != null && (mapView = (MapView) findViewById.findViewById(R.id.map_view)) != null) {
            mapView.getMapAsync(this);
        }
    }

    private final void initToolbar() {
        View findViewById;
        ImageView imageView;
        View findViewById2;
        ImageView imageView2;
        View findViewById3;
        ImageView imageView3;
        View rootView;
        View findViewById4;
        TextView textView;
        View findViewById5;
        TextView textView2;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        String shippingType = getOrderTrackingResponse.getShippingType();
        if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
            View rootView2 = getRootView();
            if (!(rootView2 == null || (findViewById5 = rootView2.findViewById(R.id.toolbar)) == null || (textView2 = (TextView) findViewById5.findViewById(R.id.txt_title_sub_screen)) == null)) {
                textView2.setText(getString(R.string.str_view_the_order));
            }
        } else if (!(!Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP()) || (rootView = getRootView()) == null || (findViewById4 = rootView.findViewById(R.id.toolbar)) == null || (textView = (TextView) findViewById4.findViewById(R.id.txt_title_sub_screen)) == null)) {
            textView.setText(getString(R.string.str_store_location));
        }
        View rootView3 = getRootView();
        if (!(rootView3 == null || (findViewById3 = rootView3.findViewById(R.id.toolbar)) == null || (imageView3 = (ImageView) findViewById3.findViewById(R.id.img_right_icon)) == null)) {
            imageView3.setVisibility(0);
        }
        View rootView4 = getRootView();
        if (!(rootView4 == null || (findViewById2 = rootView4.findViewById(R.id.toolbar)) == null || (imageView2 = (ImageView) findViewById2.findViewById(R.id.img_right_icon)) == null)) {
            imageView2.setImageResource(R.drawable.ic_close_bottom_sheet);
        }
        View rootView5 = getRootView();
        if (rootView5 != null && (findViewById = rootView5.findViewById(R.id.toolbar)) != null && (imageView = (ImageView) findViewById.findViewById(R.id.img_right_icon)) != null) {
            imageView.setOnClickListener(new TrackingOrderMapViewDialogFragment$initToolbar$1(this));
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        UiSettings uiSettings;
        View findViewById;
        MapView mapView;
        View rootView = getRootView();
        if (!(rootView == null || (findViewById = rootView.findViewById(R.id.layout_map_view)) == null || (mapView = (MapView) findViewById.findViewById(R.id.map_view)) == null)) {
            mapView.onResume();
        }
        GeneralKt.log("onMapReady: " + googleMap);
        this.mGoogleMap = googleMap;
        if (!(googleMap == null || (uiSettings = googleMap.getUiSettings()) == null)) {
            uiSettings.setAllGesturesEnabled(false);
        }
        setupGoogleMapStyle();
        GoogleMap googleMap2 = this.mGoogleMap;
        if (googleMap2 != null) {
            googleMap2.setOnMapLoadedCallback(new TrackingOrderMapViewDialogFragment$onMapReady$1(this));
        }
    }

    private final void setupGoogleMapStyle() {
        try {
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap != null) {
                googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(getContext(), R.raw.tch_map_style));
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void zoomMapToAddressLocation() {
        try {
            zoomToMarker();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: private */
    public final void relocateGoogleMapWatermark() {
        View findViewById;
        MapView mapView;
        View rootView = getRootView();
        ViewGroup.LayoutParams layoutParams = null;
        View findViewWithTag = (rootView == null || (findViewById = rootView.findViewById(R.id.layout_map_view)) == null || (mapView = (MapView) findViewById.findViewById(R.id.map_view)) == null) ? null : mapView.findViewWithTag("GoogleWatermark");
        if (findViewWithTag != null) {
            layoutParams = findViewWithTag.getLayoutParams();
        }
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
        layoutParams2.addRule(12, 0);
        layoutParams2.addRule(9, 0);
        layoutParams2.addRule(20, 0);
        layoutParams2.addRule(10, -1);
        layoutParams2.addRule(21, -1);
        findViewWithTag.setLayoutParams(layoutParams2);
    }

    private final void zoomToMarker() {
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        String shippingType = getOrderTrackingResponse.getShippingType();
        if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getDELI())) {
            if (isShipperDelivering()) {
                GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
                if (getOrderTrackingResponse2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
                }
                Shipper shipper = getOrderTrackingResponse2.getShipper();
                LocationStore locationStore = shipper != null ? shipper.getLocationStore() : null;
                Intrinsics.checkNotNull(locationStore);
                addDeliveryAndShipperMarker(locationStore.getLatLng());
                updateShipperLocationFrequently();
                return;
            }
            addDeliveryAndStoreMarkers();
        } else if (Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getPICKUP()) || Intrinsics.areEqual(shippingType, ShippingType.INSTANCE.getTABLE())) {
            addStoreMarker();
        }
    }

    private final void fakeShipperDelivering() {
        LatLng latLng;
        AddressOrder address;
        LocationStore locationStore;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        Shipper shipper = getOrderTrackingResponse.getShipper();
        if (shipper == null || (locationStore = shipper.getLocationStore()) == null || (latLng = locationStore.getLatLng()) == null) {
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            Shop shop = getOrderTrackingResponse2.getShop();
            latLng = (shop == null || (address = shop.getAddress()) == null) ? null : address.getLatLng();
            Intrinsics.checkNotNull(latLng);
        }
        addDeliveryAndShipperMarker(latLng);
        updateShipperLocationFrequently();
    }

    private final void updateShipperLocationFrequently() {
        Long shipperFreq;
        MainActivity mainActivity = getMainActivity();
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        GetMetadataResponse value = ((TCHApplication) application).m0getMetadata().getValue();
        TrackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1 trackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1 = new TrackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1(this, (value == null || (shipperFreq = value.getShipperFreq()) == null) ? 5 : shipperFreq.longValue());
        this.periodicUpdate = trackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1;
        Handler handler = this.mUpdateShipperLocationHandler;
        if (handler != null) {
            Intrinsics.checkNotNull(trackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1);
            handler.postDelayed(trackingOrderMapViewDialogFragment$updateShipperLocationFrequently$1, 1000);
        }
    }

    private final void addDeliveryAndShipperMarker(LatLng latLng) {
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            MapViewInteraction.Companion companion = MapViewInteraction.Companion;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            BitmapDescriptor fromBitmap = BitmapDescriptorFactory.fromBitmap(companion.generateIcon(requireContext, R.drawable.ic_marker_shipper).makeIcon());
            GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            AddressOrder address = getOrderTrackingResponse.getAddress();
            LatLng latLng2 = null;
            LatLng latLng3 = address != null ? address.getLatLng() : null;
            Intrinsics.checkNotNull(latLng3);
            this.mShipperMarker = googleMap.addMarker(new MarkerOptions().position(latLng).flat(true).anchor(0.5f, 0.5f).rotation((float) SphericalUtil.computeHeading(latLng, latLng3)).icon(fromBitmap));
            MapViewInteraction.Companion companion2 = MapViewInteraction.Companion;
            Context requireContext2 = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext2, "requireContext()");
            IconGenerator generateIcon = companion2.generateIcon(requireContext2, R.drawable.ic_confirm_user_location);
            MarkerOptions markerOptions = new MarkerOptions();
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            AddressOrder address2 = getOrderTrackingResponse2.getAddress();
            LatLng latLng4 = address2 != null ? address2.getLatLng() : null;
            Intrinsics.checkNotNull(latLng4);
            googleMap.addMarker(markerOptions.position(latLng4).icon(BitmapDescriptorFactory.fromBitmap(generateIcon.makeIcon())));
            MapViewInteraction.Companion companion3 = MapViewInteraction.Companion;
            LatLng[] latLngArr = new LatLng[2];
            GetOrderTrackingResponse getOrderTrackingResponse3 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            AddressOrder address3 = getOrderTrackingResponse3.getAddress();
            if (address3 != null) {
                latLng2 = address3.getLatLng();
            }
            Intrinsics.checkNotNull(latLng2);
            latLngArr[0] = latLng2;
            Marker marker = this.mShipperMarker;
            Intrinsics.checkNotNull(marker);
            latLngArr[1] = marker.getPosition();
            MapViewInteraction.Companion.zoomToPositions$default(companion3, googleMap, CollectionsKt.listOf((Object[]) latLngArr), 0, false, 4, null);
        }
    }

    private final void rotateMarker(Marker marker, float f, float f2, Function0<Unit> function0) {
        Handler handler = new Handler();
        long uptimeMillis = SystemClock.uptimeMillis();
        Ref.FloatRef floatRef = new Ref.FloatRef();
        floatRef.element = marker.getRotation();
        handler.post(new TrackingOrderMapViewDialogFragment$rotateMarker$1(uptimeMillis, new LinearInterpolator(), 1500, f, floatRef, marker, handler, function0));
    }

    /* access modifiers changed from: private */
    public final void animateMarkerV2(Marker marker, LatLng latLng) {
        rotateMarker(marker, (float) SphericalUtil.computeHeading(marker.getPosition(), latLng), marker.getRotation(), new TrackingOrderMapViewDialogFragment$animateMarkerV2$1(this, latLng, marker.getPosition(), marker));
    }

    private final void addStoreMarker() {
        AddressOrder address;
        AddressOrder address2;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        Shop shop = getOrderTrackingResponse.getShop();
        LatLng latLng = null;
        if (((shop == null || (address2 = shop.getAddress()) == null) ? null : address2.getLatLng()) != null) {
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            Shop shop2 = getOrderTrackingResponse2.getShop();
            if (!(shop2 == null || (address = shop2.getAddress()) == null)) {
                latLng = address.getLatLng();
            }
            Intrinsics.checkNotNull(latLng);
            Pair<IconGenerator, LatLng> createMarkerPair = createMarkerPair(R.drawable.ic_marker_store, latLng);
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap != null) {
                MapViewInteraction.Companion.addMarkers(googleMap, CollectionsKt.listOf(createMarkerPair), 50);
            }
        }
    }

    private final Pair<IconGenerator, LatLng> createMarkerPair(int i, LatLng latLng) {
        MapViewInteraction.Companion companion = MapViewInteraction.Companion;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        return new Pair<>(companion.generateIcon(requireContext, i), latLng);
    }

    private final void addDeliveryAndStoreMarkers() {
        AddressOrder address;
        AddressOrder address2;
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        AddressOrder address3 = getOrderTrackingResponse.getAddress();
        LatLng latLng = null;
        if ((address3 != null ? address3.getLatLng() : null) != null) {
            GetOrderTrackingResponse getOrderTrackingResponse2 = this.mOrderTrackingResponse;
            if (getOrderTrackingResponse2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
            }
            Shop shop = getOrderTrackingResponse2.getShop();
            if (((shop == null || (address2 = shop.getAddress()) == null) ? null : address2.getLatLng()) != null) {
                GetOrderTrackingResponse getOrderTrackingResponse3 = this.mOrderTrackingResponse;
                if (getOrderTrackingResponse3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
                }
                AddressOrder address4 = getOrderTrackingResponse3.getAddress();
                LatLng latLng2 = address4 != null ? address4.getLatLng() : null;
                Intrinsics.checkNotNull(latLng2);
                Pair<IconGenerator, LatLng> createMarkerPair = createMarkerPair(R.drawable.ic_confirm_user_location, latLng2);
                GetOrderTrackingResponse getOrderTrackingResponse4 = this.mOrderTrackingResponse;
                if (getOrderTrackingResponse4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
                }
                Shop shop2 = getOrderTrackingResponse4.getShop();
                if (!(shop2 == null || (address = shop2.getAddress()) == null)) {
                    latLng = address.getLatLng();
                }
                Intrinsics.checkNotNull(latLng);
                Pair<IconGenerator, LatLng> createMarkerPair2 = createMarkerPair(R.drawable.ic_marker_store, latLng);
                GoogleMap googleMap = this.mGoogleMap;
                if (googleMap != null) {
                    MapViewInteraction.Companion.addMarkers(googleMap, CollectionsKt.listOf((Object[]) new Pair[]{createMarkerPair, createMarkerPair2}), 50);
                }
            }
        }
    }

    private final boolean isShipperDelivering() {
        GetOrderTrackingResponse getOrderTrackingResponse = this.mOrderTrackingResponse;
        if (getOrderTrackingResponse == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOrderTrackingResponse");
        }
        Shipper shipper = getOrderTrackingResponse.getShipper();
        return (shipper != null ? shipper.getLocationStore() : null) != null;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onPause() {
        View findViewById;
        MapView mapView;
        super.onPause();
        View rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.layout_map_view)) != null && (mapView = (MapView) findViewById.findViewById(R.id.map_view)) != null) {
            mapView.onPause();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View findViewById;
        MapView mapView;
        super.onResume();
        View rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.layout_map_view)) != null && (mapView = (MapView) findViewById.findViewById(R.id.map_view)) != null) {
            mapView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onStop() {
        View findViewById;
        MapView mapView;
        super.onStop();
        View rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.layout_map_view)) != null && (mapView = (MapView) findViewById.findViewById(R.id.map_view)) != null) {
            mapView.onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        View findViewById;
        MapView mapView;
        super.onDestroy();
        View rootView = getRootView();
        if (!(rootView == null || (findViewById = rootView.findViewById(R.id.layout_map_view)) == null || (mapView = (MapView) findViewById.findViewById(R.id.map_view)) == null)) {
            mapView.onDestroy();
        }
        Handler handler = this.mAnimatedMarkerHandler;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        Handler handler2 = null;
        this.mAnimatedMarkerHandler = handler2;
        Handler handler3 = this.mUpdateShipperLocationHandler;
        if (handler3 != null) {
            handler3.removeCallbacksAndMessages(null);
        }
        this.mUpdateShipperLocationHandler = handler2;
        this.periodicUpdate = null;
    }

    /* access modifiers changed from: private */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\bb\u0018\u00002\u00020\u0001:\u0001\bJ \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment$LatLngInterpolator;", "", "interpolate", "Lcom/google/android/gms/maps/model/LatLng;", "fraction", "", "a", "b", "LinearFixed", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TrackingOrderMapViewDialogFragment.kt */
    public interface LatLngInterpolator {
        LatLng interpolate(float f, LatLng latLng, LatLng latLng2);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment$LatLngInterpolator$LinearFixed;", "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment$LatLngInterpolator;", "()V", "interpolate", "Lcom/google/android/gms/maps/model/LatLng;", "fraction", "", "a", "b", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: TrackingOrderMapViewDialogFragment.kt */
        public static final class LinearFixed implements LatLngInterpolator {
            @Override // com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderMapViewDialogFragment.LatLngInterpolator
            public LatLng interpolate(float f, LatLng latLng, LatLng latLng2) {
                Intrinsics.checkNotNullParameter(latLng, "a");
                Intrinsics.checkNotNullParameter(latLng2, "b");
                double d = (double) f;
                double d2 = ((latLng2.latitude - latLng.latitude) * d) + latLng.latitude;
                double d3 = latLng2.longitude - latLng.longitude;
                if (Math.abs(d3) > ((double) 180)) {
                    d3 -= Math.signum(d3) * ((double) 360);
                }
                return new LatLng(d2, (d3 * d) + latLng.longitude);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment$Companion;", "", "()V", "ORDER_TRACKING_KEY", "", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/TrackingOrderMapViewDialogFragment;", "orderTrackingResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrderTrackingResponse;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: TrackingOrderMapViewDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final TrackingOrderMapViewDialogFragment newInstance(GetOrderTrackingResponse getOrderTrackingResponse) {
            Intrinsics.checkNotNullParameter(getOrderTrackingResponse, "orderTrackingResponse");
            TrackingOrderMapViewDialogFragment trackingOrderMapViewDialogFragment = new TrackingOrderMapViewDialogFragment();
            trackingOrderMapViewDialogFragment.setArguments(BundleKt.bundleOf(new Pair(TrackingOrderMapViewDialogFragment.ORDER_TRACKING_KEY, getOrderTrackingResponse)));
            return trackingOrderMapViewDialogFragment;
        }
    }
}
