package com.thecoffeehouse.guestapp.screens.order.shippingmethod.pickup;

import android.view.View;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import java.util.HashMap;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0014¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/shippingmethod/pickup/PickStoreBottomSheetHolderFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "getAnalyticScreenName", "", "layoutResId", "", "onBackPress", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: PickStoreBottomSheetHolderFragment.kt */
public final class PickStoreBottomSheetHolderFragment extends BaseBottomSheetDialogFragment {
    private HashMap _$_findViewCache;

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
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

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public String getAnalyticScreenName() {
        return null;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.layout_view_stub_fragment;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void onBackPress() {
        dismiss();
    }
}
