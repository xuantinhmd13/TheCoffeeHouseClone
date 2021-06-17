package com.thecoffeehouse.guestapp.screens.home;

import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.order.trackingorder.TrackingOrderDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderProcessing;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "selectNotification", "", "position", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$initOrdersProcessing$1 extends Lambda implements Function2<Object, Integer, Unit> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$initOrdersProcessing$1(HomeFragment homeFragment) {
        super(2);
        this.this$0 = homeFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Object obj, Integer num) {
        invoke(obj, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Object obj, int i) {
        Intrinsics.checkNotNullParameter(obj, "selectNotification");
        if (obj instanceof OrderProcessing) {
            TrackingOrderDialogFragment newInstance$default = TrackingOrderDialogFragment.Companion.newInstance$default(TrackingOrderDialogFragment.Companion, ((OrderProcessing) obj).getRef(), null, false, 6, null);
            MainActivity mainActivity = this.this$0.getMainActivity();
            if (mainActivity != null) {
                FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
                newInstance$default.show(supportFragmentManager, (String) null);
            }
        }
    }
}
