package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.screens.home.GuideUserOrderAtTableDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ScanQRActivity.kt */
final class ScanQRActivity$onCreate$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ ScanQRActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScanQRActivity$onCreate$1(ScanQRActivity scanQRActivity) {
        super(1);
        this.this$0 = scanQRActivity;
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
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = (T) null;
        objectRef.element = (T) GuideUserOrderAtTableDialogFragment.Companion.newInstance(new Function0<Unit>() {
            /* class com.thecoffeehouse.guestapp.screens.rewards.coupons.ScanQRActivity$onCreate$1.AnonymousClass1 */

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                T t = objectRef.element;
                if (t != null) {
                    t.dismiss();
                }
            }
        });
        FragmentManager supportFragmentManager = this.this$0.getSupportFragmentManager();
        Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "supportFragmentManager");
        objectRef.element.show(supportFragmentManager, null);
    }
}
