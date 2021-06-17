package com.thecoffeehouse.guestapp.views;

import android.content.Context;
import android.os.Handler;
import androidx.appcompat.app.AlertDialog;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010\f\u001a\u00020\u0001J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001R\u001e\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0006j\b\u0012\u0004\u0012\u00020\u0001`\u0007X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tXD¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/views/BaseAlertDialog;", "Landroidx/appcompat/app/AlertDialog;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "alertDialogs", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "mQueryDelayTime", "", "mQueryHandler", "Landroid/os/Handler;", "getDialog", "show", "", "alertDialog", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseAlertDialog.kt */
public final class BaseAlertDialog extends AlertDialog {
    private final ArrayList<AlertDialog> alertDialogs = new ArrayList<>();
    private final long mQueryDelayTime = 500;
    private Handler mQueryHandler = new Handler();

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseAlertDialog(Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public final void show(AlertDialog alertDialog) {
        Intrinsics.checkNotNullParameter(alertDialog, "alertDialog");
        this.alertDialogs.add(alertDialog);
        this.mQueryHandler.removeCallbacksAndMessages(null);
        this.mQueryHandler.postDelayed(new BaseAlertDialog$show$1(this), this.mQueryDelayTime);
    }

    public final AlertDialog getDialog() {
        return (AlertDialog) CollectionsKt.last((List) this.alertDialogs);
    }
}
