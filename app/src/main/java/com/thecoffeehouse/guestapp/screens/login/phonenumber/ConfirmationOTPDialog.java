package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.Window;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import com.thecoffeehouse.guestapp.views.BaseDialog;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0013\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\n¢\u0006\u0002\u0010\u000bJ\u0006\u0010\u0015\u001a\u00020\bJ\b\u0010\u0016\u001a\u00020\bH\u0002J\b\u0010\u0017\u001a\u00020\bH\u0016J\b\u0010\u0018\u001a\u00020\bH\u0002J\b\u0010\u0019\u001a\u00020\bH\u0002J\b\u0010\u001a\u001a\u00020\bH\u0002J\b\u0010\u001b\u001a\u00020\bH\u0002J\u0012\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0014J\u0006\u0010\u001f\u001a\u00020\bJ\u0010\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0005R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R \u0010\u000f\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\b0\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u0013X\u000e¢\u0006\u0004\n\u0002\u0010\u0014¨\u0006\""}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/ConfirmationOTPDialog;", "Lcom/thecoffeehouse/guestapp/views/BaseDialog;", "context", "Landroid/content/Context;", "phoneNumber", "", "onEnterLastCode", "Lkotlin/Function2;", "", "onResendOTP", "Lkotlin/Function0;", "(Landroid/content/Context;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;)V", "mCountDownTimer", "Landroid/os/CountDownTimer;", "mOTP", "mOnEnterLastCode", "mOnResendOTP", "mPhoneNumber", "mTextWatcherEditext6", "com/thecoffeehouse/guestapp/screens/login/phonenumber/ConfirmationOTPDialog$mTextWatcherEditext6$1", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/ConfirmationOTPDialog$mTextWatcherEditext6$1;", "clearOTP", "countDownResendCode", "dismiss", "enterCodeEditTextFocusListener", "enterCodeEditTextListener", "enterLastCode", "initViews", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "resetUI", "setAutoFillCode", "sixDigits", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ConfirmationOTPDialog.kt */
public final class ConfirmationOTPDialog extends BaseDialog {
    private CountDownTimer mCountDownTimer;
    private String mOTP = "";
    private Function2<? super ConfirmationOTPDialog, ? super String, Unit> mOnEnterLastCode;
    private Function0<Unit> mOnResendOTP;
    private String mPhoneNumber;
    private ConfirmationOTPDialog$mTextWatcherEditext6$1 mTextWatcherEditext6;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ConfirmationOTPDialog(Context context, String str, Function2<? super ConfirmationOTPDialog, ? super String, Unit> function2, Function0<Unit> function0) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(str, "phoneNumber");
        Intrinsics.checkNotNullParameter(function2, "onEnterLastCode");
        Intrinsics.checkNotNullParameter(function0, "onResendOTP");
        this.mOnEnterLastCode = function2;
        this.mOnResendOTP = function0;
        this.mTextWatcherEditext6 = new ConfirmationOTPDialog$mTextWatcherEditext6$1(this, context);
        this.mPhoneNumber = str;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.dialog_verify_phone_number);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setLayout(-1, -1);
        }
        setCancelable(false);
        initViews();
    }

    public void dismiss() {
        CountDownTimer countDownTimer = this.mCountDownTimer;
        if (countDownTimer == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCountDownTimer");
        }
        countDownTimer.cancel();
        super.dismiss();
    }

    public final void clearOTP() {
        ((EditText) findViewById(R.id.edt_enter_code_1)).setText("");
        ((EditText) findViewById(R.id.edt_enter_code_2)).setText("");
        ((EditText) findViewById(R.id.edt_enter_code_3)).setText("");
        ((EditText) findViewById(R.id.edt_enter_code_4)).setText("");
        ((EditText) findViewById(R.id.edt_enter_code_5)).setText("");
        ((EditText) findViewById(R.id.edt_enter_code_6)).setText("");
        ((EditText) findViewById(R.id.edt_enter_code_1)).requestFocus();
    }

    private final void countDownResendCode() {
        long j = (long) 180000;
        ConfirmationOTPDialog$countDownResendCode$1 confirmationOTPDialog$countDownResendCode$1 = new ConfirmationOTPDialog$countDownResendCode$1(this, j, j, 1000);
        this.mCountDownTimer = confirmationOTPDialog$countDownResendCode$1;
        if (confirmationOTPDialog$countDownResendCode$1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCountDownTimer");
        }
        confirmationOTPDialog$countDownResendCode$1.start();
    }

    private final void enterCodeEditTextListener() {
        ((EditText) findViewById(R.id.edt_enter_code_1)).requestFocus();
        EditText editText = (EditText) findViewById(R.id.edt_enter_code_1);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_enter_code_1");
        editText.setCursorVisible(true);
        ((EditText) findViewById(R.id.edt_enter_code_1)).addTextChangedListener(new ConfirmationOTPDialog$enterCodeEditTextListener$1(this));
        ((EditText) findViewById(R.id.edt_enter_code_2)).addTextChangedListener(new ConfirmationOTPDialog$enterCodeEditTextListener$2(this));
        ((EditText) findViewById(R.id.edt_enter_code_2)).setOnKeyListener(new ConfirmationOTPDialog$enterCodeEditTextListener$3(this));
        ((EditText) findViewById(R.id.edt_enter_code_3)).addTextChangedListener(new ConfirmationOTPDialog$enterCodeEditTextListener$4(this));
        ((EditText) findViewById(R.id.edt_enter_code_3)).setOnKeyListener(new ConfirmationOTPDialog$enterCodeEditTextListener$5(this));
        ((EditText) findViewById(R.id.edt_enter_code_4)).addTextChangedListener(new ConfirmationOTPDialog$enterCodeEditTextListener$6(this));
        ((EditText) findViewById(R.id.edt_enter_code_4)).setOnKeyListener(new ConfirmationOTPDialog$enterCodeEditTextListener$7(this));
        ((EditText) findViewById(R.id.edt_enter_code_5)).addTextChangedListener(new ConfirmationOTPDialog$enterCodeEditTextListener$8(this));
        ((EditText) findViewById(R.id.edt_enter_code_5)).setOnKeyListener(new ConfirmationOTPDialog$enterCodeEditTextListener$9(this));
        ((EditText) findViewById(R.id.edt_enter_code_6)).addTextChangedListener(this.mTextWatcherEditext6);
        ((EditText) findViewById(R.id.edt_enter_code_6)).setOnKeyListener(new ConfirmationOTPDialog$enterCodeEditTextListener$10(this));
    }

    /* access modifiers changed from: private */
    public final void enterLastCode() {
        StringBuilder sb = new StringBuilder();
        EditText editText = (EditText) findViewById(R.id.edt_enter_code_1);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_enter_code_1");
        StringBuilder append = sb.append(editText.getText().toString());
        EditText editText2 = (EditText) findViewById(R.id.edt_enter_code_2);
        Intrinsics.checkNotNullExpressionValue(editText2, "edt_enter_code_2");
        StringBuilder append2 = append.append(editText2.getText().toString());
        EditText editText3 = (EditText) findViewById(R.id.edt_enter_code_3);
        Intrinsics.checkNotNullExpressionValue(editText3, "edt_enter_code_3");
        StringBuilder append3 = append2.append(editText3.getText().toString());
        EditText editText4 = (EditText) findViewById(R.id.edt_enter_code_4);
        Intrinsics.checkNotNullExpressionValue(editText4, "edt_enter_code_4");
        StringBuilder append4 = append3.append(editText4.getText().toString());
        EditText editText5 = (EditText) findViewById(R.id.edt_enter_code_5);
        Intrinsics.checkNotNullExpressionValue(editText5, "edt_enter_code_5");
        StringBuilder append5 = append4.append(editText5.getText().toString());
        EditText editText6 = (EditText) findViewById(R.id.edt_enter_code_6);
        Intrinsics.checkNotNullExpressionValue(editText6, "edt_enter_code_6");
        String sb2 = append5.append(editText6.getText().toString()).toString();
        this.mOTP = sb2;
        this.mOnEnterLastCode.invoke(this, sb2);
    }

    private final void initViews() {
        EditText editText = (EditText) findViewById(R.id.edt_enter_code_1);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_enter_code_1");
        GeneralKt.forceOpenKeyboard(editText);
        ImageView imageView = (ImageView) findViewById(R.id.img_close);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_close");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ConfirmationOTPDialog$initViews$1(this), 1, null);
        TextView textView = (TextView) findViewById(R.id.txt_confirmation_code_hint);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_confirmation_code_hint");
        textView.setText(getContext().getString(R.string.str_a_code_with_six_digits_is_sent, this.mPhoneNumber));
        enterCodeEditTextListener();
        countDownResendCode();
    }

    private final void enterCodeEditTextFocusListener() {
        ((EditText) findViewById(R.id.edt_enter_code_1)).setOnFocusChangeListener(new ConfirmationOTPDialog$enterCodeEditTextFocusListener$1(this));
        ((EditText) findViewById(R.id.edt_enter_code_2)).setOnFocusChangeListener(new ConfirmationOTPDialog$enterCodeEditTextFocusListener$2(this));
        ((EditText) findViewById(R.id.edt_enter_code_3)).setOnFocusChangeListener(new ConfirmationOTPDialog$enterCodeEditTextFocusListener$3(this));
        ((EditText) findViewById(R.id.edt_enter_code_4)).setOnFocusChangeListener(new ConfirmationOTPDialog$enterCodeEditTextFocusListener$4(this));
        ((EditText) findViewById(R.id.edt_enter_code_5)).setOnFocusChangeListener(new ConfirmationOTPDialog$enterCodeEditTextFocusListener$5(this));
    }

    public final void resetUI() {
        clearOTP();
        countDownResendCode();
    }

    public final void setAutoFillCode(String str) {
        if (str != null && str.length() == 6) {
            this.mOTP = str;
            this.mOnEnterLastCode.invoke(this, str);
            ((EditText) findViewById(R.id.edt_enter_code_1)).setText(String.valueOf(str.charAt(0)));
            ((EditText) findViewById(R.id.edt_enter_code_2)).setText(String.valueOf(str.charAt(1)));
            ((EditText) findViewById(R.id.edt_enter_code_3)).setText(String.valueOf(str.charAt(2)));
            ((EditText) findViewById(R.id.edt_enter_code_4)).setText(String.valueOf(str.charAt(3)));
            ((EditText) findViewById(R.id.edt_enter_code_5)).setText(String.valueOf(str.charAt(4)));
            ((EditText) findViewById(R.id.edt_enter_code_6)).removeTextChangedListener(this.mTextWatcherEditext6);
            ((EditText) findViewById(R.id.edt_enter_code_6)).setText(String.valueOf(str.charAt(5)));
            ((EditText) findViewById(R.id.edt_enter_code_6)).addTextChangedListener(this.mTextWatcherEditext6);
        }
    }
}
