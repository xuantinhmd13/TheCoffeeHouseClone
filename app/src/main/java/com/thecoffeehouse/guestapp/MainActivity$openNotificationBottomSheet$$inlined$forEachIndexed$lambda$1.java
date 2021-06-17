package com.thecoffeehouse.guestapp;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.ButtonsItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke", "com/thecoffeehouse/guestapp/MainActivity$openNotificationBottomSheet$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$openNotificationBottomSheet$$inlined$forEachIndexed$lambda$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ ButtonsItem $button;
    final /* synthetic */ View $layoutNotificationBottomSheet$inlined;
    final /* synthetic */ BottomSheetDialog $notificationBottomSheetDialog$inlined;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$openNotificationBottomSheet$$inlined$forEachIndexed$lambda$1(ButtonsItem buttonsItem, MainActivity mainActivity, BottomSheetDialog bottomSheetDialog, View view) {
        super(1);
        this.$button = buttonsItem;
        this.this$0 = mainActivity;
        this.$notificationBottomSheetDialog$inlined = bottomSheetDialog;
        this.$layoutNotificationBottomSheet$inlined = view;
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
        this.$notificationBottomSheetDialog$inlined.dismiss();
        String deeplink = this.$button.getDeeplink();
        if (deeplink != null) {
            this.this$0.dismissDialogsAndNavigate(deeplink);
        }
    }
}