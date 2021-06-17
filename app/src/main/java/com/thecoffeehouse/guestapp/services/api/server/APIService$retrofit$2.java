package com.thecoffeehouse.guestapp.services.api.server;

import com.thecoffeehouse.guestapp.utility.Retrofit;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/thecoffeehouse/guestapp/utility/Retrofit;", "invoke"}, k = 3, mv = {1, 4, 0})
/* compiled from: APIService.kt */
final class APIService$retrofit$2 extends Lambda implements Function0<Retrofit> {
    final /* synthetic */ APIService this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    APIService$retrofit$2(APIService aPIService) {
        super(0);
        this.this$0 = aPIService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Retrofit invoke() {
        return new Retrofit(this.this$0.getApplication(), APIService.access$getBaseUrl$p(this.this$0));
    }
}
