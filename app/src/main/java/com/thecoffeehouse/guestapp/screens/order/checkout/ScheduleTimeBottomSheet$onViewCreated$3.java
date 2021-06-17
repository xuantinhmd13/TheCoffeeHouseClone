package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.view.View;
import com.thecoffeehouse.guestapp.services.api.model.orders.Day;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: ScheduleTimeBottomSheet.kt */
final class ScheduleTimeBottomSheet$onViewCreated$3 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ Ref.ObjectRef $currentDateSelected;
    final /* synthetic */ Ref.ObjectRef $currentTimeSelected;
    final /* synthetic */ ScheduleTimeBottomSheet this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScheduleTimeBottomSheet$onViewCreated$3(ScheduleTimeBottomSheet scheduleTimeBottomSheet, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        super(1);
        this.this$0 = scheduleTimeBottomSheet;
        this.$currentDateSelected = objectRef;
        this.$currentTimeSelected = objectRef2;
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
        Function1 function1 = this.this$0.onChangeSchedulerTime;
        ScheduleTime scheduleTime = new ScheduleTime();
        scheduleTime.setDay(new Day(this.$currentDateSelected.element.getKey(), this.$currentDateSelected.element.getText()));
        scheduleTime.setTime(new Day(this.$currentTimeSelected.element.getKey(), this.$currentTimeSelected.element.getText()));
        Unit unit = Unit.INSTANCE;
        function1.invoke(scheduleTime);
        this.this$0.dismiss();
    }
}
