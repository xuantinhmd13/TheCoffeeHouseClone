package com.thecoffeehouse.guestapp.screens.order.filterproducts;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.orders.Menu;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\t2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J&\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001a\u0010\u0017\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00122\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u0019\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0005H\u0002J\b\u0010\u001b\u001a\u00020\tH\u0002R\u001e\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductBottomSheetDialogFragment;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "menus", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "Lkotlin/collections/ArrayList;", "onSelectCategoryListener", "Lkotlin/Function1;", "", "getTheme", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateDialog", "Landroid/app/Dialog;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "sendTrackingEventSelectCategory", "menu", "sendTrackingEventViewCategory", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: FilterProductBottomSheetDialogFragment.kt */
public final class FilterProductBottomSheetDialogFragment extends BottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private static final String MENU_KEY = "menu";
    private HashMap _$_findViewCache;
    private ArrayList<Menu> menus = new ArrayList<>();
    private Function1<? super Menu, Unit> onSelectCategoryListener = FilterProductBottomSheetDialogFragment$onSelectCategoryListener$1.INSTANCE;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0005\u001a\u00020\u00062\u0016\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\t0\bj\b\u0012\u0004\u0012\u00020\t`\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\r0\fR\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductBottomSheetDialogFragment$Companion;", "", "()V", "MENU_KEY", "", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/filterproducts/FilterProductBottomSheetDialogFragment;", "menus", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/Menu;", "Lkotlin/collections/ArrayList;", "onSelectCategoryListener", "Lkotlin/Function1;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: FilterProductBottomSheetDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final FilterProductBottomSheetDialogFragment newInstance(ArrayList<Menu> arrayList, Function1<? super Menu, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "menus");
            Intrinsics.checkNotNullParameter(function1, "onSelectCategoryListener");
            FilterProductBottomSheetDialogFragment filterProductBottomSheetDialogFragment = new FilterProductBottomSheetDialogFragment();
            Bundle bundle = new Bundle();
            bundle.putParcelableArrayList(FilterProductBottomSheetDialogFragment.MENU_KEY, arrayList);
            Unit unit = Unit.INSTANCE;
            filterProductBottomSheetDialogFragment.setArguments(bundle);
            filterProductBottomSheetDialogFragment.onSelectCategoryListener = function1;
            return filterProductBottomSheetDialogFragment;
        }
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String str = MENU_KEY;
            if (arguments.containsKey(str)) {
                Bundle arguments2 = getArguments();
                ArrayList<Menu> parcelableArrayList = arguments2 != null ? arguments2.getParcelableArrayList(str) : null;
                Objects.requireNonNull(parcelableArrayList, "null cannot be cast to non-null type kotlin.collections.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.Menu> /* = java.util.ArrayList<com.thecoffeehouse.guestapp.services.api.model.orders.Menu> */");
                this.menus = parcelableArrayList;
            }
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
        return layoutInflater.inflate(R.layout.fragment_filter_product_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.rcv_categories);
        Intrinsics.checkNotNullExpressionValue(recyclerView, "recyclerView");
        recyclerView.setLayoutManager(new GridLayoutManager(getContext(), 2, 1, false));
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getContext(), 1);
        DividerItemDecoration dividerItemDecoration2 = new DividerItemDecoration(getContext(), 0);
        Drawable drawable = ContextCompat.getDrawable(requireContext(), R.drawable.divider_space_product_category);
        if (drawable != null) {
            dividerItemDecoration.setDrawable(drawable);
            dividerItemDecoration2.setDrawable(drawable);
        }
        recyclerView.addItemDecoration(dividerItemDecoration);
        recyclerView.addItemDecoration(dividerItemDecoration2);
        recyclerView.setAdapter(new FilterProductRecycleViewAdapter(this.menus, new FilterProductBottomSheetDialogFragment$onViewCreated$adapter$1(this)));
        ((ImageView) view.findViewById(R.id.img_close)).setOnClickListener(new FilterProductBottomSheetDialogFragment$onViewCreated$2(this));
        sendTrackingEventViewCategory();
    }

    /* access modifiers changed from: private */
    public final void sendTrackingEventSelectCategory(Menu menu) {
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventCategoryProductList.name, OrderEvents.EventCategoryProductList.name);
        TrackingEventService.Companion companion = TrackingEventService.Companion;
        TrackingData[] trackingDataArr = new TrackingData[3];
        trackingDataArr[0] = new TrackingData("categoryID", Integer.valueOf(menu.getId()));
        trackingDataArr[1] = new TrackingData("qtyItems", Integer.valueOf(menu.getProducts().size()));
        Iterator<Menu> it = this.menus.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (it.next().getId() == menu.getId()) {
                break;
            }
            i++;
        }
        trackingDataArr[2] = new TrackingData(OrderEvents.EventCategoryProductList.Param.selectedCatIndex, Integer.valueOf(i));
        companion.collectParamWithEventName(OrderEvents.EventCategoryProductList.name, trackingDataArr);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventCategoryProductList.name);
    }

    private final void sendTrackingEventViewCategory() {
        TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewCategoryItemList.name, OrderEvents.EventViewCategoryItemList.name);
        TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewCategoryItemList.name);
    }
}
