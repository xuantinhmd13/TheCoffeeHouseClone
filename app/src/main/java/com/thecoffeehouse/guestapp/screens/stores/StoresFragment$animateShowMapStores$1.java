package com.thecoffeehouse.guestapp.screens.stores;

import android.view.View;
import android.view.ViewStub;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$animateShowMapStores$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ StoresFragment this$0;

    StoresFragment$animateShowMapStores$1(StoresFragment storesFragment) {
        this.this$0 = storesFragment;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        this.this$0.mInitMapView = true;
        MapViewInteraction mapViewInteractions = this.this$0.getMapViewInteractions();
        Intrinsics.checkNotNullExpressionValue(view, "inflated");
        mapViewInteractions.initMapView$app_liveRelease(view, this.this$0.mSavedInstanceState);
        this.this$0.animateMapView();
        this.this$0.getMapViewInteractions().updateStores(this.this$0.getMStores());
        this.this$0.getMapViewInteractions().getMMapViewLayout().post(new Runnable(this) {
            /* class com.thecoffeehouse.guestapp.screens.stores.StoresFragment$animateShowMapStores$1.AnonymousClass1 */
            final /* synthetic */ StoresFragment$animateShowMapStores$1 this$0;

            {
                this.this$0 = r1;
            }

            public final void run() {
                MainActivity mainActivity = this.this$0.this$0.getMainActivity();
                if (mainActivity != null) {
                    mainActivity.getMyAddress(new Function1<AddressSuggestion, Unit>(this) {
                        /* class com.thecoffeehouse.guestapp.screens.stores.StoresFragment$animateShowMapStores$1.AnonymousClass1.AnonymousClass1 */
                        final /* synthetic */ AnonymousClass1 this$0;

                        {
                            this.this$0 = r1;
                        }

                        /* Return type fixed from 'java.lang.Object' to match base method */
                        /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                        @Override // kotlin.jvm.functions.Function1
                        public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
                            invoke(addressSuggestion);
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AddressSuggestion addressSuggestion) {
                            Intrinsics.checkNotNullParameter(addressSuggestion, "myAddress");
                            this.this$0.this$0.this$0.getMapViewInteractions().setMyLatLng(addressSuggestion.getLatLng());
                            MainActivity mainActivity = this.this$0.this$0.this$0.getMainActivity();
                            Boolean valueOf = mainActivity != null ? Boolean.valueOf(mainActivity.isGrantedLocationPermission()) : null;
                            if (!this.this$0.this$0.this$0.getSearchLayoutInteractions().isSearching()) {
                                this.this$0.this$0.this$0.getMapViewInteractions().viewModeZoom$app_liveRelease(false);
                            } else if (valueOf != null) {
                                this.this$0.this$0.this$0.getMapViewInteractions().searchingModeZoom$app_liveRelease(valueOf.booleanValue());
                            }
                            this.this$0.this$0.this$0.getMapViewInteractions().mapViewListeners$app_liveRelease();
                        }
                    });
                }
            }
        });
    }
}
