package com.thecoffeehouse.guestapp;

import com.google.android.gms.maps.MapsInitializer;
import com.thecoffeehouse.guestapp.TCHApplication;
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
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.TCHApplication$initialization$1", f = "TCHApplication.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: TCHApplication.kt */
public final class TCHApplication$initialization$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    int label;
    private CoroutineScope p$;
    final /* synthetic */ TCHApplication this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TCHApplication$initialization$1(TCHApplication tCHApplication, Continuation continuation) {
        super(2, continuation);
        this.this$0 = tCHApplication;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        TCHApplication$initialization$1 tCHApplication$initialization$1 = new TCHApplication$initialization$1(this.this$0, continuation);
        tCHApplication$initialization$1.p$ = (CoroutineScope) obj;
        return tCHApplication$initialization$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TCHApplication$initialization$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            MapsInitializer.initialize(this.this$0);
            this.this$0.createNotificationChannel();
            this.this$0.mMainActivityLifecycleCallback = new TCHApplication.MainActivityLifecycleCallbacks();
            TCHApplication tCHApplication = this.this$0;
            tCHApplication.registerActivityLifecycleCallbacks(TCHApplication.access$getMMainActivityLifecycleCallback$p(tCHApplication));
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
