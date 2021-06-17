package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.screens.order.favouriteproducts.FavouriteProductDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.Product;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "productFavourite", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Product;", "isFavourite", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showProductDetailDialog$2 extends Lambda implements Function2<Product, Boolean, Unit> {
    final /* synthetic */ Product $product;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showProductDetailDialog$2(OrderFragment orderFragment, Product product) {
        super(2);
        this.this$0 = orderFragment;
        this.$product = product;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Product product, Boolean bool) {
        invoke(product, bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Product product, boolean z) {
        Intrinsics.checkNotNullParameter(product, "productFavourite");
        this.this$0.updateFavouriteProduct(product, z);
        FavouriteProductDialogFragment favouriteProductDialogFragment = this.this$0.mFavouriteProductDialogFragment;
        if (favouriteProductDialogFragment != null) {
            favouriteProductDialogFragment.updateFavouriteProduct(product, z);
        }
        this.this$0.notifyItemChangedProductInMenuList(this.$product);
        ((OrderViewModel) this.this$0.getViewModel()).updateFavouriteProduct(product.getId(), z);
        this.this$0.showToastUpdateFavouriteProduct(z);
        if (z) {
            this.this$0.getMTrackingEventOrder().triggerSendEventAddFavourite();
        }
    }
}
