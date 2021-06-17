package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.widget.NumberPicker;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "picker", "Landroid/widget/NumberPicker;", "kotlin.jvm.PlatformType", "oldVal", "", "newVal", "onValueChange"}, k = 3, mv = {1, 4, 0})
/* compiled from: ScheduleTimeBottomSheet.kt */
final class ScheduleTimeBottomSheet$onViewCreated$2 implements NumberPicker.OnValueChangeListener {
    final /* synthetic */ Ref.ObjectRef $currentDateSelected;
    final /* synthetic */ Ref.ObjectRef $currentTimeSelected;
    final /* synthetic */ ScheduleTimeBottomSheet this$0;

    ScheduleTimeBottomSheet$onViewCreated$2(ScheduleTimeBottomSheet scheduleTimeBottomSheet, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        this.this$0 = scheduleTimeBottomSheet;
        this.$currentTimeSelected = objectRef;
        this.$currentDateSelected = objectRef2;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        this.$currentTimeSelected.element = (T) this.$currentDateSelected.element.getTimes().get(i2);
        TextView textView = (TextView) this.this$0._$_findCachedViewById(R.id.txt_selected_time);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_selected_time");
        textView.setText(Intrinsics.stringPlus(this.$currentDateSelected.element.getText(), " - ") + this.$currentTimeSelected.element.getText());
    }
}
