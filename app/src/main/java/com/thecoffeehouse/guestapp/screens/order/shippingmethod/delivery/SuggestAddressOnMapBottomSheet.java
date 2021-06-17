package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\b\u0010\u0016\u001a\u00020\u0006H\u0016J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00112\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0007\u001a\u0012\u0012\u0004\u0012\u00020\u00050\bj\b\u0012\u0004\u0012\u00020\u0005`\tX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/SuggestAddressOnMapBottomSheet;", "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;", "()V", "onClickSelectedAddress", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "suggestAddresses", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getTheme", "", "onCreateDialog", "Landroid/app/Dialog;", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onStart", "onViewCreated", ViewHierarchyConstants.VIEW_KEY, "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SuggestAddressOnMapBottomSheet.kt */
public final class SuggestAddressOnMapBottomSheet extends BottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Function1<? super AddressSuggestion, Unit> onClickSelectedAddress = SuggestAddressOnMapBottomSheet$onClickSelectedAddress$1.INSTANCE;
    private ArrayList<AddressSuggestion> suggestAddresses = new ArrayList<>();

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J2\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u0006j\b\u0012\u0004\u0012\u00020\u0007`\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\n¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/SuggestAddressOnMapBottomSheet$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/SuggestAddressOnMapBottomSheet;", "addresses", "Ljava/util/ArrayList;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "Lkotlin/collections/ArrayList;", "onSelectedAddress", "Lkotlin/Function1;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SuggestAddressOnMapBottomSheet.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SuggestAddressOnMapBottomSheet newInstance(ArrayList<AddressSuggestion> arrayList, Function1<? super AddressSuggestion, Unit> function1) {
            Intrinsics.checkNotNullParameter(arrayList, "addresses");
            Intrinsics.checkNotNullParameter(function1, "onSelectedAddress");
            SuggestAddressOnMapBottomSheet suggestAddressOnMapBottomSheet = new SuggestAddressOnMapBottomSheet();
            suggestAddressOnMapBottomSheet.suggestAddresses = arrayList;
            suggestAddressOnMapBottomSheet.onClickSelectedAddress = function1;
            return suggestAddressOnMapBottomSheet;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.layout_suggest_address_on_map_bottom_sheet, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public void onStart() {
        Window window;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setLayout(-1, -2);
            window.setFlags(32, 32);
            WindowManager.LayoutParams attributes = window.getAttributes();
            attributes.gravity = 80;
            Unit unit = Unit.INSTANCE;
            window.setAttributes(attributes);
            window.setDimAmount(0.0f);
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
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        PlaceHolderView placeHolderView = (PlaceHolderView) view.findViewById(R.id.layout_suggest_addresses);
        for (T t : this.suggestAddresses) {
            placeHolderView.addView(new ItemRowSearchDeliveryAddress(t, PickLocationDialogV2Kt.getTitleByAddressType(t), t.getFullAddress(), t.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t.getType()), null, new SuggestAddressOnMapBottomSheet$onViewCreated$$inlined$forEach$lambda$1(this, placeHolderView), null));
        }
    }
}
