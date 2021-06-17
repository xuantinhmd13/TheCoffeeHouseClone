package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.view.View;
import android.view.ViewStub;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002¨\u0006\u0003"}, d2 = {"<anonymous>", "", "run", "com/thecoffeehouse/guestapp/screens/order/menudetail/MenuDetailDialogFragment$initViews$1$2"}, k = 3, mv = {1, 4, 0})
/* compiled from: MenuDetailDialogFragment.kt */
final class MenuDetailDialogFragment$initViews$$inlined$let$lambda$2 implements Runnable {
    final /* synthetic */ View $view$inlined;
    final /* synthetic */ ViewStub $viewStubFragment$inlined;
    final /* synthetic */ MenuDetailDialogFragment this$0;

    MenuDetailDialogFragment$initViews$$inlined$let$lambda$2(MenuDetailDialogFragment menuDetailDialogFragment, ViewStub viewStub, View view) {
        this.this$0 = menuDetailDialogFragment;
        this.$viewStubFragment$inlined = viewStub;
        this.$view$inlined = view;
    }

    public final void run() {
        this.$viewStubFragment$inlined.inflate();
    }
}
