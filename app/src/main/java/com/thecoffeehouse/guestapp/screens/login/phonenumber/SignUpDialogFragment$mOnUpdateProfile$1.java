package com.thecoffeehouse.guestapp.screens.login.phonenumber;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "dialog", "Lcom/thecoffeehouse/guestapp/screens/login/phonenumber/SignUpDialogFragment;", "str", "", "str1", "str2", "int", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SignUpDialogFragment.kt */
public final class SignUpDialogFragment$mOnUpdateProfile$1 extends Lambda implements Function5<SignUpDialogFragment, String, String, String, Integer, Unit> {
    public static final SignUpDialogFragment$mOnUpdateProfile$1 INSTANCE = new SignUpDialogFragment$mOnUpdateProfile$1();

    SignUpDialogFragment$mOnUpdateProfile$1() {
        super(5);
    }

    public final void invoke(SignUpDialogFragment signUpDialogFragment, String str, String str2, String str3, int i) {
        Intrinsics.checkNotNullParameter(signUpDialogFragment, "dialog");
        Intrinsics.checkNotNullParameter(str, "str");
        Intrinsics.checkNotNullParameter(str2, "str1");
        Intrinsics.checkNotNullParameter(str3, "str2");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function5
    public /* bridge */ /* synthetic */ Unit invoke(SignUpDialogFragment signUpDialogFragment, String str, String str2, String str3, Integer num) {
        invoke(signUpDialogFragment, str, str2, str3, num.intValue());
        return Unit.INSTANCE;
    }
}
