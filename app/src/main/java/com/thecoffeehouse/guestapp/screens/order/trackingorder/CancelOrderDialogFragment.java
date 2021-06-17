package com.thecoffeehouse.guestapp.screens.order.trackingorder;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.services.api.model.common.config.CancelReasonsItem;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import com.thecoffeehouse.guestapp.views.CustomRadioGroup;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\u001a\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X.¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bX.¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/CancelOrderDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "cancelOrderListener", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "", "cancelOrderReasons", "", "getAnalyticScreenName", "", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: CancelOrderDialogFragment.kt */
public final class CancelOrderDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Function1<? super CancelReasonsItem, Unit> cancelOrderListener;
    private List<CancelReasonsItem> cancelOrderReasons;

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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Order_CancelForm;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.layout_cancel_order_bottom_sheet;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Function1 access$getCancelOrderListener$p(CancelOrderDialogFragment cancelOrderDialogFragment) {
        Function1<? super CancelReasonsItem, Unit> function1 = cancelOrderDialogFragment.cancelOrderListener;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelOrderListener");
        }
        return function1;
    }

    public static final /* synthetic */ List access$getCancelOrderReasons$p(CancelOrderDialogFragment cancelOrderDialogFragment) {
        List<CancelReasonsItem> list = cancelOrderDialogFragment.cancelOrderReasons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelOrderReasons");
        }
        return list;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J(\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\n0\t¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/CancelOrderDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/order/trackingorder/CancelOrderDialogFragment;", "cancelOrderReasons", "", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/CancelReasonsItem;", "cancelOrderListener", "Lkotlin/Function1;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: CancelOrderDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final CancelOrderDialogFragment newInstance(List<CancelReasonsItem> list, Function1<? super CancelReasonsItem, Unit> function1) {
            Intrinsics.checkNotNullParameter(list, "cancelOrderReasons");
            Intrinsics.checkNotNullParameter(function1, "cancelOrderListener");
            CancelOrderDialogFragment cancelOrderDialogFragment = new CancelOrderDialogFragment();
            cancelOrderDialogFragment.cancelOrderReasons = list;
            cancelOrderDialogFragment.cancelOrderListener = function1;
            return cancelOrderDialogFragment;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        CustomRadioGroup customRadioGroup = (CustomRadioGroup) _$_findCachedViewById(R.id.rdg_cancel_reason);
        Intrinsics.checkNotNullExpressionValue(customRadioGroup, "rdg_cancel_reason");
        customRadioGroup.setOrientation(1);
        List<CancelReasonsItem> list = this.cancelOrderReasons;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("cancelOrderReasons");
        }
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            T t2 = t;
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            OptionCancelOrderLayout optionCancelOrderLayout = new OptionCancelOrderLayout(t2, requireContext);
            optionCancelOrderLayout.getRadioButton().setId(i);
            optionCancelOrderLayout.getRadioButton().setText(t2.getText());
            ((CustomRadioGroup) _$_findCachedViewById(R.id.rdg_cancel_reason)).addView(optionCancelOrderLayout);
            List<CancelReasonsItem> list2 = this.cancelOrderReasons;
            if (list2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cancelOrderReasons");
            }
            if (i == CollectionsKt.getLastIndex(list2)) {
                optionCancelOrderLayout.getLineDivider().setVisibility(8);
            }
            i = i2;
        }
        ((CustomRadioGroup) _$_findCachedViewById(R.id.rdg_cancel_reason)).setOnCheckedChangeListener(new CancelOrderDialogFragment$initViews$2(this));
        Button button = (Button) _$_findCachedViewById(R.id.btn_cancel_order);
        Intrinsics.checkNotNullExpressionValue(button, "btn_cancel_order");
        ContextExtsKt.setOnSafeClickListener$default(button, 0, new CancelOrderDialogFragment$initViews$3(this), 1, null);
    }
}
