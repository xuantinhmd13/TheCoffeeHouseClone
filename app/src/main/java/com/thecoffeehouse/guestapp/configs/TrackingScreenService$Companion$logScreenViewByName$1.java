package com.thecoffeehouse.guestapp.configs;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.ParametersBuilder;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.configs.TrackingScreenService$Companion$logScreenViewByName$1", f = "TrackingScreenService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: TrackingScreenService.kt */
public final class TrackingScreenService$Companion$logScreenViewByName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $name;
    final /* synthetic */ String $screenName;
    int label;
    private CoroutineScope p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingScreenService$Companion$logScreenViewByName$1(String str, String str2, Continuation continuation) {
        super(2, continuation);
        this.$screenName = str;
        this.$name = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        TrackingScreenService$Companion$logScreenViewByName$1 trackingScreenService$Companion$logScreenViewByName$1 = new TrackingScreenService$Companion$logScreenViewByName$1(this.$screenName, this.$name, continuation);
        trackingScreenService$Companion$logScreenViewByName$1.p$ = (CoroutineScope) obj;
        return trackingScreenService$Companion$logScreenViewByName$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingScreenService$Companion$logScreenViewByName$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            FirebaseAnalytics firebaseAnalytics = TrackingScreenService.INSTANCE;
            if (firebaseAnalytics == null) {
                return null;
            }
            ParametersBuilder parametersBuilder = new ParametersBuilder();
            parametersBuilder.param(FirebaseAnalytics.Param.SCREEN_NAME, this.$screenName);
            parametersBuilder.param(FirebaseAnalytics.Param.SCREEN_CLASS, this.$name);
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, parametersBuilder.getBundle());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
