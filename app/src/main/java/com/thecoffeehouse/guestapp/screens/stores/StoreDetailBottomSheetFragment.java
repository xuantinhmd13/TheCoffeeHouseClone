package com.thecoffeehouse.guestapp.screens.stores;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LiveData;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import com.google.android.gms.maps.model.LatLng;
import com.mindorks.placeholderview.PlaceHolderView;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.configs.TrackingScreenService;
import com.thecoffeehouse.guestapp.screens.imageslider.ImageSliderFragment;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.services.api.model.common.config.GetMetadataResponse;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment;
import com.thecoffeehouse.guestapp.views.TLImageView;
import com.thecoffeehouse.guestapp.views.TLTextViewKt;
import com.thecoffeehouse.guestapp.views.ViewExtsKt;
import com.thecoffeehouse.guestapp.views.base.TextViewAttribute;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0006\u0018\u0000 #2\u00020\u0001:\u0001#B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u000f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0013\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0014\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\u0010\u0010\u0015\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0006H\u0016J\u001a\u0010\u0019\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH\u0016J\u001e\u0010\u001c\u001a\u00020\u00062\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u000b0\u001e2\u0006\u0010\u001f\u001a\u00020\u0017H\u0002J\u0010\u0010 \u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0005H\u0002J\b\u0010!\u001a\u00020\u0006H\u0002J\u0010\u0010\"\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u000eH\u0002R\u001a\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004X.¢\u0006\u0002\n\u0000R \u0010\u0007\u001a\u0014\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\bX.¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X.¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/StoreDetailBottomSheetFragment;", "Lcom/thecoffeehouse/guestapp/views/BaseBottomSheetDialogFragment;", "()V", "onClickFavourite", "Lkotlin/Function1;", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "", "onClickPickup", "Lkotlin/Function2;", "store", "getAnalyticScreenName", "", "initActions", ViewHierarchyConstants.VIEW_KEY, "Landroid/view/View;", "initPickUpAction", "initStaticMap", "initStoreDial", "initStoreFavourite", "initStoreHeader", "initStoreLocation", "initStoreShare", "layoutResId", "", "onResume", "onViewCreated", "savedInstanceState", "Landroid/os/Bundle;", "openImageSliderActivity", "images", "", "selectPosition", "openShareIntentAction", "showDirectionToStore", "viewInitializations", "Companion", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: StoreDetailBottomSheetFragment.kt */
public final class StoreDetailBottomSheetFragment extends BaseBottomSheetDialogFragment {
    public static final Companion Companion = new Companion(null);
    private HashMap _$_findViewCache;
    private Function1<? super Store, Unit> onClickFavourite;
    private Function2<? super StoreDetailBottomSheetFragment, ? super Store, Unit> onClickPickup;
    private Store store;

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
        return "Store_Detail";
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment
    public int layoutResId() {
        return R.layout.layout_pickup_bottom_sheet;
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment, androidx.fragment.app.DialogFragment
    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        _$_clearFindViewByIdCache();
    }

    public static final /* synthetic */ Function1 access$getOnClickFavourite$p(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment) {
        Function1<? super Store, Unit> function1 = storeDetailBottomSheetFragment.onClickFavourite;
        if (function1 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickFavourite");
        }
        return function1;
    }

    public static final /* synthetic */ Function2 access$getOnClickPickup$p(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment) {
        Function2<? super StoreDetailBottomSheetFragment, ? super Store, Unit> function2 = storeDetailBottomSheetFragment.onClickPickup;
        if (function2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onClickPickup");
        }
        return function2;
    }

