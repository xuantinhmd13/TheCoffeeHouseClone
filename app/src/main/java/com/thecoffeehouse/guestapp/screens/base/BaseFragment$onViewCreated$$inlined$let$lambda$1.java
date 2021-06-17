package com.thecoffeehouse.guestapp.screens.base;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Objects;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u000e\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00052\u000e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\b0\bH\n¢\u0006\u0002\b\t¨\u0006\n"}, d2 = {"<anonymous>", "", "VM", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate", "com/thecoffeehouse/guestapp/screens/base/BaseFragment$onViewCreated$1$1"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseFragment.kt */
final class BaseFragment$onViewCreated$$inlined$let$lambda$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ Bundle $savedInstanceState$inlined;
    final /* synthetic */ ViewStub $viewStubFragment$inlined;
    final /* synthetic */ BaseFragment this$0;

    BaseFragment$onViewCreated$$inlined$let$lambda$1(BaseFragment baseFragment, ViewStub viewStub, Bundle bundle) {
        this.this$0 = baseFragment;
        this.$viewStubFragment$inlined = viewStub;
        this.$savedInstanceState$inlined = bundle;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        if (this.this$0.getContext() != null) {
            BaseFragment baseFragment = this.this$0;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            baseFragment.setRootView((ViewGroup) view);
            this.this$0.hideLoading();
            this.this$0.initViews(view, this.$savedInstanceState$inlined);
            this.this$0.observeViewModel(view, this.$savedInstanceState$inlined);
            this.this$0.listenViewInteractions(view, this.$savedInstanceState$inlined);
            this.this$0.getOnInitViewDone().invoke();
        }
    }
}
