package com.thecoffeehouse.guestapp.screens.login;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.TLButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J*\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0016J*\u0010\f\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0016¨\u0006\u000e"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/LoginActivity$mPhoneNumberTextWatcher$1", "Landroid/text/TextWatcher;", "afterTextChanged", "", "s", "Landroid/text/Editable;", "beforeTextChanged", "", "start", "", "count", "after", "onTextChanged", "before", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$mPhoneNumberTextWatcher$1 implements TextWatcher {
    final /* synthetic */ LoginActivity this$0;

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* JADX WARN: Incorrect args count in method signature: ()V */
    LoginActivity$mPhoneNumberTextWatcher$1(LoginActivity loginActivity) {
        this.this$0 = loginActivity;
    }

    public void afterTextChanged(Editable editable) {
        if (!(this.this$0.isValidPhoneNumber(String.valueOf(editable)))) {
            ConstraintLayout constraintLayout = (ConstraintLayout) this.this$0._$_findCachedViewById(R.id.layout_input_phone_number);
            Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_input_phone_number");
            constraintLayout.setBackground(ContextCompat.getDrawable(this.this$0, R.drawable.background_corner_stroke_light_gray));
            ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
            TLButton tLButton = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
            Intrinsics.checkNotNullExpressionValue(tLButton, "btn_verify_phone_number");
            tLButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0, R.color.colorBBBBBB)));
            TLButton tLButton2 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
            Intrinsics.checkNotNullExpressionValue(tLButton2, "btn_verify_phone_number");
            tLButton2.setEnabled(false);
            return;
        }
        ConstraintLayout constraintLayout2 = (ConstraintLayout) this.this$0._$_findCachedViewById(R.id.layout_input_phone_number);
        Intrinsics.checkNotNullExpressionValue(constraintLayout2, "layout_input_phone_number");
        constraintLayout2.setBackground(ContextCompat.getDrawable(this.this$0, R.drawable.background_corner_stroke_dark_gray));
        ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(this.this$0.getApplicationContext(), R.drawable.ic_close_search), (Drawable) null);
        TLButton tLButton3 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
        Intrinsics.checkNotNullExpressionValue(tLButton3, "btn_verify_phone_number");
        tLButton3.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0, R.color.colorC5671B)));
        TLButton tLButton4 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
        Intrinsics.checkNotNullExpressionValue(tLButton4, "btn_verify_phone_number");
        tLButton4.setEnabled(true);
    }
}
