package com.thecoffeehouse.guestapp.configs.trackingevents;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.analytics.ktx.ParametersBuilder;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.configs.trackingevents.TrackingEventService$Companion$logCustomEventName$1", f = "TrackingEventService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: TrackingEventService.kt */
public final class TrackingEventService$Companion$logCustomEventName$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $eventName;
    final /* synthetic */ List $params;
    int label;
    private CoroutineScope p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingEventService$Companion$logCustomEventName$1(String str, List list, Continuation continuation) {
        super(2, continuation);
        this.$eventName = str;
        this.$params = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        TrackingEventService$Companion$logCustomEventName$1 trackingEventService$Companion$logCustomEventName$1 = new TrackingEventService$Companion$logCustomEventName$1(this.$eventName, this.$params, continuation);
        trackingEventService$Companion$logCustomEventName$1.p$ = (CoroutineScope) obj;
        return trackingEventService$Companion$logCustomEventName$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingEventService$Companion$logCustomEventName$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            try {
                FirebaseAnalytics firebaseAnalytics = TrackingEventService.INSTANCE;
                if (firebaseAnalytics == null) {
                    return null;
                }
                String str = this.$eventName;
                ParametersBuilder parametersBuilder = new ParametersBuilder();
                for (TrackingData trackingData : this.$params) {
                    Object paramValue = trackingData.getParamValue();
                    if (paramValue instanceof String) {
                        String paramName = trackingData.getParamName();
                        Object paramValue2 = trackingData.getParamValue();
                        if (paramValue2 != null) {
                            parametersBuilder.param(paramName, (String) paramValue2);
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                        }
                    } else if (paramValue instanceof Double) {
                        String paramName2 = trackingData.getParamName();
                        Object paramValue3 = trackingData.getParamValue();
                        if (paramValue3 != null) {
                            parametersBuilder.param(paramName2, ((Double) paramValue3).doubleValue());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Double");
                        }
                    } else if (paramValue instanceof Long) {
                        String paramName3 = trackingData.getParamName();
                        Object paramValue4 = trackingData.getParamValue();
                        if (paramValue4 != null) {
                            parametersBuilder.param(paramName3, ((Long) paramValue4).longValue());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Long");
                        }
                    } else if (paramValue instanceof Integer) {
                        String paramName4 = trackingData.getParamName();
                        Object paramValue5 = trackingData.getParamValue();
                        if (paramValue5 != null) {
                            parametersBuilder.param(paramName4, (long) ((Integer) paramValue5).intValue());
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Int");
                        }
                    } else if (!(paramValue instanceof Boolean)) {
                        continue;
                    } else {
                        Object paramValue6 = trackingData.getParamValue();
                        if (paramValue6 != null) {
                            Boolean bool = (Boolean) paramValue6;
                            if (Intrinsics.areEqual(trackingData.getParamValue(), Boxing.boxBoolean(true))) {
                                parametersBuilder.param(trackingData.getParamName(), 1L);
                            } else {
                                parametersBuilder.param(trackingData.getParamName(), 0L);
                            }
                        } else {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Boolean");
                        }
                    }
                }
                firebaseAnalytics.logEvent(str, parametersBuilder.getBundle());
                return Unit.INSTANCE;
            } catch (Exception e) {
                e.printStackTrace();
                return Unit.INSTANCE;
            }
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
