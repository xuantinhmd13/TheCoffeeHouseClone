package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$selectShippingMethod$1 extends Lambda implements Function1<ArrayList<String>, Unit> {
    final /* synthetic */ String $tableCode;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$selectShippingMethod$1(MainActivity mainActivity, String str) {
        super(1);
        this.this$0 = mainActivity;
        this.$tableCode = str;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<String> arrayList) {
        invoke(arrayList);
        return Unit.INSTANCE;
    }

    public final void invoke(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "it");
        if (arrayList.contains(ShippingType.INSTANCE.getTABLE())) {
            this.this$0.getMOrderFragment().setShippingMethodByDeepLink(ShippingType.INSTANCE.getTABLE(), null, this.$tableCode);
            return;
        }
        MainActivity mainActivity = this.this$0;
        String string = mainActivity.getString(R.string.str_error);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
        String string2 = this.this$0.getString(R.string.str_shipping_method_type_is_not_supported);
        Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_s…od_type_is_not_supported)");
        ContextExtsKt.showOneButtonAlertDialog$default(mainActivity, string, string2, null, false, null, 28, null);
        this.this$0.getMOrderFragment().setShippingMethodByDeepLink(ShippingType.INSTANCE.getDELI(), null, null);
    }
}
