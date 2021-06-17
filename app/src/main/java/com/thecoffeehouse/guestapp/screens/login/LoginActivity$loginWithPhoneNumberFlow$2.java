package com.thecoffeehouse.guestapp.screens.login;

import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginActivity.kt */
public final class LoginActivity$loginWithPhoneNumberFlow$2 extends Lambda implements Function0<Unit> {
    final /* synthetic */ LoginActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    LoginActivity$loginWithPhoneNumberFlow$2(LoginActivity loginActivity) {
        super(0);
        this.this$0 = loginActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        ((EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number)).requestFocus();
        EditText editText = (EditText) this.this$0._$_findCachedViewById(R.id.edt_phone_number);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_phone_number");
        GeneralKt.forceOpenKeyboard(editText);
    }
}
