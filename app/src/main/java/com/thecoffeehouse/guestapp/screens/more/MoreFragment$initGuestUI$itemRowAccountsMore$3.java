package com.thecoffeehouse.guestapp.screens.more;

import androidx.fragment.app.FragmentActivity;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.TCHApplication;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MoreFragment.kt */
public final class MoreFragment$initGuestUI$itemRowAccountsMore$3 extends Lambda implements Function0<Unit> {
    final /* synthetic */ MoreFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MoreFragment$initGuestUI$itemRowAccountsMore$3(MoreFragment moreFragment) {
        super(0);
        this.this$0 = moreFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        ClientManager requireClientManager;
        TCHApplication tCHApplication = this.this$0.requireTCHApplication();
        if (tCHApplication == null || (requireClientManager = tCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            FragmentActivity activity = this.this$0.getActivity();
            if (!(activity instanceof MainActivity)) {
                activity = null;
            }
            MainActivity mainActivity = (MainActivity) activity;
            if (mainActivity != null) {
                mainActivity.runFlowLogin(AnonymousClass1.INSTANCE);
                return;
            }
            return;
        }
        this.this$0.showLogoutDialog();
    }
}
