package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.TranslateAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.core.app.ActivityCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageButton;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u000e\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0002J\b\u0010\u0010\u001a\u00020\u000bH\u0002J\u001a\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u000bH\u0003J\u0012\u0010\u0019\u001a\u00020\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007H\u0016J\b\u0010\u001a\u001a\u00020\u000bH\u0002J\u0014\u0010\u001b\u001a\u00020\u000b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u001dJ\b\u0010\u001e\u001a\u00020\u000bH\u0002J\b\u0010\u001f\u001a\u00020\u000bH\u0003J\u0010\u0010 \u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010!\u001a\u00020\u000b2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b0\tX\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/MapPickLocationFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "mDefaultZoomMap", "", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "onSelectAddressSuggestion", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "onSelectOnLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "initGoogleMap", "googleMap", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "mapViewListeners", "onMapReady", "relocateGoogleMapWatermark", "setAutoCompleteSearchResult", "addresses", "Ljava/util/ArrayList;", "setupGoogleMapStyle", "setupMyLocationOnGoogleMap", "slideDown", "slideUp", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MapPickLocationFragment.kt */
public final class MapPickLocationFragment extends BaseFullScreenDialogFragment implements OnMapReadyCallback {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private final float mDefaultZoomMap = 18.0f;
    private GoogleMap mGoogleMap;
    private Function1<? super AddressSuggestion, Unit> onSelectAddressSuggestion = MapPickLocationFragment$onSelectAddressSuggestion$1.INSTANCE;
    private Function1<? super LatLng, Unit> onSelectOnLatLng = MapPickLocationFragment$onSelectOnLatLng$1.INSTANCE;

