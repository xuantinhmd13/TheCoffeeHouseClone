package com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentViewModelLazyKt;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.pickphotos.PickPhotosDialogFragment;
import com.thecoffeehouse.guestapp.screens.order.OrderViewModel;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLButton;
import java.util.HashMap;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 ,2\u00020\u0001:\u0001,B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u0006H\u0002J\b\u0010\u001a\u001a\u00020\fH\u0002J\b\u0010\u001b\u001a\u00020\fH\u0002J\n\u0010\u001c\u001a\u0004\u0018\u00010\u000eH\u0016J\u0010\u0010\u001d\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001fH\u0002J\b\u0010 \u001a\u00020!H\u0002J\b\u0010\"\u001a\u00020\u0006H\u0016J\u001a\u0010#\u001a\u00020\f2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010%H\u0016J\u0010\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0006H\u0002J\u001c\u0010(\u001a\u00020\f2\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f0*H\u0002J\u0010\u0010+\u001a\u00020\f2\u0006\u0010'\u001a\u00020\u0006H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\t0\bR\u00020\u0001X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u00118BX\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderDetailDialogFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "mBtnRating", "Lcom/thecoffeehouse/guestapp/views/TLButton;", "mDefaultRatingStar", "", "mObserveRatingOrder", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment$ObserverBaseResource;", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "mOnDismissListener", "Lkotlin/Function0;", "", "mOrderRef", "", "mOrderType", "mOrderViewModel", "Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "getMOrderViewModel", "()Lcom/thecoffeehouse/guestapp/screens/order/OrderViewModel;", "mOrderViewModel$delegate", "Lkotlin/Lazy;", "mRatingOrderDetailView", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderDetailView;", "checkCanSendRating", "starRating", "disableRatingButton", "enableRatingButton", "getAnalyticScreenName", "initToolbar", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "isGrantedStoragePermission", "", "layoutResId", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openMediaStore", "imageCount", "requestMediaStorePermission", "onCompleted", "Lkotlin/Function1;", "showPickPhotosBottomSheetDialogFragment", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: RatingOrderDetailDialogFragment.kt */
public final class RatingOrderDetailDialogFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private TLButton mBtnRating;
    private int mDefaultRatingStar;
    private BaseBottomSheetDialogFragment.ObserverBaseResource<ServerErrorResponse> mObserveRatingOrder = new BaseBottomSheetDialogFragment.ObserverBaseResource<>(this, new RatingOrderDetailDialogFragment$mObserveRatingOrder$1(this), null, false, false, 14, null);
    private Function0<Unit> mOnDismissListener = RatingOrderDetailDialogFragment$mOnDismissListener$1.INSTANCE;
    private String mOrderRef = "";
    private String mOrderType;
    private final Lazy mOrderViewModel$delegate = FragmentViewModelLazyKt.createViewModelLazy(this, Reflection.getOrCreateKotlinClass(OrderViewModel.class), new RatingOrderDetailDialogFragment$$special$$inlined$activityViewModels$1(this), new RatingOrderDetailDialogFragment$$special$$inlined$activityViewModels$2(this));
    private RatingOrderDetailView mRatingOrderDetailView;

    /* access modifiers changed from: private */
    public final OrderViewModel getMOrderViewModel() {
        return (OrderViewModel) this.mOrderViewModel$delegate.getValue();
    }

    @JvmStatic
    public static final RatingOrderDetailDialogFragment newInstance(String str, String str2, int i, Function0<Unit> function0) {
        return Companion.newInstance(str, str2, i, function0);
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
        return null;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.fragment_rating_order_detail;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J4\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0007¨\u0006\r"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderDetailDialogFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/more/ratingandfeedback/ratingorderdetail/RatingOrderDetailDialogFragment;", "ref", "", "orderType", "defaultRatingStar", "", "onDismissListener", "Lkotlin/Function0;", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: RatingOrderDetailDialogFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX DEBUG: Multi-variable search result rejected for r0v0, resolved type: com.thecoffeehouse.guestapp.screens.more.ratingandfeedback.ratingorderdetail.RatingOrderDetailDialogFragment$Companion */
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ RatingOrderDetailDialogFragment newInstance$default(Companion companion, String str, String str2, int i, Function0 function0, int i2, Object obj) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                function0 = RatingOrderDetailDialogFragment$Companion$newInstance$1.INSTANCE;
            }
            return companion.newInstance(str, str2, i, function0);
        }

        @JvmStatic
        public final RatingOrderDetailDialogFragment newInstance(String str, String str2, int i, Function0<Unit> function0) {
            Intrinsics.checkNotNullParameter(str, "ref");
            Intrinsics.checkNotNullParameter(function0, "onDismissListener");
            RatingOrderDetailDialogFragment ratingOrderDetailDialogFragment = new RatingOrderDetailDialogFragment();
            ratingOrderDetailDialogFragment.mOrderRef = str;
            ratingOrderDetailDialogFragment.mOrderType = str2;
            ratingOrderDetailDialogFragment.mDefaultRatingStar = i;
            ratingOrderDetailDialogFragment.mOnDismissListener = function0;
            return ratingOrderDetailDialogFragment;
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        initToolbar(view);
        RatingOrderDetailView ratingOrderDetailView = (RatingOrderDetailView) view.findViewById(R.id.rating_order_detail_view);
        this.mRatingOrderDetailView = ratingOrderDetailView;
        if (ratingOrderDetailView != null) {
            ratingOrderDetailView.setOnAddPhotosListener(new RatingOrderDetailDialogFragment$onViewCreated$1(this));
        }
        this.mBtnRating = (TLButton) view.findViewById(R.id.btn_rate);
        getMOrderViewModel().getRatingOrderInfo(this.mOrderRef, this.mOrderType).observe(this, new BaseBottomSheetDialogFragment.ObserverBaseResource(this, new RatingOrderDetailDialogFragment$onViewCreated$2(this), new RatingOrderDetailDialogFragment$onViewCreated$3(this), false, false, 12, null));
        RatingOrderDetailView ratingOrderDetailView2 = this.mRatingOrderDetailView;
        if (ratingOrderDetailView2 != null) {
            ratingOrderDetailView2.setOnStarRatingClickListener(new RatingOrderDetailDialogFragment$onViewCreated$4(this));
        }
        checkCanSendRating(this.mDefaultRatingStar);
    }

    /* access modifiers changed from: private */
    public final void checkCanSendRating(int i) {
        if (i == 0) {
            disableRatingButton();
        } else {
            enableRatingButton();
        }
    }

    private final void disableRatingButton() {
        TLButton tLButton = this.mBtnRating;
        if (tLButton != null) {
            tLButton.setEnabled(false);
        }
        TLButton tLButton2 = this.mBtnRating;
        if (tLButton2 != null) {
            tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorBBBBBB)));
        }
    }

    private final void enableRatingButton() {
        TLButton tLButton = this.mBtnRating;
        if (tLButton != null) {
            tLButton.setEnabled(true);
        }
        TLButton tLButton2 = this.mBtnRating;
        if (tLButton2 != null) {
            tLButton2.setBackgroundTintList(ColorStateList.valueOf(ContextCompat.getColor(requireContext(), R.color.colorC5671B)));
        }
        TLButton tLButton3 = this.mBtnRating;
        if (tLButton3 != null) {
            ContextExtsKt.setOnSafeClickListener$default(tLButton3, 0, new RatingOrderDetailDialogFragment$enableRatingButton$1(this), 1, null);
        }
    }

    private final void initToolbar(View view) {
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.toolbar);
        if (viewGroup != null) {
            ViewGroup viewGroup2 = viewGroup;
            TextView textView = (TextView) viewGroup2.findViewById(R.id.txt_title_sub_screen);
            Intrinsics.checkNotNullExpressionValue(textView, "txt_title_sub_screen");
            textView.setText(getString(R.string.str_rating_order));
            ImageView imageView = (ImageView) viewGroup2.findViewById(R.id.img_right_icon);
            Intrinsics.checkNotNullExpressionValue(imageView, "img_right_icon");
            imageView.setVisibility(0);
            ((ImageView) viewGroup2.findViewById(R.id.img_right_icon)).setImageResource(R.drawable.ic_close_bottom_sheet);
            ((ImageView) viewGroup2.findViewById(R.id.img_right_icon)).setOnClickListener(new RatingOrderDetailDialogFragment$initToolbar$$inlined$apply$lambda$1(this));
        }
    }

    /* access modifiers changed from: private */
    public final void openMediaStore(int i) {
        if (isGrantedStoragePermission()) {
            showPickPhotosBottomSheetDialogFragment(i);
        } else {
            requestMediaStorePermission(new RatingOrderDetailDialogFragment$openMediaStore$1(this, i));
        }
    }

    /* access modifiers changed from: private */
    public final void showPickPhotosBottomSheetDialogFragment(int i) {
        PickPhotosDialogFragment newInstance = PickPhotosDialogFragment.Companion.newInstance(i, new RatingOrderDetailDialogFragment$showPickPhotosBottomSheetDialogFragment$pickPhotosDialogFragment$1(this));
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Intrinsics.checkNotNullExpressionValue(activity, "it");
            FragmentManager supportFragmentManager = activity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    private final void requestMediaStorePermission(Function1<? super Boolean, Unit> function1) {
        ActivityResultLauncher registerForActivityResult = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new RatingOrderDetailDialogFragment$requestMediaStorePermission$requestPermission$1(function1));
        Intrinsics.checkNotNullExpressionValue(registerForActivityResult, "registerForActivityResul…E] == true)\n            }");
        if (isGrantedStoragePermission()) {
            function1.invoke(true);
        } else {
            registerForActivityResult.launch(new String[]{"android.permission.READ_EXTERNAL_STORAGE"});
        }
    }

    private final boolean isGrantedStoragePermission() {
        Context context = getContext();
        return context != null && ContextCompat.checkSelfPermission(context, "android.permission.READ_EXTERNAL_STORAGE") == 0;
    }
}
