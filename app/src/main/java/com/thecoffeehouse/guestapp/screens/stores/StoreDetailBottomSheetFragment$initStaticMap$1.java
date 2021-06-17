package com.thecoffeehouse.guestapp.screens.stores;

import android.content.Context;
import android.view.View;
import com.bumptech.glide.Glide;
import com.google.android.gms.maps.model.LatLng;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.screens.order.OrderExtsKt;
import com.thecoffeehouse.guestapp.screens.stores.interaction.MapViewInteraction;
import com.thecoffeehouse.guestapp.services.api.model.stores.LocationStore;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.views.TLImageView;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "run"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoreDetailBottomSheetFragment.kt */
public final class StoreDetailBottomSheetFragment$initStaticMap$1 implements Runnable {
    final /* synthetic */ View $view;
    final /* synthetic */ StoreDetailBottomSheetFragment this$0;

    StoreDetailBottomSheetFragment$initStaticMap$1(StoreDetailBottomSheetFragment storeDetailBottomSheetFragment, View view) {
        this.this$0 = storeDetailBottomSheetFragment;
        this.$view = view;
    }

    public final void run() {
        LocationStore locationStore = StoreDetailBottomSheetFragment.access$getStore$p(this.this$0).getLocationStore();
        double d = FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        double lat = locationStore != null ? locationStore.getLat() : 0.0d;
        LocationStore locationStore2 = StoreDetailBottomSheetFragment.access$getStore$p(this.this$0).getLocationStore();
        if (locationStore2 != null) {
            d = locationStore2.getLong();
        }
        final LatLng latLng = new LatLng(lat, d);
        Pair pair = new Pair(latLng, MapViewInteraction.Companion.getTCH_MARKER_URL());
        MapViewInteraction.Companion companion = MapViewInteraction.Companion;
        Context requireContext = this.this$0.requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        TLImageView tLImageView = (TLImageView) this.$view.findViewById(R.id.img_store_location);
        Intrinsics.checkNotNullExpressionValue(tLImageView, "view.img_store_location");
        int width = tLImageView.getWidth();
        TLImageView tLImageView2 = (TLImageView) this.$view.findViewById(R.id.img_store_location);
        Intrinsics.checkNotNullExpressionValue(tLImageView2, "view.img_store_location");
        Glide.with(this.this$0.requireContext()).load(MapViewInteraction.Companion.getStaticMapUrlByLatLng$default(companion, requireContext, 0, width, tLImageView2.getHeight(), CollectionsKt.listOf(pair), 2, null)).into((TLImageView) this.$view.findViewById(R.id.img_store_location));
        TLImageView tLImageView3 = (TLImageView) this.$view.findViewById(R.id.img_store_location);
        Intrinsics.checkNotNullExpressionValue(tLImageView3, "view.img_store_location");
        ContextExtsKt.setOnSafeClickListener$default(tLImageView3, 0, new Function1<View, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.stores.StoreDetailBottomSheetFragment$initStaticMap$1.AnonymousClass1 */
            final /* synthetic */ StoreDetailBottomSheetFragment$initStaticMap$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(View view) {
                invoke(view);
                return Unit.INSTANCE;
            }

            public final void invoke(View view) {
                Intrinsics.checkNotNullParameter(view, "it");
                Context requireContext = this.this$0.this$0.requireContext();
                Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
                OrderExtsKt.openExternalDirectionApp(requireContext, latLng);
            }
        }, 1, null);
    }
}
