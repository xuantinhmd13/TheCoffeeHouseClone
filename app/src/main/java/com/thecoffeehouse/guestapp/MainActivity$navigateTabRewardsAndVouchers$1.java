package com.thecoffeehouse.guestapp;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$navigateTabRewardsAndVouchers$1 implements Runnable {
    final /* synthetic */ Uri $url;
    final /* synthetic */ MainActivity this$0;

    MainActivity$navigateTabRewardsAndVouchers$1(MainActivity mainActivity, Uri uri) {
        this.this$0 = mainActivity;
        this.$url = uri;
    }

    public final void run() {
        try {
            this.this$0.switchTabInRewardsAndVouchers(this.$url);
        } catch (Exception unused) {
            this.this$0.getMRewardsAndCouponsFragment().setOnInitViewDone(new Function0<Unit>(this) {
                /* class com.thecoffeehouse.guestapp.MainActivity$navigateTabRewardsAndVouchers$1.AnonymousClass1 */
                final /* synthetic */ MainActivity$navigateTabRewardsAndVouchers$1 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    this.this$0.this$0.switchTabInRewardsAndVouchers(this.this$0.$url);
                }
            });
        }
    }
}
