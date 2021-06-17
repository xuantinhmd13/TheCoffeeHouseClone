package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import com.thecoffeehouse.guestapp.configs.trackingevents.SelectVoucherEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Coupon;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CouponDetailResponse;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/CouponDetailResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: CouponDetailDialogFragmentV3.kt */
final class CouponDetailDialogFragmentV3$initViews$1 extends Lambda implements Function1<CouponDetailResponse, Unit> {
    final /* synthetic */ CouponDetailDialogFragmentV3 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    CouponDetailDialogFragmentV3$initViews$1(CouponDetailDialogFragmentV3 couponDetailDialogFragmentV3) {
        super(1);
        this.this$0 = couponDetailDialogFragmentV3;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CouponDetailResponse couponDetailResponse) {
        invoke(couponDetailResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(CouponDetailResponse couponDetailResponse) {
        Intrinsics.checkNotNullParameter(couponDetailResponse, "it");
        Campaign result = couponDetailResponse.getResult();
        if (result != null) {
            this.this$0.mCampaign = result;
            this.this$0.initCoupon();
            TrackingEventService.Companion companion = TrackingEventService.Companion;
            TrackingData[] trackingDataArr = new TrackingData[2];
            Coupon coupon = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            Long l = null;
            trackingDataArr[0] = new TrackingData("voucherID", coupon != null ? coupon.getBarcode() : null);
            Coupon coupon2 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            trackingDataArr[1] = new TrackingData("daysTilExpired", coupon2 != null ? Long.valueOf(RewardExtsKt.secondToExpiredDate(coupon2.getEndTime())) : null);
            companion.collectParamWithEventName(SelectVoucherEvents.EventViewVoucherDetail.name, trackingDataArr);
            TrackingEventService.Companion companion2 = TrackingEventService.Companion;
            TrackingData[] trackingDataArr2 = new TrackingData[2];
            Coupon coupon3 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            trackingDataArr2[0] = new TrackingData("voucherID", coupon3 != null ? coupon3.getBarcode() : null);
            Coupon coupon4 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            trackingDataArr2[1] = new TrackingData("daysTilExpired", coupon4 != null ? Long.valueOf(RewardExtsKt.secondToExpiredDate(coupon4.getEndTime())) : null);
            companion2.collectParamWithEventName(SelectVoucherEvents.EventApplyAVoucher.name, trackingDataArr2);
            TrackingEventService.Companion companion3 = TrackingEventService.Companion;
            TrackingData[] trackingDataArr3 = new TrackingData[2];
            Coupon coupon5 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            trackingDataArr3[0] = new TrackingData("voucherID", coupon5 != null ? coupon5.getBarcode() : null);
            Coupon coupon6 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            trackingDataArr3[1] = new TrackingData("daysTilExpired", coupon6 != null ? Long.valueOf(RewardExtsKt.secondToExpiredDate(coupon6.getEndTime())) : null);
            companion3.collectParamWithEventName(SelectVoucherEvents.EventVoucherAppliedSuccessfully.name, trackingDataArr3);
            TrackingEventService.Companion companion4 = TrackingEventService.Companion;
            TrackingData[] trackingDataArr4 = new TrackingData[2];
            Coupon coupon7 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            trackingDataArr4[0] = new TrackingData("voucherID", coupon7 != null ? coupon7.getBarcode() : null);
            Coupon coupon8 = (Coupon) CollectionsKt.firstOrNull((List) CouponDetailDialogFragmentV3.access$getMCampaign$p(this.this$0).getCoupons());
            if (coupon8 != null) {
                l = Long.valueOf(RewardExtsKt.secondToExpiredDate(coupon8.getEndTime()));
            }
            trackingDataArr4[1] = new TrackingData("daysTilExpired", l);
            companion4.collectParamWithEventName(SelectVoucherEvents.EventVoucherAppliedFailed.name, trackingDataArr4);
            TrackingEventService.Companion.triggerSendTrackingEvent(SelectVoucherEvents.EventViewVoucherDetail.name);
        }
    }
}
