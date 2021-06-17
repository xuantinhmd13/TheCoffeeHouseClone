package com.thecoffeehouse.guestapp;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import vn.zalopay.sdk.responses.PaymentResponse;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
final class MainActivity$navigateTabOrderWithMethod$2$onFragmentResumed$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MainActivity$navigateTabOrderWithMethod$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$navigateTabOrderWithMethod$2$onFragmentResumed$1(MainActivity$navigateTabOrderWithMethod$2 mainActivity$navigateTabOrderWithMethod$2) {
        super(0);
        this.this$0 = mainActivity$navigateTabOrderWithMethod$2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        GeneralKt.log("initData Done");
        String queryParameter = this.this$0.$url.getQueryParameter(FirebaseAnalytics.Param.METHOD);
        String queryParameter2 = this.this$0.$url.getQueryParameter("sid");
        Integer intOrNull = queryParameter2 != null ? StringsKt.toIntOrNull(queryParameter2) : null;
        String queryParameter3 = this.this$0.$url.getQueryParameter(PaymentResponse.RETURN_CODE);
        if (queryParameter != null) {
            this.this$0.this$0.selectShippingMethod(queryParameter, intOrNull, queryParameter3);
        }
    }
}
