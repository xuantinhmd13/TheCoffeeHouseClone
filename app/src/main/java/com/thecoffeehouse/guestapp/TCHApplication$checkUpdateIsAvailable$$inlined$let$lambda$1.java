package com.thecoffeehouse.guestapp;

import android.app.Activity;
import android.view.View;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005¨\u0006\u0006"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick", "com/thecoffeehouse/guestapp/TCHApplication$checkUpdateIsAvailable$2$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: TCHApplication.kt */
public final class TCHApplication$checkUpdateIsAvailable$$inlined$let$lambda$1 implements View.OnClickListener {
    final /* synthetic */ TCHApplication this$0;

    TCHApplication$checkUpdateIsAvailable$$inlined$let$lambda$1(TCHApplication tCHApplication) {
        this.this$0 = tCHApplication;
    }

    public final void onClick(View view) {
        Activity currentActivity = this.this$0.getCurrentActivity();
        if (currentActivity != null) {
            ContextExtsKt.openGooglePlayStoreByUrl(currentActivity, BuildConfig.APPLICATION_ID);
        }
    }
}
