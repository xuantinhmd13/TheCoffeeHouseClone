package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/phonenumber/ConfirmationOTPDialog$enterCodeEditTextListener$4", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ConfirmationOTPDialog.kt */
public final class ConfirmationOTPDialog$enterCodeEditTextListener$4 implements TextWatcher {
    final /* synthetic */ ConfirmationOTPDialog this$0;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    ConfirmationOTPDialog$enterCodeEditTextListener$4(ConfirmationOTPDialog confirmationOTPDialog) {
        this.this$0 = confirmationOTPDialog;
    }

    public void afterTextChanged(Editable editable) {
        GeneralKt.log("edt_enter_code_3: " + String.valueOf(editable));
        if (editable != null) {
            if (editable.length() > 0) {
                ((EditText) this.this$0.findViewById(R.id.edt_enter_code_3)).clearFocus();
                EditText editText = (EditText) this.this$0.findViewById(R.id.edt_enter_code_3);
                Intrinsics.checkNotNullExpressionValue(editText, "edt_enter_code_3");
                editText.setBackgroundTintList(null);
                ((EditText) this.this$0.findViewById(R.id.edt_enter_code_4)).requestFocus();
                EditText editText2 = (EditText) this.this$0.findViewById(R.id.edt_enter_code_4);
                Intrinsics.checkNotNullExpressionValue(editText2, "edt_enter_code_4");
                editText2.setCursorVisible(true);
                return;
            }
            EditText editText3 = (EditText) this.this$0.findViewById(R.id.edt_enter_code_3);
            Intrinsics.checkNotNullExpressionValue(editText3, "edt_enter_code_3");
            editText3.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0.getContext(), R.color.colorF5F5F5)));
        }
    }
}
