package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.daimajia.swipe.SwipeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u001cBK\u0012\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\t\u0012\u0018\b\u0002\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007¢\u0006\u0002\u0010\fJ\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u000e\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0002J\u000e\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002J\u0018\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0018\u0010\u0018\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010H\u0016R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\u00020\u0006j\b\u0012\u0004\u0012\u00020\u0002`\u0007X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\n0\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter;", "Landroidx/recyclerview/widget/ListAdapter;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter$ViewHolder;", "Landroid/widget/Filterable;", "mProducts", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "onItemClickListener", "Lkotlin/Function1;", "", "mProductsFiltered", "(Ljava/util/ArrayList;Lkotlin/jvm/functions/Function1;Ljava/util/ArrayList;)V", "getFilter", "Landroid/widget/Filter;", "getItemCount", "", "notifyProductInserted", "productFavourite", "notifyProductRemoved", "productRemoved", "onBindViewHolder", "p0", "p1", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchProductAdapter.kt */
public final class SearchProductRecyclerViewAdapter extends ListAdapter<Product, ViewHolder> implements Filterable {
    private final ArrayList<Product> mProducts;
    private ArrayList<Product> mProductsFiltered;
    private final Function1<Product, Unit> onItemClickListener;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SearchProductRecyclerViewAdapter(ArrayList arrayList, Function1 function1, ArrayList arrayList2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(arrayList, function1, (i & 4) != 0 ? arrayList : arrayList2);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.Product, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SearchProductRecyclerViewAdapter(ArrayList<Product> arrayList, Function1<? super Product, Unit> function1, ArrayList<Product> arrayList2) {
        super(new ProductDiffCallback());
        Intrinsics.checkNotNullParameter(arrayList, "mProducts");
        Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
        Intrinsics.checkNotNullParameter(arrayList2, "mProductsFiltered");
        this.mProducts = arrayList;
        this.onItemClickListener = function1;
        this.mProductsFiltered = arrayList2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u00120\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "mImgProduct", "Landroid/widget/ImageView;", "mLayoutRootProduct", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mTxtDescProduct", "Landroid/widget/TextView;", "mTxtNameProduct", "mTxtPriceProduct", "swipeLayout", "Lcom/daimajia/swipe/SwipeLayout;", "getSwipeLayout", "()Lcom/daimajia/swipe/SwipeLayout;", "bind", "", "product", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "onItemClickListener", "Lkotlin/Function1;", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SearchProductAdapter.kt */
    public static final class ViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final ImageView mImgProduct;
        private final ConstraintLayout mLayoutRootProduct;
        private final TextView mTxtDescProduct;
        private final TextView mTxtNameProduct;
        private final TextView mTxtPriceProduct;
        private final SwipeLayout swipeLayout;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ViewHolder(View view) {
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
        }

        public final SwipeLayout getSwipeLayout() {
            return this.swipeLayout;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter$ViewHolder$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductRecyclerViewAdapter$ViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: SearchProductAdapter.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_menu_product, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new ViewHolder(inflate);
            }
        }

        public final void bind(Product product, Function1<? super Product, Unit> function1) {
            Intrinsics.checkNotNullParameter(product, "product");
            Intrinsics.checkNotNullParameter(function1, "onItemClickListener");
            Glide.with(this.mImgProduct.getContext()).load(product.getImages().get(0)).into(this.mImgProduct);
            this.mTxtNameProduct.setText(product.getName());
            this.mTxtDescProduct.setText(product.getDescription());
            this.mTxtPriceProduct.setText(Html.fromHtml(product.getPriceStr(), 0));
            ContextExtsKt.setOnSafeClickListener$default(this.mLayoutRootProduct, 0, new SearchProductRecyclerViewAdapter$ViewHolder$bind$1(function1, product), 1, null);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return ViewHolder.Companion.from(viewGroup);
    }

    @Override // androidx.recyclerview.widget.ListAdapter, androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.mProductsFiltered.size();
    }

    public void onBindViewHolder(ViewHolder viewHolder, int i) {
        Intrinsics.checkNotNullParameter(viewHolder, "p0");
        try {
            Product product = this.mProductsFiltered.get(viewHolder.getAdapterPosition());
            Intrinsics.checkNotNullExpressionValue(product, "mProductsFiltered[p0.adapterPosition]");
            viewHolder.bind(product, this.onItemClickListener);
            viewHolder.getSwipeLayout().setLeftSwipeEnabled(false);
            viewHolder.getSwipeLayout().setRightSwipeEnabled(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Filter getFilter() {
        return new SearchProductRecyclerViewAdapter$getFilter$1(this);
    }

    public final void notifyProductRemoved(Product product) {
        Intrinsics.checkNotNullParameter(product, "productRemoved");
        Iterator<Product> it = this.mProductsFiltered.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next().getId(), product.getId())) {
                break;
            } else {
                i++;
            }
        }
        GeneralKt.log(Integer.valueOf(i));
        if (i >= 0) {
            this.mProductsFiltered.remove(i);
            notifyDataSetChanged();
        }
    }

    public final void notifyProductInserted(Product product) {
        Intrinsics.checkNotNullParameter(product, "productFavourite");
        this.mProductsFiltered.add(product);
        notifyDataSetChanged();
    }
}
