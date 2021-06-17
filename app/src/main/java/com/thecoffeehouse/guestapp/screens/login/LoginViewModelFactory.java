package com.thecoffeehouse.guestapp.screens.login;

import android.os.Bundle;
import androidx.savedstate.SavedStateRegistryOwner;
import com.thecoffeehouse.guestapp.screens.base.BaseViewModelFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\tX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/thecoffeehouse/guestapp/screens/login/LoginViewModelFactory;", "Lcom/thecoffeehouse/guestapp/screens/base/BaseViewModelFactory;", "Lcom/thecoffeehouse/guestapp/screens/login/LoginViewModel;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "defaultArgs", "Landroid/os/Bundle;", "(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V", "viewModelClass", "Ljava/lang/Class;", "getViewModelClass", "()Ljava/lang/Class;", "setViewModelClass", "(Ljava/lang/Class;)V", "app_liveRelease"}, k = 1, mv = {1, 4, 0})
/* compiled from: LoginViewModelFactory.kt */
public final class LoginViewModelFactory extends BaseViewModelFactory<LoginViewModel> {
    private Class<LoginViewModel> viewModelClass;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LoginViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(savedStateRegistryOwner, (i & 2) != 0 ? null : bundle);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LoginViewModelFactory(SavedStateRegistryOwner savedStateRegistryOwner, Bundle bundle) {
        super(savedStateRegistryOwner, bundle);
        Intrinsics.checkNotNullParameter(savedStateRegistryOwner, "owner");
        this.viewModelClass = LoginViewModel.class;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseViewModelFactory
    public Class<LoginViewModel> getViewModelClass() {
        return this.viewModelClass;
    }

    @Override // com.thecoffeehouse.guestapp.screens.base.BaseViewModelFactory
    public void setViewModelClass(Class<LoginViewModel> cls) {
        Intrinsics.checkNotNullParameter(cls, "<set-?>");
        this.viewModelClass = cls;
    }
}
