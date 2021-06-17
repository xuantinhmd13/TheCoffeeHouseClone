package com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery;

import android.view.View;
import androidx.lifecycle.Observer;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.thecoffeehouse.guestapp.repositories.Resource;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationDialog;
import com.thecoffeehouse.guestapp.services.api.model.common.map.Prediction;
import com.thecoffeehouse.guestapp.services.api.model.common.map.ReverseGeoCodingResponse;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: PickLocationDialog.kt */
public final class PickLocationDialog$zoomToSelectedPlace$2 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ PickLocationDialog this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PickLocationDialog$zoomToSelectedPlace$2(PickLocationDialog pickLocationDialog) {
        super(1);
        this.this$0 = pickLocationDialog;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(View view) {
        invoke(view);
        return Unit.INSTANCE;
    }

    public final void invoke(View view) {
        CameraPosition cameraPosition;
        Intrinsics.checkNotNullParameter(view, "it");
        PickLocationDialog pickLocationDialog = this.this$0;
        GoogleMap access$getMGoogleMap$p = PickLocationDialog.access$getMGoogleMap$p(pickLocationDialog);
        PickLocationDialog.access$setMPickLocation$p(pickLocationDialog, (access$getMGoogleMap$p == null || (cameraPosition = access$getMGoogleMap$p.getCameraPosition()) == null) ? null : cameraPosition.target);
        PickLocationDialog.access$getPickLocationViewModel$p(this.this$0).reverseGeoCoding(PickLocationDialog.access$getMPickLocation$p(this.this$0)).observe(this.this$0, new Observer<Resource<? extends ReverseGeoCodingResponse>>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.shippingmethod.delivery.PickLocationDialog$zoomToSelectedPlace$2.AnonymousClass1 */
            final /* synthetic */ PickLocationDialog$zoomToSelectedPlace$2 this$0;

            {
                this.this$0 = r1;
            }

            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // androidx.lifecycle.Observer
            public /* bridge */ /* synthetic */ void onChanged(Resource<? extends ReverseGeoCodingResponse> resource) {
                onChanged((Resource<ReverseGeoCodingResponse>) resource);
            }

            public final void onChanged(Resource<ReverseGeoCodingResponse> resource) {
                List<Prediction> results;
                if (resource == null) {
                    return;
                }
                if (PickLocationDialog.WhenMappings.$EnumSwitchMapping$0[resource.getStatus().ordinal()] == 1) {
                    ReverseGeoCodingResponse data = resource.getData();
                    Prediction prediction = (data == null || (results = data.getResults()) == null) ? null : (Prediction) CollectionsKt.firstOrNull((List) results);
                    GeneralKt.log(prediction);
                    if (prediction != null) {
                        PickLocationDialog.access$showEditTextAddress(this.this$0.this$0, prediction);
                    }
                }
            }
        });
    }
}
