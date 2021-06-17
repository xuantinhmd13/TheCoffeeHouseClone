package com.thecoffeehouse.guestapp;

import com.thecoffeehouse.guestapp.services.api.model.common.map.AddressSuggestion;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "suggestion", "Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;", "isOutOfThreadHold", "", "invoke", "(Lcom/thecoffeehouse/guestapp/services/api/model/common/map/AddressSuggestion;Ljava/lang/Boolean;)V"}, k = 3, mv = {1, 4, 0})
/* compiled from: MainActivity.kt */
public final class MainActivity$getMyAddress$1 extends Lambda implements Function2<AddressSuggestion, Boolean, Unit> {
    final /* synthetic */ Function1 $onCompleted;
    final /* synthetic */ MainActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MainActivity$getMyAddress$1(MainActivity mainActivity, Function1 function1) {
        super(2);
        this.this$0 = mainActivity;
        this.$onCompleted = function1;
    }

    /* Return type fixed from 'java.lang.Object' to match base method */
    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(AddressSuggestion addressSuggestion, Boolean bool) {
        invoke(addressSuggestion, bool);
        return Unit.INSTANCE;
    }

    public final void invoke(AddressSuggestion addressSuggestion, Boolean bool) {
        Intrinsics.checkNotNullParameter(addressSuggestion, "suggestion");
        GeneralKt.log("isOutOfThreadHold: " + bool);
        this.this$0.addressSuggestion = addressSuggestion;
        this.$onCompleted.invoke(addressSuggestion);
    }
}
