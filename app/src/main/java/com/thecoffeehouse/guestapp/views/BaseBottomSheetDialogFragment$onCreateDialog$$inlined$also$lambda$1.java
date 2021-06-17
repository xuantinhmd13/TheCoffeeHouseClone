package com.thecoffeehouse.guestapp.views;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007¨\u0006\u0011¸\u0006\u0000"}, d2 = {"com/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$onCreateDialog$1$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;", "dismissAllowed", "", "getDismissAllowed", "()Z", "setDismissAllowed", "(Z)V", "onSlide", "", "bottomSheet", "Landroid/view/View;", "slideOffset", "", "onStateChanged", "newState", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseBottomSheetDialogFragment.kt */
public final class BaseBottomSheetDialogFragment$onCreateDialog$$inlined$also$lambda$1 extends BottomSheetBehavior.BottomSheetCallback {
    final /* synthetic */ BottomSheetBehavior $it;
    private boolean dismissAllowed = true;
    final /* synthetic */ BaseBottomSheetDialogFragment this$0;

    BaseBottomSheetDialogFragment$onCreateDialog$$inlined$also$lambda$1(BottomSheetBehavior bottomSheetBehavior, BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        this.$it = bottomSheetBehavior;
        this.this$0 = baseBottomSheetDialogFragment;
    }

    public final boolean getDismissAllowed() {
        return this.dismissAllowed;
    }

    public final void setDismissAllowed(boolean z) {
        this.dismissAllowed = z;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public void onSlide(View view, float f) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
        this.this$0.onSlide(view, f);
        this.this$0.offset = f;
    }

    @Override // com.google.android.material.bottomsheet.BottomSheetBehavior.BottomSheetCallback
    public void onStateChanged(View view, int i) {
        Intrinsics.checkNotNullParameter(view, "bottomSheet");
        if (i == 2) {
            if (this.this$0.offset > ((float) 0) && this.this$0.offset > this.this$0.dismissOffset) {
                this.dismissAllowed = false;
                BottomSheetBehavior bottomSheetBehavior = this.$it;
                Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior, "it");
                bottomSheetBehavior.setState(3);
            }
        } else if (i == 3) {
            this.dismissAllowed = true;
        } else if (i != 5) {
        } else {
            if (this.dismissAllowed) {
                this.this$0.dismissAllowingStateLoss();
                return;
            }
            BottomSheetBehavior bottomSheetBehavior2 = this.$it;
            Intrinsics.checkNotNullExpressionValue(bottomSheetBehavior2, "it");
            bottomSheetBehavior2.setState(3);
        }
    }
}
