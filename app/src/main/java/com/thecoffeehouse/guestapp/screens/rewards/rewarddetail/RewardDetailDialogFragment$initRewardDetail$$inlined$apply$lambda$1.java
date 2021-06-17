package com.thecoffeehouse.guestapp.screens.rewards.rewarddetail;

import android.view.View;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentActivity;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/screens/rewards/rewarddetail/RewardDetailDialogFragment$initRewardDetail$2$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardDetailDialogFragment.kt */
public final class RewardDetailDialogFragment$initRewardDetail$$inlined$apply$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ RewardDetailResponse $data$inlined;
    final /* synthetic */ View $this_apply;
    final /* synthetic */ RewardDetailDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RewardDetailDialogFragment$initRewardDetail$$inlined$apply$lambda$1(View view, RewardDetailDialogFragment rewardDetailDialogFragment, RewardDetailResponse rewardDetailResponse) {
        super(1);
        this.$this_apply = view;
        this.this$0 = rewardDetailDialogFragment;
        this.$data$inlined = rewardDetailResponse;
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
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            String string = mainActivity.getString(R.string.str_confirm_title_dialog);
            Intrinsics.checkNotNullExpressionValue(string, "it1.getString(R.string.str_confirm_title_dialog)");
            String string2 = mainActivity.getString(R.string.str_redeem_with_no_beans_message, new Object[]{String.valueOf(this.$data$inlined.getPrice())});
            Intrinsics.checkNotNullExpressionValue(string2, "it1.getString(\n         …                        )");
            ContextExtsKt.showOneButtonAlertDialog$default(mainActivity, string, string2, mainActivity.getString(R.string.str_confirm_title_dialog), false, new Function0<Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.rewards.rewarddetail.RewardDetailDialogFragment$initRewardDetail$$inlined$apply$lambda$1.AnonymousClass1 */
                final /* synthetic */ RewardDetailDialogFragment$initRewardDetail$$inlined$apply$lambda$1 this$0;

                {
                    this.this$0 = r1;
                }

                @Override // kotlin.jvm.functions.Function0
                public final void invoke() {
                    FragmentActivity activity = this.this$0.this$0.getActivity();
                    if (!(activity instanceof MainActivity)) {
                        activity = null;
                    }
                    MainActivity mainActivity = (MainActivity) activity;
                    if (mainActivity != null) {
                        mainActivity.runFlowLogin(new Function1<Boolean, Unit>(this) {
                            /* class com.thecoffeehouse.guestapp.screens.rewards.rewarddetail.RewardDetailDialogFragment$initRewardDetail$$inlined$apply$lambda$1.AnonymousClass1.AnonymousClass1 */
                            final /* synthetic */ AnonymousClass1 this$0;

                            {
                                this.this$0 = r1;
                            }

                            /* Return type fixed from 'java.lang.Object' to match base method */
                            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
                                invoke(bool.booleanValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(boolean z) {
                                if (z) {
                                    TLTextView tLTextView = (TLTextView) this.this$0.this$0.$this_apply.findViewById(R.id.btn_redeem);
                                    Intrinsics.checkNotNullExpressionValue(tLTextView, "btn_redeem");
                                    tLTextView.setVisibility(4);
                                    ProgressBar progressBar = (ProgressBar) this.this$0.this$0.$this_apply.findViewById(R.id.progress_bar_loading);
                                    Intrinsics.checkNotNullExpressionValue(progressBar, "progress_bar_loading");
                                    progressBar.setVisibility(0);
                                    this.this$0.this$0.this$0.getMRewardViewModel().redeemReward(this.this$0.this$0.$data$inlined.getId()).observe(this.this$0.this$0.this$0, this.this$0.this$0.this$0.mObserverRedeemReward);
                                }
                            }
                        });
                    }
                }
            }, 8, null);
        }
    }
}
