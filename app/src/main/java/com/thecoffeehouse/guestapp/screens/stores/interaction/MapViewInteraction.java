package com.thecoffeehouse.guestapp.screens.stores.interaction;

import android.content.Context;
import android.graphics.Point;
import android.location.Location;
import android.os.Bundle;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.core.app.ActivityCompat;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.Projection;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterItem;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.clustering.algo.Algorithm;
import com.google.maps.android.ui.IconGenerator;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarker;
import com.thecoffeehouse.guestapp.screens.stores.ClusterMarkerRenderer;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.TLImageButton;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 s2\u00020\u0001:\u0001sB1\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\u0002\u0010\u000bJ\u0016\u0010-\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060/H\u0002J\u001b\u00100\u001a\u00020\n2\f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00060/H\u0000¢\u0006\u0002\b2J\u0018\u00103\u001a\u0002042\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020\u0018H\u0002J\u001f\u00107\u001a\u00020\n2\u0006\u00108\u001a\u00020\u001e2\b\u00109\u001a\u0004\u0018\u00010\u0003H\u0000¢\u0006\u0002\b:J\n\u0010;\u001a\u0004\u0018\u00010\u0006H\u0002J\u0016\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00060/2\u0006\u0010=\u001a\u00020\u0018H\u0002J\u0010\u0010>\u001a\u00020\u001e2\u0006\u0010?\u001a\u00020\u0018H\u0002J\u0012\u0010@\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u0019H\u0002J\u001f\u0010B\u001a\u00020\n2\u0006\u0010C\u001a\u00020&2\b\u0010D\u001a\u0004\u0018\u00010EH\u0001¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020\nH\u0002J\r\u0010H\u001a\u00020\nH\u0001¢\u0006\u0002\bIJ\r\u0010J\u001a\u00020\nH\u0001¢\u0006\u0002\bKJ\u0012\u0010L\u001a\u00020\n2\b\u0010A\u001a\u0004\u0018\u00010\u0019H\u0016J\u0015\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\u0006H\u0000¢\u0006\u0002\bOJ\b\u0010P\u001a\u00020\nH\u0002J\r\u0010Q\u001a\u00020\nH\u0000¢\u0006\u0002\bRJ\u0015\u0010S\u001a\u00020\n2\u0006\u00108\u001a\u00020\u001eH\u0000¢\u0006\u0002\bTJ\u0010\u0010U\u001a\u00020\n2\b\u0010V\u001a\u0004\u0018\u00010\u0003J\u0010\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\tH\u0002J\b\u0010Y\u001a\u00020\nH\u0002J\b\u0010Z\u001a\u00020\nH\u0002J\b\u0010[\u001a\u00020\nH\u0002J\u0016\u0010\\\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060/H\u0002J\r\u0010]\u001a\u00020\nH\u0000¢\u0006\u0002\b^J\u0014\u0010_\u001a\u00020\n2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005J\u0015\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\u001eH\u0000¢\u0006\u0002\bbJ\u001a\u0010c\u001a\u00020\n2\b\b\u0002\u0010d\u001a\u00020\u00182\u0006\u0010a\u001a\u00020\u001eH\u0002J\b\u0010e\u001a\u00020\nH\u0002J\u001a\u0010f\u001a\u00020\n2\u0006\u0010g\u001a\u00020\t2\b\b\u0002\u0010h\u001a\u00020\u001eH\u0002J\u0018\u0010i\u001a\u00020\n2\u000e\u0010j\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010kH\u0002J\u001f\u0010l\u001a\u00020\n2\u0006\u0010m\u001a\u00020\u001e2\b\u0010V\u001a\u0004\u0018\u00010\u0003H\u0001¢\u0006\u0002\bnJ\b\u0010o\u001a\u00020\nH\u0002J\u001f\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\u00062\b\b\u0002\u0010h\u001a\u00020\u001eH\u0000¢\u0006\u0002\brR.\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r2\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\r@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\f\u001a\u0004\u0018\u00010\u0011@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u000e\u0010\u0015\u001a\u00020\u0016X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018XD¢\u0006\u0002\n\u0000R\"\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\f\u001a\u0004\u0018\u00010\u0019@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u001f\u001a\u0004\u0018\u00010 X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020&X.¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u0010\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u000e¢\u0006\u0002\n\u0000R\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¢\u0006\b\n\u0000\u001a\u0004\b+\u0010,¨\u0006t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction;", "Lcom/google/android/gms/maps/OnMapReadyCallback;", "mMyLatLng", "Lcom/google/android/gms/maps/model/LatLng;", "mStores", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "onClickToClusterItemClick", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarker;", "", "(Lcom/google/android/gms/maps/model/LatLng;Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;)V", "<set-?>", "Lcom/google/maps/android/clustering/ClusterManager;", "mClusterManager", "getMClusterManager", "()Lcom/google/maps/android/clustering/ClusterManager;", "Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarkerRenderer;", "mClusterMarkerRender", "getMClusterMarkerRender", "()Lcom/thecoffeehouse/guestapp/screens/stores/ClusterMarkerRenderer;", "mContext", "Landroid/content/Context;", "mDefaultRadiusInMeters", "", "Lcom/google/android/gms/maps/GoogleMap;", "mGoogleMap", "getMGoogleMap", "()Lcom/google/android/gms/maps/GoogleMap;", "mIsAlreadyAddFullStoreMarker", "", "mMapView", "Lcom/google/android/gms/maps/MapView;", "getMMapView", "()Lcom/google/android/gms/maps/MapView;", "setMMapView", "(Lcom/google/android/gms/maps/MapView;)V", "mMapViewLayout", "Landroid/view/View;", "getMMapViewLayout", "()Landroid/view/View;", "setMMapViewLayout", "(Landroid/view/View;)V", "getOnClickToClusterItemClick", "()Lkotlin/jvm/functions/Function1;", "addMarker", "stores", "", "addStoreMarker", "data", "addStoreMarker$app_liveRelease", "createLocation", "Landroid/location/Location;", "lat", "lng", "defaultZoom", "requestSuccess", "latLng", "defaultZoom$app_liveRelease", "getClosetStoreFromUserLocation", "getStoresFromUserLocationByDistance", "distanceInMeters", "hasStoreInsideRadius", "defaultRadius", "initGoogleMap", "googleMap", "initMapView", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", "initMapView$app_liveRelease", "initMyLocation", "mapViewListeners", "mapViewListeners$app_liveRelease", "onDestroyView", "onDestroyView$app_liveRelease", "onMapReady", "refreshMarker", "store", "refreshMarker$app_liveRelease", "relocateGoogleMapWatermark", "resetMapView", "resetMapView$app_liveRelease", "searchingModeZoom", "searchingModeZoom$app_liveRelease", "setMyLatLng", "myLatLng", "setSelectedMarker", "clusterMarker", "setupClusters", "setupGoogleMapStyle", "setupMyLocationOnGoogleMap", "sortStoreByUserLocation", "unselectedMarker", "unselectedMarker$app_liveRelease", "updateStores", "viewModeZoom", "isAnimated", "viewModeZoom$app_liveRelease", "zoomFromUserLocation", "radiusDefault", "zoomToAllStores", "zoomToClusterMarkerOnMap", "item", "isShowPickUpBottomSheet", "zoomToMarkerInThisCluster", "cluster", "Lcom/google/maps/android/clustering/Cluster;", "zoomToMarkers", "isGrantedPermission", "zoomToMarkers$app_liveRelease", "zoomToMyLocationAndClosestStore", "zoomToSelectedStore", "selectedStore", "zoomToSelectedStore$app_liveRelease", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MapViewInteraction.kt */
public final class MapViewInteraction implements OnMapReadyCallback {
    public static final Companion Companion = new Companion(null);
    private static final String STAR_MARKER_URL = "https://tchmobileapp.s3.ap-southeast-1.amazonaws.com/storage_image/383_IconLoc_24092020.png";
    private static final String TCH_MARKER_URL = "https://tchmobileapp.s3.ap-southeast-1.amazonaws.com/storage_image/384_IconLoc-1_24092020.png";
    private static final int mDefaultOffsetInMeters = 200;
    private static final float mDefaultZoomMap = 14.0f;
    private ClusterManager<ClusterMarker> mClusterManager;
    private ClusterMarkerRenderer mClusterMarkerRender;
    private Context mContext;
    private final double mDefaultRadiusInMeters = 1500.0d;
    private GoogleMap mGoogleMap;
    private boolean mIsAlreadyAddFullStoreMarker;
    private MapView mMapView;
    public View mMapViewLayout;
    private LatLng mMyLatLng;
    private ArrayList<Store> mStores;
    private final Function1<ClusterMarker, Unit> onClickToClusterItemClick;

    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.screens.stores.ClusterMarker, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public MapViewInteraction(LatLng latLng, ArrayList<Store> arrayList, Function1<? super ClusterMarker, Unit> function1) {
        Intrinsics.checkNotNullParameter(arrayList, "mStores");
        Intrinsics.checkNotNullParameter(function1, "onClickToClusterItemClick");
        this.mMyLatLng = latLng;
        this.mStores = arrayList;
        this.onClickToClusterItemClick = function1;
    }

