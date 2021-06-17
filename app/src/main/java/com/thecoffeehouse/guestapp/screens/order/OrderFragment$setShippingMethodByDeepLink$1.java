package com.thecoffeehouse.guestapp.screens.order;

import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.configs.trackingevents.OrderEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.ShippingMethodEvents;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingData;
import com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.screens.order.menudetail.ProductRecyclerViewAdapter;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import com.thecoffeehouse.guestapp.services.api.model.stores.Store;
import com.thecoffeehouse.guestapp.services.api.model.stores.StorePickUpResponse;
import com.thecoffeehouse.guestapp.utility.ContextExtsKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import java.util.Locale;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$setShippingMethodByDeepLink$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ String $method;
    final /* synthetic */ Integer $storeId;
    final /* synthetic */ String $tableCode;
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$setShippingMethodByDeepLink$1(OrderFragment orderFragment, String str, Integer num, String str2) {
        super(0);
        this.this$0 = orderFragment;
        this.$method = str;
        this.$storeId = num;
        this.$tableCode = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final void invoke() {
        String str = this.$method;
        Locale locale = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale, "Locale.ROOT");
        Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
        String lowerCase = str.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        String deli = ShippingType.INSTANCE.getDELI();
        Locale locale2 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale2, "Locale.ROOT");
        Objects.requireNonNull(deli, "null cannot be cast to non-null type java.lang.String");
        String lowerCase2 = deli.toLowerCase(locale2);
        Intrinsics.checkNotNullExpressionValue(lowerCase2, "(this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, lowerCase2)) {
            StringBuilder append = new StringBuilder().append("method:");
            String str2 = this.$method;
            Locale locale3 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale3, "Locale.ROOT");
            Objects.requireNonNull(str2, "null cannot be cast to non-null type java.lang.String");
            String lowerCase3 = str2.toLowerCase(locale3);
            Intrinsics.checkNotNullExpressionValue(lowerCase3, "(this as java.lang.String).toLowerCase(locale)");
            GeneralKt.log(append.append(lowerCase3).toString());
            this.this$0.getMProductAdapter().setSelectedShippingMethod(this.$method);
            OrderFragment orderFragment = this.this$0;
            orderFragment.onChangeShippingMethod(orderFragment.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
            return;
        }
        String pickup = ShippingType.INSTANCE.getPICKUP();
        Locale locale4 = Locale.ROOT;
        Intrinsics.checkNotNullExpressionValue(locale4, "Locale.ROOT");
        Objects.requireNonNull(pickup, "null cannot be cast to non-null type java.lang.String");
        String lowerCase4 = pickup.toLowerCase(locale4);
        Intrinsics.checkNotNullExpressionValue(lowerCase4, "(this as java.lang.String).toLowerCase(locale)");
        if (Intrinsics.areEqual(lowerCase, lowerCase4)) {
            StringBuilder append2 = new StringBuilder().append("method:");
            String str3 = this.$method;
            Locale locale5 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale5, "Locale.ROOT");
            Objects.requireNonNull(str3, "null cannot be cast to non-null type java.lang.String");
            String lowerCase5 = str3.toLowerCase(locale5);
            Intrinsics.checkNotNullExpressionValue(lowerCase5, "(this as java.lang.String).toLowerCase(locale)");
            GeneralKt.log(append2.append(lowerCase5).toString());
            if (this.$storeId != null) {
                this.this$0.getMStoreViewModel().checkStoreHasPickUpMethod(this.$storeId.intValue()).observe(this.this$0, new BaseFragment.ObserverBaseResource(this.this$0, new Function1<StorePickUpResponse, Unit>(this) {
                    /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$setShippingMethodByDeepLink$1.AnonymousClass1 */
                    final /* synthetic */ OrderFragment$setShippingMethodByDeepLink$1 this$0;

                    {
                        this.this$0 = r1;
                    }

                    /* Return type fixed from 'java.lang.Object' to match base method */
                    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(StorePickUpResponse storePickUpResponse) {
                        invoke(storePickUpResponse);
                        return Unit.INSTANCE;
                    }

                    public final void invoke(StorePickUpResponse storePickUpResponse) {
                        Intrinsics.checkNotNullParameter(storePickUpResponse, "storePickUp");
                        if (storePickUpResponse.getStatus()) {
                            TrackingEventService.Companion.updateSourceTrackingEvent(OrderEvents.EventViewMenu.name, "Store_Detail");
                            TrackingEventService.Companion.collectParamWithEventName(ShippingMethodEvents.EventPickupStoreAddedSuccessfully.name, new TrackingData("entryPoints", ShippingMethodEvents.EventPickupStoreAddedSuccessfully.Value.Tab_Store));
                            Store storeById = this.this$0.this$0.getMStoreViewModel().getStoreById(this.this$0.$storeId.intValue());
                            if (storeById != null) {
                                ProductRecyclerViewAdapter.setPickUpInfo$default(this.this$0.this$0.getMProductAdapter(), storeById, false, 2, null);
                                this.this$0.this$0.onChangeShippingMethod(this.this$0.this$0.getMProductAdapter().getSelectedMethod(), this.this$0.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.this$0.getMProductAdapter().getCurrentAtTableInfo());
                                return;
                            }
                            return;
                        }
                        MainActivity mainActivity = this.this$0.this$0.getMainActivity();
                        if (mainActivity != null) {
                            String string = this.this$0.this$0.getString(R.string.str_error);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_error)");
                            String string2 = this.this$0.this$0.getString(R.string.str_store_doesnt_pickup);
                            Intrinsics.checkNotNullExpressionValue(string2, "getString(R.string.str_store_doesnt_pickup)");
                            ContextExtsKt.showOneButtonAlertDialog$default(mainActivity, string, string2, null, false, null, 28, null);
                        }
                    }
                }, null, false, false, 14, null));
            } else if (this.this$0.getMProductAdapter().getCurrentPickupInfo() == null) {
                this.this$0.showPickUpStoreDialog();
            } else {
                this.this$0.getMProductAdapter().setSelectedShippingMethod(this.$method);
                OrderFragment orderFragment2 = this.this$0;
                orderFragment2.onChangeShippingMethod(orderFragment2.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
            }
        } else {
            String table = ShippingType.INSTANCE.getTABLE();
            Locale locale6 = Locale.ROOT;
            Intrinsics.checkNotNullExpressionValue(locale6, "Locale.ROOT");
            Objects.requireNonNull(table, "null cannot be cast to non-null type java.lang.String");
            String lowerCase6 = table.toLowerCase(locale6);
            Intrinsics.checkNotNullExpressionValue(lowerCase6, "(this as java.lang.String).toLowerCase(locale)");
            if (Intrinsics.areEqual(lowerCase, lowerCase6)) {
                StringBuilder append3 = new StringBuilder().append("method:");
                String str4 = this.$method;
                Locale locale7 = Locale.ROOT;
                Intrinsics.checkNotNullExpressionValue(locale7, "Locale.ROOT");
                Objects.requireNonNull(str4, "null cannot be cast to non-null type java.lang.String");
                String lowerCase7 = str4.toLowerCase(locale7);
                Intrinsics.checkNotNullExpressionValue(lowerCase7, "(this as java.lang.String).toLowerCase(locale)");
                GeneralKt.log(append3.append(lowerCase7).toString());
                GeneralKt.log("table code: " + this.$tableCode);
                String str5 = this.$tableCode;
                if (str5 != null) {
                    this.this$0.getTableInfoAndUpdateAtTableMethod(str5);
                } else if (this.this$0.getMProductAdapter().getCurrentAtTableInfo() == null) {
                    this.this$0.showScanQRCodeActivity();
                } else {
                    this.this$0.getMProductAdapter().setSelectedShippingMethod(this.$method);
                    OrderFragment orderFragment3 = this.this$0;
                    orderFragment3.onChangeShippingMethod(orderFragment3.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo());
                }
            } else {
                GeneralKt.log("else....");
            }
        }
    }
}
