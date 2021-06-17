package com.thecoffeehouse.guestapp.screens.stores;

import android.content.Context;
import android.view.View;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/thecoffeehouse/guestapp/screens/stores/StoreDetailBottomSheetFragment$initStoreDial$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoreDetailBottomSheetFragment.kt */
final class StoreDetailBottomSheetFragment$initStoreDial$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ String $phoneNumberSupport$inlined;
    final /* synthetic */ View $view$inlined;
    final /* synthetic */ StoreDetailBottomSheetFragment this$0;

    StoreDetailBottomSheetFragment$initStoreDial$$inlined$let$lambda$1(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment, View view, String str) {
        this.this$0 = storeDetailBottomSheetFragment;
        this.$view$inlined = view;
        this.$phoneNumberSupport$inlined = str;
    }

    public final void onClick(View view) {
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        OrderExtsKt.openDialApp(requireContext, this.$phoneNumberSupport$inlined);
    }
}
