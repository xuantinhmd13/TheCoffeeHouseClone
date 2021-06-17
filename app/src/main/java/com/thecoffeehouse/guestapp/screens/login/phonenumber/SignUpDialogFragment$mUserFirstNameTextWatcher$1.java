package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.content.res.ColorStateList;
import android.text.Editable;
import android.text.TextWatcher;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment$mUserFirstNameTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SignUpDialogFragment.kt */
public final class SignUpDialogFragment$mUserFirstNameTextWatcher$1 implements TextWatcher {
    final /* synthetic */ SignUpDialogFragment this$0;

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    SignUpDialogFragment$mUserFirstNameTextWatcher$1(SignUpDialogFragment signUpDialogFragment) {
        this.this$0 = signUpDialogFragment;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String valueOf = String.valueOf(charSequence);
        if ((valueOf.length() == 0) || StringsKt.isBlank(valueOf)) {
            TLButton tLButton = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_update);
            Intrinsics.checkNotNullExpressionValue(tLButton, "btn_update");
            tLButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0.requireContext(), R.color.colorE3E3E3)));
            TLButton tLButton2 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_update);
            Intrinsics.checkNotNullExpressionValue(tLButton2, "btn_update");
            tLButton2.setEnabled(false);
            return;
        }
        TLButton tLButton3 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton3, "btn_update");
        tLButton3.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0.requireContext(), R.color.colorC5671B)));
        TLButton tLButton4 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_update);
        Intrinsics.checkNotNullExpressionValue(tLButton4, "btn_update");
        tLButton4.setEnabled(true);
    }
}
