package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.content.Context;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.daimajia.swipe.SwipeLayout;
import com.daimajia.swipe.adapters.RecyclerSwipeAdapter;
import com.daimajia.swipe.implments.SwipeItemRecyclerMangerImpl;
import com.daimajia.swipe.util.Attributes;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.HeaderItemDecoration;
import com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.CornerConstraintLayout;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.TypeCastException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class ProductRecyclerViewAdapter extends RecyclerSwipeAdapter<RecyclerView.ViewHolder> {
    private final int HEADER_TYPE = 2;
    private final int HORIZONTAL_RECYCLEVIEW_TYPE = 4;
    private final int PRODUCT_TYPE = 3;
    private final int SEARCH_TYPE = 1;
    private TableInfo currentAtTableInfo;
    private AddressSuggestion currentDeliveryInfo;
    private Store currentPickupInfo;
    private final ProductRecyclerViewAdapter$itemTouchListener$1 itemTouchListener;
    private final ArrayList<Object> mProducts;
    private RecyclerView mRecyclerView;
    private final Function0<Unit> onChangeShippingMethodToDeli;
    private final Function0<Unit> onChangeShippingMethodToPickUp;
    private final Function1<Product, Unit> onClickFavouriteListener;
    private final Function0<Unit> onClickFavouriteProductsListener;
    private final Function0<Unit> onClickFilterListener;
    private final Function0<Unit> onClickSearchListener;
    private final Function1<Product, Unit> onItemClickListener;
    private final ProductRecyclerViewAdapter$onScrollListener$1 onScrollListener;
    private final Function0<Unit> onShowPickLocationDialog;
    private final Function0<Unit> onShowPickStoreDialog;
    private String selectedMethod = ShippingType.INSTANCE.getDELI();
    private HeaderItemDecoration stickyHeader;

    @Override // com.daimajia.swipe.interfaces.SwipeAdapterInterface
    public int getSwipeLayoutResourceId(int i) {
        return R.id.swipe;
    }

    public static final /* synthetic */ HeaderItemDecoration access$getStickyHeader$p(ProductRecyclerViewAdapter productRecyclerViewAdapter) {
        HeaderItemDecoration headerItemDecoration = productRecyclerViewAdapter.stickyHeader;
        if (headerItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickyHeader");
        }
        return headerItemDecoration;
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.Product, kotlin.Unit> */
    /* JADX DEBUG: Multi-variable search result rejected for r4v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.Product, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public ProductRecyclerViewAdapter(ArrayList<Object> arrayList, Function1<? super Product, Unit> function1, Function1<? super Product, Unit> function12, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07) {
        Intrinsics.checkNotNullParameter(arrayList, "mProducts");
        Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
        Intrinsics.checkNotNullParameter(function12, "onClickFavouriteListener");
        Intrinsics.checkNotNullParameter(function0, "onChangeShippingMethodToPickUp");
        Intrinsics.checkNotNullParameter(function02, "onChangeShippingMethodToDeli");
        Intrinsics.checkNotNullParameter(function03, "onShowPickLocationDialog");
        Intrinsics.checkNotNullParameter(function04, "onShowPickStoreDialog");
        Intrinsics.checkNotNullParameter(function05, "onClickFilterListener");
        Intrinsics.checkNotNullParameter(function06, "onClickSearchListener");
        Intrinsics.checkNotNullParameter(function07, "onClickFavouriteProductsListener");
        this.mProducts = arrayList;
        this.onItemClickListener = function1;
        this.onClickFavouriteListener = function12;
        this.onChangeShippingMethodToPickUp = function0;
        this.onChangeShippingMethodToDeli = function02;
        this.onShowPickLocationDialog = function03;
        this.onShowPickStoreDialog = function04;
        this.onClickFilterListener = function05;
        this.onClickSearchListener = function06;
        this.onClickFavouriteProductsListener = function07;
        SwipeItemRecyclerMangerImpl swipeItemRecyclerMangerImpl = this.mItemManger;
        Intrinsics.checkNotNullExpressionValue(swipeItemRecyclerMangerImpl, "mItemManger");
        swipeItemRecyclerMangerImpl.setMode(Attributes.Mode.Single);
        this.onScrollListener = new ProductRecyclerViewAdapter$onScrollListener$1(this);
        this.itemTouchListener = new ProductRecyclerViewAdapter$itemTouchListener$1(this);
    }

    public final AddressSuggestion getCurrentDeliveryInfo() {
        return this.currentDeliveryInfo;
    }

    public final Store getCurrentPickupInfo() {
        return this.currentPickupInfo;
    }

    public final TableInfo getCurrentAtTableInfo() {
        return this.currentAtTableInfo;
    }

    public final String getSelectedMethod() {
        return this.selectedMethod;
    }

    public static /* synthetic */ void setTableInfo$default(ProductRecyclerViewAdapter productRecyclerViewAdapter, TableInfo tableInfo, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        productRecyclerViewAdapter.setTableInfo(tableInfo, z);
    }

    public final void setTableInfo(TableInfo tableInfo, boolean z) {
        this.currentAtTableInfo = tableInfo;
        if (z) {
            setSelectedShippingMethod(ShippingType.INSTANCE.getTABLE());
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i) {
        Object obj = this.mProducts.get(i);
        Intrinsics.checkNotNullExpressionValue(obj, "mProducts[position]");
        if (i == 0) {
            return this.SEARCH_TYPE;
        }
        if (obj instanceof String) {
            return this.HEADER_TYPE;
        }
        if (obj instanceof Menu) {
            return this.HORIZONTAL_RECYCLEVIEW_TYPE;
        }
        return this.PRODUCT_TYPE;
    }

    public static /* synthetic */ void setDeliveryInfo$default(ProductRecyclerViewAdapter productRecyclerViewAdapter, AddressSuggestion addressSuggestion, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        productRecyclerViewAdapter.setDeliveryInfo(addressSuggestion, z);
    }

    public final void setDeliveryInfo(AddressSuggestion addressSuggestion, boolean z) {
        this.currentDeliveryInfo = addressSuggestion;
        if (z) {
            setSelectedShippingMethod(ShippingType.INSTANCE.getDELI());
        }
    }

    public static /* synthetic */ void setPickUpInfo$default(ProductRecyclerViewAdapter productRecyclerViewAdapter, Store store, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        productRecyclerViewAdapter.setPickUpInfo(store, z);
    }

    public final void setPickUpInfo(Store store, boolean z) {
        this.currentPickupInfo = store;
        if (z) {
            setSelectedShippingMethod(ShippingType.INSTANCE.getPICKUP());
        }
    }

    public final void setSelectedShippingMethod(String str) {
        Intrinsics.checkNotNullParameter(str, "shippingMethod");
        this.selectedMethod = str;
        notifyItemChanged(0);
    }

    public static final class ShippingMethodViewHolder extends RecyclerView.ViewHolder {
        private View layoutShippingMethod;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShippingMethodViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.layoutShippingMethod = view;
        }

        public final void bind(String str, AddressSuggestion addressSuggestion, Store store, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04) {
            Intrinsics.checkNotNullParameter(str, "shippingMethod");
            Intrinsics.checkNotNullParameter(function0, "onChangeShippingMethodToPickUp");
            Intrinsics.checkNotNullParameter(function02, "onChangeShippingMethodToDelivery");
            Intrinsics.checkNotNullParameter(function03, "showPickLocationDialog");
            Intrinsics.checkNotNullParameter(function04, "showPickUpStoreDialog");
            updateViews(str, addressSuggestion, store);
            TextView textView = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_pickup_method);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutShippingMethod.txt_pickup_method");
            ContextExtsKt.setOnSafeClickListener$default(textView, 0, new ProductRecyclerViewAdapter$ShippingMethodViewHolder$bind$1(function0), 1, null);
            TextView textView2 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_delivery_method);
            Intrinsics.checkNotNullExpressionValue(textView2, "layoutShippingMethod.txt_delivery_method");
            ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new ProductRecyclerViewAdapter$ShippingMethodViewHolder$bind$2(function02), 1, null);
            TextView textView3 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_change_destination);
            Intrinsics.checkNotNullExpressionValue(textView3, "layoutShippingMethod.txt_change_destination");
            ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new ProductRecyclerViewAdapter$ShippingMethodViewHolder$bind$3(str, function03, function04), 1, null);
        }

        private final void setSelectedDeliveryText() {
            ImageView imageView = (ImageView) this.layoutShippingMethod.findViewById(R.id.img_indicator_deli);
            Intrinsics.checkNotNullExpressionValue(imageView, "layoutShippingMethod.img_indicator_deli");
            imageView.setVisibility(0);
            ImageView imageView2 = (ImageView) this.layoutShippingMethod.findViewById(R.id.img_indicator_pickup);
            Intrinsics.checkNotNullExpressionValue(imageView2, "layoutShippingMethod.img_indicator_pickup");
            imageView2.setVisibility(4);
            TextView textView = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_delivery_method);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutShippingMethod.txt_delivery_method");
            textView.setAlpha(1.0f);
            TextView textView2 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_pickup_method);
            Intrinsics.checkNotNullExpressionValue(textView2, "layoutShippingMethod.txt_pickup_method");
            textView2.setAlpha(0.6f);
        }

        private final void setSelectedPickUpText() {
            ImageView imageView = (ImageView) this.layoutShippingMethod.findViewById(R.id.img_indicator_deli);
            Intrinsics.checkNotNullExpressionValue(imageView, "layoutShippingMethod.img_indicator_deli");
            imageView.setVisibility(4);
            ImageView imageView2 = (ImageView) this.layoutShippingMethod.findViewById(R.id.img_indicator_pickup);
            Intrinsics.checkNotNullExpressionValue(imageView2, "layoutShippingMethod.img_indicator_pickup");
            imageView2.setVisibility(0);
            TextView textView = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_delivery_method);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutShippingMethod.txt_delivery_method");
            textView.setAlpha(0.6f);
            TextView textView2 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_pickup_method);
            Intrinsics.checkNotNullExpressionValue(textView2, "layoutShippingMethod.txt_pickup_method");
            textView2.setAlpha(1.0f);
        }

        private final void updateViews(String str, AddressSuggestion addressSuggestion, Store store) {
            if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
                setPickUpMethod(store);
            } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
                setDeliveryMethod(addressSuggestion);
            } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getTABLE())) {
                GeneralKt.log("INSTORE_METHOD");
            }
        }

        private final void setDeliveryMethod(AddressSuggestion addressSuggestion) {
            if (addressSuggestion != null) {
                setSelectedDeliveryText();
                Context context = this.layoutShippingMethod.getContext();
                this.layoutShippingMethod.setVisibility(0);
                TextView textView = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_shipping_title);
                Intrinsics.checkNotNullExpressionValue(textView, "layoutShippingMethod.txt_shipping_title");
                textView.setVisibility(0);
                TextView textView2 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_change_destination);
                Intrinsics.checkNotNullExpressionValue(textView2, "layoutShippingMethod.txt_change_destination");
                textView2.setVisibility(0);
                TextView textView3 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_shipping_title);
                Intrinsics.checkNotNullExpressionValue(textView3, "layoutShippingMethod.txt_shipping_title");
                String str = context.getString(R.string.str_to_address) + "\n";
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                TLTextViewKt.setTextMultipleFonts(textView3, new TextViewAttribute(upperCase, Integer.valueOf((int) R.dimen._10sp), Integer.valueOf((int) R.color.colorWhiteDim), Integer.valueOf((int) R.font.sfpd_bold)), new TextViewAttribute(addressSuggestion.getStreet(), Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorWhite), Integer.valueOf((int) R.font.sfpd_regular)));
            }
        }

        private final void setPickUpMethod(Store store) {
            if (store != null) {
                setSelectedPickUpText();
                Context context = this.layoutShippingMethod.getContext();
                TextView textView = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_shipping_title);
                Intrinsics.checkNotNullExpressionValue(textView, "layoutShippingMethod.txt_shipping_title");
                textView.setVisibility(0);
                TextView textView2 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_change_destination);
                Intrinsics.checkNotNullExpressionValue(textView2, "layoutShippingMethod.txt_change_destination");
                textView2.setVisibility(0);
                TextView textView3 = (TextView) this.layoutShippingMethod.findViewById(R.id.txt_shipping_title);
                Intrinsics.checkNotNullExpressionValue(textView3, "layoutShippingMethod.txt_shipping_title");
                TextViewAttribute[] textViewAttributeArr = new TextViewAttribute[2];
                String str = context.getString(R.string.str_at_the_coffeehouse) + "\n";
                Locale locale = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String upperCase = str.toUpperCase(locale);
                Intrinsics.checkNotNullExpressionValue(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                textViewAttributeArr[0] = new TextViewAttribute(upperCase, Integer.valueOf((int) R.dimen._10sp), Integer.valueOf((int) R.color.colorWhiteDim), Integer.valueOf((int) R.font.sfpd_bold));
                String name = store.getName();
                if (name == null) {
                    name = store.getFullAddress();
                }
                textViewAttributeArr[1] = new TextViewAttribute(name, Integer.valueOf((int) R.dimen._16sp), Integer.valueOf((int) R.color.colorWhite), Integer.valueOf((int) R.font.sfpd_regular));
                TLTextViewKt.setTextMultipleFonts(textView3, textViewAttributeArr);
                Object[] objArr = new Object[1];
                String name2 = store.getName();
                if (name2 == null) {
                    name2 = store.getFullAddress();
                }
                objArr[0] = name2;
                context.getString(R.string.str_pick_up_name_store, objArr);
            }
        }
    }

    public static final class SearchViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final ImageView imgFavouriteProduct;
        private final ImageView imgSearchProduct;
        private final ConstraintLayout layoutFilterCategory;
        private final TextView txtCategory;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SearchViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.txtCategory = (TextView) view.findViewById(R.id.txt_product_category_name);
            this.layoutFilterCategory = (ConstraintLayout) view.findViewById(R.id.layout_filter_category);
            this.imgSearchProduct = (ImageView) view.findViewById(R.id.img_search_product);
            this.imgFavouriteProduct = (ImageView) view.findViewById(R.id.img_favourite_product);
        }

        public final TextView getTxtCategory() {
            return this.txtCategory;
        }

        public final ConstraintLayout getLayoutFilterCategory() {
            return this.layoutFilterCategory;
        }

        public final ImageView getImgSearchProduct() {
            return this.imgSearchProduct;
        }

        public final ImageView getImgFavouriteProduct() {
            return this.imgFavouriteProduct;
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final SearchViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_product_category, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new SearchViewHolder(inflate);
            }
        }

        public final void bind(Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            Intrinsics.checkNotNullParameter(function0, "onClickFilterListener");
            Intrinsics.checkNotNullParameter(function02, "onClickSearchListener");
            Intrinsics.checkNotNullParameter(function03, "onClickFavouriteProductsListener");
            ConstraintLayout constraintLayout = this.layoutFilterCategory;
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "layoutFilterCategory");
            ContextExtsKt.setOnSafeClickListener$default(constraintLayout, 0, new ProductRecyclerViewAdapter$SearchViewHolder$bind$1(function0), 1, null);
            ImageView imageView = this.imgSearchProduct;
            Intrinsics.checkNotNullExpressionValue(imageView, "imgSearchProduct");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ProductRecyclerViewAdapter$SearchViewHolder$bind$2(function02), 1, null);
            ImageView imageView2 = this.imgFavouriteProduct;
            Intrinsics.checkNotNullExpressionValue(imageView2, "imgFavouriteProduct");
            ContextExtsKt.setOnSafeClickListener$default(imageView2, 0, new ProductRecyclerViewAdapter$SearchViewHolder$bind$3(function03), 1, null);
        }
    }

    public static final class HeaderViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private TextView txtCategory;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HeaderViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.txt_category_name);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.txt_category_name)");
            this.txtCategory = (TextView) findViewById;
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final HeaderViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.layout_category_name, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new HeaderViewHolder(inflate);
            }
        }

        public final void bind(String str) {
            Intrinsics.checkNotNullParameter(str, "categoryName");
            this.txtCategory.setText(str);
        }
    }

    public static final class ProductViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final CornerConstraintLayout btnFavourite;
        private final ImageView imgIconAction;
        private final ImageView mImgProduct;
        private final ConstraintLayout mLayoutRootProduct;
        private final TextView mTxtDescProduct;
        private final TextView mTxtNameProduct;
        private final TextView mTxtPriceProduct;
        private final SwipeLayout swipeLayout;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProductViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            View findViewById = view.findViewById(R.id.img_product);
            Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.img_product)");
            this.mImgProduct = (ImageView) findViewById;
            View findViewById2 = view.findViewById(R.id.txt_name_product);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.txt_name_product)");
            this.mTxtNameProduct = (TextView) findViewById2;
            View findViewById3 = view.findViewById(R.id.txt_desc_product);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.txt_desc_product)");
            this.mTxtDescProduct = (TextView) findViewById3;
            View findViewById4 = view.findViewById(R.id.txt_price_product);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "itemView.findViewById(R.id.txt_price_product)");
            this.mTxtPriceProduct = (TextView) findViewById4;
            View findViewById5 = view.findViewById(R.id.layout_root_product);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "itemView.findViewById(R.id.layout_root_product)");
            this.mLayoutRootProduct = (ConstraintLayout) findViewById5;
            View findViewById6 = view.findViewById(R.id.swipe);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "itemView.findViewById(R.id.swipe)");
            this.swipeLayout = (SwipeLayout) findViewById6;
            View findViewById7 = view.findViewById(R.id.btn_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "itemView.findViewById(R.id.btn_favourite)");
            this.btnFavourite = (CornerConstraintLayout) findViewById7;
            View findViewById8 = view.findViewById(R.id.imgIconAction);
            Intrinsics.checkNotNullExpressionValue(findViewById8, "itemView.findViewById(R.id.imgIconAction)");
            this.imgIconAction = (ImageView) findViewById8;
        }

        public final SwipeLayout getSwipeLayout() {
            return this.swipeLayout;
        }

        public final CornerConstraintLayout getBtnFavourite() {
            return this.btnFavourite;
        }

        public final ImageView getImgIconAction() {
            return this.imgIconAction;
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ProductViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_menu_product, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new ProductViewHolder(inflate);
            }
        }

        public final void bind(Product product, Function1<? super Product, Unit> function1) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
            if (!product.getImages().isEmpty()) {
                Glide.with(this.mImgProduct.getContext()).load(product.getImages().get(0)).into(this.mImgProduct);
            } else {
                Glide.with(this.mImgProduct.getContext()).load(Integer.valueOf((int) R.drawable.ic_placeholder_store)).into(this.mImgProduct);
            }
            this.mTxtNameProduct.setText(product.getName());
            this.mTxtDescProduct.setText(product.getDescription());
            this.mTxtPriceProduct.setText(Html.fromHtml(product.getPriceStr(), 0));
            ContextExtsKt.setOnSafeClickListener$default(this.mLayoutRootProduct, 0, new ProductRecyclerViewAdapter$ProductViewHolder$bind$1(function1, product), 1, null);
        }
    }

    public static final class HorizontalRecycleViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final RecyclerView rcvProducts;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public HorizontalRecycleViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_your_recent_products);
            this.rcvProducts = recyclerView;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rcvProducts");
            recyclerView.setLayoutManager(new LinearLayoutManager(view.getContext(), 0, false));
        }

        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final HorizontalRecycleViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_horizontal_recycleview_product, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new HorizontalRecycleViewHolder(inflate);
            }
        }

        public final void bind(Menu menu, Function1<? super Product, Unit> function1) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
            RecyclerView recyclerView = this.rcvProducts;
            Intrinsics.checkNotNullExpressionValue(recyclerView, "rcvProducts");
            recyclerView.setAdapter(new HorizontalAdapter(menu, function1));
        }

        public static final class HorizontalAdapter extends RecyclerView.Adapter<HorizontalProductViewHolder> {
            private final Menu menu;
            private final Function1<Product, Unit> onItemClickListener;

            /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.Product, kotlin.Unit> */
            /* JADX WARN: Multi-variable type inference failed */
            public HorizontalAdapter(Menu menu2, Function1<? super Product, Unit> function1) {
                Intrinsics.checkNotNullParameter(menu2, "menu");
                Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
                this.menu = menu2;
                this.onItemClickListener = function1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public HorizontalProductViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item_horizontal_product, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
                if (layoutParams != null) {
                    layoutParams.width = viewGroup.getMeasuredWidth() / 3;
                    inflate.setLayoutParams(layoutParams);
                    return new HorizontalProductViewHolder(inflate);
                }
                throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }

            public void onBindViewHolder(HorizontalProductViewHolder horizontalProductViewHolder, int i) {
                Intrinsics.checkNotNullParameter(horizontalProductViewHolder, "holder");
                Product product = this.menu.getProducts().get(i);
                Intrinsics.checkNotNullExpressionValue(product, "menu.products[position]");
                horizontalProductViewHolder.bind(product, this.onItemClickListener);
            }

            @Override // androidx.recyclerview.widget.RecyclerView.Adapter
            public int getItemCount() {
                return this.menu.getProducts().size();
            }
        }

        public static final class HorizontalProductViewHolder extends RecyclerView.ViewHolder {
            private final ImageView mImgProduct;
            private final TextView mTxtNameProduct;
            private final TextView mTxtPriceProduct;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public HorizontalProductViewHolder(View view) {
                super(view);
                Intrinsics.checkNotNullParameter(view, "itemView");
                View findViewById = view.findViewById(R.id.img_product);
                Intrinsics.checkNotNullExpressionValue(findViewById, "itemView.findViewById(R.id.img_product)");
                this.mImgProduct = (ImageView) findViewById;
                View findViewById2 = view.findViewById(R.id.txt_product_name);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "itemView.findViewById(R.id.txt_product_name)");
                this.mTxtNameProduct = (TextView) findViewById2;
                View findViewById3 = view.findViewById(R.id.txt_price_product);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "itemView.findViewById(R.id.txt_price_product)");
                this.mTxtPriceProduct = (TextView) findViewById3;
            }

            public final void bind(Product product, Function1<? super Product, Unit> function1) {
                Intrinsics.checkNotNullParameter(product, "product");
                Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
                if (!product.getImages().isEmpty()) {
                    Glide.with(this.mImgProduct.getContext()).load(product.getImages().get(0)).into(this.mImgProduct);
                } else {
                    Glide.with(this.mImgProduct.getContext()).load(Integer.valueOf((int) R.drawable.ic_placeholder_store)).into(this.mImgProduct);
                }
                this.mTxtNameProduct.setText(product.getName());
                this.mTxtPriceProduct.setText(Html.fromHtml(product.getPriceStr(), 0));
                View view = this.itemView;
                Intrinsics.checkNotNullExpressionValue(view, "itemView");
                ContextExtsKt.setOnSafeClickListener$default(view, 0, new ProductRecyclerViewAdapter$HorizontalRecycleViewHolder$HorizontalProductViewHolder$bind$1(function1, product), 1, null);
            }
        }
    }

    @Override // com.daimajia.swipe.adapters.RecyclerSwipeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        if (i == this.SEARCH_TYPE) {
            return SearchViewHolder.Companion.from(viewGroup);
        }
        if (i == this.HEADER_TYPE) {
            return HeaderViewHolder.Companion.from(viewGroup);
        }
        if (i == this.HORIZONTAL_RECYCLEVIEW_TYPE) {
            return HorizontalRecycleViewHolder.Companion.from(viewGroup);
        }
        return ProductViewHolder.Companion.from(viewGroup);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mProducts.size();
    }

    @Override // com.daimajia.swipe.adapters.RecyclerSwipeAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "p0");
        if (viewHolder instanceof ShippingMethodViewHolder) {
            ((ShippingMethodViewHolder) viewHolder).bind(this.selectedMethod, this.currentDeliveryInfo, this.currentPickupInfo, this.onChangeShippingMethodToPickUp, this.onChangeShippingMethodToDeli, this.onShowPickLocationDialog, this.onShowPickStoreDialog);
        } else if (viewHolder instanceof SearchViewHolder) {
            View view = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "p0.itemView");
            if (!ViewCompat.isLaidOut(view) || view.isLayoutRequested()) {
                view.addOnLayoutChangeListener(new ProductRecyclerViewAdapter$onBindViewHolder$$inlined$doOnLayout$1(this, viewHolder));
                return;
            }
            RecyclerView recyclerView = this.mRecyclerView;
            RecyclerView.LayoutManager layoutManager = recyclerView != null ? recyclerView.getLayoutManager() : null;
            Objects.requireNonNull(layoutManager, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.screens.order.menudetail.views.ProductLayoutManager");
            View view2 = viewHolder.itemView;
            Intrinsics.checkNotNullExpressionValue(view2, "p0.itemView");
            ((ProductLayoutManager) layoutManager).setOffSetSmoothScroll(view2.getHeight());
        } else if (viewHolder instanceof HeaderViewHolder) {
            Object obj = this.mProducts.get(i);
            Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
            ((HeaderViewHolder) viewHolder).bind((String) obj);
        } else if (viewHolder instanceof HorizontalRecycleViewHolder) {
            Object obj2 = this.mProducts.get(i);
            Objects.requireNonNull(obj2, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.orders.Menu");
            ((HorizontalRecycleViewHolder) viewHolder).bind((Menu) obj2, this.onItemClickListener);
        } else {
            Object obj3 = this.mProducts.get(i);
            Objects.requireNonNull(obj3, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.orders.Product");
            Product product = (Product) obj3;
            ProductViewHolder productViewHolder = (ProductViewHolder) viewHolder;
            productViewHolder.bind(product, this.onItemClickListener);
            this.mItemManger.bindView(viewHolder.itemView, i);
            productViewHolder.getSwipeLayout().addSwipeListener(new ProductRecyclerViewAdapter$onBindViewHolder$2(this));
            ContextExtsKt.setOnSafeClickListener$default(productViewHolder.getBtnFavourite(), 0, new ProductRecyclerViewAdapter$onBindViewHolder$3(this, product), 1, null);
            if (product.isFavourite()) {
                ViewExtsKt.setDrawable(productViewHolder.getImgIconAction(), R.drawable.ic_favourite_enable);
                ViewExtsKt.setTint(productViewHolder.getImgIconAction(), R.color.colorWhite);
                return;
            }
            ViewExtsKt.setDrawable(productViewHolder.getImgIconAction(), R.drawable.ic_favourite_product);
            ViewExtsKt.setTint(productViewHolder.getImgIconAction(), R.color.colorWhite);
        }
    }

    public final void closeAllSwipeLayout() {
        SwipeItemRecyclerMangerImpl swipeItemRecyclerMangerImpl = this.mItemManger;
        Intrinsics.checkNotNullExpressionValue(swipeItemRecyclerMangerImpl, "mItemManger");
        List<Integer> openItems = swipeItemRecyclerMangerImpl.getOpenItems();
        Intrinsics.checkNotNullExpressionValue(openItems, "mItemManger.openItems");
        if (!openItems.isEmpty()) {
            this.mItemManger.closeAllItems();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        HeaderItemDecoration headerItemDecoration = new HeaderItemDecoration(false, ProductRecyclerViewAdapter$onAttachedToRecyclerView$1.INSTANCE);
        this.stickyHeader = headerItemDecoration;
        this.mRecyclerView = recyclerView;
        if (headerItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickyHeader");
        }
        recyclerView.addItemDecoration(headerItemDecoration);
        recyclerView.addOnScrollListener(this.onScrollListener);
        recyclerView.addOnItemTouchListener(this.itemTouchListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        this.mRecyclerView = null;
        HeaderItemDecoration headerItemDecoration = this.stickyHeader;
        if (headerItemDecoration == null) {
            Intrinsics.throwUninitializedPropertyAccessException("stickyHeader");
        }
        recyclerView.removeItemDecoration(headerItemDecoration);
        recyclerView.removeOnScrollListener(this.onScrollListener);
        recyclerView.removeOnItemTouchListener(this.itemTouchListener);
    }
}
