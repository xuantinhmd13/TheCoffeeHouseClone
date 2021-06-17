package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.view.KeyEvent;
import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n \u0004*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "keyCode", "", "event", "Landroid/view/KeyEvent;", "onKey"}, k = 3, mv = {1, 4, 0})
/* compiled from: ConfirmationOTPDialog.kt */
public final class ConfirmationOTPDialog$enterCodeEditTextListener$9 implements View.OnKeyListener {
    final /* synthetic */ ConfirmationOTPDialog this$0;

    ConfirmationOTPDialog$enterCodeEditTextListener$9(ConfirmationOTPDialog confirmationOTPDialog) {
        this.this$0 = confirmationOTPDialog;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        Intrinsics.checkNotNullExpressionValue(keyEvent, "event");
        if (keyEvent.getAction() != 0 || i != 67) {
            return false;
        }
        ((EditText) this.this$0.findViewById(R.id.edt_enter_code_4)).requestFocus();
        return false;
    }
}
