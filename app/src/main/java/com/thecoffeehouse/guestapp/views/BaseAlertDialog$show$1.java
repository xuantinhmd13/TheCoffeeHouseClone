package com.thecoffeehouse.guestapp.views;

import android.app.Activity;
import android.content.Context;
import android.view.ContextThemeWrapper;
import androidx.appcompat.app.AlertDialog;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseAlertDialog.kt */
public final class BaseAlertDialog$show$1 implements Runnable {
    final /* synthetic */ BaseAlertDialog this$0;

    BaseAlertDialog$show$1(BaseAlertDialog baseAlertDialog) {
        this.this$0 = baseAlertDialog;
    }

    public final void run() {
        try {
            Context context = this.this$0.getContext();
            if (context != null) {
                Context baseContext = ((ContextThemeWrapper) context).getBaseContext();
                if (baseContext != null) {
                    Activity activity = (Activity) baseContext;
                    if (!this.this$0.alertDialogs.isEmpty()) {
                        if (!activity.isFinishing()) {
                            ((AlertDialog) CollectionsKt.last((List) this.this$0.alertDialogs)).show();
                        }
                        this.this$0.alertDialogs.clear();
                        return;
                    }
                    return;
                }
                throw new NullPointerException("null cannot be cast to non-null type android.app.Activity");
            }
            throw new NullPointerException("null cannot be cast to non-null type android.view.ContextThemeWrapper");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
