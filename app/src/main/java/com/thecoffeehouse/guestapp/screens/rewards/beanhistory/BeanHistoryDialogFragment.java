package com.thecoffeehouse.guestapp.screens.rewards.beanhistory;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.rewards.rewards.RewardsViewModel;
import com.thecoffeehouse.guestapp.services.api.model.membership.GetBeanHistoryResponse;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014J\b\u0010\u0015\u001a\u00020\u0004H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004XD¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00070\u0006R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/rewards/beanhistory/BeanHistoryDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mLimit", "", "mObserveOrdersHistory", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/membership/GetBeanHistoryResponse;", "mPage", "rewardViewModel", "Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "getRewardViewModel", "()Lcom/thecoffeehouse/guestapp/screens/rewards/rewards/RewardsViewModel;", "rewardViewModel$delegate", "Lkotlin/Lazy;", "initViews", "", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BeanHistoryDialogFragment.kt */
public final class BeanHistoryDialogFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private final int mLimit = 10;
    private final BaseFullScreenDialogFragment.ObserverBaseResource<GetBeanHistoryResponse> mObserveOrdersHistory = new BaseFullScreenDialogFragment.ObserverBaseResource<>(this, new BeanHistoryDialogFragment$mObserveOrdersHistory$1(this), null, false, false, 14, null);
    private int mPage = 1;
    private final Lazy rewardViewModel$delegate = LazyKt.lazy(new BeanHistoryDialogFragment$rewardViewModel$2(this));

    /* access modifiers changed from: private */
    public final RewardsViewModel getRewardViewModel() {
        return (RewardsViewModel) this.rewardViewModel$delegate.getValue();
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
        return R.layout.fragment_recent_orders;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    /* access modifiers changed from: protected */
    @Override // com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment
    public void initViews(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.initViews(view, bundle);
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_bean_history_title));
        BaseFullScreenDialogFragment.addSwipeToRefreshLayout$default(this, null, new BeanHistoryDialogFragment$initViews$1(this), 1, null);
        getRewardViewModel().getBeanHistory(this.mPage, this.mLimit).observe(this, this.mObserveOrdersHistory);
    }
}
