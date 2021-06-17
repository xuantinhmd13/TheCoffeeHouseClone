package com.thecoffeehouse.guestapp.screens.rewards.rewards;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentManager;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.rewards.rewarddetail.RewardDetailDialogFragment;
import com.thecoffeehouse.guestapp.services.api.model.rewards.GroupReward;
import com.thecoffeehouse.guestapp.services.api.model.rewards.Reward;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\t\u001a\u00020\nH\u0014J\b\u0010\u000b\u001a\u00020\bH\u0002J\b\u0010\f\u001a\u00020\bH\u0002J\u001a\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014J\b\u0010\u0012\u001a\u00020\u0007H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0015H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsBySuppliersDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "groupReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GroupReward;", "onRedeemDone", "Lkotlin/Function1;", "", "", "getAnalyticScreenName", "", "initRewards", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "showRewardDetailDialogFragment", "reward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/Reward;", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RewardsBySuppliersDialogFragment.kt */
public final class RewardsBySuppliersDialogFragment extends BaseFullScreenDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private GroupReward groupReward;
    private Function1<? super Integer, Unit> onRedeemDone = RewardsBySuppliersDialogFragment$onRedeemDone$1.INSTANCE;

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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b¨\u0006\u000b"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsBySuppliersDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsBySuppliersDialogFragment;", "groupReward", "Lcom/thecoffeehouse/guestapp/services/api/model/rewards/GroupReward;", "onRedeemDone", "Lkotlin/Function1;", "", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RewardsBySuppliersDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final RewardsBySuppliersDialogFragment newInstance(GroupReward groupReward, Function1<? super Integer, Unit> function1) {
            Intrinsics.checkNotNullParameter(groupReward, "groupReward");
            Intrinsics.checkNotNullParameter(function1, "onRedeemDone");
            RewardsBySuppliersDialogFragment rewardsBySuppliersDialogFragment = new RewardsBySuppliersDialogFragment();
            rewardsBySuppliersDialogFragment.groupReward = groupReward;
            rewardsBySuppliersDialogFragment.onRedeemDone = function1;
            return rewardsBySuppliersDialogFragment;
        }
    }

    private final void initRewards() {
        List<Reward> rewards;
        List<Reward> rewards2;
        ((PlaceHolderView) _$_findCachedViewById(R.id.phv_coupons)).setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorWhite));
        GroupReward groupReward2 = this.groupReward;
        if (!(groupReward2 == null || (rewards = groupReward2.getRewards()) == null)) {
            int i = 0;
            for (T t : rewards) {
                int i2 = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ItemRowOtherRewards itemRowOtherRewards = new ItemRowOtherRewards(t, new RewardsBySuppliersDialogFragment$initRewards$$inlined$forEachIndexed$lambda$1(this));
                GroupReward groupReward3 = this.groupReward;
                if (!(groupReward3 == null || (rewards2 = groupReward3.getRewards()) == null || i != CollectionsKt.getLastIndex(rewards2))) {
                    itemRowOtherRewards.setBottomItem(true);
                }
                ((PlaceHolderView) _$_findCachedViewById(R.id.phv_coupons)).addView(itemRowOtherRewards);
                i = i2;
            }
        }
    }

    /* access modifiers changed from: private */
    public final void showRewardDetailDialogFragment(Reward reward) {
        RewardDetailDialogFragment.Companion companion = RewardDetailDialogFragment.Companion;
        String id = reward.getId();
        Intrinsics.checkNotNull(id);
        RewardDetailDialogFragment newInstance = companion.newInstance(id, new RewardsBySuppliersDialogFragment$showRewardDetailDialogFragment$rewardDialogFragment$1(this));
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        initToolbar();
        initRewards();
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        GroupReward groupReward2 = this.groupReward;
        textView.setText(groupReward2 != null ? groupReward2.getName() : null);
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new RewardsBySuppliersDialogFragment$initToolbar$1(this), 1, null);
    }
}
