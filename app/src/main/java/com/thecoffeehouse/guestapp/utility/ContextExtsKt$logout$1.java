package com.thecoffeehouse.guestapp.utility;

import android.app.Activity;
import android.os.Handler;
import android.widget.Toast;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: ContextExts.kt */
public final class ContextExtsKt$logout$1 implements Runnable {
    final /* synthetic */ TCHApplication $tchApplication;
    final /* synthetic */ Activity $this_logout;
    final /* synthetic */ boolean $tokenIsExpired;

    ContextExtsKt$logout$1(Activity activity, boolean z, TCHApplication tCHApplication) {
        this.$this_logout = activity;
        this.$tokenIsExpired = z;
        this.$tchApplication = tCHApplication;
    }

    public final void run() {
        if (this.$tokenIsExpired) {
            if (ContextExtsKt.toastLogout == null) {
                Activity activity = this.$this_logout;
                Toast makeText = Toast.makeText(activity, activity.getString(R.string.str_please_login_to_continue), 0);
                Intrinsics.checkNotNullExpressionValue(makeText, "Toast.makeText(\n        …H_SHORT\n                )");
                ContextExtsKt.toastLogout = makeText;
            }
            if (!ContextExtsKt.isShowingToast.get()) {
                ContextExtsKt.isShowingToast.set(false);
                ContextExtsKt.access$getToastLogout$p().show();
                new Handler().postDelayed(AnonymousClass2.INSTANCE, 2000);
            }
            ContextExtsKt.clearUserLocalData(this.$this_logout, this.$tchApplication);
            return;
        }
        ContextExtsKt.signOut(this.$tchApplication, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.utility.ContextExtsKt$logout$1.AnonymousClass3 */
            final /* synthetic */ ContextExtsKt$logout$1 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                ContextExtsKt.clearUserLocalData(this.this$0.$this_logout, this.this$0.$tchApplication);
            }
        });
    }
}
