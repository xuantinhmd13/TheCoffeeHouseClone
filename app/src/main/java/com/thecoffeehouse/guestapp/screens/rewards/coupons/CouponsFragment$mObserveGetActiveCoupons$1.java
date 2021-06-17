package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.rewards.ActiveCouponsResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "activeCampaingResult", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/ActiveCouponsResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponsFragment.kt */
public final class CouponsFragment$mObserveGetActiveCoupons$1 extends Lambda implements Function1<ActiveCouponsResponse, Unit> {
    final /* synthetic */ CouponsFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponsFragment$mObserveGetActiveCoupons$1(CouponsFragment couponsFragment) {
        super(1);
        this.this$0 = couponsFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ActiveCouponsResponse activeCouponsResponse) {
        invoke(activeCouponsResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(ActiveCouponsResponse activeCouponsResponse) {
        Intrinsics.checkNotNullParameter(activeCouponsResponse, "activeCampaingResult");
        this.this$0.initActiveCoupons(activeCouponsResponse.getResults());
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[1];
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = activeCouponsResponse.getResults().iterator();
        while (it.hasNext()) {
            CollectionsKt.addAll(arrayList, it.next().getCampaigns());
        }
        ArrayList<Campaign> arrayList2 = arrayList;
        ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
        for (Campaign campaign : arrayList2) {
            arrayList3.add(campaign.getCoupons());
        }
        trackingDataArr[0] = new TrackingData(SelectVoucherEvents.EventViewVoucherList.Param.qtyVoucherInList, Integer.valueOf(arrayList3.size()));
        companion.collectParamWithEventName(SelectVoucherEvents.EventViewVoucherList.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(SelectVoucherEvents.EventViewVoucherList.name);
    }
}
