package com.thecoffeehouse.guestapp.screens.home;

import com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
public final class HomeFragment$readNotification$1 extends Lambda implements Function1<ServerErrorResponse, Unit> {
    final /* synthetic */ int $position;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$readNotification$1(HomeFragment homeFragment, int i) {
        super(1);
        this.this$0 = homeFragment;
        this.$position = i;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServerErrorResponse serverErrorResponse) {
        invoke(serverErrorResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(ServerErrorResponse serverErrorResponse) {
        Intrinsics.checkNotNullParameter(serverErrorResponse, "it");
        Object obj = this.this$0.mNotifications.get(this.$position);
        Objects.requireNonNull(obj, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.services.api.model.common.notification.Notification");
        ((Notification) obj).setRead(true);
        HomeFragment.access$getMAdapterNotification$p(this.this$0).notifyItemChanged(this.$position);
        HomeFragment.access$getMAdapterNotification$p(this.this$0).notifyItemChanged(0);
    }
}
