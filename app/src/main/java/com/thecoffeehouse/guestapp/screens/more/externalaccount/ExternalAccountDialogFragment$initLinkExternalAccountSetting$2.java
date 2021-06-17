package com.thecoffeehouse.guestapp.screens.more.externalaccount;

import android.view.View;
import com.thecoffeehouse.guestapp.services.api.model.common.extenalaccount.LinkHaravanResponse;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "kotlin.jvm.PlatformType", "onClick"}, k = 3, mv = {1, 4, 0})
/* compiled from: ExternalAccountDialogFragment.kt */
public final class ExternalAccountDialogFragment$initLinkExternalAccountSetting$2 implements View.OnClickListener {
    final /* synthetic */ ExternalAccountDialogFragment this$0;

    ExternalAccountDialogFragment$initLinkExternalAccountSetting$2(ExternalAccountDialogFragment externalAccountDialogFragment) {
        this.this$0 = externalAccountDialogFragment;
    }

    public final void onClick(View view) {
        ExternalAccountDialogFragment.access$getMExternalAccountViewModel$p(this.this$0).unlinkHaravanAccount().observe(this.this$0, new BaseFullScreenDialogFragment.ObserverBaseResource(this.this$0, new Function1<LinkHaravanResponse, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.more.externalaccount.ExternalAccountDialogFragment$initLinkExternalAccountSetting$2.AnonymousClass1 */
            final /* synthetic */ ExternalAccountDialogFragment$initLinkExternalAccountSetting$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(LinkHaravanResponse linkHaravanResponse) {
                invoke(linkHaravanResponse);
                return Unit.INSTANCE;
            }

            public final void invoke(LinkHaravanResponse linkHaravanResponse) {
                Intrinsics.checkNotNullParameter(linkHaravanResponse, "it");
                ExternalAccountDialogFragment.access$initLinkExternalAccountSetting(this.this$0.this$0, null);
            }
        }, null, false, false, 14, null));
    }
}
