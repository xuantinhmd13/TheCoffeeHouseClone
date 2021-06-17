package com.thecoffeehouse.guestapp.screens.stores;

import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "myLatLng", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$updateDistanceToStore$2 extends Lambda implements Function1<AddressSuggestion, Unit> {
    final /* synthetic */ Function0 $onCompleted;
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$updateDistanceToStore$2(StoresFragment storesFragment, Function0 function0) {
        super(1);
        this.this$0 = storesFragment;
        this.$onCompleted = function0;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
        invoke(addressSuggestion);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "myLatLng");
        ArrayList<Store> mStores = this.this$0.getMStores();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(mStores, 10));
        for (T t : mStores) {
            if (t.getDistance() == null) {
                StoresFragment storesFragment = this.this$0;
                LocationStore locationStore = t.getLocationStore();
                double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
                double lat = locationStore != null ? locationStore.getLat() : 0.0d;
                LocationStore locationStore2 = t.getLocationStore();
                if (locationStore2 != null) {
                    d = locationStore2.getLong();
                }
                t.setDistance(Double.valueOf((double) this.this$0.createLocation(addressSuggestion.getLat(), addressSuggestion.getLng()).distanceTo(storesFragment.createLocation(lat, d))));
            }
            arrayList.add(t);
        }
        this.$onCompleted.invoke();
    }
}
