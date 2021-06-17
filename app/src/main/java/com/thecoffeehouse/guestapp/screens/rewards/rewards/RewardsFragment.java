package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.PagerSnapHelper;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.rewards.rewarddetail.RewardDetailDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Category;
import com.thecoffeehouse.guestapp.services.api.model.rewards.GroupReward;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 >2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001>B\u0005¢\u0006\u0002\u0010\u0003J&\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00052\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\b\u0010\u001e\u001a\u00020\u001fH\u0014J\b\u0010 \u001a\u00020\u0010H\u0002J\b\u0010!\u001a\u00020\"H\u0016J\u0010\u0010#\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0016\u0010&\u001a\u00020\u00102\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u001cH\u0002J\u0016\u0010'\u001a\u00020\u00102\f\u0010(\u001a\b\u0012\u0004\u0012\u00020%0\u001cH\u0002J\b\u0010)\u001a\u00020\u0010H\u0002J\u0010\u0010*\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010$\u001a\u00020%H\u0002J\u001a\u0010,\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00101\u001a\u00020\u0005H\u0016J\u001a\u00102\u001a\u00020\u00102\u0006\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u000100H\u0014J\b\u00103\u001a\u00020\u0010H\u0014J\u000e\u00104\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u001fJ\u000e\u00105\u001a\u00020\u00102\u0006\u00106\u001a\u00020\u001fJ\u000e\u00107\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u001fJ\u0010\u00109\u001a\u00020\u00102\u0006\u00108\u001a\u00020\u001fH\u0002J\u0010\u0010:\u001a\u00020\u00102\u0006\u0010;\u001a\u00020%H\u0002J\u0010\u0010<\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010=\u001a\u00020\u0010H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005XD¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00020\r0\fR\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X.¢\u0006\u0002\n\u0000R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006?"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "()V", "BIG_REWARDS", "", "MEDIUM_REWARDS", "SMALL_REWARDS", "mLayoutCategories", "Landroid/widget/LinearLayout;", "mLayoutGroupRewards", "mObserveGetRewardDashboard", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GetRewardDashboard;", "mOnRedeemDone", "Lkotlin/Function0;", "", "mTxtCategoryRewardTitle", "Landroid/widget/TextView;", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "addViewCategoryLayout", MonitorLogServerProtocol.PARAM_CATEGORY, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", FirebaseAnalytics.Param.INDEX, "categories", "", "fetchDataLoggedInAndGuestUser", "getAnalyticScreenName", "", "getRewardsDashboard", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initBigRewardGroup", "groupReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GroupReward;", "initCategories", "initFeatureRewards", "groupRewards", "initGuestUI", "initMediumRewardGroup", "initSmallRewardGroup", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "observeViewModel", "onLoggedInUserListener", "openRewardByCategory", "openRewardBySupplier", "supplierId", "openRewardDetail", "rewardId", "showRewardDetailDialogFragment", "showRewardDialogBySupplierDialogFragment", "selectedGroupReward", "showRewardsByCategoryDialogFragment", "toggleViewLoggedInAndGuestUser", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsFragment.kt */
public final class RewardsFragment extends BaseFragment<RewardsViewModel> {
    public static final Companion Companion = new Companion(null);
    private final int BIG_REWARDS = 1;
    private final int MEDIUM_REWARDS = 2;
    private final int SMALL_REWARDS = 3;
    private HashMap _$_findViewCache;
    private LinearLayout mLayoutCategories;
    private LinearLayout mLayoutGroupRewards;
    private final BaseFragment<RewardsViewModel>.ObserverBaseResource mObserveGetRewardDashboard = new BaseFragment.ObserverBaseResource<>(this, new RewardsFragment$mObserveGetRewardDashboard$1(this), null, false, false, 14, null);
    private Function0<Unit> mOnRedeemDone = RewardsFragment$mOnRedeemDone$1.INSTANCE;
    private TextView mTxtCategoryRewardTitle;
    private final Class<RewardsViewModel> viewModelClass = RewardsViewModel.class;

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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Reward_Store;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_rewards;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public final void openRewardByCategory(String str) {
        Intrinsics.checkNotNullParameter(str, MonitorLogServerProtocol.PARAM_CATEGORY);
    }

