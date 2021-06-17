package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.app.DatePickerDialog;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SignUpDialogFragment.kt */
public final class SignUpDialogFragment$listenViews$3 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ SignUpDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SignUpDialogFragment$listenViews$3(SignUpDialogFragment signUpDialogFragment) {
        super(1);
        this.this$0 = signUpDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        DatePickerDialog datePickerDialog = new DatePickerDialog(this.this$0.requireContext());
        datePickerDialog.setOnDateSetListener(new DatePickerDialog.OnDateSetListener(this) {
            /* class com.thecoffeehouse.guestapp.screens.login.phonenumber.SignUpDialogFragment$listenViews$3.AnonymousClass1 */
            final /* synthetic */ SignUpDialogFragment$listenViews$3 this$0;

            {
                this.this$0 = r1;
            }

            public final void onDateSet(DatePicker datePicker, int i, int i2, int i3) {
                GeneralKt.log(Integer.valueOf(i));
                GeneralKt.log(Integer.valueOf(i2));
                GeneralKt.log(Integer.valueOf(i3));
                ((EditText) this.this$0.this$0._$_findCachedViewById(R.id.edt_user_birthday)).setText(new StringBuilder().append(i3).append('/').append(i2 + 1).append('/').append(i).toString());
            }
        });
        datePickerDialog.show();
    }
}
