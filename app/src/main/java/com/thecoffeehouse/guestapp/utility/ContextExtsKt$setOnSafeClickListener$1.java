package com.thecoffeehouse.guestapp.utility;

import android.os.SystemClock;
import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: ContextExts.kt */
public final class ContextExtsKt$setOnSafeClickListener$1 implements View.OnClickListener {
    final /* synthetic */ long $defaultInterval;
    final /* synthetic */ Ref.LongRef $lastTimeClicked;
    final /* synthetic */ Function1 $onClickListener;

    ContextExtsKt$setOnSafeClickListener$1(long j, Ref.LongRef longRef, Function1 function1) {
        this.$defaultInterval = j;
        this.$lastTimeClicked = longRef;
        this.$onClickListener = function1;
    }

    public final void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.$lastTimeClicked.element >= this.$defaultInterval) {
            this.$lastTimeClicked.element = SystemClock.elapsedRealtime();
            Function1 function1 = this.$onClickListener;
            Intrinsics.checkNotNullExpressionValue(view, "it");
            function1.invoke(view);
        }
    }
}