    public final void openRewardBySupplier(String str) {
        Intrinsics.checkNotNullParameter(str, "supplierId");
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0014\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsFragment;", "onRedeemDone", "Lkotlin/Function0;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RewardsFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RewardsFragment newInstance(Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(function0, "onRedeemDone");
            RewardsFragment rewardsFragment = new RewardsFragment();
            rewardsFragment.mOnRedeemDone = function0;
            return rewardsFragment;
        }
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<RewardsViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new RewardsViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        BaseFragment.addSwipeToRefreshLayout$default(this, null, new RewardsFragment$initViews$1(this), 1, null);
        View findViewById = view.findViewById(R.id.layout_categories);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.layout_categories)");
        this.mLayoutCategories = (LinearLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.layout_group_rewards);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.layout_group_rewards)");
        this.mLayoutGroupRewards = (LinearLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.txt_category_reward_title);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.txt_category_reward_title)");
        this.mTxtCategoryRewardTitle = (TextView) findViewById3;
        toggleViewLoggedInAndGuestUser();
    }

    private final void toggleViewLoggedInAndGuestUser() {
        ClientManager requireClientManager;
        View findViewById = getRootView().findViewById(R.id.view_stub_guest_coupons);
        View findViewById2 = getRootView().findViewById(R.id.layout_logged_in_user);
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            Intrinsics.checkNotNullExpressionValue(findViewById2, "viewLoggedInUser");
            findViewById2.setVisibility(8);
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
        if (findViewById != null) {
            findViewById.setVisibility(8);
        }
        Intrinsics.checkNotNullExpressionValue(findViewById2, "viewLoggedInUser");
        findViewById2.setVisibility(0);
        SwipeRefreshLayout swipeRefreshLayout2 = getSwipeRefreshLayout();
        if (swipeRefreshLayout2 != null) {
            swipeRefreshLayout2.setEnabled(true);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void observeViewModel(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.observeViewModel(view, bundle);
        fetchDataLoggedInAndGuestUser();
    }

    private final void fetchDataLoggedInAndGuestUser() {
        ClientManager requireClientManager;
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            initGuestUI();
        } else {
            getRewardsDashboard();
        }
    }

    private final void initGuestUI() {
        View findViewById = getRootView().findViewById(R.id.view_stub_guest_coupons);
        if (findViewById != null) {
            View findViewById2 = findViewById.findViewById(R.id.txt_login);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "findViewById<TextView>(R.id.txt_login)");
            ContextExtsKt.setOnSafeClickListener$default(findViewById2, 0, new RewardsFragment$initGuestUI$$inlined$apply$lambda$1(this), 1, null);
            View findViewById3 = findViewById.findViewById(R.id.txt_title);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "findViewById<TextView>(R.id.txt_title)");
            ((TextView) findViewById3).setText(getString(R.string.str_login_to_redeem_your_coupons));
        }
    }

    private final void addViewCategoryLayout(Category category, int i, List<Category> list) {
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.item_menu_selection, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
        TextView textView = (TextView) inflate;
        textView.setText(category.getName());
        Glide.with(requireContext()).load(category.getImage()).into(new RewardsFragment$addViewCategoryLayout$1(this, textView, ViewExtsKt.DPtoPX(20.0f), ViewExtsKt.DPtoPX(20.0f)));
        LinearLayout linearLayout = this.mLayoutCategories;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCategories");
        }
        TextView textView2 = textView;
        linearLayout.addView(textView2);
        if (i != CollectionsKt.getLastIndex(list)) {
            View view = new View(requireContext());
            view.setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorLineDivider));
            LinearLayout linearLayout2 = this.mLayoutCategories;
            if (linearLayout2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutCategories");
            }
            linearLayout2.addView(view);
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, ViewExtsKt.DPtoPX(1.0f)));
            ViewExtsKt.marginStart(view, ViewExtsKt.DPtoPX(16.0f));
        }
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new RewardsFragment$addViewCategoryLayout$2(this, category), 1, null);
    }

    /* access modifiers changed from: private */
    public final void initCategories(List<Category> list) {
        LinearLayout linearLayout = this.mLayoutCategories;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCategories");
        }
        linearLayout.removeAllViews();
        if (!list.isEmpty()) {
            TextView textView = this.mTxtCategoryRewardTitle;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTxtCategoryRewardTitle");
            }
            int i = 0;
            textView.setVisibility(0);
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                addViewCategoryLayout(t, i, list);
                i = i2;
            }
            return;
        }
        TextView textView2 = this.mTxtCategoryRewardTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtCategoryRewardTitle");
        }
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void initFeatureRewards(List<GroupReward> list) {
        LinearLayout linearLayout = this.mLayoutGroupRewards;
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutGroupRewards");
        }
        linearLayout.removeAllViews();
        for (GroupReward groupReward : list) {
            Integer style = groupReward.getStyle();
            int i = this.BIG_REWARDS;
            if (style != null && style.intValue() == i) {
                initBigRewardGroup(groupReward);
            } else {
                int i2 = this.MEDIUM_REWARDS;
                if (style != null && style.intValue() == i2) {
                    initMediumRewardGroup(groupReward);
                } else {
                    int i3 = this.SMALL_REWARDS;
                    if (style != null && style.intValue() == i3) {
                        initSmallRewardGroup(groupReward);
                    }
                }
            }
        }
    }

    private final void initSmallRewardGroup(GroupReward groupReward) {
        if (!groupReward.getRewards().isEmpty()) {
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_reward_group, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "layoutRewardGroup");
            TextView textView = (TextView) inflate.findViewById(R.id.txt_reward_group_title);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutRewardGroup.txt_reward_group_title");
            textView.setText(groupReward.getName());
            TLTextView tLTextView = (TLTextView) inflate.findViewById(R.id.txt_see_all);
            Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutRewardGroup.txt_see_all");
            ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new RewardsFragment$initSmallRewardGroup$1(this, groupReward), 1, null);
            PlaceHolderView placeHolderView = (PlaceHolderView) inflate.findViewById(R.id.phv_rewards);
            Intrinsics.checkNotNullExpressionValue(placeHolderView, "layoutRewardGroup.phv_rewards");
            placeHolderView.setLayoutManager(new GridLayoutManager(requireContext(), 3, 0, false));
            new PagerSnapHelper().attachToRecyclerView((PlaceHolderView) inflate.findViewById(R.id.phv_rewards));
            for (Reward reward : groupReward.getRewards()) {
                ((PlaceHolderView) inflate.findViewById(R.id.phv_rewards)).addView(new ItemRowSmallRewards(reward, new RewardsFragment$initSmallRewardGroup$itemRowReward$1(this)));
            }
            LinearLayout linearLayout = this.mLayoutGroupRewards;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutGroupRewards");
            }
            linearLayout.addView(inflate, 0);
        }
    }

    private final void initMediumRewardGroup(GroupReward groupReward) {
        if (!groupReward.getRewards().isEmpty()) {
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_reward_group, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "layoutRewardGroup");
            TextView textView = (TextView) inflate.findViewById(R.id.txt_reward_group_title);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutRewardGroup.txt_reward_group_title");
            textView.setText(groupReward.getName());
            TLTextView tLTextView = (TLTextView) inflate.findViewById(R.id.txt_see_all);
            Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutRewardGroup.txt_see_all");
            ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new RewardsFragment$initMediumRewardGroup$1(this, groupReward), 1, null);
            PlaceHolderView placeHolderView = (PlaceHolderView) inflate.findViewById(R.id.phv_rewards);
            Intrinsics.checkNotNullExpressionValue(placeHolderView, "layoutRewardGroup.phv_rewards");
            placeHolderView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
            for (Reward reward : groupReward.getRewards()) {
                ((PlaceHolderView) inflate.findViewById(R.id.phv_rewards)).addView(new ItemRowMediumRewards(reward, new RewardsFragment$initMediumRewardGroup$itemRowReward$1(this)));
            }
            LinearLayout linearLayout = this.mLayoutGroupRewards;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutGroupRewards");
            }
            linearLayout.addView(inflate, 0);
        }
    }

    private final void initBigRewardGroup(GroupReward groupReward) {
        if (!groupReward.getRewards().isEmpty()) {
            View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_reward_group, (ViewGroup) null, false);
            Intrinsics.checkNotNullExpressionValue(inflate, "layoutRewardGroup");
            TextView textView = (TextView) inflate.findViewById(R.id.txt_reward_group_title);
            Intrinsics.checkNotNullExpressionValue(textView, "layoutRewardGroup.txt_reward_group_title");
            textView.setText(groupReward.getName());
            TLTextView tLTextView = (TLTextView) inflate.findViewById(R.id.txt_see_all);
            Intrinsics.checkNotNullExpressionValue(tLTextView, "layoutRewardGroup.txt_see_all");
            ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new RewardsFragment$initBigRewardGroup$1(this, groupReward), 1, null);
            PlaceHolderView placeHolderView = (PlaceHolderView) inflate.findViewById(R.id.phv_rewards);
            Intrinsics.checkNotNullExpressionValue(placeHolderView, "layoutRewardGroup.phv_rewards");
            placeHolderView.setLayoutManager(new LinearLayoutManager(requireContext(), 0, false));
            for (Reward reward : groupReward.getRewards()) {
                ((PlaceHolderView) inflate.findViewById(R.id.phv_rewards)).addView(new ItemRowBigRewards(reward, new RewardsFragment$initBigRewardGroup$itemRowReward$1(this)));
            }
            LinearLayout linearLayout = this.mLayoutGroupRewards;
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutGroupRewards");
            }
            linearLayout.addView(inflate, 0);
        }
    }

    /* access modifiers changed from: private */
    public final void showRewardDetailDialogFragment(String str) {
        RewardDetailDialogFragment newInstance = RewardDetailDialogFragment.Companion.newInstance(str, new RewardsFragment$showRewardDetailDialogFragment$rewardDialogFragment$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void showRewardDialogBySupplierDialogFragment(GroupReward groupReward) {
        RewardsBySuppliersDialogFragment newInstance = RewardsBySuppliersDialogFragment.Companion.newInstance(groupReward, new RewardsFragment$showRewardDialogBySupplierDialogFragment$rewardsBySuppliersDialogFragment$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: private */
    public final void getRewardsDashboard() {
        ((RewardsViewModel) getViewModel()).getRewardDashboard().observe(this, this.mObserveGetRewardDashboard);
    }

    /* access modifiers changed from: private */
    public final void showRewardsByCategoryDialogFragment(Category category) {
        RewardsByCategoryDialogFragment newInstance = RewardsByCategoryDialogFragment.Companion.newInstance(category, new RewardsFragment$showRewardsByCategoryDialogFragment$rewardsByCategoryDialogFragment$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    public final void openRewardDetail(String str) {
        Intrinsics.checkNotNullParameter(str, "rewardId");
        showRewardDetailDialogFragment(str);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void onLoggedInUserListener() {
        super.onLoggedInUserListener();
        toggleViewLoggedInAndGuestUser();
        fetchDataLoggedInAndGuestUser();
    }
}
