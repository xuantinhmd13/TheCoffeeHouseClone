package com.thecoffeehouse.guestapp;

import com.google.android.gms.tasks.OnFailureListener;
import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Ljava/lang/Exception;", "onFailure"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$getCurrentLocationListener$2 implements OnFailureListener {
    final /* synthetic */ Function2 $onCompleted;
    final /* synthetic */ MainActivity this$0;

    MainActivity$getCurrentLocationListener$2(MainActivity mainActivity, Function2 function2) {
        this.this$0 = mainActivity;
        this.$onCompleted = function2;
    }

    @Override // com.google.android.gms.tasks.OnFailureListener
    public final void onFailure(Exception exc) {
        Intrinsics.checkNotNullParameter(exc, "it");
        GeneralKt.log("addOnFailureListener");
        this.this$0.getDefaultLocation(new Function1<AddressSuggestion, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.MainActivity$getCurrentLocationListener$2.AnonymousClass1 */
            final /* synthetic */ MainActivity$getCurrentLocationListener$2 this$0;

            {
                this.this$0 = r1;
            }

            /* Return type fixed from 'java.lang.Object' to match base method */
            /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion) {
                invoke(addressSuggestion);
                return Unit.INSTANCE;
            }

            public final void invoke(AddressSuggestion addressSuggestion) {
                Intrinsics.checkNotNullParameter(addressSuggestion, "latLng");
                this.this$0.this$0.addressSuggestion = addressSuggestion;
                this.this$0.$onCompleted.invoke(addressSuggestion, null);
            }
        });
    }
}
