package com.thecoffeehouse.guestapp.screens.base;

import android.app.Activity;
import android.content.Context;
import androidx.lifecycle.LifecycleOwnerKt;
import com.thecoffeehouse.guestapp.screens.base.BaseFragment;
import com.thecoffeehouse.guestapp.tracer.FragmentFrameRateTracer;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.jvm.internal.Ref;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"com/thecoffeehouse/guestapp/screens/base/BaseFragment$registerTracer$onHiddenChangedListener$1", "Lcom/thecoffeehouse/guestapp/screens/base/BaseFragment$OnHiddenChangeListener;", "onHidden", "", "hidden", "", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
public final class BaseFragment$registerTracer$onHiddenChangedListener$1 implements BaseFragment.OnHiddenChangeListener {
    final /* synthetic */ String $tag;
    final /* synthetic */ Ref.ObjectRef $tracer;
    final /* synthetic */ BaseFragment this$0;

    BaseFragment$registerTracer$onHiddenChangedListener$1(BaseFragment baseFragment, Ref.ObjectRef objectRef, String str) {
        this.this$0 = baseFragment;
        this.$tracer = objectRef;
        this.$tag = str;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseFragment.OnHiddenChangeListener
    public void onHidden(boolean z) {
        if (!z) {
            if (this.$tracer.element == null) {
                this.$tracer.element = (T) new FragmentFrameRateTracer(LifecycleOwnerKt.getLifecycleScope(this.this$0), this.$tag);
            }
            T t = this.$tracer.element;
            if (t != null) {
                Context context = this.this$0.getContext();
                Objects.requireNonNull(context, "null cannot be cast to non-null type android.app.Activity");
                t.start((Activity) context);
                return;
            }
            return;
        }
        T t2 = this.$tracer.element;
        if (t2 != null) {
            t2.stop();
        }
    }
}
