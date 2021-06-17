package com.thecoffeehouse.guestapp.screens.rewards.coupons;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.services.api.model.rewards.CampaignGroup;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import java.util.HashMap;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CouponsFragment extends BaseFragment<CouponsViewModel> {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private boolean forOrderOnly;
    private final BaseFragment<CouponsViewModel>.ObserverBaseResource mObserveGetActiveCoupons = new BaseFragment.ObserverBaseResource<>(this, new CouponsFragment$mObserveGetActiveCoupons$1(this), null, false, false, 14, null);
    private PlaceHolderView mPhvCoupons;
    private String toolbarTitle;
    private final Class<CouponsViewModel> viewModelClass = CouponsViewModel.class;

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void _$_clearFindViewByIdCache() {
        HashMap hashMap = this._$_findViewCache;
        if (hashMap != null) {
            hashMap.clear();
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
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

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_coupons;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ CouponsFragment newInstance$default(Companion companion, String str, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            if ((i & 2) != 0) {
                z = false;
            }
            return companion.newInstance(str, z);
        }

        public final CouponsFragment newInstance(String str, boolean z) {
            CouponsFragment couponsFragment = new CouponsFragment();
            couponsFragment.toolbarTitle = str;
            couponsFragment.forOrderOnly = z;
            return couponsFragment;
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<CouponsViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new CouponsViewModelFactory(this, null);
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        BaseFragment.addSwipeToRefreshLayout$default(this, null, new CouponsFragment$initViews$1(this), 1, null);
        initToolbar();
        View findViewById = view.findViewById(R.id.phv_coupons);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.phv_coupons)");
        this.mPhvCoupons = (PlaceHolderView) findViewById;
        toggleViewLoggedInAndGuestUser();
    }

    private final void toggleViewLoggedInAndGuestUser() {
        ClientManager requireClientManager;
        View findViewById = getRootView().findViewById(R.id.view_stub_guest_coupons);
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            PlaceHolderView placeHolderView = this.mPhvCoupons;
            if (placeHolderView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mPhvCoupons");
            }
            placeHolderView.setVisibility(8);
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
            SwipeRefreshLayout swipeRefreshLayout = getSwipeRefreshLayout();
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(false);
                return;
            }
            return;
        }
        PlaceHolderView placeHolderView2 = this.mPhvCoupons;
        if (placeHolderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvCoupons");
        }
        placeHolderView2.setVisibility(0);
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        SwipeRefreshLayout swipeRefreshLayout2 = getSwipeRefreshLayout();
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setEnabled(true);
        }
    }

    /* access modifiers changed from: public */
    private final void openAddCouponDetailFragment() {
        AddCouponDialogFragment addCouponDialogFragment = new AddCouponDialogFragment();
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            addCouponDialogFragment.show(supportFragmentManager, (String) null);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void observeViewModel(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.observeViewModel(view, bundle);
        reloadData();
    }

    private final void initGuestUI() {
        View findViewById = getRootView().findViewById(R.id.view_stub_guest_coupons);
        if (findViewById != null) {
            View findViewById2 = findViewById.findViewById(R.id.txt_login);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<TextView>(R.id.txt_login)");
            ContextExtsKt.setOnSafeClickListener$default(findViewById2, 0, new CouponsFragment$initGuestUI$$inlined$apply$lambda$1(this), 1, null);
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void onLoggedInUserListener() {
        super.onLoggedInUserListener();
        toggleViewLoggedInAndGuestUser();
        reloadData();
    }

    /* access modifiers changed from: public */
    private final void initActiveCoupons(List<CampaignGroup> list) {
        PlaceHolderView placeHolderView = this.mPhvCoupons;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvCoupons");
        }
        placeHolderView.removeAllViews();
        ItemRowAddCoupon itemRowAddCoupon = new ItemRowAddCoupon(new CouponsFragment$initActiveCoupons$itemScanCoupon$1(this));
        PlaceHolderView placeHolderView2 = this.mPhvCoupons;
        if (placeHolderView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvCoupons");
        }
        placeHolderView2.addView(itemRowAddCoupon);
        if (!list.isEmpty()) {
            for (CampaignGroup campaignGroup : list) {
                ItemRowCouponHeader itemRowCouponHeader = new ItemRowCouponHeader(campaignGroup.getTitle(), CouponsFragment$initActiveCoupons$itemRowCouponHeader$1.INSTANCE);
                PlaceHolderView placeHolderView3 = this.mPhvCoupons;
                if (placeHolderView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPhvCoupons");
                }
                placeHolderView3.addView(itemRowCouponHeader);
                int i = 0;
                for (T t : campaignGroup.getCampaigns()) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    ItemRowCoupon itemRowCoupon = new ItemRowCoupon(t, new CouponsFragment$initActiveCoupons$$inlined$forEachIndexed$lambda$1(i, this));
                    PlaceHolderView placeHolderView4 = this.mPhvCoupons;
                    if (placeHolderView4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mPhvCoupons");
                    }
                    placeHolderView4.addView(itemRowCoupon);
                    i = i2;
                }
            }
        }
    }

    private final void initToolbar() {
        ImageView imageView;
        TextView textView;
        FrameLayout frameLayout = (FrameLayout) getRootView().findViewById(R.id.toolbar);
        if (this.toolbarTitle != null) {
            if (!(frameLayout == null || (textView = (TextView) frameLayout.findViewById(R.id.txt_title_sub_screen)) == null)) {
                textView.setText(this.toolbarTitle);
            }
            if (frameLayout != null && (imageView = (ImageView) frameLayout.findViewById(R.id.img_back)) != null) {
                ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new CouponsFragment$initToolbar$1(this), 1, null);
                return;
            }
            return;
        }
        getRootView().removeView(frameLayout);
    }

    public final void reloadData() {
        ClientManager requireClientManager;
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            initGuestUI();
        } else {
            ((CouponsViewModel) getViewModel()).getAllActiveCoupons(this.forOrderOnly).observe(this, this.mObserveGetActiveCoupons);
        }
    }
}
