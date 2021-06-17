package com.thecoffeehouse.guestapp.repositories;

import com.google.gson.Gson;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\b\b\u0001\u0010\u0004*\u00020\u0003*\u00020\u0005H@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "ResultType", "", "RequestType", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.repositories.NetworkBoundResource$saveCallResult$1", f = "NetworkBoundResource.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: NetworkBoundResource.kt */
public final class NetworkBoundResource$saveCallResult$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ Object $item;
    int label;
    private CoroutineScope p$;
    final /* synthetic */ NetworkBoundResource this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NetworkBoundResource$saveCallResult$1(NetworkBoundResource networkBoundResource, Object obj, Continuation continuation) {
        super(2, continuation);
        this.this$0 = networkBoundResource;
        this.$item = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        NetworkBoundResource$saveCallResult$1 networkBoundResource$saveCallResult$1 = new NetworkBoundResource$saveCallResult$1(this.this$0, this.$item, continuation);
        networkBoundResource$saveCallResult$1.p$ = (CoroutineScope) obj;
        return networkBoundResource$saveCallResult$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((NetworkBoundResource$saveCallResult$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.this$0.getCachedResponseClass() == null) {
                return null;
            }
            Class cachedResponseClass = this.this$0.getCachedResponseClass();
            Intrinsics.checkNotNull(cachedResponseClass);
            String name = cachedResponseClass.getName();
            Intrinsics.checkNotNullExpressionValue(name, "cachedResponseClass!!.name");
            String json = new Gson().toJson(this.$item);
            Intrinsics.checkNotNullExpressionValue(json, "Gson().toJson(item)");
            CacheRequestUtils.INSTANCE.cacheResponse(this.this$0.getApplication(), name, json);
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
