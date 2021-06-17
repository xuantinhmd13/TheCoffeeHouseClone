package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.widget.NumberPicker;
import android.widget.TextView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.orders.Day;
import com.thecoffeehouse.guestapp.services.api.model.orders.DayOrder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0002\b\b"}, d2 = {"<anonymous>", "", "picker", "Landroid/widget/NumberPicker;", "kotlin.jvm.PlatformType", "oldVal", "", "newVal", "onValueChange"}, k = 3, mv = {1, 4, 0})
/* compiled from: ScheduleTimeBottomSheet.kt */
final class ScheduleTimeBottomSheet$onViewCreated$1 implements NumberPicker.OnValueChangeListener {
    final /* synthetic */ Ref.ObjectRef $currentDateSelected;
    final /* synthetic */ Ref.ObjectRef $currentTimeSelected;
    final /* synthetic */ ScheduleTimeBottomSheet this$0;

    ScheduleTimeBottomSheet$onViewCreated$1(ScheduleTimeBottomSheet scheduleTimeBottomSheet, Ref.ObjectRef objectRef, Ref.ObjectRef objectRef2) {
        this.this$0 = scheduleTimeBottomSheet;
        this.$currentDateSelected = objectRef;
        this.$currentTimeSelected = objectRef2;
    }

    public final void onValueChange(NumberPicker numberPicker, int i, int i2) {
        Ref.ObjectRef objectRef = this.$currentDateSelected;
        Object obj = this.this$0.scheduleOrderTime.get(i2);
        Intrinsics.checkNotNullExpressionValue(obj, "scheduleOrderTime[newVal]");
        objectRef.element = (T) ((DayOrder) obj);
        this.$currentTimeSelected.element = (T) ((Day) CollectionsKt.first((List) this.$currentDateSelected.element.getTimes()));
        List<Day> times = this.$currentDateSelected.element.getTimes();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(times, 10));
        Iterator<T> it = times.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getText());
        }
        this.this$0.updateTimePickerByDate(arrayList);
        TextView textView = (TextView) this.this$0._$_findCachedViewById(R.id.txt_selected_time);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_selected_time");
        textView.setText(Intrinsics.stringPlus(this.$currentDateSelected.element.getText(), " - ") + this.$currentTimeSelected.element.getText());
    }
}
