package com.thecoffeehouse.guestapp.screens.order.recentorders;

import android.view.View;
import android.view.ViewStub;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0014J\b\u0010\u0005\u001a\u00020\u0006H\u0014J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\tH\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u0010\u000b\u001a\u00020\u0004H\u0014¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/recentorders/RecentProductsDialogFragment;", "Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment;", "()V", "collectDataTracking", "", "getAnalyticScreenName", "", "initViewStubHeader", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "onResume", "showEmptyList", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RecentProductsDialogFragment.kt */
public final class RecentProductsDialogFragment extends SearchProductDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;

    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
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
    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Menu_Recent_List;
    }

    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/recentorders/RecentProductsDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/recentorders/RecentProductsDialogFragment;", "mProducts", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Lkotlin/collections/ArrayList;", "onSelectProduct", "Lkotlin/Function1;", "", "onShowCartDialog", "Lkotlin/Function0;", "mOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RecentProductsDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RecentProductsDialogFragment newInstance(ArrayList<Product> arrayList, Function1<? super Product, Unit> function1, Function0<Unit> function0, Order order) {
            Intrinsics.checkNotNullParameter(arrayList, "mProducts");
            Intrinsics.checkNotNullParameter(function1, "onSelectProduct");
            Intrinsics.checkNotNullParameter(function0, "onShowCartDialog");
            RecentProductsDialogFragment recentProductsDialogFragment = new RecentProductsDialogFragment();
            recentProductsDialogFragment.setMProducts(arrayList);
            recentProductsDialogFragment.setOnSelectProduct(function1);
            recentProductsDialogFragment.setOnShowCartDialog(function0);
            recentProductsDialogFragment.setMOrder(order);
            return recentProductsDialogFragment;
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment
    public void initViewStubHeader(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_header);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.layout_sub_header);
            viewStub.setOnInflateListener(new RecentProductsDialogFragment$initViewStubHeader$$inlined$let$lambda$1(this, viewStub));
            viewStub.inflate();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventRecentItemList.name, OrderEvents.EventRecentItemList.name);
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventRecentItemList.name, new TrackingData(OrderEvents.EventRecentItemList.Value.qtyItemsInRecent, Integer.valueOf(getMProducts().size())));
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventRecentItemList.name);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment
    public void showEmptyList() {
        super.showEmptyList();
        BaseFullScreenDialogFragment.addEmptyListLayout$default(this, Integer.valueOf((int) R.drawable.ic_empty_recent_product), getString(R.string.str_empty_recent_product), null, null, null, 28, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment, com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void collectDataTracking() {
        super.collectDataTracking();
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventItemAddedToCartSuccessfully.name, "Recent");
    }
}
