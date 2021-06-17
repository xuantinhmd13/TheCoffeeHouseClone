package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.maps.MapView;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.trackingevents.LocationEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.more.SavedAddressDetailFragment;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestionResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressType;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AutoCompleteAddressResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.map.UserAddressResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0011\u0018\u0000 H2\u00020\u0001:\u0001HB\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010'\u001a\u00020\b2\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070)H\u0002J\u0016\u0010*\u001a\u00020\b2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00070)H\u0002J\b\u0010,\u001a\u00020\bH\u0002J\b\u0010-\u001a\u00020\bH\u0002J\b\u0010.\u001a\u00020\bH\u0002J\b\u0010/\u001a\u00020\bH\u0002J\u001a\u00100\u001a\u00020\b2\u0006\u00101\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u00104\u001a\u00020\"H\u0002J\u0010\u00105\u001a\u00020\"2\u0006\u00106\u001a\u00020\u0007H\u0002J\b\u00107\u001a\u000208H\u0016J\u001a\u00109\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u000b2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\b\u0010;\u001a\u00020\bH\u0016J\u0010\u0010<\u001a\u00020\b2\u0006\u0010=\u001a\u00020\u0007H\u0002J\u0010\u0010>\u001a\u00020\b2\u0006\u00106\u001a\u00020\u0007H\u0002J\u0010\u0010?\u001a\u00020\b2\u0006\u0010@\u001a\u00020\u0004H\u0002J.\u0010A\u001a\u00020\b2\u0006\u0010B\u001a\u00020\u00042\b\b\u0002\u0010C\u001a\u00020\"2\b\b\u0002\u0010D\u001a\u00020\"2\b\b\u0002\u0010E\u001a\u00020\"H\u0002J\b\u0010F\u001a\u00020\bH\u0002J\b\u0010G\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\r\u001a\f\u0012\u0004\u0012\u00020\u000f0\u000eR\u00020\u0001X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u00110\u000eR\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u001b\u001a\u00020\u001cXD¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\"X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010%\u001a\u0004\u0018\u00010&X\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialogV2;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "currentQuerySessionToken", "", "handleClickEditAddress", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "handleClickSelectAddress", "mEmptyScreen", "Landroid/view/View;", "mLayoutMapPickLocation", "mObserveGetPlaceDetailById", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestionResponse;", "mObserveQueryTextSearch", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AutoCompleteAddressResponse;", "mOnSelectAddressListener", "mPhvSearchStore", "Lcom/mindorks/placeholderview/PlaceHolderView;", "mPickLocationViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "getMPickLocationViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "mPickLocationViewModel$delegate", "Lkotlin/Lazy;", "mQueryDelayTime", "", "mQueryHandler", "Landroid/os/Handler;", "mSearchLayout", "Landroid/view/ViewGroup;", "mShowUserAddress", "", "mUserAddresses", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/UserAddressResponse;", "mapPickLocationDialogFragment", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/MapPickLocationFragment;", "addRowItemRecentAddress", "recentAddresses", "Ljava/util/ArrayList;", "addRowItemSavedAddress", "userAddresses", "fetchUserSavedAddress", "hideEmptyScreen", "initPlaceHolderScreen", "initSearchLayout", "initViews", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", "isNotSearching", "isSufficientInfo", "selectedAddress", "layoutResId", "", "listenViewInteractions", "inflated", "onPause", "openSavedAddressDetail", "addressSuggestion", "performSelectAddress", "queryPlaceAutoSuggestion", SearchIntents.EXTRA_QUERY, "sendTrackingChangedAddressSuccessfully", "entryPoint", ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Param.isSavedAddress, ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Param.isRecentAddress, ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Param.isNewAddress, "showEmptyScreen", "showMapPickLocationDialogFragment", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickLocationDialogV2.kt */
public final class PickLocationDialogV2 extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private String currentQuerySessionToken;
    private final Function1<AddressSuggestion, Unit> handleClickEditAddress = new PickLocationDialogV2$handleClickEditAddress$1(this);
    private final Function1<AddressSuggestion, Unit> handleClickSelectAddress = new PickLocationDialogV2$handleClickSelectAddress$1(this);
    private View mEmptyScreen;
    private View mLayoutMapPickLocation;
    private BaseFullScreenDialogFragment.ObserverBaseResource<AddressSuggestionResponse> mObserveGetPlaceDetailById = new BaseFullScreenDialogFragment.ObserverBaseResource<>(this, new PickLocationDialogV2$mObserveGetPlaceDetailById$1(this), null, false, false, 14, null);
    private final BaseFullScreenDialogFragment.ObserverBaseResource<AutoCompleteAddressResponse> mObserveQueryTextSearch = new BaseFullScreenDialogFragment.ObserverBaseResource<>(this, new PickLocationDialogV2$mObserveQueryTextSearch$1(this), null, false, false, 10, null);
    private Function1<? super AddressSuggestion, Unit> mOnSelectAddressListener = PickLocationDialogV2$mOnSelectAddressListener$1.INSTANCE;
    private PlaceHolderView mPhvSearchStore;
    private final Lazy mPickLocationViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PickLocationViewModel.class), new PickLocationDialogV2$$special$$inlined$activityViewModels$1(this), new PickLocationDialogV2$$special$$inlined$activityViewModels$2(this));
    private final long mQueryDelayTime = 300;
    private Handler mQueryHandler = new Handler();
    private ViewGroup mSearchLayout;
    private boolean mShowUserAddress = true;
    private UserAddressResponse mUserAddresses;
    private MapPickLocationFragment mapPickLocationDialogFragment;

    /* access modifiers changed from: private */
    public final PickLocationViewModel getMPickLocationViewModel() {
        return (PickLocationViewModel) this.mPickLocationViewModel$delegate.getValue();
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
        return R.layout.select_location_dialog_v2;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: private */
    public final void performSelectAddress(AddressSuggestion addressSuggestion) {
        MainActivity mainActivity;
        if (addressSuggestion.getType() != AddressType.INSTANCE.getGOOGLE()) {
            this.mOnSelectAddressListener.invoke(getMPickLocationViewModel().fillUserInfo(addressSuggestion));
            MapPickLocationFragment mapPickLocationFragment = this.mapPickLocationDialogFragment;
            if (mapPickLocationFragment != null) {
                mapPickLocationFragment.dismiss();
            }
            dismiss();
        } else if (isSufficientInfo(addressSuggestion) && (mainActivity = getMainActivity()) != null) {
            mainActivity.getMyAddress(new PickLocationDialogV2$performSelectAddress$1(this, addressSuggestion));
        }
    }

    private final boolean isSufficientInfo(AddressSuggestion addressSuggestion) {
        return (addressSuggestion.getPlaceId() == null || this.currentQuerySessionToken == null) ? false : true;
    }

    /* access modifiers changed from: private */
    public final void hideEmptyScreen() {
        View view = this.mEmptyScreen;
        if (view != null) {
            view.setVisibility(8);
        }
    }

    static /* synthetic */ void sendTrackingChangedAddressSuccessfully$default(PickLocationDialogV2 pickLocationDialogV2, String str, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = false;
        }
        pickLocationDialogV2.sendTrackingChangedAddressSuccessfully(str, z, z2, z3);
    }

    private final void sendTrackingChangedAddressSuccessfully(String str, boolean z, boolean z2, boolean z3) {
        TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name, new TrackingData("entryPoints", str), new TrackingData(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Param.isSavedAddress, Boolean.valueOf(z)), new TrackingData(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Param.isRecentAddress, Boolean.valueOf(z2)), new TrackingData(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.Param.isNewAddress, Boolean.valueOf(z3)));
        TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventDeliAddressChangedSuccessfully.name);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mPhvSearchStore = (PlaceHolderView) view.findViewById(R.id.phv_address);
        this.mSearchLayout = (ViewGroup) view.findViewById(R.id.search_address);
        this.mEmptyScreen = view.findViewById(R.id.layout_empty_screen);
        this.mLayoutMapPickLocation = view.findViewById(R.id.layout_map_pick_location);
        initSearchLayout();
        initPlaceHolderScreen();
    }

    /* access modifiers changed from: private */
    public final void initPlaceHolderScreen() {
        if (this.mShowUserAddress && isNotSearching()) {
            if (this.mUserAddresses == null) {
                fetchUserSavedAddress();
            } else {
                PlaceHolderView placeHolderView = this.mPhvSearchStore;
                if (placeHolderView != null) {
                    placeHolderView.removeAllViews();
                }
                UserAddressResponse userAddressResponse = this.mUserAddresses;
                Intrinsics.checkNotNull(userAddressResponse);
                addRowItemSavedAddress(userAddressResponse.getSavedAddresses());
                UserAddressResponse userAddressResponse2 = this.mUserAddresses;
                Intrinsics.checkNotNull(userAddressResponse2);
                addRowItemRecentAddress(userAddressResponse2.getRecentAddresses());
            }
            hideEmptyScreen();
        } else if (!isNotSearching()) {
            showEmptyScreen();
        }
    }

    /* access modifiers changed from: private */
    public final void fetchUserSavedAddress() {
        getMPickLocationViewModel().getUserAddress(true).observe(this, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new PickLocationDialogV2$fetchUserSavedAddress$1(this), null, false, false, 14, null));
    }

    /* access modifiers changed from: private */
    public final void showEmptyScreen() {
        View view = this.mEmptyScreen;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private final void initSearchLayout() {
        ViewGroup rootView = getRootView();
        if (rootView != null) {
            ((ImageView) rootView.findViewById(R.id.img_close)).setOnClickListener(new PickLocationDialogV2$initSearchLayout$$inlined$apply$lambda$1(this));
        }
        View view = this.mLayoutMapPickLocation;
        if (view != null) {
            ContextExtsKt.setOnSafeClickListener$default(view, 0, new PickLocationDialogV2$initSearchLayout$$inlined$apply$lambda$2(this), 1, null);
        }
        ViewGroup viewGroup = this.mSearchLayout;
        if (viewGroup != null) {
            TextView textView = (TextView) viewGroup.findViewById(R.id.txtClose);
            Intrinsics.checkNotNullExpressionValue(textView, "txtClose");
            textView.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void showMapPickLocationDialogFragment() {
        MapPickLocationFragment mapPickLocationFragment;
        this.mapPickLocationDialogFragment = MapPickLocationFragment.Companion.newInstance(new PickLocationDialogV2$showMapPickLocationDialogFragment$1(this, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new PickLocationDialogV2$showMapPickLocationDialogFragment$observeGetPickLocation$1(this), new PickLocationDialogV2$showMapPickLocationDialogFragment$observeGetPickLocation$2(this), false, false, 8, null)), new PickLocationDialogV2$showMapPickLocationDialogFragment$2(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null && (mapPickLocationFragment = this.mapPickLocationDialogFragment) != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            mapPickLocationFragment.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void listenViewInteractions(View view, Bundle bundle) {
        SearchView searchView;
        Intrinsics.checkNotNullParameter(view, "inflated");
        super.listenViewInteractions(view, bundle);
        ViewGroup viewGroup = this.mSearchLayout;
        if (viewGroup != null && (searchView = (SearchView) viewGroup.findViewById(R.id.searchView)) != null) {
            searchView.setOnQueryTextListener(new PickLocationDialogV2$listenViewInteractions$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void queryPlaceAutoSuggestion(String str) {
        this.mQueryHandler.postDelayed(new PickLocationDialogV2$queryPlaceAutoSuggestion$1(this, str), this.mQueryDelayTime);
    }

    /* access modifiers changed from: private */
    public final void addRowItemRecentAddress(ArrayList<AddressSuggestion> arrayList) {
        if (!arrayList.isEmpty()) {
            String string = getString(R.string.str_recent_ordered_addresses);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_recent_ordered_addresses)");
            ItemRowSearchAddressHeader itemRowSearchAddressHeader = new ItemRowSearchAddressHeader(string, PickLocationDialogV2$addRowItemRecentAddress$headerSavedAddress$1.INSTANCE);
            PlaceHolderView placeHolderView = this.mPhvSearchStore;
            if (placeHolderView != null) {
                placeHolderView.addView(itemRowSearchAddressHeader);
            }
            for (T t : arrayList) {
                PlaceHolderView placeHolderView2 = this.mPhvSearchStore;
                if (placeHolderView2 != null) {
                    placeHolderView2.addView(new ItemRowSearchDeliveryAddress(t, PickLocationDialogV2Kt.getTitleByAddressType(t), t.getFullAddress(), t.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t.getType()), Integer.valueOf((int) R.drawable.ic_recent_mark_address), new PickLocationDialogV2$addRowItemRecentAddress$$inlined$forEach$lambda$1(this), new PickLocationDialogV2$addRowItemRecentAddress$$inlined$forEach$lambda$2(this)));
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void addRowItemSavedAddress(ArrayList<AddressSuggestion> arrayList) {
        T t;
        T t2;
        boolean z;
        boolean z2;
        String string = getString(R.string.str_saved_addresses);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_saved_addresses)");
        ItemRowSearchAddressHeader itemRowSearchAddressHeader = new ItemRowSearchAddressHeader(string, PickLocationDialogV2$addRowItemSavedAddress$headerSavedAddress$1.INSTANCE);
        PlaceHolderView placeHolderView = this.mPhvSearchStore;
        if (placeHolderView != null) {
            placeHolderView.addView(itemRowSearchAddressHeader);
        }
        ArrayList<AddressSuggestion> arrayList2 = arrayList;
        Iterator<T> it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == AddressType.INSTANCE.getHOME()) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            PlaceHolderView placeHolderView2 = this.mPhvSearchStore;
            if (placeHolderView2 != null) {
                placeHolderView2.addView(new ItemRowSearchDeliveryAddress(t3, PickLocationDialogV2Kt.getTitleByAddressType(t3), t3.getFullAddress(), t3.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t3.getType()), Integer.valueOf((int) R.drawable.ic_edit_address), new PickLocationDialogV2$addRowItemSavedAddress$1(this), this.handleClickEditAddress));
            }
        } else {
            PlaceHolderView placeHolderView3 = this.mPhvSearchStore;
            if (placeHolderView3 != null) {
                placeHolderView3.addView(new ItemRowAddDeliveryAddress(AddressType.INSTANCE.getHOME(), new PickLocationDialogV2$addRowItemSavedAddress$2(this)));
            }
        }
        Iterator<T> it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (t2.getType() == AddressType.INSTANCE.getWORK()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t4 = t2;
        if (t4 != null) {
            PlaceHolderView placeHolderView4 = this.mPhvSearchStore;
            if (placeHolderView4 != null) {
                placeHolderView4.addView(new ItemRowSearchDeliveryAddress(t4, PickLocationDialogV2Kt.getTitleByAddressType(t4), t4.getFullAddress(), t4.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t4.getType()), Integer.valueOf((int) R.drawable.ic_edit_address), new PickLocationDialogV2$addRowItemSavedAddress$3(this), this.handleClickEditAddress));
            }
        } else {
            PlaceHolderView placeHolderView5 = this.mPhvSearchStore;
            if (placeHolderView5 != null) {
                placeHolderView5.addView(new ItemRowAddDeliveryAddress(AddressType.INSTANCE.getWORK(), new PickLocationDialogV2$addRowItemSavedAddress$4(this)));
            }
        }
        ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = new ItemRowAddDeliveryAddress(AddressType.INSTANCE.getOTHER(), new PickLocationDialogV2$addRowItemSavedAddress$addOtherAddress$1(this));
        PlaceHolderView placeHolderView6 = this.mPhvSearchStore;
        if (placeHolderView6 != null) {
            placeHolderView6.addView(itemRowAddDeliveryAddress);
        }
        ArrayList<AddressSuggestion> arrayList3 = new ArrayList();
        for (T t5 : arrayList2) {
            T t6 = t5;
            if ((t6.getType() == AddressType.INSTANCE.getHOME() || t6.getType() == AddressType.INSTANCE.getWORK()) ? false : true) {
                arrayList3.add(t5);
            }
        }
        for (AddressSuggestion addressSuggestion : arrayList3) {
            PlaceHolderView placeHolderView7 = this.mPhvSearchStore;
            if (placeHolderView7 != null) {
                placeHolderView7.addView(new ItemRowSearchDeliveryAddress(addressSuggestion, PickLocationDialogV2Kt.getTitleByAddressType(addressSuggestion), addressSuggestion.getFullAddress(), addressSuggestion.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(addressSuggestion.getType()), Integer.valueOf((int) R.drawable.ic_edit_address), new PickLocationDialogV2$addRowItemSavedAddress$$inlined$forEach$lambda$1(this), this.handleClickEditAddress));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void openSavedAddressDetail(AddressSuggestion addressSuggestion) {
        ClientManager requireClientManager;
        TrackingEventService.Companion.updateSourceTrackingEvent(LocationEvents.EventCreateNewAddressSubmitted.name, LocationEvents.EventCreateNewAddressSubmitted.Value.SavedAddress);
        TCHApplication tCHApplication = getTCHApplication();
        MainActivity mainActivity = null;
        if (Intrinsics.areEqual((Object) ((tCHApplication == null || (requireClientManager = tCHApplication.requireClientManager()) == null) ? null : Boolean.valueOf(requireClientManager.isLoggedIn())), (Object) true)) {
            SavedAddressDetailFragment newInstance = SavedAddressDetailFragment.Companion.newInstance(addressSuggestion, new PickLocationDialogV2$openSavedAddressDetail$savedAddressDetailFragment$1(this));
            MainActivity mainActivity2 = getMainActivity();
            if (mainActivity2 != null) {
                newInstance.showNow(mainActivity2.getSupportFragmentManager(), null);
                return;
            }
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof MainActivity) {
            mainActivity = activity;
        }
        MainActivity mainActivity3 = mainActivity;
        if (mainActivity3 != null) {
            mainActivity3.runFlowLogin(new PickLocationDialogV2$openSavedAddressDetail$2(this));
        }
    }

    private final boolean isNotSearching() {
        SearchView searchView;
        ViewGroup viewGroup = this.mSearchLayout;
        CharSequence query = (viewGroup == null || (searchView = (SearchView) viewGroup.findViewById(R.id.searchView)) == null) ? null : searchView.getQuery();
        return query == null || query.length() == 0;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        View findViewById;
        MapView mapView;
        super.onPause();
        ViewGroup rootView = getRootView();
        if (rootView != null && (findViewById = rootView.findViewById(R.id.layout_map_view)) != null && (mapView = (MapView) findViewById.findViewById(R.id.map_view)) != null) {
            mapView.onPause();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialogV2$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialogV2;", "showUserAddress", "", "onSelectAddressListener", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: PickLocationDialogV2.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PickLocationDialogV2 newInstance(boolean z, Function1<? super AddressSuggestion, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onSelectAddressListener");
            PickLocationDialogV2 pickLocationDialogV2 = new PickLocationDialogV2();
            pickLocationDialogV2.mShowUserAddress = z;
            pickLocationDialogV2.mOnSelectAddressListener = function1;
            return pickLocationDialogV2;
        }
    }
}
