package com.thecoffeehouse.guestapp.screens.rewards.rewardsandvouchers;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelProvider;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.google.android.material.tabs.TabLayout;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints.AccumulatePointsFragment;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.CouponsFragment;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.RewardsFragment;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 )2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001)B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002J\b\u0010\u0015\u001a\u00020\u0016H\u0016J\b\u0010\u0017\u001a\u00020\u0013H\u0002J\b\u0010\u0018\u001a\u00020\u0013H\u0002J\u001a\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0016J\u000e\u0010 \u001a\u00020\u00132\u0006\u0010!\u001a\u00020\"J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\"J\u000e\u0010%\u001a\u00020\u00132\u0006\u0010&\u001a\u00020\"J\u000e\u0010'\u001a\u00020\u00132\u0006\u0010(\u001a\u00020\u001fR\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX.¢\u0006\u0002\n\u0000R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\u000fX\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006*"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/RewardsAndCouponsFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/RewardsAndCouponsViewModel;", "()V", "mAccumulatePointsFragment", "Lcom/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsFragment;", "mCouponsFragment", "Lcom/thecoffeehouse/guestapp/screens/rewards/coupons/CouponsFragment;", "mRewardsFragment", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsFragment;", "mTabActiveFragment", "Landroidx/fragment/app/Fragment;", "mTabLayoutRewards", "Lcom/google/android/material/tabs/TabLayout;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "changeActiveFragment", "", "fragment", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initFragments", "initRewardsTabLayout", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "openRewardByCategory", MonitorLogServerProtocol.PARAM_CATEGORY, "", "openRewardBySupplier", "supplierId", "openRewardDetail", "rewardId", "switchToTab", "voucherTabPosition", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsAndCouponsFragment.kt */
public final class RewardsAndCouponsFragment extends BaseFragment<RewardsAndCouponsViewModel> {
    private static final int ACCUMULATE_TAB_POSITION = 0;
    private static final int COUPON_TAB_POSITION = 2;
    public static final Companion Companion = new Companion(null);
    private static final int REWARD_TAB_POSITION = 1;
    private HashMap _$_findViewCache;
    private AccumulatePointsFragment mAccumulatePointsFragment;
    private CouponsFragment mCouponsFragment;
    private RewardsFragment mRewardsFragment;
    private Fragment mTabActiveFragment;
    private TabLayout mTabLayoutRewards;
    private final Class<RewardsAndCouponsViewModel> viewModelClass = RewardsAndCouponsViewModel.class;

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
        return R.layout.fragment_rewards_and_coupons;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ AccumulatePointsFragment access$getMAccumulatePointsFragment$p(RewardsAndCouponsFragment rewardsAndCouponsFragment) {
        AccumulatePointsFragment accumulatePointsFragment = rewardsAndCouponsFragment.mAccumulatePointsFragment;
        if (accumulatePointsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAccumulatePointsFragment");
        }
        return accumulatePointsFragment;
    }

    public static final /* synthetic */ CouponsFragment access$getMCouponsFragment$p(RewardsAndCouponsFragment rewardsAndCouponsFragment) {
        CouponsFragment couponsFragment = rewardsAndCouponsFragment.mCouponsFragment;
        if (couponsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mCouponsFragment");
        }
        return couponsFragment;
    }

    public static final /* synthetic */ RewardsFragment access$getMRewardsFragment$p(RewardsAndCouponsFragment rewardsAndCouponsFragment) {
        RewardsFragment rewardsFragment = rewardsAndCouponsFragment.mRewardsFragment;
        if (rewardsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRewardsFragment");
        }
        return rewardsFragment;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0014\u0010\u0003\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004XD¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewardsandvouchers/RewardsAndCouponsFragment$Companion;", "", "()V", "ACCUMULATE_TAB_POSITION", "", "getACCUMULATE_TAB_POSITION", "()I", "COUPON_TAB_POSITION", "getCOUPON_TAB_POSITION", "REWARD_TAB_POSITION", "getREWARD_TAB_POSITION", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RewardsAndCouponsFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int getACCUMULATE_TAB_POSITION() {
            return RewardsAndCouponsFragment.ACCUMULATE_TAB_POSITION;
        }

        public final int getREWARD_TAB_POSITION() {
            return RewardsAndCouponsFragment.REWARD_TAB_POSITION;
        }

