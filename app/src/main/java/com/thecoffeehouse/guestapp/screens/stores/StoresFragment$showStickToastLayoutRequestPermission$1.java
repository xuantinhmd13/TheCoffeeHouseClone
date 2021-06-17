package com.thecoffeehouse.guestapp.screens.stores;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.thecoffeehouse.guestapp.MainActivity;
import com.thecoffeehouse.guestapp.R;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: StoresFragment.kt */
public final class StoresFragment$showStickToastLayoutRequestPermission$1 extends Lambda implements Function1<View, Unit> {
    final /* synthetic */ LinearLayout $layoutSearch;
    final /* synthetic */ View $locationRequestLayout;
    final /* synthetic */ StoresFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    StoresFragment$showStickToastLayoutRequestPermission$1(StoresFragment storesFragment, LinearLayout linearLayout, View view) {
        super(1);
        this.this$0 = storesFragment;
        this.$layoutSearch = linearLayout;
        this.$locationRequestLayout = view;
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
        MainActivity mainActivity = this.this$0.getMainActivity();
        if (mainActivity != null) {
            mainActivity.requestLocationPermissionRuntimeListener(new Function2<Boolean, AddressSuggestion, Unit>(this) {
                /* class com.thecoffeehouse.guestapp.screens.stores.StoresFragment$showStickToastLayoutRequestPermission$1.AnonymousClass1 */
                final /* synthetic */ StoresFragment$showStickToastLayoutRequestPermission$1 this$0;

                {
                    this.this$0 = r1;
                }

                /* Return type fixed from 'java.lang.Object' to match base method */
                /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, AddressSuggestion addressSuggestion) {
                    invoke(bool.booleanValue(), addressSuggestion);
                    return Unit.INSTANCE;
                }

                public final void invoke(boolean z, AddressSuggestion addressSuggestion) {
                    Intrinsics.checkNotNullParameter(addressSuggestion, "latLng");
                    GeneralKt.log("requestSuccess: " + z);
                    if (z) {
                        TransitionManager.beginDelayedTransition(this.this$0.$layoutSearch, new AutoTransition());
                        this.this$0.$layoutSearch.removeView(this.this$0.$locationRequestLayout);
                        ViewGroup viewGroup = this.this$0.this$0.getRootView();
                        if ((viewGroup != null ? (RelativeLayout) viewGroup.findViewById(R.id.layout_map) : null) != null) {
                            this.this$0.this$0.animateShowMapStores();
                            return;
                        }
                        return;
                    }
                    GeneralKt.log("deny again");
                }
            });
        }
    }
}
