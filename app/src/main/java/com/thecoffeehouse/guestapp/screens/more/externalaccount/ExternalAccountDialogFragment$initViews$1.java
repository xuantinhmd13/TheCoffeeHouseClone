package com.thecoffeehouse.guestapp.screens.more.externalaccount;

import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.GetHaravanResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.HaravanInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/common/extenalaccount/GetHaravanResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ExternalAccountDialogFragment.kt */
final class ExternalAccountDialogFragment$initViews$1 extends Lambda implements Function1<GetHaravanResponse, Unit> {
    final /* synthetic */ ExternalAccountDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExternalAccountDialogFragment$initViews$1(ExternalAccountDialogFragment externalAccountDialogFragment) {
        super(1);
        this.this$0 = externalAccountDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(GetHaravanResponse getHaravanResponse) {
        invoke(getHaravanResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(GetHaravanResponse getHaravanResponse) {
        Intrinsics.checkNotNullParameter(getHaravanResponse, "it");
        HaravanInfo havaranInfo = getHaravanResponse.getHavaranInfo();
        if (havaranInfo != null) {
            ExternalAccountDialogFragment.access$initLinkExternalAccountSetting(this.this$0, havaranInfo.getUserName());
        }
    }
}