        public final int getCOUPON_TAB_POSITION() {
            return RewardsAndCouponsFragment.COUPON_TAB_POSITION;
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<RewardsAndCouponsViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new RewardsAndVouchersViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        this.mAccumulatePointsFragment = AccumulatePointsFragment.Companion.newInstance(new RewardsAndCouponsFragment$initViews$1(this), new RewardsAndCouponsFragment$initViews$2(this));
        this.mCouponsFragment = CouponsFragment.Companion.newInstance$default(CouponsFragment.Companion, null, false, 3, null);
        View findViewById = view.findViewById(R.id.tablayout_rewards);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.tablayout_rewards)");
        this.mTabLayoutRewards = (TabLayout) findViewById;
        this.mRewardsFragment = RewardsFragment.Companion.newInstance(new RewardsAndCouponsFragment$initViews$3(this));
        initFragments();
        initRewardsTabLayout();
    }

    private final void initRewardsTabLayout() {
        TabLayout tabLayout = this.mTabLayoutRewards;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayoutRewards");
        }
        tabLayout.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new RewardsAndCouponsFragment$initRewardsTabLayout$1(this));
    }

    /* access modifiers changed from: private */
    public final void changeActiveFragment(Fragment fragment) {
        FragmentTransaction beginTransaction;
        FragmentTransaction show;
        FragmentTransaction beginTransaction2;
        FragmentTransaction add;
        Fragment findFragmentByTag;
        MainActivity mainActivity = getMainActivity();
        FragmentManager supportFragmentManager = mainActivity != null ? mainActivity.getSupportFragmentManager() : null;
        if (!((supportFragmentManager == null || (findFragmentByTag = supportFragmentManager.findFragmentByTag(fragment.getClass().getSimpleName())) == null) ? false : findFragmentByTag.isAdded())) {
            if (!(supportFragmentManager == null || (beginTransaction2 = supportFragmentManager.beginTransaction()) == null)) {
                Fragment fragment2 = this.mTabActiveFragment;
                if (fragment2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mTabActiveFragment");
                }
                FragmentTransaction hide = beginTransaction2.hide(fragment2);
                if (!(hide == null || (add = hide.add(R.id.fragment_rewards_sub_container, fragment, fragment.getClass().getSimpleName())) == null)) {
                    add.commit();
                }
            }
        } else if (!(supportFragmentManager == null || (beginTransaction = supportFragmentManager.beginTransaction()) == null)) {
            Fragment fragment3 = this.mTabActiveFragment;
            if (fragment3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTabActiveFragment");
            }
            FragmentTransaction hide2 = beginTransaction.hide(fragment3);
            if (!(hide2 == null || (show = hide2.show(fragment)) == null)) {
                show.commit();
            }
        }
        this.mTabActiveFragment = fragment;
    }

    private final void initFragments() {
        FragmentTransaction beginTransaction;
        FragmentManager supportFragmentManager;
        FragmentTransaction beginTransaction2;
        AccumulatePointsFragment accumulatePointsFragment = this.mAccumulatePointsFragment;
        if (accumulatePointsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mAccumulatePointsFragment");
        }
        this.mTabActiveFragment = accumulatePointsFragment;
        MainActivity mainActivity = getMainActivity();
        FragmentManager supportFragmentManager2 = mainActivity != null ? mainActivity.getSupportFragmentManager() : null;
        MainActivity mainActivity2 = getMainActivity();
        if (!(mainActivity2 == null || (supportFragmentManager = mainActivity2.getSupportFragmentManager()) == null || (beginTransaction2 = supportFragmentManager.beginTransaction()) == null)) {
            beginTransaction2.disallowAddToBackStack();
        }
        if (supportFragmentManager2 != null) {
            try {
                FragmentTransaction beginTransaction3 = supportFragmentManager2.beginTransaction();
                if (beginTransaction3 != null) {
                    AccumulatePointsFragment accumulatePointsFragment2 = this.mAccumulatePointsFragment;
                    if (accumulatePointsFragment2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAccumulatePointsFragment");
                    }
                    FragmentTransaction add = beginTransaction3.add(R.id.fragment_rewards_sub_container, accumulatePointsFragment2, AccumulatePointsFragment.class.getSimpleName());
                    if (add != null) {
                        add.commit();
                    }
                }
            } catch (Exception unused) {
                if (supportFragmentManager2 != null && (beginTransaction = supportFragmentManager2.beginTransaction()) != null) {
                    AccumulatePointsFragment accumulatePointsFragment3 = this.mAccumulatePointsFragment;
                    if (accumulatePointsFragment3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mAccumulatePointsFragment");
                    }
                    FragmentTransaction add2 = beginTransaction.add(R.id.fragment_rewards_sub_container, accumulatePointsFragment3, AccumulatePointsFragment.class.getSimpleName());
                    if (add2 != null) {
                        add2.commitAllowingStateLoss();
                    }
                }
            }
        }
    }

    public final void switchToTab(int i) {
        TabLayout tabLayout = this.mTabLayoutRewards;
        if (tabLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayoutRewards");
        }
        TabLayout tabLayout2 = this.mTabLayoutRewards;
        if (tabLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTabLayoutRewards");
        }
        tabLayout.selectTab(tabLayout2.getTabAt(i));
    }

    public final void openRewardDetail(String str) {
        Intrinsics.checkNotNullParameter(str, "rewardId");
        GeneralKt.log("rewardId: " + str);
        RewardsFragment rewardsFragment = this.mRewardsFragment;
        if (rewardsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRewardsFragment");
        }
        rewardsFragment.openRewardDetail(str);
    }

    public final void openRewardBySupplier(String str) {
        Intrinsics.checkNotNullParameter(str, "supplierId");
        RewardsFragment rewardsFragment = this.mRewardsFragment;
        if (rewardsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRewardsFragment");
        }
        rewardsFragment.openRewardBySupplier(str);
    }

    public final void openRewardByCategory(String str) {
        Intrinsics.checkNotNullParameter(str, MonitorLogServerProtocol.PARAM_CATEGORY);
        RewardsFragment rewardsFragment = this.mRewardsFragment;
        if (rewardsFragment == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mRewardsFragment");
        }
        rewardsFragment.openRewardByCategory(str);
    }
}
