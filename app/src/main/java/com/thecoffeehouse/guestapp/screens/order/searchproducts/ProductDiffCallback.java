package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import androidx.recyclerview.widget.DiffUtil;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/searchproducts/ProductDiffCallback;", "Landroidx/recyclerview/widget/DiffUtil$ItemCallback;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "()V", "areContentsTheSame", "", "oldItem", "newItem", "areItemsTheSame", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SearchProductAdapter.kt */
public final class ProductDiffCallback extends DiffUtil.ItemCallback<Product> {
    public boolean areItemsTheSame(Product product, Product product2) {
        Intrinsics.checkNotNullParameter(product, "oldItem");
        Intrinsics.checkNotNullParameter(product2, "newItem");
        return Intrinsics.areEqual(product.getId(), product2.getId());
    }

    public boolean areContentsTheSame(Product product, Product product2) {
        Intrinsics.checkNotNullParameter(product, "oldItem");
        Intrinsics.checkNotNullParameter(product2, "newItem");
        return Intrinsics.areEqual(product, product2);
    }
}