    public final Function1<ClusterMarker, Unit> getOnClickToClusterItemClick() {
        return this.onClickToClusterItemClick;
    }

    public final ClusterManager<ClusterMarker> getMClusterManager() {
        return this.mClusterManager;
    }

    public final ClusterMarkerRenderer getMClusterMarkerRender() {
        return this.mClusterMarkerRender;
    }

    public final GoogleMap getMGoogleMap() {
        return this.mGoogleMap;
    }

    public final MapView getMMapView() {
        return this.mMapView;
    }

    public final void setMMapView(MapView mapView) {
        this.mMapView = mapView;
    }

    public final View getMMapViewLayout() {
        View view = this.mMapViewLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMapViewLayout");
        }
        return view;
    }

    public final void setMMapViewLayout(View view) {
        Intrinsics.checkNotNullParameter(view, "<set-?>");
        this.mMapViewLayout = view;
    }

    @Override // com.google.android.gms.maps.OnMapReadyCallback
    public void onMapReady(GoogleMap googleMap) {
        GeneralKt.log("onMapReady");
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onResume();
        }
        initGoogleMap(googleMap);
        initMyLocation();
        mapViewListeners$app_liveRelease();
        setupClusters();
        addStoreMarker$app_liveRelease(this.mStores);
    }

    public final void addStoreMarker$app_liveRelease(List<Store> list) {
        Intrinsics.checkNotNullParameter(list, "data");
        if (!this.mIsAlreadyAddFullStoreMarker) {
            addMarker(list);
            this.mIsAlreadyAddFullStoreMarker = true;
            return;
        }
        GoogleMap googleMap = this.mGoogleMap;
        Intrinsics.checkNotNull(googleMap);
        googleMap.clear();
        ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
        if (clusterManager != null) {
            clusterManager.clearItems();
        }
        ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
        addMarker(list);
    }

    public final void defaultZoom$app_liveRelease(boolean z, LatLng latLng) {
        this.mMyLatLng = latLng;
        if (z) {
            searchingModeZoom$app_liveRelease(z);
            return;
        }
        GeneralKt.log("zoom to all stores");
        zoomToAllStores();
    }

    public final void initMapView$app_liveRelease(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        this.mMapViewLayout = view;
        this.mMapView = (MapView) view.findViewById(R.id.map_view);
        View view2 = this.mMapViewLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMapViewLayout");
        }
        Context context = view2.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "mMapViewLayout.context");
        this.mContext = context;
        MapView mapView = this.mMapView;
        if (mapView != null) {
            mapView.onCreate(bundle);
        }
        MapView mapView2 = this.mMapView;
        if (mapView2 != null) {
            mapView2.getMapAsync(this);
        }
    }

    public final void mapViewListeners$app_liveRelease() {
        View view = this.mMapViewLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMapViewLayout");
        }
        TLImageButton tLImageButton = (TLImageButton) view.findViewById(R.id.btn_my_location);
        Intrinsics.checkNotNullExpressionValue(tLImageButton, "mMapViewLayout.btn_my_location");
        ContextExtsKt.setOnSafeClickListener$default(tLImageButton, 0, new MapViewInteraction$mapViewListeners$1(this), 1, null);
        View view2 = this.mMapViewLayout;
        if (view2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMapViewLayout");
        }
        TLImageButton tLImageButton2 = (TLImageButton) view2.findViewById(R.id.btn_zoom_in);
        Intrinsics.checkNotNullExpressionValue(tLImageButton2, "mMapViewLayout.btn_zoom_in");
        ContextExtsKt.setOnSafeClickListener$default(tLImageButton2, 0, new MapViewInteraction$mapViewListeners$2(this), 1, null);
        View view3 = this.mMapViewLayout;
        if (view3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMapViewLayout");
        }
        TLImageButton tLImageButton3 = (TLImageButton) view3.findViewById(R.id.btn_zoom_out);
        Intrinsics.checkNotNullExpressionValue(tLImageButton3, "mMapViewLayout.btn_zoom_out");
        ContextExtsKt.setOnSafeClickListener$default(tLImageButton3, 0, new MapViewInteraction$mapViewListeners$3(this), 1, null);
    }

    public final void onDestroyView$app_liveRelease() {
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            googleMap.setMyLocationEnabled(false);
        }
        GoogleMap googleMap2 = this.mGoogleMap;
        if (googleMap2 != null) {
            googleMap2.clear();
        }
        ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
        if (clusterManager != null) {
            clusterManager.clearItems();
        }
        ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
        GoogleMap googleMap3 = this.mGoogleMap;
        if (googleMap3 != null) {
            googleMap3.setMapType(0);
        }
        this.mGoogleMap = null;
    }

    public final void refreshMarker$app_liveRelease(Store store) {
        Algorithm<ClusterMarker> algorithm;
        Collection<ClusterMarker> items;
        ClusterMarkerRenderer clusterMarkerRenderer;
        Marker marker;
        BitmapDescriptor bitmapDescriptor;
        Intrinsics.checkNotNullParameter(store, "store");
        ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
        if (!(clusterManager == null || (algorithm = clusterManager.getAlgorithm()) == null || (items = algorithm.getItems()) == null)) {
            Collection<ClusterMarker> collection = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
            for (T t : collection) {
                if (!(!Intrinsics.areEqual(t.getStore().getId(), store.getId()) || (clusterMarkerRenderer = this.mClusterMarkerRender) == null || (marker = clusterMarkerRenderer.getMarker((ClusterItem) t)) == null)) {
                    ClusterMarkerRenderer clusterMarkerRenderer2 = this.mClusterMarkerRender;
                    if (clusterMarkerRenderer2 != null) {
                        Intrinsics.checkNotNullExpressionValue(t, "it");
                        bitmapDescriptor = clusterMarkerRenderer2.getItemIcon(t);
                    } else {
                        bitmapDescriptor = null;
                    }
                    marker.setIcon(bitmapDescriptor);
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
    }

    public final void resetMapView$app_liveRelease() {
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            googleMap.clear();
        }
        ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
        if (clusterManager != null) {
            clusterManager.clearItems();
        }
        ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
        this.mIsAlreadyAddFullStoreMarker = false;
    }

    public final void searchingModeZoom$app_liveRelease(boolean z) {
        if (this.mStores.size() != 1) {
            if (!z) {
                zoomToAllStores();
            } else if (hasStoreInsideRadius(this.mDefaultRadiusInMeters)) {
                zoomFromUserLocation$default(this, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, true, 1, null);
            } else {
                zoomToMyLocationAndClosestStore();
            }
        } else if (z) {
            zoomToMyLocationAndClosestStore();
        } else {
            Store store = this.mStores.get(0);
            Intrinsics.checkNotNullExpressionValue(store, "mStores[0]");
            zoomToSelectedStore$app_liveRelease$default(this, store, false, 2, null);
        }
    }

    public final void zoomToMarkers$app_liveRelease(boolean z, LatLng latLng) {
        defaultZoom$app_liveRelease(z, latLng);
    }

    private final void setupMyLocationOnGoogleMap() {
        UiSettings uiSettings;
        Context context = this.mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
        }
        if (ActivityCompat.checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") != 0) {
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            if (ActivityCompat.checkSelfPermission(context2, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                return;
            }
        }
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            googleMap.setMyLocationEnabled(true);
        }
        GoogleMap googleMap2 = this.mGoogleMap;
        if (googleMap2 != null && (uiSettings = googleMap2.getUiSettings()) != null) {
            uiSettings.setMyLocationButtonEnabled(false);
        }
    }

    public final void unselectedMarker$app_liveRelease() {
        Algorithm<ClusterMarker> algorithm;
        Collection<ClusterMarker> items;
        Marker marker;
        ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
        if (!(clusterManager == null || (algorithm = clusterManager.getAlgorithm()) == null || (items = algorithm.getItems()) == null)) {
            Collection<ClusterMarker> collection = items;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(collection, 10));
            for (T t : collection) {
                if (t.isSelected()) {
                    t.setSelected(false);
                    ClusterMarkerRenderer clusterMarkerRenderer = this.mClusterMarkerRender;
                    if (!(clusterMarkerRenderer == null || (marker = clusterMarkerRenderer.getMarker((ClusterItem) t)) == null)) {
                        ClusterMarkerRenderer clusterMarkerRenderer2 = this.mClusterMarkerRender;
                        Intrinsics.checkNotNull(clusterMarkerRenderer2);
                        Intrinsics.checkNotNullExpressionValue(t, "it");
                        marker.setIcon(clusterMarkerRenderer2.getItemIcon(t));
                    }
                }
                arrayList.add(Unit.INSTANCE);
            }
        }
        ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
    }

    public final void updateStores(ArrayList<Store> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "stores");
        this.mStores = arrayList;
    }

    public final void viewModeZoom$app_liveRelease(boolean z) {
        if (hasStoreInsideRadius(this.mDefaultRadiusInMeters)) {
            zoomFromUserLocation$default(this, FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE, z, 1, null);
        } else {
            zoomToMyLocationAndClosestStore();
        }
    }

    public static /* synthetic */ void zoomToSelectedStore$app_liveRelease$default(MapViewInteraction mapViewInteraction, Store store, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        mapViewInteraction.zoomToSelectedStore$app_liveRelease(store, z);
    }

    public final void zoomToSelectedStore$app_liveRelease(Store store, boolean z) {
        Algorithm<ClusterMarker> algorithm;
        Collection<ClusterMarker> items;
        Intrinsics.checkNotNullParameter(store, "selectedStore");
        ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
        ClusterMarker clusterMarker = null;
        if (!(clusterManager == null || (algorithm = clusterManager.getAlgorithm()) == null || (items = algorithm.getItems()) == null)) {
            Iterator<T> it = items.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                T next = it.next();
                if (Intrinsics.areEqual(next.getStore().getId(), store.getId())) {
                    clusterMarker = next;
                    break;
                }
            }
            clusterMarker = clusterMarker;
        }
        if (clusterMarker != null) {
            zoomToClusterMarkerOnMap(clusterMarker, z);
        }
    }

    private final void addMarker(List<Store> list) {
        GeneralKt.log("mClusterManager: " + (this.mClusterManager == null));
        for (Store store : list) {
            LocationStore locationStore = store.getLocationStore();
            double lat = locationStore != null ? locationStore.getLat() : 0.0d;
            LocationStore locationStore2 = store.getLocationStore();
            ClusterMarker clusterMarker = new ClusterMarker(lat, locationStore2 != null ? locationStore2.getLong() : 0.0d, String.valueOf(store.getId()));
            clusterMarker.setStore(store);
            ClusterManager<ClusterMarker> clusterManager = this.mClusterManager;
            if (clusterManager != null) {
                clusterManager.addItem(clusterMarker);
            }
        }
        ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
        if (clusterManager2 != null) {
            clusterManager2.cluster();
        }
    }

    private final Location createLocation(double d, double d2) {
        Location location = new Location("");
        location.setLatitude(d);
        location.setLongitude(d2);
        return location;
    }

    private final Store getClosetStoreFromUserLocation() {
        if (this.mStores.isEmpty()) {
            return null;
        }
        return (Store) CollectionsKt.sortedWith(this.mStores, new MapViewInteraction$getClosetStoreFromUserLocation$$inlined$sortedBy$1()).get(0);
    }

    private final List<Store> getStoresFromUserLocationByDistance(double d) {
        ArrayList arrayList = new ArrayList();
        for (T t : this.mStores) {
            Double distance = t.getDistance();
            if ((distance != null ? distance.doubleValue() : Double.MAX_VALUE) < d) {
                arrayList.add(t);
            }
        }
        return arrayList;
    }

    private final boolean hasStoreInsideRadius(double d) {
        Iterator<T> it = this.mStores.iterator();
        while (it.hasNext()) {
            Double distance = it.next().getDistance();
            if ((distance != null ? distance.doubleValue() : Double.MAX_VALUE) < d) {
                return true;
            }
        }
        return false;
    }

    private final void initGoogleMap(GoogleMap googleMap) {
        this.mGoogleMap = googleMap;
        setupMyLocationOnGoogleMap();
        setupGoogleMapStyle();
        relocateGoogleMapWatermark();
    }

    private final void initMyLocation() {
        try {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            LocationServices.getFusedLocationProviderClient(context);
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            if (ActivityCompat.checkSelfPermission(context2, "android.permission.ACCESS_FINE_LOCATION") != 0) {
                Context context3 = this.mContext;
                if (context3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                if (ActivityCompat.checkSelfPermission(context3, "android.permission.ACCESS_COARSE_LOCATION") != 0) {
                    return;
                }
            }
            try {
                GoogleMap googleMap = this.mGoogleMap;
                Location location = null;
                Location myLocation = googleMap != null ? googleMap.getMyLocation() : null;
                Intrinsics.checkNotNull(myLocation);
                double latitude = myLocation.getLatitude();
                GoogleMap googleMap2 = this.mGoogleMap;
                if (googleMap2 != null) {
                    location = googleMap2.getMyLocation();
                }
                Intrinsics.checkNotNull(location);
                this.mMyLatLng = new LatLng(latitude, location.getLongitude());
            } catch (Exception e) {
                e.printStackTrace();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    private final void relocateGoogleMapWatermark() {
        View view = this.mMapViewLayout;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMapViewLayout");
        }
        View findViewWithTag = view.findViewWithTag("GoogleWatermark");
        Intrinsics.checkNotNullExpressionValue(findViewWithTag, "mMapViewLayout.findViewWithTag(\"GoogleWatermark\")");
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

    /* access modifiers changed from: private */
    public final void setSelectedMarker(ClusterMarker clusterMarker) {
        Marker marker;
        clusterMarker.setSelected(true);
        ClusterMarkerRenderer clusterMarkerRenderer = this.mClusterMarkerRender;
        if (clusterMarkerRenderer != null && (marker = clusterMarkerRenderer.getMarker(clusterMarker)) != null) {
            ClusterMarkerRenderer clusterMarkerRenderer2 = this.mClusterMarkerRender;
            Intrinsics.checkNotNull(clusterMarkerRenderer2);
            marker.setIcon(clusterMarkerRenderer2.getItemIcon(clusterMarker));
        }
    }

    private final void setupClusters() {
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            Context context = this.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            ClusterManager<ClusterMarker> clusterManager = new ClusterManager<>(context, this.mGoogleMap);
            this.mClusterManager = clusterManager;
            GoogleMap googleMap2 = this.mGoogleMap;
            if (googleMap2 != null) {
                googleMap2.setOnCameraIdleListener(clusterManager);
            }
            GoogleMap googleMap3 = this.mGoogleMap;
            if (googleMap3 != null) {
                googleMap3.setOnMarkerClickListener(this.mClusterManager);
            }
            Context context2 = this.mContext;
            if (context2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            ClusterManager<ClusterMarker> clusterManager2 = this.mClusterManager;
            Intrinsics.checkNotNull(clusterManager2);
            ClusterMarkerRenderer clusterMarkerRenderer = new ClusterMarkerRenderer(context2, googleMap, clusterManager2);
            this.mClusterMarkerRender = clusterMarkerRenderer;
            Intrinsics.checkNotNull(clusterMarkerRenderer);
            clusterMarkerRenderer.setMinClusterSize(1);
            ClusterManager<ClusterMarker> clusterManager3 = this.mClusterManager;
            Intrinsics.checkNotNull(clusterManager3);
            clusterManager3.setRenderer(this.mClusterMarkerRender);
            ClusterManager<ClusterMarker> clusterManager4 = this.mClusterManager;
            Intrinsics.checkNotNull(clusterManager4);
            clusterManager4.setOnClusterClickListener(new MapViewInteraction$setupClusters$$inlined$let$lambda$1(this));
            ClusterManager<ClusterMarker> clusterManager5 = this.mClusterManager;
            Intrinsics.checkNotNull(clusterManager5);
            clusterManager5.setOnClusterItemClickListener(new MapViewInteraction$setupClusters$$inlined$let$lambda$2(this));
        }
    }

    /* access modifiers changed from: private */
    public final void zoomToMarkerInThisCluster(Cluster<ClusterMarker> cluster) {
        Collection<ClusterMarker> items;
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        if (!(cluster == null || (items = cluster.getItems()) == null)) {
            for (T t : items) {
                Intrinsics.checkNotNullExpressionValue(t, "marker");
                builder.include(t.getPosition());
            }
        }
        try {
            LatLngBounds build = builder.build();
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap != null) {
                googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(build, mDefaultOffsetInMeters));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void setupGoogleMapStyle() {
        try {
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap != null) {
                Context context = this.mContext;
                if (context == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mContext");
                }
                googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(context, R.raw.tch_map_style));
            }
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }

    private final void sortStoreByUserLocation(List<Store> list) {
        Collections.sort(list, MapViewInteraction$sortStoreByUserLocation$1.INSTANCE);
    }

    static /* synthetic */ void zoomFromUserLocation$default(MapViewInteraction mapViewInteraction, double d, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            d = 1500.0d;
        }
        mapViewInteraction.zoomFromUserLocation(d, z);
    }

    private final void zoomFromUserLocation(double d, boolean z) {
        GoogleMap googleMap = this.mGoogleMap;
        if (googleMap != null) {
            List<Store> storesFromUserLocationByDistance = getStoresFromUserLocationByDistance(d);
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (Store store : storesFromUserLocationByDistance) {
                LocationStore locationStore = store.getLocationStore();
                double d2 = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                double lat = locationStore != null ? locationStore.getLat() : 0.0d;
                LocationStore locationStore2 = store.getLocationStore();
                if (locationStore2 != null) {
                    d2 = locationStore2.getLong();
                }
                builder.include(new LatLng(lat, d2));
            }
            LatLng latLng = this.mMyLatLng;
            Intrinsics.checkNotNull(latLng);
            double d3 = latLng.latitude;
            LatLng latLng2 = this.mMyLatLng;
            Intrinsics.checkNotNull(latLng2);
            builder.include(new LatLng(d3, latLng2.longitude));
            LatLngBounds build = builder.build();
            GeneralKt.log("loading map");
            googleMap.setOnMapLoadedCallback(new MapViewInteraction$zoomFromUserLocation$$inlined$let$lambda$1(googleMap, build, this, d, z));
        }
    }

    private final void zoomToAllStores() {
        LatLngBounds.Builder builder = new LatLngBounds.Builder();
        for (T t : this.mStores) {
            LocationStore locationStore = t.getLocationStore();
            double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
            double lat = locationStore != null ? locationStore.getLat() : 0.0d;
            LocationStore locationStore2 = t.getLocationStore();
            if (locationStore2 != null) {
                d = locationStore2.getLong();
            }
            builder.include(new LatLng(lat, d));
        }
        try {
            LatLngBounds build = builder.build();
            GoogleMap googleMap = this.mGoogleMap;
            if (googleMap != null) {
                googleMap.animateCamera(CameraUpdateFactory.newLatLngBounds(build, mDefaultOffsetInMeters));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static /* synthetic */ void zoomToClusterMarkerOnMap$default(MapViewInteraction mapViewInteraction, ClusterMarker clusterMarker, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        mapViewInteraction.zoomToClusterMarkerOnMap(clusterMarker, z);
    }

    private final void zoomToClusterMarkerOnMap(ClusterMarker clusterMarker, boolean z) {
        Projection projection;
        Projection projection2;
        if (z) {
            int DPtoPX = ViewExtsKt.DPtoPX(100.0f);
            GoogleMap googleMap = this.mGoogleMap;
            LatLng latLng = null;
            Point screenLocation = (googleMap == null || (projection2 = googleMap.getProjection()) == null) ? null : projection2.toScreenLocation(clusterMarker.getPosition());
            Intrinsics.checkNotNull(screenLocation);
            Point point = new Point(screenLocation.x, screenLocation.y + DPtoPX);
            GoogleMap googleMap2 = this.mGoogleMap;
            if (!(googleMap2 == null || (projection = googleMap2.getProjection()) == null)) {
                latLng = projection.fromScreenLocation(point);
            }
            GoogleMap googleMap3 = this.mGoogleMap;
            if (googleMap3 != null) {
                googleMap3.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                return;
            }
            return;
        }
        GoogleMap googleMap4 = this.mGoogleMap;
        if (googleMap4 != null) {
            googleMap4.animateCamera(CameraUpdateFactory.newLatLng(clusterMarker.getPosition()));
        }
    }

    private final void zoomToMyLocationAndClosestStore() {
        GoogleMap googleMap;
        LocationStore locationStore;
        LocationStore locationStore2;
        Store closetStoreFromUserLocation = getClosetStoreFromUserLocation();
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double lat = (closetStoreFromUserLocation == null || (locationStore2 = closetStoreFromUserLocation.getLocationStore()) == null) ? 0.0d : locationStore2.getLat();
        if (!(closetStoreFromUserLocation == null || (locationStore = closetStoreFromUserLocation.getLocationStore()) == null)) {
            d = locationStore.getLong();
        }
        Location createLocation = createLocation(lat, d);
        if (this.mMyLatLng != null && (googleMap = this.mGoogleMap) != null) {
            try {
                LatLngBounds.Builder include = new LatLngBounds.Builder().include(new LatLng(createLocation.getLatitude(), createLocation.getLongitude()));
                LatLng latLng = this.mMyLatLng;
                Intrinsics.checkNotNull(latLng);
                double d2 = latLng.latitude;
                LatLng latLng2 = this.mMyLatLng;
                Intrinsics.checkNotNull(latLng2);
                googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(include.include(new LatLng(d2, latLng2.longitude)).build(), mDefaultOffsetInMeters));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public final void setMyLatLng(LatLng latLng) {
        this.mMyLatLng = latLng;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0018\u0010\u0011\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00150\u00130\u00122\b\b\u0002\u0010\u0016\u001a\u00020\nJ\u0016\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\nJF\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u00192\b\b\u0002\u0010\u001c\u001a\u00020\n2\b\b\u0002\u0010\u001d\u001a\u00020\n2\b\b\u0002\u0010\u001e\u001a\u00020\n2\u0018\u0010\u001f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00040\u00130\u0012J0\u0010 \u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00150\u00122\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020#R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u000e\u0010\t\u001a\u00020\nXD¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fXD¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction$Companion;", "", "()V", "STAR_MARKER_URL", "", "getSTAR_MARKER_URL", "()Ljava/lang/String;", "TCH_MARKER_URL", "getTCH_MARKER_URL", "mDefaultOffsetInMeters", "", "mDefaultZoomMap", "", "addMarkers", "", "googleMap", "Lcom/google/android/gms/maps/GoogleMap;", "markers", "", "Lkotlin/Pair;", "Lcom/google/maps/android/ui/IconGenerator;", "Lcom/google/android/gms/maps/model/LatLng;", "offset", "generateIcon", "context", "Landroid/content/Context;", "imageRes", "getStaticMapUrlByLatLng", "zoom", ViewHierarchyConstants.DIMENSION_WIDTH_KEY, ViewHierarchyConstants.DIMENSION_HEIGHT_KEY, "markerUrl", "zoomToPositions", "latLngs", "animate", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: MapViewInteraction.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String getSTAR_MARKER_URL() {
            return MapViewInteraction.STAR_MARKER_URL;
        }

        public final String getTCH_MARKER_URL() {
            return MapViewInteraction.TCH_MARKER_URL;
        }

        public static /* synthetic */ String getStaticMapUrlByLatLng$default(Companion companion, Context context, int i, int i2, int i3, List list, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                i = 16;
            }
            return companion.getStaticMapUrlByLatLng(context, i, (i4 & 4) != 0 ? 20 : i2, (i4 & 8) != 0 ? 20 : i3, list);
        }

        public final String getStaticMapUrlByLatLng(Context context, int i, int i2, int i3, List<Pair<LatLng, String>> list) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(list, "markerUrl");
            List<Pair<LatLng, String>> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (T t : list2) {
                arrayList.add("markers=icon:" + ((String) t.getSecond()) + '|' + ((LatLng) t.getFirst()).latitude + ',' + ((LatLng) t.getFirst()).longitude);
            }
            return "http://maps.google.com/maps/api/staticmap?" + (CollectionsKt.joinToString$default(arrayList, "&", null, null, 0, null, null, 62, null) + "&") + "size=" + i2 + 'x' + i3 + Typography.amp + "key=" + context.getString(R.string.google_maps_key);
        }

        public final IconGenerator generateIcon(Context context, int i) {
            Intrinsics.checkNotNullParameter(context, "context");
            IconGenerator iconGenerator = new IconGenerator(context);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            iconGenerator.setContentView(imageView);
            iconGenerator.setBackground(null);
            imageView.setImageResource(i);
            return iconGenerator;
        }

        public static /* synthetic */ void addMarkers$default(Companion companion, GoogleMap googleMap, List list, int i, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = MapViewInteraction.mDefaultOffsetInMeters;
            }
            companion.addMarkers(googleMap, list, i);
        }

        public final void addMarkers(GoogleMap googleMap, List<? extends Pair<? extends IconGenerator, LatLng>> list, int i) {
            Intrinsics.checkNotNullParameter(googleMap, "googleMap");
            Intrinsics.checkNotNullParameter(list, "markers");
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            for (T t : list) {
                MarkerOptions icon = new MarkerOptions().position((LatLng) t.getSecond()).icon(BitmapDescriptorFactory.fromBitmap(((IconGenerator) t.getFirst()).makeIcon()));
                builder.include((LatLng) t.getSecond());
                googleMap.addMarker(icon);
            }
            googleMap.moveCamera(CameraUpdateFactory.newLatLngBounds(builder.build(), i));
        }

        public static /* synthetic */ void zoomToPositions$default(Companion companion, GoogleMap googleMap, List list, int i, boolean z, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = MapViewInteraction.mDefaultOffsetInMeters;
            }
            if ((i2 & 8) != 0) {
                z = true;
            }
            companion.zoomToPositions(googleMap, list, i, z);
        }

        public final void zoomToPositions(GoogleMap googleMap, List<LatLng> list, int i, boolean z) {
            Intrinsics.checkNotNullParameter(googleMap, "googleMap");
            Intrinsics.checkNotNullParameter(list, "latLngs");
            LatLngBounds.Builder builder = new LatLngBounds.Builder();
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                builder.include(it.next());
            }
            CameraUpdate newLatLngBounds = CameraUpdateFactory.newLatLngBounds(builder.build(), i);
            if (z) {
                googleMap.animateCamera(newLatLngBounds);
            } else {
                googleMap.moveCamera(newLatLngBounds);
            }
        }
    }
}
