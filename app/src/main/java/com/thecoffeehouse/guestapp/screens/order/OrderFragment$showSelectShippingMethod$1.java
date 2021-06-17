package com.thecoffeehouse.guestapp.screens.order;

import android.app.Dialog;
import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.SelectShippingMethodDialog;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "shippingMethods", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: OrderFragment.kt */
public final class OrderFragment$showSelectShippingMethod$1 extends Lambda implements Function1<ArrayList<String>, Unit> {
    final /* synthetic */ OrderFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    OrderFragment$showSelectShippingMethod$1(OrderFragment orderFragment) {
        super(1);
        this.this$0 = orderFragment;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<String> arrayList) {
        invoke(arrayList);
        return Unit.INSTANCE;
    }

    public final void invoke(ArrayList<String> arrayList) {
        Dialog dialog;
        FragmentManager supportFragmentManager;
        Intrinsics.checkNotNullParameter(arrayList, "shippingMethods");
        OrderFragment orderFragment = this.this$0;
        SelectShippingMethodDialog.Companion companion = SelectShippingMethodDialog.Companion;
        OrderFragment orderFragment2 = this.this$0;
        orderFragment.methodDialog = companion.newInstance(orderFragment2.isUsingDefaultAddress(orderFragment2.getMProductAdapter().getCurrentDeliveryInfo()), this.this$0.getMProductAdapter().getSelectedMethod(), this.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.getMProductAdapter().getCurrentAtTableInfo(), new Function1<String, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$showSelectShippingMethod$1.AnonymousClass1 */
            final /* synthetic */ OrderFragment$showSelectShippingMethod$1 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke(str);
                return Unit.INSTANCE;
            }

            public final void invoke(String str) {
                Intrinsics.checkNotNullParameter(str, "shippingMethodSelected");
                this.this$0.this$0.getMProductAdapter().setSelectedShippingMethod(str);
                this.this$0.this$0.onChangeShippingMethod(this.this$0.this$0.getMProductAdapter().getSelectedMethod(), this.this$0.this$0.getMProductAdapter().getCurrentDeliveryInfo(), this.this$0.this$0.getMProductAdapter().getCurrentPickupInfo(), this.this$0.this$0.getMProductAdapter().getCurrentAtTableInfo());
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$showSelectShippingMethod$1.AnonymousClass2 */
            final /* synthetic */ OrderFragment$showSelectShippingMethod$1 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.showPickLocationDialog();
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$showSelectShippingMethod$1.AnonymousClass3 */
            final /* synthetic */ OrderFragment$showSelectShippingMethod$1 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.showPickUpStoreDialog();
            }
        }, new Function0<Unit>(this) {
            /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$showSelectShippingMethod$1.AnonymousClass4 */
            final /* synthetic */ OrderFragment$showSelectShippingMethod$1 this$0;

            {
                this.this$0 = r1;
            }

            @Override // kotlin.jvm.functions.Function0
            public final void invoke() {
                this.this$0.this$0.dismissSelectShippingMethod();
                this.this$0.this$0.showScanQRCodeActivity();
            }
        }, arrayList.contains(ShippingType.INSTANCE.getDELI()), arrayList.contains(ShippingType.INSTANCE.getPICKUP()), arrayList.contains(ShippingType.INSTANCE.getTABLE()));
        FragmentActivity activity = this.this$0.getActivity();
        if (!(activity == null || (supportFragmentManager = activity.getSupportFragmentManager()) == null)) {
            SelectShippingMethodDialog selectShippingMethodDialog = this.this$0.methodDialog;
            Intrinsics.checkNotNull(selectShippingMethodDialog);
            selectShippingMethodDialog.showNow(supportFragmentManager, null);
        }
        SelectShippingMethodDialog selectShippingMethodDialog2 = this.this$0.methodDialog;
        if (!(selectShippingMethodDialog2 == null || (dialog = selectShippingMethodDialog2.getDialog()) == null)) {
            dialog.setOnCancelListener(new DialogInterface.OnCancelListener(this) {
                /* class com.thecoffeehouse.guestapp.screens.order.OrderFragment$showSelectShippingMethod$1.AnonymousClass6 */
                final /* synthetic */ OrderFragment$showSelectShippingMethod$1 this$0;

                {
                    this.this$0 = r1;
                }

                public final void onCancel(DialogInterface dialogInterface) {
                    MainActivity mainActivity = this.this$0.this$0.getMainActivity();
                    if (mainActivity != null) {
                        mainActivity.rotateHeaderIconDown();
                    }
                }
            });
        }
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.rotateHeaderIconUp();
        }
    }
}
