package com.thecoffeehouse.guestapp.screens.more.externalaccount;

import android.app.Application;
import android.view.View;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ExternalAccountDialogFragment.kt */
final class ExternalAccountDialogFragment$initLinkExternalAccountSetting$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ ExternalAccountDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ExternalAccountDialogFragment$initLinkExternalAccountSetting$1(ExternalAccountDialogFragment externalAccountDialogFragment) {
        super(1);
        this.this$0 = externalAccountDialogFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        String authHaravan;
        MainActivity access$getMainActivity;
        Intrinsics.checkNotNullParameter(view, "it");
        MainActivity access$getMainActivity2 = ExternalAccountDialogFragment.access$getMainActivity(this.this$0);
        Application application = access$getMainActivity2 != null ? access$getMainActivity2.getApplication() : null;
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        GetMetadataResponse value = ((TCHApplication) application).m0getMetadata().getValue();
        if (value != null && (authHaravan = value.getAuthHaravan()) != null && (access$getMainActivity = ExternalAccountDialogFragment.access$getMainActivity(this.this$0)) != null) {
            OrderExtsKt.openAppByLink(access$getMainActivity, authHaravan);
        }
    }
}
