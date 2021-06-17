package com.thecoffeehouse.guestapp.screens.stores;

import android.net.Uri;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.services.api.model.stores.StorePickUpResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/stores/StorePickUpResponse;", "invoke", "com/thecoffeehouse/guestapp/screens/stores/StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2$$special$$inlined$let$lambda$1 extends Lambda implements Function1<StorePickUpResponse, Unit> {
    final /* synthetic */ StoreDetailBottomSheetFragment $dialog$inlined;
    final /* synthetic */ int $storeId;
    final /* synthetic */ StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2 this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2$$special$$inlined$let$lambda$1(int i, StoresFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2 storesFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2, StoreDetailBottomSheetFragment storeDetailBottomSheetFragment) {
        super(1);
        this.$storeId = i;
        this.this$0 = storesFragment$showStoreDetailBottomSheet$storeDetailBottomSheetFragment$2;
        this.$dialog$inlined = storeDetailBottomSheetFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(StorePickUpResponse storePickUpResponse) {
        invoke(storePickUpResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(StorePickUpResponse storePickUpResponse) {
        Intrinsics.checkNotNullParameter(storePickUpResponse, "it");
        if (storePickUpResponse.getStatus()) {
            MainActivity mainActivity = this.this$0.this$0.getMainActivity();
            if (mainActivity != null) {
                Uri parse = Uri.parse("https://order.thecoffeehouse.com/order?method=pickup&sid=" + this.$storeId);
                Intrinsics.checkNotNullExpressionValue(parse, "Uri.parse(\"https://order…d=pickup&sid=${storeId}\")");
                mainActivity.navigateTabOrderWithMethod(parse);
            }
            TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewMenu.name, "Store_Detail");
            TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name, new TrackingData("entryPoints", ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value.Tab_Store));
            this.$dialog$inlined.dismiss();
            return;
        }
        MainActivity mainActivity2 = this.this$0.this$0.getMainActivity();
        if (mainActivity2 != null) {
            String string = this.this$0.this$0.getString(R.string.str_error);
            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
            String string2 = this.this$0.this$0.getString(R.string.str_store_doesnt_pickup);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_store_doesnt_pickup)");
            ContextExtsKt.showOneButtonAlertDialog$default(mainActivity2, string, string2, null, false, null, 28, null);
        }
    }
}
