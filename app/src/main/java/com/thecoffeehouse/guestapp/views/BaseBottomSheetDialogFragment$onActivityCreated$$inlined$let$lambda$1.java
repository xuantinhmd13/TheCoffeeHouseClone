package com.thecoffeehouse.guestapp.views;

import android.content.DialogInterface;
import android.view.KeyEvent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "dialog", "Landroid/content/DialogInterface;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey", "com/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$onActivityCreated$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseBottomSheetDialogFragment.kt */
final class BaseBottomSheetDialogFragment$onActivityCreated$$inlined$let$lambda$1 implements DialogInterface.OnKeyListener {
    final /* synthetic */ BaseBottomSheetDialogFragment this$0;

    BaseBottomSheetDialogFragment$onActivityCreated$$inlined$let$lambda$1(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment) {
        this.this$0 = baseBottomSheetDialogFragment;
    }

    public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
        if (i != 4) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(keyEvent, "event");
        if (keyEvent.getAction() != 1) {
            return false;
        }
        this.this$0.onBackPress();
        return true;
    }
}
