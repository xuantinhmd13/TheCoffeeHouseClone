package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.thecoffeehouse.guestapp.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsFragment$initGuestUI$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardsFragment.kt */
final class RewardsFragment$initGuestUI$$inlined$apply$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ RewardsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardsFragment$initGuestUI$$inlined$apply$lambda$1(RewardsFragment rewardsFragment) {
        super(1);
        this.this$0 = rewardsFragment;
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
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (mainActivity != null) {
            mainActivity.runFlowLogin(RewardsFragment$initGuestUI$1$1$1.INSTANCE);
        }
    }
}