    public static final /* synthetic */ Store access$getStore$p(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment) {
        Store store2 = storeDetailBottomSheetFragment.store;
        if (store2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        return store2;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J<\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\b2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b¨\u0006\f"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/stores/StoreDetailBottomSheetFragment$Companion;", "", "()V", "newInstance", "Lcom/thecoffeehouse/guestapp/screens/stores/StoreDetailBottomSheetFragment;", "store", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/Store;", "onClickFavourite", "Lkotlin/Function1;", "", "onClickPickup", "Lkotlin/Function2;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
    /* compiled from: StoreDetailBottomSheetFragment.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final StoreDetailBottomSheetFragment newInstance(Store store, Function1<? super Store, Unit> function1, Function2<? super StoreDetailBottomSheetFragment, ? super Store, Unit> function2) {
            Intrinsics.checkNotNullParameter(store, "store");
            Intrinsics.checkNotNullParameter(function1, "onClickFavourite");
            Intrinsics.checkNotNullParameter(function2, "onClickPickup");
            StoreDetailBottomSheetFragment storeDetailBottomSheetFragment = new StoreDetailBottomSheetFragment();
            storeDetailBottomSheetFragment.store = store;
            storeDetailBottomSheetFragment.onClickFavourite = function1;
            storeDetailBottomSheetFragment.onClickPickup = function2;
            return storeDetailBottomSheetFragment;
        }
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        TrackingScreenService.Companion.logScreenViewByLayoutResId("Store_Detail", R.layout.layout_pickup_bottom_sheet);
    }

    @Override // com.thecoffeehouse.guestapp.views.BaseBottomSheetDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, ViewHierarchyConstants.VIEW_KEY);
        super.onViewCreated(view, bundle);
        viewInitializations(view);
    }

    private final void viewInitializations(View view) {
        if (this.store != null) {
            initStoreHeader(view);
            initActions(view);
            initStaticMap(view);
            initPickUpAction(view);
        }
    }

    private final void initPickUpAction(View view) {
        TextView textView = (TextView) view.findViewById(R.id.txt_pick_up);
        Intrinsics.checkNotNullExpressionValue(textView, "view.txt_pick_up");
        Integer valueOf = Integer.valueOf((int) R.dimen._16sp);
        String string = getString(R.string.str_at_this_store);
        Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_at_this_store)");
        TLTextViewKt.setTextMultipleFonts(textView, new TextViewAttribute(getString(R.string.str_order_pick_up) + System.lineSeparator(), valueOf, Integer.valueOf((int) R.font.sfpd_semibold)), new TextViewAttribute(string, valueOf, Integer.valueOf((int) R.font.sfpd_regular)));
        TextView textView2 = (TextView) view.findViewById(R.id.txt_pick_up);
        Intrinsics.checkNotNullExpressionValue(textView2, "view.txt_pick_up");
        ContextExtsKt.setOnSafeClickListener$default(textView2, 0, new StoreDetailBottomSheetFragment$initPickUpAction$1(this), 1, null);
    }

    private final void initStoreHeader(View view) {
        ImageView imageView = (ImageView) view.findViewById(R.id.img_close);
        Intrinsics.checkNotNullExpressionValue(imageView, "view.img_close");
        ContextExtsKt.setOnSafeClickListener$default(imageView, 0, new StoreDetailBottomSheetFragment$initStoreHeader$1(this), 1, null);
        TextView textView = (TextView) view.findViewById(R.id.txt_signature_store);
        Intrinsics.checkNotNullExpressionValue(textView, "view.txt_signature_store");
        Store store2 = this.store;
        if (store2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        textView.setText(store2.getName());
        TextView textView2 = (TextView) view.findViewById(R.id.txt_open_hour);
        Intrinsics.checkNotNullExpressionValue(textView2, "view.txt_open_hour");
        Object[] objArr = new Object[1];
        Store store3 = this.store;
        if (store3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        objArr[0] = store3.getOpenTime();
        textView2.setText(getString(R.string.str_opening_time, objArr));
        PlaceHolderView placeHolderView = (PlaceHolderView) view.findViewById(R.id.phv_store_images);
        Intrinsics.checkNotNullExpressionValue(placeHolderView, "view.phv_store_images");
        placeHolderView.setLayoutManager(new StoreDetailBottomSheetFragment$initStoreHeader$2(this, getContext(), 0, false));
        ViewCompat.setNestedScrollingEnabled((PlaceHolderView) view.findViewById(R.id.phv_store_images), false);
        Store store4 = this.store;
        if (store4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        for (String str : store4.getImages()) {
            ((PlaceHolderView) view.findViewById(R.id.phv_store_images)).addView(new ItemRowImageStore(str, new StoreDetailBottomSheetFragment$initStoreHeader$3(this)));
        }
    }

    /* access modifiers changed from: private */
    public final void openImageSliderActivity(List<String> list, int i) {
        ImageSliderFragment newInstance = ImageSliderFragment.Companion.newInstance(list, i);
        MainActivity mainActivity = getMainActivity();
        if (mainActivity != null) {
            FragmentManager supportFragmentManager = mainActivity.getSupportFragmentManager();
            Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "it.supportFragmentManager");
            newInstance.show(supportFragmentManager, (String) null);
        }
    }

    private final void initStaticMap(View view) {
        TLImageView tLImageView = (TLImageView) view.findViewById(R.id.img_store_location);
        if (tLImageView != null) {
            tLImageView.post(new StoreDetailBottomSheetFragment$initStaticMap$1(this, view));
        }
    }

    private final void initActions(View view) {
        initStoreLocation(view);
        initStoreFavourite(view);
        initStoreShare(view);
        initStoreDial(view);
    }

    private final void initStoreDial(View view) {
        LiveData<GetMetadataResponse> metadata;
        GetMetadataResponse value;
        View findViewById = view.findViewById(R.id.layout_call_us);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.layout_call_us");
        TLImageView tLImageView = (TLImageView) findViewById.findViewById(R.id.img_icon_action);
        Intrinsics.checkNotNullExpressionValue(tLImageView, "view.layout_call_us.img_icon_action");
        ViewExtsKt.setDrawable(tLImageView, R.drawable.ic_phone);
        MainActivity mainActivity = getMainActivity();
        String str = null;
        Application application = mainActivity != null ? mainActivity.getApplication() : null;
        if (!(application instanceof TCHApplication)) {
            application = null;
        }
        TCHApplication tCHApplication = (TCHApplication) application;
        if (!(tCHApplication == null || (metadata = tCHApplication.m0getMetadata()) == null || (value = metadata.getValue()) == null)) {
            str = value.getCallCenter();
        }
        if (str != null) {
            View findViewById2 = view.findViewById(R.id.layout_call_us);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.layout_call_us");
            TextView textView = (TextView) findViewById2.findViewById(R.id.txt_title_action);
            Intrinsics.checkNotNullExpressionValue(textView, "view.layout_call_us.txt_title_action");
            textView.setText(getString(R.string.str_call_us, str));
            view.findViewById(R.id.layout_call_us).setOnClickListener(new StoreDetailBottomSheetFragment$initStoreDial$$inlined$let$lambda$1(this, view, str));
        }
    }

    private final void initStoreShare(View view) {
        View findViewById = view.findViewById(R.id.layout_share_with_friend);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.layout_share_with_friend");
        TLImageView tLImageView = (TLImageView) findViewById.findViewById(R.id.img_icon_action);
        Intrinsics.checkNotNullExpressionValue(tLImageView, "view.layout_share_with_friend.img_icon_action");
        ViewExtsKt.setDrawable(tLImageView, R.drawable.ic_share);
        View findViewById2 = view.findViewById(R.id.layout_share_with_friend);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.layout_share_with_friend");
        TextView textView = (TextView) findViewById2.findViewById(R.id.txt_title_action);
        Intrinsics.checkNotNullExpressionValue(textView, "view.layout_share_with_friend.txt_title_action");
        textView.setText(getString(R.string.str_share_with_friend));
        View findViewById3 = view.findViewById(R.id.layout_share_with_friend);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.layout_share_with_friend");
        ContextExtsKt.setOnSafeClickListener$default(findViewById3, 0, new StoreDetailBottomSheetFragment$initStoreShare$1(this), 1, null);
    }

    /* access modifiers changed from: private */
    public final void openShareIntentAction(Store store2) {
        LatLng latLng;
        LocationStore locationStore = store2.getLocationStore();
        if (locationStore != null && (latLng = locationStore.getLatLng()) != null) {
            String string = getString(R.string.str_share_with_friend_body, OrderExtsKt.uriMapDirectionFromCurrentLocation(latLng));
            Intrinsics.checkNotNullExpressionValue(string, "getString(\n             …ocation(it)\n            )");
            Intent intent = new Intent();
            intent.setAction("android.intent.action.SEND");
            intent.putExtra("android.intent.extra.TEXT", string);
            intent.setType("text/plain");
            startActivity(Intent.createChooser(intent, null));
        }
    }

    /* access modifiers changed from: private */
    public final void initStoreFavourite(View view) {
        View findViewById = view.findViewById(R.id.layout_add_favourite);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.layout_add_favourite");
        TLImageView tLImageView = (TLImageView) findViewById.findViewById(R.id.img_icon_action);
        Intrinsics.checkNotNullExpressionValue(tLImageView, "view.layout_add_favourite.img_icon_action");
        ViewExtsKt.setDrawable(tLImageView, R.drawable.ic_star_filled);
        Store store2 = this.store;
        if (store2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        if (store2.isFavourite()) {
            View findViewById2 = view.findViewById(R.id.layout_add_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById2, "view.layout_add_favourite");
            TLImageView tLImageView2 = (TLImageView) findViewById2.findViewById(R.id.img_icon_action);
            Intrinsics.checkNotNullExpressionValue(tLImageView2, "view.layout_add_favourite.img_icon_action");
            ViewExtsKt.setTint(tLImageView2, R.color.colorF6A81F);
            View findViewById3 = view.findViewById(R.id.layout_add_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById3, "view.layout_add_favourite");
            ((TLImageView) findViewById3.findViewById(R.id.img_icon_action)).setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorFEF2DF));
            View findViewById4 = view.findViewById(R.id.layout_add_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById4, "view.layout_add_favourite");
            TextView textView = (TextView) findViewById4.findViewById(R.id.txt_title_action);
            Intrinsics.checkNotNullExpressionValue(textView, "view.layout_add_favourite.txt_title_action");
            textView.setText(getString(R.string.str_favourite_stores));
        } else {
            View findViewById5 = view.findViewById(R.id.layout_add_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById5, "view.layout_add_favourite");
            TLImageView tLImageView3 = (TLImageView) findViewById5.findViewById(R.id.img_icon_action);
            Intrinsics.checkNotNullExpressionValue(tLImageView3, "view.layout_add_favourite.img_icon_action");
            ViewExtsKt.setTint(tLImageView3, R.color.color838387);
            View findViewById6 = view.findViewById(R.id.layout_add_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById6, "view.layout_add_favourite");
            ((TLImageView) findViewById6.findViewById(R.id.img_icon_action)).setBackgroundColor(ContextCompat.getColor(requireContext(), R.color.colorF5F5F5));
            View findViewById7 = view.findViewById(R.id.layout_add_favourite);
            Intrinsics.checkNotNullExpressionValue(findViewById7, "view.layout_add_favourite");
            TextView textView2 = (TextView) findViewById7.findViewById(R.id.txt_title_action);
            Intrinsics.checkNotNullExpressionValue(textView2, "view.layout_add_favourite.txt_title_action");
            textView2.setText(getString(R.string.str_add_to_favourites));
        }
        View findViewById8 = view.findViewById(R.id.layout_add_favourite);
        Intrinsics.checkNotNullExpressionValue(findViewById8, "view.layout_add_favourite");
        ContextExtsKt.setOnSafeClickListener$default(findViewById8, 0, new StoreDetailBottomSheetFragment$initStoreFavourite$1(this, view), 1, null);
    }

