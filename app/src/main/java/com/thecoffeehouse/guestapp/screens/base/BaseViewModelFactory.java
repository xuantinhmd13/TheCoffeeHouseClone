package com.thecoffeehouse.guestapp.screens.base;

import android.os.Bundle;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import androidx.savedstate.SavedStateRegistryOwner;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J7\u0010\u000e\u001a\u0002H\u000f\"\n\b\u0001\u0010\u000f*\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u000f0\t2\u0006\u0010\u0014\u001a\u00020\u0015H\u0014¢\u0006\u0002\u0010\u0016R\u001e\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\tX¦\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModelFactory;", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "setViewModelClass", "(Ljava/lang/Class;)V", "create", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseViewModelFactory.kt */
public abstract class BaseViewModelFactory<V> extends AbstractSavedStateViewModelFactory {
    public abstract Class<V> getViewModelClass();

    public abstract void setViewModelClass(Class<V> cls);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BaseViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        super(savedStateRegistryOwner, bundle);
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "owner");
    }

    /* JADX WARN: Type inference failed for: r4v10, types: [T extends androidx.lifecycle.ViewModel, androidx.lifecycle.ViewModel] */
    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.AbstractSavedStateViewModelFactory
    public <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(str, "key");
        Intrinsics.checkNotNullParameter(cls, "modelClass");
        Intrinsics.checkNotNullParameter(savedStateHandle, "handle");
        if (cls.isAssignableFrom(getViewModelClass())) {
            return getViewModelClass().getConstructor(savedStateHandle.getClass()).newInstance(savedStateHandle);
        }
        throw new IllegalStateException("Unknown ViewModel Class");
    }
}
