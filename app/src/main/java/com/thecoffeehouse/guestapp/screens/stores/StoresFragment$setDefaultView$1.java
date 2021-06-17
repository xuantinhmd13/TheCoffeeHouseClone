package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "myAddress", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$setDefaultView$1 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ Boolean $isGrantedPermission;
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$setDefaultView$1(StoresFragment storesFragment, Boolean bool) {
        super(1);
        this.this$0 = storesFragment;
        this.$isGrantedPermission = bool;
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
        Boolean bool = this.$isGrantedPermission;
        if (bool != null) {
            this.this$0.getMapViewInteractions().defaultZoom$app_liveRelease(bool.booleanValue(), addressSuggestion.getLatLng());
        }
        this.this$0.getMPlaceHolderView().scrollToPosition(0);
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null && !mainActivity.isGrantedLocationPermission()) {
            StoresFragment storesFragment = this.this$0;
            storesFragment.showStickToastLayoutRequestPermission(storesFragment.getRootView());
        }
    }
}
