package com.thecoffeehouse.guestapp.screens.base;

import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006¨\u0006\u0007"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/base/BaseSubScreenActivity$initToolbar$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseSubScreenActivity.kt */
final class BaseSubScreenActivity$initToolbar$$inlined$let$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Integer $toolbar$inlined;
    final /* synthetic */ BaseSubScreenActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseSubScreenActivity$initToolbar$$inlined$let$lambda$1(BaseSubScreenActivity baseSubScreenActivity, Integer num) {
        super(1);
        this.this$0 = baseSubScreenActivity;
        this.$toolbar$inlined = num;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        Intrinsics.checkNotNullParameter(view, "it");
        this.this$0.onBackPressed();
    }
}
