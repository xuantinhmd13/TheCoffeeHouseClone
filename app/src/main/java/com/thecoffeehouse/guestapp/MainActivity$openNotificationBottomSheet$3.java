package com.thecoffeehouse.guestapp;

import android.view.View;
import android.widget.FrameLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u000b"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$openNotificationBottomSheet$3", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$openNotificationBottomSheet$3 extends BottomSheetBehavior.BottomSheetCallback {
    final /* synthetic */ BottomSheetDialog $notificationBottomSheetDialog;

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public void onSlide(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
    }

    MainActivity$openNotificationBottomSheet$3(BottomSheetDialog bottomSheetDialog) {
        this.$notificationBottomSheetDialog = bottomSheetDialog;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public void onStateChanged(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
        if (i == 4) {
            BottomSheetBehavior<FrameLayout> behavior = this.$notificationBottomSheetDialog.getBehavior();
            Intrinsics.checkNotNullExpressionValue(behavior, "notificationBottomSheetDialog.behavior");
            behavior.setState(5);
        }
    }
}
