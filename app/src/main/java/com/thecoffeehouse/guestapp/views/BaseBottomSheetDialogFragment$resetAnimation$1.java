package com.thecoffeehouse.guestapp.views;

import android.app.Dialog;
import android.view.Window;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseBottomSheetDialogFragment.kt */
public final class BaseBottomSheetDialogFragment$resetAnimation$1 implements Runnable {
    final /* synthetic */ BaseBottomSheetDialogFragment this$0;

    BaseBottomSheetDialogFragment$resetAnimation$1(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        this.this$0 = baseBottomSheetDialogFragment;
    }

    public final void run() {
        Window window;
        Dialog dialog = this.this$0.getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setWindowAnimations(R.style.BottomSheetAnimation);
        }
    }
}
