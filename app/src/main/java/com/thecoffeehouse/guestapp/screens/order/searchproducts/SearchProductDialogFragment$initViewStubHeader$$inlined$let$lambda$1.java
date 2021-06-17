package com.thecoffeehouse.guestapp.screens.order.searchproducts;

import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Filter;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import androidx.recyclerview.widget.RecyclerView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate", "com/thecoffeehouse/guestapp/screens/order/searchproducts/SearchProductDialogFragment$initViewStubHeader$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: SearchProductDialogFragment.kt */
public final class SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ ViewStub $viewStubHeader$inlined;
    final /* synthetic */ SearchProductDialogFragment this$0;

    SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1(SearchProductDialogFragment searchProductDialogFragment, ViewStub viewStub) {
        this.this$0 = searchProductDialogFragment;
        this.$viewStubHeader$inlined = viewStub;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        Intrinsics.checkNotNullExpressionValue(view, "inflated");
        SearchView searchView = (SearchView) view.findViewById(R.id.searchView);
        Intrinsics.checkNotNullExpressionValue(searchView, "inflated.searchView");
        searchView.setIconified(false);
        RecyclerView recyclerView = (RecyclerView) this.this$0._$_findCachedViewById(R.id.rcv_products);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "rcv_products");
        ViewGroup.LayoutParams layoutParams = recyclerView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams).addRule(3, view.getId());
        TextView textView = (TextView) view.findViewById(R.id.txtClose);
        Intrinsics.checkNotNullExpressionValue(textView, "inflated.txtClose");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1.AnonymousClass1 */
            final /* synthetic */ SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1 this$0;

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
        ((SearchView) view.findViewById(R.id.searchView)).setOnQueryTextListener(new SearchView.OnQueryTextListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1.AnonymousClass2 */
            final /* synthetic */ SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1 this$0;

            {
                this.this$0 = r1;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextSubmit(final String str) {
                RecyclerView recyclerView = this.this$0.this$0.mRcvProduct;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                }
                new Handler().postDelayed(new Runnable(this) {
                    /* class com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1.AnonymousClass2.AnonymousClass1 */
                    final /* synthetic */ AnonymousClass2 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void run() {
                        Filter filter;
                        RecyclerView.RecycledViewPool recycledViewPool;
                        RecyclerView recyclerView = this.this$0.this$0.this$0.mRcvProduct;
                        if (!(recyclerView == null || (recycledViewPool = recyclerView.getRecycledViewPool()) == null)) {
                            recycledViewPool.clear();
                        }
                        SearchProductRecyclerViewAdapter mProductAdapter = this.this$0.this$0.this$0.getMProductAdapter();
                        if (mProductAdapter != null && (filter = mProductAdapter.getFilter()) != null) {
                            filter.filter(str);
                        }
                    }
                }, 200);
                return true;
            }

            @Override // androidx.appcompat.widget.SearchView.OnQueryTextListener
            public boolean onQueryTextChange(final String str) {
                RecyclerView recyclerView = this.this$0.this$0.mRcvProduct;
                if (recyclerView != null) {
                    recyclerView.scrollToPosition(0);
                }
                new Handler().postDelayed(new Runnable(this) {
                    /* class com.thecoffeehouse.guestapp.screens.order.searchproducts.SearchProductDialogFragment$initViewStubHeader$$inlined$let$lambda$1.AnonymousClass2.AnonymousClass2 */
                    final /* synthetic */ AnonymousClass2 this$0;

                    {
                        this.this$0 = r1;
                    }

                    public final void run() {
                        Filter filter;
                        RecyclerView.RecycledViewPool recycledViewPool;
                        RecyclerView recyclerView = this.this$0.this$0.this$0.mRcvProduct;
                        if (!(recyclerView == null || (recycledViewPool = recyclerView.getRecycledViewPool()) == null)) {
                            recycledViewPool.clear();
                        }
                        SearchProductRecyclerViewAdapter mProductAdapter = this.this$0.this$0.this$0.getMProductAdapter();
                        if (mProductAdapter != null && (filter = mProductAdapter.getFilter()) != null) {
                            filter.filter(str);
                        }
                    }
                }, 200);
                return true;
            }
        });
    }
}
