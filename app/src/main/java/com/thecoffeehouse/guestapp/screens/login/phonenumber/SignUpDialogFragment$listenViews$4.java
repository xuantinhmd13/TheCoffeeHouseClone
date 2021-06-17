package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import android.view.View;
import android.widget.EditText;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.utility.StringDateUtilsKt;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SignUpDialogFragment.kt */
public final class SignUpDialogFragment$listenViews$4 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ SignUpDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SignUpDialogFragment$listenViews$4(SignUpDialogFragment signUpDialogFragment) {
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
        EditText editText = (EditText) this.this$0._$_findCachedViewById(R.id.edt_user_first_name);
        Intrinsics.checkNotNullExpressionValue(editText, "edt_user_first_name");
        String obj = editText.getText().toString();
        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj2 = StringsKt.trim((CharSequence) obj).toString();
        EditText editText2 = (EditText) this.this$0._$_findCachedViewById(R.id.edt_user_last_name);
        Intrinsics.checkNotNullExpressionValue(editText2, "edt_user_last_name");
        String obj3 = editText2.getText().toString();
        Objects.requireNonNull(obj3, "null cannot be cast to non-null type kotlin.CharSequence");
        String obj4 = StringsKt.trim((CharSequence) obj3).toString();
        EditText editText3 = (EditText) this.this$0._$_findCachedViewById(R.id.edt_user_birthday);
        Intrinsics.checkNotNullExpressionValue(editText3, "edt_user_birthday");
        String TimeFormatToFormat = StringDateUtilsKt.TimeFormatToFormat(editText3.getText().toString(), StringDateUtilsKt.DF_dd_MM_YYYY, StringDateUtilsKt.DF_SERVER_FORMAT);
        Function5 function5 = this.this$0.mOnUpdateProfile;
        SignUpDialogFragment signUpDialogFragment = this.this$0;
        function5.invoke(signUpDialogFragment, obj2, obj4, TimeFormatToFormat, Integer.valueOf(signUpDialogFragment.mGender));
    }
}
