package com.thecoffeehouse.guestapp.screens.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "invoke", "()Landroidx/lifecycle/ViewModel;"}, k = 3, mv = {1, 4, 0})
/* compiled from: BaseActivity.kt */
public final class BaseActivity$viewModel$2 extends Lambda implements Function0<T> {
    final /* synthetic */ BaseActivity this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    BaseActivity$viewModel$2(BaseActivity baseActivity) {
        super(0);
        this.this$0 = baseActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final T invoke() {
        BaseActivity baseActivity = this.this$0;
        T t = (T) new ViewModelProvider(baseActivity, baseActivity.getViewModelFactory()).get(this.this$0.getViewModelClass());
        Intrinsics.checkNotNullExpressionValue(t, "ViewModelProvider(this, …ry()).get(viewModelClass)");
        return t;
    }
}
