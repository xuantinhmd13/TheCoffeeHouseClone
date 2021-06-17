package com.thecoffeehouse.guestapp.screens.rewards.accumulatepoints;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Application;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.VectorDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSeekBar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModelProvider;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.bumptech.glide.Glide;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.zxing.BarcodeFormat;
import com.journeyapps.barcodescanner.BarcodeEncoder;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.rewards.RewardExtsKt;
import com.thecoffeehouse.guestapp.screens.rewards.coupons.ItemRowCoupon;
import com.thecoffeehouse.guestapp.screens.rewards.rewarddetail.RewardDetailDialogFragment;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.ItemRowOtherRewards;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.common.config.RankInfoItem;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetMembershipResponse;
import com.thecoffeehouse.guestapp.services.api.model.membership.Profile;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 _2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001_B\u0005¢\u0006\u0002\u0010\u0003J&\u0010.\u001a\u00020\u00172\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\f\u00103\u001a\b\u0012\u0004\u0012\u00020004H\u0002J\u0018\u00105\u001a\u00020\u00172\u0006\u00106\u001a\u00020\u00072\u0006\u00107\u001a\u000208H\u0002J\u0018\u00109\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u000208H\u0002J \u0010=\u001a\u00020\u00172\u0006\u0010>\u001a\u00020\u00052\u0006\u0010?\u001a\u0002022\u0006\u0010@\u001a\u000202H\u0002J\n\u0010A\u001a\u0004\u0018\u00010BH\u0014J\b\u0010C\u001a\u00020DH\u0016J\u0010\u0010E\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;H\u0002J\b\u0010F\u001a\u00020\u0017H\u0002J\u0012\u0010G\u001a\u00020\u00172\b\u0010H\u001a\u0004\u0018\u00010\u0010H\u0002J\u0018\u0010I\u001a\u00020\u00172\u000e\u00103\u001a\n\u0012\u0004\u0012\u000200\u0018\u000104H\u0002J\u0018\u0010J\u001a\u00020\u00172\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020L\u0018\u000104H\u0002J\u001a\u0010M\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\u001e\u0010P\u001a\u00020Q2\f\u0010R\u001a\b\u0012\u0004\u0012\u00020S042\u0006\u0010T\u001a\u00020SH\u0002J\b\u0010U\u001a\u000202H\u0016J\u001a\u0010V\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\u001a\u0010W\u001a\u00020\u00172\u0006\u0010:\u001a\u00020;2\b\u0010N\u001a\u0004\u0018\u00010OH\u0014J\b\u0010X\u001a\u00020\u0017H\u0014J\u0006\u0010Y\u001a\u00020\u0017J\u0010\u0010Z\u001a\u00020\u00172\u0006\u0010/\u001a\u000200H\u0002J\b\u0010[\u001a\u00020\u0017H\u0002J\b\u0010\\\u001a\u00020\u0017H\u0002J\b\u0010]\u001a\u00020\u0017H\u0002J\b\u0010^\u001a\u00020\u0017H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X.¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\tX.¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00140\u0012R\b\u0012\u0004\u0012\u00020\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001aX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX.¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u001fX.¢\u0006\u0002\n\u0000R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00020+X\u0004¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-¨\u0006`"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsFragment;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment;", "Lcom/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsViewModel;", "()V", "mImgBarcode", "Landroid/widget/ImageView;", "mLayoutCard", "Landroidx/cardview/widget/CardView;", "mLayoutCardBackground", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mLayoutFooter", "mLayoutRedeemReward", "mLayoutRewardHistory", "mLayoutYourInterest", "mLayoutYourVoucher", "mMembershipResponse", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetMembershipResponse;", "mObserveGetMembership", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$ObserverBaseResource;", "mObserveMergeCouponReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/PromotionDashboardResponse;", "mOnSwitchTabReward", "Lkotlin/Function0;", "", "mOnSwitchTabVoucher", "mPhvOtherRewards", "Lcom/mindorks/placeholderview/PlaceHolderView;", "mPhvVouchers", "mSeekBar", "Landroidx/appcompat/widget/AppCompatSeekBar;", "mTxtBeanExpired", "Landroid/widget/TextView;", "mTxtCouponSeeAll", "mTxtCouponTitle", "mTxtCurrentRank", "mTxtHigherRank", "mTxtPoint", "mTxtRank", "mTxtRewardSeeAll", "mTxtRewardTitle", "mTxtUserBarcode", "mTxtUserName", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "addItemRowOtherReward", "reward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", FirebaseAnalytics.Param.INDEX, "", "rewards", "", "animateChildElevation", "childView", "fl", "", "animateScaleView", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "scale", "animateViewPaddingLeftAndRight", "imgIcon", "start", "end", "getAnalyticScreenName", "", "getViewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "initButtonCards", "initGuestUI", "initMembership", "data", "initOtherRewards", "initReadyToUseCoupons", "coupons", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Campaign;", "initViews", "savedInstanceState", "Landroid/os/Bundle;", "isMaxRank", "", "rankInfos", "Lcom/thecoffeehouse/guestapp/services/api/model/common/config/RankInfoItem;", "rankInfo", "layoutResId", "listenViewInteractions", "observeViewModel", "onLoggedInUserListener", "reloadData", "showRewardDetailDialogFragment", "toggleViewLoggedInAndGuestUser", "updateBackgroundLayoutCard", "updatePointMembership", "updateSeekBarBean", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: AccumulatePointsFragment.kt */
public final class AccumulatePointsFragment extends BaseFragment<AccumulatePointsViewModel> {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private ImageView mImgBarcode;
    private CardView mLayoutCard;
    private ConstraintLayout mLayoutCardBackground;
    private CardView mLayoutFooter;
    private ConstraintLayout mLayoutRedeemReward;
    private ConstraintLayout mLayoutRewardHistory;
    private ConstraintLayout mLayoutYourInterest;
    private ConstraintLayout mLayoutYourVoucher;
    private GetMembershipResponse mMembershipResponse;
    private final BaseFragment<AccumulatePointsViewModel>.ObserverBaseResource mObserveGetMembership = new BaseFragment.ObserverBaseResource<>(this, new AccumulatePointsFragment$mObserveGetMembership$1(this), null, false, false, 14, null);
    private final BaseFragment<AccumulatePointsViewModel>.ObserverBaseResource mObserveMergeCouponReward = new BaseFragment.ObserverBaseResource<>(this, new AccumulatePointsFragment$mObserveMergeCouponReward$1(this), null, false, false, 14, null);
    private Function0<Unit> mOnSwitchTabReward = AccumulatePointsFragment$mOnSwitchTabReward$1.INSTANCE;
    private Function0<Unit> mOnSwitchTabVoucher = AccumulatePointsFragment$mOnSwitchTabVoucher$1.INSTANCE;
    private PlaceHolderView mPhvOtherRewards;
    private PlaceHolderView mPhvVouchers;
    private AppCompatSeekBar mSeekBar;
    private TextView mTxtBeanExpired;
    private TextView mTxtCouponSeeAll;
    private TextView mTxtCouponTitle;
    private TextView mTxtCurrentRank;
    private TextView mTxtHigherRank;
    private TextView mTxtPoint;
    private TextView mTxtRank;
    private TextView mTxtRewardSeeAll;
    private TextView mTxtRewardTitle;
    private TextView mTxtUserBarcode;
    private TextView mTxtUserName;
    private final Class<AccumulatePointsViewModel> viewModelClass = AccumulatePointsViewModel.class;

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
        return TrackingScreenService.Membership_Home;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public int layoutResId() {
        return R.layout.fragment_accumulate_points;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ ImageView access$getMImgBarcode$p(AccumulatePointsFragment accumulatePointsFragment) {
        ImageView imageView = accumulatePointsFragment.mImgBarcode;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgBarcode");
        }
        return imageView;
    }

    public static final /* synthetic */ ConstraintLayout access$getMLayoutYourInterest$p(AccumulatePointsFragment accumulatePointsFragment) {
        ConstraintLayout constraintLayout = accumulatePointsFragment.mLayoutYourInterest;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourInterest");
        }
        return constraintLayout;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public Class<AccumulatePointsViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public ViewModelProvider.Factory getViewModelFactory() {
        return new AccumulatePointsViewModelFactory(this, null);
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        BaseFragment.addSwipeToRefreshLayout$default(this, null, new AccumulatePointsFragment$initViews$1(this), 1, null);
        initButtonCards(view);
        View findViewById = view.findViewById(R.id.phv_coupons);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.phv_coupons)");
        this.mPhvVouchers = (PlaceHolderView) findViewById;
        View findViewById2 = view.findViewById(R.id.phv_rewards);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.phv_rewards)");
        this.mPhvOtherRewards = (PlaceHolderView) findViewById2;
        View findViewById3 = view.findViewById(R.id.txt_rank);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.txt_rank)");
        this.mTxtRank = (TextView) findViewById3;
        View findViewById4 = view.findViewById(R.id.txt_point);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.txt_point)");
        this.mTxtPoint = (TextView) findViewById4;
        View findViewById5 = view.findViewById(R.id.txt_user_name);
        Intrinsics.checkNotNullExpressionValue(findViewById5, "view.findViewById(R.id.txt_user_name)");
        this.mTxtUserName = (TextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.txt_bean_expired);
        Intrinsics.checkNotNullExpressionValue(findViewById6, "view.findViewById(R.id.txt_bean_expired)");
        this.mTxtBeanExpired = (TextView) findViewById6;
        View findViewById7 = view.findViewById(R.id.layout_card_background);
        Intrinsics.checkNotNullExpressionValue(findViewById7, "view.findViewById(R.id.layout_card_background)");
        this.mLayoutCardBackground = (ConstraintLayout) findViewById7;
        View findViewById8 = view.findViewById(R.id.seek_bar_point);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "view.findViewById(R.id.seek_bar_point)");
        this.mSeekBar = (AppCompatSeekBar) findViewById8;
        View findViewById9 = view.findViewById(R.id.txt_current_rank);
        Intrinsics.checkNotNullExpressionValue(findViewById9, "view.findViewById(R.id.txt_current_rank)");
        this.mTxtCurrentRank = (TextView) findViewById9;
        View findViewById10 = view.findViewById(R.id.txt_higher_rank);
        Intrinsics.checkNotNullExpressionValue(findViewById10, "view.findViewById(R.id.txt_higher_rank)");
        this.mTxtHigherRank = (TextView) findViewById10;
        View findViewById11 = view.findViewById(R.id.txt_reward_total);
        Intrinsics.checkNotNullExpressionValue(findViewById11, "view.findViewById(R.id.txt_reward_total)");
        this.mTxtRewardSeeAll = (TextView) findViewById11;
        View findViewById12 = view.findViewById(R.id.txt_coupon_total);
        Intrinsics.checkNotNullExpressionValue(findViewById12, "view.findViewById(R.id.txt_coupon_total)");
        this.mTxtCouponSeeAll = (TextView) findViewById12;
        View findViewById13 = view.findViewById(R.id.txt_coupon_title);
        Intrinsics.checkNotNullExpressionValue(findViewById13, "view.findViewById(R.id.txt_coupon_title)");
        this.mTxtCouponTitle = (TextView) findViewById13;
        View findViewById14 = view.findViewById(R.id.txt_reward_title);
        Intrinsics.checkNotNullExpressionValue(findViewById14, "view.findViewById(R.id.txt_reward_title)");
        this.mTxtRewardTitle = (TextView) findViewById14;
        View findViewById15 = view.findViewById(R.id.txt_user_barcode);
        Intrinsics.checkNotNullExpressionValue(findViewById15, "view.findViewById(R.id.txt_user_barcode)");
        this.mTxtUserBarcode = (TextView) findViewById15;
        View findViewById16 = view.findViewById(R.id.layout_card);
        Intrinsics.checkNotNullExpressionValue(findViewById16, "view.findViewById(R.id.layout_card)");
        this.mLayoutCard = (CardView) findViewById16;
        View findViewById17 = view.findViewById(R.id.cardView);
        Intrinsics.checkNotNullExpressionValue(findViewById17, "view.findViewById(R.id.cardView)");
        this.mLayoutFooter = (CardView) findViewById17;
        View findViewById18 = view.findViewById(R.id.img_bar_code);
        Intrinsics.checkNotNullExpressionValue(findViewById18, "view.findViewById(R.id.img_bar_code)");
        this.mImgBarcode = (ImageView) findViewById18;
        toggleViewLoggedInAndGuestUser();
    }

    private final void toggleViewLoggedInAndGuestUser() {
        ClientManager requireClientManager;
        View findViewById = getRootView().findViewById(R.id.view_stub_guest_accumulate_point);
        View findViewById2 = getRootView().findViewById(R.id.layout_logged_in_user);
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
            SwipeRefreshLayout swipeRefreshLayout = getSwipeRefreshLayout();
            if (swipeRefreshLayout != null) {
                swipeRefreshLayout.setEnabled(false);
            }
            Intrinsics.checkNotNullExpressionValue(findViewById, "viewStubGuest");
            findViewById.setVisibility(0);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "viewLoggedInUser");
            findViewById2.setVisibility(8);
            return;
        }
        Intrinsics.checkNotNullExpressionValue(findViewById, "viewStubGuest");
        findViewById.setVisibility(8);
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
        reloadData();
    }

    private final void initGuestUI() {
        ArrayList arrayList;
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        TCHApplication requireTCHApplication = requireTCHApplication();
        if (requireTCHApplication == null || (metadata = requireTCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null || (arrayList = value.getRankInfo()) == null) {
            arrayList = new ArrayList();
        }
        View findViewById = getRootView().findViewById(R.id.view_stub_guest_accumulate_point);
        View findViewById2 = findViewById.findViewById(R.id.layout_card_guest);
        if (findViewById2 != null) {
            RankInfoItem rankInfoItem = (RankInfoItem) CollectionsKt.firstOrNull((List) arrayList);
            int id = rankInfoItem != null ? rankInfoItem.getId() : 1;
            Context context = findViewById2.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "context");
            findViewById2.setBackground(RewardExtsKt.getRankInfoWithTheme(context, arrayList, id).getThird());
        }
        View findViewById3 = findViewById.findViewById(R.id.txt_login);
        if (findViewById3 != null) {
            ContextExtsKt.setOnSafeClickListener$default(findViewById3, 0, new AccumulatePointsFragment$initGuestUI$$inlined$apply$lambda$1(this), 1, null);
        }
        LinearLayout linearLayout = (LinearLayout) findViewById.findViewById(R.id.layout_rank_logo);
        if (linearLayout != null && linearLayout.getChildCount() == 0) {
            linearLayout.setWeightSum((float) arrayList.size());
            int i = 0;
            for (Object obj : arrayList) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                RankInfoItem rankInfoItem2 = (RankInfoItem) obj;
                View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.item_rank_logo, (ViewGroup) null, false);
                Glide.with(inflate.getContext()).load(rankInfoItem2.getIcon()).into((ImageView) inflate.findViewById(R.id.img_icon_rank));
                View findViewById4 = inflate.findViewById(R.id.txt_name_rank);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "findViewById<TextView>(R.id.txt_name_rank)");
                ((TextView) findViewById4).setText(rankInfoItem2.getName());
                linearLayout.addView(inflate, new LinearLayout.LayoutParams(0, -2, 1.0f));
                Intrinsics.checkNotNullExpressionValue(inflate, "rankView");
                ViewExtsKt.marginTop(inflate, ViewExtsKt.DPtoPX(5.0f));
                ViewExtsKt.marginBottom(inflate, ViewExtsKt.DPtoPX(5.0f));
                ViewExtsKt.marginStart(inflate, ViewExtsKt.DPtoPX(1.0f));
                ViewExtsKt.marginEnd(inflate, ViewExtsKt.DPtoPX(1.0f));
                inflate.setOnClickListener(new AccumulatePointsFragment$initGuestUI$$inlined$apply$lambda$2(inflate, rankInfoItem2, linearLayout, this, arrayList, findViewById));
                i = i2;
            }
        }
    }

    private final void animateViewPaddingLeftAndRight(ImageView imageView, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.addUpdateListener(new AccumulatePointsFragment$animateViewPaddingLeftAndRight$1(imageView));
        ofInt.start();
    }

    /* access modifiers changed from: private */
    public final void animateScaleView(View view, float f) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "scaleX", f);
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(view, "scaleY", f);
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.play(ofFloat).with(ofFloat2);
        animatorSet.start();
    }

    /* access modifiers changed from: private */
    public final void animateChildElevation(CardView cardView, float f) {
        ObjectAnimator.ofFloat(cardView, "cardElevation", cardView.getCardElevation(), f).start();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void onLoggedInUserListener() {
        super.onLoggedInUserListener();
        toggleViewLoggedInAndGuestUser();
        reloadData();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment
    public void listenViewInteractions(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.listenViewInteractions(view, bundle);
        TextView textView = this.mTxtRewardSeeAll;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtRewardSeeAll");
        }
        ContextExtsKt.setOnSafeClickListener$default(textView, 0, new AccumulatePointsFragment$listenViewInteractions$1(this), 1, null);
        TextView textView2 = this.mTxtCouponSeeAll;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtCouponSeeAll");
        }
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new AccumulatePointsFragment$listenViewInteractions$2(this), 1, null);
    }

    private final void addItemRowOtherReward(Reward reward, int i, List<Reward> list) {
        ItemRowOtherRewards itemRowOtherRewards = new ItemRowOtherRewards(reward, new AccumulatePointsFragment$addItemRowOtherReward$rowItemRowFeatureRewards$1(this, reward));
        if (i == CollectionsKt.getLastIndex(list)) {
            itemRowOtherRewards.setBottomItem(true);
        }
        PlaceHolderView placeHolderView = this.mPhvOtherRewards;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvOtherRewards");
        }
        placeHolderView.addView(itemRowOtherRewards);
    }

    private final void initButtonCards(View view) {
        View findViewById = view.findViewById(R.id.layout_redeem_reward);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.findViewById(R.id.layout_redeem_reward)");
        this.mLayoutRedeemReward = (ConstraintLayout) findViewById;
        View findViewById2 = view.findViewById(R.id.layout_your_vouchers);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.findViewById(R.id.layout_your_vouchers)");
        this.mLayoutYourVoucher = (ConstraintLayout) findViewById2;
        View findViewById3 = view.findViewById(R.id.layout_reward_history);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.findViewById(R.id.layout_reward_history)");
        this.mLayoutRewardHistory = (ConstraintLayout) findViewById3;
        View findViewById4 = view.findViewById(R.id.layout_your_interest);
        Intrinsics.checkNotNullExpressionValue(findViewById4, "view.findViewById(R.id.layout_your_interest)");
        this.mLayoutYourInterest = (ConstraintLayout) findViewById4;
        ConstraintLayout constraintLayout = this.mLayoutRedeemReward;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRedeemReward");
        }
        ImageView imageView = (ImageView) constraintLayout.findViewById(R.id.img_icon_tools);
        Intrinsics.checkNotNullExpressionValue(imageView, "mLayoutRedeemReward.img_icon_tools");
        ViewExtsKt.setDrawable(imageView, R.drawable.ic_badge_redeem);
        ConstraintLayout constraintLayout2 = this.mLayoutRedeemReward;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRedeemReward");
        }
        TextView textView = (TextView) constraintLayout2.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView, "mLayoutRedeemReward.txt_title_tools");
        textView.setText(getString(R.string.str_redeem));
        ConstraintLayout constraintLayout3 = this.mLayoutRedeemReward;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRedeemReward");
        }
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout3, 0, new AccumulatePointsFragment$initButtonCards$1(this), 1, null);
        ConstraintLayout constraintLayout4 = this.mLayoutYourVoucher;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourVoucher");
        }
        ImageView imageView2 = (ImageView) constraintLayout4.findViewById(R.id.img_icon_tools);
        Intrinsics.checkNotNullExpressionValue(imageView2, "mLayoutYourVoucher.img_icon_tools");
        ViewExtsKt.setDrawable(imageView2, R.drawable.ic_badge_your_vouchers);
        ConstraintLayout constraintLayout5 = this.mLayoutYourVoucher;
        if (constraintLayout5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourVoucher");
        }
        TextView textView2 = (TextView) constraintLayout5.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView2, "mLayoutYourVoucher.txt_title_tools");
        textView2.setText(getString(R.string.str_your_vouchers));
        ConstraintLayout constraintLayout6 = this.mLayoutYourVoucher;
        if (constraintLayout6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourVoucher");
        }
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout6, 0, new AccumulatePointsFragment$initButtonCards$2(this), 1, null);
        ConstraintLayout constraintLayout7 = this.mLayoutRewardHistory;
        if (constraintLayout7 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRewardHistory");
        }
        ImageView imageView3 = (ImageView) constraintLayout7.findViewById(R.id.img_icon_tools);
        Intrinsics.checkNotNullExpressionValue(imageView3, "mLayoutRewardHistory.img_icon_tools");
        ViewExtsKt.setDrawable(imageView3, R.drawable.ic_badge_transaction_history);
        ConstraintLayout constraintLayout8 = this.mLayoutRewardHistory;
        if (constraintLayout8 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRewardHistory");
        }
        TextView textView3 = (TextView) constraintLayout8.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView3, "mLayoutRewardHistory.txt_title_tools");
        textView3.setText(getString(R.string.str_transaction_history));
        ConstraintLayout constraintLayout9 = this.mLayoutRewardHistory;
        if (constraintLayout9 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRewardHistory");
        }
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout9, 0, new AccumulatePointsFragment$initButtonCards$3(this), 1, null);
        ConstraintLayout constraintLayout10 = this.mLayoutYourInterest;
        if (constraintLayout10 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourInterest");
        }
        ImageView imageView4 = (ImageView) constraintLayout10.findViewById(R.id.img_icon_tools);
        Intrinsics.checkNotNullExpressionValue(imageView4, "mLayoutYourInterest.img_icon_tools");
        ViewExtsKt.setDrawable(imageView4, R.drawable.ic_badge_your_interest);
        ConstraintLayout constraintLayout11 = this.mLayoutYourInterest;
        if (constraintLayout11 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourInterest");
        }
        TextView textView4 = (TextView) constraintLayout11.findViewById(R.id.txt_title_tools);
        Intrinsics.checkNotNullExpressionValue(textView4, "mLayoutYourInterest.txt_title_tools");
        textView4.setText(getString(R.string.str_your_interests));
        ConstraintLayout constraintLayout12 = this.mLayoutYourInterest;
        if (constraintLayout12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourInterest");
        }
        ContextExtsKt.setOnSafeClickListener$default(constraintLayout12, 0, new AccumulatePointsFragment$initButtonCards$4(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void initMembership(GetMembershipResponse getMembershipResponse) {
        RankInfoItem rankInfoItem;
        Object obj;
        String str;
        Profile profile;
        boolean z;
        Object obj2;
        boolean z2;
        Profile profile2;
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        Profile profile3;
        Profile profile4;
        Profile profile5;
        Profile profile6;
        Profile profile7;
        CardView cardView = this.mLayoutCard;
        if (cardView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCard");
        }
        cardView.setVisibility(0);
        CardView cardView2 = this.mLayoutFooter;
        if (cardView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutFooter");
        }
        cardView2.setVisibility(0);
        ConstraintLayout constraintLayout = this.mLayoutRedeemReward;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRedeemReward");
        }
        constraintLayout.setVisibility(0);
        ConstraintLayout constraintLayout2 = this.mLayoutYourVoucher;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourVoucher");
        }
        constraintLayout2.setVisibility(0);
        ConstraintLayout constraintLayout3 = this.mLayoutRewardHistory;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutRewardHistory");
        }
        constraintLayout3.setVisibility(0);
        ConstraintLayout constraintLayout4 = this.mLayoutYourInterest;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutYourInterest");
        }
        constraintLayout4.setVisibility(0);
        this.mMembershipResponse = getMembershipResponse;
        TextView textView = this.mTxtUserName;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtUserName");
        }
        GetMembershipResponse getMembershipResponse2 = this.mMembershipResponse;
        String str2 = null;
        textView.setText((getMembershipResponse2 == null || (profile7 = getMembershipResponse2.getProfile()) == null) ? null : profile7.getUserName());
        TextView textView2 = this.mTxtUserBarcode;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtUserBarcode");
        }
        GetMembershipResponse getMembershipResponse3 = this.mMembershipResponse;
        textView2.setText((getMembershipResponse3 == null || (profile6 = getMembershipResponse3.getProfile()) == null) ? null : profile6.getBarcode());
        TextView textView3 = this.mTxtRank;
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtRank");
        }
        GetMembershipResponse getMembershipResponse4 = this.mMembershipResponse;
        textView3.setText((getMembershipResponse4 == null || (profile5 = getMembershipResponse4.getProfile()) == null) ? null : profile5.getRankName());
        TextView textView4 = this.mTxtCurrentRank;
        if (textView4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtCurrentRank");
        }
        GetMembershipResponse getMembershipResponse5 = this.mMembershipResponse;
        textView4.setText((getMembershipResponse5 == null || (profile4 = getMembershipResponse5.getProfile()) == null) ? null : profile4.getRankName());
        ImageView imageView = this.mImgBarcode;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mImgBarcode");
        }
        ImageView imageView2 = imageView;
        if (!ViewCompat.isLaidOut(imageView2) || imageView2.isLayoutRequested()) {
            imageView2.addOnLayoutChangeListener(new AccumulatePointsFragment$initMembership$$inlined$doOnLayout$1(this));
        } else {
            try {
                BarcodeEncoder barcodeEncoder = new BarcodeEncoder();
                GetMembershipResponse getMembershipResponse6 = this.mMembershipResponse;
                access$getMImgBarcode$p(this).setImageBitmap(barcodeEncoder.encodeBitmap((getMembershipResponse6 == null || (profile3 = getMembershipResponse6.getProfile()) == null) ? null : profile3.getBarcode(), BarcodeFormat.CODE_128, access$getMImgBarcode$p(this).getWidth(), access$getMImgBarcode$p(this).getHeight()));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        TCHApplication requireTCHApplication = requireTCHApplication();
        List<RankInfoItem> rankInfo = (requireTCHApplication == null || (metadata = requireTCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null) ? null : value.getRankInfo();
        if (rankInfo != null) {
            Iterator it = rankInfo.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it.next();
                int id = ((RankInfoItem) obj2).getId();
                GetMembershipResponse getMembershipResponse7 = this.mMembershipResponse;
                Integer rankId = (getMembershipResponse7 == null || (profile2 = getMembershipResponse7.getProfile()) == null) ? null : profile2.getRankId();
                if (rankId != null && id == rankId.intValue()) {
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
            rankInfoItem = (RankInfoItem) obj2;
        } else {
            rankInfoItem = null;
        }
        if (rankInfoItem != null) {
            Iterator it2 = rankInfo.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it2.next();
                if (((RankInfoItem) obj).getMin() == rankInfoItem.getMax() + 1) {
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
            RankInfoItem rankInfoItem2 = (RankInfoItem) obj;
            TextView textView5 = this.mTxtHigherRank;
            if (textView5 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTxtHigherRank");
            }
            if (rankInfoItem2 == null || (str = rankInfoItem2.getName()) == null) {
                str = "";
            }
            textView5.setText(str);
            TextView textView6 = this.mTxtBeanExpired;
            if (textView6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTxtBeanExpired");
            }
            GetMembershipResponse getMembershipResponse8 = this.mMembershipResponse;
            if (!(getMembershipResponse8 == null || (profile = getMembershipResponse8.getProfile()) == null)) {
                str2 = profile.getBeanExpire();
            }
            textView6.setText(str2);
            updateBackgroundLayoutCard();
            updatePointMembership();
            updateSeekBarBean();
        }
    }

    /* access modifiers changed from: private */
    public final void initOtherRewards(List<Reward> list) {
        PlaceHolderView placeHolderView = this.mPhvOtherRewards;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvOtherRewards");
        }
        placeHolderView.removeAllViews();
        List<Reward> list2 = list;
        int i = 0;
        if (!(list2 == null || list2.isEmpty())) {
            TextView textView = this.mTxtRewardTitle;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTxtRewardTitle");
            }
            textView.setVisibility(0);
            for (T t : list) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                addItemRowOtherReward(t, i, list);
                i = i2;
            }
            return;
        }
        TextView textView2 = this.mTxtRewardTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtRewardTitle");
        }
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void initReadyToUseCoupons(List<Campaign> list) {
        PlaceHolderView placeHolderView = this.mPhvVouchers;
        if (placeHolderView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mPhvVouchers");
        }
        placeHolderView.removeAllViews();
        List<Campaign> list2 = list;
        if (!(list2 == null || list2.isEmpty())) {
            TextView textView = this.mTxtCouponTitle;
            if (textView == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mTxtCouponTitle");
            }
            textView.setVisibility(0);
            for (Campaign campaign : list) {
                ItemRowCoupon itemRowCoupon = new ItemRowCoupon(campaign, new AccumulatePointsFragment$initReadyToUseCoupons$expiredSoon$1(this));
                PlaceHolderView placeHolderView2 = this.mPhvVouchers;
                if (placeHolderView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mPhvVouchers");
                }
                placeHolderView2.addView(itemRowCoupon);
            }
            return;
        }
        TextView textView2 = this.mTxtCouponTitle;
        if (textView2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtCouponTitle");
        }
        textView2.setVisibility(8);
    }

    /* access modifiers changed from: private */
    public final void showRewardDetailDialogFragment(Reward reward) {
        RewardDetailDialogFragment.Companion companion = RewardDetailDialogFragment.Companion;
        String id = reward.getId();
        Intrinsics.checkNotNull(id);
        RewardDetailDialogFragment newInstance = companion.newInstance(id, new AccumulatePointsFragment$showRewardDetailDialogFragment$rewardDialogFragment$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    private final void updateBackgroundLayoutCard() {
        Profile profile;
        Integer rankId;
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        MainActivity mainActivity = getMainActivity();
        List<RankInfoItem> list = null;
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        if (!(application instanceof TCHApplication)) {
            application = null;
        }
        TCHApplication tCHApplication = (TCHApplication) application;
        if (!(tCHApplication == null || (metadata = tCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null)) {
            list = value.getRankInfo();
        }
        if (list != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            GetMembershipResponse getMembershipResponse = this.mMembershipResponse;
            Triple<RankInfoItem, String, GradientDrawable> rankInfoWithTheme = RewardExtsKt.getRankInfoWithTheme(requireContext, list, (getMembershipResponse == null || (profile = getMembershipResponse.getProfile()) == null || (rankId = profile.getRankId()) == null) ? 1 : rankId.intValue());
            ConstraintLayout constraintLayout = this.mLayoutCardBackground;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutCardBackground");
            }
            constraintLayout.setBackground(rankInfoWithTheme.getThird());
        }
    }

    /* access modifiers changed from: private */
    public final void updatePointMembership() {
        Profile profile;
        TextView textView = this.mTxtPoint;
        if (textView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mTxtPoint");
        }
        GetMembershipResponse getMembershipResponse = this.mMembershipResponse;
        textView.setText(String.valueOf((getMembershipResponse == null || (profile = getMembershipResponse.getProfile()) == null) ? null : profile.getBean()) + ' ' + getString(R.string.str_bean));
    }

    private final void updateSeekBarBean() {
        Profile profile;
        Integer beenNeedNext;
        Profile profile2;
        Integer rankId;
        MainActivity mainActivity = getMainActivity();
        Integer num = null;
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        Objects.requireNonNull(application, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.TCHApplication");
        GetMetadataResponse value = ((TCHApplication) application).m0getMetadata().getValue();
        List<RankInfoItem> rankInfo = value != null ? value.getRankInfo() : null;
        if (rankInfo != null) {
            Context requireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
            GetMembershipResponse getMembershipResponse = this.mMembershipResponse;
            Triple<RankInfoItem, String, GradientDrawable> rankInfoWithTheme = RewardExtsKt.getRankInfoWithTheme(requireContext, rankInfo, (getMembershipResponse == null || (profile2 = getMembershipResponse.getProfile()) == null || (rankId = profile2.getRankId()) == null) ? 1 : rankId.intValue());
            int[] colors = rankInfoWithTheme.getThird().getColors();
            if (colors != null) {
                num = Integer.valueOf(ArraysKt.first(colors));
            }
            if (num != null) {
                int intValue = num.intValue();
                Drawable drawable = getResources().getDrawable(R.drawable.ic_thumb_seek_bar);
                Objects.requireNonNull(drawable, "null cannot be cast to non-null type android.graphics.drawable.LayerDrawable");
                LayerDrawable layerDrawable = (LayerDrawable) drawable;
                Drawable findDrawableByLayerId = layerDrawable.findDrawableByLayerId(R.id.stroke);
                Objects.requireNonNull(findDrawableByLayerId, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                ((GradientDrawable) findDrawableByLayerId).setStroke(ViewExtsKt.DPtoPX(2.0f), intValue);
                Drawable findDrawableByLayerId2 = layerDrawable.findDrawableByLayerId(R.id.icon_bean);
                Objects.requireNonNull(findDrawableByLayerId2, "null cannot be cast to non-null type android.graphics.drawable.VectorDrawable");
                ((VectorDrawable) findDrawableByLayerId2).setTint(intValue);
                AppCompatSeekBar appCompatSeekBar = this.mSeekBar;
                if (appCompatSeekBar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                }
                appCompatSeekBar.setThumb(layerDrawable);
                AppCompatSeekBar appCompatSeekBar2 = this.mSeekBar;
                if (appCompatSeekBar2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                }
                Drawable progressDrawable = appCompatSeekBar2.getProgressDrawable();
                Objects.requireNonNull(progressDrawable, "null cannot be cast to non-null type android.graphics.drawable.GradientDrawable");
                GradientDrawable gradientDrawable = (GradientDrawable) progressDrawable;
                gradientDrawable.setColors(rankInfoWithTheme.getThird().getColors());
                AppCompatSeekBar appCompatSeekBar3 = this.mSeekBar;
                if (appCompatSeekBar3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                }
                appCompatSeekBar3.setProgressDrawable(gradientDrawable);
            }
            RankInfoItem first = rankInfoWithTheme.getFirst();
            if (first != null) {
                if (isMaxRank(rankInfo, first)) {
                    AppCompatSeekBar appCompatSeekBar4 = this.mSeekBar;
                    if (appCompatSeekBar4 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                    }
                    appCompatSeekBar4.setMax(100);
                    AppCompatSeekBar appCompatSeekBar5 = this.mSeekBar;
                    if (appCompatSeekBar5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                    }
                    appCompatSeekBar5.setProgress(100);
                } else {
                    AppCompatSeekBar appCompatSeekBar6 = this.mSeekBar;
                    if (appCompatSeekBar6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                    }
                    appCompatSeekBar6.setMax(first.getMax() - first.getMin());
                    AppCompatSeekBar appCompatSeekBar7 = this.mSeekBar;
                    if (appCompatSeekBar7 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                    }
                    appCompatSeekBar7.incrementProgressBy(1);
                    GetMembershipResponse getMembershipResponse2 = this.mMembershipResponse;
                    if (!(getMembershipResponse2 == null || (profile = getMembershipResponse2.getProfile()) == null || (beenNeedNext = profile.getBeenNeedNext()) == null)) {
                        int intValue2 = beenNeedNext.intValue();
                        AppCompatSeekBar appCompatSeekBar8 = this.mSeekBar;
                        if (appCompatSeekBar8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
                        }
                        appCompatSeekBar8.setProgress((first.getMax() - intValue2) - first.getMin());
                    }
                }
            }
            AppCompatSeekBar appCompatSeekBar9 = this.mSeekBar;
            if (appCompatSeekBar9 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mSeekBar");
            }
            appCompatSeekBar9.setOnTouchListener(AccumulatePointsFragment$updateSeekBarBean$1$3.INSTANCE);
        }
    }

    private final boolean isMaxRank(List<RankInfoItem> list, RankInfoItem rankInfoItem) {
        List<RankInfoItem> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(it.next().getId()));
        }
        Integer num = (Integer) CollectionsKt.max((Iterable) arrayList);
        if ((num != null ? num.intValue() : 0) == rankInfoItem.getId()) {
            return true;
        }
        return false;
    }

    public final void reloadData() {
        ClientManager requireClientManager;
        if (getContext() != null) {
            TCHApplication requireTCHApplication = requireTCHApplication();
            if (requireTCHApplication == null || (requireClientManager = requireTCHApplication.requireClientManager()) == null || !requireClientManager.isLoggedIn()) {
                initGuestUI();
                return;
            }
            AccumulatePointsFragment accumulatePointsFragment = this;
            ((AccumulatePointsViewModel) getViewModel()).getPromotionDashboard().observe(accumulatePointsFragment, this.mObserveMergeCouponReward);
            ((AccumulatePointsViewModel) getViewModel()).getMembership().observe(accumulatePointsFragment, this.mObserveGetMembership);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¨\u0006\t"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/rewards/accumulatepoints/AccumulatePointsFragment;", "onSwitchTabReward", "Lkotlin/Function0;", "", "onSwitchTabVoucher", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: AccumulatePointsFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccumulatePointsFragment newInstance(Function0<Unit> function0, Function0<Unit> function02) {
            Intrinsics.checkNotNullParameter(function0, "onSwitchTabReward");
            Intrinsics.checkNotNullParameter(function02, "onSwitchTabVoucher");
            AccumulatePointsFragment accumulatePointsFragment = new AccumulatePointsFragment();
            accumulatePointsFragment.mOnSwitchTabReward = function0;
            accumulatePointsFragment.mOnSwitchTabVoucher = function02;
            return accumulatePointsFragment;
        }
    }
}
