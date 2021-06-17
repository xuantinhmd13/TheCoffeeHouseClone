package com.thecoffeehouse.guestapp.screens.order.checkout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.cart.FloatingCartInteraction;
import com.thecoffeehouse.guestapp.views.ScheduleTimeWheelPicker;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J&\u0010\u0015\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\n2\u000e\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050!H\u0002RF\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/checkout/CheckoutFragment;", "Landroidx/fragment/app/Fragment;", "()V", "<set-?>", "Lkotlin/Triple;", "", "customerInfo", "getCustomerInfo", "()Lkotlin/Triple;", "inflatedView", "Landroid/view/View;", "mDeliveryCheckoutInteraction", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/DeliveryCheckoutInteraction;", "mFloatingCartInteraction", "Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "getMFloatingCartInteraction", "()Lcom/thecoffeehouse/guestapp/screens/order/cart/FloatingCartInteraction;", "mFloatingCartInteraction$delegate", "Lkotlin/Lazy;", "mPickUpCheckoutInteraction", "Lcom/thecoffeehouse/guestapp/screens/order/checkout/PickUpCheckoutInteraction;", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "updateCustomerInfo", "", "updateTimePickerByDate", "layoutScheduleTime", "timesInDate", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CheckoutFragment.kt */
public final class CheckoutFragment extends Fragment {
    private HashMap _$_findViewCache;
    private Triple<String, String, String> customerInfo;
    private View inflatedView;
    private DeliveryCheckoutInteraction mDeliveryCheckoutInteraction;
    private final Lazy mFloatingCartInteraction$delegate = LazyKt.lazy(CheckoutFragment$mFloatingCartInteraction$2.INSTANCE);
    private PickUpCheckoutInteraction mPickUpCheckoutInteraction;

    private final FloatingCartInteraction getMFloatingCartInteraction() {
        return (FloatingCartInteraction) this.mFloatingCartInteraction$delegate.getValue();
    }

    private final void updateCustomerInfo() {
    }

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

    @Override // androidx.fragment.app.Fragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final Triple<String, String, String> getCustomerInfo() {
        return this.customerInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return LayoutInflater.from(requireContext()).inflate(R.layout.layout_card_subscription_shadow, (ViewGroup) null, false);
    }

    private final void updateTimePickerByDate(View view, List<String> list) {
        ScheduleTimeWheelPicker scheduleTimeWheelPicker = (ScheduleTimeWheelPicker) view.findViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker, "layoutScheduleTime.time_picker");
        scheduleTimeWheelPicker.setDisplayedValues(null);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker2 = (ScheduleTimeWheelPicker) view.findViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker2, "layoutScheduleTime.time_picker");
        scheduleTimeWheelPicker2.setMinValue(0);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker3 = (ScheduleTimeWheelPicker) view.findViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker3, "layoutScheduleTime.time_picker");
        scheduleTimeWheelPicker3.setValue(0);
        ScheduleTimeWheelPicker scheduleTimeWheelPicker4 = (ScheduleTimeWheelPicker) view.findViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker4, "layoutScheduleTime.time_picker");
        scheduleTimeWheelPicker4.setMaxValue(CollectionsKt.getLastIndex(list));
        ScheduleTimeWheelPicker scheduleTimeWheelPicker5 = (ScheduleTimeWheelPicker) view.findViewById(R.id.time_picker);
        Intrinsics.checkNotNullExpressionValue(scheduleTimeWheelPicker5, "layoutScheduleTime.time_picker");
        Object[] array = list.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        scheduleTimeWheelPicker5.setDisplayedValues((String[]) array);
    }
}
