package com.thecoffeehouse.guestapp.screens.order.recentorders;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate", "com/thecoffeehouse/guestapp/screens/order/recentorders/RecentProductsDialogFragment$initViewStubHeader$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: RecentProductsDialogFragment.kt */
public final class RecentProductsDialogFragment$initViewStubHeader$$inlined$let$lambda$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ ViewStub $viewStubHeader$inlined;
    final /* synthetic */ RecentProductsDialogFragment this$0;

    RecentProductsDialogFragment$initViewStubHeader$$inlined$let$lambda$1(RecentProductsDialogFragment recentProductsDialogFragment, ViewStub viewStub) {
        this.this$0 = recentProductsDialogFragment;
        this.$viewStubHeader$inlined = viewStub;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.layout_root_sub_header);
        RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(R.id.rcv_products);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rcv_products");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        Intrinsics.checkNotNullExpressionValue(frameLayout, "inflatedId");
        ((RelativeLayout.LayoutParams) layoutParams).addRule(3, frameLayout.getId());
        Intrinsics.checkNotNullExpressionValue(view, "inflated");
        ImageView imageView = (ImageView) view.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "inflated.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.recentorders.RecentProductsDialogFragment$initViewStubHeader$$inlined$let$lambda$1.AnonymousClass1 */
            final /* synthetic */ RecentProductsDialogFragment$initViewStubHeader$$inlined$let$lambda$1 this$0;

            {
                this.this$0 = r1;
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
                this.this$0.this$0.dismiss();
            }
        }, 1, null);
        TextView textView = (TextView) view.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "inflated.txt_title_sub_screen");
        textView.setText(this.this$0.getString(R.string.str_recent_order));
    }
}
