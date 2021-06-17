package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import android.view.View;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetMembershipResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.Profile;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000;\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\b\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JP\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0007H\u0016¨\u0006\u000f¸\u0006\u0010"}, d2 = {"androidx/core/view/ViewKt$doOnNextLayout$1", "Landroid/view/View$OnLayoutChangeListener;", "onLayoutChange", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", ViewHierarchyConstants.DIMENSION_LEFT_KEY, "", ViewHierarchyConstants.DIMENSION_TOP_KEY, "right", "bottom", "oldLeft", "oldTop", "oldRight", "oldBottom", "core-ktx_release", "androidx/core/view/ViewKt$doOnLayout$$inlined$doOnNextLayout$1"}, k = 1, mv = {1, 4, 0})
/* compiled from: View.kt */
public final class AccumulatePointsFragment$initMembership$$inlined$doOnLayout$1 implements View.OnLayoutChangeListener {
    final /* synthetic */ AccumulatePointsFragment this$0;

    public AccumulatePointsFragment$initMembership$$inlined$doOnLayout$1(AccumulatePointsFragment accumulatePointsFragment) {
        this.this$0 = accumulatePointsFragment;
    }

    public void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        Profile profile;
        Intrinsics.checkParameterIsNotNull(view, ViewHierarchyConstants.VIEW_KEY);
        view.removeOnLayoutChangeListener(this);
        try {
            BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
            GetMembershipResponse access$getMMembershipResponse$p = AccumulatePointsFragment.access$getMMembershipResponse$p(this.this$0);
            AccumulatePointsFragment.access$getMImgBarcode$p(this.this$0).setImageBitmap(barcodeEncoder.encodeBitmap((access$getMMembershipResponse$p == null || (profile = access$getMMembershipResponse$p.getProfile()) == null) ? null : profile.getBarcode(), BarcodeFormat.CODE_128, AccumulatePointsFragment.access$getMImgBarcode$p(this.this$0).getWidth(), AccumulatePointsFragment.access$getMImgBarcode$p(this.this$0).getHeight()));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
