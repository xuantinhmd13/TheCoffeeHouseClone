package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.configs.trackingevents.EditCartEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductNoteDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ExpandCollapseTextView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ItemRowImageProduct;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ItemRowImageProductFullWidth;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.NoteProductView;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.OptionItemCheckBoxLayout;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.OptionItemRadioButtonLayout;
import com.thecoffeehouse.guestapp.services.api.model.orders.Extra;
import com.thecoffeehouse.guestapp.services.api.model.orders.Item;
import com.thecoffeehouse.guestapp.services.api.model.orders.Option;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderLine;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.utility.KeyboardUtils;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u0000 D2\u00020\u0001:\u0002DEB\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u000fH\u0002J\b\u0010\u001e\u001a\u00020\u0017H\u0014J\b\u0010\u001f\u001a\u00020\u0017H\u0002J\b\u0010 \u001a\u00020\u0017H\u0002J\b\u0010!\u001a\u00020\u0017H\u0002J\u0010\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u0012\u0012\u0004\u0012\u00020#0\u0006j\b\u0012\u0004\u0012\u00020#`\u0007H\u0002J\b\u0010'\u001a\u00020\u0017H\u0002J\u0010\u0010(\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010)\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010*\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010+\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010,\u001a\u00020\u0017H\u0002J\n\u0010-\u001a\u0004\u0018\u00010.H\u0016J\u0010\u0010/\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u00100\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u00101\u001a\u00020\u0017H\u0016J\b\u00102\u001a\u00020\u0017H\u0002J\b\u00103\u001a\u00020\u0017H\u0002J\b\u00104\u001a\u00020\u0017H\u0002J\u001a\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00042\b\u00107\u001a\u0004\u0018\u000108H\u0014J\b\u00109\u001a\u00020\u0016H\u0002J\b\u0010:\u001a\u00020\u000fH\u0016J\b\u0010;\u001a\u00020\u0017H\u0016J\b\u0010<\u001a\u00020\u0017H\u0002J\u0010\u0010=\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010>\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\u0010\u0010?\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010@\u001a\u00020\u0017H\u0016J\b\u0010A\u001a\u00020\u0017H\u0002J\u0012\u0010B\u001a\u00020\u00172\b\u0010C\u001a\u0004\u0018\u00010.H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0006j\b\u0012\u0004\u0012\u00020\u0004`\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R \u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00170\u0019X.¢\u0006\u0002\n\u0000¨\u0006F"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "mFloatingCartLayout", "Landroid/view/View;", "mOptionViews", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mOrderLine", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "mProduct", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "mProductConfiguration", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;", "mQuantity", "", "mSoftKeyboardToggleListener", "Lcom/thecoffeehouse/guestapp/utility/KeyboardUtils$SoftKeyboardToggleListener;", "noteProductView", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/NoteProductView;", "onCheckFavouriteChange", "Lkotlin/Function2;", "", "", "onSubmitOrder", "Lkotlin/Function1;", "addViewRadioButtonOptions", "option", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Option;", "calculateTotalPrice", "collectDataTracking", "collectParamEventEditItemCart", "collectParamRemoveItemCart", "collectTrackingData", "convertOptionToExtra", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Extra;", "optionItem", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Item;", "convertSelectedOptionItemsToExtras", "createNoteOption", "createViewCheckboxGroupWithDefaultIndex", "createViewCheckboxGroupWithoutDefaultIndex", "createViewRadioGroupWithDefaultIndex", "createViewRadioGroupWithoutDefaultIndex", "generateProductOptionsView", "getAnalyticScreenName", "", "hasMoreThanOneOptions", "hasOnlyOneOption", "hideLoading", "initOrderLine", "initProductInfo", "initQuantityView", "initViews", ViewHierarchyConstants.VIEW_KEY, "savedInstanceState", "Landroid/os/Bundle;", OrderEvents.EventItemAddedToCartSuccessfully.Param.isCustomized, "layoutResId", "onDestroy", "openProductNoteDialog", "optionIsMustHave", "optionIsSingleSelect", "selectSingleOption", "showLoading", "totalPriceChange", "updateNote", "note", "Companion", "ProductConfiguration", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private View mFloatingCartLayout;
    private final ArrayList<View> mOptionViews = new ArrayList<>();
    private final OrderLine mOrderLine = new OrderLine();
    private Product mProduct;
    private ProductConfiguration mProductConfiguration;
    private int mQuantity = 1;
    private final KeyboardUtils.SoftKeyboardToggleListener mSoftKeyboardToggleListener = new ProductDetailDialogFragment$mSoftKeyboardToggleListener$1(this);
    private NoteProductView noteProductView;
    private Function2<? super Product, ? super Boolean, Unit> onCheckFavouriteChange;
    private Function1<? super OrderLine, Unit> onSubmitOrder;

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
        return TrackingScreenService.Item_Detail;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void hideLoading() {
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.layout_product_detail;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void showLoading() {
    }

    public static final /* synthetic */ Function2 access$getOnCheckFavouriteChange$p(ProductDetailDialogFragment productDetailDialogFragment) {
        Function2<? super Product, ? super Boolean, Unit> function2 = productDetailDialogFragment.onCheckFavouriteChange;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onCheckFavouriteChange");
        }
        return function2;
    }

    public static final /* synthetic */ Function1 access$getOnSubmitOrder$p(ProductDetailDialogFragment productDetailDialogFragment) {
        Function1<? super OrderLine, Unit> function1 = productDetailDialogFragment.onSubmitOrder;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onSubmitOrder");
        }
        return function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JH\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0018\u0010\r\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\f0\u000e¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment;", "mProduct", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "mProductConfiguration", "Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;", "onSubmitOrder", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderLine;", "", "onCheckFavouriteChange", "Lkotlin/Function2;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ProductDetailDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ProductDetailDialogFragment newInstance$default(Companion companion, Product product, ProductConfiguration productConfiguration, Function1 function1, Function2 function2, int i, Object obj) {
            if ((i & 2) != 0) {
                productConfiguration = null;
            }
            return companion.newInstance(product, productConfiguration, function1, function2);
        }

        public final ProductDetailDialogFragment newInstance(Product product, ProductConfiguration productConfiguration, Function1<? super OrderLine, Unit> function1, Function2<? super Product, ? super Boolean, Unit> function2) {
            Intrinsics.checkNotNullParameter(product, "mProduct");
            Intrinsics.checkNotNullParameter(function1, "onSubmitOrder");
            Intrinsics.checkNotNullParameter(function2, "onCheckFavouriteChange");
            ProductDetailDialogFragment productDetailDialogFragment = new ProductDetailDialogFragment();
            productDetailDialogFragment.mProduct = product;
            productDetailDialogFragment.mProductConfiguration = productConfiguration;
            productDetailDialogFragment.onSubmitOrder = function1;
            productDetailDialogFragment.onCheckFavouriteChange = function2;
            return productDetailDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mFloatingCartLayout = view.findViewById(R.id.layout_total_price);
        initProductInfo();
        generateProductOptionsView();
        View rootView = getRootView();
        if (rootView != null) {
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView10);
            Intrinsics.checkNotNullExpressionValue(imageView, "imageView10");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ProductDetailDialogFragment$initViews$$inlined$apply$lambda$1(this), 1, null);
            initQuantityView();
            totalPriceChange();
            ((LayoutFooterProductDetail) rootView.findViewById(R.id.layout_total_price)).setOnClickSelectProductListener(new ProductDetailDialogFragment$initViews$$inlined$apply$lambda$2(this));
            ((ToggleButton) rootView.findViewById(R.id.toggle_favourite)).setOnCheckedChangeListener(new ProductDetailDialogFragment$initViews$$inlined$apply$lambda$3(this));
            LinearLayout linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_product_favourite);
            Intrinsics.checkNotNullExpressionValue(linearLayout, "layout_product_favourite");
            ContextExtsKt.setOnSafeClickListener$default(linearLayout, 0, new ProductDetailDialogFragment$initViews$1$4(rootView), 1, null);
        }
        KeyboardUtils.addKeyboardToggleListener(getMainActivity(), this.mSoftKeyboardToggleListener);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        KeyboardUtils.removeKeyboardToggleListener(this.mSoftKeyboardToggleListener);
    }

    private final void addViewRadioButtonOptions(Option option) {
        LinearLayout linearLayout;
        HashMap<Integer, ArrayList<Integer>> editedOption;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_option_product_header, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) inflate;
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.layout_selection);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "layoutSelection");
        LinearLayout linearLayout4 = linearLayout3;
        TextView textView = (TextView) linearLayout4.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutSelection.txt_option_name");
        textView.setText(option.getName());
        TextView textView2 = (TextView) linearLayout4.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutSelection.txt_option_desc");
        textView2.setText(option.getDescription());
        TLTextView tLTextView = (TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutSelection.txt_option_must_have");
        tLTextView.setText(getString(R.string.str_must_have));
        CustomRadioGroup customRadioGroup = new CustomRadioGroup(requireContext());
        customRadioGroup.setOrientation(1);
        int i = 0;
        for (T t : option.getItems()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            t2.setGroupId(option.getGroupId());
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OptionItemRadioButtonLayout optionItemRadioButtonLayout = new OptionItemRadioButtonLayout(t2, requireContext);
            optionItemRadioButtonLayout.getRadioButton().setId(t2.getId());
            this.mOptionViews.add(optionItemRadioButtonLayout);
            OptionItemRadioButtonLayout optionItemRadioButtonLayout2 = optionItemRadioButtonLayout;
            customRadioGroup.addView(optionItemRadioButtonLayout2);
            ViewExtsKt.marginStart(optionItemRadioButtonLayout2, ViewExtsKt.DPtoPX(16.0f));
            ProductConfiguration productConfiguration = this.mProductConfiguration;
            ArrayList<Integer> arrayList = (productConfiguration == null || (editedOption = productConfiguration.getEditedOption()) == null) ? null : editedOption.get(option.getGroupId());
            if (arrayList == null) {
                if (i == option.getDefaultIndex()) {
                    customRadioGroup.check(optionItemRadioButtonLayout.getRadioButton());
                }
            } else if (!arrayList.isEmpty()) {
                Integer num = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(num, "editedOption[0]");
                if (num.intValue() == optionItemRadioButtonLayout.getOptionItem().getId()) {
                    customRadioGroup.check(optionItemRadioButtonLayout.getRadioButton());
                }
            }
            if (i == CollectionsKt.getLastIndex(option.getItems())) {
                optionItemRadioButtonLayout.getLineDivider().setVisibility(4);
            }
            i = i2;
        }
        linearLayout3.addView(customRadioGroup);
        View rootView = getRootView();
        if (!(rootView == null || (linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_product)) == null)) {
            linearLayout.addView(linearLayout2);
        }
        ViewExtsKt.marginTop(linearLayout2, ViewExtsKt.DPtoPX(8.0f));
        customRadioGroup.setOnCheckedChangeListener(new ProductDetailDialogFragment$addViewRadioButtonOptions$2(this));
    }

    private final int calculateTotalPrice() {
        int price;
        Iterator<View> it = this.mOptionViews.iterator();
        int i = 0;
        int i2 = 0;
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof OptionItemCheckBoxLayout) {
                OptionItemCheckBoxLayout optionItemCheckBoxLayout = (OptionItemCheckBoxLayout) next;
                if (optionItemCheckBoxLayout.getCheckbox().isChecked()) {
                    price = optionItemCheckBoxLayout.getOptionItem().getPrice();
                }
            } else if (next instanceof OptionItemRadioButtonLayout) {
                OptionItemRadioButtonLayout optionItemRadioButtonLayout = (OptionItemRadioButtonLayout) next;
                if (optionItemRadioButtonLayout.getRadioButton().isChecked()) {
                    price = optionItemRadioButtonLayout.getOptionItem().getPrice();
                }
            }
            i2 += price;
        }
        Product product = this.mProduct;
        if (product != null) {
            i = product.getPrice();
        }
        return (i2 + i) * this.mQuantity;
    }

    private final Extra convertOptionToExtra(Item item) {
        return new Extra(Integer.valueOf(item.getId()), item.getName(), item.getCode(), Integer.valueOf(item.getPrice()), item.getPriceStr(), item.getGroupId());
    }

    private final ArrayList<Extra> convertSelectedOptionItemsToExtras() {
        ArrayList<Extra> arrayList = new ArrayList<>();
        Iterator<View> it = this.mOptionViews.iterator();
        while (it.hasNext()) {
            View next = it.next();
            if (next instanceof OptionItemCheckBoxLayout) {
                OptionItemCheckBoxLayout optionItemCheckBoxLayout = (OptionItemCheckBoxLayout) next;
                if (optionItemCheckBoxLayout.getCheckbox().isChecked()) {
                    arrayList.add(convertOptionToExtra(optionItemCheckBoxLayout.getOptionItem()));
                }
            } else if (next instanceof OptionItemRadioButtonLayout) {
                OptionItemRadioButtonLayout optionItemRadioButtonLayout = (OptionItemRadioButtonLayout) next;
                if (optionItemRadioButtonLayout.getRadioButton().isChecked()) {
                    arrayList.add(convertOptionToExtra(optionItemRadioButtonLayout.getOptionItem()));
                }
            }
        }
        return arrayList;
    }

    private final void createNoteOption() {
        LinearLayout linearLayout;
        String str;
        GeneralKt.log(this.mOrderLine.getNote());
        Context context = getContext();
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue(context, "context");
            NoteProductView noteProductView2 = new NoteProductView(context);
            this.noteProductView = noteProductView2;
            if (noteProductView2 != null) {
                ContextExtsKt.setOnSafeClickListener$default(noteProductView2, 0, new ProductDetailDialogFragment$createNoteOption$$inlined$let$lambda$1(this), 1, null);
            }
            NoteProductView noteProductView3 = this.noteProductView;
            if (noteProductView3 != null) {
                ProductConfiguration productConfiguration = this.mProductConfiguration;
                if (productConfiguration == null || (str = productConfiguration.getNotes()) == null) {
                    str = this.mOrderLine.getNote();
                }
                noteProductView3.updateData(str);
            }
            View rootView = getRootView();
            if (!(rootView == null || (linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_product)) == null)) {
                linearLayout.addView(this.noteProductView);
            }
            NoteProductView noteProductView4 = this.noteProductView;
            if (noteProductView4 != null) {
                ViewExtsKt.marginTop(noteProductView4, ViewExtsKt.DPtoPX(8.0f));
            }
        }
    }

    /* access modifiers changed from: private */
    public final void openProductNoteDialog() {
        String str;
        ProductConfiguration productConfiguration = this.mProductConfiguration;
        GeneralKt.log(productConfiguration != null ? productConfiguration.getNotes() : null);
        GeneralKt.log(this.mOrderLine.getNote());
        ProductNoteDialogFragment.Companion companion = ProductNoteDialogFragment.Companion;
        ProductConfiguration productConfiguration2 = this.mProductConfiguration;
        if (productConfiguration2 == null || (str = productConfiguration2.getNotes()) == null) {
            str = this.mOrderLine.getNote();
        }
        Product product = this.mProduct;
        ProductNoteDialogFragment newInstance = companion.newInstance(str, product != null ? product.getHints() : null, new ProductDetailDialogFragment$openProductNoteDialog$productNoteDialogFragment$1(this));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            newInstance.show(activity.getSupportFragmentManager(), (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void updateNote(String str) {
        NoteProductView noteProductView2 = this.noteProductView;
        if (noteProductView2 != null) {
            noteProductView2.updateData(str);
        }
    }

    private final void createViewCheckboxGroupWithDefaultIndex(Option option) {
        LinearLayout linearLayout;
        HashMap<Integer, ArrayList<Integer>> editedOption;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_option_product_header, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) inflate;
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.layout_selection);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "layoutSelection");
        LinearLayout linearLayout4 = linearLayout3;
        TextView textView = (TextView) linearLayout4.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutSelection.txt_option_name");
        textView.setText(option.getName());
        TextView textView2 = (TextView) linearLayout4.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutSelection.txt_option_desc");
        textView2.setText(option.getDescription());
        TLTextView tLTextView = (TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutSelection.txt_option_must_have");
        tLTextView.setText(getString(R.string.str_must_have));
        int i = 0;
        for (T t : option.getItems()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            t2.setGroupId(option.getGroupId());
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OptionItemCheckBoxLayout optionItemCheckBoxLayout = new OptionItemCheckBoxLayout(t2, requireContext);
            optionItemCheckBoxLayout.getCheckbox().setId(t2.getId());
            OptionItemCheckBoxLayout optionItemCheckBoxLayout2 = optionItemCheckBoxLayout;
            linearLayout3.addView(optionItemCheckBoxLayout2);
            ViewExtsKt.marginStart(optionItemCheckBoxLayout2, ViewExtsKt.DPtoPX(16.0f));
            ProductConfiguration productConfiguration = this.mProductConfiguration;
            ArrayList<Integer> arrayList = (productConfiguration == null || (editedOption = productConfiguration.getEditedOption()) == null) ? null : editedOption.get(option.getGroupId());
            if (arrayList == null) {
                if (i == option.getDefaultIndex()) {
                    optionItemCheckBoxLayout.getCheckbox().setChecked(true);
                }
            } else if (!arrayList.isEmpty()) {
                Integer num = arrayList.get(0);
                Intrinsics.checkNotNullExpressionValue(num, "editedOption[0]");
                if (num.intValue() == optionItemCheckBoxLayout.getOptionItem().getId()) {
                    optionItemCheckBoxLayout.getCheckbox().setChecked(true);
                }
            }
            this.mOptionViews.add(optionItemCheckBoxLayout);
            if (i == CollectionsKt.getLastIndex(option.getItems())) {
                optionItemCheckBoxLayout.getLineDivider().setVisibility(4);
            }
            i = i2;
        }
        View rootView = getRootView();
        if (!(rootView == null || (linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_product)) == null)) {
            linearLayout.addView(linearLayout2);
        }
        ViewExtsKt.marginTop(linearLayout2, ViewExtsKt.DPtoPX(8.0f));
    }

    private final void createViewCheckboxGroupWithoutDefaultIndex(Option option) {
        LinearLayout linearLayout;
        HashMap<Integer, ArrayList<Integer>> editedOption;
        int i = 0;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_option_product_header, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
        LinearLayout linearLayout2 = (LinearLayout) inflate;
        LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.layout_selection);
        Intrinsics.checkNotNullExpressionValue(linearLayout3, "layoutSelection");
        LinearLayout linearLayout4 = linearLayout3;
        TextView textView = (TextView) linearLayout4.findViewById(R.id.txt_option_name);
        Intrinsics.checkNotNullExpressionValue(textView, "layoutSelection.txt_option_name");
        textView.setText(option.getName());
        TextView textView2 = (TextView) linearLayout4.findViewById(R.id.txt_option_desc);
        Intrinsics.checkNotNullExpressionValue(textView2, "layoutSelection.txt_option_desc");
        textView2.setText(option.getDescription());
        TLTextView tLTextView = (TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutSelection.txt_option_must_have");
        tLTextView.setText(getString(R.string.str_optional));
        TLTextView tLTextView2 = (TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "layoutSelection.txt_option_must_have");
        tLTextView2.setBackground(ContextCompat.getDrawable(requireContext(), R.drawable.background_optional_option_item));
        ((TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have)).setTextColor(ContextCompat.getColor(requireContext(), R.color.color838387));
        for (T t : option.getItems()) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            t2.setGroupId(option.getGroupId());
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OptionItemCheckBoxLayout optionItemCheckBoxLayout = new OptionItemCheckBoxLayout(t2, requireContext);
            optionItemCheckBoxLayout.getCheckbox().setId(t2.getId());
            this.mOptionViews.add(optionItemCheckBoxLayout);
            OptionItemCheckBoxLayout optionItemCheckBoxLayout2 = optionItemCheckBoxLayout;
            linearLayout3.addView(optionItemCheckBoxLayout2);
            ViewExtsKt.marginStart(optionItemCheckBoxLayout2, ViewExtsKt.DPtoPX(16.0f));
            optionItemCheckBoxLayout.getCheckbox().setOnCheckedChangeListener(new ProductDetailDialogFragment$createViewCheckboxGroupWithoutDefaultIndex$$inlined$forEachIndexed$lambda$1(this, option, linearLayout3));
            ProductConfiguration productConfiguration = this.mProductConfiguration;
            ArrayList<Integer> arrayList = (productConfiguration == null || (editedOption = productConfiguration.getEditedOption()) == null) ? null : editedOption.get(option.getGroupId());
            GeneralKt.log("editedOption: " + arrayList);
            if (arrayList != null && (!arrayList.isEmpty())) {
                for (Number number : arrayList) {
                    int intValue = number.intValue();
                    GeneralKt.log("checkedId: " + intValue + " - " + optionItemCheckBoxLayout.getOptionItem().getId());
                    if (intValue == optionItemCheckBoxLayout.getOptionItem().getId()) {
                        optionItemCheckBoxLayout.getCheckbox().setChecked(true);
                    }
                }
            }
            if (i == CollectionsKt.getLastIndex(option.getItems())) {
                optionItemCheckBoxLayout.getLineDivider().setVisibility(4);
            }
            i = i2;
        }
        View rootView = getRootView();
        if (!(rootView == null || (linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_product)) == null)) {
            linearLayout.addView(linearLayout2);
        }
        ViewExtsKt.marginTop(linearLayout2, ViewExtsKt.DPtoPX(8.0f));
    }

    private final void createViewRadioGroupWithDefaultIndex(Option option) {
        if (hasMoreThanOneOptions(option)) {
            addViewRadioButtonOptions(option);
        } else if (hasOnlyOneOption(option)) {
            selectSingleOption(option);
        }
    }

    private final void createViewRadioGroupWithoutDefaultIndex(Option option) {
        LinearLayout linearLayout;
        HashMap<Integer, ArrayList<Integer>> editedOption;
        if (hasMoreThanOneOptions(option)) {
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_option_product_header, (ViewGroup) null, false);
            Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.LinearLayout");
            LinearLayout linearLayout2 = (LinearLayout) inflate;
            CustomRadioGroup customRadioGroup = new CustomRadioGroup(requireContext());
            LinearLayout linearLayout3 = (LinearLayout) linearLayout2.findViewById(R.id.layout_selection);
            Intrinsics.checkNotNullExpressionValue(linearLayout3, "layoutSelection");
            LinearLayout linearLayout4 = linearLayout3;
            TextView textView = (TextView) linearLayout4.findViewById(R.id.txt_option_name);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutSelection.txt_option_name");
            textView.setText(option.getName());
            TextView textView2 = (TextView) linearLayout4.findViewById(R.id.txt_option_desc);
            Intrinsics.checkNotNullExpressionValue(textView2, "layoutSelection.txt_option_desc");
            textView2.setText(option.getDescription());
            TLTextView tLTextView = (TLTextView) linearLayout4.findViewById(R.id.txt_option_must_have);
            Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutSelection.txt_option_must_have");
            tLTextView.setText(getString(R.string.str_optional));
            int i = 0;
            for (T t : option.getItems()) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                T t2 = t;
                t2.setGroupId(option.getGroupId());
                Context requireContext = requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                OptionItemRadioButtonLayout optionItemRadioButtonLayout = new OptionItemRadioButtonLayout(t2, requireContext);
                optionItemRadioButtonLayout.getRadioButton().setId(t2.getId());
                this.mOptionViews.add(optionItemRadioButtonLayout);
                OptionItemRadioButtonLayout optionItemRadioButtonLayout2 = optionItemRadioButtonLayout;
                customRadioGroup.addView(optionItemRadioButtonLayout2);
                ViewExtsKt.marginStart(optionItemRadioButtonLayout2, ViewExtsKt.DPtoPX(16.0f));
                ProductConfiguration productConfiguration = this.mProductConfiguration;
                ArrayList<Integer> arrayList = (productConfiguration == null || (editedOption = productConfiguration.getEditedOption()) == null) ? null : editedOption.get(option.getGroupId());
                if (arrayList != null && (!arrayList.isEmpty())) {
                    Integer num = arrayList.get(0);
                    Intrinsics.checkNotNullExpressionValue(num, "editedOption[0]");
                    if (num.intValue() == optionItemRadioButtonLayout.getOptionItem().getId()) {
                        customRadioGroup.check(optionItemRadioButtonLayout.getRadioButton());
                    }
                }
                if (i == CollectionsKt.getLastIndex(option.getItems())) {
                    optionItemRadioButtonLayout.getLineDivider().setVisibility(4);
                }
                i = i2;
            }
            View rootView = getRootView();
            if (!(rootView == null || (linearLayout = (LinearLayout) rootView.findViewById(R.id.layout_product)) == null)) {
                linearLayout.addView(customRadioGroup);
            }
            ViewExtsKt.marginTop(linearLayout2, ViewExtsKt.DPtoPX(8.0f));
            customRadioGroup.setOnCheckedChangeListener(new ProductDetailDialogFragment$createViewRadioGroupWithoutDefaultIndex$2(this));
        } else if (hasOnlyOneOption(option)) {
            selectSingleOption(option);
        }
    }

    private final void generateProductOptionsView() {
        ArrayList<Option> options;
        Product product = this.mProduct;
        if (!(product == null || (options = product.getOptions()) == null)) {
            Iterator<Option> it = options.iterator();
            while (it.hasNext()) {
                Option next = it.next();
                Intrinsics.checkNotNullExpressionValue(next, "option");
                if (optionIsMustHave(next) && optionIsSingleSelect(next)) {
                    createViewRadioGroupWithDefaultIndex(next);
                } else if (!optionIsMustHave(next) && optionIsSingleSelect(next)) {
                    createViewRadioGroupWithoutDefaultIndex(next);
                } else if (!optionIsMustHave(next) || optionIsSingleSelect(next)) {
                    createViewCheckboxGroupWithoutDefaultIndex(next);
                } else {
                    createViewCheckboxGroupWithDefaultIndex(next);
                }
            }
        }
        createNoteOption();
    }

    private final boolean hasMoreThanOneOptions(Option option) {
        return option.getItems().size() > 1;
    }

    private final boolean hasOnlyOneOption(Option option) {
        return option.getItems().size() == 1;
    }

    /* access modifiers changed from: private */
    public final void initOrderLine() {
        OrderLine orderLine = this.mOrderLine;
        Product product = this.mProduct;
        String str = null;
        orderLine.setId(product != null ? product.getId() : null);
        OrderLine orderLine2 = this.mOrderLine;
        Product product2 = this.mProduct;
        orderLine2.setName(product2 != null ? product2.getName() : null);
        this.mOrderLine.setQuantity(this.mQuantity);
        OrderLine orderLine3 = this.mOrderLine;
        Product product3 = this.mProduct;
        orderLine3.setPriceStr(product3 != null ? product3.getPriceStr() : null);
        this.mOrderLine.setExtra(convertSelectedOptionItemsToExtras());
        OrderLine orderLine4 = this.mOrderLine;
        Product product4 = this.mProduct;
        orderLine4.setPrice(product4 != null ? Integer.valueOf(product4.getPrice()) : null);
        OrderLine orderLine5 = this.mOrderLine;
        NoteProductView noteProductView2 = this.noteProductView;
        if (noteProductView2 != null) {
            str = noteProductView2.getNote();
        }
        orderLine5.setNote(str);
        collectTrackingData();
    }

    private final void collectTrackingData() {
        collectParamEventEditItemCart();
        collectParamRemoveItemCart();
    }

    private final void collectParamRemoveItemCart() {
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[2];
        Product product = this.mProduct;
        String str = null;
        trackingDataArr[0] = new TrackingData("categoryID", product != null ? product.getCategoryId() : null);
        Product product2 = this.mProduct;
        if (product2 != null) {
            str = product2.getId();
        }
        trackingDataArr[1] = new TrackingData("productID", str);
        companion.collectParamWithEventName(EditCartEvents.EventCartItemRemovedSuccessfully.name, trackingDataArr);
    }

    private final void collectParamEventEditItemCart() {
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[5];
        ProductConfiguration productConfiguration = this.mProductConfiguration;
        Integer num = null;
        Integer quantity = productConfiguration != null ? productConfiguration.getQuantity() : null;
        trackingDataArr[0] = new TrackingData("isQtyChanged", Boolean.valueOf(quantity == null || quantity.intValue() != this.mQuantity));
        ProductConfiguration productConfiguration2 = this.mProductConfiguration;
        trackingDataArr[1] = new TrackingData(EditCartEvents.EventCartItemEditedSuccessfully.Param.isNoteChanged, Boolean.valueOf(!Intrinsics.areEqual(productConfiguration2 != null ? productConfiguration2.getNotes() : null, this.mOrderLine.getNote())));
        Product product = this.mProduct;
        trackingDataArr[2] = new TrackingData("productID", product != null ? product.getId() : null);
        Product product2 = this.mProduct;
        if (product2 != null) {
            num = product2.getCategoryId();
        }
        trackingDataArr[3] = new TrackingData("categoryID", num);
        trackingDataArr[4] = new TrackingData(EditCartEvents.EventCartItemEditedSuccessfully.Param.isCustomizeChanged, Boolean.valueOf(isCustomized()));
        companion.collectParamWithEventName(EditCartEvents.EventCartItemEditedSuccessfully.name, trackingDataArr);
    }

    private final boolean isCustomized() {
        Set<Integer> keySet;
        ProductConfiguration productConfiguration = this.mProductConfiguration;
        HashMap<Integer, ArrayList<Integer>> editedOption = productConfiguration != null ? productConfiguration.getEditedOption() : null;
        boolean z = false;
        if (!(editedOption == null || (keySet = editedOption.keySet()) == null)) {
            for (T t : keySet) {
                ArrayList arrayList = new ArrayList();
                for (T t2 : this.mOrderLine.getExtra()) {
                    if (Intrinsics.areEqual(t2.getGroupId(), t)) {
                        arrayList.add(t2);
                    }
                }
                ArrayList<Extra> arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                for (Extra extra : arrayList2) {
                    arrayList3.add(extra.getId());
                }
                ArrayList arrayList4 = arrayList3;
                ArrayList<Integer> arrayList5 = editedOption.get(t);
                if (arrayList5 != null && !arrayList5.containsAll(arrayList4)) {
                    z = true;
                }
            }
        }
        return z;
    }

    private final void initProductInfo() {
        ArrayList<String> images;
        View rootView = getRootView();
        if (rootView != null) {
            TextView textView = (TextView) rootView.findViewById(R.id.txt_product_name);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_product_name");
            Product product = this.mProduct;
            String str = null;
            textView.setText(product != null ? product.getName() : null);
            TextView textView2 = (TextView) rootView.findViewById(R.id.txt_product_price);
            Intrinsics.checkNotNullExpressionValue(textView2, "txt_product_price");
            Product product2 = this.mProduct;
            textView2.setText(OrderExtsKt.formatVND(product2 != null ? Integer.valueOf(product2.getPrice()) : null));
            ((ExpandCollapseTextView) rootView.findViewById(R.id.txt_product_desc)).maxLineExpandCollapse(3);
            ExpandCollapseTextView expandCollapseTextView = (ExpandCollapseTextView) rootView.findViewById(R.id.txt_product_desc);
            Product product3 = this.mProduct;
            if (product3 != null) {
                str = product3.getDescription();
            }
            expandCollapseTextView.setFullText(str);
            PlaceHolderView placeHolderView = (PlaceHolderView) rootView.findViewById(R.id.phv_images);
            Intrinsics.checkNotNullExpressionValue(placeHolderView, "phv_images");
            boolean z = false;
            placeHolderView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
            ViewCompat.setNestedScrollingEnabled((PlaceHolderView) rootView.findViewById(R.id.phv_images), false);
            Product product4 = this.mProduct;
            if (!(product4 == null || (images = product4.getImages()) == null || !(!images.isEmpty()))) {
                if (images.size() == 1) {
                    ((PlaceHolderView) rootView.findViewById(R.id.phv_images)).addView(new ItemRowImageProductFullWidth(CollectionsKt.first((List) images)));
                } else {
                    Iterator<String> it = images.iterator();
                    while (it.hasNext()) {
                        String next = it.next();
                        Intrinsics.checkNotNullExpressionValue(next, "imageUrl");
                        ((PlaceHolderView) rootView.findViewById(R.id.phv_images)).addView(new ItemRowImageProduct(next));
                    }
                }
            }
            ToggleButton toggleButton = (ToggleButton) rootView.findViewById(R.id.toggle_favourite);
            Intrinsics.checkNotNullExpressionValue(toggleButton, "toggle_favourite");
            Product product5 = this.mProduct;
            if (product5 != null) {
                z = product5.isFavourite();
            }
            toggleButton.setChecked(z);
        }
    }

    private final void initQuantityView() {
        LayoutFooterProductDetail layoutFooterProductDetail;
        LayoutFooterProductDetail layoutFooterProductDetail2;
        LayoutFooterProductDetail layoutFooterProductDetail3;
        ProductConfiguration productConfiguration = this.mProductConfiguration;
        Integer num = null;
        if ((productConfiguration != null ? productConfiguration.getQuantity() : null) != null) {
            ProductConfiguration productConfiguration2 = this.mProductConfiguration;
            if (productConfiguration2 != null) {
                num = productConfiguration2.getQuantity();
            }
            Intrinsics.checkNotNull(num);
            this.mQuantity = num.intValue();
            View rootView = getRootView();
            if (!(rootView == null || (layoutFooterProductDetail3 = (LayoutFooterProductDetail) rootView.findViewById(R.id.layout_total_price)) == null)) {
                layoutFooterProductDetail3.updateQuantity(this.mQuantity);
            }
        }
        View rootView2 = getRootView();
        if (!(rootView2 == null || (layoutFooterProductDetail2 = (LayoutFooterProductDetail) rootView2.findViewById(R.id.layout_total_price)) == null)) {
            layoutFooterProductDetail2.setOnClickDecreaseListener(new ProductDetailDialogFragment$initQuantityView$1(this));
        }
        View rootView3 = getRootView();
        if (rootView3 != null && (layoutFooterProductDetail = (LayoutFooterProductDetail) rootView3.findViewById(R.id.layout_total_price)) != null) {
            layoutFooterProductDetail.setOnClickIncreaseListener(new ProductDetailDialogFragment$initQuantityView$2(this));
        }
    }

    private final boolean optionIsMustHave(Option option) {
        return option.getMin() >= 1;
    }

    private final boolean optionIsSingleSelect(Option option) {
        return option.getMax() == option.getMin() && option.getMax() == 1;
    }

    private final void selectSingleOption(Option option) {
        Item item = option.getItems().get(0);
        Intrinsics.checkNotNullExpressionValue(item, "option.items[0]");
        Item item2 = item;
        item2.setGroupId(option.getGroupId());
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        OptionItemRadioButtonLayout optionItemRadioButtonLayout = new OptionItemRadioButtonLayout(item2, requireContext);
        optionItemRadioButtonLayout.getRadioButton().setChecked(true);
        optionItemRadioButtonLayout.getRadioButton().setId(item2.getId());
        this.mOptionViews.add(optionItemRadioButtonLayout);
    }

    /* access modifiers changed from: private */
    public final void totalPriceChange() {
        LayoutFooterProductDetail layoutFooterProductDetail;
        int calculateTotalPrice = calculateTotalPrice();
        View rootView = getRootView();
        if (rootView != null && (layoutFooterProductDetail = (LayoutFooterProductDetail) rootView.findViewById(R.id.layout_total_price)) != null) {
            layoutFooterProductDetail.updateTotalPrice(calculateTotalPrice);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void collectDataTracking() {
        super.collectDataTracking();
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewItemDetail.name, "Category");
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[2];
        Product product = this.mProduct;
        Integer num = null;
        trackingDataArr[0] = new TrackingData("productID", product != null ? product.getId() : null);
        Product product2 = this.mProduct;
        if (product2 != null) {
            num = product2.getCategoryId();
        }
        trackingDataArr[1] = new TrackingData("categoryID", num);
        companion.collectParamWithEventName(OrderEvents.EventViewItemDetail.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewItemDetail.name);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B]\u0012>\b\u0002\u0010\u0002\u001a8\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0007\u0018\u0001`\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u000bJ?\u0010\u0019\u001a8\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0007\u0018\u0001`\u0006HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0002\u0010\u0015Jf\u0010\u001c\u001a\u00020\u00002>\b\u0002\u0010\u0002\u001a8\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0007\u0018\u0001`\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\u0004HÖ\u0001J\t\u0010\"\u001a\u00020\tHÖ\u0001RP\u0010\u0002\u001a8\u0012\u0004\u0012\u00020\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0005\u0018\u00010\u0003j \u0012\u0004\u0012\u00020\u0004\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00040\u0005j\b\u0012\u0004\u0012\u00020\u0004`\u0007\u0018\u0001`\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001e\u0010\n\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0010\n\u0002\u0010\u0018\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;", "", "editedOption", "Ljava/util/HashMap;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/HashMap;", "Lkotlin/collections/ArrayList;", "notes", "", FirebaseAnalytics.Param.QUANTITY, "(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;)V", "getEditedOption", "()Ljava/util/HashMap;", "setEditedOption", "(Ljava/util/HashMap;)V", "getNotes", "()Ljava/lang/String;", "setNotes", "(Ljava/lang/String;)V", "getQuantity", "()Ljava/lang/Integer;", "setQuantity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/util/HashMap;Ljava/lang/String;Ljava/lang/Integer;)Lcom/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$ProductConfiguration;", "equals", "", "other", "hashCode", "toString", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ProductDetailDialogFragment.kt */
    public static final class ProductConfiguration {
        private HashMap<Integer, ArrayList<Integer>> editedOption;
        private String notes;
        private Integer quantity;

        public ProductConfiguration() {
            this(null, null, null, 7, null);
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.order.menudetail.ProductDetailDialogFragment$ProductConfiguration */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ ProductConfiguration copy$default(ProductConfiguration productConfiguration, HashMap hashMap, String str, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                hashMap = productConfiguration.editedOption;
            }
            if ((i & 2) != 0) {
                str = productConfiguration.notes;
            }
            if ((i & 4) != 0) {
                num = productConfiguration.quantity;
            }
            return productConfiguration.copy(hashMap, str, num);
        }

        public final HashMap<Integer, ArrayList<Integer>> component1() {
            return this.editedOption;
        }

        public final String component2() {
            return this.notes;
        }

        public final Integer component3() {
            return this.quantity;
        }

        public final ProductConfiguration copy(HashMap<Integer, ArrayList<Integer>> hashMap, String str, Integer num) {
            return new ProductConfiguration(hashMap, str, num);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ProductConfiguration)) {
                return false;
            }
            ProductConfiguration productConfiguration = (ProductConfiguration) obj;
            return Intrinsics.areEqual(this.editedOption, productConfiguration.editedOption) && Intrinsics.areEqual(this.notes, productConfiguration.notes) && Intrinsics.areEqual(this.quantity, productConfiguration.quantity);
        }

        public int hashCode() {
            HashMap<Integer, ArrayList<Integer>> hashMap = this.editedOption;
            int i = 0;
            int hashCode = (hashMap != null ? hashMap.hashCode() : 0) * 31;
            String str = this.notes;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.quantity;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            return "ProductConfiguration(editedOption=" + this.editedOption + ", notes=" + this.notes + ", quantity=" + this.quantity + ")";
        }

        public ProductConfiguration(HashMap<Integer, ArrayList<Integer>> hashMap, String str, Integer num) {
            this.editedOption = hashMap;
            this.notes = str;
            this.quantity = num;
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ ProductConfiguration(HashMap hashMap, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : hashMap, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : num);
        }

        public final HashMap<Integer, ArrayList<Integer>> getEditedOption() {
            return this.editedOption;
        }

        public final void setEditedOption(HashMap<Integer, ArrayList<Integer>> hashMap) {
            this.editedOption = hashMap;
        }

        public final String getNotes() {
            return this.notes;
        }

        public final void setNotes(String str) {
            this.notes = str;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final void setQuantity(Integer num) {
            this.quantity = num;
        }
    }
}
