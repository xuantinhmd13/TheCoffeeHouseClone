package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.InfinitePlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersProcessingResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0014J\u0016\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\b\u0010\u0019\u001a\u00020\u0015H\u0002J\u001a\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\b\u0010\u001f\u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0006R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/RecentOrderDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mIsAbleToLoadMore", "", "mObserveOrdersHistory", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersHistoryResponse;", "mObserveOrdersProcessing", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersProcessingResponse;", "mPage", "", "orderViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getOrderViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "orderViewModel$delegate", "Lkotlin/Lazy;", "getAnalyticScreenName", "", "initOrdersProcessing", "", "processingOrders", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderProcessing;", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RecentOrderDialogFragment.kt */
public final class RecentOrderDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private boolean mIsAbleToLoadMore = true;
    private final BaseFullScreenDialogFragment.ObserverBaseResource<GetOrdersHistoryResponse> mObserveOrdersHistory = new BaseFullScreenDialogFragment.ObserverBaseResource<>(this, new RecentOrderDialogFragment$mObserveOrdersHistory$1(this), null, false, false, 10, null);
    private final BaseFullScreenDialogFragment.ObserverBaseResource<GetOrdersProcessingResponse> mObserveOrdersProcessing = new BaseFullScreenDialogFragment.ObserverBaseResource<>(this, new RecentOrderDialogFragment$mObserveOrdersProcessing$1(this), null, false, false, 14, null);
    private int mPage = 1;
    private final Lazy orderViewModel$delegate = LazyKt.lazy(new RecentOrderDialogFragment$orderViewModel$2(this));

    /* access modifiers changed from: private */
    public final OrderViewModel getOrderViewModel() {
        return (OrderViewModel) this.orderViewModel$delegate.getValue();
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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Order_History_List;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_recent_orders;
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
        BaseFullScreenDialogFragment.addSwipeToRefreshLayout$default(this, null, new RecentOrderDialogFragment$initViews$1(this), 1, null);
        getOrderViewModel().getOrdersProcessing().observe(this, this.mObserveOrdersProcessing);
    }

    /* access modifiers changed from: private */
    public final void initOrdersProcessing(List<? extends OrderProcessing> list) {
        if (!list.isEmpty()) {
            String string = getString(R.string.str_order_processing);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_order_processing)");
            ((InfinitePlaceHolderView) _$_findCachedViewById(R.id.iphv_recent_orders)).addView(new ItemRowRecentOrderHeader(string));
            for (OrderProcessing orderProcessing : list) {
                ((InfinitePlaceHolderView) _$_findCachedViewById(R.id.iphv_recent_orders)).addView(new ItemRowOrderProcessing(orderProcessing, new RecentOrderDialogFragment$initOrdersProcessing$rowOrderProcessing$1(this, orderProcessing)));
            }
        }
        LiveData ordersHistory$default = OrderViewModel.getOrdersHistory$default(getOrderViewModel(), this.mPage, 0, 2, null);
        RecentOrderDialogFragment recentOrderDialogFragment = this;
        ordersHistory$default.observe(recentOrderDialogFragment, this.mObserveOrdersHistory);
        ordersHistory$default.observe(recentOrderDialogFragment, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new RecentOrderDialogFragment$initOrdersProcessing$1(this), null, false, false, 14, null));
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_order_history));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new RecentOrderDialogFragment$initToolbar$1(this), 1, null);
    }
}
