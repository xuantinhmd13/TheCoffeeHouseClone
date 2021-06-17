package com.thecoffeehouse.guestapp.screens.login;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u0005\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: LoginViewModel.kt */
public final class LoginViewModel$encryptedOTP$hashedOTPString$1 extends Lambda implements Function1<Byte, CharSequence> {
    public static final LoginViewModel$encryptedOTP$hashedOTPString$1 INSTANCE = new LoginViewModel$encryptedOTP$hashedOTPString$1();

    LoginViewModel$encryptedOTP$hashedOTPString$1() {
        super(1);
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ CharSequence invoke(Byte b) {
        return invoke(b.byteValue());
    }

    public final CharSequence invoke(byte b) {
        String format = String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "java.lang.String.format(this, *args)");
        return format;
    }
}
