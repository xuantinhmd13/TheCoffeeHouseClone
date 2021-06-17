package com.thecoffeehouse.guestapp.views;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import java.util.Objects;
import kotlin.Metadata;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u00032\u000e\u0010\u0005\u001a\n \u0004*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "stub", "Landroid/view/ViewStub;", "kotlin.jvm.PlatformType", "inflated", "Landroid/view/View;", "onInflate"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseBottomSheetDialogFragment.kt */
public final class BaseBottomSheetDialogFragment$onViewCreated$1 implements ViewStub.OnInflateListener {
    final /* synthetic */ Bundle $savedInstanceState;
    final /* synthetic */ BaseBottomSheetDialogFragment this$0;

    BaseBottomSheetDialogFragment$onViewCreated$1(BaseBottomSheetDialogFragment baseBottomSheetDialogFragment, Bundle bundle) {
        this.this$0 = baseBottomSheetDialogFragment;
        this.$savedInstanceState = bundle;
    }

    public final void onInflate(ViewStub viewStub, View view) {
        if (this.this$0.getContext() != null) {
            BaseBottomSheetDialogFragment baseBottomSheetDialogFragment = this.this$0;
            Objects.requireNonNull(view, "null cannot be cast to non-null type android.view.ViewGroup");
            baseBottomSheetDialogFragment.setRootView((ViewGroup) view);
            this.this$0.initViews(view, this.$savedInstanceState);
            this.this$0.collectDataTracking();
        }
    }
}
