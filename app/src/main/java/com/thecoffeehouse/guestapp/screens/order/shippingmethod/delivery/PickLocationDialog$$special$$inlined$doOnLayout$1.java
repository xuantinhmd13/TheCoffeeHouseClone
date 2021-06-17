package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import android.widget.RelativeLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLImageButton;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_LEFT_KEY, "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 4, 0})
/* compiled from: View.kt */
public final class PickLocationDialog$$special$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ View $this_apply$inlined;

    public PickLocationDialog$$special$$inlined$doOnLayout$1(View view) {
        this.$this_apply$inlined = view;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Intrinsics.checkParameterIsNotNull(view, ViewHierarchyConstants.VIEW_KEY);
        view.removeOnLayoutChangeListener(this);
        View findViewById = this.$this_apply$inlined.findViewById(R.id.layout_map_view);
        Intrinsics.checkNotNullExpressionValue(findViewById, "layout_map_view");
        TLImageButton tLImageButton = (TLImageButton) findViewById.findViewById(R.id.btn_zoom_out);
        Intrinsics.checkNotNullExpressionValue(tLImageButton, "layout_map_view.btn_zoom_out");
        RelativeLayout relativeLayout = (RelativeLayout) this.$this_apply$inlined.findViewById(R.id.layout_confirm_location);
        Intrinsics.checkNotNullExpressionValue(relativeLayout, "layout_confirm_location");
        ViewExtsKt.marginBottom(tLImageButton, relativeLayout.getHeight() + ViewExtsKt.DPtoPX(44.0f));
    }
}
