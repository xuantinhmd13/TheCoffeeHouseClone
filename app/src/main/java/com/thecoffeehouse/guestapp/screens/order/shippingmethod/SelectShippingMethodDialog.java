package com.thecoffeehouse.guestapp.screens.order.shippingmethod;

import android.app.Dialog;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.orders.TableInfo;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.StringExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 +2\u00020\u0001:\u0001+B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\u0012\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J&\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\u001a\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u001e2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0016J\b\u0010%\u001a\u00020\u0012H\u0002J\b\u0010&\u001a\u00020\u0012H\u0002J\b\u0010'\u001a\u00020\u0012H\u0002J\f\u0010(\u001a\u00020\u0012*\u00020\u001eH\u0002J\f\u0010)\u001a\u00020\u0012*\u00020\u001eH\u0002J\f\u0010*\u001a\u00020\u0012*\u00020\u001eH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00120\u0016X.¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/SelectShippingMethodDialog;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "addressSuggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "isAtTableAvailable", "", "isDeliAvailable", "isPickupAvailable", "isUsingDefaultAddress", "mCurrentPickUpInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "mCurrentShippingMethod", "", "mCurrentTableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "mOnChangeDeliveryAddress", "Lkotlin/Function0;", "", "mOnChangePickUpStore", "mOnChangeTable", "mOnSelectedMethod", "Lkotlin/Function1;", "getTheme", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "setVisibleAtTableButton", "setVisibleDeliButton", "setVisiblePickupButton", "initDeliButton", "initPickupButton", "initTableButton", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SelectShippingMethodDialog.kt */
public final class SelectShippingMethodDialog extends BottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private AddressSuggestion addressSuggestion;
    private boolean isAtTableAvailable = true;
    private boolean isDeliAvailable = true;
    private boolean isPickupAvailable = true;
    private boolean isUsingDefaultAddress = true;
    private Store mCurrentPickUpInfo;
    private String mCurrentShippingMethod = ShippingType.INSTANCE.getDELI();
    private TableInfo mCurrentTableInfo;
    private Function0<Unit> mOnChangeDeliveryAddress;
    private Function0<Unit> mOnChangePickUpStore;
    private Function0<Unit> mOnChangeTable;
    private Function1<? super String, Unit> mOnSelectedMethod;

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

    public static final /* synthetic */ Function0 access$getMOnChangeDeliveryAddress$p(SelectShippingMethodDialog selectShippingMethodDialog) {
        Function0<Unit> function0 = selectShippingMethodDialog.mOnChangeDeliveryAddress;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnChangeDeliveryAddress");
        }
        return function0;
    }

    public static final /* synthetic */ Function0 access$getMOnChangePickUpStore$p(SelectShippingMethodDialog selectShippingMethodDialog) {
        Function0<Unit> function0 = selectShippingMethodDialog.mOnChangePickUpStore;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnChangePickUpStore");
        }
        return function0;
    }

    public static final /* synthetic */ Function0 access$getMOnChangeTable$p(SelectShippingMethodDialog selectShippingMethodDialog) {
        Function0<Unit> function0 = selectShippingMethodDialog.mOnChangeTable;
        if (function0 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnChangeTable");
        }
        return function0;
    }

    public static final /* synthetic */ Function1 access$getMOnSelectedMethod$p(SelectShippingMethodDialog selectShippingMethodDialog) {
        Function1<? super String, Unit> function1 = selectShippingMethodDialog.mOnSelectedMethod;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mOnSelectedMethod");
        }
        return function1;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0001\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00110\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00062\b\b\u0002\u0010\u0017\u001a\u00020\u00062\b\b\u0002\u0010\u0018\u001a\u00020\u0006¨\u0006\u0019"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/SelectShippingMethodDialog$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/SelectShippingMethodDialog;", "isUsingDefaultAddress", "", "currentShippingMethod", "", "deliveryInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "pickupStore", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "currentTableInfo", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/TableInfo;", "shippingMethodSelected", "Lkotlin/Function1;", "", "onChangeDeliveryAddress", "Lkotlin/Function0;", "onChangePickupStore", "onChangeTable", "isDeliAvailable", "isPickupAvailable", "isAtTableAvailable", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SelectShippingMethodDialog.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ SelectShippingMethodDialog newInstance$default(Companion companion, boolean z, String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo, Function1 function1, Function0 function0, Function0 function02, Function0 function03, boolean z2, boolean z3, boolean z4, int i, Object obj) {
            return companion.newInstance((i & 1) != 0 ? true : z, str, addressSuggestion, store, tableInfo, function1, function0, function02, function03, (i & 512) != 0 ? true : z2, (i & 1024) != 0 ? true : z3, (i & 2048) != 0 ? true : z4);
        }

        public final SelectShippingMethodDialog newInstance(boolean z, String str, AddressSuggestion addressSuggestion, Store store, TableInfo tableInfo, Function1<? super String, Unit> function1, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, boolean z2, boolean z3, boolean z4) {
            Intrinsics.checkNotNullParameter(str, "currentShippingMethod");
            Intrinsics.checkNotNullParameter(function1, "shippingMethodSelected");
            Intrinsics.checkNotNullParameter(function0, "onChangeDeliveryAddress");
            Intrinsics.checkNotNullParameter(function02, "onChangePickupStore");
            Intrinsics.checkNotNullParameter(function03, "onChangeTable");
            SelectShippingMethodDialog selectShippingMethodDialog = new SelectShippingMethodDialog();
            selectShippingMethodDialog.mOnSelectedMethod = function1;
            selectShippingMethodDialog.isUsingDefaultAddress = z;
            selectShippingMethodDialog.mCurrentShippingMethod = str;
            selectShippingMethodDialog.addressSuggestion = addressSuggestion;
            selectShippingMethodDialog.mCurrentPickUpInfo = store;
            selectShippingMethodDialog.mCurrentTableInfo = tableInfo;
            selectShippingMethodDialog.mOnChangeDeliveryAddress = function0;
            selectShippingMethodDialog.mOnChangePickUpStore = function02;
            selectShippingMethodDialog.mOnChangeTable = function03;
            selectShippingMethodDialog.isDeliAvailable = z2;
            selectShippingMethodDialog.isPickupAvailable = z3;
            selectShippingMethodDialog.isAtTableAvailable = z4;
            return selectShippingMethodDialog;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.select_shipping_method_dialog, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_close);
        Intrinsics.checkNotNullExpressionValue(imageView, "img_close");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new SelectShippingMethodDialog$onViewCreated$$inlined$apply$lambda$1(this), 1, null);
        setVisibleDeliButton();
        setVisiblePickupButton();
        setVisibleAtTableButton();
        initDeliButton(view);
        initPickupButton(view);
        initTableButton(view);
        String str = this.mCurrentShippingMethod;
        if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getDELI())) {
            View findViewById = view.findViewById(R.id.btn_delivery);
            Intrinsics.checkNotNullExpressionValue(findViewById, "btn_delivery");
            findViewById.setForeground(new ColorDrawable(ContextCompat.getColor(view.getContext(), R.color.colorSelectShipping)));
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getPICKUP())) {
            View findViewById2 = view.findViewById(R.id.btn_pick_up);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "btn_pick_up");
            findViewById2.setForeground(new ColorDrawable(ContextCompat.getColor(view.getContext(), R.color.colorSelectShipping)));
        } else if (Intrinsics.areEqual(str, ShippingType.INSTANCE.getTABLE())) {
            View findViewById3 = view.findViewById(R.id.btn_table);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "btn_table");
            findViewById3.setForeground(new ColorDrawable(ContextCompat.getColor(view.getContext(), R.color.colorSelectShipping)));
        }
    }

    private final void setVisiblePickupButton() {
        if (this.isPickupAvailable) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.btn_pick_up);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "btn_pick_up");
            _$_findCachedViewById.setVisibility(0);
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "btn_pick_up");
        _$_findCachedViewById2.setVisibility(8);
    }

    private final void setVisibleAtTableButton() {
        if (this.isAtTableAvailable) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.btn_table);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "btn_table");
            _$_findCachedViewById.setVisibility(0);
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "btn_table");
        _$_findCachedViewById2.setVisibility(8);
    }

    private final void setVisibleDeliButton() {
        if (this.isDeliAvailable) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.btn_delivery);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "btn_delivery");
            _$_findCachedViewById.setVisibility(0);
            return;
        }
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "btn_delivery");
        _$_findCachedViewById2.setVisibility(8);
    }

    private final void initTableButton(View view) {
        String str;
        View findViewById = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById, "btn_table");
        ((ImageView) findViewById.findViewById(R.id.img_shipping_type)).setImageResource(R.drawable.ic_badge_at_table_shortcut);
        View findViewById2 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "btn_table");
        TextView textView = (TextView) findViewById2.findViewById(R.id.txt_method_title);
        Intrinsics.checkNotNullExpressionValue(textView, "btn_table.txt_method_title");
        textView.setHint(getString(R.string.str_at_table_description));
        View findViewById3 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "btn_table");
        TextView textView2 = (TextView) findViewById3.findViewById(R.id.txt_method_title);
        Intrinsics.checkNotNullExpressionValue(textView2, "btn_table.txt_method_title");
        TableInfo tableInfo = this.mCurrentTableInfo;
        textView2.setText(StringExtsKt.toStringOrEmpty(tableInfo != null ? tableInfo.getStoreName() : null));
        View findViewById4 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "btn_table");
        TextView textView3 = (TextView) findViewById4.findViewById(R.id.txt_shipping_type);
        Intrinsics.checkNotNullExpressionValue(textView3, "btn_table.txt_shipping_type");
        textView3.setText(getString(R.string.str_at_table));
        View findViewById5 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "btn_table");
        TextView textView4 = (TextView) findViewById5.findViewById(R.id.txt_method_description);
        Intrinsics.checkNotNullExpressionValue(textView4, "btn_table.txt_method_description");
        TableInfo tableInfo2 = this.mCurrentTableInfo;
        textView4.setText(StringExtsKt.toStringOrEmpty(tableInfo2 != null ? tableInfo2.getTableName() : null));
        View findViewById6 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "btn_table");
        ((TextView) findViewById6.findViewById(R.id.txt_shipping_type)).setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, ContextCompat.getDrawable(view.getContext(), R.drawable.ic_at_table_new), (Drawable) null);
        View findViewById7 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "btn_table");
        ContextExtsKt.setOnSafeClickListener$default(findViewById7, 0, new SelectShippingMethodDialog$initTableButton$1(this), 1, null);
        View findViewById8 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "btn_table");
        TLTextView tLTextView = (TLTextView) findViewById8.findViewById(R.id.txt_change);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "btn_table.txt_change");
        ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new SelectShippingMethodDialog$initTableButton$2(this), 1, null);
        View findViewById9 = view.findViewById(R.id.btn_table);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "btn_table");
        TLTextView tLTextView2 = (TLTextView) findViewById9.findViewById(R.id.txt_change);
        Intrinsics.checkNotNullExpressionValue(tLTextView2, "btn_table.txt_change");
        if (this.mCurrentTableInfo != null) {
            str = getString(R.string.str_select);
        } else {
            str = getString(R.string.str_edit_shipping_address);
        }
        tLTextView2.setText(str);
    }

    private final void initDeliButton(View view) {
        View findViewById = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById, "btn_delivery");
        ((ImageView) findViewById.findViewById(R.id.img_shipping_type)).setImageResource(R.drawable.ic_badge_deli_shortcut);
        View findViewById2 = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "btn_delivery");
        TextView textView = (TextView) findViewById2.findViewById(R.id.txt_shipping_type);
        Intrinsics.checkNotNullExpressionValue(textView, "btn_delivery.txt_shipping_type");
        textView.setText(getString(R.string.str_delivery));
        View findViewById3 = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "btn_delivery");
        TextView textView2 = (TextView) findViewById3.findViewById(R.id.txt_method_title);
        Intrinsics.checkNotNullExpressionValue(textView2, "btn_delivery.txt_method_title");
        textView2.setHint(getString(R.string.str_delivery_method_description));
        View findViewById4 = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "btn_delivery");
        TextView textView3 = (TextView) findViewById4.findViewById(R.id.txt_method_title);
        Intrinsics.checkNotNullExpressionValue(textView3, "btn_delivery.txt_method_title");
        AddressSuggestion addressSuggestion2 = this.addressSuggestion;
        textView3.setText(addressSuggestion2 != null ? addressSuggestion2.getFullAddress() : null);
        View findViewById5 = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "btn_delivery");
        TLTextView tLTextView = (TLTextView) findViewById5.findViewById(R.id.txt_change);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "btn_delivery.txt_change");
        ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new SelectShippingMethodDialog$initDeliButton$1(this), 1, null);
        View findViewById6 = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "btn_delivery");
        ContextExtsKt.setOnSafeClickListener$default(findViewById6, 0, new SelectShippingMethodDialog$initDeliButton$2(this), 1, null);
        String descriptionDeliAddress = OrderExtsKt.getDescriptionDeliAddress(this.addressSuggestion);
        View findViewById7 = view.findViewById(R.id.btn_delivery);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "btn_delivery");
        TextView textView4 = (TextView) findViewById7.findViewById(R.id.txt_method_description);
        Intrinsics.checkNotNullExpressionValue(textView4, "btn_delivery.txt_method_description");
        textView4.setText(descriptionDeliAddress);
    }

    private final void initPickupButton(View view) {
        FragmentActivity activity = getActivity();
        String str = null;
        if (!(activity instanceof MainActivity)) {
            activity = null;
        }
        MainActivity mainActivity = (MainActivity) activity;
        if (mainActivity != null) {
            mainActivity.getMyAddress(new SelectShippingMethodDialog$initPickupButton$1(this, view));
        }
        View findViewById = view.findViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(findViewById, "btn_pick_up");
        ((ImageView) findViewById.findViewById(R.id.img_shipping_type)).setImageResource(R.drawable.ic_badge_pickup_shortcut);
        View findViewById2 = view.findViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "btn_pick_up");
        TextView textView = (TextView) findViewById2.findViewById(R.id.txt_shipping_type);
        Intrinsics.checkNotNullExpressionValue(textView, "btn_pick_up.txt_shipping_type");
        textView.setText(getString(R.string.str_pick_up));
        View findViewById3 = view.findViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "btn_pick_up");
        TextView textView2 = (TextView) findViewById3.findViewById(R.id.txt_method_title);
        Intrinsics.checkNotNullExpressionValue(textView2, "btn_pick_up.txt_method_title");
        textView2.setHint(getString(R.string.str_store_you_will_come_to_pick_up));
        View findViewById4 = view.findViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "btn_pick_up");
        TextView textView3 = (TextView) findViewById4.findViewById(R.id.txt_method_title);
        Intrinsics.checkNotNullExpressionValue(textView3, "btn_pick_up.txt_method_title");
        Store store = this.mCurrentPickUpInfo;
        if (store != null) {
            str = store.getName();
        }
        textView3.setText(str);
        View findViewById5 = view.findViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "btn_pick_up");
        TLTextView tLTextView = (TLTextView) findViewById5.findViewById(R.id.txt_change);
        Intrinsics.checkNotNullExpressionValue(tLTextView, "btn_pick_up.txt_change");
        ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new SelectShippingMethodDialog$initPickupButton$2(this), 1, null);
        View findViewById6 = view.findViewById(R.id.btn_pick_up);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "btn_pick_up");
        ContextExtsKt.setOnSafeClickListener$default(findViewById6, 0, new SelectShippingMethodDialog$initPickupButton$3(this), 1, null);
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
}
