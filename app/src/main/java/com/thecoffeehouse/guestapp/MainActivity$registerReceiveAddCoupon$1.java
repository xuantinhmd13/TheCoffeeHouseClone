package com.thecoffeehouse.guestapp;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.thecoffeehouse.guestapp.screens.order.OrderFragment;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/MainActivity$registerReceiveAddCoupon$1", "Landroid/content/BroadcastReceiver;", "onReceive", "", "context", "Landroid/content/Context;", "intentNotification", "Landroid/content/Intent;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$registerReceiveAddCoupon$1 extends BroadcastReceiver {
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: Incorrect args count in method signature: ()V */
    MainActivity$registerReceiveAddCoupon$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    public void onReceive(Context context, Intent intent) {
        GeneralKt.log("receive from broadcast + " + intent);
        if ((intent != null && intent.hasExtra(OrderFragment.COUPON_CODE_EXTRA)) || (intent != null && intent.hasExtra(OrderFragment.CAMPAIGN_ID_EXTRA))) {
            String stringExtra = intent.getStringExtra(OrderFragment.COUPON_CODE_EXTRA);
            String stringExtra2 = intent.getStringExtra(OrderFragment.CAMPAIGN_ID_EXTRA);
            boolean booleanExtra = intent.getBooleanExtra(OrderFragment.OVERRIDE_DIRECTLY_EXTRA, false);
            GeneralKt.log("overrideDirectly: " + booleanExtra);
            if (stringExtra != null || stringExtra2 != null) {
                try {
                    MainActivity mainActivity = this.this$0;
                    if (!(mainActivity.isAddedFragmentToContainer(mainActivity.getMOrderFragment()))) {
                        MainActivity mainActivity2 = this.this$0;
                        mainActivity2.addFragmentsToContainers(mainActivity2.getMOrderFragment());
                    }
                    if (booleanExtra) {
                        OrderFragment mOrderFragment = this.this$0.getMOrderFragment();
                        Intrinsics.checkNotNullExpressionValue(stringExtra, FirebaseAnalytics.Param.COUPON);
                        mOrderFragment.updateCouponToOrderFlow(stringExtra);
                        return;
                    }
                    this.this$0.getMOrderFragment().showCouponDetailDialog(stringExtra2, stringExtra);
                } catch (Exception e) {
                    e.printStackTrace();
                    GeneralKt.log(Unit.INSTANCE);
                    this.this$0.getMOrderFragment().setOnInitViewDone(new MainActivity$registerReceiveAddCoupon$1$onReceive$1(this, booleanExtra, stringExtra, stringExtra2));
                }
            }
        }
    }
}
