package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import androidx.activity.result.ActivityResultCallback;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0010$\n\u0000\u0010\u0000\u001a\u00020\u00012F\u0010\u0002\u001aB\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006 \u0005* \u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00040\u0004\u0012\f\u0012\n \u0005*\u0004\u0018\u00010\u00060\u0006\u0018\u00010\u00070\u0003H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "result", "", "", "kotlin.jvm.PlatformType", "", "", "onActivityResult"}, k = 3, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailDialogFragment.kt */
public final class RatingOrderDetailDialogFragment$requestMediaStorePermission$requestPermission$1<O> implements ActivityResultCallback<Map<String, Boolean>> {
    final /* synthetic */ Function1 $onCompleted;

    RatingOrderDetailDialogFragment$requestMediaStorePermission$requestPermission$1(Function1 function1) {
        this.$onCompleted = function1;
    }

    public final void onActivityResult(Map<String, Boolean> map) {
        this.$onCompleted.invoke(Boolean.valueOf(Intrinsics.areEqual((Object) map.get("android.permission.READ_EXTERNAL_STORAGE"), (Object) true)));
    }
}
