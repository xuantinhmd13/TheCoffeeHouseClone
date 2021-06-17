package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import androidx.lifecycle.LiveData;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.services.api.model.rewards.ActiveCouponsResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponsFragment.kt */
final class CouponsFragment$initViews$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ CouponsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponsFragment$initViews$1(CouponsFragment couponsFragment) {
        super(0);
        this.this$0 = couponsFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        LiveData<Resource<ActiveCouponsResponse>> allActiveCoupons = ((CouponsViewModel) this.this$0.getViewModel()).getAllActiveCoupons(this.this$0.forOrderOnly);
        CouponsFragment couponsFragment = this.this$0;
        allActiveCoupons.observe(couponsFragment, couponsFragment.mObserveGetActiveCoupons);
    }
}
