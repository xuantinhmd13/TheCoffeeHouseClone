package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.view.View;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/order/menudetail/ProductDetailDialogFragment$createNoteOption$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: ProductDetailDialogFragment.kt */
public final class ProductDetailDialogFragment$createNoteOption$$inlined$let$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ ProductDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ProductDetailDialogFragment$createNoteOption$$inlined$let$lambda$1(ProductDetailDialogFragment productDetailDialogFragment) {
        super(1);
        this.this$0 = productDetailDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        this.this$0.openProductNoteDialog();
    }
}
