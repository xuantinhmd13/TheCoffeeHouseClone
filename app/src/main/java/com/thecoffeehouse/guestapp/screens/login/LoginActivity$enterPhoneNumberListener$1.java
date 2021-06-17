package com.thecoffeehouse.guestapp.screens.login;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.widget.EditText;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.TLButton;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "v", "Landroid/view/View;", "kotlin.jvm.PlatformType", "event", "Landroid/view/MotionEvent;", "onTouch"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$enterPhoneNumberListener$1 implements View.OnTouchListener {
    final /* synthetic */ LoginActivity this$0;

    LoginActivity$enterPhoneNumberListener$1(LoginActivity loginActivity) {
        this.this$0 = loginActivity;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        Intrinsics.checkNotNullExpressionValue(motionEvent, "event");
        if (motionEvent.getAction() == 1) {
            EditText editText = (EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number);
            Intrinsics.checkNotNullExpressionValue(editText, "edt_phone_number");
            if (editText.getCompoundDrawables()[2] != null) {
                float rawX = motionEvent.getRawX();
                EditText editText2 = (EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number);
                Intrinsics.checkNotNullExpressionValue(editText2, "edt_phone_number");
                int right = editText2.getRight();
                EditText editText3 = (EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number);
                Intrinsics.checkNotNullExpressionValue(editText3, "edt_phone_number");
                Drawable drawable = editText3.getCompoundDrawables()[2];
                Intrinsics.checkNotNullExpressionValue(drawable, "edt_phone_number.compoundDrawables[DRAWABLE_RIGHT]");
                if (rawX >= ((float) (right - drawable.getBounds().width()))) {
                    GeneralKt.log("clicked");
                    ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).removeTextChangedListener(this.this$0.mPhoneNumberTextWatcher);
                    ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).setText("");
                    ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
                    TLButton tLButton = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
                    Intrinsics.checkNotNullExpressionValue(tLButton, "btn_verify_phone_number");
                    tLButton.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(this.this$0, R.color.colorBBBBBB)));
                    ConstraintLayout constraintLayout = (ConstraintLayout) this.this$0._$_findCachedViewById(R.id.layout_input_phone_number);
                    Intrinsics.checkNotNullExpressionValue(constraintLayout, "layout_input_phone_number");
                    constraintLayout.setBackground(ContextCompat.getDrawable(this.this$0, R.drawable.background_corner_stroke_light_gray));
                    TLButton tLButton2 = (TLButton) this.this$0._$_findCachedViewById(R.id.btn_verify_phone_number);
                    Intrinsics.checkNotNullExpressionValue(tLButton2, "btn_verify_phone_number");
                    tLButton2.setEnabled(false);
                    ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).addTextChangedListener(this.this$0.mPhoneNumberTextWatcher);
                    ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).requestFocus();
                    return true;
                }
            }
        }
        return false;
    }
}
