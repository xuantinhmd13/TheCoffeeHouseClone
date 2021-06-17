package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.cart.FloatingCartInteraction;
import com.thecoffeehouse.guestapp.services.api.model.orders.AddressOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.services.api.model.orders.Order;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\u0018\u0000 92\u00020\u0001:\u00019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010&\u001a\u00020\u001eH\u0014J\b\u0010'\u001a\u00020\u0005H\u0014J\n\u0010(\u001a\u0004\u0018\u00010)H\u0014J\u0010\u0010*\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000fH\u0002J\u0010\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000fH\u0002J\u001a\u0010,\u001a\u00020\u001e2\u0006\u0010+\u001a\u00020\u000f2\b\u0010-\u001a\u0004\u0018\u00010.H\u0014J\b\u0010/\u001a\u00020\u0005H\u0016J\b\u00100\u001a\u00020\u001eH\u0002J\b\u00101\u001a\u00020\u001eH\u0002J\u0010\u00102\u001a\u00020\u001e2\b\u00103\u001a\u0004\u0018\u00010\u0013J\u0016\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u00020\u00182\u0006\u00106\u001a\u00020!J\u000e\u00107\u001a\u00020\u001e2\u0006\u00108\u001a\u00020\u0011R$\u0010\u0003\u001a\u0018\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\b\u001a\u00020\t8BX\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u000e\u001a\u00020\u000fX.¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X.¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\b\u0012\u0004\u0012\u00020\u0018`\u0019X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u000e¢\u0006\u0002\n\u0000R*\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0004\u0012\u00020\u001e0\u001dX\u000e¢\u0006\u0002\n\u0000R \u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u001e0 X.¢\u0006\u0002\n\u0000R\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001e0#X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010$\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u001e0%X\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/MenuDetailDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mCurrentShippingMethod", "Lkotlin/Triple;", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "mFloatingCartInteraction", "Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "getMFloatingCartInteraction", "()Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "mFloatingCartInteraction$delegate", "Lkotlin/Lazy;", "mLayoutShippingScrollable", "Landroid/view/View;", "mMenuItem", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "mOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "mProductAdapter", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductRecyclerViewAdapter;", "mProducts", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Lkotlin/collections/ArrayList;", "mRcvProduct", "Landroidx/recyclerview/widget/RecyclerView;", "onChangeShippingMethod", "Lkotlin/Function3;", "", "onClickFavouriteProduct", "Lkotlin/Function2;", "", "onShowCartDialog", "Lkotlin/Function0;", "onShowProductDetail", "Lkotlin/Function1;", "collectDataTracking", "getAnalyticLayoutName", "getAnalyticScreenName", "", "initToolbar", ViewHierarchyConstants.VIEW_KEY, "initViews", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "listenViews", "setPaddingScrollViewByFloatingCart", "updateCart", "order", "updateFavouriteProduct", "productFavourite", "favourite", "updateMenu", "updatedMenu", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MenuDetailDialogFragment.kt */
public final class MenuDetailDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Triple<Integer, AddressOrder, Store> mCurrentShippingMethod = new Triple<>(-1, null, null);
    private final Lazy mFloatingCartInteraction$delegate = LazyKt.lazy(MenuDetailDialogFragment$mFloatingCartInteraction$2.INSTANCE);
    private View mLayoutShippingScrollable;
    private Menu mMenuItem;
    private Order mOrder;
    private ProductRecyclerViewAdapter mProductAdapter;
    private ArrayList<Product> mProducts = new ArrayList<>();
    private RecyclerView mRcvProduct;
    private Function3<? super Integer, ? super AddressOrder, ? super Store, Unit> onChangeShippingMethod = MenuDetailDialogFragment$onChangeShippingMethod$1.INSTANCE;
    private Function2<? super Product, ? super Boolean, Unit> onClickFavouriteProduct;
    private Function0<Unit> onShowCartDialog = MenuDetailDialogFragment$onShowCartDialog$1.INSTANCE;
    private Function1<? super Product, Unit> onShowProductDetail = MenuDetailDialogFragment$onShowProductDetail$1.INSTANCE;

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
    public int getAnalyticLayoutName() {
        return R.layout.fragment_menu_detail;
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Menu_Item_List_FromCategory;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.layout_sub_header_view_stub_fragment;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ View access$getMLayoutShippingScrollable$p(MenuDetailDialogFragment menuDetailDialogFragment) {
        View view = menuDetailDialogFragment.mLayoutShippingScrollable;
        if (view == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutShippingScrollable");
        }
        return view;
    }

    public static final /* synthetic */ ProductRecyclerViewAdapter access$getMProductAdapter$p(MenuDetailDialogFragment menuDetailDialogFragment) {
        ProductRecyclerViewAdapter productRecyclerViewAdapter = menuDetailDialogFragment.mProductAdapter;
        if (productRecyclerViewAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProductAdapter");
        }
        return productRecyclerViewAdapter;
    }

    public static final /* synthetic */ Function2 access$getOnClickFavouriteProduct$p(MenuDetailDialogFragment menuDetailDialogFragment) {
        Function2<? super Product, ? super Boolean, Unit> function2 = menuDetailDialogFragment.onClickFavouriteProduct;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickFavouriteProduct");
        }
        return function2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u001c\u0010\t\u001a\u0018\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r0\n2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f2\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132$\b\u0002\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0004\u0012\u00020\u00110\u00152\u0018\u0010\u0016\u001a\u0014\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00110\u0017¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/MenuDetailDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/MenuDetailDialogFragment;", "mMenuItem", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "mOrder", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Order;", "mCurrentShippingMethod", "Lkotlin/Triple;", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/AddressOrder;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "onShowProductDetail", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "", "onShowCartDialog", "Lkotlin/Function0;", "onChangeShippingMethod", "Lkotlin/Function3;", "onClickFavouriteProduct", "Lkotlin/Function2;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: MenuDetailDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ MenuDetailDialogFragment newInstance$default(Companion companion, Menu menu, Order order, Triple triple, Function1 function1, Function0 function0, Function3 function3, Function2 function2, int i, Object obj) {
            return companion.newInstance(menu, order, triple, (i & 8) != 0 ? MenuDetailDialogFragment$Companion$newInstance$1.INSTANCE : function1, (i & 16) != 0 ? MenuDetailDialogFragment$Companion$newInstance$2.INSTANCE : function0, (i & 32) != 0 ? MenuDetailDialogFragment$Companion$newInstance$3.INSTANCE : function3, function2);
        }

        public final MenuDetailDialogFragment newInstance(Menu menu, Order order, Triple<Integer, AddressOrder, Store> triple, Function1<? super Product, Unit> function1, Function0<Unit> function0, Function3<? super Integer, ? super AddressOrder, ? super Store, Unit> function3, Function2<? super Product, ? super Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(menu, "mMenuItem");
            Intrinsics.checkNotNullParameter(triple, "mCurrentShippingMethod");
            Intrinsics.checkNotNullParameter(function1, "onShowProductDetail");
            Intrinsics.checkNotNullParameter(function0, "onShowCartDialog");
            Intrinsics.checkNotNullParameter(function3, "onChangeShippingMethod");
            Intrinsics.checkNotNullParameter(function2, "onClickFavouriteProduct");
            MenuDetailDialogFragment menuDetailDialogFragment = new MenuDetailDialogFragment();
            menuDetailDialogFragment.mMenuItem = menu;
            menuDetailDialogFragment.mOrder = order;
            menuDetailDialogFragment.mCurrentShippingMethod = triple;
            menuDetailDialogFragment.onShowProductDetail = function1;
            menuDetailDialogFragment.onShowCartDialog = function0;
            menuDetailDialogFragment.onChangeShippingMethod = function3;
            menuDetailDialogFragment.onClickFavouriteProduct = function2;
            return menuDetailDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        showLoading();
        initToolbar(view);
        ViewStub viewStub = (ViewStub) view.findViewById(R.id.view_stub_fragment);
        if (viewStub != null) {
            viewStub.setOnInflateListener(new MenuDetailDialogFragment$initViews$$inlined$let$lambda$1(this, viewStub, view));
            viewStub.setLayoutResource(R.layout.fragment_menu_detail);
            viewStub.post(new MenuDetailDialogFragment$initViews$$inlined$let$lambda$2(this, viewStub, view));
        }
    }

    /* access modifiers changed from: private */
    public final void initViews(View view) {
        ArrayList<Product> arrayList;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_products);
        this.mRcvProduct = recyclerView;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new MenuDetailDialogFragment$initViews$2(view, view.getContext()));
        }
        FloatingCartInteraction mFloatingCartInteraction = getMFloatingCartInteraction();
        View findViewById = view.findViewById(R.id.layout_floating_cart);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.layout_floating_cart)");
        mFloatingCartInteraction.initView(findViewById);
        Order order = this.mOrder;
        if (order != null) {
            updateCart(order);
        }
        Menu menu = this.mMenuItem;
        if (menu == null || (arrayList = menu.getProducts()) == null) {
            arrayList = new ArrayList<>();
        }
        this.mProducts = arrayList;
        RecyclerView recyclerView2 = this.mRcvProduct;
        if (recyclerView2 != null) {
            recyclerView2.addOnScrollListener(new MenuDetailDialogFragment$initViews$3(this));
        }
        RecyclerView recyclerView3 = this.mRcvProduct;
        RecyclerView.ItemAnimator itemAnimator = recyclerView3 != null ? recyclerView3.getItemAnimator() : null;
        if (itemAnimator instanceof SimpleItemAnimator) {
            ((SimpleItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        }
        listenViews();
        setPaddingScrollViewByFloatingCart();
        hideLoading();
    }

    /* access modifiers changed from: private */
    public final void initToolbar(View view) {
        View findViewById = view.findViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(findViewById, "toolbar");
        TextView textView = (TextView) findViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        Menu menu = this.mMenuItem;
        textView.setText(menu != null ? menu.getName() : null);
        ImageView imageView = (ImageView) findViewById.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new MenuDetailDialogFragment$initToolbar$1(this), 1, null);
    }

    public final void updateCart(Order order) {
        FloatingCartInteraction.updateCart$default(getMFloatingCartInteraction(), order, false, null, 4, null);
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

    private final void listenViews() {
        getMFloatingCartInteraction().setSetOnSafeClickListener(new MenuDetailDialogFragment$listenViews$1(this));
        getMFloatingCartInteraction().setSetOnClickButtonActionListener(new MenuDetailDialogFragment$listenViews$2(this));
    }

    public final void updateMenu(Menu menu) {
        Intrinsics.checkNotNullParameter(menu, "updatedMenu");
        this.mProducts.clear();
        this.mProducts.addAll(menu.getProducts());
        if (this.mProductAdapter == null || this.mRcvProduct == null) {
            ViewGroup rootView = getRootView();
            RecyclerView recyclerView = rootView != null ? (RecyclerView) rootView.findViewById(R.id.rcv_products) : null;
            this.mRcvProduct = recyclerView;
            if (recyclerView != null) {
                ProductRecyclerViewAdapter productRecyclerViewAdapter = this.mProductAdapter;
                if (productRecyclerViewAdapter == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mProductAdapter");
                }
                recyclerView.setAdapter(productRecyclerViewAdapter);
                return;
            }
            return;
        }
        ProductRecyclerViewAdapter productRecyclerViewAdapter2 = this.mProductAdapter;
        if (productRecyclerViewAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProductAdapter");
        }
        productRecyclerViewAdapter2.notifyItemRangeChanged(0, this.mProducts.size());
    }

    public final void updateFavouriteProduct(Product product, boolean z) {
        T t;
        Intrinsics.checkNotNullParameter(product, "productFavourite");
        Iterator<T> it = this.mProducts.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (Intrinsics.areEqual(t.getId(), product.getId())) {
                break;
            }
        }
        T t2 = t;
        if (t2 != null) {
            t2.setFavourite(z);
        }
        int indexOf = this.mProducts.indexOf(product);
        GeneralKt.log("position: " + indexOf + " - " + z);
        ProductRecyclerViewAdapter productRecyclerViewAdapter = this.mProductAdapter;
        if (productRecyclerViewAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mProductAdapter");
        }
        productRecyclerViewAdapter.notifyItemChanged(indexOf);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void collectDataTracking() {
        ArrayList<Product> products;
        super.collectDataTracking();
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventItemAddedToCartSuccessfully.name, "Category");
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewCategoryItemList.name, OrderEvents.EventViewCategoryItemList.name);
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[2];
        Menu menu = this.mMenuItem;
        Integer num = null;
        trackingDataArr[0] = new TrackingData("categoryID", menu != null ? Integer.valueOf(menu.getId()) : null);
        Menu menu2 = this.mMenuItem;
        if (!(menu2 == null || (products = menu2.getProducts()) == null)) {
            num = Integer.valueOf(products.size());
        }
        trackingDataArr[1] = new TrackingData("qtyItems", num);
        companion.collectParamWithEventName(OrderEvents.EventViewCategoryItemList.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewCategoryItemList.name);
    }
}
