package com.thecoffeehouse.guestapp.screens.order.menudetail.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0019\u001a\u00020\tJ\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R \u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/menudetail/views/LayoutFooterProductDetail;", "Landroid/widget/FrameLayout;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "onClickDecreaseListener", "Lkotlin/Function0;", "", "getOnClickDecreaseListener", "()Lkotlin/jvm/functions/Function0;", "setOnClickDecreaseListener", "(Lkotlin/jvm/functions/Function0;)V", "onClickIncreaseListener", "getOnClickIncreaseListener", "setOnClickIncreaseListener", "onClickSelectProductListener", "getOnClickSelectProductListener", "setOnClickSelectProductListener", "updateQuantity", FirebaseAnalytics.Param.QUANTITY, "updateTotalPrice", "totalPrice", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LayoutFooterProductDetail.kt */
public final class LayoutFooterProductDetail extends FrameLayout {
    private HashMap _$_findViewCache;
    private Function0<Unit> onClickDecreaseListener = LayoutFooterProductDetail$onClickDecreaseListener$1.INSTANCE;
    private Function0<Unit> onClickIncreaseListener = LayoutFooterProductDetail$onClickIncreaseListener$1.INSTANCE;
    private Function0<Unit> onClickSelectProductListener = LayoutFooterProductDetail$onClickSelectProductListener$1.INSTANCE;

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final Function0<Unit> getOnClickSelectProductListener() {
        return this.onClickSelectProductListener;
    }

    public final void setOnClickSelectProductListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClickSelectProductListener = function0;
    }

    public final Function0<Unit> getOnClickIncreaseListener() {
        return this.onClickIncreaseListener;
    }

    public final void setOnClickIncreaseListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClickIncreaseListener = function0;
    }

    public final Function0<Unit> getOnClickDecreaseListener() {
        return this.onClickDecreaseListener;
    }

    public final void setOnClickDecreaseListener(Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onClickDecreaseListener = function0;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutFooterProductDetail(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_footer_product_detail, (ViewGroup) this, true);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_product_quantity_price);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_product_quantity_price");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass1 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

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
                this.this$0.getOnClickSelectProductListener().invoke();
            }
        }, 1, null);
        ((ImageView) _$_findCachedViewById(R.id.img_decrease)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass2 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.getOnClickDecreaseListener().invoke();
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.img_increase)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass3 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.getOnClickIncreaseListener().invoke();
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutFooterProductDetail(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_footer_product_detail, (ViewGroup) this, true);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_product_quantity_price);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_product_quantity_price");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass1 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

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
                this.this$0.getOnClickSelectProductListener().invoke();
            }
        }, 1, null);
        ((ImageView) _$_findCachedViewById(R.id.img_decrease)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass2 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.getOnClickDecreaseListener().invoke();
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.img_increase)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass3 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.getOnClickIncreaseListener().invoke();
            }
        });
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutFooterProductDetail(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        LayoutInflater.from(getContext()).inflate(R.layout.layout_footer_product_detail, (ViewGroup) this, true);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_product_quantity_price);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_product_quantity_price");
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass1 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

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
                this.this$0.getOnClickSelectProductListener().invoke();
            }
        }, 1, null);
        ((ImageView) _$_findCachedViewById(R.id.img_decrease)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass2 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.getOnClickDecreaseListener().invoke();
            }
        });
        ((ImageView) _$_findCachedViewById(R.id.img_increase)).setOnClickListener(new View.OnClickListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.menudetail.views.LayoutFooterProductDetail.AnonymousClass3 */
            final /* synthetic */ LayoutFooterProductDetail this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                this.this$0.getOnClickIncreaseListener().invoke();
            }
        });
    }

    public final void updateTotalPrice(int i) {
        if (i > 0) {
            TextView textView = (TextView) _$_findCachedViewById(R.id.txt_product_quantity_price);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_product_quantity_price");
            textView.setText(getContext().getString(R.string.str_choose_item) + " - " + OrderExtsKt.formatVND(Integer.valueOf(i)));
            return;
        }
        TextView textView2 = (TextView) _$_findCachedViewById(R.id.txt_product_quantity_price);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_product_quantity_price");
        textView2.setText(getContext().getString(R.string.str_unselected_this_item));
    }

    public final void updateQuantity(int i) {
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_quantity);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_quantity");
        textView.setText(String.valueOf(i));
    }
}
