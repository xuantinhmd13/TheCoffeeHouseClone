package com.thecoffeehouse.guestapp.screens.order.checkout;

import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ScheduleTimeBottomSheet.kt */
public final class ScheduleTimeBottomSheet$onChangeSchedulerTime$1 extends Lambda implements Function1<ScheduleTime, Unit> {
    public static final ScheduleTimeBottomSheet$onChangeSchedulerTime$1 INSTANCE = new ScheduleTimeBottomSheet$onChangeSchedulerTime$1();

    ScheduleTimeBottomSheet$onChangeSchedulerTime$1() {
        super(1);
    }

    public final void invoke(ScheduleTime scheduleTime) {
        Intrinsics.checkNotNullParameter(scheduleTime, "it");
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ScheduleTime scheduleTime) {
        invoke(scheduleTime);
        return Unit.INSTANCE;
    }
}