    @JvmStatic
    public static final MapPickLocationFragment newInstance(Function1<? super LatLng, Unit> function1, Function1<? super AddressSuggestion, Unit> function12) {
        return Companion.newInstance(function1, function12);
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
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

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_map_pick_location;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        if (getRootView() != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_map_view);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_map_view");
            ((MapView) _$_findCachedViewById.findViewById(R.id.map_view)).onCreate(bundle);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_map_view);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_map_view");
            ((MapView) _$_findCachedViewById2.findViewById(R.id.map_view)).getMapAsync(this);
        }
    }

    private final void initToolbar() {
        if (getRootView() != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
            TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
            textView.setText(getString(R.string.str_pick_location));
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
            ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new MapPickLocationFragment$initToolbar$$inlined$apply$lambda$1(this), 1, null);
            View _$_findCachedViewById3 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "toolbar");
            ((ImageView) _$_findCachedViewById3.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_search);
            View _$_findCachedViewById4 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "toolbar");
            ImageView imageView2 = (ImageView) _$_findCachedViewById4.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView2, "toolbar.img_right_icon");
            ViewExtsKt.setTint(imageView2, R.color.colorBlack);
            View _$_findCachedViewById5 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "toolbar");
            ImageView imageView3 = (ImageView) _$_findCachedViewById5.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView3, "toolbar.img_right_icon");
            imageView3.setVisibility(0);
            View _$_findCachedViewById6 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById6, "toolbar");
            ImageView imageView4 = (ImageView) _$_findCachedViewById6.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView4, "toolbar.img_right_icon");
            ContextExtsKt.setOnSafeClickListener$default(imageView4, 0, new MapPickLocationFragment$initToolbar$$inlined$apply$lambda$2(this), 1, null);
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        View _$_findCachedViewById;
        MapView mapView;
        if (!(getRootView() == null || (_$_findCachedViewById = _$_findCachedViewById(R.id.layout_map_view)) == null || (mapView = (MapView) _$_findCachedViewById.findViewById(R.id.map_view)) == null)) {
            mapView.onResume();
        }
        initGoogleMap(googleMap);
        mapViewListeners();
    }

    private final void mapViewListeners() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.getMyAddress(new MapPickLocationFragment$mapViewListeners$1(this));
        }
        getRootView();
        View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_map_view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_map_view");
        TLImageButton tLImageButton = (TLImageButton) _$_findCachedViewById.findViewById(R.id.btn_my_location);
        Intrinsics.checkNotNullExpressionValue(tLImageButton, "layout_map_view.btn_my_location");
        ContextExtsKt.setOnSafeClickListener$default(tLImageButton, 0, new MapPickLocationFragment$mapViewListeners$$inlined$apply$lambda$1(this), 1, null);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.layout_map_view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_map_view");
        TLImageButton tLImageButton2 = (TLImageButton) _$_findCachedViewById2.findViewById(R.id.btn_zoom_in);
        Intrinsics.checkNotNullExpressionValue(tLImageButton2, "layout_map_view.btn_zoom_in");
        tLImageButton2.setVisibility(4);
        View _$_findCachedViewById3 = _$_findCachedViewById(R.id.layout_map_view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_map_view");
        TLImageButton tLImageButton3 = (TLImageButton) _$_findCachedViewById3.findViewById(R.id.btn_zoom_out);
        Intrinsics.checkNotNullExpressionValue(tLImageButton3, "layout_map_view.btn_zoom_out");
        tLImageButton3.setVisibility(4);
        View _$_findCachedViewById4 = _$_findCachedViewById(R.id.layout_map_view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_map_view");
        View findViewById = _$_findCachedViewById4.findViewById(R.id.view_line_divider);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layout_map_view.view_line_divider");
        findViewById.setVisibility(4);
        View _$_findCachedViewById5 = _$_findCachedViewById(R.id.layout_map_view);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById5, "layout_map_view");
        TLImageButton tLImageButton4 = (TLImageButton) _$_findCachedViewById5.findViewById(R.id.btn_zoom_out);
        Intrinsics.checkNotNullExpressionValue(tLImageButton4, "layout_map_view.btn_zoom_out");
        ViewExtsKt.marginBottom(tLImageButton4, ViewExtsKt.DPtoPX(170.0f));
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            googleMap.setOnCameraIdleListener(new MapPickLocationFragment$mapViewListeners$3(this));
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

    private final void relocateGoogleMapWatermark() {
        if (getRootView() != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.layout_map_view);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_map_view");
            View findViewWithTag = ((MapView) _$_findCachedViewById.findViewById(R.id.map_view)).findViewWithTag("GoogleWatermark");
            if (findViewWithTag != null) {
                ViewGroup.LayoutParams layoutParams = findViewWithTag.getLayoutParams();
                Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
                RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) layoutParams;
                layoutParams2.addRule(12, 0);
                layoutParams2.addRule(9, 0);
                layoutParams2.addRule(20, 0);
                layoutParams2.addRule(10, -1);
                layoutParams2.addRule(21, -1);
                findViewWithTag.setLayoutParams(layoutParams2);
            }
        }
    }

    private final void setupMyLocationOnGoogleMap() {
        UiSettings uiSettings;
        if (ActivityCompat.checkSelfPermission(requireContext(), "android.permission.ACCESS_FINE_LOCATION") == 0 || ActivityCompat.checkSelfPermission(requireContext(), "android.permission.ACCESS_COARSE_LOCATION") == 0) {
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap != null) {
                googleMap.setMyLocationEnabled(true);
            }
            GoogleMap googleMap2 = this.mGoogleMap;
            if (googleMap2 != null && (uiSettings = googleMap2.getUiSettings()) != null) {
                uiSettings.setMyLocationButtonEnabled(false);
            }
        }
    }

    private final void initGoogleMap(GoogleMap googleMap) {
        this.mGoogleMap = googleMap;
        setupMyLocationOnGoogleMap();
        setupGoogleMapStyle();
        relocateGoogleMapWatermark();
    }

    public final void setAutoCompleteSearchResult(ArrayList<AddressSuggestion> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "addresses");
        ViewGroup rootView = getRootView();
        PlaceHolderView placeHolderView = null;
        FrameLayout frameLayout = rootView != null ? (FrameLayout) rootView.findViewById(R.id.layout_bottom_suggest_addresses) : null;
        ViewGroup rootView2 = getRootView();
        if (rootView2 != null) {
            placeHolderView = (PlaceHolderView) rootView2.findViewById(R.id.layout_suggest_addresses);
        }
        if (placeHolderView != null) {
            placeHolderView.removeAllViews();
        }
        for (T t : arrayList) {
            ItemRowSearchDeliveryAddress itemRowSearchDeliveryAddress = new ItemRowSearchDeliveryAddress(t, PickLocationDialogV2Kt.getTitleByAddressType(t), t.getFullAddress(), t.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t.getType()), null, new MapPickLocationFragment$setAutoCompleteSearchResult$$inlined$forEach$lambda$1(this, placeHolderView), null);
            if (placeHolderView != null) {
                placeHolderView.addView(itemRowSearchDeliveryAddress);
            }
        }
        if (frameLayout != null) {
            slideUp(frameLayout);
        }
        hideLoading();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J0\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u0006H\u0007¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/MapPickLocationFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/MapPickLocationFragment;", "onSelectLatLng", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onSelectAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: MapPickLocationFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final MapPickLocationFragment newInstance(Function1<? super LatLng, Unit> function1, Function1<? super AddressSuggestion, Unit> function12) {
            Intrinsics.checkNotNullParameter(function1, "onSelectLatLng");
            Intrinsics.checkNotNullParameter(function12, "onSelectAddress");
            MapPickLocationFragment mapPickLocationFragment = new MapPickLocationFragment();
            mapPickLocationFragment.onSelectOnLatLng = function1;
            mapPickLocationFragment.onSelectAddressSuggestion = function12;
            return mapPickLocationFragment;
        }
    }

    private final void slideUp(View view) {
        view.setVisibility(0);
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) view.getHeight(), 0.0f);
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }

    /* access modifiers changed from: private */
    public final void slideDown(View view) {
        TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) view.getHeight());
        translateAnimation.setDuration(300);
        translateAnimation.setFillAfter(true);
        view.startAnimation(translateAnimation);
    }
}
