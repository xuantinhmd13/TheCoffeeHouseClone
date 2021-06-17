package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.common.media.Banner;
import com.thecoffeehouse.guestapp.services.api.model.common.media.GetBannerResponse;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/media/GetBannerResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
final class MainActivity$mObserveGetBanner$1 extends Lambda implements Function1<GetBannerResponse, Unit> {
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$mObserveGetBanner$1(MainActivity mainActivity) {
        super(1);
        this.this$0 = mainActivity;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetBannerResponse getBannerResponse) {
        invoke(getBannerResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetBannerResponse getBannerResponse) {
        Intrinsics.checkNotNullParameter(getBannerResponse, "it");
        Banner banner = getBannerResponse.getBanner();
        if (banner != null) {
            MainActivity mainActivity = this.this$0;
            Objects.requireNonNull(banner, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.common.notification.Popup");
            mainActivity.openNotificationBottomSheet(banner);
        }
    }
}
