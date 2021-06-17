package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: VerifyPhoneDialog.kt */
public final class VerifyPhoneDialog$listenViews$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ VerifyPhoneDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    VerifyPhoneDialog$listenViews$2(VerifyPhoneDialog verifyPhoneDialog) {
        super(1);
        this.this$0 = verifyPhoneDialog;
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
        EditText editText = (EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_phone_number");
        String obj = editText.getText().toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        this.this$0.mOnUpdatePhoneNumber.invoke(StringsKt.trim((CharSequence) obj).toString(), "+84");
        this.this$0.dismiss();
    }
}
