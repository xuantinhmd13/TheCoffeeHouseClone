package com.thecoffeehouse.guestapp.screens.order.filterproducts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.messaging.Constants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductRecycleViewAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductRecycleViewAdapter$ProductCategoryViewHolder;", "menus", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "onClickCategoryListener", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ProductCategoryViewHolder", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: FilterProductRecycleViewAdapter.kt */
public final class FilterProductRecycleViewAdapter extends RecyclerView.Adapter<ProductCategoryViewHolder> {
    private final List<Menu> menus;
    private final Function1<Menu, Unit> onClickCategoryListener;

    /* JADX DEBUG: Multi-variable search result rejected for r3v0, resolved type: kotlin.jvm.functions.Function1<? super com.thecoffeehouse.guestapp.services.api.model.orders.Menu, kotlin.Unit> */
    /* JADX WARN: Multi-variable type inference failed */
    public FilterProductRecycleViewAdapter(List<Menu> list, Function1<? super Menu, Unit> function1) {
        Intrinsics.checkNotNullParameter(list, "menus");
        Intrinsics.checkNotNullParameter(function1, "onClickCategoryListener");
        this.menus = list;
        this.onClickCategoryListener = function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u000f0\u0013R\u0019\u0010\u0005\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u000b0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductRecycleViewAdapter$ProductCategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "imgCategory", "Landroid/widget/ImageView;", "kotlin.jvm.PlatformType", "getImgCategory", "()Landroid/widget/ImageView;", "txtCategoryName", "Landroid/widget/TextView;", "getTxtCategoryName", "()Landroid/widget/TextView;", "bind", "", "menu", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "onClickCategoryListener", "Lkotlin/Function1;", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: FilterProductRecycleViewAdapter.kt */
    public static final class ProductCategoryViewHolder extends RecyclerView.ViewHolder {
        public static final Companion Companion = new Companion(null);
        private final ImageView imgCategory;
        private final TextView txtCategoryName;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ProductCategoryViewHolder(View view) {
            super(view);
            Intrinsics.checkNotNullParameter(view, "itemView");
            this.txtCategoryName = (TextView) view.findViewById(R.id.txt_category_name);
            this.imgCategory = (ImageView) view.findViewById(R.id.img_category);
        }

        public final TextView getTxtCategoryName() {
            return this.txtCategoryName;
        }

        public final ImageView getImgCategory() {
            return this.imgCategory;
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductRecycleViewAdapter$ProductCategoryViewHolder$Companion;", "", "()V", Constants.MessagePayloadKeys.FROM, "Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductRecycleViewAdapter$ProductCategoryViewHolder;", "parent", "Landroid/view/ViewGroup;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
        /* compiled from: FilterProductRecycleViewAdapter.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final ProductCategoryViewHolder from(ViewGroup viewGroup) {
                Intrinsics.checkNotNullParameter(viewGroup, "parent");
                View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_row_product_category, viewGroup, false);
                Intrinsics.checkNotNullExpressionValue(inflate, ViewHierarchyConstants.VIEW_KEY);
                return new ProductCategoryViewHolder(inflate);
            }
        }

        public final void bind(Menu menu, Function1<? super Menu, Unit> function1) {
            Intrinsics.checkNotNullParameter(menu, "menu");
            Intrinsics.checkNotNullParameter(function1, "onClickCategoryListener");
            View view = this.itemView;
            Intrinsics.checkNotNullExpressionValue(view, "itemView");
            ContextExtsKt.setOnSafeClickListener$default(view, 0, new FilterProductRecycleViewAdapter$ProductCategoryViewHolder$bind$1(function1, menu), 1, null);
            TextView textView = this.txtCategoryName;
            Intrinsics.checkNotNullExpressionValue(textView, "txtCategoryName");
            textView.setText(menu.getName());
            ImageView imageView = this.imgCategory;
            Intrinsics.checkNotNullExpressionValue(imageView, "imgCategory");
            Context context = imageView.getContext();
            ((RequestBuilder) Glide.with(context).load(menu.getThumbnail()).error(ContextCompat.getDrawable(context, R.drawable.ic_placeholder_store))).into(this.imgCategory);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public ProductCategoryViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return ProductCategoryViewHolder.Companion.from(viewGroup);
    }

    public void onBindViewHolder(ProductCategoryViewHolder productCategoryViewHolder, int i) {
        Intrinsics.checkNotNullParameter(productCategoryViewHolder, "holder");
        productCategoryViewHolder.bind(this.menus.get(i), this.onClickCategoryListener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.menus.size();
    }
}
