package com.thecoffeehouse.guestapp.screens.home;

import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.config.EventCard;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem;
import com.thecoffeehouse.guestapp.services.api.model.common.media.GetMediaBoxResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0013H\u0002J\b\u0010(\u001a\u00020&H\u0002J\b\u0010)\u001a\u00020&H\u0002J\b\u0010*\u001a\u00020+H\u0014J\b\u0010,\u001a\u00020-H\u0016J\u0010\u0010.\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00101\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u00102\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\b\u00103\u001a\u00020&H\u0002J\b\u00104\u001a\u00020&H\u0002J\b\u00105\u001a\u00020&H\u0002J\u0016\u00106\u001a\u00020&2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000f08H\u0002J\u001a\u00109\u001a\u00020&2\u0006\u0010:\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\b\u0010=\u001a\u00020>H\u0016J\u001a\u0010?\u001a\u00020&2\u0006\u0010:\u001a\u0002002\b\u0010;\u001a\u0004\u0018\u00010<H\u0014J\u0010\u0010@\u001a\u00020&2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020&H\u0016J\b\u0010D\u001a\u00020&H\u0014J\b\u0010E\u001a\u00020&H\u0002J\u0018\u0010F\u001a\u00020&2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020>H\u0002J\u0006\u0010J\u001a\u00020&J\b\u0010K\u001a\u00020&H\u0014J\u0006\u0010L\u001a\u00020&J\u0010\u0010M\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010N\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\u0010\u0010O\u001a\u00020&2\u0006\u0010/\u001a\u000200H\u0002J\b\u0010P\u001a\u00020&H\u0002J\b\u0010Q\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00130\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0018\u001a\u0012\u0012\u0004\u0012\u00020\u000f0\u000ej\b\u0012\u0004\u0012\u00020\u000f`\u0010X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001f\u001a\u00020 X.¢\u0006\u0002\n\u0000R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00020\"X\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006R"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/home/HomeFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/home/HomeViewModel;", "()V", "handler", "Landroid/os/Handler;", "mAdapterNotification", "Lcom/thecoffeehouse/guestapp/screens/home/NotificationRecyclerViewAdapter;", "mAdapterOrderProcessing", "mMediaBoxLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "mMediaBoxPlaceHolderView", "Lcom/mindorks/placeholderview/PlaceHolderView;", "mNotifications", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "mObserveMediaBox", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/media/GetMediaBoxResponse;", "mObserveNotifications", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/GetNotificationsResponse;", "mObserveOrdersProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersProcessingResponse;", "mOrderProcessing", "orderViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getOrderViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "orderViewModel$delegate", "Lkotlin/Lazy;", "periodicUpdate", "Ljava/lang/Runnable;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "addRowMediaBox", "", "it", "autoScrollRecycleView", "fetchDataLoggedInAndGuestUser", "getAnalyticScreenName", "", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "hideAtTableShortcut", "viewRoot", "Landroid/view/View;", "hideDeliShortcut", "hidePickupShortcut", "initEventCard", "initGuestModeUI", "initMediaBox", "initOrdersProcessing", "processingOrders", "", "initViews", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "listenViewInteractions", "navigateToOrderWithMethod", "deepLink", "Landroid/net/Uri;", "onDestroy", "onLoggedInUserListener", "openGuideUserOrderAtTableDialog", "readNotification", "selectNotification", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;", "position", "resetData", "retryButton", "scrollToTop", "showAtTableShortcut", "showDeliShortcut", "showPickupShortcut", "toggleViewLoggedInAndGuestUser", "triggerSendEventTracking", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public class HomeFragment extends BaseFragment<HomeViewModel> {
    private HashMap _$_findViewCache;
    private Handler handler = new Handler();
    private NotificationRecyclerViewAdapter mAdapterNotification;
    private NotificationRecyclerViewAdapter mAdapterOrderProcessing;
    private LinearLayoutManager mMediaBoxLayoutManager;
    private PlaceHolderView mMediaBoxPlaceHolderView;
    private final ArrayList<Object> mNotifications = new ArrayList<>();
    private final BaseFragment<HomeViewModel>.ObserverBaseResource mObserveMediaBox = new BaseFragment.ObserverBaseResource<>(this, new HomeFragment$mObserveMediaBox$1(this), null, false, false, 14, null);
    private final BaseFragment<HomeViewModel>.ObserverBaseResource mObserveNotifications = new BaseFragment.ObserverBaseResource<>(this, new HomeFragment$mObserveNotifications$1(this), null, false, false, 14, null);
    private final BaseFragment<HomeViewModel>.ObserverBaseResource mObserveOrdersProcessing = new BaseFragment.ObserverBaseResource<>(this, new HomeFragment$mObserveOrdersProcessing$1(this), null, false, false, 14, null);
    private final ArrayList<Object> mOrderProcessing = new ArrayList<>();
    private final Lazy orderViewModel$delegate = LazyKt.lazy(new HomeFragment$orderViewModel$2(this));
    private Runnable periodicUpdate;
    private final Class<HomeViewModel> viewModelClass = HomeViewModel.class;

    private final OrderViewModel getOrderViewModel() {
        return (OrderViewModel) this.orderViewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void triggerSendEventTracking() {
    }

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
        return "Home";
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_home;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ NotificationRecyclerViewAdapter access$getMAdapterNotification$p(HomeFragment homeFragment) {
        NotificationRecyclerViewAdapter notificationRecyclerViewAdapter = homeFragment.mAdapterNotification;
        if (notificationRecyclerViewAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAdapterNotification");
        }
        return notificationRecyclerViewAdapter;
    }

    public static final /* synthetic */ Runnable access$getPeriodicUpdate$p(HomeFragment homeFragment) {
        Runnable runnable = homeFragment.periodicUpdate;
        if (runnable == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicUpdate");
        }
        return runnable;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<HomeViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    /* access modifiers changed from: private */
    public final void initOrdersProcessing(List<? extends Object> list) {
        RecyclerView recyclerView = (RecyclerView) getRootView().findViewById(R.id.rcv_orders_processing);
        this.mOrderProcessing.clear();
        List<? extends Object> list2 = list;
        if (!list2.isEmpty()) {
            if (recyclerView != null) {
                recyclerView.setVisibility(0);
            }
            this.mOrderProcessing.add(0, new Notification(null, null, null, null, null, null, 0, getString(R.string.str_order_processing), 127, null));
            this.mOrderProcessing.addAll(list2);
            NotificationRecyclerViewAdapter notificationRecyclerViewAdapter = new NotificationRecyclerViewAdapter(this.mOrderProcessing, new HomeFragment$initOrdersProcessing$1(this));
            this.mAdapterOrderProcessing = notificationRecyclerViewAdapter;
            if (recyclerView != null) {
                if (notificationRecyclerViewAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mAdapterOrderProcessing");
                }
                recyclerView.setAdapter(notificationRecyclerViewAdapter);
            }
        } else if (recyclerView != null) {
            recyclerView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void retryButton() {
        super.retryButton();
        resetData();
    }

    /* access modifiers changed from: private */
    public final void addRowMediaBox(GetMediaBoxResponse getMediaBoxResponse) {
        PlaceHolderView placeHolderView = this.mMediaBoxPlaceHolderView;
        if (placeHolderView != null) {
            placeHolderView.removeAllViews();
        }
        if (!getMediaBoxResponse.getData().isEmpty()) {
            for (Notification notification : getMediaBoxResponse.getData()) {
                ItemRowMediaBox itemRowMediaBox = new ItemRowMediaBox(notification, new HomeFragment$addRowMediaBox$itemMediaBox$1(this));
                PlaceHolderView placeHolderView2 = this.mMediaBoxPlaceHolderView;
                if (placeHolderView2 != null) {
                    placeHolderView2.addView(itemRowMediaBox);
                }
            }
        }
    }

    /* access modifiers changed from: private */
    public final void autoScrollRecycleView() {
        RecyclerView.Adapter adapter;
        RecyclerView.Adapter adapter2;
        LinearLayoutManager linearLayoutManager = this.mMediaBoxLayoutManager;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaBoxLayoutManager");
        }
        int findLastCompletelyVisibleItemPosition = linearLayoutManager.findLastCompletelyVisibleItemPosition();
        PlaceHolderView placeHolderView = this.mMediaBoxPlaceHolderView;
        Integer num = null;
        Integer valueOf = (placeHolderView == null || (adapter2 = placeHolderView.getAdapter()) == null) ? null : Integer.valueOf(adapter2.getItemCount());
        Intrinsics.checkNotNull(valueOf);
        if (findLastCompletelyVisibleItemPosition < valueOf.intValue() - 1) {
            LinearLayoutManager linearLayoutManager2 = this.mMediaBoxLayoutManager;
            if (linearLayoutManager2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaBoxLayoutManager");
            }
            PlaceHolderView placeHolderView2 = this.mMediaBoxPlaceHolderView;
            RecyclerView.State state = new RecyclerView.State();
            LinearLayoutManager linearLayoutManager3 = this.mMediaBoxLayoutManager;
            if (linearLayoutManager3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaBoxLayoutManager");
            }
            linearLayoutManager2.smoothScrollToPosition(placeHolderView2, state, linearLayoutManager3.findLastCompletelyVisibleItemPosition() + 1);
            return;
        }
        LinearLayoutManager linearLayoutManager4 = this.mMediaBoxLayoutManager;
        if (linearLayoutManager4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mMediaBoxLayoutManager");
        }
        int findLastCompletelyVisibleItemPosition2 = linearLayoutManager4.findLastCompletelyVisibleItemPosition();
        PlaceHolderView placeHolderView3 = this.mMediaBoxPlaceHolderView;
        if (!(placeHolderView3 == null || (adapter = placeHolderView3.getAdapter()) == null)) {
            num = Integer.valueOf(adapter.getItemCount());
        }
        Intrinsics.checkNotNull(num);
        if (findLastCompletelyVisibleItemPosition2 == num.intValue() - 1) {
            LinearLayoutManager linearLayoutManager5 = this.mMediaBoxLayoutManager;
            if (linearLayoutManager5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaBoxLayoutManager");
            }
            linearLayoutManager5.smoothScrollToPosition(this.mMediaBoxPlaceHolderView, new RecyclerView.State(), 0);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.handler.removeCallbacksAndMessages(null);
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new HomeViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initMediaBox();
        initEventCard();
        HomeFragment$initViews$1 homeFragment$initViews$1 = new HomeFragment$initViews$1(this);
        this.periodicUpdate = homeFragment$initViews$1;
        if (homeFragment$initViews$1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("periodicUpdate");
        }
        homeFragment$initViews$1.run();
        resetData();
        BaseFragment.addSwipeToRefreshLayout$default(this, null, new HomeFragment$initViews$2(this), 1, null);
    }

    private final void initEventCard() {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        CardView cardView = (CardView) getRootView().findViewById(R.id.card_event);
        PlaceHolderView placeHolderView = (PlaceHolderView) getRootView().findViewById(R.id.phv_events);
        if (placeHolderView != null) {
            placeHolderView.removeAllViews();
            TCHApplication requireTCHApplication = requireTCHApplication();
            List<EventCard> eventCards = (requireTCHApplication == null || (metadata = requireTCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null) ? null : value.getEventCards();
            List<EventCard> list = eventCards;
            if (!(list == null || list.isEmpty())) {
                Intrinsics.checkNotNullExpressionValue(cardView, "cardViewEvent");
                cardView.setVisibility(0);
                for (EventCard eventCard : eventCards) {
                    placeHolderView.addView(new ItemRowEventCard(eventCard, new HomeFragment$initEventCard$$inlined$let$lambda$1(eventCard, this, placeHolderView, cardView)));
                }
                return;
            }
            Intrinsics.checkNotNullExpressionValue(cardView, "cardViewEvent");
            cardView.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void listenViewInteractions(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.listenViewInteractions(view, bundle);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.layout_pickup_navigate);
        LinearLayout linearLayout2 = (LinearLayout) view.findViewById(R.id.layout_deli_navigate);
        LinearLayout linearLayout3 = (LinearLayout) view.findViewById(R.id.layout_at_table_navigate);
        Intrinsics.checkNotNullExpressionValue(linearLayout, "layoutPickupNavigate");
        ContextExtsKt.setOnSafeClickListener$default(linearLayout, 0, new HomeFragment$listenViewInteractions$1(this), 1, null);
        Intrinsics.checkNotNullExpressionValue(linearLayout2, "layoutDeliNavigate");
        ContextExtsKt.setOnSafeClickListener$default(linearLayout2, 0, new HomeFragment$listenViewInteractions$2(this), 1, null);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.availableShippingMethods(new HomeFragment$listenViewInteractions$3(this, view, linearLayout3));
        }
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "layoutAtTableNavigate");
        ContextExtsKt.setOnSafeClickListener$default(linearLayout3, 0, new HomeFragment$listenViewInteractions$4(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void hideDeliShortcut(View view) {
        View findViewById = view.findViewById(R.id.view17);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.layout_deli_navigate);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void showDeliShortcut(View view) {
        View findViewById = view.findViewById(R.id.view17);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = view.findViewById(R.id.layout_deli_navigate);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public final void hidePickupShortcut(View view) {
        View findViewById = view.findViewById(R.id.view17);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.layout_pickup_navigate);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void showPickupShortcut(View view) {
        View findViewById = view.findViewById(R.id.view17);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = view.findViewById(R.id.layout_pickup_navigate);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public final void hideAtTableShortcut(View view) {
        View findViewById = view.findViewById(R.id.view18);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        View findViewById2 = view.findViewById(R.id.layout_at_table_navigate);
        if (findViewById2 != null) {
            findViewById2.setVisibility(8);
        }
    }

    /* access modifiers changed from: private */
    public final void showAtTableShortcut(View view) {
        View findViewById = view.findViewById(R.id.view18);
        if (findViewById != null) {
            findViewById.setVisibility(0);
        }
        View findViewById2 = view.findViewById(R.id.layout_at_table_navigate);
        if (findViewById2 != null) {
            findViewById2.setVisibility(0);
        }
    }

    /* access modifiers changed from: private */
    public final void navigateToOrderWithMethod(Uri uri) {
        OrderFragment mOrderFragment;
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            mainActivity.navigateTabOrderWithMethod(uri);
        }
        MainActivity mainActivity2 = getMainActivity();
        if (!(mainActivity2 == null || (mOrderFragment = mainActivity2.getMOrderFragment()) == null)) {
            mOrderFragment.scrollToTop();
        }
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewMenu.name, OrderEvents.EventViewMenu.Value.Home_Shortcut);
    }

    /* access modifiers changed from: private */
    public final void openGuideUserOrderAtTableDialog() {
        FragmentManager supportFragmentManager;
        GuideUserOrderAtTableDialogFragment newInstance = GuideUserOrderAtTableDialogFragment.Companion.newInstance(new HomeFragment$openGuideUserOrderAtTableDialog$guideUserOrderAtTableDialogFragment$1(this));
        FragmentActivity activity = getActivity();
        if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    private final void initMediaBox() {
        RecyclerView.LayoutManager layoutManager;
        LiveData<GetMetadataResponse> metadata;
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (!(requireTCHApplication == null || (metadata = requireTCHApplication.m0getMetadata()) == null)) {
            metadata.observe(this, new HomeFragment$initMediaBox$1(this));
        }
        PlaceHolderView placeHolderView = (PlaceHolderView) getRootView().findViewById(R.id.phv_media_box);
        this.mMediaBoxPlaceHolderView = placeHolderView;
        if (placeHolderView != null) {
            placeHolderView.setHasFixedSize(true);
        }
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(requireContext(), 0, false);
        this.mMediaBoxLayoutManager = linearLayoutManager;
        PlaceHolderView placeHolderView2 = this.mMediaBoxPlaceHolderView;
        if (placeHolderView2 != null) {
            if (linearLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mMediaBoxLayoutManager");
            }
            placeHolderView2.setLayoutManager(linearLayoutManager);
        }
        PlaceHolderView placeHolderView3 = this.mMediaBoxPlaceHolderView;
        if (!(placeHolderView3 == null || (layoutManager = placeHolderView3.getLayoutManager()) == null)) {
            layoutManager.setItemPrefetchEnabled(true);
        }
        PlaceHolderView placeHolderView4 = this.mMediaBoxPlaceHolderView;
        if (placeHolderView4 != null) {
            placeHolderView4.addItemDecoration(new LinePagerIndicatorDecoration());
        }
        new PagerSnapHelper().attachToRecyclerView(this.mMediaBoxPlaceHolderView);
        PlaceHolderView placeHolderView5 = this.mMediaBoxPlaceHolderView;
        if (placeHolderView5 != null) {
            placeHolderView5.setOnTouchListener(new HomeFragment$initMediaBox$2(this));
        }
    }

    public final void resetData() {
        try {
            toggleViewLoggedInAndGuestUser();
            fetchDataLoggedInAndGuestUser();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private final void fetchDataLoggedInAndGuestUser() {
        ClientManager requireClientManager;
        HomeFragment homeFragment = this;
        ((HomeViewModel) getViewModel()).getMediaBox().observe(homeFragment, this.mObserveMediaBox);
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            initGuestModeUI();
            return;
        }
        getOrderViewModel().getOrdersProcessing().observe(homeFragment, this.mObserveOrdersProcessing);
        ((HomeViewModel) getViewModel()).getNotifications().observe(homeFragment, this.mObserveNotifications);
    }

    private final void toggleViewLoggedInAndGuestUser() {
        ClientManager requireClientManager;
        View findViewById = getRootView().findViewById(R.id.view_stub_login_top);
        View findViewById2 = getRootView().findViewById(R.id.view_stub_login_bot);
        RecyclerView recyclerView = (RecyclerView) getRootView().findViewById(R.id.rcv_orders_processing);
        RecyclerView recyclerView2 = (RecyclerView) getRootView().findViewById(R.id.rcv_notification);
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            Intrinsics.checkNotNullExpressionValue(findViewById, "viewStubLoginTop");
            findViewById.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "viewStubLoginBot");
            findViewById2.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rcvOrderProcessing");
            recyclerView.setVisibility(8);
            Intrinsics.checkNotNullExpressionValue(recyclerView2, "phvNotification");
            recyclerView2.setVisibility(8);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "viewStubLoginTop");
        findViewById.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "viewStubLoginBot");
        findViewById2.setVisibility(8);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rcvOrderProcessing");
        recyclerView.setVisibility(0);
        Intrinsics.checkNotNullExpressionValue(recyclerView2, "phvNotification");
        recyclerView2.setVisibility(0);
    }

    private final void initGuestModeUI() {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        List<RankInfoItem> rankInfo;
        RankInfoItem rankInfoItem;
        View findViewById = getRootView().findViewById(R.id.view_stub_login_top);
        TLTextView tLTextView = (TLTextView) findViewById.findViewById(R.id.txt_login);
        if (tLTextView != null) {
            ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new HomeFragment$initGuestModeUI$$inlined$apply$lambda$1(this), 1, null);
        }
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.img_icon_card);
        if (imageView != null) {
            TCHApplication requireTCHApplication = requireTCHApplication();
            ((RequestBuilder) Glide.with(imageView.getContext()).load((requireTCHApplication == null || (metadata = requireTCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null || (rankInfo = value.getRankInfo()) == null || (rankInfoItem = (RankInfoItem) CollectionsKt.firstOrNull(rankInfo)) == null) ? null : rankInfoItem.getIcon()).error((int) R.drawable.ic_header_bar_member_card)).into(imageView);
        }
        View findViewById2 = getRootView().findViewById(R.id.view_stub_login_bot);
        ViewGroup viewGroup = (ViewGroup) findViewById2.findViewById(R.id.layout_guest_home_reward_1);
        ((ImageView) viewGroup.findViewById(R.id.img_guest_reward_icon)).setImageResource(R.drawable.guest_home_icon_reward_1);
        View findViewById3 = viewGroup.findViewById(R.id.txt_guest_reward_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<TextView>(R…d.txt_guest_reward_title)");
        ((TextView) findViewById3).setText(getString(R.string.str_guest_home_icon_reward_1_title));
        View findViewById4 = viewGroup.findViewById(R.id.txt_guest_reward_body);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<TextView>(R.id.txt_guest_reward_body)");
        ((TextView) findViewById4).setText(getString(R.string.str_guest_home_icon_reward_1_body));
        ViewGroup viewGroup2 = (ViewGroup) findViewById2.findViewById(R.id.layout_guest_home_reward_2);
        ((ImageView) viewGroup2.findViewById(R.id.img_guest_reward_icon)).setImageResource(R.drawable.guest_home_icon_reward_2);
        View findViewById5 = viewGroup2.findViewById(R.id.txt_guest_reward_title);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "findViewById<TextView>(R…d.txt_guest_reward_title)");
        ((TextView) findViewById5).setText(getString(R.string.str_guest_home_icon_reward_2_title));
        View findViewById6 = viewGroup2.findViewById(R.id.txt_guest_reward_body);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "findViewById<TextView>(R.id.txt_guest_reward_body)");
        ((TextView) findViewById6).setText(getString(R.string.str_guest_home_icon_reward_2_body));
        ViewGroup viewGroup3 = (ViewGroup) findViewById2.findViewById(R.id.layout_guest_home_reward_3);
        ((ImageView) viewGroup3.findViewById(R.id.img_guest_reward_icon)).setImageResource(R.drawable.guest_home_icon_reward_3);
        View findViewById7 = viewGroup3.findViewById(R.id.txt_guest_reward_title);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "findViewById<TextView>(R…d.txt_guest_reward_title)");
        ((TextView) findViewById7).setText(getString(R.string.str_guest_home_icon_reward_3_title));
        View findViewById8 = viewGroup3.findViewById(R.id.txt_guest_reward_body);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "findViewById<TextView>(R.id.txt_guest_reward_body)");
        ((TextView) findViewById8).setText(getString(R.string.str_guest_home_icon_reward_3_body));
        TLTextView tLTextView2 = (TLTextView) findViewById2.findViewById(R.id.txt_register_member);
        if (tLTextView2 != null) {
            ContextExtsKt.setOnSafeClickListener$default(tLTextView2, 0, new HomeFragment$initGuestModeUI$6(this), 1, null);
        }
    }

    /* access modifiers changed from: private */
    public final void readNotification(Notification notification, int i) {
        ((HomeViewModel) getViewModel()).readNotification(notification.getId()).observe(this, new BaseFragment.ObserverBaseResource(this, new HomeFragment$readNotification$1(this, i), null, false, false, 14, null));
    }

    public final void scrollToTop() {
        try {
            ViewGroup rootView = getRootView();
            if (rootView != null) {
                ((NestedScrollView) rootView).smoothScrollTo(0, 0);
                return;
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.core.widget.NestedScrollView");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void onLoggedInUserListener() {
        super.onLoggedInUserListener();
        resetData();
    }
}
