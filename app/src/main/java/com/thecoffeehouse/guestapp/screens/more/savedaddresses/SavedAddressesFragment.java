package com.thecoffeehouse.guestapp.screens.more.savedaddresses;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowAddDeliveryAddress;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.ItemRowSearchDeliveryAddress;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationDialogV2Kt;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressType;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB\u0005¢\u0006\u0002\u0010\u0002J \u0010\u000f\u001a\u00020\u00062\u0016\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u0012H\u0002J\b\u0010\u0013\u001a\u00020\u0006H\u0002J\b\u0010\u0014\u001a\u00020\u0006H\u0002J\u001a\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\u001a\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u001d\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/savedaddresses/SavedAddressesFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "handleClickSelectAddress", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "", "mPhvSearchStore", "Lcom/mindorks/placeholderview/PlaceHolderView;", "mPickLocationViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "getMPickLocationViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/delivery/PickLocationViewModel;", "mPickLocationViewModel$delegate", "Lkotlin/Lazy;", "addRowItemSavedAddress", "userAddresses", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "fetchUserSavedAddresses", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "observeViewModel", "inflated", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: SavedAddressesFragment.kt */
public final class SavedAddressesFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private final Function1<AddressSuggestion, Unit> handleClickSelectAddress = new SavedAddressesFragment$handleClickSelectAddress$1(this);
    private PlaceHolderView mPhvSearchStore;
    private final Lazy mPickLocationViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(PickLocationViewModel.class), new SavedAddressesFragment$$special$$inlined$activityViewModels$1(this), new SavedAddressesFragment$$special$$inlined$activityViewModels$2(this));

    private final PickLocationViewModel getMPickLocationViewModel() {
        return (PickLocationViewModel) this.mPickLocationViewModel$delegate.getValue();
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
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

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_saved_addresses;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/savedaddresses/SavedAddressesFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/more/savedaddresses/SavedAddressesFragment;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: SavedAddressesFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final SavedAddressesFragment newInstance() {
            return new SavedAddressesFragment();
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        this.mPhvSearchStore = (PlaceHolderView) view.findViewById(R.id.phv_address);
    }

    private final void initToolbar() {
        if (getRootView() != null) {
            View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
            ImageView imageView = (ImageView) _$_findCachedViewById.findViewById(R.id.img_back);
            Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
            ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new SavedAddressesFragment$initToolbar$$inlined$apply$lambda$1(this), 1, null);
            View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
            TextView textView = (TextView) _$_findCachedViewById2.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
            textView.setText(requireContext().getString(R.string.str_saved_addresses));
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void observeViewModel(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "inflated");
        super.observeViewModel(view, bundle);
        fetchUserSavedAddresses();
    }

    /* access modifiers changed from: private */
    public final void fetchUserSavedAddresses() {
        getMPickLocationViewModel().getUserAddress(false).observe(this, new BaseFullScreenDialogFragment.ObserverBaseResource(this, new SavedAddressesFragment$fetchUserSavedAddresses$1(this), null, false, false, 10, null));
    }

    /* access modifiers changed from: private */
    public final void addRowItemSavedAddress(ArrayList<AddressSuggestion> arrayList) {
        T t;
        T t2;
        boolean z;
        boolean z2;
        ArrayList<AddressSuggestion> arrayList2 = arrayList;
        Iterator<T> it = arrayList2.iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (t.getType() == AddressType.INSTANCE.getHOME()) {
                z2 = true;
                continue;
            } else {
                z2 = false;
                continue;
            }
            if (z2) {
                break;
            }
        }
        T t3 = t;
        if (t3 != null) {
            PlaceHolderView placeHolderView = this.mPhvSearchStore;
            if (placeHolderView != null) {
                placeHolderView.addView(new ItemRowSearchDeliveryAddress(t3, PickLocationDialogV2Kt.getTitleByAddressType(t3), t3.getFullAddress(), t3.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t3.getType()), Integer.valueOf((int) R.drawable.ic_edit_address), this.handleClickSelectAddress, this.handleClickSelectAddress));
            }
        } else {
            PlaceHolderView placeHolderView2 = this.mPhvSearchStore;
            if (placeHolderView2 != null) {
                placeHolderView2.addView(new ItemRowAddDeliveryAddress(AddressType.INSTANCE.getHOME(), new SavedAddressesFragment$addRowItemSavedAddress$1(this)));
            }
        }
        Iterator<T> it2 = arrayList2.iterator();
        while (true) {
            if (!it2.hasNext()) {
                t2 = null;
                break;
            }
            t2 = it2.next();
            if (t2.getType() == AddressType.INSTANCE.getWORK()) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (z) {
                break;
            }
        }
        T t4 = t2;
        if (t4 != null) {
            PlaceHolderView placeHolderView3 = this.mPhvSearchStore;
            if (placeHolderView3 != null) {
                placeHolderView3.addView(new ItemRowSearchDeliveryAddress(t4, PickLocationDialogV2Kt.getTitleByAddressType(t4), t4.getFullAddress(), t4.getDistance(), PickLocationDialogV2Kt.getIconByAddressType(t4.getType()), Integer.valueOf((int) R.drawable.ic_edit_address), this.handleClickSelectAddress, this.handleClickSelectAddress));
            }
        } else {
            PlaceHolderView placeHolderView4 = this.mPhvSearchStore;
            if (placeHolderView4 != null) {
                placeHolderView4.addView(new ItemRowAddDeliveryAddress(AddressType.INSTANCE.getWORK(), new SavedAddressesFragment$addRowItemSavedAddress$2(this)));
            }
        }
        ItemRowAddDeliveryAddress itemRowAddDeliveryAddress = new ItemRowAddDeliveryAddress(AddressType.INSTANCE.getOTHER(), new SavedAddressesFragment$addRowItemSavedAddress$addOtherAddress$1(this));
        PlaceHolderView placeHolderView5 = this.mPhvSearchStore;
        if (placeHolderView5 != null) {
            placeHolderView5.addView(itemRowAddDeliveryAddress);
        }
        ArrayList<AddressSuggestion> arrayList3 = new ArrayList();
        for (T t5 : arrayList2) {
            T t6 = t5;
            if ((t6.getType() == AddressType.INSTANCE.getHOME() || t6.getType() == AddressType.INSTANCE.getWORK()) ? false : true) {
                arrayList3.add(t5);
            }
        }
        for (AddressSuggestion addressSuggestion : arrayList3) {
            PlaceHolderView placeHolderView6 = this.mPhvSearchStore;
            if (placeHolderView6 != null) {
                String titleByAddressType = PickLocationDialogV2Kt.getTitleByAddressType(addressSuggestion);
                String fullAddress = addressSuggestion.getFullAddress();
                String distance = addressSuggestion.getDistance();
                int iconByAddressType = PickLocationDialogV2Kt.getIconByAddressType(addressSuggestion.getType());
                Integer valueOf = Integer.valueOf((int) R.drawable.ic_edit_address);
                Function1<AddressSuggestion, Unit> function1 = this.handleClickSelectAddress;
                placeHolderView6.addView(new ItemRowSearchDeliveryAddress(addressSuggestion, titleByAddressType, fullAddress, distance, iconByAddressType, valueOf, function1, function1));
            }
        }
    }
}
