package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.os.CountDownTimer;
import android.text.Html;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u0016¨\u0006\u0007"}, d2 = {"com/thecoffeehouse/guestapp/screens/login/phonenumber/ConfirmationOTPDialog$countDownResendCode$1", "Landroid/os/CountDownTimer;", "onFinish", "", "onTick", "millisUntilFinished", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ConfirmationOTPDialog.kt */
public final class ConfirmationOTPDialog$countDownResendCode$1 extends CountDownTimer {
    final /* synthetic */ long $countTime;
    final /* synthetic */ ConfirmationOTPDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ConfirmationOTPDialog$countDownResendCode$1(ConfirmationOTPDialog confirmationOTPDialog, long j, long j2, long j3) {
        super(j2, j3);
        this.this$0 = confirmationOTPDialog;
        this.$countTime = j;
    }

    public void onTick(long j) {
        String ToFormat = StringDateUtilsKt.ToFormat(new Date(j), "mm:ss");
        TextView textView = (TextView) this.this$0.findViewById(R.id.txt_resend_code);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_resend_code");
        textView.setText(Html.fromHtml(this.this$0.getContext().getString(R.string.str_did_receive_the_code_resend, ToFormat), 0));
    }

    public void onFinish() {
        TextView textView = (TextView) this.this$0.findViewById(R.id.txt_resend_code);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_resend_code");
        textView.setText(Html.fromHtml(this.this$0.getContext().getString(R.string.str_did_receive_the_code_resend_enable), 0));
        TextView textView2 = (TextView) this.this$0.findViewById(R.id.txt_resend_code);
        Intrinsics.checkNotNullExpressionValue(textView2, "txt_resend_code");
        textView2.setEnabled(true);
        TextView textView3 = (TextView) this.this$0.findViewById(R.id.txt_resend_code);
        Intrinsics.checkNotNullExpressionValue(textView3, "txt_resend_code");
        ContextExtsKt.setOnSafeClickListener$default(textView3, 0, new ConfirmationOTPDialog$countDownResendCode$1$onFinish$1(this), 1, null);
    }
}
