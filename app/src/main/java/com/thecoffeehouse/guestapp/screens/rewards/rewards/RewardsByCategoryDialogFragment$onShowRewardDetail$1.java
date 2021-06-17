package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: RewardsByCategoryDialogFragment.kt */
final class RewardsByCategoryDialogFragment$onShowRewardDetail$1 extends Lambda implements Function1<Reward, Unit> {
    public static final RewardsByCategoryDialogFragment$onShowRewardDetail$1 INSTANCE = new RewardsByCategoryDialogFragment$onShowRewardDetail$1();

    RewardsByCategoryDialogFragment$onShowRewardDetail$1() {
        super(1);
    }

    public final void invoke(Reward reward) {
        Intrinsics.checkNotNullParameter(reward, "it");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Reward reward) {
        invoke(reward);
        return Unit.INSTANCE;
    }
}
