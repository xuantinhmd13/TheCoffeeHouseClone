package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.Observer;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.facebook.internal.logging.monitor.MonitorLogServerProtocol;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.repositories.Status;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Category;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.services.api.model.rewards.RewardsFilterResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u0000  2\u00020\u0001:\u0001 B\u0005¢\u0006\u0002\u0010\u0002J\n\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\u0016\u0010\u0015\u001a\u00020\u00122\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00110\u0017H\u0002J\b\u0010\u0018\u001a\u00020\u0012H\u0002J\u001a\u0010\u0019\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0014J\b\u0010\u001e\u001a\u00020\u001fH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u000e¢\u0006\u0002\n\u0000¨\u0006!"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsByCategoryDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", MonitorLogServerProtocol.PARAM_CATEGORY, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", "mObserveRewardFilters", "Landroidx/lifecycle/Observer;", "Lcom/thecoffeehouse/guestapp/repositories/Resource;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/RewardsFilterResponse;", "mRewardViewModel", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "getMRewardViewModel", "()Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "mRewardViewModel$delegate", "Lkotlin/Lazy;", "onShowRewardDetail", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "", "getAnalyticScreenName", "", "initRewards", "otherRewards", "", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsByCategoryDialogFragment.kt */
public final class RewardsByCategoryDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Category category;
    private final Observer<Resource<RewardsFilterResponse>> mObserveRewardFilters = new RewardsByCategoryDialogFragment$mObserveRewardFilters$1(this);
    private final Lazy mRewardViewModel$delegate = LazyKt.lazy(new RewardsByCategoryDialogFragment$mRewardViewModel$2(this));
    private Function1<? super Reward, Unit> onShowRewardDetail = RewardsByCategoryDialogFragment$onShowRewardDetail$1.INSTANCE;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Status.values().length];
            $EnumSwitchMapping$0 = iArr;
            iArr[Status.LOADING.ordinal()] = 1;
            iArr[Status.SUCCESS.ordinal()] = 2;
            iArr[Status.ERROR.ordinal()] = 3;
        }
    }

    private final RewardsViewModel getMRewardViewModel() {
        return (RewardsViewModel) this.mRewardViewModel$delegate.getValue();
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

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public String getAnalyticScreenName() {
        return TrackingScreenService.Reward_List;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public int layoutResId() {
        return R.layout.fragment_coupons;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsByCategoryDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsByCategoryDialogFragment;", MonitorLogServerProtocol.PARAM_CATEGORY, "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Category;", "onShowRewardDetail", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RewardsByCategoryDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RewardsByCategoryDialogFragment newInstance(Category category, Function1<? super Reward, Unit> function1) {
            Intrinsics.checkNotNullParameter(category, MonitorLogServerProtocol.PARAM_CATEGORY);
            Intrinsics.checkNotNullParameter(function1, "onShowRewardDetail");
            RewardsByCategoryDialogFragment rewardsByCategoryDialogFragment = new RewardsByCategoryDialogFragment();
            rewardsByCategoryDialogFragment.category = category;
            rewardsByCategoryDialogFragment.onShowRewardDetail = function1;
            return rewardsByCategoryDialogFragment;
        }
    }

    /* access modifiers changed from: private */
    public final void initRewards(List<Reward> list) {
        ((PlaceHolderView) _$_findCachedViewById(R.id.phv_coupons)).setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorWhite));
        int i = 0;
        for (T t : list) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            ItemRowOtherRewards itemRowOtherRewards = new ItemRowOtherRewards(t, new RewardsByCategoryDialogFragment$initRewards$$inlined$forEachIndexed$lambda$1(this, list));
            if (i == CollectionsKt.getLastIndex(list)) {
                itemRowOtherRewards.setBottomItem(true);
            }
            ((PlaceHolderView) _$_findCachedViewById(R.id.phv_coupons)).addView(itemRowOtherRewards);
            i = i2;
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        getMRewardViewModel().getRewardFilters(this.category).observe(this, this.mObserveRewardFilters);
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        Category category2 = this.category;
        textView.setText(category2 != null ? category2.getName() : null);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new RewardsByCategoryDialogFragment$initToolbar$1(this), 1, null);
    }
}
