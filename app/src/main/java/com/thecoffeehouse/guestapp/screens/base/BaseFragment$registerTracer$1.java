package com.thecoffeehouse.guestapp.screens.base;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.tracer.FragmentFrameRateTracer;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"com/thecoffeehouse/guestapp/screens/base/BaseFragment$registerTracer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
public final class BaseFragment$registerTracer$1 implements LifecycleEventObserver {
    final /* synthetic */ BaseFragment$registerTracer$onHiddenChangedListener$1 $onHiddenChangedListener;
    final /* synthetic */ String $tag;
    final /* synthetic */ Ref.ObjectRef $tracer;
    final /* synthetic */ BaseFragment this$0;

    BaseFragment$registerTracer$1(BaseFragment baseFragment, Ref.ObjectRef objectRef, String str, BaseFragment$registerTracer$onHiddenChangedListener$1 baseFragment$registerTracer$onHiddenChangedListener$1) {
        this.this$0 = baseFragment;
        this.$tracer = objectRef;
        this.$tag = str;
        this.$onHiddenChangedListener = baseFragment$registerTracer$onHiddenChangedListener$1;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(lifecycleOwner, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = BaseFragment.WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            this.$tracer.element = (T) new FragmentFrameRateTracer(LifecycleOwnerKt.getLifecycleScope(this.this$0), this.$tag);
            T t = this.$tracer.element;
            if (t != null) {
                Context context = this.this$0.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                t.start((Activity) context);
            }
            this.this$0.addOnHiddenChangedListener(this.$onHiddenChangedListener);
        } else if (i == 2) {
            T t2 = this.$tracer.element;
            if (t2 != null) {
                t2.stop();
            }
            this.$tracer.element = (T) null;
            this.this$0.removeOnHiddenChangedListener(this.$onHiddenChangedListener);
        } else if (i == 3) {
            if (!BaseFragment.access$getMIsTracingStopped$p(this.this$0)) {
                BaseFragment.access$getMTrace$p(this.this$0).stop();
                BaseFragment.access$setMIsTracingStopped$p(this.this$0, true);
            }
            this.this$0.getLifecycle().removeObserver(this);
        }
    }
}
