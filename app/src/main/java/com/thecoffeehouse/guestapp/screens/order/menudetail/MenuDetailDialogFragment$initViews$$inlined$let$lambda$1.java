package com.thecoffeehouse.guestapp.screens.order.menudetail;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import com.thecoffeehouse.guestapp.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflatedView", "Landroid/view/View;", "onInflate", "com/thecoffeehouse/guestapp/screens/order/menudetail/MenuDetailDialogFragment$initViews$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MenuDetailDialogFragment.kt */
final class MenuDetailDialogFragment$initViews$$inlined$let$lambda$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ View $view$inlined;
    final /* synthetic */ ViewStub $viewStubFragment$inlined;
    final /* synthetic */ MenuDetailDialogFragment this$0;

    MenuDetailDialogFragment$initViews$$inlined$let$lambda$1(MenuDetailDialogFragment menuDetailDialogFragment, ViewStub viewStub, View view) {
        this.this$0 = menuDetailDialogFragment;
        this.$viewStubFragment$inlined = viewStub;
        this.$view$inlined = view;
    }

    public final void onInflate(ViewStub viewStub, final View view) {
        MenuDetailDialogFragment menuDetailDialogFragment = this.this$0;
        Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
        MenuDetailDialogFragment.access$setRootView$p(menuDetailDialogFragment, (ViewGroup) view);
        MenuDetailDialogFragment menuDetailDialogFragment2 = this.this$0;
        View findViewById = view.findViewById(R.id.layout_shipping_scrollable);
        Intrinsics.checkNotNullExpressionValue(findViewById, "inflatedView.findViewByI…yout_shipping_scrollable)");
        MenuDetailDialogFragment.access$setMLayoutShippingScrollable$p(menuDetailDialogFragment2, findViewById);
        MenuDetailDialogFragment.access$getMainActivity(this.this$0);
        view.post(new Runnable(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.MenuDetailDialogFragment$initViews$$inlined$let$lambda$1.AnonymousClass1 */
            final /* synthetic */ MenuDetailDialogFragment$initViews$$inlined$let$lambda$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                MenuDetailDialogFragment.access$initViews(this.this$0.this$0, view);
                MenuDetailDialogFragment.access$initToolbar(this.this$0.this$0, this.this$0.$view$inlined);
            }
        });
    }
}
