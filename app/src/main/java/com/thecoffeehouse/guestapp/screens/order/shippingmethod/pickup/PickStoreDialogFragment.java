package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.core.content.ContextCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarker;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarkerRenderer;
import com.thecoffeehouse.guestapp.screens.stores.StoresFragment;
import com.thecoffeehouse.guestapp.screens.stores.StoresViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 .2\u00020\u0001:\u0001.B\u0005¢\u0006\u0002\u0010\u0002J$\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0014J\b\u0010\u0011\u001a\u00020\fH\u0002J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u000fH\u0014J\b\u0010\u0014\u001a\u00020\fH\u0016J\b\u0010\u0015\u001a\u00020\fH\u0016J\r\u0010\u0016\u001a\u00020\fH\u0010¢\u0006\u0002\b\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0014J \u0010\u001a\u001a\u00020\f2\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0004j\b\u0012\u0004\u0012\u00020\u000b`\u0006H\u0014J\b\u0010\u001c\u001a\u00020\fH\u0002J\u001a\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0014J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0014J\u0010\u0010%\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u000bH\u0014J\b\u0010&\u001a\u00020\fH\u0016J\u0010\u0010'\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010(\u001a\u00020)H\u0002J \u0010*\u001a\u00020\f2\u0006\u0010+\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u0005H\u0002J\b\u0010-\u001a\u00020\fH\u0002R\"\u0010\u0003\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX.¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u000e¢\u0006\u0002\n\u0000¨\u0006/"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreDialogFragment;", "Lcom/thecoffeehouse/guestapp/screens/stores/StoresFragment;", "()V", "mNearByStoreIds", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mNearbyStoreHeader", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/ItemRowPickStoreHeader;", "onPickStoreDone", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "", "addHeaderItemRow", "recentStoreIds", "", "favouriteStoreIds", "addNearbyStoreHeader", "addStoreItemRow", "store", "animateShowListStores", "animateShowMapStores", "changeViewsToSearchMode", "changeViewsToSearchMode$app_liveRelease", "getAnalyticScreenName", "", "initAllStores", "allStores", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onClickClusterMakerListener", "clusterMarker", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "onClickItemRowStore", "onDestroy", "selectedMarkerCluster", "setupInfoWindowGoogleMap", "Lcom/google/android/gms/maps/GoogleMap$InfoWindowAdapter;", "trackingEventPickupStore", "entryPointsList", "selectedIndex", "updateNearbyStores", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
public final class PickStoreDialogFragment extends StoresFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private ArrayList<Integer> mNearByStoreIds = new ArrayList<>();
    private ItemRowPickStoreHeader mNearbyStoreHeader;
    private Function1<? super Store, Unit> onPickStoreDone = PickStoreDialogFragment$onPickStoreDone$1.INSTANCE;

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, com.thecoffeehouse.guestapp.screens.stores.StoresFragment
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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Shipping_Pickup_StoreList;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, com.thecoffeehouse.guestapp.screens.stores.StoresFragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0003\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreDialogFragment;", "onPickStoreDone", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: PickStoreDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final PickStoreDialogFragment newInstance(Function1<? super Store, Unit> function1) {
            Intrinsics.checkNotNullParameter(function1, "onPickStoreDone");
            PickStoreDialogFragment pickStoreDialogFragment = new PickStoreDialogFragment();
            pickStoreDialogFragment.onPickStoreDone = function1;
            return pickStoreDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void onClickClusterMakerListener(ClusterMarker clusterMarker) {
        Intrinsics.checkNotNullParameter(clusterMarker, "clusterMarker");
        selectedMarkerCluster(clusterMarker);
    }

    private final void selectedMarkerCluster(ClusterMarker clusterMarker) {
        Marker marker;
        MarkerManager.Collection markerCollection;
        ClusterManager<ClusterMarker> mClusterManager = getMapViewInteractions().getMClusterManager();
        if (!(mClusterManager == null || (markerCollection = mClusterManager.getMarkerCollection()) == null)) {
            markerCollection.setInfoWindowAdapter(setupInfoWindowGoogleMap());
        }
        GoogleMap mGoogleMap = getMapViewInteractions().getMGoogleMap();
        if (mGoogleMap != null) {
            mGoogleMap.setOnInfoWindowClickListener(new PickStoreDialogFragment$selectedMarkerCluster$1(this));
        }
        ClusterMarkerRenderer mClusterMarkerRender = getMapViewInteractions().getMClusterMarkerRender();
        if (!(mClusterMarkerRender == null || (marker = mClusterMarkerRender.getMarker(clusterMarker)) == null)) {
            marker.showInfoWindow();
        }
        getSearchLayoutInteractions().getMSearchStoreLayout().clearFocus();
    }

    private final GoogleMap.InfoWindowAdapter setupInfoWindowGoogleMap() {
        return new PickStoreDialogFragment$setupInfoWindowGoogleMap$1(this);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void onClickItemRowStore(Store store) {
        String str;
        Intrinsics.checkNotNullParameter(store, "store");
        this.onPickStoreDone.invoke(store);
        if (store.isFavourite()) {
            str = "Favorite";
        } else if (isRecentStore(store)) {
            str = "Recent";
        } else {
            str = getSearchLayoutInteractions().isSearching() ? "Search" : ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value.List;
        }
        int i = -1;
        List<Object> allViewResolvers = getMPlaceHolderView().getAllViewResolvers();
        Intrinsics.checkNotNullExpressionValue(allViewResolvers, "mPlaceHolderView.allViewResolvers");
        int i2 = 0;
        for (T t : allViewResolvers) {
            int i3 = i2 + 1;
            if (i2 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            if ((t instanceof ItemRowPickStore) && Intrinsics.areEqual(t.getStore().getId(), store.getId())) {
                i = i2;
            }
            i2 = i3;
        }
        trackingEventPickupStore(str, store, i);
        dismiss();
    }

    private final void trackingEventPickupStore(String str, Store store, int i) {
        AddressSuggestion addressSuggestion;
        AddressSuggestion addressSuggestion2;
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        int internetConnectionType = ContextExtsKt.internetConnectionType(requireContext);
        String str2 = internetConnectionType != 0 ? internetConnectionType != 1 ? ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value.No_Network : ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value.Wifi : ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value._3G;
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[7];
        trackingDataArr[0] = new TrackingData("entryPoints", str);
        trackingDataArr[1] = new TrackingData(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Param.isFavStore, Boolean.valueOf(store.isFavourite()));
        trackingDataArr[2] = new TrackingData(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Param.isRecentStore, Boolean.valueOf(isRecentStore(store)));
        trackingDataArr[3] = new TrackingData(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Param.isSearched, Boolean.valueOf(getSearchLayoutInteractions().isSearching()));
        trackingDataArr[4] = new TrackingData("selectedIndex", Integer.valueOf(i));
        StringBuilder sb = new StringBuilder();
        MainActivity mainActivity = getMainActivity();
        Double d = null;
        StringBuilder append = sb.append((mainActivity == null || (addressSuggestion2 = mainActivity.getAddressSuggestion()) == null) ? null : Double.valueOf(addressSuggestion2.getLat())).append(',');
        MainActivity mainActivity2 = getMainActivity();
        if (!(mainActivity2 == null || (addressSuggestion = mainActivity2.getAddressSuggestion()) == null)) {
            d = Double.valueOf(addressSuggestion.getLng());
        }
        trackingDataArr[5] = new TrackingData("userLocation", append.append(d).toString());
        trackingDataArr[6] = new TrackingData(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Param.connection, str2);
        companion.collectParamWithEventName(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name);
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        animateShowMainHeaderLayout();
    }

    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void animateShowListStores() {
        super.animateShowListStores();
        TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.Shipping_Pickup_StoreList, layoutResId());
    }

    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void changeViewsToSearchMode$app_liveRelease() {
        super.changeViewsToSearchMode$app_liveRelease();
        TrackingScreenService.Companion.logScreenViewByViewId(TrackingScreenService.Shipping_Pickup_StoreSearchResult, getSearchStoreInteractions().getMPhvSearchStores$app_liveRelease());
    }

    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void animateShowMapStores() {
        super.animateShowMapStores();
        TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.Shipping_Pickup_StoreMap, R.layout.layout_map);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        getSearchLayoutInteractions().setToggleMarginTop(false);
        ViewExtsKt.marginTop(getSearchLayoutInteractions().getMSearchStoreLayout(), ViewExtsKt.DPtoPX(10.0f));
        getMPlaceHolderView().addOnScrollListener(new PickStoreDialogFragment$initViews$1(this));
    }

    private final void initToolbar() {
        LinearLayout linearLayout = (LinearLayout) getRootView().findViewById(R.id.searchLayout);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "searchLayout");
        linearLayout.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.background_corner_top_solid_white));
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void initAllStores(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "allStores");
        ((StoresViewModel) getViewModel()).fetchPickUpStoreIds().observe(this, new BaseFragment.ObserverBaseResource(this, new PickStoreDialogFragment$initAllStores$1(this, arrayList), null, false, false, 14, null));
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void addHeaderItemRow(List<Integer> list, List<Integer> list2) {
        Intrinsics.checkNotNullParameter(list, "recentStoreIds");
        Intrinsics.checkNotNullParameter(list2, "favouriteStoreIds");
        try {
            updateNearbyStores();
            ArrayList arrayList = new ArrayList();
            for (T t : list) {
                if (true ^ this.mNearByStoreIds.contains(Integer.valueOf(t.intValue()))) {
                    arrayList.add(t);
                }
            }
            ArrayList arrayList2 = arrayList;
            ArrayList arrayList3 = new ArrayList();
            for (T t2 : list2) {
                int intValue = t2.intValue();
                if (!this.mNearByStoreIds.contains(Integer.valueOf(intValue)) && !arrayList2.contains(Integer.valueOf(intValue))) {
                    arrayList3.add(t2);
                }
            }
            super.addHeaderItemRow(arrayList2, arrayList3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void updateNearbyStores() {
        this.mNearByStoreIds.clear();
        ArrayList<Integer> arrayList = this.mNearByStoreIds;
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it = getMStores().iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            Double distance = next.getDistance();
            if ((distance != null ? distance.doubleValue() : Double.MAX_VALUE) >= ((double) 500)) {
                z = false;
            }
            if (z) {
                arrayList2.add(next);
            }
        }
        ArrayList<Store> arrayList3 = arrayList2;
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList3, 10));
        for (Store store : arrayList3) {
            arrayList4.add(store.getId());
        }
        arrayList.addAll(arrayList4);
        if (!this.mNearByStoreIds.isEmpty()) {
            addNearbyStoreHeader();
        }
    }

    private final void addNearbyStoreHeader() {
        try {
            Integer valueOf = Integer.valueOf((int) R.drawable.ic_recently_search);
            String string = getString(R.string.str_nearby_stores);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_nearby_stores)");
            this.mNearbyStoreHeader = new ItemRowPickStoreHeader(valueOf, string);
            PlaceHolderView mPlaceHolderView = getMPlaceHolderView();
            ItemRowPickStoreHeader itemRowPickStoreHeader = this.mNearbyStoreHeader;
            if (itemRowPickStoreHeader == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mNearbyStoreHeader");
            }
            mPlaceHolderView.addView(itemRowPickStoreHeader);
        } catch (Exception e) {
            e.printStackTrace();
            GeneralKt.log(Unit.INSTANCE);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.stores.StoresFragment
    public void addStoreItemRow(Store store, List<Integer> list) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(list, "favouriteStoreIds");
        if (this.mNearByStoreIds.contains(store.getId())) {
            ItemRowPickStore itemRowPickStore = new ItemRowPickStore(store, new PickStoreDialogFragment$addStoreItemRow$itemRowPickStore$1(this));
            try {
                PlaceHolderView mPlaceHolderView = getMPlaceHolderView();
                ItemRowPickStoreHeader itemRowPickStoreHeader = this.mNearbyStoreHeader;
                if (itemRowPickStoreHeader == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mNearbyStoreHeader");
                }
                mPlaceHolderView.addViewAfter(itemRowPickStoreHeader, itemRowPickStore);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        } else {
            super.addStoreItemRow(store, list);
        }
    }
}
