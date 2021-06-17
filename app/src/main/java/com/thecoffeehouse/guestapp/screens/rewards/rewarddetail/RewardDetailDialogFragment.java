package com.thecoffeehouse.guestapp.screens.rewards.rewarddetail;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;
import com.bumptech.glide.RequestManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.RewardsViewModel;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Campaign;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RedeemRewardResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardDetailResponse;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Supplier;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.TLTextView;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import java.util.HashMap;
import java.util.Objects;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 !2\u00020\u0001:\u0001!B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0017\u001a\u00020\u0014H\u0002J\b\u0010\u0018\u001a\u00020\u0016H\u0016J\u0010\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001a\u001a\u00020\tH\u0002J\u001a\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fH\u0014J\b\u0010 \u001a\u00020\u000bH\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X.¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\b\u001a\f\u0012\u0004\u0012\u00020\t0\u0006R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\f\u001a\u00020\r8BX\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00140\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewarddetail/RewardDetailDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "mLayoutCardVoucher", "Landroidx/constraintlayout/widget/ConstraintLayout;", "mObserverRedeemReward", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RedeemRewardResponse;", "mObserverRewardDetail", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardDetailResponse;", "mRedeemPrice", "", "mRewardViewModel", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "getMRewardViewModel", "()Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "mRewardViewModel$delegate", "Lkotlin/Lazy;", "onRedeemDone", "Lkotlin/Function1;", "", "rewardId", "", "addCardLayoutView", "getAnalyticScreenName", "initRewardDetail", "data", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardDetailDialogFragment.kt */
public final class RewardDetailDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private ConstraintLayout mLayoutCardVoucher;
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<RedeemRewardResponse> mObserverRedeemReward = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new RewardDetailDialogFragment$mObserverRedeemReward$1(this), new RewardDetailDialogFragment$mObserverRedeemReward$2(this), false, false, 12, null);
    private final BaseBottomSheetDialogFragment.ObserverBaseResource<RewardDetailResponse> mObserverRewardDetail = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new RewardDetailDialogFragment$mObserverRewardDetail$1(this), null, false, false, 14, null);
    private int mRedeemPrice;
    private final Lazy mRewardViewModel$delegate = LazyKt.lazy(new RewardDetailDialogFragment$mRewardViewModel$2(this));
    private Function1<? super Integer, Unit> onRedeemDone = RewardDetailDialogFragment$onRedeemDone$1.INSTANCE;
    private String rewardId;

    /* access modifiers changed from: private */
    public final RewardsViewModel getMRewardViewModel() {
        return (RewardsViewModel) this.mRewardViewModel$delegate.getValue();
    }

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
        return TrackingScreenService.Reward_Detail;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.fragment_reward_detail;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewarddetail/RewardDetailDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewarddetail/RewardDetailDialogFragment;", "rewardId", "", "onRedeemDone", "Lkotlin/Function1;", "", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RewardDetailDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RewardDetailDialogFragment newInstance(String str, Function1<? super Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(str, "rewardId");
            Intrinsics.checkNotNullParameter(function1, "onRedeemDone");
            RewardDetailDialogFragment rewardDetailDialogFragment = new RewardDetailDialogFragment();
            rewardDetailDialogFragment.rewardId = str;
            rewardDetailDialogFragment.onRedeemDone = function1;
            return rewardDetailDialogFragment;
        }
    }

    /* access modifiers changed from: private */
    public final void initRewardDetail(RewardDetailResponse rewardDetailResponse) {
        TLImageView tLImageView;
        View rootView = getRootView();
        if (!(rootView == null || (tLImageView = (TLImageView) rootView.findViewById(R.id.img_subscription_background)) == null)) {
            Glide.with(requireContext()).load(rewardDetailResponse.getBanner()).into(tLImageView);
        }
        ConstraintLayout constraintLayout = this.mLayoutCardVoucher;
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCardVoucher");
        }
        TextView textView = (TextView) constraintLayout.findViewById(R.id.txt_reward_partner);
        Intrinsics.checkNotNullExpressionValue(textView, "mLayoutCardVoucher.txt_reward_partner");
        Supplier groupReward = rewardDetailResponse.getGroupReward();
        String str = null;
        textView.setText(groupReward != null ? groupReward.getName() : null);
        ConstraintLayout constraintLayout2 = this.mLayoutCardVoucher;
        if (constraintLayout2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCardVoucher");
        }
        TextView textView2 = (TextView) constraintLayout2.findViewById(R.id.txt_voucher_description);
        Intrinsics.checkNotNullExpressionValue(textView2, "mLayoutCardVoucher.txt_voucher_description");
        Campaign campaign = rewardDetailResponse.getCampaign();
        textView2.setText(campaign != null ? campaign.getTitle() : null);
        ConstraintLayout constraintLayout3 = this.mLayoutCardVoucher;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCardVoucher");
        }
        TextView textView3 = (TextView) constraintLayout3.findViewById(R.id.txt_voucher_expired_date);
        Intrinsics.checkNotNullExpressionValue(textView3, "mLayoutCardVoucher.txt_voucher_expired_date");
        Campaign campaign2 = rewardDetailResponse.getCampaign();
        ViewExtsKt.formatHtmlCompact(textView3, campaign2 != null ? campaign2.getTimeLeft() : null);
        RequestManager with = Glide.with(requireContext());
        Campaign campaign3 = rewardDetailResponse.getCampaign();
        RequestBuilder<Drawable> load = with.load(campaign3 != null ? campaign3.getImage() : null);
        ConstraintLayout constraintLayout4 = this.mLayoutCardVoucher;
        if (constraintLayout4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mLayoutCardVoucher");
        }
        load.into((TLImageView) constraintLayout4.findViewById(R.id.img_voucher_icon));
        View rootView2 = getRootView();
        if (rootView2 != null) {
            TextView textView4 = (TextView) rootView2.findViewById(R.id.txt_price_bean);
            Intrinsics.checkNotNullExpressionValue(textView4, "txt_price_bean");
            textView4.setText(String.valueOf(rewardDetailResponse.getPrice()));
            Integer price = rewardDetailResponse.getPrice();
            this.mRedeemPrice = price != null ? price.intValue() : 0;
            TextView textView5 = (TextView) rootView2.findViewById(R.id.txt_reward_valid_time_range);
            Intrinsics.checkNotNullExpressionValue(textView5, "txt_reward_valid_time_range");
            ViewExtsKt.formatHtmlCompact(textView5, rewardDetailResponse.getTimeLeft());
            TextView textView6 = (TextView) rootView2.findViewById(R.id.txt_reward_detail);
            Intrinsics.checkNotNullExpressionValue(textView6, "txt_reward_detail");
            textView6.setText(rewardDetailResponse.getDescription());
            TextView textView7 = (TextView) rootView2.findViewById(R.id.txt_reward_term_of_conditions);
            Intrinsics.checkNotNullExpressionValue(textView7, "txt_reward_term_of_conditions");
            textView7.setText(rewardDetailResponse.getTermCondition());
            TextView textView8 = (TextView) rootView2.findViewById(R.id.txt_reward_supplier_contact);
            Intrinsics.checkNotNullExpressionValue(textView8, "txt_reward_supplier_contact");
            Object[] objArr = new Object[3];
            Supplier groupReward2 = rewardDetailResponse.getGroupReward();
            objArr[0] = groupReward2 != null ? groupReward2.getEmail() : null;
            Supplier groupReward3 = rewardDetailResponse.getGroupReward();
            objArr[1] = groupReward3 != null ? groupReward3.getPhone() : null;
            Supplier groupReward4 = rewardDetailResponse.getGroupReward();
            if (groupReward4 != null) {
                str = groupReward4.getAddress();
            }
            objArr[2] = str;
            textView8.setText(Html.fromHtml(getString(R.string.str_reward_supplier_contact, objArr), 0));
            TextView textView9 = (TextView) rootView2.findViewById(R.id.txt_use_no_bean_for_this_voucher);
            Intrinsics.checkNotNullExpressionValue(textView9, "txt_use_no_bean_for_this_voucher");
            textView9.setText(getString(R.string.str_use_no_bean_for_this_reward, String.valueOf(rewardDetailResponse.getPrice())));
            TLTextView tLTextView = (TLTextView) rootView2.findViewById(R.id.btn_redeem);
            Intrinsics.checkNotNullExpressionValue(tLTextView, "btn_redeem");
            ContextExtsKt.setOnSafeClickListener$default(tLTextView, 0, new RewardDetailDialogFragment$initRewardDetail$$inlined$apply$lambda$1(rootView2, this, rewardDetailResponse), 1, null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public void initViews(View view, Bundle bundle) {
        ImageView imageView;
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        View rootView = getRootView();
        if (!(rootView == null || (imageView = (ImageView) rootView.findViewById(R.id.img_close)) == null)) {
            imageView.setOnClickListener(new RewardDetailDialogFragment$initViews$1(this));
        }
        String str = this.rewardId;
        if (str != null) {
            getMRewardViewModel().getRewardDetail(str).observe(this, this.mObserverRewardDetail);
        }
        addCardLayoutView();
    }

    private final void addCardLayoutView() {
        FrameLayout frameLayout;
        View inflate = LayoutInflater.from(requireContext()).inflate(R.layout.layout_reward_voucher_shadow, (ViewGroup) null, false);
        Objects.requireNonNull(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        this.mLayoutCardVoucher = (ConstraintLayout) inflate;
        View rootView = getRootView();
        if (rootView != null && (frameLayout = (FrameLayout) rootView.findViewById(R.id.view_stub)) != null) {
            ConstraintLayout constraintLayout = this.mLayoutCardVoucher;
            if (constraintLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mLayoutCardVoucher");
            }
            frameLayout.addView(constraintLayout);
        }
    }
}
