package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "hasFocus", "", "onFocusChange"}, k = 3, mv = {1, 4, 0})
/* compiled from: ConfirmationOTPDialog.kt */
final class ConfirmationOTPDialog$enterCodeEditTextFocusListener$3 implements View.OnFocusChangeListener {
    final /* synthetic */ ConfirmationOTPDialog this$0;

    ConfirmationOTPDialog$enterCodeEditTextFocusListener$3(ConfirmationOTPDialog confirmationOTPDialog) {
        this.this$0 = confirmationOTPDialog;
    }

    public final void onFocusChange(View view, boolean z) {
        if (z) {
            ((EditText) this.this$0.findViewById(R.id.edt_enter_code_4)).setText("");
            ((EditText) this.this$0.findViewById(R.id.edt_enter_code_5)).setText("");
            ((EditText) this.this$0.findViewById(R.id.edt_enter_code_6)).setText("");
        }
    }
}
