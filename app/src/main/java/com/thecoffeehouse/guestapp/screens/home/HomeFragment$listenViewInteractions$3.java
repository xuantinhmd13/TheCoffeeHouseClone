package com.thecoffeehouse.guestapp.screens.home;

import android.view.View;
import android.view.ViewTreeObserver;
import android.widget.LinearLayout;
import com.thecoffeehouse.guestapp.ClientManager;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.screens.order.shippingmethod.ShippingType;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "it", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: HomeFragment.kt */
final class HomeFragment$listenViewInteractions$3 extends Lambda implements Function1<ArrayList<String>, Unit> {
    final /* synthetic */ LinearLayout $layoutAtTableNavigate;
    final /* synthetic */ View $view;
    final /* synthetic */ HomeFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    HomeFragment$listenViewInteractions$3(HomeFragment homeFragment, View view, LinearLayout linearLayout) {
        super(1);
        this.this$0 = homeFragment;
        this.$view = view;
        this.$layoutAtTableNavigate = linearLayout;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ArrayList<String> arrayList) {
        invoke(arrayList);
        return Unit.INSTANCE;
    }

    public final void invoke(ArrayList<String> arrayList) {
        Intrinsics.checkNotNullParameter(arrayList, "it");
        if (arrayList.contains(ShippingType.INSTANCE.getTABLE())) {
            this.this$0.showAtTableShortcut(this.$view);
            this.$view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserver.OnWindowFocusChangeListener(this) {
                /* class com.thecoffeehouse.guestapp.screens.home.HomeFragment$listenViewInteractions$3.AnonymousClass1 */
                final /* synthetic */ HomeFragment$listenViewInteractions$3 this$0;

                /* JADX WARN: Incorrect args count in method signature: ()V */
                {
                    this.this$0 = r1;
                }

                public void onWindowFocusChanged(boolean z) {
                    TCHApplication tCHApplication;
                    ClientManager requireClientManager;
                    MainActivity mainActivity;
                    if (z) {
                        if (!(!this.this$0.this$0.isAdded() || (tCHApplication = this.this$0.this$0.requireTCHApplication()) == null || (requireClientManager = tCHApplication.requireClientManager()) == null || !requireClientManager.isShowPopupShortcutOrderAtTable() || (mainActivity = this.this$0.this$0.getMainActivity()) == null)) {
                            String string = this.this$0.this$0.getString(R.string.str_popup_order_at_table_shortcut);
                            Intrinsics.checkNotNullExpressionValue(string, "getString(R.string.str_p…_order_at_table_shortcut)");
                            LinearLayout linearLayout = this.this$0.$layoutAtTableNavigate;
                            Intrinsics.checkNotNullExpressionValue(linearLayout, "layoutAtTableNavigate");
                            mainActivity.showPopupWindowRightTopAnchor(string, linearLayout);
                        }
                        this.this$0.$view.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
                    }
                }
            });
        } else {
            this.this$0.hideAtTableShortcut(this.$view);
        }
        if (arrayList.contains(ShippingType.INSTANCE.getPICKUP())) {
            this.this$0.showPickupShortcut(this.$view);
        } else {
            this.this$0.hidePickupShortcut(this.$view);
        }
        if (arrayList.contains(ShippingType.INSTANCE.getDELI())) {
            this.this$0.showDeliShortcut(this.$view);
        } else {
            this.this$0.hideDeliShortcut(this.$view);
        }
    }
}
