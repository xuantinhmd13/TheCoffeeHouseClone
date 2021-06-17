package com.thecoffeehouse.guestapp.utility;

import android.app.Activity;
import android.content.Intent;
import com.thecoffeehouse.guestapp.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "deleteSuccessfully", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ContextExts.kt */
public final class ContextExtsKt$clearUserLocalData$1 extends Lambda implements Function1<Boolean, Unit> {
    final /* synthetic */ Activity $activity;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContextExtsKt$clearUserLocalData$1(Activity activity) {
        super(1);
        this.$activity = activity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.INSTANCE;
    }

    public final void invoke(boolean z) {
        GeneralKt.log("delete successfully");
        Activity activity = this.$activity;
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (mainActivity != null) {
            mainActivity.clearMyLocation();
        }
        Intent intent = new Intent(this.$activity, MainActivity.class);
        intent.addFlags(67141632);
        intent.addFlags(65536);
        this.$activity.startActivity(intent);
        this.$activity.finish();
    }
}
