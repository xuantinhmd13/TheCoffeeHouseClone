package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import android.os.Bundle;
import android.view.View;
import android.view.ViewStub;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.cart.FloatingCartInteraction;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0016\u0018\u0000 @2\u00020\u0001:\u0001@B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010.\u001a\u00020#H\u0014J\n\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0010\u00101\u001a\u00020#2\u0006\u00102\u001a\u000203H\u0002J\b\u00104\u001a\u00020#H\u0002J\u0010\u00105\u001a\u00020#2\u0006\u00102\u001a\u000203H\u0016J\u001a\u00106\u001a\u00020#2\u0006\u00102\u001a\u0002032\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020:H\u0016J\b\u0010;\u001a\u00020#H\u0016J\b\u0010<\u001a\u00020#H\u0002J\b\u0010=\u001a\u00020#H\u0014J\u000e\u0010>\u001a\u00020#2\u0006\u0010?\u001a\u00020\nR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R*\u0010\u0015\u001a\u0012\u0012\u0004\u0012\u00020\u00170\u0016j\b\u0012\u0004\u0012\u00020\u0017`\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0004¢\u0006\u0002\n\u0000R&\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020#0\"X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R \u0010(\u001a\b\u0012\u0004\u0012\u00020#0)X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010+\"\u0004\b,\u0010-¨\u0006A"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mFloatingCartInteraction", "Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "getMFloatingCartInteraction", "()Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "mFloatingCartInteraction$delegate", "Lkotlin/Lazy;", "mOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "getMOrder", "()Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "setMOrder", "(Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;)V", "mProductAdapter", "Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter;", "getMProductAdapter", "()Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter;", "setMProductAdapter", "(Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter;)V", "mProducts", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Lkotlin/collections/ArrayList;", "getMProducts", "()Ljava/util/ArrayList;", "setMProducts", "(Ljava/util/ArrayList;)V", "mRcvProduct", "Landroidx/recyclerview/widget/RecyclerView;", "mSoftKeyboardToggleListener", "Lcom/thecoffeehouse/guestapp/utility/KeyboardUtils$SoftKeyboardToggleListener;", "onSelectProduct", "Lkotlin/Function1;", "", "getOnSelectProduct", "()Lkotlin/jvm/functions/Function1;", "setOnSelectProduct", "(Lkotlin/jvm/functions/Function1;)V", "onShowCartDialog", "Lkotlin/Function0;", "getOnShowCartDialog", "()Lkotlin/jvm/functions/Function0;", "setOnShowCartDialog", "(Lkotlin/jvm/functions/Function0;)V", "collectDataTracking", "getAnalyticScreenName", "", "initFloatingCart", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initProductAdapter", "initViewStubHeader", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "onDestroy", "setPaddingScrollViewByFloatingCart", "showEmptyList", "updateCart", "order", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchProductDialogFragment.kt */
public class SearchProductDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private final Lazy mFloatingCartInteraction$delegate = LazyKt.lazy(SearchProductDialogFragment$mFloatingCartInteraction$2.INSTANCE);
    private Order mOrder;
    private SearchProductRecyclerViewAdapter mProductAdapter;
    private ArrayList<Product> mProducts = new ArrayList<>();
    private RecyclerView mRcvProduct;
    private final KeyboardUtils.SoftKeyboardToggleListener mSoftKeyboardToggleListener = new SearchProductDialogFragment$mSoftKeyboardToggleListener$1(this);
    private Function1<? super Product, Unit> onSelectProduct = SearchProductDialogFragment$onSelectProduct$1.INSTANCE;
    private Function0<Unit> onShowCartDialog = SearchProductDialogFragment$onShowCartDialog$1.INSTANCE;

    /* access modifiers changed from: private */
    public final FloatingCartInteraction getMFloatingCartInteraction() {
        return (FloatingCartInteraction) this.mFloatingCartInteraction$delegate.getValue();
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
        return TrackingScreenService.Item_Search_List;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_search_product;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    public void showEmptyList() {
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment;", "mProducts", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Lkotlin/collections/ArrayList;", "onSelectProduct", "Lkotlin/Function1;", "", "onShowCartDialog", "Lkotlin/Function0;", "mOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SearchProductDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SearchProductDialogFragment newInstance(ArrayList<Product> arrayList, Function1<? super Product, Unit> function1, Function0<Unit> function0, Order order) {
            Intrinsics.checkNotNullParameter(arrayList, "mProducts");
            Intrinsics.checkNotNullParameter(function1, "onSelectProduct");
            Intrinsics.checkNotNullParameter(function0, "onShowCartDialog");
            SearchProductDialogFragment searchProductDialogFragment = new SearchProductDialogFragment();
            searchProductDialogFragment.setMProducts(arrayList);
            searchProductDialogFragment.setOnSelectProduct(function1);
            searchProductDialogFragment.setOnShowCartDialog(function0);
            searchProductDialogFragment.setMOrder(order);
            return searchProductDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    public ArrayList<Product> getMProducts() {
        return this.mProducts;
    }

    /* access modifiers changed from: protected */
    public void setMProducts(ArrayList<Product> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "<set-?>");
        this.mProducts = arrayList;
    }

    /* access modifiers changed from: protected */
    /* JADX DEBUG: Type inference failed for r0v0. Raw type applied. Possible types: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.Product, kotlin.Unit>, kotlin.jvm.functions.Function1<com.thecoffeehouse.guestapp.services.api.model.orders.Product, kotlin.Unit> */
    public final Function1<Product, Unit> getOnSelectProduct() {
        return this.onSelectProduct;
    }

    /* access modifiers changed from: protected */
    public final void setOnSelectProduct(Function1<? super Product, Unit> function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.onSelectProduct = function1;
    }

    /* access modifiers changed from: protected */
    public final Function0<Unit> getOnShowCartDialog() {
        return this.onShowCartDialog;
    }

    /* access modifiers changed from: protected */
    public final void setOnShowCartDialog(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onShowCartDialog = function0;
    }

    /* access modifiers changed from: protected */
    public final Order getMOrder() {
        return this.mOrder;
    }

    /* access modifiers changed from: protected */
    public final void setMOrder(Order order) {
        this.mOrder = order;
    }

    /* access modifiers changed from: protected */
    public SearchProductRecyclerViewAdapter getMProductAdapter() {
        return this.mProductAdapter;
    }

    /* access modifiers changed from: protected */
    public void setMProductAdapter(SearchProductRecyclerViewAdapter searchProductRecyclerViewAdapter) {
        this.mProductAdapter = searchProductRecyclerViewAdapter;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mRcvProduct = (RecyclerView) view.findViewById(R.id.rcv_products);
        initFloatingCart(view);
        initViewStubHeader(view);
        if (!getMProducts().isEmpty()) {
            initProductAdapter();
        } else {
            showEmptyList();
        }
        KeyboardUtils.addKeyboardToggleListener(getMainActivity(), this.mSoftKeyboardToggleListener);
        setPaddingScrollViewByFloatingCart();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void collectDataTracking() {
        super.collectDataTracking();
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventItemAddedToCartSuccessfully.name, "Search");
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventSearchItem.name, "Tab_Order");
        TrackingEventService.Companion.collectParamWithEventName(OrderEvents.EventSearchItem.name, new TrackingData("source", "Tab_Order"));
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventSearchItem.name);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KeyboardUtils.removeKeyboardToggleListener(this.mSoftKeyboardToggleListener);
    }

    private final void initProductAdapter() {
        setMProductAdapter(new SearchProductRecyclerViewAdapter(new ArrayList(getMProducts()), new SearchProductDialogFragment$initProductAdapter$1(this), null, 4, null));
        RecyclerView recyclerView = this.mRcvProduct;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new SearchProductDialogFragment$initProductAdapter$2(this, requireContext()));
        }
        RecyclerView recyclerView2 = this.mRcvProduct;
        if (recyclerView2 != null) {
            recyclerView2.setAdapter(getMProductAdapter());
        }
    }

    private final void initFloatingCart(View view) {
        FloatingCartInteraction mFloatingCartInteraction = getMFloatingCartInteraction();
        View findViewById = view.findViewById(R.id.layout_floating_cart);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.layout_floating_cart)");
        mFloatingCartInteraction.initView(findViewById);
        Order order = this.mOrder;
        if (order != null) {
            Intrinsics.checkNotNull(order);
            updateCart(order);
        }
        getMFloatingCartInteraction().setSetOnSafeClickListener(new SearchProductDialogFragment$initFloatingCart$1(this));
        getMFloatingCartInteraction().setSetOnClickButtonActionListener(new SearchProductDialogFragment$initFloatingCart$2(this));
    }

    public void initViewStubHeader(View view) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_header);
        if (viewStub != null) {
            viewStub.setLayoutResource(R.layout.layout_search_product);
            viewStub.setOnInflateListener(new SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1(this, viewStub));
            viewStub.inflate();
        }
    }

    public final void updateCart(Order order) {
        Intrinsics.checkNotNullParameter(order, "order");
        this.mOrder = order;
        FloatingCartInteraction.updateCart$default(getMFloatingCartInteraction(), this.mOrder, false, null, 4, null);
        setPaddingScrollViewByFloatingCart();
    }

    private final void setPaddingScrollViewByFloatingCart() {
        RecyclerView recyclerView = this.mRcvProduct;
        if (recyclerView == null) {
            return;
        }
        if (getMFloatingCartInteraction().getLayoutFloatingCart().getVisibility() == 8) {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ViewExtsKt.DPtoPX(25.0f));
        } else {
            recyclerView.setPadding(recyclerView.getPaddingLeft(), recyclerView.getPaddingTop(), recyclerView.getPaddingRight(), ViewExtsKt.DPtoPX(70.0f));
        }
    }
}
