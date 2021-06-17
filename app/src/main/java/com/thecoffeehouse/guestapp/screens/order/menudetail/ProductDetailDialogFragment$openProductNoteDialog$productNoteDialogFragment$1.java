package com.thecoffeehouse.guestapp.screens.order.menudetail;

import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductDetailDialogFragment;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "note", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment$openProductNoteDialog$productNoteDialogFragment$1 extends Lambda implements Function1<String, Unit> {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductDetailDialogFragment$openProductNoteDialog$productNoteDialogFragment$1(ProductDetailDialogFragment productDetailDialogFragment) {
        super(1);
        this.this$0 = productDetailDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke(str);
        return Unit.INSTANCE;
    }

    public final void invoke(String str) {
        GeneralKt.log(str);
        this.this$0.mOrderLine.setNote(str);
        ProductDetailDialogFragment.ProductConfiguration productConfiguration = this.this$0.mProductConfiguration;
        if (productConfiguration != null) {
            productConfiguration.setNotes(str);
        }
        ProductDetailDialogFragment productDetailDialogFragment = this.this$0;
        productDetailDialogFragment.updateNote(productDetailDialogFragment.mOrderLine.getNote());
    }
}
