package com.thecoffeehouse.guestapp.tracer;

import android.app.Activity;
import androidx.core.app.FrameMetricsAggregator;
import androidx.lifecycle.LifecycleCoroutineScope;
import com.facebook.appevents.internal.ViewHierarchyConstants;
import kotlin.Metadata;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;
import kotlinx.coroutines.sync.MutexKt;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0017R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\t\u001a\u00020\nX\u0005¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0010XD¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u000eX\u000e¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/thecoffeehouse/guestapp/tracer/FragmentFrameRateTracer;", "Lkotlinx/coroutines/CoroutineScope;", "scope", "Landroidx/lifecycle/LifecycleCoroutineScope;", ViewHierarchyConstants.TAG_KEY, "", "(Landroidx/lifecycle/LifecycleCoroutineScope;Ljava/lang/String;)V", "aggregator", "Landroidx/core/app/FrameMetricsAggregator;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "frozenFrames", "", "mLimitSecondPerFrame60FPS", "", "mLimitSecondPerFrameFrozen", "mutex", "Lkotlinx/coroutines/sync/Mutex;", "slowFrames", "totalFrames", "start", "Lkotlinx/coroutines/Job;", "context", "Landroid/app/Activity;", "stop", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: FragmentFrameRateTracer.kt */
public final class FragmentFrameRateTracer implements CoroutineScope {
    private final FrameMetricsAggregator aggregator = new FrameMetricsAggregator();
    private long frozenFrames;
    private final int mLimitSecondPerFrame60FPS = 16;
    private final int mLimitSecondPerFrameFrozen = 700;
    private final Mutex mutex = MutexKt.Mutex$default(false, 1, null);
    private final LifecycleCoroutineScope scope;
    private long slowFrames;
    private final String tag;
    private long totalFrames;

    @Override // kotlinx.coroutines.CoroutineScope
    public CoroutineContext getCoroutineContext() {
        return this.scope.getCoroutineContext();
    }

    public FragmentFrameRateTracer(LifecycleCoroutineScope lifecycleCoroutineScope, String str) {
        Intrinsics.checkNotNullParameter(lifecycleCoroutineScope, "scope");
        Intrinsics.checkNotNullParameter(str, ViewHierarchyConstants.TAG_KEY);
        this.scope = lifecycleCoroutineScope;
        this.tag = str;
    }

    public final Job start(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "context");
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new FragmentFrameRateTracer$start$1(this, activity, null), 3, null);
    }

    public final Job stop() {
        return BuildersKt__Builders_commonKt.launch$default(this, null, null, new FragmentFrameRateTracer$stop$1(this, null), 3, null);
    }
}
