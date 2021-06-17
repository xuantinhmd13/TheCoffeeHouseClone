package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.services.api.model.error.ServerErrorResponse;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Lcom/thecoffeehouse/guestapp/services/api/model/error/ServerErrorResponse;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$getAddressSuggestion$2 extends Lambda implements Function1<ServerErrorResponse, Unit> {
    final /* synthetic */ Function1 $onCompleted;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$getAddressSuggestion$2(MainActivity mainActivity, Function1 function1) {
        super(1);
        this.this$0 = mainActivity;
        this.$onCompleted = function1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(ServerErrorResponse serverErrorResponse) {
        invoke(serverErrorResponse);
        return Unit.INSTANCE;
    }

    public final void invoke(ServerErrorResponse serverErrorResponse) {
        Intrinsics.checkNotNullParameter(serverErrorResponse, "it");
        this.this$0.getDefaultLocation(new Function1<AddressSuggestion, Unit>(this) {
            /* class com.thecoffeehouse.guestapp.MainActivity$getAddressSuggestion$2.AnonymousClass1 */
            final /* synthetic */ MainActivity$getAddressSuggestion$2 this$0;

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
                Intrinsics.checkNotNullParameter(addressSuggestion, "it");
                this.this$0.this$0.addressSuggestion = addressSuggestion;
                Function1 function1 = this.this$0.$onCompleted;
                AddressSuggestion addressSuggestion2 = this.this$0.this$0.getAddressSuggestion();
                Intrinsics.checkNotNull(addressSuggestion2);
                function1.invoke(addressSuggestion2);
            }
        });
    }
}
