package com.thecoffeehouse.guestapp;

import com.google.android.gms.tasks.OnFailureListener;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "e", "Ljava/lang/Exception;", "onFailure"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
final class MainActivity$handleAppLinks$2 implements OnFailureListener {
    public static final MainActivity$handleAppLinks$2 INSTANCE = new MainActivity$handleAppLinks$2();

    MainActivity$handleAppLinks$2() {
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "e");
        GeneralKt.log(exc);
    }
}
