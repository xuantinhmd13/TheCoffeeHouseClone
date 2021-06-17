package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/checkout/AtTableCheckoutInteraction$initBodyPayment$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/drawable/Drawable;", "onLoadCleared", "", "placeholder", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AtTableCheckoutInteraction.kt */
public final class AtTableCheckoutInteraction$initBodyPayment$1 extends CustomTarget<Drawable> {
    final /* synthetic */ AtTableCheckoutInteraction this$0;

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    AtTableCheckoutInteraction$initBodyPayment$1(AtTableCheckoutInteraction atTableCheckoutInteraction, int i, int i2) {
        super(i, i2);
        this.this$0 = atTableCheckoutInteraction;
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
        onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
    }

    public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
        Intrinsics.checkNotNullParameter(drawable, "resource");
        View findViewById = AtTableCheckoutInteraction.access$getMAtStoreCheckoutLayout$p(this.this$0).findViewById(R.id.layout_payment);
        Intrinsics.checkNotNullExpressionValue(findViewById, "mAtStoreCheckoutLayout.layout_payment");
        ((TextView) findViewById.findViewById(R.id.txt_title_price)).setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, (Drawable) null, (Drawable) null, (Drawable) null);
    }
}
