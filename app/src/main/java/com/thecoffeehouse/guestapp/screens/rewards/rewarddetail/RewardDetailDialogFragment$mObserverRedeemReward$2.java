package com.thecoffeehouse.guestapp.screens.rewards.rewarddetail;

import android.view.View;
import android.widget.ProgressBar;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerError;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardDetailDialogFragment.kt */
public final class RewardDetailDialogFragment$mObserverRedeemReward$2 extends Lambda implements Function1<ServerErrorResponse, Unit> {
    final /* synthetic */ RewardDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardDetailDialogFragment$mObserverRedeemReward$2(RewardDetailDialogFragment rewardDetailDialogFragment) {
        super(1);
        this.this$0 = rewardDetailDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServerErrorResponse serverErrorResponse) {
        invoke(serverErrorResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(ServerErrorResponse serverErrorResponse) {
        ProgressBar progressBar;
        TLTextView tLTextView;
        Intrinsics.checkNotNullParameter(serverErrorResponse, "it");
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            MainActivity mainActivity2 = mainActivity;
            ServerError error = serverErrorResponse.getError();
            ContextExtsKt.showOneButtonAlertDialog$default(mainActivity2, "", String.valueOf(error != null ? error.getMessage() : null), null, false, null, 28, null);
        }
        View view = this.this$0.getRootView();
        if (!(view == null || (tLTextView = (TLTextView) view.findViewById(R.id.btn_redeem)) == null)) {
            tLTextView.setVisibility(0);
        }
        View view2 = this.this$0.getRootView();
        if (view2 != null && (progressBar = (ProgressBar) view2.findViewById(R.id.progress_bar_loading)) != null) {
            progressBar.setVisibility(4);
        }
    }
}
