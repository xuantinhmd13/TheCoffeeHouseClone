package com.thecoffeehouse.guestapp.tracer;

import android.util.Log;
import android.util.SparseIntArray;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.tracer.FragmentFrameRateTracer$stop$1", f = "FragmentFrameRateTracer.kt", i = {0, 0}, l = {70}, m = "invokeSuspend", n = {"$this$launch", "$this$withLock$iv"}, s = {"L$0", "L$1"})
/* compiled from: FragmentFrameRateTracer.kt */
public final class FragmentFrameRateTracer$stop$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    Object L$0;
    Object L$1;
    int label;
    private CoroutineScope p$;
    final /* synthetic */ FragmentFrameRateTracer this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FragmentFrameRateTracer$stop$1(FragmentFrameRateTracer fragmentFrameRateTracer, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fragmentFrameRateTracer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        FragmentFrameRateTracer$stop$1 fragmentFrameRateTracer$stop$1 = new FragmentFrameRateTracer$stop$1(this.this$0, continuation);
        fragmentFrameRateTracer$stop$1.p$ = (CoroutineScope) obj;
        return fragmentFrameRateTracer$stop$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((FragmentFrameRateTracer$stop$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX INFO: finally extract failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Mutex mutex;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            CoroutineScope coroutineScope = this.p$;
            Log.d(this.this$0.tag, "/tracer/stop");
            Mutex mutex2 = this.this$0.mutex;
            this.L$0 = coroutineScope;
            this.L$1 = mutex2;
            this.label = 1;
            if (mutex2.lock(null, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            mutex = mutex2;
        } else if (i == 1) {
            mutex = (Mutex) this.L$1;
            CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
            ResultKt.throwOnFailure(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        try {
            SparseIntArray[] stop = this.this$0.aggregator.stop();
            if (stop != null) {
                Intrinsics.checkNotNullExpressionValue(stop, "aggregator.stop() ?: return@launch");
                this.this$0.totalFrames = 0;
                this.this$0.slowFrames = 0;
                this.this$0.frozenFrames = 0;
                SparseIntArray sparseIntArray = stop[0];
                if (sparseIntArray != null) {
                    int size = sparseIntArray.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        int keyAt = sparseIntArray.keyAt(i2);
                        int valueAt = sparseIntArray.valueAt(i2);
                        FragmentFrameRateTracer fragmentFrameRateTracer = this.this$0;
                        long j = (long) valueAt;
                        fragmentFrameRateTracer.totalFrames = fragmentFrameRateTracer.totalFrames + j;
                        if (keyAt > this.this$0.mLimitSecondPerFrame60FPS) {
                            FragmentFrameRateTracer fragmentFrameRateTracer2 = this.this$0;
                            fragmentFrameRateTracer2.slowFrames = fragmentFrameRateTracer2.slowFrames + j;
                        }
                        if (keyAt > this.this$0.mLimitSecondPerFrameFrozen) {
                            FragmentFrameRateTracer fragmentFrameRateTracer3 = this.this$0;
                            fragmentFrameRateTracer3.frozenFrames = fragmentFrameRateTracer3.frozenFrames + j;
                        }
                    }
                }
                this.this$0.aggregator.reset();
                Log.d(this.this$0.tag, "\n/tracer/result : \n" + StringsKt.trimIndent("\n            totalFrames : " + this.this$0.totalFrames + ",\n            slowFrames  : " + this.this$0.slowFrames + ",\n            frozenFrames: " + this.this$0.frozenFrames + "\n        "));
                Unit unit = Unit.INSTANCE;
                mutex.unlock(null);
                return Unit.INSTANCE;
            }
            Unit unit2 = Unit.INSTANCE;
            mutex.unlock(null);
            return unit2;
        } catch (Throwable th) {
            mutex.unlock(null);
            throw th;
        }
    }
}
