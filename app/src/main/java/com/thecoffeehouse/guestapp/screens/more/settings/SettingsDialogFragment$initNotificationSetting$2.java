package com.thecoffeehouse.guestapp.screens.more.settings;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.thecoffeehouse.guestapp.MainActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: SettingsDialogFragment.kt */
public final class SettingsDialogFragment$initNotificationSetting$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ SettingsDialogFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SettingsDialogFragment$initNotificationSetting$2(SettingsDialogFragment settingsDialogFragment) {
        super(1);
        this.this$0 = settingsDialogFragment;
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
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (mainActivity != null) {
            mainActivity.runFlowLogin(new Function1<Boolean, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.more.settings.SettingsDialogFragment$initNotificationSetting$2.AnonymousClass1 */
                final /* synthetic */ SettingsDialogFragment$initNotificationSetting$2 this$0;

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
                        Intent addFlags = new Intent("android.settings.APP_NOTIFICATION_SETTINGS").addFlags(268435456);
                        Context requireContext = this.this$0.this$0.requireContext();
                        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                        Intent putExtra = addFlags.putExtra("android.provider.extra.APP_PACKAGE", requireContext.getPackageName());
                        Intrinsics.checkNotNullExpressionValue(putExtra, "Intent(Settings.ACTION_A…ireContext().packageName)");
                        this.this$0.this$0.startActivity(putExtra);
                    }
                }
            });
        }
    }
}
