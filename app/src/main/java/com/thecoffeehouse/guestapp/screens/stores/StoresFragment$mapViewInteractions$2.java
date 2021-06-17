package com.thecoffeehouse.guestapp.screens.stores;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/screens/stores/interaction/MapViewInteraction;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$mapViewInteractions$2 extends Lambda implements Function0<MapViewInteraction> {
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$mapViewInteractions$2(StoresFragment storesFragment) {
        super(0);
        this.this$0 = storesFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final MapViewInteraction invoke() {
        AddressSuggestion addressSuggestion;
        MainActivity mainActivity = this.this$0.getMainActivity();
        return new MapViewInteraction((mainActivity == null || (addressSuggestion = mainActivity.getAddressSuggestion()) == null) ? null : addressSuggestion.getLatLng(), this.this$0.getMStores(), new Function1<ClusterMarker, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.stores.StoresFragment$mapViewInteractions$2.AnonymousClass1 */
            final /* synthetic */ StoresFragment$mapViewInteractions$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ClusterMarker clusterMarker) {
                invoke(clusterMarker);
                return Unit.INSTANCE;
            }

            public final void invoke(ClusterMarker clusterMarker) {
                Intrinsics.checkNotNullParameter(clusterMarker, "clusterMarker");
                this.this$0.this$0.onClickClusterMakerListener(clusterMarker);
            }
        });
    }
}
