package com.thecoffeehouse.guestapp;

import android.view.MenuItem;
import android.view.View;
import android.widget.PopupWindow;
import com.facebook.appevents.integrity.IntegrityManager;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "item", "Landroid/view/MenuItem;", "onNavigationItemSelected"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$listenBottomNavigationOnClick$1 implements BottomNavigationView.OnNavigationItemSelectedListener {
    final /* synthetic */ MainActivity this$0;

    MainActivity$listenBottomNavigationOnClick$1(MainActivity mainActivity) {
        this.this$0 = mainActivity;
    }

    @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
    public final boolean onNavigationItemSelected(MenuItem menuItem) {
        Intrinsics.checkNotNullParameter(menuItem, "item");
        PopupWindow popupWindow = this.this$0.popupWindow;
        if (popupWindow != null) {
            popupWindow.dismiss();
        }
        this.this$0.mCurrentBottomNavigationItemId = menuItem.getItemId();
        this.this$0.getMStoresFragment().changeViewsToShowMode$app_liveRelease();
        switch (menuItem.getItemId()) {
            case R.id.navigation_home /*{ENCODED_INT: 2131296845}*/:
                BottomNavigationView bottomNavigationView = (BottomNavigationView) this.this$0._$_findCachedViewById(R.id.bottom_navigation);
                Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
                if (bottomNavigationView.getSelectedItemId() == R.id.navigation_home) {
                    this.this$0.getMHomeFragment().scrollToTop();
                }
                MainActivity mainActivity = this.this$0;
                mainActivity.changeActiveFragment(mainActivity.getMHomeFragment());
                this.this$0.showMainHeader();
                View _$_findCachedViewById = this.this$0._$_findCachedViewById(R.id.layout_main_header);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
                View findViewById = _$_findCachedViewById.findViewById(R.id.img_line_divider);
                Intrinsics.checkNotNullExpressionValue(findViewById, "layout_main_header.img_line_divider");
                findViewById.setVisibility(0);
                this.this$0.setPreventCloseKeyboard(false);
                return true;
            case R.id.navigation_more /*{ENCODED_INT: 2131296846}*/:
                this.this$0.showMainHeader();
                MainActivity mainActivity2 = this.this$0;
                mainActivity2.changeActiveFragment(mainActivity2.getMMoreFragment());
                View _$_findCachedViewById2 = this.this$0._$_findCachedViewById(R.id.layout_main_header);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById2, "layout_main_header");
                View findViewById2 = _$_findCachedViewById2.findViewById(R.id.img_line_divider);
                Intrinsics.checkNotNullExpressionValue(findViewById2, "layout_main_header.img_line_divider");
                findViewById2.setVisibility(0);
                this.this$0.setPreventCloseKeyboard(false);
                return true;
            case R.id.navigation_order /*{ENCODED_INT: 2131296847}*/:
                if ((!this.this$0.isGrantedLocationPermission() || !(this.this$0.isEnableLocationService())) && !(this.this$0.isAlreadyRequestPermissionEnable)) {
                    this.this$0.requestLocationPermissionRuntimeListener(new Function2<Boolean, AddressSuggestion, Unit>(this) {
                        /* class com.thecoffeehouse.guestapp.MainActivity$listenBottomNavigationOnClick$1.AnonymousClass1 */
                        final /* synthetic */ MainActivity$listenBottomNavigationOnClick$1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, AddressSuggestion addressSuggestion) {
                            invoke(bool.booleanValue(), addressSuggestion);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z, AddressSuggestion addressSuggestion) {
                            Intrinsics.checkNotNullParameter(addressSuggestion, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                            this.this$0.this$0.hideLoading();
                            this.this$0.this$0.changeActiveFragment(this.this$0.this$0.getMOrderFragment());
                            this.this$0.this$0.showOrderHeader();
                            this.this$0.this$0.setPreventCloseKeyboard(false);
                            TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewMenu.name);
                            this.this$0.this$0.getMOrderFragment().onChangeShippingMethod(this.this$0.this$0.getMOrderFragment().getCurrentMethod(), addressSuggestion, this.this$0.this$0.getMOrderFragment().currentPickUpInfo(), this.this$0.this$0.getMOrderFragment().currentTableInfo());
                        }
                    });
                    return true;
                }
                BottomNavigationView bottomNavigationView2 = (BottomNavigationView) this.this$0._$_findCachedViewById(R.id.bottom_navigation);
                Intrinsics.checkNotNullExpressionValue(bottomNavigationView2, "bottom_navigation");
                if (bottomNavigationView2.getSelectedItemId() == R.id.navigation_order) {
                    this.this$0.getMOrderFragment().scrollToTop();
                }
                MainActivity mainActivity3 = this.this$0;
                mainActivity3.changeActiveFragment(mainActivity3.getMOrderFragment());
                this.this$0.showOrderHeader();
                this.this$0.setPreventCloseKeyboard(false);
                TrackingEventService.Companion.triggerSendTrackingEvent(OrderEvents.EventViewMenu.name);
                return true;
            case R.id.navigation_rewards /*{ENCODED_INT: 2131296848}*/:
                this.this$0.showMainHeader();
                MainActivity mainActivity4 = this.this$0;
                mainActivity4.changeActiveFragment(mainActivity4.getMRewardsAndCouponsFragment());
                View _$_findCachedViewById3 = this.this$0._$_findCachedViewById(R.id.layout_main_header);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById3, "layout_main_header");
                View findViewById3 = _$_findCachedViewById3.findViewById(R.id.img_line_divider);
                Intrinsics.checkNotNullExpressionValue(findViewById3, "layout_main_header.img_line_divider");
                findViewById3.setVisibility(4);
                this.this$0.setPreventCloseKeyboard(false);
                return true;
            case R.id.navigation_stores /*{ENCODED_INT: 2131296849}*/:
                if ((!this.this$0.isGrantedLocationPermission() || !(this.this$0.isEnableLocationService())) && !(this.this$0.isAlreadyRequestPermissionEnable)) {
                    this.this$0.requestLocationPermissionRuntimeListener(new Function2<Boolean, AddressSuggestion, Unit>(this) {
                        /* class com.thecoffeehouse.guestapp.MainActivity$listenBottomNavigationOnClick$1.AnonymousClass3 */
                        final /* synthetic */ MainActivity$listenBottomNavigationOnClick$1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, AddressSuggestion addressSuggestion) {
                            invoke(bool.booleanValue(), addressSuggestion);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(boolean z, AddressSuggestion addressSuggestion) {
                            Intrinsics.checkNotNullParameter(addressSuggestion, IntegrityManager.INTEGRITY_TYPE_ADDRESS);
                            this.this$0.this$0.hideLoading();
                            BottomNavigationView bottomNavigationView = (BottomNavigationView) this.this$0.this$0._$_findCachedViewById(R.id.bottom_navigation);
                            Intrinsics.checkNotNullExpressionValue(bottomNavigationView, "bottom_navigation");
                            if (bottomNavigationView.getSelectedItemId() == R.id.navigation_stores) {
                                try {
                                    this.this$0.this$0.getMStoresFragment().setDefaultView();
                                } catch (Exception unused) {
                                    this.this$0.this$0.getMStoresFragment().setOnInitViewDone(new Function0<Unit>(this) {
                                        /* class com.thecoffeehouse.guestapp.MainActivity$listenBottomNavigationOnClick$1.AnonymousClass3.AnonymousClass1 */
                                        final /* synthetic */ AnonymousClass3 this$0;

                                        {
                                            this.this$0 = r1;
                                        }

                                        @Override // kotlin.jvm.functions.Function0
                                        public final void invoke() {
                                            this.this$0.this$0.this$0.getMStoresFragment().setDefaultView();
                                        }
                                    });
                                }
                            }
                            this.this$0.this$0.changeActiveFragment(this.this$0.this$0.getMStoresFragment());
                            this.this$0.this$0.showMainHeader();
                            this.this$0.this$0.setPreventCloseKeyboard(true);
                            View _$_findCachedViewById = this.this$0.this$0._$_findCachedViewById(R.id.layout_main_header);
                            Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById, "layout_main_header");
                            View findViewById = _$_findCachedViewById.findViewById(R.id.img_line_divider);
                            Intrinsics.checkNotNullExpressionValue(findViewById, "layout_main_header.img_line_divider");
                            findViewById.setVisibility(4);
                        }
                    });
                    return true;
                }
                BottomNavigationView bottomNavigationView3 = (BottomNavigationView) this.this$0._$_findCachedViewById(R.id.bottom_navigation);
                Intrinsics.checkNotNullExpressionValue(bottomNavigationView3, "bottom_navigation");
                if (bottomNavigationView3.getSelectedItemId() == R.id.navigation_stores) {
                    try {
                        this.this$0.getMStoresFragment().setDefaultView();
                    } catch (Exception unused) {
                        this.this$0.getMStoresFragment().setOnInitViewDone(new Function0<Unit>(this) {
                            /* class com.thecoffeehouse.guestapp.MainActivity$listenBottomNavigationOnClick$1.AnonymousClass2 */
                            final /* synthetic */ MainActivity$listenBottomNavigationOnClick$1 this$0;

                            {
                                this.this$0 = r1;
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public final void invoke() {
                                this.this$0.this$0.getMStoresFragment().setDefaultView();
                            }
                        });
                    }
                }
                MainActivity mainActivity5 = this.this$0;
                mainActivity5.changeActiveFragment(mainActivity5.getMStoresFragment());
                this.this$0.showMainHeader();
                this.this$0.setPreventCloseKeyboard(true);
                View _$_findCachedViewById4 = this.this$0._$_findCachedViewById(R.id.layout_main_header);
                Intrinsics.checkNotNullExpressionValue(_$_findCachedViewById4, "layout_main_header");
                View findViewById4 = _$_findCachedViewById4.findViewById(R.id.img_line_divider);
                Intrinsics.checkNotNullExpressionValue(findViewById4, "layout_main_header.img_line_divider");
                findViewById4.setVisibility(4);
                return true;
            default:
                return false;
        }
    }
}
