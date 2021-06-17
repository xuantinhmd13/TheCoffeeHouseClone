package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.play.core.review.ReviewManager;
import com.google.android.play.core.review.ReviewManagerFactory;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.GetOrdersHistoryResponse;
import com.thecoffeehouse.guestapp.services.api.model.orders.OrderHistory;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseFullScreenDialogFragment;
import java.util.HashMap;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0002J\u0016\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0002J\b\u0010\u0014\u001a\u00020\u000fH\u0002J\u001a\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u001bH\u0016J\b\u0010\u001c\u001a\u00020\u001dH\u0002J\b\u0010\u001e\u001a\u00020\u000fH\u0002R\u0018\u0010\u0003\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004R\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/RatingAndFeedbackFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment;", "()V", "mObserveRatingOrder", "Lcom/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/GetOrdersHistoryResponse;", "mOrderViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getMOrderViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "mOrderViewModel$delegate", "Lkotlin/Lazy;", "mRcvRatingOrders", "Landroidx/recyclerview/widget/RecyclerView;", "fetchOrderRatingAndFeedback", "", "initRatingOrders", "orders", "", "Lcom/thecoffeehouse/guestapp/services/api/model/orders/OrderHistory;", "initToolbar", "initViews", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "layoutResId", "", "ratingAppFlowIsSufficient", "", "runInAppRatingFlow", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingAndFeedbackFragment.kt */
public final class RatingAndFeedbackFragment extends BaseFullScreenDialogFragment {
    private HashMap _$_findViewCache;
    private final BaseFullScreenDialogFragment.ObserverBaseResource<GetOrdersHistoryResponse> mObserveRatingOrder = new BaseFullScreenDialogFragment.ObserverBaseResource<>(this, new RatingAndFeedbackFragment$mObserveRatingOrder$1(this), null, false, false, 14, null);
    private final Lazy mOrderViewModel$delegate = LazyKt.lazy(new RatingAndFeedbackFragment$mOrderViewModel$2(this));
    private RecyclerView mRcvRatingOrders;

    /* access modifiers changed from: private */
    public final OrderViewModel getMOrderViewModel() {
        return (OrderViewModel) this.mOrderViewModel$delegate.getValue();
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
        return R.layout.fragment_rating_and_feedback;
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
        initToolbar();
        this.mRcvRatingOrders = (RecyclerView) view.findViewById(R.id.rcv_rating_orders);
        fetchOrderRatingAndFeedback();
    }

    /* access modifiers changed from: private */
    public final void fetchOrderRatingAndFeedback() {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        Integer feedbackOrderCount;
        TCHApplication tCHApplication = getTCHApplication();
        OrderViewModel.getOrdersHistory$default(getMOrderViewModel(), 0, (tCHApplication == null || (metadata = tCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null || (feedbackOrderCount = value.getFeedbackOrderCount()) == null) ? 3 : feedbackOrderCount.intValue(), 1, null).observe(this, this.mObserveRatingOrder);
    }

    private final void initToolbar() {
        View _$_findCachedViewById = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "toolbar");
        TextView textView = (TextView) _$_findCachedViewById.findViewById(R.id.txt_title_sub_screen);
        Intrinsics.checkNotNullExpressionValue(textView, "toolbar.txt_title_sub_screen");
        textView.setText(getString(R.string.str_rating_order));
        View _$_findCachedViewById2 = _$_findCachedViewById(R.id.toolbar);
        Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "toolbar");
        ImageView imageView = (ImageView) _$_findCachedViewById2.findViewById(R.id.img_back);
        Intrinsics.checkNotNullExpressionValue(imageView, "toolbar.img_back");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new RatingAndFeedbackFragment$initToolbar$1(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void initRatingOrders(List<OrderHistory> list) {
        RatingOrderAdapter ratingOrderAdapter = new RatingOrderAdapter(list, new RatingAndFeedbackFragment$initRatingOrders$adapter$1(this), new RatingAndFeedbackFragment$initRatingOrders$adapter$2(this));
        RecyclerView recyclerView = this.mRcvRatingOrders;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            recyclerView.setAdapter(ratingOrderAdapter);
        }
    }

    private final boolean ratingAppFlowIsSufficient() {
        return getMOrderViewModel().ratingAppFlowIsSufficient();
    }

    private final void runInAppRatingFlow() {
        ReviewManager create = ReviewManagerFactory.create(requireContext());
        create.requestReviewFlow().addOnCompleteListener(new RatingAndFeedbackFragment$runInAppRatingFlow$1(this, create));
    }
}
