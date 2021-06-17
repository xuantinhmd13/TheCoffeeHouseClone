package com.thecoffeehouse.guestapp.screens.rewards.beanhistory;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.RewardsViewModel;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.RewardsViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: BeanHistoryDialogFragment.kt */
public final class BeanHistoryDialogFragment$rewardViewModel$2 extends Lambda implements Function0<RewardsViewModel> {
    final /* synthetic */ BeanHistoryDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BeanHistoryDialogFragment$rewardViewModel$2(BeanHistoryDialogFragment beanHistoryDialogFragment) {
        super(0);
        this.this$0 = beanHistoryDialogFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final RewardsViewModel invoke() {
        ViewModel viewModel = new ViewModelProvider(this.this$0, new RewardsViewModelFactory(this.this$0, null)).get(RewardsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(viewModel, "ViewModelProvider(\n     …rdsViewModel::class.java)");
        return (RewardsViewModel) viewModel;
    }
}
