package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.services.api.model.orders.Day;
import com.thecoffeehouse.guestapp.services.api.model.orders.DayOrder;
import com.thecoffeehouse.guestapp.services.api.model.orders.ScheduleTime;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.ScheduleTimeWheelPicker;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 %2\u00020\u0001:\u0001%B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J8\u0010\u0010\u001a\u00020\t2\u000e\u0010\u0011\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0014\u001a\u00020\f2\u000e\u0010\u0015\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010!\u001a\u00020\t2\u0006\u0010\"\u001a\u00020\u001c2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0018\u0010#\u001a\u00020\t2\u000e\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0012H\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t0\u0007X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/ScheduleTimeBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "currentSelectedDayTime", "Lkotlin/Pair;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Day;", "onChangeSchedulerTime", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "", "scheduleOrderTime", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DayOrder;", "Lkotlin/collections/ArrayList;", "getTheme", "", "initViewPickers", "datesDisplayValue", "", "", "currentDateSelected", "timesDisplayValue", "currentTimeSelected", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "updateTimePickerByDate", "timesInDate", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: ScheduleTimeBottomSheet.kt */
public final class ScheduleTimeBottomSheet extends BottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Pair<Day, Day> currentSelectedDayTime = new Pair<>(null, null);
    private Function1<? super ScheduleTime, Unit> onChangeSchedulerTime = ScheduleTimeBottomSheet$onChangeSchedulerTime$1.INSTANCE;
    private ArrayList<DayOrder> scheduleOrderTime = new ArrayList<>();

    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    public View _$_findCachedViewById(int i) {
        if (this._$_findViewCache == null) {
            this._$_findViewCache = new HashMap();
        }
        View view = (View) this._$_findViewCache.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View view2 = getView();
        if (view2 == null) {
            return null;
        }
        View findViewById = view2.findViewById(i);
        this._$_findViewCache.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    @Override // androidx.fragment.app.DialogFragment
    public int getTheme() {
        return R.style.AppBottomSheetDialogTheme;
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JJ\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00062\u0016\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\n0\tj\b\u0012\u0004\u0012\u00020\n`\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r¨\u0006\u0010"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/ScheduleTimeBottomSheet$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/ScheduleTimeBottomSheet;", "currentSelectDayTime", "Lkotlin/Pair;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Day;", "time", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/DayOrder;", "Lkotlin/collections/ArrayList;", "onChangeSchedulerTime", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/ScheduleTime;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: ScheduleTimeBottomSheet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ScheduleTimeBottomSheet newInstance(Pair<Day, Day> pair, ArrayList<DayOrder> arrayList, Function1<? super ScheduleTime, Unit> function1) {
            Intrinsics.checkNotNullParameter(pair, "currentSelectDayTime");
            Intrinsics.checkNotNullParameter(arrayList, "time");
            Intrinsics.checkNotNullParameter(function1, "onChangeSchedulerTime");
            ScheduleTimeBottomSheet scheduleTimeBottomSheet = new ScheduleTimeBottomSheet();
            scheduleTimeBottomSheet.scheduleOrderTime = arrayList;
            scheduleTimeBottomSheet.currentSelectedDayTime = pair;
            scheduleTimeBottomSheet.onChangeSchedulerTime = function1;
            return scheduleTimeBottomSheet;
        }
    }

    @Override // androidx.appcompat.app.AppCompatDialogFragment, com.google.android.material.bottomsheet.BottomSheetDialogFragment, androidx.fragment.app.DialogFragment
    public Dialog onCreateDialog(Bundle bundle) {
        Dialog onCreateDialog = super.onCreateDialog(bundle);
        Objects.requireNonNull(onCreateDialog, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog) onCreateDialog;
        BottomSheetBehavior<FrameLayout> behavior = bottomSheetDialog.getBehavior();
        behavior.setState(3);
        behavior.setFitToContents(true);
        behavior.setSkipCollapsed(true);
        behavior.setHideable(true);
        behavior.setHalfExpandedRatio(1.0E-7f);
        return bottomSheetDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.layout_bottom_sheet_schedule_time, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        TrackingScreenService.Companion.logScreenViewByLayoutResId(TrackingScreenService.Order_SelectTime, R.layout.layout_bottom_sheet_schedule_time);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Iterator<T> it = this.scheduleOrderTime.iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            T next = it.next();
            String key = next.getKey();
            Day first = this.currentSelectedDayTime.getFirst();
            if (first != null) {
                str = first.getKey();
            }
            if (Intrinsics.areEqual(key, str)) {
                str = next;
                break;
            }
        }
        T t = (T) ((DayOrder) str);
        if (t == null) {
            t = (T) ((DayOrder) CollectionsKt.first((List) this.scheduleOrderTime));
        }
        objectRef.element = t;
        Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
        T t2 = (T) this.currentSelectedDayTime.getSecond();
        if (t2 == null) {
            t2 = (T) ((Day) CollectionsKt.first((List) objectRef.element.getTimes()));
        }
        objectRef2.element = t2;
        ArrayList<DayOrder> arrayList = this.scheduleOrderTime;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator<T> it2 = arrayList.iterator();
        while (it2.hasNext()) {
            arrayList2.add(it2.next().getText());
        }
        ArrayList arrayList3 = arrayList2;
        List<Day> times = objectRef.element.getTimes();
        ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(times, 10));
        Iterator<T> it3 = times.iterator();
        while (it3.hasNext()) {
            arrayList4.add(it3.next().getText());
        }
        ArrayList arrayList5 = arrayList4;
        updateTimePickerByDate(arrayList5);
        initViewPickers(arrayList3, objectRef.element, arrayList5, objectRef2.element);
        TextView textView = (TextView) _$_findCachedViewById(R.id.txt_selected_time);
        Intrinsics.checkNotNullExpressionValue(textView, "txt_selected_time");
        textView.setText(Intrinsics.stringPlus(objectRef.element.getText(), " - ") + objectRef2.element.getText());
        ((ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.date_picker)).setOnValueChangedListener(new ScheduleTimeBottomSheet$onViewCreated$1(this, objectRef, objectRef2));
        ((ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker)).setOnValueChangedListener(new ScheduleTimeBottomSheet$onViewCreated$2(this, objectRef2, objectRef));
        TLButton tLButton = (TLButton) _$_findCachedViewById(R.id.btn_select_shipping_time);
        Intrinsics.checkNotNullExpressionValue(tLButton, "btn_select_shipping_time");
        ContextExtsKt.setOnSafeClickListener$default(tLButton, 0, new ScheduleTimeBottomSheet$onViewCreated$3(this, objectRef, objectRef2), 1, null);
        ImageView imageView = (ImageView) _$_findCachedViewById(R.id.img_close);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_close");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new ScheduleTimeBottomSheet$onViewCreated$4(this), 1, null);
    }

    private final void initViewPickers(List<String> list, DayOrder dayOrder, List<String> list2, Day day) {
        ScheduleTimeWheelPicker scheduleTimeWheelPicker = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.date_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker, "date_picker");
        scheduleTimeWheelPicker.setMinValue(0);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker2 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.date_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker2, "date_picker");
        scheduleTimeWheelPicker2.setMaxValue(CollectionsKt.getLastIndex(list));
        ScheduleTimeWheelPicker scheduleTimeWheelPicker3 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.date_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker3, "date_picker");
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        scheduleTimeWheelPicker3.setDisplayedValues((String[]) array);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker4 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.date_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker4, "date_picker");
        scheduleTimeWheelPicker4.setDescendantFocusability(393216);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker5 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.date_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker5, "date_picker");
        scheduleTimeWheelPicker5.setValue(this.scheduleOrderTime.indexOf(dayOrder));
        ScheduleTimeWheelPicker scheduleTimeWheelPicker6 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker6, "time_picker");
        scheduleTimeWheelPicker6.setMinValue(0);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker7 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker7, "time_picker");
        scheduleTimeWheelPicker7.setMaxValue(CollectionsKt.getLastIndex(list2));
        ScheduleTimeWheelPicker scheduleTimeWheelPicker8 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker8, "time_picker");
        Object[] array2 = list2.toArray(new String[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        scheduleTimeWheelPicker8.setDisplayedValues((String[]) array2);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker9 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker9, "time_picker");
        scheduleTimeWheelPicker9.setDescendantFocusability(393216);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker10 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker10, "time_picker");
        scheduleTimeWheelPicker10.setValue(dayOrder.getTimes().indexOf(day));
    }

    /* access modifiers changed from: private */
    public final void updateTimePickerByDate(List<String> list) {
        ScheduleTimeWheelPicker scheduleTimeWheelPicker = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker, "time_picker");
        scheduleTimeWheelPicker.setWrapSelectorWheel(false);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker2 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker2, "time_picker");
        scheduleTimeWheelPicker2.setDisplayedValues(null);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker3 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker3, "time_picker");
        scheduleTimeWheelPicker3.setMinValue(0);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker4 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker4, "time_picker");
        scheduleTimeWheelPicker4.setValue(0);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker5 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker5, "time_picker");
        scheduleTimeWheelPicker5.setMaxValue(CollectionsKt.getLastIndex(list));
        ScheduleTimeWheelPicker scheduleTimeWheelPicker6 = (ScheduleTimeWheelPicker) _$_findCachedViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker6, "time_picker");
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        scheduleTimeWheelPicker6.setDisplayedValues((String[]) array);
    }
}
