package com.thecoffeehouse.guestapp.configs;

import android.content.Context;
import android.view.View;
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
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@DebugMetadata(c = "com.thecoffeehouse.guestapp.configs.TrackingScreenService$Companion$logScreenViewByViewId$1", f = "TrackingScreenService.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: TrackingScreenService.kt */
public final class TrackingScreenService$Companion$logScreenViewByViewId$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $screenName;
    final /* synthetic */ View $viewId;
    int label;
    private CoroutineScope p$;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TrackingScreenService$Companion$logScreenViewByViewId$1(View view, String str, Continuation continuation) {
        super(2, continuation);
        this.$viewId = view;
        this.$screenName = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "completion");
        TrackingScreenService$Companion$logScreenViewByViewId$1 trackingScreenService$Companion$logScreenViewByViewId$1 = new TrackingScreenService$Companion$logScreenViewByViewId$1(this.$viewId, this.$screenName, continuation);
        trackingScreenService$Companion$logScreenViewByViewId$1.p$ = (CoroutineScope) obj;
        return trackingScreenService$Companion$logScreenViewByViewId$1;
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((TrackingScreenService$Companion$logScreenViewByViewId$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            Context context = TrackingScreenService.mContext;
            if (context == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mContext");
            }
            String resourceName = context.getResources().getResourceName(this.$viewId.getId());
            Intrinsics.checkNotNullExpressionValue(resourceName, "mContext.resources.getResourceName(viewId.id)");
            String substringAfter$default = StringsKt.substringAfter$default(resourceName, '/', (String) null, 2, (Object) null);
            FirebaseAnalytics firebaseAnalytics = TrackingScreenService.INSTANCE;
            if (firebaseAnalytics == null) {
                return null;
            }
            ParametersBuilder parametersBuilder = new ParametersBuilder();
            parametersBuilder.param(FirebaseAnalytics.Param.SCREEN_NAME, this.$screenName);
            parametersBuilder.param(FirebaseAnalytics.Param.SCREEN_CLASS, substringAfter$default);
            firebaseAnalytics.logEvent(FirebaseAnalytics.Event.SCREEN_VIEW, parametersBuilder.getBundle());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
