package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.app.Dialog;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.app.ActivityCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.screens.stores.ItemRowSearchStore;
import com.thecoffeehouse.guestapp.screens.stores.SearchStoreType;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.GetPlaceDescriptionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.PlaceAutoSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import com.thecoffeehouse.guestapp.views.TLImageButton;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0005\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0001LB\u0005¢\u0006\u0002\u0010\u0003J\b\u0010%\u001a\u00020\u0015H\u0002J0\u0010&\u001a\u0012\u0012\u0004\u0012\u00020(0'j\b\u0012\u0004\u0012\u00020(`)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+H\u0002J\b\u0010.\u001a\u00020+H\u0016J\b\u0010/\u001a\u00020\u0015H\u0002J\u0012\u00100\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u00010\nH\u0002J\b\u00102\u001a\u00020\u0015H\u0002J\u001a\u00102\u001a\u00020\u00152\u0006\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0014J\b\u00107\u001a\u000208H\u0016J\b\u00109\u001a\u00020\u0015H\u0002J\b\u0010:\u001a\u00020\u0015H\u0003J\b\u0010;\u001a\u00020\u0015H\u0016J\u0012\u0010<\u001a\u00020\u00152\b\u00101\u001a\u0004\u0018\u00010\nH\u0016J\b\u0010=\u001a\u00020\u0015H\u0016J\b\u0010>\u001a\u00020\u0015H\u0016J\u0012\u0010?\u001a\u00020\u00152\b\u0010@\u001a\u0004\u0018\u00010+H\u0002J\b\u0010A\u001a\u00020\u0015H\u0002J\b\u0010B\u001a\u00020\u0015H\u0002J\b\u0010C\u001a\u00020\u0015H\u0003J\u0010\u0010D\u001a\u00020\u00152\u0006\u0010E\u001a\u00020FH\u0002J\b\u0010G\u001a\u00020\u0015H\u0002J\b\u0010H\u001a\u00020\u0015H\u0002J\b\u0010I\u001a\u00020\u0015H\u0002J\b\u0010J\u001a\u00020\u0015H\u0002J\b\u0010K\u001a\u00020\u0015H\u0002R\u0010\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u000e\u0010\u0007\u001a\u00020\bXD¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000eR\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00110\u000eR\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u0013X.¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0002¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b!\u0010\"¨\u0006M"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "()V", "mAddressTextWatcher", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$mAddressTextWatcher$1", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$mAddressTextWatcher$1;", "mDefaultZoomMap", "", "mGoogleMap", "Lcom/google/android/gms/maps/GoogleMap;", "mMyLocation", "Lcom/google/android/gms/maps/model/LatLng;", "mObserverPlaceDescription", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/GetPlaceDescriptionResponse;", "mObserverSearchAutoComplete", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/PlaceAutoSuggestionResponse;", "mOnPickLocationDone", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "mPickLocation", "mQueryDelayTime", "", "mQueryHandler", "Landroid/os/Handler;", "mSoftKeyboardToggleListener", "Lcom/thecoffeehouse/guestapp/utility/KeyboardUtils$SoftKeyboardToggleListener;", "mTxtPickLocationManually", "Landroid/widget/TextView;", "pickLocationViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "getPickLocationViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "pickLocationViewModel$delegate", "Lkotlin/Lazy;", "changeToPickLocationManually", "createTextAttributesBoldAsQuery", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/views/base/TextViewAttribute;", "Lkotlin/collections/ArrayList;", "fullAddress", "", "queryString", "addressAccent", "getAnalyticScreenName", "initAutoCompleteAddress", "initGoogleMap", "googleMap", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "listenViews", "mapViewListeners", "onDestroyView", "onMapReady", "onPause", "onResume", "queryPlaceAutoSuggestion", "newText", "relocateGoogleMapWatermark", "setupGoogleMapStyle", "setupMyLocationOnGoogleMap", "showEditTextAddress", "prediction", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/Prediction;", "showRecentlySuccessOrders", "switchToInputAddressLayout", "switchToPickLocationLayout", "switchToSearchAddressLayout", "zoomToSelectedPlace", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
public final class PickLocationDialog extends BaseBottomSheetDialogFragment implements OnMapReadyCallback {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private final PickLocationDialog$mAddressTextWatcher$1 mAddressTextWatcher = new PickLocationDialog$mAddressTextWatcher$1(this);
    private final float mDefaultZoomMap = 18.0f;
    private GoogleMap mGoogleMap;
    private LatLng mMyLocation;
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<GetPlaceDescriptionResponse> mObserverPlaceDescription = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new PickLocationDialog$mObserverPlaceDescription$1(this), null, false, false, 14, null);
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<PlaceAutoSuggestionResponse> mObserverSearchAutoComplete = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new PickLocationDialog$mObserverSearchAutoComplete$1(this), null, false, false, 14, null);
    private Function1<? super AddressSuggestion, Unit> mOnPickLocationDone;
    private LatLng mPickLocation;
    private final long mQueryDelayTime = 1000;
    private Handler mQueryHandler = new Handler();
    private final KeyboardUtils.SoftKeyboardToggleListener mSoftKeyboardToggleListener = PickLocationDialog$mSoftKeyboardToggleListener$1.INSTANCE;
    private TextView mTxtPickLocationManually;
    private final Lazy pickLocationViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PickLocationViewModel.class), new PickLocationDialog$$special$$inlined$activityViewModels$1(this), new PickLocationDialog$$special$$inlined$activityViewModels$2(this));

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Status.SUCCESS.ordinal()] = 1;
        }
    }

    /* access modifiers changed from: private */
    public final PickLocationViewModel getPickLocationViewModel() {
        return (PickLocationViewModel) this.pickLocationViewModel$delegate.getValue();
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
        return TrackingScreenService.Shipping_Deli_Address_SearchResult;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.select_location_dialog;
    }

    public static final /* synthetic */ Function1 access$getMOnPickLocationDone$p(PickLocationDialog pickLocationDialog) {
        Function1<? super AddressSuggestion, Unit> function1 = pickLocationDialog.mOnPickLocationDone;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnPickLocationDone");
        }
        return function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog;", "onPickLocationDone", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: PickLocationDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PickLocationDialog newInstance(Function1<? super AddressSuggestion, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onPickLocationDone");
            PickLocationDialog pickLocationDialog = new PickLocationDialog();
            pickLocationDialog.mOnPickLocationDone = function1;
            return pickLocationDialog;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        View findViewById;
        MapView mapView;
        View findViewById2;
        MapView mapView2;
        Window window;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        Dialog dialog = getDialog();
        if (!(dialog == null || (window = dialog.getWindow()) == null)) {
            window.setSoftInputMode(16);
        }
        this.mTxtPickLocationManually = (TextView) view.findViewById(R.id.txt_pick_location_manually);
        initViews();
        View rootView = getRootView();
        if (!(rootView == null || (findViewById2 = rootView.findViewById(R.id.layout_map_view)) == null || (mapView2 = (MapView) findViewById2.findViewById(R.id.map_view)) == null)) {
            mapView2.onCreate(bundle);
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById = rootView2.findViewById(R.id.layout_map_view)) == null || (mapView = (MapView) findViewById.findViewById(R.id.map_view)) == null)) {
            mapView.getMapAsync(this);
        }
        listenViews();
        KeyboardUtils.addKeyboardToggleListener(getMainActivity(), this.mSoftKeyboardToggleListener);
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        View findViewById;
        MapView mapView;
        super.onResume();
        TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventSearchDeliAddress.name);
        View rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.layout_map_view)) != null && (mapView = (MapView) findViewById.findViewById(R.id.map_view)) != null) {
            mapView.onResume();
        }
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        View findViewById;
        MapView mapView;
        View rootView = getRootView();
        if (!(rootView == null || (findViewById = rootView.findViewById(R.id.layout_map_view)) == null || (mapView = (MapView) findViewById.findViewById(R.id.map_view)) == null)) {
            mapView.onResume();
        }
        initGoogleMap(googleMap);
        mapViewListeners();
    }

    private final void initViews() {
        View findViewById;
        SearchView searchView;
        View findViewById2;
        SearchView searchView2;
        View findViewById3;
        TextView textView;
        showRecentlySuccessOrders();
        switchToSearchAddressLayout();
        initAutoCompleteAddress();
        View rootView = getRootView();
        if (!(rootView == null || (findViewById3 = rootView.findViewById(R.id.search_address)) == null || (textView = (TextView) findViewById3.findViewById(R.id.txtClose)) == null)) {
            textView.setVisibility(8);
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById2 = rootView2.findViewById(R.id.search_address)) == null || (searchView2 = (SearchView) findViewById2.findViewById(R.id.searchView)) == null)) {
            searchView2.setQueryHint(getString(R.string.str_input_address_query_hint));
        }
        View rootView3 = getRootView();
        if (!(rootView3 == null || (findViewById = rootView3.findViewById(R.id.search_address)) == null || (searchView = (SearchView) findViewById.findViewById(R.id.searchView)) == null)) {
            searchView.onActionViewExpanded();
        }
        TextView textView2 = this.mTxtPickLocationManually;
        if (textView2 != null) {
            String string = getString(R.string.str_select_location_on_map);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_select_location_on_map)");
            TLTextViewKt.setTextMultipleFonts(textView2, new TextViewAttribute(string, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.color2D72D2), Integer.valueOf((int) R.font.sfpd_bold)));
        }
    }

    private final void listenViews() {
        View rootView = getRootView();
        if (rootView != null) {
            TLButton tLButton = (TLButton) rootView.findViewById(R.id.btn_determine_location);
            Intrinsics.checkNotNullExpressionValue(tLButton, "btn_determine_location");
            ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new PickLocationDialog$listenViews$$inlined$apply$lambda$1(this), 1, null);
            TextView textView = this.mTxtPickLocationManually;
            if (textView != null) {
                ContextExtsKt.setOnSafeClickListener$default(textView, 0, new PickLocationDialog$listenViews$$inlined$apply$lambda$2(rootView, this), 1, null);
            }
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        View findViewById;
        EditText editText;
        View findViewById2;
        MapView mapView;
        View rootView = getRootView();
        if (!(rootView == null || (findViewById2 = rootView.findViewById(R.id.layout_map_view)) == null || (mapView = (MapView) findViewById2.findViewById(R.id.map_view)) == null)) {
            mapView.onDestroy();
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (findViewById = rootView2.findViewById(R.id.layout_input_address_manually)) == null || (editText = (EditText) findViewById.findViewById(R.id.edt_street)) == null)) {
            editText.removeTextChangedListener(this.mAddressTextWatcher);
        }
        KeyboardUtils.removeKeyboardToggleListener(this.mSoftKeyboardToggleListener);
        super.onDestroyView();
        _$_clearFindViewByIdCache();
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

    /* access modifiers changed from: private */
    public final void changeToPickLocationManually() {
        switchToPickLocationLayout();
        new Handler().postDelayed(new PickLocationDialog$changeToPickLocationManually$1(this), 300);
    }

    /* access modifiers changed from: private */
    public final void switchToSearchAddressLayout() {
        View rootView = getRootView();
        if (rootView != null) {
            View findViewById = rootView.findViewById(R.id.search_address);
            Intrinsics.checkNotNullExpressionValue(findViewById, "search_address");
            ((SearchView) findViewById.findViewById(R.id.searchView)).onActionViewExpanded();
            LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_search_text_address);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "layout_search_text_address");
            linearLayout.setVisibility(0);
            FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.layout_map);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "layout_map");
            frameLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "layout_confirm_location");
            relativeLayout.setVisibility(8);
            View findViewById2 = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "layout_input_address_manually");
            findViewById2.setVisibility(8);
            View findViewById3 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "toolbar");
            ImageView imageView = (ImageView) findViewById3.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new PickLocationDialog$switchToSearchAddressLayout$$inlined$apply$lambda$1(this), 1, null);
            View findViewById4 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "toolbar");
            ImageView imageView2 = (ImageView) findViewById4.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView2, "toolbar.img_right_icon");
            imageView2.setVisibility(0);
            View findViewById5 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "toolbar");
            View findViewById6 = findViewById5.findViewById(R.id.view_line_bottom);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "toolbar.view_line_bottom");
            findViewById6.setVisibility(4);
            View findViewById7 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "toolbar");
            ((ImageView) findViewById7.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_close_bottom_sheet);
            View findViewById8 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "toolbar");
            ImageView imageView3 = (ImageView) findViewById8.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView3, "toolbar.img_right_icon");
            ContextExtsKt.setOnSafeClickListener$default(imageView3, 0, new PickLocationDialog$switchToSearchAddressLayout$$inlined$apply$lambda$2(this), 1, null);
            View findViewById9 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById9, "toolbar");
            TextView textView = (TextView) findViewById9.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
            textView.setText(requireContext().getString(R.string.str_enter_your_address));
            ((PlaceHolderView) rootView.findViewById(R.id.phv_address)).addOnScrollListener(new PickLocationDialog$switchToSearchAddressLayout$1$3(rootView));
        }
        TextView textView2 = this.mTxtPickLocationManually;
        if (textView2 != null) {
            textView2.setVisibility(0);
        }
    }

    private final void switchToPickLocationLayout() {
        View rootView = getRootView();
        if (rootView != null) {
            TrackingScreenService.Companion companion = TrackingScreenService.Companion;
            RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "layout_confirm_location");
            companion.logScreenViewByViewId(TrackingScreenService.Shipping_Deli_Address_CustomMap, relativeLayout);
            View findViewById = rootView.findViewById(R.id.search_address);
            Intrinsics.checkNotNullExpressionValue(findViewById, "search_address");
            ((SearchView) findViewById.findViewById(R.id.searchView)).onActionViewCollapsed();
            View findViewById2 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "toolbar");
            TextView textView = (TextView) findViewById2.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
            textView.setText(getString(R.string.str_confirm_your_location));
            View findViewById3 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "toolbar");
            ImageView imageView = (ImageView) findViewById3.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
            imageView.setVisibility(0);
            View findViewById4 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "toolbar");
            ImageView imageView2 = (ImageView) findViewById4.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView2, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new PickLocationDialog$switchToPickLocationLayout$$inlined$apply$lambda$1(this), 1, null);
            LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_search_text_address);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "layout_search_text_address");
            linearLayout.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.layout_map);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "layout_map");
            frameLayout.setVisibility(0);
            RelativeLayout relativeLayout2 = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location);
            Intrinsics.checkNotNullExpressionValue(relativeLayout2, "layout_confirm_location");
            relativeLayout2.setVisibility(0);
            RelativeLayout relativeLayout3 = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location);
            Intrinsics.checkNotNullExpressionValue(relativeLayout3, "layout_confirm_location");
            RelativeLayout relativeLayout4 = relativeLayout3;
            if (!ViewCompat.isLaidOut(relativeLayout4) || relativeLayout4.isLayoutRequested()) {
                relativeLayout4.addOnLayoutChangeListener(new PickLocationDialog$$special$$inlined$doOnLayout$1(rootView));
            } else {
                View findViewById5 = rootView.findViewById(R.id.layout_map_view);
                Intrinsics.checkNotNullExpressionValue(findViewById5, "layout_map_view");
                TLImageButton tLImageButton = (TLImageButton) findViewById5.findViewById(R.id.btn_zoom_out);
                Intrinsics.checkNotNullExpressionValue(tLImageButton, "layout_map_view.btn_zoom_out");
                RelativeLayout relativeLayout5 = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location);
                Intrinsics.checkNotNullExpressionValue(relativeLayout5, "layout_confirm_location");
                ViewExtsKt.marginBottom(tLImageButton, relativeLayout5.getHeight() + ViewExtsKt.DPtoPX(44.0f));
            }
            View findViewById6 = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "layout_input_address_manually");
            findViewById6.setVisibility(8);
            TextView textView2 = (TextView) rootView.findViewById(R.id.txt_pick_location_manually);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_pick_location_manually");
            textView2.setVisibility(8);
        }
    }

    private final void switchToInputAddressLayout() {
        View rootView = getRootView();
        if (rootView != null) {
            TrackingScreenService.Companion companion = TrackingScreenService.Companion;
            View findViewById = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById, "layout_input_address_manually");
            companion.logScreenViewByViewId(TrackingScreenService.Shipping_Deli_Address_CustomMap, findViewById);
            View findViewById2 = rootView.findViewById(R.id.search_address);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "search_address");
            ((SearchView) findViewById2.findViewById(R.id.searchView)).onActionViewCollapsed();
            LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_search_text_address);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "layout_search_text_address");
            linearLayout.setVisibility(8);
            FrameLayout frameLayout = (FrameLayout) rootView.findViewById(R.id.layout_map);
            Intrinsics.checkNotNullExpressionValue(frameLayout, "layout_map");
            frameLayout.setVisibility(8);
            RelativeLayout relativeLayout = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location);
            Intrinsics.checkNotNullExpressionValue(relativeLayout, "layout_confirm_location");
            relativeLayout.setVisibility(8);
            TextView textView = (TextView) rootView.findViewById(R.id.txt_pick_location_manually);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_pick_location_manually");
            textView.setVisibility(8);
            View findViewById3 = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "layout_input_address_manually");
            findViewById3.setVisibility(0);
            View findViewById4 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "toolbar");
            TextView textView2 = (TextView) findViewById4.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView2, "toolbar.txt_title_sub_screen");
            textView2.setText(getString(R.string.str_enter_your_address));
            View findViewById5 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "toolbar");
            ImageView imageView = (ImageView) findViewById5.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
            imageView.setVisibility(0);
            View findViewById6 = rootView.findViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "toolbar");
            ImageView imageView2 = (ImageView) findViewById6.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView2, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new PickLocationDialog$switchToInputAddressLayout$$inlined$apply$lambda$1(this), 1, null);
        }
    }

    private final ArrayList<TextViewAttribute> createTextAttributesBoldAsQuery(String str, String str2, String str3) {
        String str4;
        String str5 = str2;
        ArrayList<TextViewAttribute> arrayList = new ArrayList<>();
        int indexOf = StringsKt.indexOf((CharSequence) str, str5, 0, true);
        int i = R.color.color323232;
        int i2 = R.dimen._17sp;
        try {
            if (str3 != null) {
                String substring = str3.substring(0, indexOf);
                Intrinsics.checkNotNullExpressionValue(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                arrayList.add(new TextViewAttribute(substring, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular)));
                int length = str2.length() + indexOf;
                if (str3 != null) {
                    String substring2 = str3.substring(indexOf, length);
                    Intrinsics.checkNotNullExpressionValue(substring2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    arrayList.add(new TextViewAttribute(substring2, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_bold)));
                    ArrayList arrayListOf = CollectionsKt.arrayListOf(Integer.valueOf(indexOf));
                    int length2 = str2.length() + indexOf;
                    if (str != null) {
                        String substring3 = str.substring(length2);
                        Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                        int length3 = str2.length() + indexOf;
                        if (str3 != null) {
                            String substring4 = str3.substring(length3);
                            Intrinsics.checkNotNullExpressionValue(substring4, "(this as java.lang.String).substring(startIndex)");
                            if (indexOf >= 0) {
                                while (true) {
                                    if (indexOf < 0) {
                                        break;
                                    }
                                    indexOf = StringsKt.indexOf((CharSequence) substring3, str5, 0, true);
                                    if (indexOf >= 0) {
                                        arrayListOf.add(Integer.valueOf(indexOf));
                                        if (substring4 != null) {
                                            String substring5 = substring4.substring(0, indexOf);
                                            Intrinsics.checkNotNullExpressionValue(substring5, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            TextViewAttribute textViewAttribute = new TextViewAttribute(substring5, Integer.valueOf(i2), Integer.valueOf(i), Integer.valueOf((int) R.font.sfpd_regular));
                                            int length4 = str2.length() + indexOf;
                                            if (substring4 != null) {
                                                String substring6 = substring4.substring(indexOf, length4);
                                                Intrinsics.checkNotNullExpressionValue(substring6, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                TextViewAttribute textViewAttribute2 = new TextViewAttribute(substring6, Integer.valueOf(i2), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_bold));
                                                arrayList.add(textViewAttribute);
                                                arrayList.add(textViewAttribute2);
                                                int length5 = str2.length() + indexOf;
                                                if (substring3 != null) {
                                                    substring3 = substring3.substring(length5);
                                                    Intrinsics.checkNotNullExpressionValue(substring3, "(this as java.lang.String).substring(startIndex)");
                                                    int length6 = str2.length() + indexOf;
                                                    if (substring4 != null) {
                                                        substring4 = substring4.substring(length6);
                                                        Intrinsics.checkNotNullExpressionValue(substring4, "(this as java.lang.String).substring(startIndex)");
                                                        str5 = str2;
                                                        i = R.color.color323232;
                                                        i2 = R.dimen._17sp;
                                                    } else {
                                                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                    }
                                                } else {
                                                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                                }
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                            }
                                        } else {
                                            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                        }
                                    } else {
                                        try {
                                            int lastIndex = StringsKt.getLastIndex(substring3) + 1;
                                            if (substring4 != null) {
                                                str4 = substring4.substring(0, lastIndex);
                                                Intrinsics.checkNotNullExpressionValue(str4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                                arrayList.add(new TextViewAttribute(str4, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular)));
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                            }
                                        } catch (Exception unused) {
                                            int lastIndex2 = StringsKt.getLastIndex(substring3);
                                            if (substring4 != null) {
                                                str4 = substring4.substring(0, lastIndex2);
                                                Intrinsics.checkNotNullExpressionValue(str4, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                                            } else {
                                                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                                            }
                                        }
                                    }
                                }
                            }
                            return arrayList;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
                }
                throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
            }
            throw new NullPointerException("null cannot be cast to non-null type java.lang.String");
        } catch (StringIndexOutOfBoundsException unused2) {
            arrayList.add(new TextViewAttribute(str, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular)));
            return arrayList;
        }
    }

    private final void initAutoCompleteAddress() {
        View findViewById;
        SearchView searchView;
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        PickLocationViewModel pickLocationViewModel = getPickLocationViewModel();
        ArrayList<AddressOrder> recentSearchAddresses = pickLocationViewModel != null ? pickLocationViewModel.getRecentSearchAddresses() : null;
        trackingDataArr[0] = new TrackingData("hasRecentAddress", Boolean.valueOf(true ^ (recentSearchAddresses == null || recentSearchAddresses.isEmpty())));
        companion.collectParamWithEventName(ShippingMethodEvents.EventSearchDeliAddress.name, trackingDataArr);
        View rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.search_address)) != null && (searchView = (SearchView) findViewById.findViewById(R.id.searchView)) != null) {
            searchView.setOnQueryTextListener(new PickLocationDialog$initAutoCompleteAddress$1(this));
        }
    }

    private final void initGoogleMap(GoogleMap googleMap) {
        this.mGoogleMap = googleMap;
        setupMyLocationOnGoogleMap();
        setupGoogleMapStyle();
        relocateGoogleMapWatermark();
    }

    private final void mapViewListeners() {
        try {
            FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(requireContext());
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient, "fusedLocation");
            Intrinsics.checkNotNullExpressionValue(fusedLocationProviderClient.getLastLocation().addOnSuccessListener(new PickLocationDialog$mapViewListeners$1(this)).addOnFailureListener(PickLocationDialog$mapViewListeners$2.INSTANCE), "fusedLocation.lastLocati…tackTrace()\n            }");
        } catch (Exception e) {
            e.printStackTrace();
        }
        View rootView = getRootView();
        if (rootView != null) {
            View findViewById = rootView.findViewById(R.id.layout_map_view);
            Intrinsics.checkNotNullExpressionValue(findViewById, "layout_map_view");
            TLImageButton tLImageButton = (TLImageButton) findViewById.findViewById(R.id.btn_my_location);
            Intrinsics.checkNotNullExpressionValue(tLImageButton, "layout_map_view.btn_my_location");
            ContextExtsKt.setOnSafeClickListener$default(tLImageButton, 0, new PickLocationDialog$mapViewListeners$$inlined$apply$lambda$1(this), 1, null);
            View findViewById2 = rootView.findViewById(R.id.layout_map_view);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "layout_map_view");
            TLImageButton tLImageButton2 = (TLImageButton) findViewById2.findViewById(R.id.btn_zoom_in);
            Intrinsics.checkNotNullExpressionValue(tLImageButton2, "layout_map_view.btn_zoom_in");
            ContextExtsKt.setOnSafeClickListener$default(tLImageButton2, 0, new PickLocationDialog$mapViewListeners$$inlined$apply$lambda$2(this), 1, null);
            View findViewById3 = rootView.findViewById(R.id.layout_map_view);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "layout_map_view");
            TLImageButton tLImageButton3 = (TLImageButton) findViewById3.findViewById(R.id.btn_zoom_out);
            Intrinsics.checkNotNullExpressionValue(tLImageButton3, "layout_map_view.btn_zoom_out");
            ContextExtsKt.setOnSafeClickListener$default(tLImageButton3, 0, new PickLocationDialog$mapViewListeners$$inlined$apply$lambda$3(this), 1, null);
        }
    }

    private final void relocateGoogleMapWatermark() {
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

    /* access modifiers changed from: private */
    public final void zoomToSelectedPlace() {
        RelativeLayout relativeLayout;
        TLButton tLButton;
        GoogleMap googleMap;
        if (!(this.mMyLocation == null || (googleMap = this.mGoogleMap) == null)) {
            LatLng latLng = this.mMyLocation;
            Intrinsics.checkNotNull(latLng);
            double d = latLng.latitude;
            LatLng latLng2 = this.mMyLocation;
            Intrinsics.checkNotNull(latLng2);
            googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(new LatLng(d, latLng2.longitude), this.mDefaultZoomMap));
        }
        View rootView = getRootView();
        if (rootView != null && (relativeLayout = (RelativeLayout) rootView.findViewById(R.id.layout_confirm_location)) != null && (tLButton = (TLButton) relativeLayout.findViewById(R.id.btn_determine_location)) != null) {
            ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new PickLocationDialog$zoomToSelectedPlace$2(this), 1, null);
        }
    }

    /* access modifiers changed from: private */
    public final void showEditTextAddress(Prediction prediction) {
        View rootView = getRootView();
        if (rootView != null) {
            TrackingScreenService.Companion companion = TrackingScreenService.Companion;
            View findViewById = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById, "layout_input_address_manually");
            companion.logScreenViewByViewId(TrackingScreenService.Shipping_Deli_Address_CustomNote, findViewById);
            switchToInputAddressLayout();
            View findViewById2 = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "layout_input_address_manually");
            ((EditText) findViewById2.findViewById(R.id.edt_street)).addTextChangedListener(this.mAddressTextWatcher);
            View findViewById3 = rootView.findViewById(R.id.layout_input_address_manually);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "layout_input_address_manually");
            ((EditText) findViewById3.findViewById(R.id.edt_street)).setText(prediction.getFormattedAddress());
            LatLng latLng = this.mPickLocation;
            if (latLng != null) {
                View findViewById4 = rootView.findViewById(R.id.layout_input_address_manually);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "layout_input_address_manually");
                TLButton tLButton = (TLButton) findViewById4.findViewById(R.id.btn_create_new_address);
                Intrinsics.checkNotNullExpressionValue(tLButton, "layout_input_address_man…ly.btn_create_new_address");
                ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new PickLocationDialog$showEditTextAddress$$inlined$apply$lambda$1(latLng, rootView, this, prediction), 1, null);
            }
        }
    }

    /* access modifiers changed from: private */
    public final void queryPlaceAutoSuggestion(String str) {
        this.mQueryHandler.removeCallbacksAndMessages(null);
        this.mQueryHandler.postDelayed(new PickLocationDialog$queryPlaceAutoSuggestion$1(this, str), this.mQueryDelayTime);
    }

    /* access modifiers changed from: private */
    public final void showRecentlySuccessOrders() {
        PlaceHolderView placeHolderView;
        PickLocationViewModel pickLocationViewModel = getPickLocationViewModel();
        Integer num = null;
        ArrayList<AddressOrder> recentSearchAddresses = pickLocationViewModel != null ? pickLocationViewModel.getRecentSearchAddresses() : null;
        StringBuilder append = new StringBuilder().append("recentSearchAddress: ");
        if (recentSearchAddresses != null) {
            num = Integer.valueOf(recentSearchAddresses.size());
        }
        GeneralKt.log(append.append(num.intValue()).toString());
        if (recentSearchAddresses != null && (!recentSearchAddresses.isEmpty())) {
            for (T t : recentSearchAddresses) {
                double latitude = t.getLatitude();
                double longitude = t.getLongitude();
                String street = t.getStreet();
                Object[] array = CollectionsKt.listOf(new TextViewAttribute(street, Integer.valueOf((int) R.dimen._17sp), Integer.valueOf((int) R.color.color323232), Integer.valueOf((int) R.font.sfpd_regular))).toArray(new TextViewAttribute[0]);
                Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
                TextViewAttribute[] textViewAttributeArr = (TextViewAttribute[]) array;
                ItemRowSearchStore itemRowSearchStore = new ItemRowSearchStore(SearchStoreType.RECENTLY_SEARCH, new Store(null, null, null, null, null, street, null, new LocationStore(latitude, longitude), null, false, false, 1887, null), new PickLocationDialog$showRecentlySuccessOrders$$inlined$forEach$lambda$1(this), (TextViewAttribute[]) Arrays.copyOf(textViewAttributeArr, textViewAttributeArr.length));
                View rootView = getRootView();
                if (!(rootView == null || (placeHolderView = (PlaceHolderView) rootView.findViewById(R.id.phv_address)) == null)) {
                    placeHolderView.addView(itemRowSearchStore);
                }
            }
        }
    }
}
