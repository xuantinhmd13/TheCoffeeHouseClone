package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationDialog$listenViews$1$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
final class PickLocationDialog$listenViews$$inlined$apply$lambda$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ View $this_apply;
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$listenViews$$inlined$apply$lambda$2(View view, PickLocationDialog pickLocationDialog) {
        super(1);
        this.$this_apply = view;
        this.this$0 = pickLocationDialog;
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
        TextView access$getMTxtPickLocationManually$p = PickLocationDialog.access$getMTxtPickLocationManually$p(this.this$0);
        if (access$getMTxtPickLocationManually$p != null) {
            access$getMTxtPickLocationManually$p.setVisibility(8);
        }
        View findViewById = this.$this_apply.findViewById(R.id.search_address);
        Intrinsics.checkNotNullExpressionValue(findViewById, "search_address");
        ((SearchView) findViewById.findViewById(R.id.searchView)).clearFocus();
        PickLocationDialog.access$changeToPickLocationManually(this.this$0);
    }
}
