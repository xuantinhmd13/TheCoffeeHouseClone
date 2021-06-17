package com.thecoffeehouse.guestapp.views;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007¨\u0006\b"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate", "com/thecoffeehouse/guestapp/views/BaseFullScreenDialogFragment$onViewCreated$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFullScreenDialogFragment.kt */
final class BaseFullScreenDialogFragment$onViewCreated$$inlined$let$lambda$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ Bundle $savedInstanceState$inlined;
    final /* synthetic */ ViewStub $viewStubFragment$inlined;
    final /* synthetic */ BaseFullScreenDialogFragment this$0;

    BaseFullScreenDialogFragment$onViewCreated$$inlined$let$lambda$1(BaseFullScreenDialogFragment baseFullScreenDialogFragment, ViewStub viewStub, Bundle bundle) {
        this.this$0 = baseFullScreenDialogFragment;
        this.$viewStubFragment$inlined = viewStub;
        this.$savedInstanceState$inlined = bundle;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        if (this.this$0.getContext() != null) {
            this.this$0.hideLoading();
            BaseFullScreenDialogFragment baseFullScreenDialogFragment = this.this$0;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            baseFullScreenDialogFragment.setRootView((ViewGroup) view);
            this.this$0.initViews(view, this.$savedInstanceState$inlined);
            this.this$0.observeViewModel(view, this.$savedInstanceState$inlined);
            this.this$0.listenViewInteractions(view, this.$savedInstanceState$inlined);
            this.this$0.collectDataTracking();
        }
    }
}
