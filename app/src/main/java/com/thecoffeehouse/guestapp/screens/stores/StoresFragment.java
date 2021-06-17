package com.thecoffeehouse.guestapp.screens.stores;

import android.location.Location;
import android.os.Bundle;
import android.text.Html;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.MapView;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStore;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup.ItemRowPickStoreHeader;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.screens.stores.interaction.SearchLayoutInteraction;
import com.thecoffeehouse.guestapp.screens.stores.interaction.SearchStoreInteraction;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J$\u00109\u001a\u00020:2\f\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00050<2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050<H\u0014J\b\u0010>\u001a\u00020:H\u0014J\u001e\u0010?\u001a\u00020:2\u0006\u0010@\u001a\u00020\u001c2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00050<H\u0014J\u0010\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020\u001cH\u0002J\u0006\u0010C\u001a\u00020:J\b\u0010D\u001a\u00020:H\u0002J\b\u0010E\u001a\u00020:H\u0016J\u0006\u0010F\u001a\u00020:J\b\u0010G\u001a\u00020:H\u0016J\r\u0010H\u001a\u00020:H\u0010¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020:H\u0000¢\u0006\u0002\bKJ\u0018\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020O2\u0006\u0010P\u001a\u00020OH\u0002J\n\u0010Q\u001a\u0004\u0018\u00010RH\u0014J\b\u0010S\u001a\u00020TH\u0016J \u0010U\u001a\u00020:2\u0016\u0010V\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dH\u0014J\u0010\u0010W\u001a\u00020:2\u0006\u0010X\u001a\u00020YH\u0002J\u001a\u0010Z\u001a\u00020:2\u0006\u0010X\u001a\u00020Y2\b\u0010[\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010\\\u001a\u00020\r2\u0006\u0010@\u001a\u00020\u001cH\u0004J\u0017\u0010\\\u001a\u00020\r2\b\u0010]\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010^J\b\u0010_\u001a\u00020\u0005H\u0016J\u001a\u0010`\u001a\u00020:2\u0006\u0010X\u001a\u00020Y2\b\u0010[\u001a\u0004\u0018\u00010\u0019H\u0014J\u001a\u0010a\u001a\u00020:2\u0006\u0010X\u001a\u00020Y2\b\u0010[\u001a\u0004\u0018\u00010\u0019H\u0014J\u0010\u0010b\u001a\u00020:2\u0006\u0010c\u001a\u00020dH\u0014J\u0010\u0010e\u001a\u00020:2\u0006\u0010@\u001a\u00020\u001cH\u0014J\b\u0010f\u001a\u00020:H\u0017J\b\u0010g\u001a\u00020:H\u0016J\b\u0010h\u001a\u00020:H\u0016J\b\u0010i\u001a\u00020:H\u0016J\u0010\u0010j\u001a\u00020:2\u0006\u0010k\u001a\u00020\u0019H\u0016J\b\u0010l\u001a\u00020:H\u0016J\b\u0010m\u001a\u00020:H\u0016J\r\u0010n\u001a\u00020:H\u0000¢\u0006\u0002\boJ\u000e\u0010p\u001a\u00020:2\u0006\u0010]\u001a\u00020RJ\u0006\u0010q\u001a\u00020:J\b\u0010r\u001a\u00020\rH\u0014J\u0010\u0010s\u001a\u00020:2\u0006\u0010X\u001a\u00020YH\u0002J\u0010\u0010t\u001a\u00020:2\u0006\u0010@\u001a\u00020\u001cH\u0002J\b\u0010u\u001a\u00020:H\u0004J\u0018\u0010v\u001a\u00020:2\u000e\b\u0002\u0010w\u001a\b\u0012\u0004\u0012\u00020:0xH\u0004J\u0012\u0010y\u001a\u00020:2\b\u0010B\u001a\u0004\u0018\u00010\u001cH\u0002R\u0014\u0010\u0004\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\u0005XD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u0007R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u001a\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u000e¢\u0006\u0002\n\u0000R*\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001dX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001e\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0007R\u001b\u0010%\u001a\u00020&8DX\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b'\u0010(R\u001b\u0010+\u001a\u00020,8DX\u0002¢\u0006\f\n\u0004\b/\u0010*\u001a\u0004\b-\u0010.R\u001b\u00100\u001a\u0002018DX\u0002¢\u0006\f\n\u0004\b4\u0010*\u001a\u0004\b2\u00103R\u001a\u00105\u001a\b\u0012\u0004\u0012\u00020\u000206X\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u00108¨\u0006z"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/StoresFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/stores/StoresViewModel;", "()V", "LIST", "", "getLIST", "()I", "MAP", "getMAP", "mFavouriteStoreHeader", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/ItemRowPickStoreHeader;", "mInitMapView", "", "mIsAddedFavouriteHeader", "mIsFetchFromServer", "mOtherStoreHeader", "mPlaceHolderView", "Lcom/mindorks/placeholderview/PlaceHolderView;", "getMPlaceHolderView", "()Lcom/mindorks/placeholderview/PlaceHolderView;", "setMPlaceHolderView", "(Lcom/mindorks/placeholderview/PlaceHolderView;)V", "mRecentStoreHeader", "mSavedInstanceState", "Landroid/os/Bundle;", "mStores", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "Lkotlin/collections/ArrayList;", "getMStores", "()Ljava/util/ArrayList;", "setMStores", "(Ljava/util/ArrayList;)V", "<set-?>", "mViewMode", "getMViewMode", "mapViewInteractions", "Lcom/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction;", "getMapViewInteractions", "()Lcom/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction;", "mapViewInteractions$delegate", "Lkotlin/Lazy;", "searchLayoutInteractions", "Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchLayoutInteraction;", "getSearchLayoutInteractions", "()Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchLayoutInteraction;", "searchLayoutInteractions$delegate", "searchStoreInteractions", "Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchStoreInteraction;", "getSearchStoreInteractions", "()Lcom/thecoffeehouse/guestapp/screens/stores/interaction/SearchStoreInteraction;", "searchStoreInteractions$delegate", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "addHeaderItemRow", "", "recentStoreIds", "", "favouriteStoreIds", "addItemRowViewStores", "addStoreItemRow", "store", "addToRecentlySearch", "selectedStore", "animateHideMainHeaderLayout", "animateMapView", "animateShowListStores", "animateShowMainHeaderLayout", "animateShowMapStores", "changeViewsToSearchMode", "changeViewsToSearchMode$app_liveRelease", "changeViewsToShowMode", "changeViewsToShowMode$app_liveRelease", "createLocation", "Landroid/location/Location;", "lat", "", "lng", "getAnalyticScreenName", "", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initAllStores", "allStores", "initPlaceHolderView", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initViews", "savedInstanceState", ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Param.isRecentStore, "storeId", "(Ljava/lang/Integer;)Z", "layoutResId", "listenViewInteractions", "observeViewModel", "onClickClusterMakerListener", "clusterMarker", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "onClickItemRowStore", "onDestroyView", "onLowMemory", "onPause", "onResume", "onSaveInstanceState", "outState", "onStart", "onStop", "resetViews", "resetViews$app_liveRelease", "selectStore", "setDefaultView", "setPreventCloseKeyboardWhenTouchOutside", "showStickToastLayoutRequestPermission", "showStoreDetailBottomSheet", "sortStoresByDistance", "updateDistanceToStore", "onCompleted", "Lkotlin/Function0;", "updateSearchToListAndMap", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public class StoresFragment extends BaseFragment<StoresViewModel> {
    private final int LIST = 1;
    private final int MAP;
    private HashMap _$_findViewCache;
    private ItemRowPickStoreHeader mFavouriteStoreHeader;
    private boolean mInitMapView;
    private boolean mIsAddedFavouriteHeader;
    private boolean mIsFetchFromServer = true;
    private ItemRowPickStoreHeader mOtherStoreHeader;
    protected PlaceHolderView mPlaceHolderView;
    private ItemRowPickStoreHeader mRecentStoreHeader;
    private Bundle mSavedInstanceState;
    private ArrayList<Store> mStores = new ArrayList<>();
    private int mViewMode = 1;
    private final Lazy mapViewInteractions$delegate = LazyKt.lazy(new StoresFragment$mapViewInteractions$2(this));
    private final Lazy searchLayoutInteractions$delegate = LazyKt.lazy(new StoresFragment$searchLayoutInteractions$2(this));
    private final Lazy searchStoreInteractions$delegate = LazyKt.lazy(new StoresFragment$searchStoreInteractions$2(this));
    private final Class<StoresViewModel> viewModelClass = StoresViewModel.class;

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
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
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Store_List;
    }

    /* access modifiers changed from: protected */
    public final MapViewInteraction getMapViewInteractions() {
        return (MapViewInteraction) this.mapViewInteractions$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public final SearchLayoutInteraction getSearchLayoutInteractions() {
        return (SearchLayoutInteraction) this.searchLayoutInteractions$delegate.getValue();
    }

    /* access modifiers changed from: protected */
    public final SearchStoreInteraction getSearchStoreInteractions() {
        return (SearchStoreInteraction) this.searchStoreInteractions$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_stores;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public boolean setPreventCloseKeyboardWhenTouchOutside() {
        return true;
    }

    public static final /* synthetic */ ItemRowPickStoreHeader access$getMFavouriteStoreHeader$p(StoresFragment storesFragment) {
        ItemRowPickStoreHeader itemRowPickStoreHeader = storesFragment.mFavouriteStoreHeader;
        if (itemRowPickStoreHeader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mFavouriteStoreHeader");
        }
        return itemRowPickStoreHeader;
    }

    public static final /* synthetic */ ItemRowPickStoreHeader access$getMOtherStoreHeader$p(StoresFragment storesFragment) {
        ItemRowPickStoreHeader itemRowPickStoreHeader = storesFragment.mOtherStoreHeader;
        if (itemRowPickStoreHeader == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOtherStoreHeader");
        }
        return itemRowPickStoreHeader;
    }

    public final int getMAP() {
        return this.MAP;
    }

    public final int getLIST() {
        return this.LIST;
    }

    /* access modifiers changed from: protected */
    public final PlaceHolderView getMPlaceHolderView() {
        PlaceHolderView placeHolderView = this.mPlaceHolderView;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
        }
        return placeHolderView;
    }

    /* access modifiers changed from: protected */
    public final void setMPlaceHolderView(PlaceHolderView placeHolderView) {
        Intrinsics.checkNotNullParameter(placeHolderView, "<set-?>");
        this.mPlaceHolderView = placeHolderView;
    }

    public final int getMViewMode() {
        return this.mViewMode;
    }

    /* access modifiers changed from: protected */
    public final ArrayList<Store> getMStores() {
        return this.mStores;
    }

    /* access modifiers changed from: protected */
    public final void setMStores(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mStores = arrayList;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<StoresViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    /* access modifiers changed from: protected */
    public void onClickClusterMakerListener(ClusterMarker clusterMarker) {
        Intrinsics.checkNotNullParameter(clusterMarker, "clusterMarker");
        showStoreDetailBottomSheet(clusterMarker.getStore());
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new StoreViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mSavedInstanceState = bundle;
        ((StoresViewModel) getViewModel()).refreshStore(true);
        getSearchLayoutInteractions().initSearchStoreLayout$app_liveRelease(view);
        initPlaceHolderView(view);
        getSearchStoreInteractions().initPhvSearchStore(view, bundle);
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onStart() {
        super.onStart();
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onStart();
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onSaveInstanceState(Bundle bundle) {
        Intrinsics.checkNotNullParameter(bundle, "outState");
        super.onSaveInstanceState(bundle);
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onSaveInstanceState(bundle);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.setPreventCloseKeyboard(true);
        }
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onStop() {
        super.onStop();
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onStop();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onLowMemory() {
        super.onLowMemory();
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onLowMemory();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void listenViewInteractions(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.listenViewInteractions(view, bundle);
        addSwipeToRefreshLayout(Integer.valueOf((int) R.id.swp_stores), new StoresFragment$listenViewInteractions$1(this));
        getSearchStoreInteractions().addOnScrollListener();
        getSearchLayoutInteractions().queryTextListener();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void observeViewModel(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.observeViewModel(view, bundle);
        StoresFragment storesFragment = this;
        ((StoresViewModel) getViewModel()).getStores().observe(storesFragment, new BaseFragment.ObserverBaseResource(this, new StoresFragment$observeViewModel$1(this), null, this.mIsFetchFromServer, false, 10, null));
        ((StoresViewModel) getViewModel()).getSearchStores().observe(storesFragment, new StoresFragment$observeViewModel$2(this));
    }

    /* access modifiers changed from: protected */
    public void initAllStores(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "allStores");
        this.mStores = arrayList;
        updateDistanceToStore(new StoresFragment$initAllStores$1(this));
        if (getMapViewInteractions().getMMapView() != null) {
            getMapViewInteractions().addStoreMarker$app_liveRelease(this.mStores);
        }
    }

    /* access modifiers changed from: protected */
    public void addItemRowViewStores() {
        List<Integer> recentStoreIds = ((StoresViewModel) getViewModel()).getRecentStoreIds();
        ArrayList arrayList = new ArrayList();
        for (Object obj : CollectionsKt.toList(((StoresViewModel) getViewModel()).getFavouriteStoreIds())) {
            if (!recentStoreIds.contains(Integer.valueOf(((Number) obj).intValue()))) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = arrayList;
        addHeaderItemRow(recentStoreIds, arrayList2);
        Iterator<T> it = this.mStores.iterator();
        while (it.hasNext()) {
            addStoreItemRow(it.next(), arrayList2);
        }
    }

    /* access modifiers changed from: protected */
    public void addStoreItemRow(Store store, List<Integer> list) {
        Intrinsics.checkNotNullParameter(store, "store");
        Intrinsics.checkNotNullParameter(list, "favouriteStoreIds");
        if (isRecentStore(store)) {
            ItemRowPickStore itemRowPickStore = new ItemRowPickStore(store, new StoresFragment$addStoreItemRow$itemRowPickStore$1(this));
            try {
                PlaceHolderView placeHolderView = this.mPlaceHolderView;
                if (placeHolderView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
                }
                ItemRowPickStoreHeader itemRowPickStoreHeader = this.mRecentStoreHeader;
                if (itemRowPickStoreHeader == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRecentStoreHeader");
                }
                placeHolderView.addViewAfter(itemRowPickStoreHeader, itemRowPickStore);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }
        } else if (CollectionsKt.contains(list, store.getId())) {
            store.setFavourite(true);
            ItemRowPickStore itemRowPickStore2 = new ItemRowPickStore(store, new StoresFragment$addStoreItemRow$itemRowPickStore$2(this));
            try {
                PlaceHolderView placeHolderView2 = this.mPlaceHolderView;
                if (placeHolderView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
                }
                ItemRowPickStoreHeader itemRowPickStoreHeader2 = this.mFavouriteStoreHeader;
                if (itemRowPickStoreHeader2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFavouriteStoreHeader");
                }
                placeHolderView2.addViewAfter(itemRowPickStoreHeader2, itemRowPickStore2);
            } catch (RuntimeException e2) {
                e2.printStackTrace();
            }
        } else {
            ItemRowPickStore itemRowPickStore3 = new ItemRowPickStore(store, new StoresFragment$addStoreItemRow$itemRowPickStore$3(this));
            try {
                PlaceHolderView placeHolderView3 = this.mPlaceHolderView;
                if (placeHolderView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
                }
                ItemRowPickStoreHeader itemRowPickStoreHeader3 = this.mOtherStoreHeader;
                if (itemRowPickStoreHeader3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mOtherStoreHeader");
                }
                placeHolderView3.addViewAfter(itemRowPickStoreHeader3, itemRowPickStore3);
            } catch (RuntimeException e3) {
                e3.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void addHeaderItemRow(List<Integer> list, List<Integer> list2) {
        Intrinsics.checkNotNullParameter(list, "recentStoreIds");
        Intrinsics.checkNotNullParameter(list2, "favouriteStoreIds");
        try {
            Integer valueOf = Integer.valueOf((int) R.drawable.ic_recently_search);
            String string = getResources().getString(R.string.str_other_stores);
            Intrinsics.checkNotNullExpressionValue(string, "resources.getString(R.string.str_other_stores)");
            this.mOtherStoreHeader = new ItemRowPickStoreHeader(valueOf, string);
            Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_star_filled);
            String string2 = getResources().getString(R.string.str_favourite_stores);
            Intrinsics.checkNotNullExpressionValue(string2, "resources.getString(R.string.str_favourite_stores)");
            this.mFavouriteStoreHeader = new ItemRowPickStoreHeader(valueOf2, string2);
            Integer valueOf3 = Integer.valueOf((int) R.drawable.ic_recently_search);
            String string3 = getResources().getString(R.string.str_recent_stores);
            Intrinsics.checkNotNullExpressionValue(string3, "resources.getString(R.string.str_recent_stores)");
            this.mRecentStoreHeader = new ItemRowPickStoreHeader(valueOf3, string3);
            if (!list.isEmpty()) {
                PlaceHolderView placeHolderView = this.mPlaceHolderView;
                if (placeHolderView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
                }
                ItemRowPickStoreHeader itemRowPickStoreHeader = this.mRecentStoreHeader;
                if (itemRowPickStoreHeader == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mRecentStoreHeader");
                }
                placeHolderView.addView(itemRowPickStoreHeader);
            }
            if ((!list2.isEmpty()) && !this.mIsAddedFavouriteHeader) {
                PlaceHolderView placeHolderView2 = this.mPlaceHolderView;
                if (placeHolderView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
                }
                ItemRowPickStoreHeader itemRowPickStoreHeader2 = this.mFavouriteStoreHeader;
                if (itemRowPickStoreHeader2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mFavouriteStoreHeader");
                }
                placeHolderView2.addView(itemRowPickStoreHeader2);
                this.mIsAddedFavouriteHeader = true;
            }
            PlaceHolderView placeHolderView3 = this.mPlaceHolderView;
            if (placeHolderView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
            }
            ItemRowPickStoreHeader itemRowPickStoreHeader3 = this.mOtherStoreHeader;
            if (itemRowPickStoreHeader3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mOtherStoreHeader");
            }
            placeHolderView3.addView(itemRowPickStoreHeader3);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public void onClickItemRowStore(Store store) {
        Intrinsics.checkNotNullParameter(store, "store");
        showStoreDetailBottomSheet(store);
    }

    /* access modifiers changed from: protected */
    public final void sortStoresByDistance() {
        Collections.sort(this.mStores, StoresFragment$sortStoresByDistance$1.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.stores.StoresFragment */
    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void updateDistanceToStore$default(StoresFragment storesFragment, Function0 function0, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                function0 = StoresFragment$updateDistanceToStore$1.INSTANCE;
            }
            storesFragment.updateDistanceToStore(function0);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateDistanceToStore");
    }

    /* access modifiers changed from: protected */
    public final void updateDistanceToStore(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "onCompleted");
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.getMyAddress(new StoresFragment$updateDistanceToStore$2(this, function0));
        }
    }

    /* access modifiers changed from: private */
    public final Location createLocation(double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    /* access modifiers changed from: private */
    public final void addToRecentlySearch(Store store) {
        ((StoresViewModel) getViewModel()).saveRecentlySearchStore(store);
    }

    public void changeViewsToSearchMode$app_liveRelease() {
        int i = this.mViewMode;
        if (i == this.MAP) {
            getMapViewInteractions().getMMapViewLayout().setVisibility(8);
        } else if (i == this.LIST) {
            PlaceHolderView placeHolderView = this.mPlaceHolderView;
            if (placeHolderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
            }
            placeHolderView.setVisibility(8);
        }
        animateHideMainHeaderLayout();
        getSearchStoreInteractions().getMPhvSearchStores$app_liveRelease().setVisibility(0);
        ((SearchView) getSearchLayoutInteractions().getMSearchStoreLayout().findViewById(R.id.searchView)).onActionViewExpanded();
        TrackingScreenService.Companion.logScreenViewByViewId(TrackingScreenService.Store_SearchResult, getSearchStoreInteractions().getMPhvSearchStores$app_liveRelease());
    }

    public final void changeViewsToShowMode$app_liveRelease() {
        try {
            int i = this.mViewMode;
            if (i == this.MAP) {
                getMapViewInteractions().getMMapViewLayout().setVisibility(0);
            } else if (i == this.LIST) {
                PlaceHolderView placeHolderView = this.mPlaceHolderView;
                if (placeHolderView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
                }
                placeHolderView.setVisibility(0);
            }
            animateShowMainHeaderLayout();
            getSearchStoreInteractions().getMPhvSearchStores$app_liveRelease().setVisibility(8);
            getSearchStoreInteractions().removeAllViews();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onDestroyView() {
        MapView mMapView = getMapViewInteractions().getMMapView();
        if (mMapView != null) {
            mMapView.onDestroy();
        }
        getMapViewInteractions().onDestroyView$app_liveRelease();
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void resetViews$app_liveRelease() {
        getMapViewInteractions().resetMapView$app_liveRelease();
        getSearchLayoutInteractions().resetSearchView();
        ((StoresViewModel) getViewModel()).refreshStore(this.mIsFetchFromServer);
        this.mIsAddedFavouriteHeader = false;
    }

    /* access modifiers changed from: private */
    public final void updateSearchToListAndMap(Store store) {
        Intrinsics.checkNotNull(store);
        ((StoresViewModel) getViewModel()).selectSearchedStore(store);
    }

    public final void animateHideMainHeaderLayout() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.animateSlideUpMainTabLayout();
        }
    }

    public final void animateShowMainHeaderLayout() {
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.animateSlideDownMainTabLayout();
        }
    }

    public void animateShowListStores() {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator withStartAction;
        this.mViewMode = this.LIST;
        ViewPropertyAnimator animate = getMapViewInteractions().getMMapViewLayout().animate();
        if (!(animate == null || (alpha = animate.alpha(0.0f)) == null || (withStartAction = alpha.withStartAction(StoresFragment$animateShowListStores$1.INSTANCE)) == null)) {
            withStartAction.withEndAction(new StoresFragment$animateShowListStores$2(this));
        }
        TrackingScreenService.Companion companion = TrackingScreenService.Companion;
        PlaceHolderView placeHolderView = this.mPlaceHolderView;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
        }
        companion.logScreenViewByViewId(TrackingScreenService.Store_List, placeHolderView);
    }

    public void animateShowMapStores() {
        GeneralKt.log("show map store");
        this.mViewMode = this.MAP;
        if (!this.mInitMapView) {
            ViewGroup rootView = getRootView();
            ViewStub viewStub = rootView != null ? (ViewStub) rootView.findViewById(R.id.layout_map_view) : null;
            if (viewStub != null) {
                viewStub.setLayoutResource(R.layout.layout_map);
            }
            if (viewStub != null) {
                viewStub.setOnInflateListener(new StoresFragment$animateShowMapStores$1(this));
            }
            if (viewStub != null) {
                viewStub.inflate();
            }
        } else {
            animateMapView();
        }
        TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.Store_Map, R.layout.layout_map);
    }

    /* access modifiers changed from: private */
    public final void animateMapView() {
        ViewPropertyAnimator alpha;
        ViewPropertyAnimator alpha2;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity == null || !mainActivity.isGrantedLocationPermission()) {
            getMapViewInteractions().getMMapViewLayout().setVisibility(0);
            ViewPropertyAnimator animate = getMapViewInteractions().getMMapViewLayout().animate();
            if (animate != null && (alpha = animate.alpha(1.0f)) != null) {
                alpha.withEndAction(StoresFragment$animateMapView$2.INSTANCE);
                return;
            }
            return;
        }
        getMapViewInteractions().getMMapViewLayout().setVisibility(0);
        ViewPropertyAnimator animate2 = getMapViewInteractions().getMMapViewLayout().animate();
        if (animate2 != null && (alpha2 = animate2.alpha(1.0f)) != null) {
            alpha2.withEndAction(StoresFragment$animateMapView$1.INSTANCE);
        }
    }

    private final void initPlaceHolderView(View view) {
        View findViewById = view.findViewById(R.id.phv_stores);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.phv_stores)");
        PlaceHolderView placeHolderView = (PlaceHolderView) findViewById;
        this.mPlaceHolderView = placeHolderView;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
        }
        placeHolderView.setItemAnimator(null);
        PlaceHolderView placeHolderView2 = this.mPlaceHolderView;
        if (placeHolderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPlaceHolderView");
        }
        placeHolderView2.setHasFixedSize(true);
    }

    private final void showStoreDetailBottomSheet(Store store) {
        StoreDetailBottomSheetFragment newInstance = StoreDetailBottomSheetFragment.Companion.newInstance(store, new StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$1(this), new StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void showStickToastLayoutRequestPermission(View view) {
        View findViewById = view.findViewById(R.id.searchLayout);
        Objects.requireNonNull(findViewById, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout = (LinearLayout) findViewById;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_toast, (ViewGroup) null, false);
        inflate.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorBackgroundToastBlack));
        Intrinsics.checkNotNullExpressionValue(inflate, "locationRequestLayout");
        TextView textView = (TextView) inflate.findViewById(R.id.txt_title_toast);
        Intrinsics.checkNotNullExpressionValue(textView, "locationRequestLayout.txt_title_toast");
        textView.setText(Html.fromHtml(getString(R.string.str_toast_request_location_permission), 0));
        ContextExtsKt.setOnSafeClickListener$default(inflate, 0, new StoresFragment$showStickToastLayoutRequestPermission$1(this, linearLayout, inflate), 1, null);
        TransitionManager.beginDelayedTransition(linearLayout, new AutoTransition());
        linearLayout.addView(inflate);
    }

    public final void selectStore(String str) {
        T t;
        boolean z;
        Intrinsics.checkNotNullParameter(str, "storeId");
        GeneralKt.log("mStores: " + this.mStores.size());
        Iterator<T> it = this.mStores.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            Integer id = t.getId();
            int parseInt = Integer.parseInt(str);
            if (id != null && id.intValue() == parseInt) {
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
        T t2 = t;
        GeneralKt.log("selectedStore: " + ((Object) t2));
        if (t2 != null) {
            showStoreDetailBottomSheet(t2);
        }
    }

    public final void setDefaultView() {
        MainActivity mainActivity = getMainActivity();
        Boolean valueOf = mainActivity != null ? Boolean.valueOf(mainActivity.isGrantedLocationPermission()) : null;
        MainActivity mainActivity2 = getMainActivity();
        if (mainActivity2 != null) {
            mainActivity2.getMyAddress(new StoresFragment$setDefaultView$1(this, valueOf));
        }
    }

    /* access modifiers changed from: protected */
    public final boolean isRecentStore(Store store) {
        Intrinsics.checkNotNullParameter(store, "store");
        return CollectionsKt.contains(((StoresViewModel) getViewModel()).getRecentStoreIds(), store.getId());
    }

    /* access modifiers changed from: private */
    public final boolean isRecentStore(Integer num) {
        return CollectionsKt.contains(((StoresViewModel) getViewModel()).getRecentStoreIds(), num);
    }
}
