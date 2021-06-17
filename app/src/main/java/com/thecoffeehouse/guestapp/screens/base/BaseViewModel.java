package com.thecoffeehouse.guestapp.screens.base;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel;
import com.thecoffeehouse.guestapp.AppExecutors;
import com.thecoffeehouse.guestapp.TCHApplication;
import com.thecoffeehouse.guestapp.di.DiKt;
import com.thecoffeehouse.guestapp.utility.GeneralKt;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.ReadOnlyProperty;
import kotlin.reflect.KProperty;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0017\u001a\u00020\u0018H\u0014J\u001b\u0010\u0019\u001a\u00020\u0018\"\u0004\b\u0000\u0010\u001a2\u0006\u0010\u001b\u001a\u0002H\u001aH\u0004¢\u0006\u0002\u0010\u001cR\u001b\u0010\u0005\u001a\u00020\u00068DX\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8DX\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0013\u001a\u00020\u0014X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001d"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModel;", "Landroidx/lifecycle/ViewModel;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "appExecutors", "Lcom/thecoffeehouse/guestapp/AppExecutors;", "getAppExecutors", "()Lcom/thecoffeehouse/guestapp/AppExecutors;", "appExecutors$delegate", "Lkotlin/properties/ReadOnlyProperty;", "application", "Lcom/thecoffeehouse/guestapp/TCHApplication;", "getApplication", "()Lcom/thecoffeehouse/guestapp/TCHApplication;", "application$delegate", "mSavedStateHandle", "getMSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "mViewModelTag", "", "getMViewModelTag", "()Ljava/lang/String;", "onCleared", "", "saveState", ExifInterface.GPS_DIRECTION_TRUE, "data", "(Ljava/lang/Object;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: BaseViewModel.kt */
public abstract class BaseViewModel extends ViewModel {
    static final /* synthetic */ KProperty[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseViewModel.class, "appExecutors", "getAppExecutors()Lcom/thecoffeehouse/guestapp/AppExecutors;", 0)), Reflection.property1(new PropertyReference1Impl(BaseViewModel.class, "application", "getApplication()Lcom/thecoffeehouse/guestapp/TCHApplication;", 0))};
    private final ReadOnlyProperty appExecutors$delegate = new BaseViewModel$$special$$inlined$inject$1(DiKt.DI_SCOPE_GLOBAL);
    private final ReadOnlyProperty application$delegate = new BaseViewModel$$special$$inlined$inject$2(DiKt.DI_SCOPE_GLOBAL);
    private final SavedStateHandle mSavedStateHandle;
    private final String mViewModelTag;

    /* access modifiers changed from: protected */
    public final AppExecutors getAppExecutors() {
        return (AppExecutors) this.appExecutors$delegate.getValue(this, $$delegatedProperties[0]);
    }

    /* access modifiers changed from: protected */
    public final TCHApplication getApplication() {
        return (TCHApplication) this.application$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public BaseViewModel(SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "this::class.java.simpleName");
        this.mViewModelTag = simpleName;
        this.mSavedStateHandle = savedStateHandle;
    }

    /* access modifiers changed from: protected */
    public final String getMViewModelTag() {
        return this.mViewModelTag;
    }

    /* access modifiers changed from: protected */
    public final SavedStateHandle getMSavedStateHandle() {
        return this.mSavedStateHandle;
    }

    /* access modifiers changed from: protected */
    public final <T> void saveState(T t) {
        this.mSavedStateHandle.set(this.mViewModelTag, t);
    }

    /* access modifiers changed from: protected */
    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        GeneralKt.log("clear view model: " + getClass().getSimpleName());
    }
}
