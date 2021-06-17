package com.thecoffeehouse.guestapp.screens.home;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification;
import com.thecoffeehouse.guestapp.services.api.model.common.notification.NotificationPayload;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "selectedMediaBox", "Lcom/thecoffeehouse/guestapp/services/api/model/common/notification/Notification;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$addRowMediaBox$itemMediaBox$1 extends Lambda implements Function1<Notification, Unit> {
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$addRowMediaBox$itemMediaBox$1(HomeFragment homeFragment) {
        super(1);
        this.this$0 = homeFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Notification notification) {
        invoke(notification);
        return Unit.INSTANCE;
    }

    public final void invoke(Notification notification) {
        Intrinsics.checkNotNullParameter(notification, "selectedMediaBox");
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.handleNotificationPayload(new NotificationPayload(notification.getPopup(), notification.getDescription(), notification.getId(), notification.getTitle(), notification.getDeeplink()));
        }
    }
}
