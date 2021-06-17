package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.google.android.gms.maps.model.Marker;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0012\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002H\u0016J\"\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0010\u0010\b\u001a\f\u0012\u0006\b\u0000\u0012\u00020\u0002\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"com/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreDialogFragment$setupInfoWindowGoogleMap$1$getInfoWindow$1", "Lcom/bumptech/glide/request/target/CustomTarget;", "Landroid/graphics/drawable/Drawable;", "onLoadCleared", "", "placeholder", "onResourceReady", "resource", "transition", "Lcom/bumptech/glide/request/transition/Transition;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickStoreDialogFragment.kt */
public final class PickStoreDialogFragment$setupInfoWindowGoogleMap$1$getInfoWindow$1 extends CustomTarget<Drawable> {
    final /* synthetic */ View $layout;
    final /* synthetic */ Marker $p0;

    PickStoreDialogFragment$setupInfoWindowGoogleMap$1$getInfoWindow$1(View view, Marker marker) {
        this.$layout = view;
        this.$p0 = marker;
    }

    @Override // com.bumptech.glide.request.target.Target
    public /* bridge */ /* synthetic */ void onResourceReady(Object obj, Transition transition) {
        onResourceReady((Drawable) obj, (Transition<? super Drawable>) transition);
    }

    public void onResourceReady(Drawable drawable, Transition<? super Drawable> transition) {
        Intrinsics.checkNotNullParameter(drawable, "resource");
        View view = this.$layout;
        Intrinsics.checkNotNullExpressionValue(view, "layout");
        ((TLImageView) view.findViewById(R.id.img_store)).setImageDrawable(drawable);
        Marker marker = this.$p0;
        if (marker != null && marker.isInfoWindowShown()) {
            this.$p0.hideInfoWindow();
            this.$p0.showInfoWindow();
        }
    }

    @Override // com.bumptech.glide.request.target.Target
    public void onLoadCleared(Drawable drawable) {
        View view = this.$layout;
        Intrinsics.checkNotNullExpressionValue(view, "layout");
        ((TLImageView) view.findViewById(R.id.img_store)).setImageResource(R.drawable.ic_tch_brand_logo);
    }
}