    private final void initStoreLocation(View view) {
        View findViewById = view.findViewById(R.id.layout_pick_up_address);
        Intrinsics.checkNotNullExpressionValue(findViewById, "view.layout_pick_up_address");
        TLImageView tLImageView = (TLImageView) findViewById.findViewById(R.id.img_icon_action);
        Intrinsics.checkNotNullExpressionValue(tLImageView, "view.layout_pick_up_address.img_icon_action");
        ViewExtsKt.setDrawable(tLImageView, R.drawable.ic_direction);
        View findViewById2 = view.findViewById(R.id.layout_pick_up_address);
        Intrinsics.checkNotNullExpressionValue(findViewById2, "view.layout_pick_up_address");
        ContextExtsKt.setOnSafeClickListener$default(findViewById2, 0, new StoreDetailBottomSheetFragment$initStoreLocation$1(this), 1, null);
        View findViewById3 = view.findViewById(R.id.layout_pick_up_address);
        Intrinsics.checkNotNullExpressionValue(findViewById3, "view.layout_pick_up_address");
        TextView textView = (TextView) findViewById3.findViewById(R.id.txt_title_action);
        Intrinsics.checkNotNullExpressionValue(textView, "view.layout_pick_up_address.txt_title_action");
        Store store2 = this.store;
        if (store2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("store");
        }
        textView.setText(store2.getFullAddress());
    }

    /* access modifiers changed from: private */
    public final void showDirectionToStore() {
        MainActivity mainActivity = getMainActivity();
        Objects.requireNonNull(mainActivity, "null cannot be cast to non-null type com.thecoffeehouse.guestapp.MainActivity");
        mainActivity.getMyAddress(new StoreDetailBottomSheetFragment$showDirectionToStore$1(this));
    }
}
